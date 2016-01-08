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

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;

public class EditorScanner extends RuleBasedScanner {

	public EditorScanner(ColorProvider provider) {
		WordRule wordRule = new WordRule(new IWordDetector() {
			public boolean isWordStart(char c) {
				return Character.isJavaIdentifierStart(c);
			}

			public boolean isWordPart(char c) {
				return Character.isJavaIdentifierPart(c);
			}
		});
		Token keyword = new Token(new TextAttribute(provider.getColor(ColorProvider.KEYWORD), null, SWT.BOLD));
		Token singleLineComment = new Token(new TextAttribute(provider.getColor(ColorProvider.SINGLE_LINE_COMMENT)));
		Token multipleLineComment = new Token(new TextAttribute(provider.getColor(ColorProvider.MULTI_LINE_COMMENT)));
		Token string = new Token(new TextAttribute(provider.getColor(ColorProvider.STRING)));
		Token rule = new Token(new TextAttribute(provider.getColor(ColorProvider.RULE), null, SWT.ITALIC));
		//TODO: match $channel = ...
		for (int n = 0; n < KeyWords.KEYWORDS.length; n++)
			wordRule.addWord(KeyWords.KEYWORDS[n], keyword);

		setRules(new IRule[] { wordRule, 
				new SingleLineRule("//", null, singleLineComment),
				new MultiLineRule("/*", "*/", multipleLineComment),
				new SingleLineRule("\"", "\"", string, '\\'), 
				new SingleLineRule("'", "'", string, '\\'),
				new SingleLineRule("$", "=", string, '\\'),
				new SingleLineRule("rule_", ":", rule, '\\'), 
				new WhitespaceRule(new IWhitespaceDetector() {
					public boolean isWhitespace(char c) {
						return Character.isWhitespace(c);
					}
				}),

		});
	}
}