/*Hacked by DSL Forge*/
grammar InternalHummingbird;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.sphinx.examples.xtext.services.HummingbirdGrammarAccess;

}

@parser::members {
 
 	private HummingbirdGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(HummingbirdGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleEntryPoint
entryRuleEntryPoint 
:
{ before(grammarAccess.getEntryPointRule()); }
	 ruleEntryPoint
{ after(grammarAccess.getEntryPointRule()); } 
	 EOF 
;

// Rule EntryPoint
ruleEntryPoint
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntryPointAccess().getAlternatives()); }
(rule__EntryPoint__Alternatives)
{ after(grammarAccess.getEntryPointAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleApplication
entryRuleApplication 
:
{ before(grammarAccess.getApplicationRule()); }
	 ruleApplication
{ after(grammarAccess.getApplicationRule()); } 
	 EOF 
;

// Rule Application
ruleApplication
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getApplicationAccess().getGroup()); }
(rule__Application__Group__0)
{ after(grammarAccess.getApplicationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComponent
entryRuleComponent 
:
{ before(grammarAccess.getComponentRule()); }
	 ruleComponent
{ after(grammarAccess.getComponentRule()); } 
	 EOF 
;

// Rule Component
ruleComponent
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getComponentAccess().getGroup()); }
(rule__Component__Group__0)
{ after(grammarAccess.getComponentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConnection
entryRuleConnection 
:
{ before(grammarAccess.getConnectionRule()); }
	 ruleConnection
{ after(grammarAccess.getConnectionRule()); } 
	 EOF 
;

// Rule Connection
ruleConnection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConnectionAccess().getGroup()); }
(rule__Connection__Group__0)
{ after(grammarAccess.getConnectionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameterValue
entryRuleParameterValue 
:
{ before(grammarAccess.getParameterValueRule()); }
	 ruleParameterValue
{ after(grammarAccess.getParameterValueRule()); } 
	 EOF 
;

// Rule ParameterValue
ruleParameterValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterValueAccess().getGroup()); }
(rule__ParameterValue__Group__0)
{ after(grammarAccess.getParameterValueAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePlatform
entryRulePlatform 
:
{ before(grammarAccess.getPlatformRule()); }
	 rulePlatform
{ after(grammarAccess.getPlatformRule()); } 
	 EOF 
;

// Rule Platform
rulePlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPlatformAccess().getGroup()); }
(rule__Platform__Group__0)
{ after(grammarAccess.getPlatformAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComponentType
entryRuleComponentType 
:
{ before(grammarAccess.getComponentTypeRule()); }
	 ruleComponentType
{ after(grammarAccess.getComponentTypeRule()); } 
	 EOF 
;

// Rule ComponentType
ruleComponentType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getComponentTypeAccess().getGroup()); }
(rule__ComponentType__Group__0)
{ after(grammarAccess.getComponentTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInterface
entryRuleInterface 
:
{ before(grammarAccess.getInterfaceRule()); }
	 ruleInterface
{ after(grammarAccess.getInterfaceRule()); } 
	 EOF 
;

// Rule Interface
ruleInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInterfaceAccess().getGroup()); }
(rule__Interface__Group__0)
{ after(grammarAccess.getInterfaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePort
entryRulePort 
:
{ before(grammarAccess.getPortRule()); }
	 rulePort
{ after(grammarAccess.getPortRule()); } 
	 EOF 
;

// Rule Port
rulePort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPortAccess().getGroup()); }
(rule__Port__Group__0)
{ after(grammarAccess.getPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameter
entryRuleParameter 
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterAccess().getGroup()); }
(rule__Parameter__Group__0)
{ after(grammarAccess.getParameterAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInteger
entryRuleInteger 
:
{ before(grammarAccess.getIntegerRule()); }
	 ruleInteger
{ after(grammarAccess.getIntegerRule()); } 
	 EOF 
;

// Rule Integer
ruleInteger
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIntegerAccess().getGroup()); }
(rule__Integer__Group__0)
{ after(grammarAccess.getIntegerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}







// Entry rule entryRuleDescription
entryRuleDescription 
:
{ before(grammarAccess.getDescriptionRule()); }
	 ruleDescription
{ after(grammarAccess.getDescriptionRule()); } 
	 EOF 
;

// Rule Description
ruleDescription
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
(rule__Description__DescriptionAssignment)
{ after(grammarAccess.getDescriptionAccess().getDescriptionAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__EntryPoint__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntryPointAccess().getApplicationParserRuleCall_0()); }
	ruleApplication
{ after(grammarAccess.getEntryPointAccess().getApplicationParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEntryPointAccess().getPlatformParserRuleCall_1()); }
	rulePlatform
{ after(grammarAccess.getEntryPointAccess().getPlatformParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}





rule__Application__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__0__Impl
	rule__Application__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); }

	'Application' 

{ after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__1__Impl
	rule__Application__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getNameAssignment_1()); }
