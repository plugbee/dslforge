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
package org.dslforge.xtext.common;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;


public class DefaultTextEditor extends BasicXtextEditor {

	@Override
	protected void setInput() {
		String content = "";
		String fileName = uri.toFileString();		
		try {
			InputStream inputStream = new FileInputStream(fileName);
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = null;
			StringBuilder stringBuilder = new StringBuilder();
			String ls = System.getProperty("line.separator");
			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
			}
			inputStream.close();
			reader.close();
			content = stringBuilder.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setCommand("load");
		setText(content);
	}
	
	@Override
	protected void addListeners() {
		//addVerificationKeyListener();
	}
}
