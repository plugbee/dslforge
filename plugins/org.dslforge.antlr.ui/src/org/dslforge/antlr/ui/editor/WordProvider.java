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
package org.dslforge.antlr.ui.editor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class WordProvider {
 
    public List< String > suggest(String word) {
        ArrayList< String >wordBuffer = new ArrayList< String >();
        for(String s:KeyWords.KEYWORDS)
            if(s.startsWith(word))
                wordBuffer.add(s);
        Collections.sort(wordBuffer);
        return wordBuffer;
    }
}