(rule__Application__NameAssignment_1)
{ after(grammarAccess.getApplicationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__2__Impl
	rule__Application__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__3__Impl
	rule__Application__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getGroup_3()); }
(rule__Application__Group_3__0)?
{ after(grammarAccess.getApplicationAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__4__Impl
	rule__Application__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getComponentsKeyword_4()); }

	'components' 

{ after(grammarAccess.getApplicationAccess().getComponentsKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__5__Impl
	rule__Application__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__6__Impl
	rule__Application__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getComponentsAssignment_6()); }
(rule__Application__ComponentsAssignment_6)
{ after(grammarAccess.getApplicationAccess().getComponentsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__7__Impl
	rule__Application__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getGroup_7()); }
(rule__Application__Group_7__0)*
{ after(grammarAccess.getApplicationAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__8__Impl
	rule__Application__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__Application__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group_3__0__Impl
	rule__Application__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getDescriptionKeyword_3_0()); }

	'description' 

{ after(grammarAccess.getApplicationAccess().getDescriptionKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getDescriptionAssignment_3_1()); }
(rule__Application__DescriptionAssignment_3_1)
{ after(grammarAccess.getApplicationAccess().getDescriptionAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Application__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group_7__0__Impl
	rule__Application__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getCommaKeyword_7_0()); }

	',' 

{ after(grammarAccess.getApplicationAccess().getCommaKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getComponentsAssignment_7_1()); }
(rule__Application__ComponentsAssignment_7_1)
{ after(grammarAccess.getApplicationAccess().getComponentsAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Component__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__0__Impl
	rule__Component__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getComponentAction_0()); }
(

)
{ after(grammarAccess.getComponentAccess().getComponentAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__1__Impl
	rule__Component__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getComponentKeyword_1()); }

	'Component' 

{ after(grammarAccess.getComponentAccess().getComponentKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__2__Impl
	rule__Component__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getNameAssignment_2()); }
(rule__Component__NameAssignment_2)
{ after(grammarAccess.getComponentAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__3__Impl
	rule__Component__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__4__Impl
	rule__Component__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getGroup_4()); }
(rule__Component__Group_4__0)?
{ after(grammarAccess.getComponentAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__5__Impl
	rule__Component__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getGroup_5()); }
(rule__Component__Group_5__0)?
{ after(grammarAccess.getComponentAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__6__Impl
	rule__Component__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getGroup_6()); }
(rule__Component__Group_6__0)?
{ after(grammarAccess.getComponentAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__7__Impl
	rule__Component__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getGroup_7()); }
(rule__Component__Group_7__0)?
{ after(grammarAccess.getComponentAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__8__Impl
	rule__Component__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getGroup_8()); }
(rule__Component__Group_8__0)?
{ after(grammarAccess.getComponentAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__Component__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_4__0__Impl
	rule__Component__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getTypeKeyword_4_0()); }

	'type' 

{ after(grammarAccess.getComponentAccess().getTypeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getTypeAssignment_4_1()); }
(rule__Component__TypeAssignment_4_1)
{ after(grammarAccess.getComponentAccess().getTypeAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Component__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_5__0__Impl
	rule__Component__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getIncomingConnectionsKeyword_5_0()); }

	'incomingConnections' 

{ after(grammarAccess.getComponentAccess().getIncomingConnectionsKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getIncomingConnectionsAssignment_5_1()); }
(rule__Component__IncomingConnectionsAssignment_5_1)
{ after(grammarAccess.getComponentAccess().getIncomingConnectionsAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Component__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_6__0__Impl
	rule__Component__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getDescriptionKeyword_6_0()); }

	'description' 

{ after(grammarAccess.getComponentAccess().getDescriptionKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getDescriptionAssignment_6_1()); }
(rule__Component__DescriptionAssignment_6_1)
{ after(grammarAccess.getComponentAccess().getDescriptionAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Component__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_7__0__Impl
	rule__Component__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getOutgoingConnectionsKeyword_7_0()); }

	'outgoingConnections' 

{ after(grammarAccess.getComponentAccess().getOutgoingConnectionsKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_7__1__Impl
	rule__Component__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_7_1()); }

	'{' 

{ after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_7__2__Impl
	rule__Component__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_2()); }
(rule__Component__OutgoingConnectionsAssignment_7_2)
{ after(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_7__3__Impl
	rule__Component__Group_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getGroup_7_3()); }
(rule__Component__Group_7_3__0)*
{ after(grammarAccess.getComponentAccess().getGroup_7_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_7__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7_4()); }

	'}' 

{ after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Component__Group_7_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_7_3__0__Impl
	rule__Component__Group_7_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_7_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getCommaKeyword_7_3_0()); }

	',' 

{ after(grammarAccess.getComponentAccess().getCommaKeyword_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_7_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_7_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_7_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_3_1()); }
(rule__Component__OutgoingConnectionsAssignment_7_3_1)
{ after(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Component__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_8__0__Impl
	rule__Component__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getParameterValuesKeyword_8_0()); }

	'parameterValues' 

{ after(grammarAccess.getComponentAccess().getParameterValuesKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_8__1__Impl
	rule__Component__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8_1()); }

	'{' 

