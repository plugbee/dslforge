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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorProvider {
	
    public static final RGB MULTI_LINE_COMMENT= new RGB(128, 0, 0);
    public static final RGB SINGLE_LINE_COMMENT= new RGB(65, 128, 95);
    public static final RGB KEYWORD= new RGB(128, 0, 85);
    public static final RGB TYPE= new RGB(0, 0, 128);
    public static final RGB STRING= new RGB(0, 0, 255);
    public static final RGB DEFAULT= new RGB(0, 0, 0);
	public static final RGB RULE = new RGB(50, 50, 150);	
	
    protected Map<RGB, Color> fColorTable= new HashMap<RGB, Color>(10);

    public void dispose() {
        Iterator<Color> it= fColorTable.values().iterator();
        while (it.hasNext())
            ((Color) it.next()).dispose();
    }

    public Color getColor(RGB rgb) {
        Color color= (Color) fColorTable.get(rgb);
        if (color == null) {
            color= new Color(Display.getCurrent(), rgb);
            fColorTable.put(rgb, color);
        }
        return color;
    }
}