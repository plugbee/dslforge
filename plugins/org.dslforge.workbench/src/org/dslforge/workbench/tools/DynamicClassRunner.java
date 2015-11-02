/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.workbench.tools;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.swt.widgets.Display;

public class DynamicClassRunner {

	private static final Class<?>[] parameters = new Class[] { URL.class };
	
	private final String classpath;
	
	public DynamicClassRunner(String classpath) {
		this.classpath = classpath;
	}

	private ClassLoader getClassLoader(File file) {
		try {
			ClassLoader parent = Thread.currentThread().getContextClassLoader();
			@SuppressWarnings("deprecation")
			URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{ file.getParentFile().toURL()}, parent);
			Thread.currentThread().setContextClassLoader(urlClassLoader);			
			//add external libraries to classpath
			//addExternalJars();
			ClassLoader newClassLoader = Thread.currentThread().getContextClassLoader();
			return newClassLoader;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	protected void addExternalJars() {
		String[] split = classpath.split(";");
		for (String fileName : split) {
			System.out.println("[DSLFORGE] adding jar file: " + fileName);
			try {
				addFile(new File(fileName));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected void addFile(String s) throws IOException {
		File f = new File(s);
		addFile(f);
	}

	@SuppressWarnings("deprecation")
	protected void addFile(File f) throws IOException {
		addURL(f.toURL());	
	}
	
	protected void addURL(URL u) throws IOException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		Class<?> sysclass = URLClassLoader.class;
		try {
			Method method = sysclass.getDeclaredMethod("addURL", parameters);
			method.setAccessible(true);
			method.invoke(classLoader, new Object[] { u });
		} catch (Throwable t) {
			t.printStackTrace();
			throw new IOException("Error, could not add URL to system classloader");
		}
	}
	
	public void doRun(final File file, final String method) {
		try {
			//filename: remove the extension
			final String fileName = file.getName().replace(".class", "");
			//class loader
			final ClassLoader classLoader = getClassLoader(file);
			final Display display = Display.getCurrent();
			display.syncExec(new Runnable() {	
				@Override
				public void run() {
					if (method.equals("main")) {
						// MAIN METHOD
						try {
							Class<?> iClass = classLoader.loadClass(fileName);
							Method m = iClass.getMethod(method, String[].class);
							// init params accordingly
							final Class<?> params = null;
							// static method doesn't have an instance
							m.invoke(null, (Object) params);
						} catch (IllegalArgumentException e) {
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (NoSuchMethodException e) {
							e.printStackTrace();
						} catch (SecurityException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							e.printStackTrace();
						}
					} else {
						// RUN METHOD
						try {

							// add stuff here.
							final Object paramsObj[] = new Object[1];
							paramsObj[0] = null;
							
							//instanciate the generated class
							Class<?> iClass = classLoader.loadClass(fileName);
							Object object = iClass.newInstance(); 
							
							//invoke run method
							Class<?> params[]  = new Class<?>[] {};
							Method[] declaredMethods = iClass.getDeclaredMethods();
							for (Method m : declaredMethods) {
								if (m.getName().equals("run")) {
									paramsObj[0] = null;
									m.setAccessible(true);
									m.invoke(object);
									System.out.println("[DSLFORGE] - Generated class run method successfully invoked.");
								}
							}
						} catch (IllegalArgumentException e) {
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (SecurityException e) {
							e.printStackTrace();
						} catch (InstantiationException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							e.printStackTrace();
						}
					}
				}
			});
			// final Runnable runnable = new Runnable() {
			// public void run() {
			// UISession uiSession = RWT.getUISession(display);
			// uiSession.exec(new Runnable() {
			// public void run() {
			// }
			// });
			// }
			// };
			// new Thread(runnable).start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
