/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.util;

import org.be.textbe.bt2sal2.xtext.sal.sal.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage
 * @generated
 */
public class SalSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SalPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SalPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SalPackage.CONTEXT:
      {
        Context context = (Context)theEObject;
        T result = caseContext(context);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.CONTEXT_BODY:
      {
        ContextBody contextBody = (ContextBody)theEObject;
        T result = caseContextBody(contextBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.DECLARATIONS:
      {
        Declarations declarations = (Declarations)theEObject;
        T result = caseDeclarations(declarations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.TYPE_DECLARATION:
      {
        TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
        T result = caseTypeDeclaration(typeDeclaration);
        if (result == null) result = caseDeclaration(typeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.TYPE_DEF:
      {
        TypeDef typeDef = (TypeDef)theEObject;
        T result = caseTypeDef(typeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseTypeDef(type);
        if (result == null) result = caseActualParameters(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.BASIC_TYPE:
      {
        BasicType basicType = (BasicType)theEObject;
        T result = caseBasicType(basicType);
        if (result == null) result = caseType(basicType);
        if (result == null) result = caseTypeDef(basicType);
        if (result == null) result = caseActualParameters(basicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.QUALIFIED_NAME:
      {
        QualifiedName qualifiedName = (QualifiedName)theEObject;
        T result = caseQualifiedName(qualifiedName);
        if (result == null) result = caseType(qualifiedName);
        if (result == null) result = caseTypeDef(qualifiedName);
        if (result == null) result = caseActualParameters(qualifiedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.ACTUAL_PARAMETERS:
      {
        ActualParameters actualParameters = (ActualParameters)theEObject;
        T result = caseActualParameters(actualParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.SUBRANGE:
      {
        Subrange subrange = (Subrange)theEObject;
        T result = caseSubrange(subrange);
        if (result == null) result = caseType(subrange);
        if (result == null) result = caseTypeDef(subrange);
        if (result == null) result = caseActualParameters(subrange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.BOUND:
      {
        Bound bound = (Bound)theEObject;
        T result = caseBound(bound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.SCALAR_TYPE:
      {
        ScalarType scalarType = (ScalarType)theEObject;
        T result = caseScalarType(scalarType);
        if (result == null) result = caseTypeDef(scalarType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.MODULE_DECLARATION:
      {
        ModuleDeclaration moduleDeclaration = (ModuleDeclaration)theEObject;
        T result = caseModuleDeclaration(moduleDeclaration);
        if (result == null) result = caseDeclaration(moduleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.BASE_MODULE:
      {
        BaseModule baseModule = (BaseModule)theEObject;
        T result = caseBaseModule(baseModule);
        if (result == null) result = caseModule(baseModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.BASE_DECLARATIONS:
      {
        BaseDeclarations baseDeclarations = (BaseDeclarations)theEObject;
        T result = caseBaseDeclarations(baseDeclarations);
        if (result == null) result = caseBaseModule(baseDeclarations);
        if (result == null) result = caseModule(baseDeclarations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.BASE_DECLARATION:
      {
        BaseDeclaration baseDeclaration = (BaseDeclaration)theEObject;
        T result = caseBaseDeclaration(baseDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.INPUT_DECL:
      {
        InputDecl inputDecl = (InputDecl)theEObject;
        T result = caseInputDecl(inputDecl);
        if (result == null) result = caseBaseDeclaration(inputDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.OUTPUT_DECL:
      {
        OutputDecl outputDecl = (OutputDecl)theEObject;
        T result = caseOutputDecl(outputDecl);
        if (result == null) result = caseBaseDeclaration(outputDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.LOCAL_DECL:
      {
        LocalDecl localDecl = (LocalDecl)theEObject;
        T result = caseLocalDecl(localDecl);
        if (result == null) result = caseBaseDeclaration(localDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.DEF_DECL:
      {
        DefDecl defDecl = (DefDecl)theEObject;
        T result = caseDefDecl(defDecl);
        if (result == null) result = caseBaseDeclaration(defDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.INIT_DECL:
      {
        InitDecl initDecl = (InitDecl)theEObject;
        T result = caseInitDecl(initDecl);
        if (result == null) result = caseBaseDeclaration(initDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.TRANS_DECL:
      {
        TransDecl transDecl = (TransDecl)theEObject;
        T result = caseTransDecl(transDecl);
        if (result == null) result = caseBaseDeclaration(transDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.VAR_DECLS:
      {
        VarDecls varDecls = (VarDecls)theEObject;
        T result = caseVarDecls(varDecls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.VAR_DECL:
      {
        VarDecl varDecl = (VarDecl)theEObject;
        T result = caseVarDecl(varDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.DEFINITIONS:
      {
        Definitions definitions = (Definitions)theEObject;
        T result = caseDefinitions(definitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.DEFINITION_OR_COMMAND:
      {
        DefinitionOrCommand definitionOrCommand = (DefinitionOrCommand)theEObject;
        T result = caseDefinitionOrCommand(definitionOrCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = caseDefinitionOrCommand(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.SIMPLE_DEFINITION:
      {
        SimpleDefinition simpleDefinition = (SimpleDefinition)theEObject;
        T result = caseSimpleDefinition(simpleDefinition);
        if (result == null) result = caseDefinition(simpleDefinition);
        if (result == null) result = caseDefinitionOrCommand(simpleDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.LHS:
      {
        Lhs lhs = (Lhs)theEObject;
        T result = caseLhs(lhs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.RHS_DEFINITION:
      {
        RhsDefinition rhsDefinition = (RhsDefinition)theEObject;
        T result = caseRhsDefinition(rhsDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.RHS_EXPRESSION:
      {
        RhsExpression rhsExpression = (RhsExpression)theEObject;
        T result = caseRhsExpression(rhsExpression);
        if (result == null) result = caseRhsDefinition(rhsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.SOME_COMMANDS:
      {
        SomeCommands someCommands = (SomeCommands)theEObject;
        T result = caseSomeCommands(someCommands);
        if (result == null) result = caseDefinitionOrCommand(someCommands);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.SOME_COMMAND:
      {
        SomeCommand someCommand = (SomeCommand)theEObject;
        T result = caseSomeCommand(someCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.NAMED_COMMAND:
      {
        NamedCommand namedCommand = (NamedCommand)theEObject;
        T result = caseNamedCommand(namedCommand);
        if (result == null) result = caseSomeCommand(namedCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.GUARDED_COMMAND:
      {
        GuardedCommand guardedCommand = (GuardedCommand)theEObject;
        T result = caseGuardedCommand(guardedCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.GUARD:
      {
        Guard guard = (Guard)theEObject;
        T result = caseGuard(guard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.ASSIGNMENTS:
      {
        Assignments assignments = (Assignments)theEObject;
        T result = caseAssignments(assignments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.ELSE_COMMAND:
      {
        ElseCommand elseCommand = (ElseCommand)theEObject;
        T result = caseElseCommand(elseCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseBound(expression);
        if (result == null) result = caseGuard(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.BRACKETED_EXPRESSION:
      {
        BracketedExpression bracketedExpression = (BracketedExpression)theEObject;
        T result = caseBracketedExpression(bracketedExpression);
        if (result == null) result = caseExpression(bracketedExpression);
        if (result == null) result = caseBound(bracketedExpression);
        if (result == null) result = caseGuard(bracketedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.OUTER_INFIX_APPLICATION:
      {
        OuterInfixApplication outerInfixApplication = (OuterInfixApplication)theEObject;
        T result = caseOuterInfixApplication(outerInfixApplication);
        if (result == null) result = caseExpression(outerInfixApplication);
        if (result == null) result = caseBound(outerInfixApplication);
        if (result == null) result = caseGuard(outerInfixApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.NAME_EXPR:
      {
        NameExpr nameExpr = (NameExpr)theEObject;
        T result = caseNameExpr(nameExpr);
        if (result == null) result = caseExpression(nameExpr);
        if (result == null) result = caseBound(nameExpr);
        if (result == null) result = caseGuard(nameExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.NEXT_VARIABLE:
      {
        NextVariable nextVariable = (NextVariable)theEObject;
        T result = caseNextVariable(nextVariable);
        if (result == null) result = caseExpression(nextVariable);
        if (result == null) result = caseBound(nextVariable);
        if (result == null) result = caseGuard(nextVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.INFIX_APPLICATION:
      {
        InfixApplication infixApplication = (InfixApplication)theEObject;
        T result = caseInfixApplication(infixApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = caseType(name);
        if (result == null) result = caseNameExpr(name);
        if (result == null) result = caseTypeDef(name);
        if (result == null) result = caseActualParameters(name);
        if (result == null) result = caseExpression(name);
        if (result == null) result = caseBound(name);
        if (result == null) result = caseGuard(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SalPackage.NUMERAL:
      {
        Numeral numeral = (Numeral)theEObject;
        T result = caseNumeral(numeral);
        if (result == null) result = caseExpression(numeral);
        if (result == null) result = caseBound(numeral);
        if (result == null) result = caseGuard(numeral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContext(Context object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextBody(ContextBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarations(Declarations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDeclaration(TypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDef(TypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicType(BasicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedName(QualifiedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualParameters(ActualParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subrange</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subrange</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubrange(Subrange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBound(Bound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scalar Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scalar Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScalarType(ScalarType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleDeclaration(ModuleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseModule(BaseModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Declarations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Declarations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseDeclarations(BaseDeclarations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseDeclaration(BaseDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputDecl(InputDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputDecl(OutputDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalDecl(LocalDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefDecl(DefDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitDecl(InitDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trans Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trans Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransDecl(TransDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarDecls(VarDecls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarDecl(VarDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitions(Definitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Or Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Or Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionOrCommand(DefinitionOrCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleDefinition(SimpleDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lhs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lhs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLhs(Lhs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rhs Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rhs Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRhsDefinition(RhsDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rhs Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rhs Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRhsExpression(RhsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Commands</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Commands</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeCommands(SomeCommands object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeCommand(SomeCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedCommand(NamedCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guarded Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guarded Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuardedCommand(GuardedCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuard(Guard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignments(Assignments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElseCommand(ElseCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bracketed Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bracketed Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBracketedExpression(BracketedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outer Infix Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outer Infix Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOuterInfixApplication(OuterInfixApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameExpr(NameExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Next Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Next Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNextVariable(NextVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infix Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infix Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfixApplication(InfixApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeral</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeral</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumeral(Numeral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SalSwitch