{ after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_8__2__Impl
	rule__Component__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_2()); }
(rule__Component__ParameterValuesAssignment_8_2)
{ after(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_8__3__Impl
	rule__Component__Group_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getGroup_8_3()); }
(rule__Component__Group_8_3__0)*
{ after(grammarAccess.getComponentAccess().getGroup_8_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_8__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8_4()); }

	'}' 

{ after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Component__Group_8_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_8_3__0__Impl
	rule__Component__Group_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_8_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getCommaKeyword_8_3_0()); }

	',' 

{ after(grammarAccess.getComponentAccess().getCommaKeyword_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group_8_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group_8_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group_8_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_3_1()); }
(rule__Component__ParameterValuesAssignment_8_3_1)
{ after(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Connection__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__0__Impl
	rule__Connection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); }

	'Connection' 

{ after(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__1__Impl
	rule__Connection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getNameAssignment_1()); }
(rule__Connection__NameAssignment_1)
{ after(grammarAccess.getConnectionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__2__Impl
	rule__Connection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__3__Impl
	rule__Connection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getSourcePortKeyword_3()); }

	'sourcePort' 

{ after(grammarAccess.getConnectionAccess().getSourcePortKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__4__Impl
	rule__Connection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getSourcePortAssignment_4()); }
(rule__Connection__SourcePortAssignment_4)
{ after(grammarAccess.getConnectionAccess().getSourcePortAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__5__Impl
	rule__Connection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getTargetComponentKeyword_5()); }

	'targetComponent' 

{ after(grammarAccess.getConnectionAccess().getTargetComponentKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__6__Impl
	rule__Connection__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getTargetComponentAssignment_6()); }
(rule__Connection__TargetComponentAssignment_6)
{ after(grammarAccess.getConnectionAccess().getTargetComponentAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__7__Impl
	rule__Connection__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getGroup_7()); }
(rule__Connection__Group_7__0)?
{ after(grammarAccess.getConnectionAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Connection__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group_7__0__Impl
	rule__Connection__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getDescriptionKeyword_7_0()); }

	'description' 

{ after(grammarAccess.getConnectionAccess().getDescriptionKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connection__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getDescriptionAssignment_7_1()); }
(rule__Connection__DescriptionAssignment_7_1)
{ after(grammarAccess.getConnectionAccess().getDescriptionAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ParameterValue__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group__0__Impl
	rule__ParameterValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getParameterValueKeyword_0()); }

	'ParameterValue' 

{ after(grammarAccess.getParameterValueAccess().getParameterValueKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterValue__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group__1__Impl
	rule__ParameterValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getNameAssignment_1()); }
(rule__ParameterValue__NameAssignment_1)
{ after(grammarAccess.getParameterValueAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterValue__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group__2__Impl
	rule__ParameterValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getParameterValueAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterValue__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group__3__Impl
	rule__ParameterValue__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getGroup_3()); }
(rule__ParameterValue__Group_3__0)?
{ after(grammarAccess.getParameterValueAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterValue__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group__4__Impl
	rule__ParameterValue__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getTypeKeyword_4()); }

	'type' 

{ after(grammarAccess.getParameterValueAccess().getTypeKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterValue__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group__5__Impl
	rule__ParameterValue__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getTypeAssignment_5()); }
(rule__ParameterValue__TypeAssignment_5)
{ after(grammarAccess.getParameterValueAccess().getTypeAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterValue__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group__6__Impl
	rule__ParameterValue__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getGroup_6()); }
(rule__ParameterValue__Group_6__0)?
{ after(grammarAccess.getParameterValueAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterValue__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getParameterValueAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__ParameterValue__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group_3__0__Impl
	rule__ParameterValue__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getValueKeyword_3_0()); }

	'value' 

{ after(grammarAccess.getParameterValueAccess().getValueKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterValue__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getValueAssignment_3_1()); }
(rule__ParameterValue__ValueAssignment_3_1)
{ after(grammarAccess.getParameterValueAccess().getValueAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ParameterValue__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group_6__0__Impl
	rule__ParameterValue__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getDescriptionKeyword_6_0()); }

	'description' 

{ after(grammarAccess.getParameterValueAccess().getDescriptionKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterValue__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterValue__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getDescriptionAssignment_6_1()); }
(rule__ParameterValue__DescriptionAssignment_6_1)
{ after(grammarAccess.getParameterValueAccess().getDescriptionAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Platform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__0__Impl
	rule__Platform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); }

	'Platform' 

{ after(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__1__Impl
	rule__Platform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getNameAssignment_1()); }
(rule__Platform__NameAssignment_1)
{ after(grammarAccess.getPlatformAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__2__Impl
	rule__Platform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__3__Impl
	rule__Platform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getGroup_3()); }
(rule__Platform__Group_3__0)?
{ after(grammarAccess.getPlatformAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__4__Impl
	rule__Platform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getComponentTypesKeyword_4()); }

	'componentTypes' 

