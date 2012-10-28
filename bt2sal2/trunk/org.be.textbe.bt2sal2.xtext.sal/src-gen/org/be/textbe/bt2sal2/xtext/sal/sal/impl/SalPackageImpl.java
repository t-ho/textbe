/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.ActualParameters;
import org.be.textbe.bt2sal2.xtext.sal.sal.Application;
import org.be.textbe.bt2sal2.xtext.sal.sal.Argument;
import org.be.textbe.bt2sal2.xtext.sal.sal.Assignments;
import org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclaration;
import org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations;
import org.be.textbe.bt2sal2.xtext.sal.sal.BaseModule;
import org.be.textbe.bt2sal2.xtext.sal.sal.BasicType;
import org.be.textbe.bt2sal2.xtext.sal.sal.Bound;
import org.be.textbe.bt2sal2.xtext.sal.sal.BracketedExpression;
import org.be.textbe.bt2sal2.xtext.sal.sal.Context;
import org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody;
import org.be.textbe.bt2sal2.xtext.sal.sal.Declaration;
import org.be.textbe.bt2sal2.xtext.sal.sal.Declarations;
import org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.Definition;
import org.be.textbe.bt2sal2.xtext.sal.sal.DefinitionOrCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.Definitions;
import org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.Expression;
import org.be.textbe.bt2sal2.xtext.sal.sal.Function;
import org.be.textbe.bt2sal2.xtext.sal.sal.Guard;
import org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication;
import org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.InputDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.Lhs;
import org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.Module;
import org.be.textbe.bt2sal2.xtext.sal.sal.ModuleDeclaration;
import org.be.textbe.bt2sal2.xtext.sal.sal.Name;
import org.be.textbe.bt2sal2.xtext.sal.sal.NameExpr;
import org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.NextVariable;
import org.be.textbe.bt2sal2.xtext.sal.sal.Numeral;
import org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication;
import org.be.textbe.bt2sal2.xtext.sal.sal.OutputDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName;
import org.be.textbe.bt2sal2.xtext.sal.sal.RhsDefinition;
import org.be.textbe.bt2sal2.xtext.sal.sal.RhsExpression;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalFactory;
import org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage;
import org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType;
import org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition;
import org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommand;
import org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands;
import org.be.textbe.bt2sal2.xtext.sal.sal.Subrange;
import org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.Type;
import org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration;
import org.be.textbe.bt2sal2.xtext.sal.sal.TypeDef;
import org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl;
import org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SalPackageImpl extends EPackageImpl implements SalPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actualParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subrangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scalarTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseDeclarationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varDeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionOrCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lhsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rhsDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rhsExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass someCommandsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass someCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guardedCommandEClass = null;

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
  private EClass assignmentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elseCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

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
  private EClass outerInfixApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nextVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infixApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numeralEClass = null;

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
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SalPackageImpl()
  {
    super(eNS_URI, SalFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SalPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SalPackage init()
  {
    if (isInited) return (SalPackage)EPackage.Registry.INSTANCE.getEPackage(SalPackage.eNS_URI);

    // Obtain or create and register package
    SalPackageImpl theSalPackage = (SalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SalPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSalPackage.createPackageContents();

    // Initialize created meta-data
    theSalPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSalPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SalPackage.eNS_URI, theSalPackage);
    return theSalPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContext()
  {
    return contextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContext_Identifier()
  {
    return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContext_ContextBody()
  {
    return (EReference)contextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextBody()
  {
    return contextBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextBody_Declarations()
  {
    return (EReference)contextBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarations()
  {
    return declarationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarations_Declaration()
  {
    return (EReference)declarationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_Identifier()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDeclaration()
  {
    return typeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDeclaration_TypeDef()
  {
    return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDef()
  {
    return typeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicType()
  {
    return basicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicType_Type()
  {
    return (EAttribute)basicTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedName()
  {
    return qualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedName_Identifier1()
  {
    return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedName_ActualParameters()
  {
    return (EReference)qualifiedNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedName_Identifier2()
  {
    return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActualParameters()
  {
    return actualParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubrange()
  {
    return subrangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubrange_LowerBound()
  {
    return (EReference)subrangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubrange_UpperBound()
  {
    return (EReference)subrangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBound()
  {
    return boundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScalarType()
  {
    return scalarTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScalarType_NextType()
  {
    return (EAttribute)scalarTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleDeclaration()
  {
    return moduleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleDeclaration_Module()
  {
    return (EReference)moduleDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseModule()
  {
    return baseModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseDeclarations()
  {
    return baseDeclarationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseDeclarations_BaseDeclaration()
  {
    return (EReference)baseDeclarationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseDeclaration()
  {
    return baseDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputDecl()
  {
    return inputDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputDecl_VarDecls()
  {
    return (EReference)inputDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputDecl()
  {
    return outputDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputDecl_VarDecls()
  {
    return (EReference)outputDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalDecl()
  {
    return localDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalDecl_VarDecls()
  {
    return (EReference)localDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefDecl()
  {
    return defDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefDecl_Definitions()
  {
    return (EReference)defDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitDecl()
  {
    return initDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitDecl_DefinitionOrCommand()
  {
    return (EReference)initDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransDecl()
  {
    return transDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransDecl_DefinitionOrCommand()
  {
    return (EReference)transDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarDecls()
  {
    return varDeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarDecls_VarDecl()
  {
    return (EReference)varDeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarDecl()
  {
    return varDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarDecl_Var()
  {
    return (EAttribute)varDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarDecl_Type()
  {
    return (EReference)varDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitions()
  {
    return definitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinitions_Definition()
  {
    return (EReference)definitionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitionOrCommand()
  {
    return definitionOrCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleDefinition()
  {
    return simpleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleDefinition_Lhs()
  {
    return (EReference)simpleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleDefinition_RhsDefinition()
  {
    return (EReference)simpleDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLhs()
  {
    return lhsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLhs_Identifier()
  {
    return (EAttribute)lhsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRhsDefinition()
  {
    return rhsDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRhsExpression()
  {
    return rhsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRhsExpression_Expression()
  {
    return (EReference)rhsExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSomeCommands()
  {
    return someCommandsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSomeCommands_FirstSomeCommand()
  {
    return (EReference)someCommandsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSomeCommands_NextSomeCommand()
  {
    return (EReference)someCommandsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSomeCommands_ElseCommand()
  {
    return (EReference)someCommandsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSomeCommand()
  {
    return someCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedCommand()
  {
    return namedCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedCommand_Identifier()
  {
    return (EAttribute)namedCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedCommand_GuardedCommand()
  {
    return (EReference)namedCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuardedCommand()
  {
    return guardedCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardedCommand_Guard()
  {
    return (EReference)guardedCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardedCommand_Assignment()
  {
    return (EReference)guardedCommandEClass.getEStructuralFeatures().get(1);
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
  public EClass getAssignments()
  {
    return assignmentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignments_FirstSimpleDefinition()
  {
    return (EReference)assignmentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignments_NextSimpleDefinition()
  {
    return (EReference)assignmentsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElseCommand()
  {
    return elseCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElseCommand_Identifier()
  {
    return (EAttribute)elseCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseCommand_Assignments()
  {
    return (EReference)elseCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
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
  public EClass getOuterInfixApplication()
  {
    return outerInfixApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOuterInfixApplication_FirstExpression()
  {
    return (EReference)outerInfixApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOuterInfixApplication_NextExpression()
  {
    return (EReference)outerInfixApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameExpr()
  {
    return nameExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNextVariable()
  {
    return nextVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNextVariable_Identifier()
  {
    return (EAttribute)nextVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplication()
  {
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Function()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Argument()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Expression()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_FirstExpression()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_NextExpression()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfixApplication()
  {
    return infixApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixApplication_FirstExpression()
  {
    return (EReference)infixApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfixApplication_SecondExpression()
  {
    return (EReference)infixApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getName_()
  {
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getName_Identifier()
  {
    return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumeral()
  {
    return numeralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumeral_Number()
  {
    return (EAttribute)numeralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalFactory getSalFactory()
  {
    return (SalFactory)getEFactoryInstance();
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
    contextEClass = createEClass(CONTEXT);
    createEAttribute(contextEClass, CONTEXT__IDENTIFIER);
    createEReference(contextEClass, CONTEXT__CONTEXT_BODY);

    contextBodyEClass = createEClass(CONTEXT_BODY);
    createEReference(contextBodyEClass, CONTEXT_BODY__DECLARATIONS);

    declarationsEClass = createEClass(DECLARATIONS);
    createEReference(declarationsEClass, DECLARATIONS__DECLARATION);

    declarationEClass = createEClass(DECLARATION);
    createEAttribute(declarationEClass, DECLARATION__IDENTIFIER);

    typeDeclarationEClass = createEClass(TYPE_DECLARATION);
    createEReference(typeDeclarationEClass, TYPE_DECLARATION__TYPE_DEF);

    typeDefEClass = createEClass(TYPE_DEF);

    typeEClass = createEClass(TYPE);

    basicTypeEClass = createEClass(BASIC_TYPE);
    createEAttribute(basicTypeEClass, BASIC_TYPE__TYPE);

    qualifiedNameEClass = createEClass(QUALIFIED_NAME);
    createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__IDENTIFIER1);
    createEReference(qualifiedNameEClass, QUALIFIED_NAME__ACTUAL_PARAMETERS);
    createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__IDENTIFIER2);

    actualParametersEClass = createEClass(ACTUAL_PARAMETERS);

    subrangeEClass = createEClass(SUBRANGE);
    createEReference(subrangeEClass, SUBRANGE__LOWER_BOUND);
    createEReference(subrangeEClass, SUBRANGE__UPPER_BOUND);

    boundEClass = createEClass(BOUND);

    scalarTypeEClass = createEClass(SCALAR_TYPE);
    createEAttribute(scalarTypeEClass, SCALAR_TYPE__NEXT_TYPE);

    moduleDeclarationEClass = createEClass(MODULE_DECLARATION);
    createEReference(moduleDeclarationEClass, MODULE_DECLARATION__MODULE);

    moduleEClass = createEClass(MODULE);

    baseModuleEClass = createEClass(BASE_MODULE);

    baseDeclarationsEClass = createEClass(BASE_DECLARATIONS);
    createEReference(baseDeclarationsEClass, BASE_DECLARATIONS__BASE_DECLARATION);

    baseDeclarationEClass = createEClass(BASE_DECLARATION);

    inputDeclEClass = createEClass(INPUT_DECL);
    createEReference(inputDeclEClass, INPUT_DECL__VAR_DECLS);

    outputDeclEClass = createEClass(OUTPUT_DECL);
    createEReference(outputDeclEClass, OUTPUT_DECL__VAR_DECLS);

    localDeclEClass = createEClass(LOCAL_DECL);
    createEReference(localDeclEClass, LOCAL_DECL__VAR_DECLS);

    defDeclEClass = createEClass(DEF_DECL);
    createEReference(defDeclEClass, DEF_DECL__DEFINITIONS);

    initDeclEClass = createEClass(INIT_DECL);
    createEReference(initDeclEClass, INIT_DECL__DEFINITION_OR_COMMAND);

    transDeclEClass = createEClass(TRANS_DECL);
    createEReference(transDeclEClass, TRANS_DECL__DEFINITION_OR_COMMAND);

    varDeclsEClass = createEClass(VAR_DECLS);
    createEReference(varDeclsEClass, VAR_DECLS__VAR_DECL);

    varDeclEClass = createEClass(VAR_DECL);
    createEAttribute(varDeclEClass, VAR_DECL__VAR);
    createEReference(varDeclEClass, VAR_DECL__TYPE);

    definitionsEClass = createEClass(DEFINITIONS);
    createEReference(definitionsEClass, DEFINITIONS__DEFINITION);

    definitionOrCommandEClass = createEClass(DEFINITION_OR_COMMAND);

    definitionEClass = createEClass(DEFINITION);

    simpleDefinitionEClass = createEClass(SIMPLE_DEFINITION);
    createEReference(simpleDefinitionEClass, SIMPLE_DEFINITION__LHS);
    createEReference(simpleDefinitionEClass, SIMPLE_DEFINITION__RHS_DEFINITION);

    lhsEClass = createEClass(LHS);
    createEAttribute(lhsEClass, LHS__IDENTIFIER);

    rhsDefinitionEClass = createEClass(RHS_DEFINITION);

    rhsExpressionEClass = createEClass(RHS_EXPRESSION);
    createEReference(rhsExpressionEClass, RHS_EXPRESSION__EXPRESSION);

    someCommandsEClass = createEClass(SOME_COMMANDS);
    createEReference(someCommandsEClass, SOME_COMMANDS__FIRST_SOME_COMMAND);
    createEReference(someCommandsEClass, SOME_COMMANDS__NEXT_SOME_COMMAND);
    createEReference(someCommandsEClass, SOME_COMMANDS__ELSE_COMMAND);

    someCommandEClass = createEClass(SOME_COMMAND);

    namedCommandEClass = createEClass(NAMED_COMMAND);
    createEAttribute(namedCommandEClass, NAMED_COMMAND__IDENTIFIER);
    createEReference(namedCommandEClass, NAMED_COMMAND__GUARDED_COMMAND);

    guardedCommandEClass = createEClass(GUARDED_COMMAND);
    createEReference(guardedCommandEClass, GUARDED_COMMAND__GUARD);
    createEReference(guardedCommandEClass, GUARDED_COMMAND__ASSIGNMENT);

    guardEClass = createEClass(GUARD);

    assignmentsEClass = createEClass(ASSIGNMENTS);
    createEReference(assignmentsEClass, ASSIGNMENTS__FIRST_SIMPLE_DEFINITION);
    createEReference(assignmentsEClass, ASSIGNMENTS__NEXT_SIMPLE_DEFINITION);

    elseCommandEClass = createEClass(ELSE_COMMAND);
    createEAttribute(elseCommandEClass, ELSE_COMMAND__IDENTIFIER);
    createEReference(elseCommandEClass, ELSE_COMMAND__ASSIGNMENTS);

    expressionEClass = createEClass(EXPRESSION);

    bracketedExpressionEClass = createEClass(BRACKETED_EXPRESSION);
    createEReference(bracketedExpressionEClass, BRACKETED_EXPRESSION__EXPRESSION);

    outerInfixApplicationEClass = createEClass(OUTER_INFIX_APPLICATION);
    createEReference(outerInfixApplicationEClass, OUTER_INFIX_APPLICATION__FIRST_EXPRESSION);
    createEReference(outerInfixApplicationEClass, OUTER_INFIX_APPLICATION__NEXT_EXPRESSION);

    nameExprEClass = createEClass(NAME_EXPR);

    nextVariableEClass = createEClass(NEXT_VARIABLE);
    createEAttribute(nextVariableEClass, NEXT_VARIABLE__IDENTIFIER);

    applicationEClass = createEClass(APPLICATION);
    createEReference(applicationEClass, APPLICATION__FUNCTION);
    createEReference(applicationEClass, APPLICATION__ARGUMENT);

    functionEClass = createEClass(FUNCTION);
    createEReference(functionEClass, FUNCTION__EXPRESSION);

    argumentEClass = createEClass(ARGUMENT);
    createEReference(argumentEClass, ARGUMENT__FIRST_EXPRESSION);
    createEReference(argumentEClass, ARGUMENT__NEXT_EXPRESSION);

    infixApplicationEClass = createEClass(INFIX_APPLICATION);
    createEReference(infixApplicationEClass, INFIX_APPLICATION__FIRST_EXPRESSION);
    createEReference(infixApplicationEClass, INFIX_APPLICATION__SECOND_EXPRESSION);

    nameEClass = createEClass(NAME);
    createEAttribute(nameEClass, NAME__IDENTIFIER);

    numeralEClass = createEClass(NUMERAL);
    createEAttribute(numeralEClass, NUMERAL__NUMBER);
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
    typeDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    typeEClass.getESuperTypes().add(this.getTypeDef());
    typeEClass.getESuperTypes().add(this.getActualParameters());
    basicTypeEClass.getESuperTypes().add(this.getType());
    qualifiedNameEClass.getESuperTypes().add(this.getType());
    subrangeEClass.getESuperTypes().add(this.getType());
    scalarTypeEClass.getESuperTypes().add(this.getTypeDef());
    moduleDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    baseModuleEClass.getESuperTypes().add(this.getModule());
    baseDeclarationsEClass.getESuperTypes().add(this.getBaseModule());
    inputDeclEClass.getESuperTypes().add(this.getBaseDeclaration());
    outputDeclEClass.getESuperTypes().add(this.getBaseDeclaration());
    localDeclEClass.getESuperTypes().add(this.getBaseDeclaration());
    defDeclEClass.getESuperTypes().add(this.getBaseDeclaration());
    initDeclEClass.getESuperTypes().add(this.getBaseDeclaration());
    transDeclEClass.getESuperTypes().add(this.getBaseDeclaration());
    definitionEClass.getESuperTypes().add(this.getDefinitionOrCommand());
    simpleDefinitionEClass.getESuperTypes().add(this.getDefinition());
    rhsExpressionEClass.getESuperTypes().add(this.getRhsDefinition());
    someCommandsEClass.getESuperTypes().add(this.getDefinitionOrCommand());
    namedCommandEClass.getESuperTypes().add(this.getSomeCommand());
    expressionEClass.getESuperTypes().add(this.getBound());
    expressionEClass.getESuperTypes().add(this.getGuard());
    bracketedExpressionEClass.getESuperTypes().add(this.getExpression());
    outerInfixApplicationEClass.getESuperTypes().add(this.getExpression());
    nameExprEClass.getESuperTypes().add(this.getExpression());
    nextVariableEClass.getESuperTypes().add(this.getExpression());
    nameEClass.getESuperTypes().add(this.getType());
    nameEClass.getESuperTypes().add(this.getNameExpr());
    numeralEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContext_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContext_ContextBody(), this.getContextBody(), null, "contextBody", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextBodyEClass, ContextBody.class, "ContextBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextBody_Declarations(), this.getDeclarations(), null, "declarations", null, 0, 1, ContextBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationsEClass, Declarations.class, "Declarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarations_Declaration(), this.getDeclaration(), null, "declaration", null, 0, -1, Declarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclaration_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDeclaration_TypeDef(), this.getTypeDef(), null, "typeDef", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicType_Type(), ecorePackage.getEString(), "type", null, 0, 1, BasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedNameEClass, QualifiedName.class, "QualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedName_Identifier1(), ecorePackage.getEString(), "identifier1", null, 0, 1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualifiedName_ActualParameters(), this.getActualParameters(), null, "actualParameters", null, 0, 1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQualifiedName_Identifier2(), ecorePackage.getEString(), "identifier2", null, 0, 1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actualParametersEClass, ActualParameters.class, "ActualParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subrangeEClass, Subrange.class, "Subrange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubrange_LowerBound(), this.getBound(), null, "lowerBound", null, 0, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubrange_UpperBound(), this.getBound(), null, "upperBound", null, 0, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boundEClass, Bound.class, "Bound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scalarTypeEClass, ScalarType.class, "ScalarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScalarType_NextType(), ecorePackage.getEString(), "nextType", null, 0, -1, ScalarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleDeclarationEClass, ModuleDeclaration.class, "ModuleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleDeclaration_Module(), this.getModule(), null, "module", null, 0, 1, ModuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(baseModuleEClass, BaseModule.class, "BaseModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(baseDeclarationsEClass, BaseDeclarations.class, "BaseDeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBaseDeclarations_BaseDeclaration(), this.getBaseDeclaration(), null, "baseDeclaration", null, 0, -1, BaseDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseDeclarationEClass, BaseDeclaration.class, "BaseDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputDeclEClass, InputDecl.class, "InputDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputDecl_VarDecls(), this.getVarDecls(), null, "varDecls", null, 0, 1, InputDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputDeclEClass, OutputDecl.class, "OutputDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputDecl_VarDecls(), this.getVarDecls(), null, "varDecls", null, 0, 1, OutputDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localDeclEClass, LocalDecl.class, "LocalDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalDecl_VarDecls(), this.getVarDecls(), null, "varDecls", null, 0, 1, LocalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defDeclEClass, DefDecl.class, "DefDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefDecl_Definitions(), this.getDefinitions(), null, "definitions", null, 0, 1, DefDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initDeclEClass, InitDecl.class, "InitDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitDecl_DefinitionOrCommand(), this.getDefinitionOrCommand(), null, "definitionOrCommand", null, 0, -1, InitDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transDeclEClass, TransDecl.class, "TransDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransDecl_DefinitionOrCommand(), this.getDefinitionOrCommand(), null, "definitionOrCommand", null, 0, -1, TransDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varDeclsEClass, VarDecls.class, "VarDecls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarDecls_VarDecl(), this.getVarDecl(), null, "varDecl", null, 0, -1, VarDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varDeclEClass, VarDecl.class, "VarDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVarDecl_Var(), ecorePackage.getEString(), "var", null, 0, -1, VarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVarDecl_Type(), this.getType(), null, "type", null, 0, 1, VarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionsEClass, Definitions.class, "Definitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinitions_Definition(), this.getDefinition(), null, "definition", null, 0, -1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionOrCommandEClass, DefinitionOrCommand.class, "DefinitionOrCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleDefinitionEClass, SimpleDefinition.class, "SimpleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleDefinition_Lhs(), this.getLhs(), null, "lhs", null, 0, 1, SimpleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleDefinition_RhsDefinition(), this.getRhsDefinition(), null, "RhsDefinition", null, 0, 1, SimpleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lhsEClass, Lhs.class, "Lhs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLhs_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Lhs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rhsDefinitionEClass, RhsDefinition.class, "RhsDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rhsExpressionEClass, RhsExpression.class, "RhsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRhsExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, RhsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(someCommandsEClass, SomeCommands.class, "SomeCommands", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSomeCommands_FirstSomeCommand(), this.getSomeCommand(), null, "firstSomeCommand", null, 0, 1, SomeCommands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSomeCommands_NextSomeCommand(), this.getSomeCommand(), null, "nextSomeCommand", null, 0, -1, SomeCommands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSomeCommands_ElseCommand(), this.getElseCommand(), null, "elseCommand", null, 0, 1, SomeCommands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(someCommandEClass, SomeCommand.class, "SomeCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedCommandEClass, NamedCommand.class, "NamedCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedCommand_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, NamedCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamedCommand_GuardedCommand(), this.getGuardedCommand(), null, "guardedCommand", null, 0, 1, NamedCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guardedCommandEClass, GuardedCommand.class, "GuardedCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGuardedCommand_Guard(), this.getGuard(), null, "guard", null, 0, 1, GuardedCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGuardedCommand_Assignment(), this.getAssignments(), null, "assignment", null, 0, 1, GuardedCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignmentsEClass, Assignments.class, "Assignments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignments_FirstSimpleDefinition(), this.getSimpleDefinition(), null, "firstSimpleDefinition", null, 0, 1, Assignments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignments_NextSimpleDefinition(), this.getSimpleDefinition(), null, "nextSimpleDefinition", null, 0, -1, Assignments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elseCommandEClass, ElseCommand.class, "ElseCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElseCommand_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ElseCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElseCommand_Assignments(), this.getAssignments(), null, "assignments", null, 0, 1, ElseCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bracketedExpressionEClass, BracketedExpression.class, "BracketedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBracketedExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, BracketedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outerInfixApplicationEClass, OuterInfixApplication.class, "OuterInfixApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOuterInfixApplication_FirstExpression(), ecorePackage.getEObject(), null, "firstExpression", null, 0, 1, OuterInfixApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOuterInfixApplication_NextExpression(), ecorePackage.getEObject(), null, "nextExpression", null, 0, -1, OuterInfixApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameExprEClass, NameExpr.class, "NameExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nextVariableEClass, NextVariable.class, "NextVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNextVariable_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, NextVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplication_Function(), this.getFunction(), null, "function", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Argument(), this.getArgument(), null, "argument", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunction_Expression(), this.getNameExpr(), null, "expression", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgument_FirstExpression(), this.getExpression(), null, "firstExpression", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgument_NextExpression(), this.getExpression(), null, "nextExpression", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infixApplicationEClass, InfixApplication.class, "InfixApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInfixApplication_FirstExpression(), this.getNameExpr(), null, "firstExpression", null, 0, 1, InfixApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfixApplication_SecondExpression(), this.getExpression(), null, "secondExpression", null, 0, 1, InfixApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getName_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numeralEClass, Numeral.class, "Numeral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumeral_Number(), ecorePackage.getEString(), "number", null, 0, 1, Numeral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SalPackageImpl
