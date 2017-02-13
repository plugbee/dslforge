/**
 * @Generated
 */
package org.xtext.example.mydsl.web.module;

import org.dslforge.xtext.common.shared.SharedModule;
import com.google.inject.Binder;
import org.xtext.example.mydsl.web.contentassist.MyDslProposalProvider;
import org.xtext.example.mydsl.web.contentassist.antlr.MyDslParser;
import org.xtext.example.mydsl.web.contentassist.antlr.internal.InternalMyDslLexer;
import org.dslforge.styledtext.jface.IContentAssistProcessor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.LexerUIBindings;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;

public abstract class AbstractWebMyDslRuntimeModule extends SharedModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentAssistParser.class).to(MyDslParser.class);
		binder.bind(InternalMyDslLexer.class).toProvider(org.eclipse.xtext.parser.antlr.LexerProvider.create(InternalMyDslLexer.class));
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(com.google.inject.name.Names.named(LexerUIBindings.CONTENT_ASSIST)).to(InternalMyDslLexer.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider.class).to(MyDslProposalProvider.class);
		binder.bind(IContentAssistProcessor.class).to(XtextContentAssistProcessor.class);
		binder.bind(ContentAssistContext.Factory.class).to(org.eclipse.xtext.ui.editor.contentassist.ParserBasedContentAssistContextFactory.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.class).to(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.IgnoreCase.class);
	}
}
