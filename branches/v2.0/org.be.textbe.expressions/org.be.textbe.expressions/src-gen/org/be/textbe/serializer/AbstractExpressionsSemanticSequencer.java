package org.be.textbe.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.be.textbe.expressions.AttributeRealisation;
import org.be.textbe.expressions.BehaviorNode;
import org.be.textbe.expressions.BinaryExpression;
import org.be.textbe.expressions.BinaryRelation;
import org.be.textbe.expressions.BracketedExpression;
import org.be.textbe.expressions.Cardinality;
import org.be.textbe.expressions.ComponentInstantiation;
import org.be.textbe.expressions.EnumeratedSet;
import org.be.textbe.expressions.ExpressionsPackage;
import org.be.textbe.expressions.FunctionApplication;
import org.be.textbe.expressions.FuzzyExp;
import org.be.textbe.expressions.Guard;
import org.be.textbe.expressions.Reference;
import org.be.textbe.expressions.StateRealisation;
import org.be.textbe.services.ExpressionsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractExpressionsSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ExpressionsGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionsPackage.ATTRIBUTE_REALISATION:
				if(context == grammarAccess.getAttributeRealisationRule() ||
				   context == grammarAccess.getBehaviorRule()) {
					sequence_AttributeRealisation(context, (AttributeRealisation) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.BEHAVIOR_NODE:
				if(context == grammarAccess.getBehaviorNodeRule() ||
				   context == grammarAccess.getNodeRule()) {
					sequence_BehaviorNode(context, (BehaviorNode) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.BINARY_EXPRESSION:
				if(context == grammarAccess.getBinaryExpressionRule()) {
					sequence_BinaryExpression(context, (BinaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.BINARY_RELATION:
				if(context == grammarAccess.getBinaryRelationRule()) {
					sequence_BinaryRelation(context, (BinaryRelation) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.BRACKETED_EXPRESSION:
				if(context == grammarAccess.getBracketedExpressionRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BracketedExpression(context, (BracketedExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.CARDINALITY:
				if(context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Cardinality(context, (Cardinality) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.COMPONENT_INSTANTIATION:
				if(context == grammarAccess.getAtLeastOneRule() ||
				   context == grammarAccess.getComponentInstantiationRule() ||
				   context == grammarAccess.getComponentInstantiationNodeRule() ||
				   context == grammarAccess.getForAllRule() ||
				   context == grammarAccess.getForOneArbitraryRule() ||
				   context == grammarAccess.getForSomeRule() ||
				   context == grammarAccess.getNodeRule()) {
					sequence_ComponentInstantiation(context, (ComponentInstantiation) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.ENUMERATED_SET:
				if(context == grammarAccess.getEnumeratedSetRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_EnumeratedSet(context, (EnumeratedSet) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.FUNCTION_APPLICATION:
				if(context == grammarAccess.getBehaviorRule() ||
				   context == grammarAccess.getEventRule() ||
				   context == grammarAccess.getExternalInputEventRule() ||
				   context == grammarAccess.getExternalOutputEventRule() ||
				   context == grammarAccess.getFunctionApplicationRule() ||
				   context == grammarAccess.getInternalInputEventRule() ||
				   context == grammarAccess.getInternalOutputEventRule() ||
				   context == grammarAccess.getSelectionRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_FunctionApplication(context, (FunctionApplication) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.FUZZY_EXP:
				if(context == grammarAccess.getFuzzyExpRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_FuzzyExp(context, (FuzzyExp) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.GUARD:
				if(context == grammarAccess.getBehaviorRule() ||
				   context == grammarAccess.getGuardRule()) {
					sequence_Guard(context, (Guard) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.NUMBER:
				if(context == grammarAccess.getNumberRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Number(context, (org.be.textbe.expressions.Number) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.REFERENCE:
				if(context == grammarAccess.getReferenceRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.STATE_REALISATION:
				if(context == grammarAccess.getBehaviorRule() ||
				   context == grammarAccess.getStateRealisationRule()) {
					sequence_StateRealisation(context, (StateRealisation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (attribute=Identifier value=BinaryExpression)
	 *
	 * Features:
	 *    attribute[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_AttributeRealisation(EObject context, AttributeRealisation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.ATTRIBUTE_REALISATION__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.ATTRIBUTE_REALISATION__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.ATTRIBUTE_REALISATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.ATTRIBUTE_REALISATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeRealisationAccess().getAttributeIdentifierParserRuleCall_1_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getAttributeRealisationAccess().getValueBinaryExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (component=Identifier behavior=Behavior)
	 *
	 * Features:
	 *    component[1, 1]
	 *    behavior[1, 1]
	 */
	protected void sequence_BehaviorNode(EObject context, BehaviorNode semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BEHAVIOR_NODE__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BEHAVIOR_NODE__COMPONENT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BEHAVIOR_NODE__BEHAVIOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BEHAVIOR_NODE__BEHAVIOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBehaviorNodeAccess().getComponentIdentifierParserRuleCall_0_0(), semanticObject.getComponent());
		feeder.accept(grammarAccess.getBehaviorNodeAccess().getBehaviorBehaviorParserRuleCall_1_0(), semanticObject.getBehavior());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpression=Value (operator=BinaryOperator rightExpression=BinaryExpression)?)
	 *
	 * Features:
	 *    leftExpression[1, 1]
	 *    operator[0, 1]
	 *         EXCLUDE_IF_UNSET rightExpression
	 *         MANDATORY_IF_SET rightExpression
	 *    rightExpression[0, 1]
	 *         EXCLUDE_IF_UNSET operator
	 *         MANDATORY_IF_SET operator
	 */
	protected void sequence_BinaryExpression(EObject context, BinaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=BinaryExpression (operator=binarySymbol right=BinaryExpression)?)
	 *
	 * Features:
	 *    left[1, 1]
	 *    operator[0, 1]
	 *         EXCLUDE_IF_UNSET right
	 *         MANDATORY_IF_SET right
	 *    right[0, 1]
	 *         EXCLUDE_IF_UNSET operator
	 *         MANDATORY_IF_SET operator
	 */
	protected void sequence_BinaryRelation(EObject context, BinaryRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=BinaryRelation
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_BracketedExpression(EObject context, BracketedExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BRACKETED_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BRACKETED_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBracketedExpressionAccess().getExpressionBinaryRelationParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=BinaryExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_Cardinality(EObject context, Cardinality semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.CARDINALITY__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.CARDINALITY__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCardinalityAccess().getExpressionBinaryExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (component=Identifier componentSet=BinaryExpression)
	 *
	 * Features:
	 *    component[1, 1]
	 *    componentSet[1, 1]
	 */
	protected void sequence_ComponentInstantiation(EObject context, ComponentInstantiation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.COMPONENT_INSTANTIATION__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.COMPONENT_INSTANTIATION__COMPONENT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.COMPONENT_INSTANTIATION__COMPONENT_SET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.COMPONENT_INSTANTIATION__COMPONENT_SET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComponentInstantiationAccess().getComponentIdentifierParserRuleCall_0_0(), semanticObject.getComponent());
		feeder.accept(grammarAccess.getComponentInstantiationAccess().getComponentSetBinaryExpressionParserRuleCall_3_0(), semanticObject.getComponentSet());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expressions+=BinaryExpression
	 *
	 * Features:
	 *    expressions[1, 1]
	 */
	protected void sequence_EnumeratedSet(EObject context, EnumeratedSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (functionName=Identifier parameter+=BinaryExpression)
	 *
	 * Features:
	 *    functionName[1, 1]
	 *    parameter[1, 1]
	 */
	protected void sequence_FunctionApplication(EObject context, FunctionApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=BinaryExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_FuzzyExp(EObject context, FuzzyExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.FUZZY_EXP__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.FUZZY_EXP__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFuzzyExpAccess().getExpressionBinaryExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     state=BinaryExpression
	 *
	 * Features:
	 *    state[1, 1]
	 */
	protected void sequence_Guard(EObject context, Guard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.GUARD__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.GUARD__STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuardAccess().getStateBinaryExpressionParserRuleCall_1_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_Number(EObject context, org.be.textbe.expressions.Number semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     object=Identifier
	 *
	 * Features:
	 *    object[1, 1]
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.REFERENCE__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.REFERENCE__OBJECT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceAccess().getObjectIdentifierParserRuleCall_0(), semanticObject.getObject());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     state=BinaryExpression
	 *
	 * Features:
	 *    state[1, 1]
	 */
	protected void sequence_StateRealisation(EObject context, StateRealisation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.STATE_REALISATION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.STATE_REALISATION__STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateRealisationAccess().getStateBinaryExpressionParserRuleCall_1_0(), semanticObject.getState());
		feeder.finish();
	}
}
