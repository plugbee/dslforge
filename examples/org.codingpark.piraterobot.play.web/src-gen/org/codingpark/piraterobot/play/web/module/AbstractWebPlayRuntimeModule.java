/**
 * @Generated
 */
package org.codingpark.piraterobot.play.web.module;

import org.dslforge.xtext.common.shared.SharedModule;
import com.google.inject.Binder;
import org.codingpark.piraterobot.play.web.contentassist.PlayProposalProvider;
import org.codingpark.piraterobot.play.web.contentassist.antlr.PlayParser;
import org.codingpark.piraterobot.play.web.contentassist.antlr.internal.InternalPlayLexer;
import org.dslforge.styledtext.jface.IContentAssistProcessor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.LexerUIBindings;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;

public abstract class AbstractWebPlayRuntimeModule extends SharedModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentAssistParser.class).to(PlayParser.class);
		binder.bind(InternalPlayLexer.class).toProvider(org.eclipse.xtext.parser.antlr.LexerProvider.create(InternalPlayLexer.class));
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(com.google.inject.name.Names.named(LexerUIBindings.CONTENT_ASSIST)).to(InternalPlayLexer.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider.class).to(PlayProposalProvider.class);
		binder.bind(IContentAssistProcessor.class).to(XtextContentAssistProcessor.class);
		binder.bind(ContentAssistContext.Factory.class).to(org.eclipse.xtext.ui.editor.contentassist.ParserBasedContentAssistContextFactory.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.class).to(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.IgnoreCase.class);
	}
}
