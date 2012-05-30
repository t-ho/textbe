/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions.impl;

import org.be.textbe.expressions.AtLeastOne;
import org.be.textbe.expressions.AttributeRealisation;
import org.be.textbe.expressions.Behavior;
import org.be.textbe.expressions.BehaviorNode;
import org.be.textbe.expressions.BinaryExpression;
import org.be.textbe.expressions.BinaryOperator;
import org.be.textbe.expressions.BinaryRelation;
import org.be.textbe.expressions.BracketedExpression;
import org.be.textbe.expressions.Cardinality;
import org.be.textbe.expressions.ComponentInstantiation;
import org.be.textbe.expressions.ComponentInstantiationNode;
import org.be.textbe.expressions.EnumeratedSet;
import org.be.textbe.expressions.Event;
import org.be.textbe.expressions.ExpressionsFactory;
import org.be.textbe.expressions.ExpressionsPackage;
import org.be.textbe.expressions.ExternalInputEvent;
import org.be.textbe.expressions.ExternalOutputEvent;
import org.be.textbe.expressions.ForAll;
import org.be.textbe.expressions.ForOneArbitrary;
import org.be.textbe.expressions.ForSome;
import org.be.textbe.expressions.FunctionApplication;
import org.be.textbe.expressions.FuzzyExp;
import org.be.textbe.expressions.Guard;
import org.be.textbe.expressions.InternalInputEvent;
import org.be.textbe.expressions.InternalOutputEvent;
import org.be.textbe.expressions.Node;
import org.be.textbe.expressions.Reference;
import org.be.textbe.expressions.Selection;
import org.be.textbe.expressions.StateRealisation;
import org.be.textbe.expressions.Value;
import org.be.textbe.expressions.binarySymbol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass behaviorNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass behaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateRealisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeRealisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalOutputEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalInputEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalOutputEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalInputEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentInstantiationNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forSomeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atLeastOneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forOneArbitraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentInstantiationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bracketedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumeratedSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fuzzyExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binarySymbolEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binaryOperatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.be.textbe.expressions.ExpressionsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExpressionsPackageImpl()
  {
    super(eNS_URI, ExpressionsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExpressionsPackage init()
  {
    if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

    // Obtain or create and register package
    ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theExpressionsPackage.createPackageContents();

    // Initialize created meta-data
    theExpressionsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExpressionsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
    return theExpressionsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehaviorNode()
  {
    return behaviorNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBehaviorNode_Component()
  {
    return (EAttribute)behaviorNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehaviorNode_Behavior()
  {
    return (EReference)behaviorNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehavior()
  {
    return behaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateRealisation()
  {
    return stateRealisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateRealisation_State()
  {
    return (EReference)stateRealisationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeRealisation()
  {
    return attributeRealisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeRealisation_Attribute()
  {
    return (EAttribute)attributeRealisationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeRealisation_Value()
  {
    return (EReference)attributeRealisationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelection()
  {
    return selectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuard()
  {
    return guardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuard_State()
  {
    return (EReference)guardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternalOutputEvent()
  {
    return internalOutputEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternalInputEvent()
  {
    return internalInputEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalOutputEvent()
  {
    return externalOutputEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalInputEvent()
  {
    return externalInputEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentInstantiationNode()
  {
    return componentInstantiationNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForAll()
  {
    return forAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForSome()
  {
    return forSomeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtLeastOne()
  {
    return atLeastOneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForOneArbitrary()
  {
    return forOneArbitraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentInstantiation()
  {
    return componentInstantiationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentInstantiation_Component()
  {
    return (EAttribute)componentInstantiationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentInstantiation_ComponentSet()
  {
    return (EReference)componentInstantiationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryRelation()
  {
    return binaryRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryRelation_Left()
  {
    return (EReference)binaryRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryRelation_Operator()
  {
    return (EAttribute)binaryRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryRelation_Right()
  {
    return (EReference)binaryRelationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryExpression()
  {
    return binaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpression_LeftExpression()
  {
    return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryExpression_Operator()
  {
    return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpression_RightExpression()
  {
    return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_Object()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumber_Value()
  {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionApplication()
  {
    return functionApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionApplication_FunctionName()
  {
    return (EAttribute)functionApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionApplication_Parameter()
  {
    return (EReference)functionApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBracketedExpression()
  {
    return bracketedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBracketedExpression_Expression()
  {
    return (EReference)bracketedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCardinality()
  {
    return cardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCardinality_Expression()
  {
    return (EReference)cardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeratedSet()
  {
    return enumeratedSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumeratedSet_Expressions()
  {
    return (EReference)enumeratedSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuzzyExp()
  {
    return fuzzyExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFuzzyExp_Expression()
  {
    return (EReference)fuzzyExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getbinarySymbol()
  {
    return binarySymbolEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBinaryOperator()
  {
    return binaryOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionsFactory getExpressionsFactory()
  {
    return (ExpressionsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    nodeEClass = createEClass(NODE);

    behaviorNodeEClass = createEClass(BEHAVIOR_NODE);
    createEAttribute(behaviorNodeEClass, BEHAVIOR_NODE__COMPONENT);
    createEReference(behaviorNodeEClass, BEHAVIOR_NODE__BEHAVIOR);

    behaviorEClass = createEClass(BEHAVIOR);

    stateRealisationEClass = createEClass(STATE_REALISATION);
    createEReference(stateRealisationEClass, STATE_REALISATION__STATE);

    attributeRealisationEClass = createEClass(ATTRIBUTE_REALISATION);
    createEAttribute(attributeRealisationEClass, ATTRIBUTE_REALISATION__ATTRIBUTE);
    createEReference(attributeRealisationEClass, ATTRIBUTE_REALISATION__VALUE);

    selectionEClass = createEClass(SELECTION);

    eventEClass = createEClass(EVENT);

    guardEClass = createEClass(GUARD);
    createEReference(guardEClass, GUARD__STATE);

    internalOutputEventEClass = createEClass(INTERNAL_OUTPUT_EVENT);

    internalInputEventEClass = createEClass(INTERNAL_INPUT_EVENT);

    externalOutputEventEClass = createEClass(EXTERNAL_OUTPUT_EVENT);

    externalInputEventEClass = createEClass(EXTERNAL_INPUT_EVENT);

    componentInstantiationNodeEClass = createEClass(COMPONENT_INSTANTIATION_NODE);

    forAllEClass = createEClass(FOR_ALL);

    forSomeEClass = createEClass(FOR_SOME);

    atLeastOneEClass = createEClass(AT_LEAST_ONE);

    forOneArbitraryEClass = createEClass(FOR_ONE_ARBITRARY);

    componentInstantiationEClass = createEClass(COMPONENT_INSTANTIATION);
    createEAttribute(componentInstantiationEClass, COMPONENT_INSTANTIATION__COMPONENT);
    createEReference(componentInstantiationEClass, COMPONENT_INSTANTIATION__COMPONENT_SET);

    binaryRelationEClass = createEClass(BINARY_RELATION);
    createEReference(binaryRelationEClass, BINARY_RELATION__LEFT);
    createEAttribute(binaryRelationEClass, BINARY_RELATION__OPERATOR);
    createEReference(binaryRelationEClass, BINARY_RELATION__RIGHT);

    binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
    createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT_EXPRESSION);
    createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);
    createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT_EXPRESSION);

    valueEClass = createEClass(VALUE);

    referenceEClass = createEClass(REFERENCE);
    createEAttribute(referenceEClass, REFERENCE__OBJECT);

    numberEClass = createEClass(NUMBER);
    createEAttribute(numberEClass, NUMBER__VALUE);

    functionApplicationEClass = createEClass(FUNCTION_APPLICATION);
    createEAttribute(functionApplicationEClass, FUNCTION_APPLICATION__FUNCTION_NAME);
    createEReference(functionApplicationEClass, FUNCTION_APPLICATION__PARAMETER);

    bracketedExpressionEClass = createEClass(BRACKETED_EXPRESSION);
    createEReference(bracketedExpressionEClass, BRACKETED_EXPRESSION__EXPRESSION);

    cardinalityEClass = createEClass(CARDINALITY);
    createEReference(cardinalityEClass, CARDINALITY__EXPRESSION);

    enumeratedSetEClass = createEClass(ENUMERATED_SET);
    createEReference(enumeratedSetEClass, ENUMERATED_SET__EXPRESSIONS);

    fuzzyExpEClass = createEClass(FUZZY_EXP);
    createEReference(fuzzyExpEClass, FUZZY_EXP__EXPRESSION);

    // Create enums
    binarySymbolEEnum = createEEnum(BINARY_SYMBOL);
    binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    behaviorNodeEClass.getESuperTypes().add(this.getNode());
    stateRealisationEClass.getESuperTypes().add(this.getBehavior());
    attributeRealisationEClass.getESuperTypes().add(this.getBehavior());
    selectionEClass.getESuperTypes().add(this.getBehavior());
    eventEClass.getESuperTypes().add(this.getBehavior());
    guardEClass.getESuperTypes().add(this.getBehavior());
    internalOutputEventEClass.getESuperTypes().add(this.getBehavior());
    internalInputEventEClass.getESuperTypes().add(this.getBehavior());
    externalOutputEventEClass.getESuperTypes().add(this.getBehavior());
    externalInputEventEClass.getESuperTypes().add(this.getBehavior());
    componentInstantiationNodeEClass.getESuperTypes().add(this.getNode());
    forAllEClass.getESuperTypes().add(this.getComponentInstantiationNode());
    forSomeEClass.getESuperTypes().add(this.getComponentInstantiationNode());
    atLeastOneEClass.getESuperTypes().add(this.getComponentInstantiationNode());
    forOneArbitraryEClass.getESuperTypes().add(this.getComponentInstantiationNode());
    componentInstantiationEClass.getESuperTypes().add(this.getForAll());
    componentInstantiationEClass.getESuperTypes().add(this.getForSome());
    componentInstantiationEClass.getESuperTypes().add(this.getAtLeastOne());
    componentInstantiationEClass.getESuperTypes().add(this.getForOneArbitrary());
    referenceEClass.getESuperTypes().add(this.getValue());
    numberEClass.getESuperTypes().add(this.getValue());
    functionApplicationEClass.getESuperTypes().add(this.getSelection());
    functionApplicationEClass.getESuperTypes().add(this.getEvent());
    functionApplicationEClass.getESuperTypes().add(this.getInternalOutputEvent());
    functionApplicationEClass.getESuperTypes().add(this.getInternalInputEvent());
    functionApplicationEClass.getESuperTypes().add(this.getExternalOutputEvent());
    functionApplicationEClass.getESuperTypes().add(this.getExternalInputEvent());
    functionApplicationEClass.getESuperTypes().add(this.getValue());
    bracketedExpressionEClass.getESuperTypes().add(this.getValue());
    cardinalityEClass.getESuperTypes().add(this.getValue());
    enumeratedSetEClass.getESuperTypes().add(this.getValue());
    fuzzyExpEClass.getESuperTypes().add(this.getValue());

    // Initialize classes and features; add operations and parameters
    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(behaviorNodeEClass, BehaviorNode.class, "BehaviorNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBehaviorNode_Component(), ecorePackage.getEString(), "component", null, 0, 1, BehaviorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehaviorNode_Behavior(), this.getBehavior(), null, "behavior", null, 0, 1, BehaviorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateRealisationEClass, StateRealisation.class, "StateRealisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateRealisation_State(), this.getBinaryExpression(), null, "state", null, 0, 1, StateRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeRealisationEClass, AttributeRealisation.class, "AttributeRealisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeRealisation_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, AttributeRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeRealisation_Value(), this.getBinaryExpression(), null, "value", null, 0, 1, AttributeRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGuard_State(), this.getBinaryExpression(), null, "state", null, 0, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(internalOutputEventEClass, InternalOutputEvent.class, "InternalOutputEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(internalInputEventEClass, InternalInputEvent.class, "InternalInputEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalOutputEventEClass, ExternalOutputEvent.class, "ExternalOutputEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalInputEventEClass, ExternalInputEvent.class, "ExternalInputEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(componentInstantiationNodeEClass, ComponentInstantiationNode.class, "ComponentInstantiationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forAllEClass, ForAll.class, "ForAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forSomeEClass, ForSome.class, "ForSome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atLeastOneEClass, AtLeastOne.class, "AtLeastOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forOneArbitraryEClass, ForOneArbitrary.class, "ForOneArbitrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(componentInstantiationEClass, ComponentInstantiation.class, "ComponentInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentInstantiation_Component(), ecorePackage.getEString(), "component", null, 0, 1, ComponentInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentInstantiation_ComponentSet(), this.getBinaryExpression(), null, "componentSet", null, 0, 1, ComponentInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryRelationEClass, BinaryRelation.class, "BinaryRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryRelation_Left(), this.getBinaryExpression(), null, "left", null, 0, 1, BinaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryRelation_Operator(), this.getbinarySymbol(), "operator", null, 0, 1, BinaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryRelation_Right(), this.getBinaryExpression(), null, "right", null, 0, 1, BinaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryExpression_LeftExpression(), this.getValue(), null, "leftExpression", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryExpression_Operator(), this.getBinaryOperator(), "operator", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryExpression_RightExpression(), this.getBinaryExpression(), null, "rightExpression", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReference_Object(), ecorePackage.getEString(), "object", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberEClass, org.be.textbe.expressions.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumber_Value(), ecorePackage.getEInt(), "value", null, 0, 1, org.be.textbe.expressions.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionApplicationEClass, FunctionApplication.class, "FunctionApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionApplication_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, FunctionApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionApplication_Parameter(), this.getBinaryExpression(), null, "parameter", null, 0, -1, FunctionApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bracketedExpressionEClass, BracketedExpression.class, "BracketedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBracketedExpression_Expression(), this.getBinaryRelation(), null, "expression", null, 0, 1, BracketedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCardinality_Expression(), this.getBinaryExpression(), null, "expression", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumeratedSetEClass, EnumeratedSet.class, "EnumeratedSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumeratedSet_Expressions(), this.getBinaryExpression(), null, "expressions", null, 0, -1, EnumeratedSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fuzzyExpEClass, FuzzyExp.class, "FuzzyExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFuzzyExp_Expression(), this.getBinaryExpression(), null, "expression", null, 0, 1, FuzzyExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(binarySymbolEEnum, binarySymbol.class, "binarySymbol");
    addEEnumLiteral(binarySymbolEEnum, binarySymbol.LESS_THAN);
    addEEnumLiteral(binarySymbolEEnum, binarySymbol.GREATER_THAN);
    addEEnumLiteral(binarySymbolEEnum, binarySymbol.EQUAL_TO);
    addEEnumLiteral(binarySymbolEEnum, binarySymbol.LESS_THAN_OR_EQUAL);
    addEEnumLiteral(binarySymbolEEnum, binarySymbol.GREATER_THAN_OR_EQUAL);
    addEEnumLiteral(binarySymbolEEnum, binarySymbol.COLON);
    addEEnumLiteral(binarySymbolEEnum, binarySymbol.SUBSET_EXP);

    initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
    addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.PLUS);
    addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MINUS);
    addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.INTERSECT);

    // Create resource
    createResource(eNS_URI);
  }

} //ExpressionsPackageImpl
