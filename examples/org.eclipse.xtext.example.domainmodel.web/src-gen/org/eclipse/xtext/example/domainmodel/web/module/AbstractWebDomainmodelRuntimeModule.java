/**
 * @Generated
 */
package org.eclipse.xtext.example.domainmodel.web.module;

import org.dslforge.xtext.common.shared.SharedModule;
import com.google.inject.Binder;
import org.eclipse.xtext.example.domainmodel.web.contentassist.DomainmodelProposalProvider;
import org.eclipse.xtext.example.domainmodel.web.contentassist.antlr.DomainmodelParser;
import org.eclipse.xtext.example.domainmodel.web.contentassist.antlr.internal.InternalDomainmodelLexer;
import org.dslforge.styledtext.jface.IContentAssistProcessor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.LexerUIBindings;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;

public abstract class AbstractWebDomainmodelRuntimeModule extends SharedModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentAssistParser.class).to(DomainmodelParser.class);
		binder.bind(InternalDomainmodelLexer.class).toProvider(org.eclipse.xtext.parser.antlr.LexerProvider.create(InternalDomainmodelLexer.class));
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(com.google.inject.name.Names.named(LexerUIBindings.CONTENT_ASSIST)).to(InternalDomainmodelLexer.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider.class).to(DomainmodelProposalProvider.class);
		binder.bind(IContentAssistProcessor.class).to(XtextContentAssistProcessor.class);
		binder.bind(ContentAssistContext.Factory.class).to(org.eclipse.xtext.ui.editor.contentassist.ParserBasedContentAssistContextFactory.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.class).to(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.IgnoreCase.class);
	}
}
