/*Hacked by DSL Forge*/
package org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.sphinx.examples.xtext.services.HummingbirdGrammarAccess;

public class HummingbirdParser extends AbstractContentAssistParser {
	
	@Inject
	private HummingbirdGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.internal.InternalHummingbirdParser createParser() {
		org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.internal.InternalHummingbirdParser result = new org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.internal.InternalHummingbirdParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEntryPointAccess().getAlternatives(), "rule__EntryPoint__Alternatives");
					put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
					put(grammarAccess.getIdentifiableAccess().getIdantifiableAlternatives_0(), "rule__Identifiable__IdantifiableAlternatives_0");
					put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
					put(grammarAccess.getApplicationAccess().getGroup_3(), "rule__Application__Group_3__0");
					put(grammarAccess.getApplicationAccess().getGroup_7(), "rule__Application__Group_7__0");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getComponentAccess().getGroup_4(), "rule__Component__Group_4__0");
					put(grammarAccess.getComponentAccess().getGroup_5(), "rule__Component__Group_5__0");
					put(grammarAccess.getComponentAccess().getGroup_6(), "rule__Component__Group_6__0");
					put(grammarAccess.getComponentAccess().getGroup_7(), "rule__Component__Group_7__0");
					put(grammarAccess.getComponentAccess().getGroup_7_3(), "rule__Component__Group_7_3__0");
					put(grammarAccess.getComponentAccess().getGroup_8(), "rule__Component__Group_8__0");
					put(grammarAccess.getComponentAccess().getGroup_8_3(), "rule__Component__Group_8_3__0");
					put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
					put(grammarAccess.getConnectionAccess().getGroup_7(), "rule__Connection__Group_7__0");
					put(grammarAccess.getParameterValueAccess().getGroup(), "rule__ParameterValue__Group__0");
					put(grammarAccess.getParameterValueAccess().getGroup_3(), "rule__ParameterValue__Group_3__0");
					put(grammarAccess.getParameterValueAccess().getGroup_6(), "rule__ParameterValue__Group_6__0");
					put(grammarAccess.getPlatformAccess().getGroup(), "rule__Platform__Group__0");
					put(grammarAccess.getPlatformAccess().getGroup_3(), "rule__Platform__Group_3__0");
					put(grammarAccess.getPlatformAccess().getGroup_7(), "rule__Platform__Group_7__0");
					put(grammarAccess.getPlatformAccess().getGroup_9(), "rule__Platform__Group_9__0");
					put(grammarAccess.getPlatformAccess().getGroup_9_3(), "rule__Platform__Group_9_3__0");
					put(grammarAccess.getComponentTypeAccess().getGroup(), "rule__ComponentType__Group__0");
					put(grammarAccess.getComponentTypeAccess().getGroup_4(), "rule__ComponentType__Group_4__0");
					put(grammarAccess.getComponentTypeAccess().getGroup_4_3(), "rule__ComponentType__Group_4_3__0");
					put(grammarAccess.getComponentTypeAccess().getGroup_5(), "rule__ComponentType__Group_5__0");
					put(grammarAccess.getComponentTypeAccess().getGroup_6(), "rule__ComponentType__Group_6__0");
					put(grammarAccess.getComponentTypeAccess().getGroup_6_3(), "rule__ComponentType__Group_6_3__0");
					put(grammarAccess.getComponentTypeAccess().getGroup_7(), "rule__ComponentType__Group_7__0");
					put(grammarAccess.getComponentTypeAccess().getGroup_7_3(), "rule__ComponentType__Group_7_3__0");
					put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup_4(), "rule__Interface__Group_4__0");
					put(grammarAccess.getInterfaceAccess().getGroup_4_3(), "rule__Interface__Group_4_3__0");
					put(grammarAccess.getInterfaceAccess().getGroup_5(), "rule__Interface__Group_5__0");
					put(grammarAccess.getInterfaceAccess().getGroup_5_3(), "rule__Interface__Group_5_3__0");
					put(grammarAccess.getInterfaceAccess().getGroup_6(), "rule__Interface__Group_6__0");
					put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
					put(grammarAccess.getPortAccess().getGroup_9(), "rule__Port__Group_9__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_5(), "rule__Parameter__Group_5__0");
					put(grammarAccess.getParameterAccess().getGroup_6(), "rule__Parameter__Group_6__0");
					put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
					put(grammarAccess.getApplicationAccess().getNameAssignment_1(), "rule__Application__NameAssignment_1");
					put(grammarAccess.getApplicationAccess().getDescriptionAssignment_3_1(), "rule__Application__DescriptionAssignment_3_1");
					put(grammarAccess.getApplicationAccess().getComponentsAssignment_6(), "rule__Application__ComponentsAssignment_6");
					put(grammarAccess.getApplicationAccess().getComponentsAssignment_7_1(), "rule__Application__ComponentsAssignment_7_1");
					put(grammarAccess.getComponentAccess().getNameAssignment_2(), "rule__Component__NameAssignment_2");
					put(grammarAccess.getComponentAccess().getTypeAssignment_4_1(), "rule__Component__TypeAssignment_4_1");
					put(grammarAccess.getComponentAccess().getIncomingConnectionsAssignment_5_1(), "rule__Component__IncomingConnectionsAssignment_5_1");
					put(grammarAccess.getComponentAccess().getDescriptionAssignment_6_1(), "rule__Component__DescriptionAssignment_6_1");
					put(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_2(), "rule__Component__OutgoingConnectionsAssignment_7_2");
					put(grammarAccess.getComponentAccess().getOutgoingConnectionsAssignment_7_3_1(), "rule__Component__OutgoingConnectionsAssignment_7_3_1");
					put(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_2(), "rule__Component__ParameterValuesAssignment_8_2");
					put(grammarAccess.getComponentAccess().getParameterValuesAssignment_8_3_1(), "rule__Component__ParameterValuesAssignment_8_3_1");
					put(grammarAccess.getConnectionAccess().getNameAssignment_1(), "rule__Connection__NameAssignment_1");
					put(grammarAccess.getConnectionAccess().getSourcePortAssignment_4(), "rule__Connection__SourcePortAssignment_4");
					put(grammarAccess.getConnectionAccess().getTargetComponentAssignment_6(), "rule__Connection__TargetComponentAssignment_6");
					put(grammarAccess.getConnectionAccess().getDescriptionAssignment_7_1(), "rule__Connection__DescriptionAssignment_7_1");
					put(grammarAccess.getParameterValueAccess().getNameAssignment_1(), "rule__ParameterValue__NameAssignment_1");
					put(grammarAccess.getParameterValueAccess().getValueAssignment_3_1(), "rule__ParameterValue__ValueAssignment_3_1");
					put(grammarAccess.getParameterValueAccess().getTypeAssignment_5(), "rule__ParameterValue__TypeAssignment_5");
					put(grammarAccess.getParameterValueAccess().getDescriptionAssignment_6_1(), "rule__ParameterValue__DescriptionAssignment_6_1");
					put(grammarAccess.getPlatformAccess().getNameAssignment_1(), "rule__Platform__NameAssignment_1");
					put(grammarAccess.getPlatformAccess().getDescriptionAssignment_3_1(), "rule__Platform__DescriptionAssignment_3_1");
					put(grammarAccess.getPlatformAccess().getComponentTypesAssignment_6(), "rule__Platform__ComponentTypesAssignment_6");
					put(grammarAccess.getPlatformAccess().getComponentTypesAssignment_7_1(), "rule__Platform__ComponentTypesAssignment_7_1");
					put(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_2(), "rule__Platform__InterfacesAssignment_9_2");
					put(grammarAccess.getPlatformAccess().getInterfacesAssignment_9_3_1(), "rule__Platform__InterfacesAssignment_9_3_1");
					put(grammarAccess.getComponentTypeAccess().getNameAssignment_2(), "rule__ComponentType__NameAssignment_2");
					put(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_2(), "rule__ComponentType__ProvidedInterfacesAssignment_4_2");
					put(grammarAccess.getComponentTypeAccess().getProvidedInterfacesAssignment_4_3_1(), "rule__ComponentType__ProvidedInterfacesAssignment_4_3_1");
					put(grammarAccess.getComponentTypeAccess().getDescriptionAssignment_5_1(), "rule__ComponentType__DescriptionAssignment_5_1");
					put(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_2(), "rule__ComponentType__PortsAssignment_6_2");
					put(grammarAccess.getComponentTypeAccess().getPortsAssignment_6_3_1(), "rule__ComponentType__PortsAssignment_6_3_1");
					put(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_2(), "rule__ComponentType__ParametersAssignment_7_2");
					put(grammarAccess.getComponentTypeAccess().getParametersAssignment_7_3_1(), "rule__ComponentType__ParametersAssignment_7_3_1");
					put(grammarAccess.getInterfaceAccess().getNameAssignment_2(), "rule__Interface__NameAssignment_2");
					put(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_2(), "rule__Interface__ProvidingComponentTypesAssignment_4_2");
					put(grammarAccess.getInterfaceAccess().getProvidingComponentTypesAssignment_4_3_1(), "rule__Interface__ProvidingComponentTypesAssignment_4_3_1");
					put(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_2(), "rule__Interface__RequiringPortsAssignment_5_2");
					put(grammarAccess.getInterfaceAccess().getRequiringPortsAssignment_5_3_1(), "rule__Interface__RequiringPortsAssignment_5_3_1");
					put(grammarAccess.getInterfaceAccess().getDescriptionAssignment_6_1(), "rule__Interface__DescriptionAssignment_6_1");
					put(grammarAccess.getPortAccess().getNameAssignment_1(), "rule__Port__NameAssignment_1");
					put(grammarAccess.getPortAccess().getMinProviderCountAssignment_4(), "rule__Port__MinProviderCountAssignment_4");
					put(grammarAccess.getPortAccess().getMaxProviderCountAssignment_6(), "rule__Port__MaxProviderCountAssignment_6");
					put(grammarAccess.getPortAccess().getRequiredInterfaceAssignment_8(), "rule__Port__RequiredInterfaceAssignment_8");
					put(grammarAccess.getPortAccess().getDescriptionAssignment_9_1(), "rule__Port__DescriptionAssignment_9_1");
					put(grammarAccess.getParameterAccess().getOptionalAssignment_1(), "rule__Parameter__OptionalAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_3(), "rule__Parameter__NameAssignment_3");
					put(grammarAccess.getParameterAccess().getDataTypeAssignment_5_1(), "rule__Parameter__DataTypeAssignment_5_1");
					put(grammarAccess.getParameterAccess().getDescriptionAssignment_6_1(), "rule__Parameter__DescriptionAssignment_6_1");
					put(grammarAccess.getIdentifiableAccess().getIdantifiableAssignment(), "rule__Identifiable__IdantifiableAssignment");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment(), "rule__Description__DescriptionAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.internal.InternalHummingbirdParser typedParser = (org.eclipse.sphinx.examples.xtext.hummingbird.web.contentassist.antlr.internal.InternalHummingbirdParser) parser;
			typedParser.entryRuleEntryPoint();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public HummingbirdGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HummingbirdGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
