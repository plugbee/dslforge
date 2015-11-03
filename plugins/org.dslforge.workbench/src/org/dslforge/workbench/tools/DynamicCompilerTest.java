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
package org.dslforge.workbench.tools;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

public class DynamicCompilerTest {

  public static void main(String[] args) throws Exception {
    // create the source
    File sourceFile   = new File("/temp/Hello.java");
    FileWriter writer = new FileWriter(sourceFile);

    writer.write(
            "public class Hello{ \n" +
            " public void doit() { \n" +
            "   System.out.println(\"Hello world\") ;\n" +
            " }\n" +
            "}"
    );
    writer.close();

    JavaCompiler compiler    = ToolProvider.getSystemJavaCompiler();
    StandardJavaFileManager fileManager =
        compiler.getStandardFileManager(null, null, null);

    fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(new File("/temp")));
    // Compile the file
    compiler.getTask(null,
               fileManager,
               null,
               null,
               null,
               fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile)))
            .call();
    fileManager.close();


    // delete the source file
    // sourceFile.deleteOnExit();

    runIt();
  }

  public static void runIt() {
    try {
      Class<?> params[] = {};
      Object paramsObj[] = {};
      Class<?> thisClass = Class.forName("Hello");
      Object iClass = thisClass.newInstance();
      Method thisMethod = thisClass.getDeclaredMethod("doit", params);
      thisMethod.invoke(iClass, paramsObj);
      }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