{ after(grammarAccess.getPlatformAccess().getComponentTypesKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__5__Impl
	rule__Platform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__6__Impl
	rule__Platform__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getComponentTypesAssignment_6()); }
(rule__Platform__ComponentTypesAssignment_6)
{ after(grammarAccess.getPlatformAccess().getComponentTypesAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__7__Impl
	rule__Platform__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getGroup_7()); }
(rule__Platform__Group_7__0)*
{ after(grammarAccess.getPlatformAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__8__Impl
	rule__Platform__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__9__Impl
	rule__Platform__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getGroup_9()); }
(rule__Platform__Group_9__0)?
{ after(grammarAccess.getPlatformAccess().getGroup_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_10()); }

	'}' 

{ after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__Platform__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_3__0__Impl
	rule__Platform__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getDescriptionKeyword_3_0()); }

	'description' 

{ after(grammarAccess.getPlatformAccess().getDescriptionKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getDescriptionAssignment_3_1()); }
(rule__Platform__DescriptionAssignment_3_1)
{ after(grammarAccess.getPlatformAccess().getDescriptionAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Platform__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_7__0__Impl
	rule__Platform__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getCommaKeyword_7_0()); }

	',' 

{ after(grammarAccess.getPlatformAccess().getCommaKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getComponentTypesAssignment_7_1()); }
(rule__Platform__ComponentTypesAssignment_7_1)
{ after(grammarAccess.getPlatformAccess().getComponentTypesAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Platform__Group_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_9__0__Impl
	rule__Platform__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getInterfacesKeyword_9_0()); }

	'interfaces' 

{ after(grammarAccess.getPlatformAccess().getInterfacesKeyword_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_9__1__Impl
	rule__Platform__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_9_1()); }

	'{' 

{ after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group_9__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_9__2__Impl
	rule__Platform__Group_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_9__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_2()); }
(rule__Platform__InterfacesAssignment_9_2)
{ after(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group_9__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_9__3__Impl
	rule__Platform__Group_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_9__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getGroup_9_3()); }
(rule__Platform__Group_9_3__0)*
{ after(grammarAccess.getPlatformAccess().getGroup_9_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group_9__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_9__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_9__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_9_4()); }

	'}' 

{ after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_9_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Platform__Group_9_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_9_3__0__Impl
	rule__Platform__Group_9_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_9_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getCommaKeyword_9_3_0()); }

	',' 

{ after(grammarAccess.getPlatformAccess().getCommaKeyword_9_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Platform__Group_9_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Platform__Group_9_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__Group_9_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_3_1()); }
(rule__Platform__InterfacesAssignment_9_3_1)
{ after(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ComponentType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group__0__Impl
	rule__ComponentType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getComponentTypeAction_0()); }
(

)
{ after(grammarAccess.getComponentTypeAccess().getComponentTypeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group__1__Impl
	rule__ComponentType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1()); }

	'ComponentType' 

{ after(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group__2__Impl
	rule__ComponentType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); }
(rule__ComponentType__NameAssignment_2)
{ after(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group__3__Impl
	rule__ComponentType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group__4__Impl
	rule__ComponentType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getGroup_4()); }
(rule__ComponentType__Group_4__0)?
{ after(grammarAccess.getComponentTypeAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group__5__Impl
	rule__ComponentType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getGroup_5()); }
(rule__ComponentType__Group_5__0)?
{ after(grammarAccess.getComponentTypeAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group__6__Impl
	rule__ComponentType__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getGroup_6()); }
(rule__ComponentType__Group_6__0)?
{ after(grammarAccess.getComponentTypeAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group__7__Impl
	rule__ComponentType__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getGroup_7()); }
(rule__ComponentType__Group_7__0)?
{ after(grammarAccess.getComponentTypeAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__ComponentType__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_4__0__Impl
	rule__ComponentType__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesKeyword_4_0()); }

	'providedInterfaces' 

{ after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_4__1__Impl
	rule__ComponentType__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getLeftParenthesisKeyword_4_1()); }

	'(' 

{ after(grammarAccess.getComponentTypeAccess().getLeftParenthesisKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_4__2__Impl
	rule__ComponentType__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_2()); }
(rule__ComponentType__ProvidedInterfacesAssignment_4_2)
{ after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_4__3__Impl
	rule__ComponentType__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getGroup_4_3()); }
(rule__ComponentType__Group_4_3__0)*
{ after(grammarAccess.getComponentTypeAccess().getGroup_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getRightParenthesisKeyword_4_4()); }

	')' 

{ after(grammarAccess.getComponentTypeAccess().getRightParenthesisKeyword_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__ComponentType__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_4_3__0__Impl
	rule__ComponentType__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getCommaKeyword_4_3_0()); }

	',' 

{ after(grammarAccess.getComponentTypeAccess().getCommaKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_3_1()); }
(rule__ComponentType__ProvidedInterfacesAssignment_4_3_1)
{ after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ComponentType__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_5__0__Impl
	rule__ComponentType__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getDescriptionKeyword_5_0()); }

	'description' 

