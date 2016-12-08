/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.workspace.internal;

import java.io.IOException;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.dslforge.workspace.IWorkspaceConstants;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class WorkspaceEventWatcher extends AbstractWorkspaceEventWatcher {
	
	static final Logger logger = Logger.getLogger(WorkspaceEventWatcher.class);
	
    private static FutureTask<Integer> watchTask;
    private static WatchService watchService;   
    private final Path startPath;
    private static boolean keepWatching = true;
    private static BiMap<WatchKey, Path> keys;
	
    public WorkspaceEventWatcher(Path rootPath) {
        startPath = rootPath;
    }
    
	@Override
    public void start() throws IOException {
        initWatchService();
        registerDirectory(startPath);
        
        watchTask = new FutureTask<Integer>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                while (keepWatching) {
                	try {
	                    WatchKey watchKey = watchService.poll(10, TimeUnit.SECONDS);
	                    if(watchKey != null && keys.containsKey(watchKey)) {
		                    List<WatchEvent<?>> events = watchKey.pollEvents();
		                    for (WatchEvent<?> event : events) {
		                		WatchEvent.Kind<?> kind = event.kind();
		                        if (kind == StandardWatchEventKinds.OVERFLOW)
		                            continue;
		                		@SuppressWarnings("unchecked")
		                		final WatchEvent<Path> ev = (WatchEvent<Path>) event;
		                		Path path = ev.context();
		                		Path parent = keys.get(watchKey);
		                		Path resolved = parent.resolve(path);
		                		if(!resolved.toFile().exists()) {
		                			if (kind.equals(StandardWatchEventKinds.ENTRY_DELETE)) {
		                				if(keys.containsValue(resolved)) {
		                					keys.inverse().remove(resolved);
		                				}
		                			}
		                		}
		                        boolean directory = Files.isDirectory(resolved, LinkOption.NOFOLLOW_LINKS);
		                        if (directory) {
		                    		if (kind.equals(StandardWatchEventKinds.ENTRY_CREATE))
		                    			registerDirectory(resolved);
		                        }
		                        notifyListeners(event);
		                    }
		                    if (!watchKey.reset()) {
		                    	logger.info("Watch key no longer valid: " + keys.get(watchKey).toString());
		                    }
	                    }
                	} catch (ClosedWatchServiceException ex) {
                		 logger.warn("The watch service has been closed, or it is closed while waiting for the next key");
                	} catch(InterruptedException ex) {
                		logger.warn("The watch service has been interrupted");
                	}
                }	
                return 1;
            }

			@SuppressWarnings("unused")
			private void dump() {
				Set<Entry<Path, WatchKey>> entrySet = keys.inverse().entrySet();
				for (Entry<Path, WatchKey> entry: entrySet)
					logger.info("Workspace still watching: " + entry.getKey());
			}
        });
        startWatching(watchTask);
    }

    @Override
    public boolean isRunning() {
        return watchTask != null && !watchTask.isDone();
    }

    @Override
    public void stop() {
    	keys.clear();
        keepWatching = false;
        watchTask = null;
    }

    private static void startWatching(FutureTask<Integer> watchTask) {
        new Thread(watchTask).start();
    }
    
    private static void registerDirectory(Path path) throws IOException {
        WatchServiceRegisteringVisitor visitor = new WatchServiceRegisteringVisitor();
        try {
        	WatchKey key = path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY); 	
	        if (!keys.containsKey(key)) {
				logger.info("Registering file path " + path.toString());
				keys.put(key, path);
				Files.walkFileTree(path, visitor);
	        }
		} catch(Exception ex) {
			ex.printStackTrace();
		}
    }
    
	private static class WatchServiceRegisteringVisitor extends SimpleFileVisitor<Path> {
		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
			if (keys.containsKey(dir))
				return FileVisitResult.CONTINUE;
			if (dir.getFileName().toString().equals(IWorkspaceConstants.METADATA_FOLDER))
				return FileVisitResult.SKIP_SUBTREE;
			registerDirectory(dir);
			return FileVisitResult.CONTINUE;
		}
	}
    

    private static WatchService initWatchService() throws IOException {
        if (watchService == null) {
            watchService = FileSystems.getDefault().newWatchService();
            keys = HashBiMap.create();
        }
        return watchService;
    }
}