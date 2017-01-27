/**
 * @Generated
 */
package org.eclipse.sphinx.examples.xtext.hummingbird.web.module;

import org.dslforge.xtext.common.shared.SharedModule;
import com.google.inject.Binder;
import org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.HummingbirdProposalProvider;
import org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.HummingbirdParser;
import org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.internal.InternalHummingbirdLexer;
import org.dslforge.styledtext.jface.IContentAssistProcessor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.LexerUIBindings;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;

public abstract class AbstractWebHummingbirdRuntimeModule extends SharedModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentAssistParser.class).to(HummingbirdParser.class);
		binder.bind(InternalHummingbirdLexer.class).toProvider(org.eclipse.xtext.parser.antlr.LexerProvider.create(InternalHummingbirdLexer.class));
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(com.google.inject.name.Names.named(LexerUIBindings.CONTENT_ASSIST)).to(InternalHummingbirdLexer.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider.class).to(HummingbirdProposalProvider.class);
		binder.bind(IContentAssistProcessor.class).to(XtextContentAssistProcessor.class);
		binder.bind(ContentAssistContext.Factory.class).to(org.eclipse.xtext.ui.editor.contentassist.ParserBasedContentAssistContextFactory.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.class).to(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.IgnoreCase.class);
	}
}
