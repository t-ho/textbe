package org.be.textbe.bt2sal2.xtext.sal.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.be.textbe.bt2sal2.xtext.sal.sal.Application;
import org.be.textbe.bt2sal2.xtext.sal.sal.Argument;
import org.be.textbe.bt2sal2.xtext.sal.sal.Assignments;
import org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations;
import org.be.textbe.bt2sal2.xtext.sal.sal.BasicType;
import org.be.textbe.bt2sal2.xtext.sal.sal.BracketedExpression;
import org.be.textbe.bt2sal2.xtext.sal.sal.Context;
import org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody;
import org.be.textbe.bt2sal2.xtext.sal.sal.Declarations;
import org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.Definitions;
import org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.Function;
import org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication;
import org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.InputDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.Lhs;
import org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.ModuleDeclaration;
import org.be.textbe.bt2sal2.xtext.sal.sal.Name;
import org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.NextVariable;
import org.be.textbe.bt2sal2.xtext.sal.sal.Numeral;
import org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication;
import org.be.textbe.bt2sal2.xtext.sal.sal.OutputDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName;
import org.be.textbe.bt2sal2.xtext.sal.sal.RhsExpression;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType;
import org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition;
import org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands;
import org.be.textbe.bt2sal2.xtext.sal.sal.Subrange;
import org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration;
import org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls;
import org.be.textbe.bt2sal2.xtext.sal.services.SalGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SalSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SalGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SalPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SalPackage.APPLICATION:
				if(context == grammarAccess.getApplicationRule()) {
					sequence_Application(context, (Application) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.ARGUMENT:
				if(context == grammarAccess.getArgumentRule()) {
					sequence_Argument(context, (Argument) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.ASSIGNMENTS:
				if(context == grammarAccess.getAssignmentsRule()) {
					sequence_Assignments(context, (Assignments) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.BASE_DECLARATIONS:
				if(context == grammarAccess.getBaseDeclarationsRule() ||
				   context == grammarAccess.getBaseModuleRule() ||
				   context == grammarAccess.getModuleRule()) {
					sequence_BaseDeclarations(context, (BaseDeclarations) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.BASIC_TYPE:
				if(context == grammarAccess.getActualParametersRule() ||
				   context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_BasicType(context, (BasicType) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.BRACKETED_EXPRESSION:
				if(context == grammarAccess.getBoundRule() ||
				   context == grammarAccess.getBracketedExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getGuardRule()) {
					sequence_BracketedExpression(context, (BracketedExpression) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.CONTEXT:
				if(context == grammarAccess.getContextRule()) {
					sequence_Context(context, (Context) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.CONTEXT_BODY:
				if(context == grammarAccess.getContextBodyRule()) {
					sequence_ContextBody(context, (ContextBody) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.DECLARATIONS:
				if(context == grammarAccess.getDeclarationsRule()) {
					sequence_Declarations(context, (Declarations) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.DEF_DECL:
				if(context == grammarAccess.getBaseDeclarationRule() ||
				   context == grammarAccess.getDefDeclRule()) {
					sequence_DefDecl(context, (DefDecl) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.DEFINITIONS:
				if(context == grammarAccess.getDefinitionsRule()) {
					sequence_Definitions(context, (Definitions) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.ELSE_COMMAND:
				if(context == grammarAccess.getElseCommandRule()) {
					sequence_ElseCommand(context, (ElseCommand) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.GUARDED_COMMAND:
				if(context == grammarAccess.getGuardedCommandRule()) {
					sequence_GuardedCommand(context, (GuardedCommand) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.INFIX_APPLICATION:
				if(context == grammarAccess.getInfixApplicationRule()) {
					sequence_InfixApplication(context, (InfixApplication) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.INIT_DECL:
				if(context == grammarAccess.getBaseDeclarationRule() ||
				   context == grammarAccess.getInitDeclRule()) {
					sequence_InitDecl(context, (InitDecl) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.INPUT_DECL:
				if(context == grammarAccess.getBaseDeclarationRule() ||
				   context == grammarAccess.getInputDeclRule()) {
					sequence_InputDecl(context, (InputDecl) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.LHS:
				if(context == grammarAccess.getLhsRule()) {
					sequence_Lhs(context, (Lhs) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.LOCAL_DECL:
				if(context == grammarAccess.getBaseDeclarationRule() ||
				   context == grammarAccess.getLocalDeclRule()) {
					sequence_LocalDecl(context, (LocalDecl) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.MODULE_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getModuleDeclarationRule()) {
					sequence_ModuleDeclaration(context, (ModuleDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.NAME:
				if(context == grammarAccess.getActualParametersRule() ||
				   context == grammarAccess.getBoundRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getNameExprRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_Name(context, (Name) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.NAMED_COMMAND:
				if(context == grammarAccess.getNamedCommandRule() ||
				   context == grammarAccess.getSomeCommandRule()) {
					sequence_NamedCommand(context, (NamedCommand) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.NEXT_VARIABLE:
				if(context == grammarAccess.getBoundRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getNextVariableRule()) {
					sequence_NextVariable(context, (NextVariable) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.NUMERAL:
				if(context == grammarAccess.getBoundRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getNumeralRule()) {
					sequence_Numeral(context, (Numeral) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.OUTER_INFIX_APPLICATION:
				if(context == grammarAccess.getBoundRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getGuardRule() ||
				   context == grammarAccess.getOuterInfixApplicationRule()) {
					sequence_OuterInfixApplication(context, (OuterInfixApplication) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.OUTPUT_DECL:
				if(context == grammarAccess.getBaseDeclarationRule() ||
				   context == grammarAccess.getOutputDeclRule()) {
					sequence_OutputDecl(context, (OutputDecl) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.QUALIFIED_NAME:
				if(context == grammarAccess.getActualParametersRule() ||
				   context == grammarAccess.getQualifiedNameRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_QualifiedName(context, (QualifiedName) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.RHS_EXPRESSION:
				if(context == grammarAccess.getRhsDefinitionRule() ||
				   context == grammarAccess.getRhsExpressionRule()) {
					sequence_RhsExpression(context, (RhsExpression) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.SCALAR_TYPE:
				if(context == grammarAccess.getScalarTypeRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_ScalarType(context, (ScalarType) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.SIMPLE_DEFINITION:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getDefinitionOrCommandRule() ||
				   context == grammarAccess.getSimpleDefinitionRule()) {
					sequence_SimpleDefinition(context, (SimpleDefinition) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.SOME_COMMANDS:
				if(context == grammarAccess.getDefinitionOrCommandRule() ||
				   context == grammarAccess.getSomeCommandsRule()) {
					sequence_SomeCommands(context, (SomeCommands) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.SUBRANGE:
				if(context == grammarAccess.getActualParametersRule() ||
				   context == grammarAccess.getSubrangeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_Subrange(context, (Subrange) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.TRANS_DECL:
				if(context == grammarAccess.getBaseDeclarationRule() ||
				   context == grammarAccess.getTransDeclRule()) {
					sequence_TransDecl(context, (TransDecl) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.TYPE_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getTypeDeclarationRule()) {
					sequence_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.VAR_DECL:
				if(context == grammarAccess.getVarDeclRule()) {
					sequence_VarDecl(context, (VarDecl) semanticObject); 
					return; 
				}
				else break;
			case SalPackage.VAR_DECLS:
				if(context == grammarAccess.getVarDeclsRule()) {
					sequence_VarDecls(context, (VarDecls) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (function=Function argument=Argument)
	 */
	protected void sequence_Application(EObject context, Application semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.APPLICATION__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.APPLICATION__FUNCTION));
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.APPLICATION__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.APPLICATION__ARGUMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationAccess().getFunctionFunctionParserRuleCall_0_0(), semanticObject.getFunction());
		feeder.accept(grammarAccess.getApplicationAccess().getArgumentArgumentParserRuleCall_1_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((firstExpression=NameExpr | firstExpression=BracketedExpression) (nextExpression+=NameExpr | nextExpression+=BracketedExpression)*)
	 */
	protected void sequence_Argument(EObject context, Argument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (firstSimpleDefinition=SimpleDefinition? nextSimpleDefinition+=SimpleDefinition*)
	 */
	protected void sequence_Assignments(EObject context, Assignments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     baseDeclaration+=BaseDeclaration+
	 */
	protected void sequence_BaseDeclarations(EObject context, BaseDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type='BOOLEAN'
	 */
	protected void sequence_BasicType(EObject context, BasicType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.BASIC_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.BASIC_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBasicTypeAccess().getTypeBOOLEANKeyword_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_BracketedExpression(EObject context, BracketedExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.BRACKETED_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.BRACKETED_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBracketedExpressionAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     declarations=Declarations
	 */
	protected void sequence_ContextBody(EObject context, ContextBody semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.CONTEXT_BODY__DECLARATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.CONTEXT_BODY__DECLARATIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContextBodyAccess().getDeclarationsDeclarationsParserRuleCall_1_0(), semanticObject.getDeclarations());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=IDENTIFIERS contextBody=ContextBody)
	 */
	protected void sequence_Context(EObject context, Context semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.CONTEXT__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.CONTEXT__IDENTIFIER));
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.CONTEXT__CONTEXT_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.CONTEXT__CONTEXT_BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContextAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0(), semanticObject.getIdentifier());
		feeder.accept(grammarAccess.getContextAccess().getContextBodyContextBodyParserRuleCall_2_0(), semanticObject.getContextBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     declaration+=Declaration+
	 */
	protected void sequence_Declarations(EObject context, Declarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     definitions=Definitions
	 */
	protected void sequence_DefDecl(EObject context, DefDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.DEF_DECL__DEFINITIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.DEF_DECL__DEFINITIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefDeclAccess().getDefinitionsDefinitionsParserRuleCall_1_0(), semanticObject.getDefinitions());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     definition+=Definition+
	 */
	protected void sequence_Definitions(EObject context, Definitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=IDENTIFIERS? assignments=Assignments)
	 */
	protected void sequence_ElseCommand(EObject context, ElseCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=NameExpr
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.FUNCTION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.FUNCTION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getExpressionNameExprParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (guard=Guard assignment=Assignments)
	 */
	protected void sequence_GuardedCommand(EObject context, GuardedCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.GUARDED_COMMAND__GUARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.GUARDED_COMMAND__GUARD));
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.GUARDED_COMMAND__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.GUARDED_COMMAND__ASSIGNMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuardedCommandAccess().getGuardGuardParserRuleCall_0_0(), semanticObject.getGuard());
		feeder.accept(grammarAccess.getGuardedCommandAccess().getAssignmentAssignmentsParserRuleCall_2_0(), semanticObject.getAssignment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (firstExpression=NameExpr (secondExpression=NameExpr | secondExpression=Numeral | secondExpression=BracketedExpression))
	 */
	protected void sequence_InfixApplication(EObject context, InfixApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     definitionOrCommand+=DefinitionOrCommand+
	 */
	protected void sequence_InitDecl(EObject context, InitDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     varDecls=VarDecls
	 */
	protected void sequence_InputDecl(EObject context, InputDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.INPUT_DECL__VAR_DECLS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.INPUT_DECL__VAR_DECLS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputDeclAccess().getVarDeclsVarDeclsParserRuleCall_1_0(), semanticObject.getVarDecls());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     identifier=IDENTIFIERS
	 */
	protected void sequence_Lhs(EObject context, Lhs semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.LHS__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.LHS__IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLhsAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     varDecls=VarDecls
	 */
	protected void sequence_LocalDecl(EObject context, LocalDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.LOCAL_DECL__VAR_DECLS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.LOCAL_DECL__VAR_DECLS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalDeclAccess().getVarDeclsVarDeclsParserRuleCall_1_0(), semanticObject.getVarDecls());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=IDENTIFIERS module=Module)
	 */
	protected void sequence_ModuleDeclaration(EObject context, ModuleDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.DECLARATION__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.DECLARATION__IDENTIFIER));
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.MODULE_DECLARATION__MODULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.MODULE_DECLARATION__MODULE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModuleDeclarationAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0(), semanticObject.getIdentifier());
		feeder.accept(grammarAccess.getModuleDeclarationAccess().getModuleModuleParserRuleCall_2_0(), semanticObject.getModule());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     identifier=IDENTIFIERS
	 */
	protected void sequence_Name(EObject context, Name semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.NAME__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.NAME__IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNameAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=IDENTIFIERS? guardedCommand=GuardedCommand)
	 */
	protected void sequence_NamedCommand(EObject context, NamedCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     identifier=IDENTIFIERS
	 */
	protected void sequence_NextVariable(EObject context, NextVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.NEXT_VARIABLE__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.NEXT_VARIABLE__IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNextVariableAccess().getIdentifierIDENTIFIERSTerminalRuleCall_0_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     number=NUMERALS
	 */
	protected void sequence_Numeral(EObject context, Numeral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.NUMERAL__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.NUMERAL__NUMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumeralAccess().getNumberNUMERALSTerminalRuleCall_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((firstExpression=Application | firstExpression=InfixApplication) (nextExpression+=Application | nextExpression+=InfixApplication)*)
	 */
	protected void sequence_OuterInfixApplication(EObject context, OuterInfixApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     varDecls=VarDecls
	 */
	protected void sequence_OutputDecl(EObject context, OutputDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.OUTPUT_DECL__VAR_DECLS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.OUTPUT_DECL__VAR_DECLS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOutputDeclAccess().getVarDeclsVarDeclsParserRuleCall_1_0(), semanticObject.getVarDecls());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifier1=IDENTIFIERS actualParameters=ActualParameters? identifier2=IDENTIFIERS)
	 */
	protected void sequence_QualifiedName(EObject context, QualifiedName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_RhsExpression(EObject context, RhsExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.RHS_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.RHS_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRhsExpressionAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     typeValue+=IDENTIFIERS+
	 */
	protected void sequence_ScalarType(EObject context, ScalarType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Lhs RhsDefinition=RhsDefinition)
	 */
	protected void sequence_SimpleDefinition(EObject context, SimpleDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.SIMPLE_DEFINITION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.SIMPLE_DEFINITION__LHS));
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.SIMPLE_DEFINITION__RHS_DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.SIMPLE_DEFINITION__RHS_DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleDefinitionAccess().getLhsLhsParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getSimpleDefinitionAccess().getRhsDefinitionRhsDefinitionParserRuleCall_1_0(), semanticObject.getRhsDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (firstSomeCommand=SomeCommand nextSomeCommand+=SomeCommand* elseCommand=ElseCommand?)
	 */
	protected void sequence_SomeCommands(EObject context, SomeCommands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=Bound upperBound=Bound)
	 */
	protected void sequence_Subrange(EObject context, Subrange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.SUBRANGE__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.SUBRANGE__LOWER_BOUND));
			if(transientValues.isValueTransient(semanticObject, SalPackage.Literals.SUBRANGE__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SalPackage.Literals.SUBRANGE__UPPER_BOUND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubrangeAccess().getLowerBoundBoundParserRuleCall_1_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getSubrangeAccess().getUpperBoundBoundParserRuleCall_3_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     definitionOrCommand+=DefinitionOrCommand+
	 */
	protected void sequence_TransDecl(EObject context, TransDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifier=IDENTIFIERS typeDef=TypeDef?)
	 */
	protected void sequence_TypeDeclaration(EObject context, TypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var+=IDENTIFIERS+ type=Type)
	 */
	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     varDecl+=VarDecl+
	 */
	protected void sequence_VarDecls(EObject context, VarDecls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