{ after(grammarAccess.getComponentTypeAccess().getDescriptionKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getDescriptionAssignment_5_1()); }
(rule__ComponentType__DescriptionAssignment_5_1)
{ after(grammarAccess.getComponentTypeAccess().getDescriptionAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ComponentType__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_6__0__Impl
	rule__ComponentType__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getPortsKeyword_6_0()); }

	'ports' 

{ after(grammarAccess.getComponentTypeAccess().getPortsKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_6__1__Impl
	rule__ComponentType__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_6_1()); }

	'{' 

{ after(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_6__2__Impl
	rule__ComponentType__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_2()); }
(rule__ComponentType__PortsAssignment_6_2)
{ after(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_6__3__Impl
	rule__ComponentType__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getGroup_6_3()); }
(rule__ComponentType__Group_6_3__0)*
{ after(grammarAccess.getComponentTypeAccess().getGroup_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_6_4()); }

	'}' 

{ after(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__ComponentType__Group_6_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_6_3__0__Impl
	rule__ComponentType__Group_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_6_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getCommaKeyword_6_3_0()); }

	',' 

{ after(grammarAccess.getComponentTypeAccess().getCommaKeyword_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_6_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_6_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_3_1()); }
(rule__ComponentType__PortsAssignment_6_3_1)
{ after(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ComponentType__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_7__0__Impl
	rule__ComponentType__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getParametersKeyword_7_0()); }

	'parameters' 

{ after(grammarAccess.getComponentTypeAccess().getParametersKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_7__1__Impl
	rule__ComponentType__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_7_1()); }

	'{' 

{ after(grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_7__2__Impl
	rule__ComponentType__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_2()); }
(rule__ComponentType__ParametersAssignment_7_2)
{ after(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_7__3__Impl
	rule__ComponentType__Group_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getGroup_7_3()); }
(rule__ComponentType__Group_7_3__0)*
{ after(grammarAccess.getComponentTypeAccess().getGroup_7_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_7__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_7_4()); }

	'}' 

{ after(grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__ComponentType__Group_7_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_7_3__0__Impl
	rule__ComponentType__Group_7_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_7_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getCommaKeyword_7_3_0()); }

	',' 

{ after(grammarAccess.getComponentTypeAccess().getCommaKeyword_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentType__Group_7_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentType__Group_7_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__Group_7_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_3_1()); }
(rule__ComponentType__ParametersAssignment_7_3_1)
{ after(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Interface__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__0__Impl
	rule__Interface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getInterfaceAction_0()); }
(

)
{ after(grammarAccess.getInterfaceAccess().getInterfaceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__1__Impl
	rule__Interface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); }

	'Interface' 

{ after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__2__Impl
	rule__Interface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); }
(rule__Interface__NameAssignment_2)
{ after(grammarAccess.getInterfaceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__3__Impl
	rule__Interface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__4__Impl
	rule__Interface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getGroup_4()); }
(rule__Interface__Group_4__0)?
{ after(grammarAccess.getInterfaceAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__5__Impl
	rule__Interface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getGroup_5()); }
(rule__Interface__Group_5__0)?
{ after(grammarAccess.getInterfaceAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__6__Impl
	rule__Interface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getGroup_6()); }
(rule__Interface__Group_6__0)?
{ after(grammarAccess.getInterfaceAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Interface__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_4__0__Impl
	rule__Interface__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesKeyword_4_0()); }

	'providingComponentTypes' 

{ after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_4__1__Impl
	rule__Interface__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4_1()); }

	'(' 

{ after(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_4__2__Impl
	rule__Interface__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_2()); }
(rule__Interface__ProvidingComponentTypesAssignment_4_2)
{ after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_4__3__Impl
	rule__Interface__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getGroup_4_3()); }
(rule__Interface__Group_4_3__0)*
{ after(grammarAccess.getInterfaceAccess().getGroup_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_4_4()); }

	')' 

{ after(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Interface__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_4_3__0__Impl
	rule__Interface__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0()); }

	',' 

{ after(grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_3_1()); }
(rule__Interface__ProvidingComponentTypesAssignment_4_3_1)
{ after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Interface__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_5__0__Impl
	rule__Interface__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiringPortsKeyword_5_0()); }

	'requiringPorts' 

{ after(grammarAccess.getInterfaceAccess().getRequiringPortsKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_5__1__Impl
	rule__Interface__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_5_1()); }

	'(' 

{ after(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_5__2__Impl
	rule__Interface__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_2()); }
(rule__Interface__RequiringPortsAssignment_5_2)
{ after(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_5__3__Impl
	rule__Interface__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getGroup_5_3()); }
(rule__Interface__Group_5_3__0)*
{ after(grammarAccess.getInterfaceAccess().getGroup_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_5_4()); }

	')' 

{ after(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Interface__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_5_3__0__Impl
	rule__Interface__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getCommaKeyword_5_3_0()); }

	',' 

