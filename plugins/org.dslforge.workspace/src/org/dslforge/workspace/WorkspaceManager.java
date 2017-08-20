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

import java.io.File;
import java.io.IOException;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.dslforge.workspace.config.IPersistencyService;
import org.dslforge.workspace.internal.AbstractWorkspaceEventWatcher;
import org.dslforge.workspace.internal.DefaultPersistencyService;
import org.dslforge.workspace.internal.WorkspaceActivator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.widgets.Display;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class WorkspaceManager {

	static final Logger logger = Logger.getLogger(WorkspaceManager.class);

	public static WorkspaceManager INSTANCE = new WorkspaceManager();

	private final IPath rootPath = WorkspaceActivator.getDefault().getWorkspace().getWorkspaceRootPath();

	private static WorkspaceEventWatcher directoryWatcher;
	
	private WorkspaceManager() {		  
		directoryWatcher = new WorkspaceEventWatcher(Paths.get(getWorkspaceRoot()));
		try {
			directoryWatcher.start();
		} catch (IOException ex) {
			logger.error(ex.getMessage(), ex);
		}
		IPersistencyService dbservice = DefaultPersistencyService.getInstance();
		if (dbservice.isRunning()) {
			logger.info("Database service notified with root path [" + rootPath + "]");
		}
	}

	public boolean isRunning() {
		return directoryWatcher.isRunning();
	}
	
	public void addWorkspaceListener(IWorkspaceListener listener) {
		directoryWatcher.addListener(listener);
	}

	public void removeWorkspaceListener(IWorkspaceListener listener) {
		directoryWatcher.removeListener(listener);
	}
	
	public String getWorkspaceRootStringPath() {
		return rootPath.toString();
	}

	public IPath getWorkspaceRootPath() {
		return rootPath;
	}

	public File getWorkspaceRootFolder() {
		return rootPath.toFile();
	}

	public File createProject(final String projectName, final String description, final String visibility) {
		IPath workspaceRoot = getWorkspaceRootPath();
		IPath projectPath = workspaceRoot.addTrailingSeparator().append(projectName);
		final File file = projectPath.toFile();
		if (!file.exists()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					try {
						Files.createDirectory(file.toPath());
					} catch (IOException e) {
						logger.error(e,e.getCause());
					}
				}
			});
			String userId = (String) RWT.getUISession().getAttribute("user");
			IPersistencyService dbservice = DefaultPersistencyService.getInstance();
			if (dbservice.isRunning()) {
				dbservice.createProject(projectName, description, projectPath.toString(), userId, visibility);
				logger.info("Project created : " + file.getAbsolutePath());
			}
		}
		return file;
	}

	public File createFolder(final IPath path) {
		final File file = path.addTrailingSeparator().toFile();
		if (!file.exists()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					try {
						Files.createDirectory(file.toPath());
					} catch (IOException e) {
						logger.error(e,e.getCause());
					}
				}
			});
			IPersistencyService dbservice = DefaultPersistencyService.getInstance();
			if (dbservice.isRunning()) {
				dbservice.createFolder(path);
			}
			logger.info("Folder created : " + file.getAbsolutePath());
		}
		return file;
	}

	public File createResource(final IPath path) {
		final File file = path.toFile();
		if (!file.exists()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					try {
						Files.createFile(file.toPath());
					} catch (IOException ex) {
						logger.error(ex.getMessage(), ex);
					}
				}
			});
			IPersistencyService dbservice = DefaultPersistencyService.getInstance();
			if (dbservice.isRunning()) {
				dbservice.createResource(path);
			}
			logger.info("Resource created : " + file.getAbsolutePath());
		}
		return file;
	}

	public boolean isProject(final IPath path) {
		File file = path.toFile();
		String parent = file.getParent();
		return (file.isDirectory() && parent != null
				&& new Path(parent).equals(new Path(getWorkspaceRootStringPath())));
	}

	public boolean deleteProject(final IPath path) {
		if (isProject(path)) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					try {
						delete(path);
					} catch (IOException e) {
						logger.error(e.getMessage(), e);
					} finally {
						IPersistencyService dbservice = DefaultPersistencyService.getInstance();
						if (dbservice.isRunning()) {
							dbservice.deleteProject(path);
						}
						logger.info("Project deleted : " + path);
					}
				}
			});
			return true;
		}
		return false;
	}

	public boolean deleteFolder(final IPath path) {
		final File file = path.toFile();
		if (file.exists() && file.isDirectory()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					try {
						delete(path);
					} catch (IOException e) {
						logger.error(e.getMessage(), e);
					} finally {
						IPersistencyService dbservice = DefaultPersistencyService.getInstance();
						if (dbservice.isRunning()) {
							dbservice.deleteFolder(path);
						}
						logger.info("Folder deleted : " + path);
					}
				}
			});
		}
		return false;
	}

	public boolean deleteResource(final IPath path) {
		final File file = path.toFile();
		if (file.exists()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					file.delete();
				}
			});
			IPersistencyService dbservice = DefaultPersistencyService.getInstance();
			if (dbservice.isRunning()) {
				dbservice.deleteResource(path);
			}
			logger.info("Resource deleted : " + file.getAbsolutePath());
			return true;
		}
		return false;
	}

	private void delete(final IPath path) throws IOException {
		final File file = path.toFile();
		if (file.isDirectory()) {
			if (file.list().length == 0) {
				file.delete();
				logger.info("Directory deleted : " + file.getAbsolutePath());
			} else {
				// remove all content
				File files[] = file.listFiles();
				for (File temp : files) {
					if (temp.isDirectory()) {
						deleteFolder(new Path(temp.getAbsolutePath()));
					} else {
						deleteResource(new Path(temp.getAbsolutePath()));
					}
				}
				// delete the folder itself
				if (file.list().length == 0) 
					delete(path);
			}
		} else {
			file.delete();
			logger.info("File deleted : " + file.getAbsolutePath());
		}
	}

	public List<String> getAllProjectNames() {
		IPersistencyService dbservice = DefaultPersistencyService.getInstance();
		if (dbservice.isRunning()) {
			return dbservice.getAllProjectNames();
		}
		return Collections.emptyList();
	}
	
	public String getWorkspaceRoot() {
		return rootPath.toString();
	}
	
	public static class WorkspaceEventWatcher extends AbstractWorkspaceEventWatcher {

	    private volatile FutureTask<Integer> watchTask;
	    private volatile WatchService watchService;   
	    private volatile BiMap<WatchKey, java.nio.file.Path> keys;
	    
	    private volatile boolean keepWatching = true;
	    private final java.nio.file.Path startPath;
	    
	    public WorkspaceEventWatcher(java.nio.file.Path rootPath) {
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
			                		final WatchEvent<java.nio.file.Path> ev = (WatchEvent<java.nio.file.Path>) event;
			                		java.nio.file.Path path = ev.context();
			                		java.nio.file.Path parent = keys.get(watchKey);
			                		java.nio.file.Path resolved = parent.resolve(path);
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
			                    	logger.warn("Watch key no longer valid: " + keys.get(watchKey).toString());
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
					Set<Entry<java.nio.file.Path, WatchKey>> entrySet = keys.inverse().entrySet();
					for (Entry<java.nio.file.Path, WatchKey> entry: entrySet)
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
	    	directoryWatcher.stop();
	        keepWatching = false;
	        watchTask = null;
	    }

	    private void startWatching(FutureTask<Integer> watchTask) {
	        new Thread(watchTask).start();
	    }
	    
	    private void registerDirectory(java.nio.file.Path path) throws IOException {
	        WatchServiceRegisteringVisitor visitor = new WatchServiceRegisteringVisitor();
	        try {
	        	WatchKey key = path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY); 	
		        if (!keys.containsKey(key)) {
					logger.debug("Registering watch service for " + path.toString());
					keys.put(key, path);
					Files.walkFileTree(path, visitor);
		        }
			} catch(Exception ex) {
				ex.printStackTrace();
			}
	    }
	    
		private class WatchServiceRegisteringVisitor extends SimpleFileVisitor<java.nio.file.Path> {
			@Override
			public FileVisitResult preVisitDirectory(java.nio.file.Path dir, BasicFileAttributes attrs) throws IOException {
				if (keys.containsKey(dir))
					return FileVisitResult.CONTINUE;
				if (dir.getFileName().toString().equals(IWorkspaceConstants.METADATA_FOLDER))
					return FileVisitResult.SKIP_SUBTREE;
				registerDirectory(dir);
				return FileVisitResult.CONTINUE;
			}
		}
	    

	    private WatchService initWatchService() throws IOException {
	        if (watchService == null) {
	            watchService = FileSystems.getDefault().newWatchService();
	            keys = HashBiMap.create();
	        }
	        return watchService;
	    }
	}

}