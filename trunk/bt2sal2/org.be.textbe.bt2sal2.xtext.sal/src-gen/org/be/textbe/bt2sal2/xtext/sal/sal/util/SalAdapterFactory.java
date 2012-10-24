/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.util;

import org.be.textbe.bt2sal2.xtext.sal.sal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage
 * @generated
 */
public class SalAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SalPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SalPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalSwitch<Adapter> modelSwitch =
    new SalSwitch<Adapter>()
    {
      @Override
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseContextBody(ContextBody object)
      {
        return createContextBodyAdapter();
      }
      @Override
      public Adapter caseDeclarations(Declarations object)
      {
        return createDeclarationsAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseTypeDeclaration(TypeDeclaration object)
      {
        return createTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseTypeDef(TypeDef object)
      {
        return createTypeDefAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseQualifiedName(QualifiedName object)
      {
        return createQualifiedNameAdapter();
      }
      @Override
      public Adapter caseActualParameters(ActualParameters object)
      {
        return createActualParametersAdapter();
      }
      @Override
      public Adapter caseSubrange(Subrange object)
      {
        return createSubrangeAdapter();
      }
      @Override
      public Adapter caseBound(Bound object)
      {
        return createBoundAdapter();
      }
      @Override
      public Adapter caseScalarType(ScalarType object)
      {
        return createScalarTypeAdapter();
      }
      @Override
      public Adapter caseModuleDeclaration(ModuleDeclaration object)
      {
        return createModuleDeclarationAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseBaseModule(BaseModule object)
      {
        return createBaseModuleAdapter();
      }
      @Override
      public Adapter caseBaseDeclarations(BaseDeclarations object)
      {
        return createBaseDeclarationsAdapter();
      }
      @Override
      public Adapter caseBaseDeclaration(BaseDeclaration object)
      {
        return createBaseDeclarationAdapter();
      }
      @Override
      public Adapter caseInputDecl(InputDecl object)
      {
        return createInputDeclAdapter();
      }
      @Override
      public Adapter caseOutputDecl(OutputDecl object)
      {
        return createOutputDeclAdapter();
      }
      @Override
      public Adapter caseLocalDecl(LocalDecl object)
      {
        return createLocalDeclAdapter();
      }
      @Override
      public Adapter caseDefDecl(DefDecl object)
      {
        return createDefDeclAdapter();
      }
      @Override
      public Adapter caseInitDecl(InitDecl object)
      {
        return createInitDeclAdapter();
      }
      @Override
      public Adapter caseTransDecl(TransDecl object)
      {
        return createTransDeclAdapter();
      }
      @Override
      public Adapter caseVarDecls(VarDecls object)
      {
        return createVarDeclsAdapter();
      }
      @Override
      public Adapter caseVarDecl(VarDecl object)
      {
        return createVarDeclAdapter();
      }
      @Override
      public Adapter caseDefinitions(Definitions object)
      {
        return createDefinitionsAdapter();
      }
      @Override
      public Adapter caseDefinitionOrCommand(DefinitionOrCommand object)
      {
        return createDefinitionOrCommandAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseSimpleDefinition(SimpleDefinition object)
      {
        return createSimpleDefinitionAdapter();
      }
      @Override
      public Adapter caseLhs(Lhs object)
      {
        return createLhsAdapter();
      }
      @Override
      public Adapter caseRhsDefinition(RhsDefinition object)
      {
        return createRhsDefinitionAdapter();
      }
      @Override
      public Adapter caseRhsExpression(RhsExpression object)
      {
        return createRhsExpressionAdapter();
      }
      @Override
      public Adapter caseSomeCommands(SomeCommands object)
      {
        return createSomeCommandsAdapter();
      }
      @Override
      public Adapter caseSomeCommand(SomeCommand object)
      {
        return createSomeCommandAdapter();
      }
      @Override
      public Adapter caseNamedCommand(NamedCommand object)
      {
        return createNamedCommandAdapter();
      }
      @Override
      public Adapter caseGuardedCommand(GuardedCommand object)
      {
        return createGuardedCommandAdapter();
      }
      @Override
      public Adapter caseGuard(Guard object)
      {
        return createGuardAdapter();
      }
      @Override
      public Adapter caseAssignments(Assignments object)
      {
        return createAssignmentsAdapter();
      }
      @Override
      public Adapter caseElseCommand(ElseCommand object)
      {
        return createElseCommandAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseBracketedExpression(BracketedExpression object)
      {
        return createBracketedExpressionAdapter();
      }
      @Override
      public Adapter caseOuterInfixApplication(OuterInfixApplication object)
      {
        return createOuterInfixApplicationAdapter();
      }
      @Override
      public Adapter caseNameExpr(NameExpr object)
      {
        return createNameExprAdapter();
      }
      @Override
      public Adapter caseNextVariable(NextVariable object)
      {
        return createNextVariableAdapter();
      }
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseInfixApplication(InfixApplication object)
      {
        return createInfixApplicationAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter caseNumeral(Numeral object)
      {
        return createNumeralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody <em>Context Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody
   * @generated
   */
  public Adapter createContextBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Declarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Declarations
   * @generated
   */
  public Adapter createDeclarationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration
   * @generated
   */
  public Adapter createTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.TypeDef
   * @generated
   */
  public Adapter createTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName
   * @generated
   */
  public Adapter createQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ActualParameters <em>Actual Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ActualParameters
   * @generated
   */
  public Adapter createActualParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Subrange <em>Subrange</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Subrange
   * @generated
   */
  public Adapter createSubrangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Bound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Bound
   * @generated
   */
  public Adapter createBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType <em>Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType
   * @generated
   */
  public Adapter createScalarTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ModuleDeclaration <em>Module Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ModuleDeclaration
   * @generated
   */
  public Adapter createModuleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BaseModule <em>Base Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BaseModule
   * @generated
   */
  public Adapter createBaseModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations <em>Base Declarations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations
   * @generated
   */
  public Adapter createBaseDeclarationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclaration <em>Base Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclaration
   * @generated
   */
  public Adapter createBaseDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InputDecl <em>Input Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InputDecl
   * @generated
   */
  public Adapter createInputDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.OutputDecl <em>Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.OutputDecl
   * @generated
   */
  public Adapter createOutputDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl <em>Local Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl
   * @generated
   */
  public Adapter createLocalDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl <em>Def Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl
   * @generated
   */
  public Adapter createDefDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl <em>Init Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl
   * @generated
   */
  public Adapter createInitDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl <em>Trans Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl
   * @generated
   */
  public Adapter createTransDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls <em>Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls
   * @generated
   */
  public Adapter createVarDeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl
   * @generated
   */
  public Adapter createVarDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Definitions
   * @generated
   */
  public Adapter createDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.DefinitionOrCommand <em>Definition Or Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.DefinitionOrCommand
   * @generated
   */
  public Adapter createDefinitionOrCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition <em>Simple Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition
   * @generated
   */
  public Adapter createSimpleDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Lhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Lhs
   * @generated
   */
  public Adapter createLhsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.RhsDefinition <em>Rhs Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.RhsDefinition
   * @generated
   */
  public Adapter createRhsDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.RhsExpression <em>Rhs Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.RhsExpression
   * @generated
   */
  public Adapter createRhsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands <em>Some Commands</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands
   * @generated
   */
  public Adapter createSomeCommandsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommand <em>Some Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommand
   * @generated
   */
  public Adapter createSomeCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand <em>Named Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand
   * @generated
   */
  public Adapter createNamedCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand <em>Guarded Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand
   * @generated
   */
  public Adapter createGuardedCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Guard
   * @generated
   */
  public Adapter createGuardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Assignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Assignments
   * @generated
   */
  public Adapter createAssignmentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand <em>Else Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand
   * @generated
   */
  public Adapter createElseCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BracketedExpression <em>Bracketed Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BracketedExpression
   * @generated
   */
  public Adapter createBracketedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication <em>Outer Infix Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication
   * @generated
   */
  public Adapter createOuterInfixApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NameExpr <em>Name Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.NameExpr
   * @generated
   */
  public Adapter createNameExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NextVariable <em>Next Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.NextVariable
   * @generated
   */
  public Adapter createNextVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication <em>Infix Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication
   * @generated
   */
  public Adapter createInfixApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Numeral <em>Numeral</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Numeral
   * @generated
   */
  public Adapter createNumeralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SalAdapterFactory
