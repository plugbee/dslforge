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
package org.dslforge.xtext.generator.web.antlr

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenGrammarTester implements IWebProjectGenerator{
	
	val relativePath = "/parser/"
	var String projectName
	var String grammarShortName
	var String basePath
	var Grammar grammar
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath + grammarShortName + "ParserTester.html", "src-js", toHTML())
	}
	
	def toHTML()'''
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>DomainModel Parser Tester</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js" type="text/javascript"></script>
    <script src="antlr3-all.js" type="text/javascript"></script>
    <script src="Internal«grammarShortName»Lexer.js" type="text/javascript"></script>
    <script src="Internal«grammarShortName»Parser.js" type="text/javascript"></script>
    <script src="DomainModelParserWrapper.js" type="text/javascript"></script>
    <script src="prettyprint.js" type="text/javascript"></script>
    <script type="text/javascript">

        org.antlr.runtime.BaseRecognizer.prototype.emitErrorMessage = function (msg) {
            console.log(msg);
            alert("error: "+msg);
            var positions = msg.match(/\d+/g);
            alert("line: "+ positions[0]);
            alert("position in line: " + positions[1]);
        };

        function convertToObject(node, parser) {
        	alert("converting " + node)
            var current =
            {
                text: node.getToken().getText(),
                type: node.getToken().getType(),
                typeName: parser.getTokenNames()[node.getToken().getType()],
                children: new Array()
            };

            //Add children
            if (node.getChildCount() > 0) {
                var children = node.getChildren();
                for (i in children) {
                    current.children.push(convertToObject(children[i], parser));
                }
            }
           // alert("current: " + current);
            return current;
        }

        $(document).ready(function () {
            $("#btnRun").click(function () {
                var input = $("#domainModelInput").val();
                alert("input : " + input);
                cstream = new org.antlr.runtime.ANTLRStringStream(input);
                lexer = new InternalDomainModelLexer(cstream);
                tstream = new org.antlr.runtime.CommonTokenStream(lexer);
                parser = new InternalDomainModelParser(tstream);
                var foo = parser.domainModel();
            });
        });
    </script>
    <script type="text/javascript">

        var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-17377827-4']);
        _gaq.push(['_trackPageview']);

        (function () {
            var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
        })();

    </script>
</head>
<body>
    <h1>
        DomainModel Parser Tester
    </h1>
    <input type="text" value="" id="domainModelInput" />
    <input type="button" value="RUN" id="btnRun" /><br />
    <br />
    <div>
    </div>
</body>
</html>
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}