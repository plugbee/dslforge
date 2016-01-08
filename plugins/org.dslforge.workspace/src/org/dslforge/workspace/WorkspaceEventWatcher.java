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
package org.dslforge.workspace;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class WorkspaceEventWatcher extends AbstractWorkspaceEventWatcher {
	
    private FutureTask<Integer> watchTask;
    
    private WatchService watchService;
    
    private volatile boolean keepWatching = true;
    
    private Path startPath;
	
    private class WatchServiceRegisteringVisitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            dir.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
            return FileVisitResult.CONTINUE;
        }
    }
    
    public WorkspaceEventWatcher(Path startPath) {
        this.startPath = startPath;
    }
    
	@Override
    public void start() throws IOException {
        initWatchService();
        registerDirectories();
        createWatchTask();
        startWatching();
    }

    @Override
    public boolean isRunning() {
        return watchTask != null && !watchTask.isDone();
    }

    @Override
    public void stop() {
        keepWatching = false;
    }

    public void logEvent(WatchEvent<?> event) {
		WatchEvent.Kind<?> kind = event.kind();				
		@SuppressWarnings("unchecked")
		final WatchEvent<Path> ev = (WatchEvent<Path>) event;
		Path fileName = ev.context();				
	}

	private void createWatchTask() {
        watchTask = new FutureTask<Integer>(new Callable<Integer>() {
            private int totalEventCount;

            @Override
            public Integer call() throws Exception {
                while (keepWatching) {
                    WatchKey watchKey = watchService.poll(10, TimeUnit.SECONDS);
                    if (watchKey != null) {
                        List<WatchEvent<?>> events = watchKey.pollEvents();
                        for (WatchEvent<?> event : events) {
                        	totalEventCount++;
                            //logEvent(event);
                            notifyListeners(event);
                        }
                        watchKey.reset();
                    }
                }
                return totalEventCount;
            }
        });
    }

    private void startWatching() {
        new Thread(watchTask).start();
    }

    private void registerDirectories() throws IOException {
        Files.walkFileTree(startPath, new WatchServiceRegisteringVisitor());
    }

    private WatchService initWatchService() throws IOException {
        if (watchService == null) {
            watchService = FileSystems.getDefault().newWatchService();
        }
        return watchService;
    }
}