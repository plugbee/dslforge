package org.dslforge.xtext.generator.web.contentassist;

import java.nio.charset.Charset;
import java.util.List;

import org.dslforge.xtext.generator.util.GeneratorUtil;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.Generator;
import org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment;

import com.google.common.collect.ImmutableList;

public class XtextAntlrWebGeneratorFragment extends XtextAntlrUiGeneratorFragment {

	private boolean partialParsing = false;
	
	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		super.generate(grammar, ctx);
		String srcUiGenPath = "../org.eclipse.xtext.example.fowlerdsl.web/src-gen";
		
		final String encoding = getEncoding(ctx, Generator.SRC_GEN_IDE);
		
		
		//String outputDirectory = outputConfiguration.getOutputDirectory();
		String basePath = GeneratorUtil.getBasePath(grammar);
		String relativePath = "/editor/contentassist";
		String grammarShortName = GeneratorUtil.getGrammarShortName(grammar);
		String workingDirectory = srcUiGenPath + "/" + basePath + relativePath;
		String absoluteGrammarFileName = workingDirectory + "/" + "Internal" + grammarShortName + ".g";
		//String absoluteGrammarFileName = srcUiGenPath + "/" + getGrammarFileName(grammar, getNaming()).replace('.', '/') + ".g";
		addAntlrParam("-fo");
		addAntlrParam(absoluteGrammarFileName.substring(0, absoluteGrammarFileName.lastIndexOf('/')));
		getAntlrTool().runWithEncodingAndParams(absoluteGrammarFileName, encoding, getAntlrParams());
		Charset charset = Charset.forName(getEncoding(ctx, Generator.SRC_GEN_IDE));
		simplifyUnorderedGroupPredicatesIfRequired(grammar, absoluteGrammarFileName, charset);
		splitParserAndLexerIfEnabled(absoluteGrammarFileName, charset);
		suppressWarnings(absoluteGrammarFileName, charset);
		removeBacktrackingGuardsIfEnabled(absoluteGrammarFileName, charset);
		normalizeLineDelimiters(absoluteGrammarFileName, charset);
		normalizeTokens(absoluteGrammarFileName, charset);
	}
	
	@Override
	protected List<Object> getParameters(Grammar grammar) {
		return ImmutableList.of(getOptions(), partialParsing, getNaming().hasIde());
	}
}