{ after(grammarAccess.getInterfaceAccess().getCommaKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_3_1()); }
(rule__Interface__RequiringPortsAssignment_5_3_1)
{ after(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Interface__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_6__0__Impl
	rule__Interface__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getDescriptionKeyword_6_0()); }

	'description' 

{ after(grammarAccess.getInterfaceAccess().getDescriptionKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getDescriptionAssignment_6_1()); }
(rule__Interface__DescriptionAssignment_6_1)
{ after(grammarAccess.getInterfaceAccess().getDescriptionAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Port__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__0__Impl
	rule__Port__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getPortKeyword_0()); }

	'Port' 

{ after(grammarAccess.getPortAccess().getPortKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__1__Impl
	rule__Port__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getNameAssignment_1()); }
(rule__Port__NameAssignment_1)
{ after(grammarAccess.getPortAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__2__Impl
	rule__Port__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__3__Impl
	rule__Port__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getMinProviderCountKeyword_3()); }

	'minProviderCount' 

{ after(grammarAccess.getPortAccess().getMinProviderCountKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__4__Impl
	rule__Port__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getMinProviderCountAssignment_4()); }
(rule__Port__MinProviderCountAssignment_4)
{ after(grammarAccess.getPortAccess().getMinProviderCountAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__5__Impl
	rule__Port__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getMaxProviderCountKeyword_5()); }

	'maxProviderCount' 

{ after(grammarAccess.getPortAccess().getMaxProviderCountKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__6__Impl
	rule__Port__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getMaxProviderCountAssignment_6()); }
(rule__Port__MaxProviderCountAssignment_6)
{ after(grammarAccess.getPortAccess().getMaxProviderCountAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__7__Impl
	rule__Port__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getRequiredInterfaceKeyword_7()); }

	'requiredInterface' 

{ after(grammarAccess.getPortAccess().getRequiredInterfaceKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__8__Impl
	rule__Port__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getRequiredInterfaceAssignment_8()); }
(rule__Port__RequiredInterfaceAssignment_8)
{ after(grammarAccess.getPortAccess().getRequiredInterfaceAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__9__Impl
	rule__Port__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getGroup_9()); }
(rule__Port__Group_9__0)?
{ after(grammarAccess.getPortAccess().getGroup_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_10()); }

	'}' 

{ after(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__Port__Group_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group_9__0__Impl
	rule__Port__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getDescriptionKeyword_9_0()); }

	'description' 

{ after(grammarAccess.getPortAccess().getDescriptionKeyword_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getDescriptionAssignment_9_1()); }
(rule__Port__DescriptionAssignment_9_1)
{ after(grammarAccess.getPortAccess().getDescriptionAssignment_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Parameter__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__0__Impl
	rule__Parameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getParameterAction_0()); }
(

)
{ after(grammarAccess.getParameterAccess().getParameterAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__1__Impl
	rule__Parameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getOptionalAssignment_1()); }
(rule__Parameter__OptionalAssignment_1)?
{ after(grammarAccess.getParameterAccess().getOptionalAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__2__Impl
	rule__Parameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getParameterKeyword_2()); }

	'Parameter' 

{ after(grammarAccess.getParameterAccess().getParameterKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__3__Impl
	rule__Parameter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameAssignment_3()); }
(rule__Parameter__NameAssignment_3)
{ after(grammarAccess.getParameterAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__4__Impl
	rule__Parameter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__5__Impl
	rule__Parameter__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getGroup_5()); }
(rule__Parameter__Group_5__0)?
{ after(grammarAccess.getParameterAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__6__Impl
	rule__Parameter__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getGroup_6()); }
(rule__Parameter__Group_6__0)?
{ after(grammarAccess.getParameterAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Parameter__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group_5__0__Impl
	rule__Parameter__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getDataTypeKeyword_5_0()); }

	'dataType' 

{ after(grammarAccess.getParameterAccess().getDataTypeKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getDataTypeAssignment_5_1()); }
(rule__Parameter__DataTypeAssignment_5_1)
{ after(grammarAccess.getParameterAccess().getDataTypeAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Parameter__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group_6__0__Impl
	rule__Parameter__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getDescriptionKeyword_6_0()); }

	'description' 

{ after(grammarAccess.getParameterAccess().getDescriptionKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getDescriptionAssignment_6_1()); }
(rule__Parameter__DescriptionAssignment_6_1)
{ after(grammarAccess.getParameterAccess().getDescriptionAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Integer__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Integer__Group__0__Impl
	rule__Integer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); }
(
	'-' 
)?
{ after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Integer__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Integer__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
{ after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Application__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Application__DescriptionAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getDescriptionDescriptionParserRuleCall_3_1_0()); }
	ruleDescription{ after(grammarAccess.getApplicationAccess().getDescriptionDescriptionParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Application__ComponentsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getComponentsComponentParserRuleCall_6_0()); }
	ruleComponent{ after(grammarAccess.getApplicationAccess().getComponentsComponentParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Application__ComponentsAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getComponentsComponentParserRuleCall_7_1_0()); }
	ruleComponent{ after(grammarAccess.getApplicationAccess().getComponentsComponentParserRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__TypeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_4_1_0()); }
(
{ before(grammarAccess.getComponentAccess().getTypeComponentTypeIDTerminalRuleCall_4_1_0_1()); }
	RULE_ID{ after(grammarAccess.getComponentAccess().getTypeComponentTypeIDTerminalRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__IncomingConnectionsAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getIncomingConnectionsConnectionCrossReference_5_1_0()); }
(
{ before(grammarAccess.getComponentAccess().getIncomingConnectionsConnectionIDTerminalRuleCall_5_1_0_1()); }
	RULE_ID{ after(grammarAccess.getComponentAccess().getIncomingConnectionsConnectionIDTerminalRuleCall_5_1_0_1()); }
)
{ after(grammarAccess.getComponentAccess().getIncomingConnectionsConnectionCrossReference_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__DescriptionAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); }
	ruleDescription{ after(grammarAccess.getComponentAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__OutgoingConnectionsAssignment_7_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getOutgoingConnectionsConnectionParserRuleCall_7_2_0()); }
	ruleConnection{ after(grammarAccess.getComponentAccess().getOutgoingConnectionsConnectionParserRuleCall_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__OutgoingConnectionsAssignment_7_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getOutgoingConnectionsConnectionParserRuleCall_7_3_1_0()); }
	ruleConnection{ after(grammarAccess.getComponentAccess().getOutgoingConnectionsConnectionParserRuleCall_7_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__ParameterValuesAssignment_8_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getParameterValuesParameterValueParserRuleCall_8_2_0()); }
	ruleParameterValue{ after(grammarAccess.getComponentAccess().getParameterValuesParameterValueParserRuleCall_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__ParameterValuesAssignment_8_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getParameterValuesParameterValueParserRuleCall_8_3_1_0()); }
	ruleParameterValue{ after(grammarAccess.getComponentAccess().getParameterValuesParameterValueParserRuleCall_8_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getConnectionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__SourcePortAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getSourcePortPortCrossReference_4_0()); }
(
{ before(grammarAccess.getConnectionAccess().getSourcePortPortIDTerminalRuleCall_4_0_1()); }
	RULE_ID{ after(grammarAccess.getConnectionAccess().getSourcePortPortIDTerminalRuleCall_4_0_1()); }
)
{ after(grammarAccess.getConnectionAccess().getSourcePortPortCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__TargetComponentAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getTargetComponentComponentCrossReference_6_0()); }
(
{ before(grammarAccess.getConnectionAccess().getTargetComponentComponentIDTerminalRuleCall_6_0_1()); }
	RULE_ID{ after(grammarAccess.getConnectionAccess().getTargetComponentComponentIDTerminalRuleCall_6_0_1()); }
)
{ after(grammarAccess.getConnectionAccess().getTargetComponentComponentCrossReference_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__DescriptionAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectionAccess().getDescriptionDescriptionParserRuleCall_7_1_0()); }
	ruleDescription{ after(grammarAccess.getConnectionAccess().getDescriptionDescriptionParserRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getParameterValueAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__ValueAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getValueSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getParameterValueAccess().getValueSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__TypeAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getTypeParameterCrossReference_5_0()); }
(
{ before(grammarAccess.getParameterValueAccess().getTypeParameterIDTerminalRuleCall_5_0_1()); }
	RULE_ID{ after(grammarAccess.getParameterValueAccess().getTypeParameterIDTerminalRuleCall_5_0_1()); }
)
{ after(grammarAccess.getParameterValueAccess().getTypeParameterCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__DescriptionAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); }
	ruleDescription{ after(grammarAccess.getParameterValueAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__DescriptionAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getDescriptionDescriptionParserRuleCall_3_1_0()); }
	ruleDescription{ after(grammarAccess.getPlatformAccess().getDescriptionDescriptionParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__ComponentTypesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getComponentTypesComponentTypeParserRuleCall_6_0()); }
	ruleComponentType{ after(grammarAccess.getPlatformAccess().getComponentTypesComponentTypeParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__ComponentTypesAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getComponentTypesComponentTypeParserRuleCall_7_1_0()); }
	ruleComponentType{ after(grammarAccess.getPlatformAccess().getComponentTypesComponentTypeParserRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__InterfacesAssignment_9_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getInterfacesInterfaceParserRuleCall_9_2_0()); }
	ruleInterface{ after(grammarAccess.getPlatformAccess().getInterfacesInterfaceParserRuleCall_9_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Platform__InterfacesAssignment_9_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPlatformAccess().getInterfacesInterfaceParserRuleCall_9_3_1_0()); }
	ruleInterface{ after(grammarAccess.getPlatformAccess().getInterfacesInterfaceParserRuleCall_9_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__ProvidedInterfacesAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceCrossReference_4_2_0()); }
(
{ before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceIDTerminalRuleCall_4_2_0_1()); }
	RULE_ID{ after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceIDTerminalRuleCall_4_2_0_1()); }
)
{ after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceCrossReference_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__ProvidedInterfacesAssignment_4_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceCrossReference_4_3_1_0()); }
(
{ before(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceIDTerminalRuleCall_4_3_1_0_1()); }
	RULE_ID{ after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceIDTerminalRuleCall_4_3_1_0_1()); }
)
{ after(grammarAccess.getComponentTypeAccess().getProvidedInterfacesInterfaceCrossReference_4_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__DescriptionAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getDescriptionDescriptionParserRuleCall_5_1_0()); }
	ruleDescription{ after(grammarAccess.getComponentTypeAccess().getDescriptionDescriptionParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__PortsAssignment_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getPortsPortParserRuleCall_6_2_0()); }
	rulePort{ after(grammarAccess.getComponentTypeAccess().getPortsPortParserRuleCall_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__PortsAssignment_6_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getPortsPortParserRuleCall_6_3_1_0()); }
	rulePort{ after(grammarAccess.getComponentTypeAccess().getPortsPortParserRuleCall_6_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__ParametersAssignment_7_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getParametersParameterParserRuleCall_7_2_0()); }
	ruleParameter{ after(grammarAccess.getComponentTypeAccess().getParametersParameterParserRuleCall_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentType__ParametersAssignment_7_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentTypeAccess().getParametersParameterParserRuleCall_7_3_1_0()); }
	ruleParameter{ after(grammarAccess.getComponentTypeAccess().getParametersParameterParserRuleCall_7_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__ProvidingComponentTypesAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeCrossReference_4_2_0()); }
(
{ before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeIDTerminalRuleCall_4_2_0_1()); }
	RULE_ID{ after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeIDTerminalRuleCall_4_2_0_1()); }
)
{ after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeCrossReference_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__ProvidingComponentTypesAssignment_4_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeCrossReference_4_3_1_0()); }
(
{ before(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeIDTerminalRuleCall_4_3_1_0_1()); }
	RULE_ID{ after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeIDTerminalRuleCall_4_3_1_0_1()); }
)
{ after(grammarAccess.getInterfaceAccess().getProvidingComponentTypesComponentTypeCrossReference_4_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__RequiringPortsAssignment_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiringPortsPortCrossReference_5_2_0()); }
(
{ before(grammarAccess.getInterfaceAccess().getRequiringPortsPortIDTerminalRuleCall_5_2_0_1()); }
	RULE_ID{ after(grammarAccess.getInterfaceAccess().getRequiringPortsPortIDTerminalRuleCall_5_2_0_1()); }
)
{ after(grammarAccess.getInterfaceAccess().getRequiringPortsPortCrossReference_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__RequiringPortsAssignment_5_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getRequiringPortsPortCrossReference_5_3_1_0()); }
(
{ before(grammarAccess.getInterfaceAccess().getRequiringPortsPortIDTerminalRuleCall_5_3_1_0_1()); }
	RULE_ID{ after(grammarAccess.getInterfaceAccess().getRequiringPortsPortIDTerminalRuleCall_5_3_1_0_1()); }
)
{ after(grammarAccess.getInterfaceAccess().getRequiringPortsPortCrossReference_5_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__DescriptionAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); }
	ruleDescription{ after(grammarAccess.getInterfaceAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__MinProviderCountAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getMinProviderCountIntegerParserRuleCall_4_0()); }
	ruleInteger{ after(grammarAccess.getPortAccess().getMinProviderCountIntegerParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__MaxProviderCountAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getMaxProviderCountIntegerParserRuleCall_6_0()); }
	ruleInteger{ after(grammarAccess.getPortAccess().getMaxProviderCountIntegerParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__RequiredInterfaceAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getRequiredInterfaceInterfaceCrossReference_8_0()); }
(
{ before(grammarAccess.getPortAccess().getRequiredInterfaceInterfaceIDTerminalRuleCall_8_0_1()); }
	RULE_ID{ after(grammarAccess.getPortAccess().getRequiredInterfaceInterfaceIDTerminalRuleCall_8_0_1()); }
)
{ after(grammarAccess.getPortAccess().getRequiredInterfaceInterfaceCrossReference_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__DescriptionAssignment_9_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getDescriptionDescriptionParserRuleCall_9_1_0()); }
	ruleDescription{ after(grammarAccess.getPortAccess().getDescriptionDescriptionParserRuleCall_9_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__OptionalAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getOptionalOptionalKeyword_1_0()); }
(
{ before(grammarAccess.getParameterAccess().getOptionalOptionalKeyword_1_0()); }

	'optional' 

{ after(grammarAccess.getParameterAccess().getOptionalOptionalKeyword_1_0()); }
)

{ after(grammarAccess.getParameterAccess().getOptionalOptionalKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__DataTypeAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getDataTypeSTRINGTerminalRuleCall_5_1_0()); }
	RULE_STRING{ after(grammarAccess.getParameterAccess().getDataTypeSTRINGTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__DescriptionAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); }
	ruleDescription{ after(grammarAccess.getParameterAccess().getDescriptionDescriptionParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Description__DescriptionAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0()); }
	RULE_STRING{ after(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


