/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalPackage
 * @generated
 */
public interface SalFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SalFactory eINSTANCE = org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context</em>'.
   * @generated
   */
  Context createContext();

  /**
   * Returns a new object of class '<em>Context Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Body</em>'.
   * @generated
   */
  ContextBody createContextBody();

  /**
   * Returns a new object of class '<em>Declarations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declarations</em>'.
   * @generated
   */
  Declarations createDeclarations();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Declaration</em>'.
   * @generated
   */
  TypeDeclaration createTypeDeclaration();

  /**
   * Returns a new object of class '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Def</em>'.
   * @generated
   */
  TypeDef createTypeDef();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Type</em>'.
   * @generated
   */
  BasicType createBasicType();

  /**
   * Returns a new object of class '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name</em>'.
   * @generated
   */
  QualifiedName createQualifiedName();

  /**
   * Returns a new object of class '<em>Actual Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actual Parameters</em>'.
   * @generated
   */
  ActualParameters createActualParameters();

  /**
   * Returns a new object of class '<em>Subrange</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subrange</em>'.
   * @generated
   */
  Subrange createSubrange();

  /**
   * Returns a new object of class '<em>Bound</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bound</em>'.
   * @generated
   */
  Bound createBound();

  /**
   * Returns a new object of class '<em>Scalar Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scalar Type</em>'.
   * @generated
   */
  ScalarType createScalarType();

  /**
   * Returns a new object of class '<em>Module Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Declaration</em>'.
   * @generated
   */
  ModuleDeclaration createModuleDeclaration();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Base Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Module</em>'.
   * @generated
   */
  BaseModule createBaseModule();

  /**
   * Returns a new object of class '<em>Base Declarations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Declarations</em>'.
   * @generated
   */
  BaseDeclarations createBaseDeclarations();

  /**
   * Returns a new object of class '<em>Base Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Declaration</em>'.
   * @generated
   */
  BaseDeclaration createBaseDeclaration();

  /**
   * Returns a new object of class '<em>Input Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Decl</em>'.
   * @generated
   */
  InputDecl createInputDecl();

  /**
   * Returns a new object of class '<em>Output Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Decl</em>'.
   * @generated
   */
  OutputDecl createOutputDecl();

  /**
   * Returns a new object of class '<em>Local Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Decl</em>'.
   * @generated
   */
  LocalDecl createLocalDecl();

  /**
   * Returns a new object of class '<em>Def Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Decl</em>'.
   * @generated
   */
  DefDecl createDefDecl();

  /**
   * Returns a new object of class '<em>Init Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Decl</em>'.
   * @generated
   */
  InitDecl createInitDecl();

  /**
   * Returns a new object of class '<em>Trans Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trans Decl</em>'.
   * @generated
   */
  TransDecl createTransDecl();

  /**
   * Returns a new object of class '<em>Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decls</em>'.
   * @generated
   */
  VarDecls createVarDecls();

  /**
   * Returns a new object of class '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decl</em>'.
   * @generated
   */
  VarDecl createVarDecl();

  /**
   * Returns a new object of class '<em>Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definitions</em>'.
   * @generated
   */
  Definitions createDefinitions();

  /**
   * Returns a new object of class '<em>Definition Or Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition Or Command</em>'.
   * @generated
   */
  DefinitionOrCommand createDefinitionOrCommand();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Simple Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Definition</em>'.
   * @generated
   */
  SimpleDefinition createSimpleDefinition();

  /**
   * Returns a new object of class '<em>Lhs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lhs</em>'.
   * @generated
   */
  Lhs createLhs();

  /**
   * Returns a new object of class '<em>Rhs Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rhs Definition</em>'.
   * @generated
   */
  RhsDefinition createRhsDefinition();

  /**
   * Returns a new object of class '<em>Rhs Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rhs Expression</em>'.
   * @generated
   */
  RhsExpression createRhsExpression();

  /**
   * Returns a new object of class '<em>Some Commands</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Commands</em>'.
   * @generated
   */
  SomeCommands createSomeCommands();

  /**
   * Returns a new object of class '<em>Some Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Command</em>'.
   * @generated
   */
  SomeCommand createSomeCommand();

  /**
   * Returns a new object of class '<em>Named Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Command</em>'.
   * @generated
   */
  NamedCommand createNamedCommand();

  /**
   * Returns a new object of class '<em>Guarded Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guarded Command</em>'.
   * @generated
   */
  GuardedCommand createGuardedCommand();

  /**
   * Returns a new object of class '<em>Guard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guard</em>'.
   * @generated
   */
  Guard createGuard();

  /**
   * Returns a new object of class '<em>Assignments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignments</em>'.
   * @generated
   */
  Assignments createAssignments();

  /**
   * Returns a new object of class '<em>Else Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else Command</em>'.
   * @generated
   */
  ElseCommand createElseCommand();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Bracketed Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bracketed Expression</em>'.
   * @generated
   */
  BracketedExpression createBracketedExpression();

  /**
   * Returns a new object of class '<em>Outer Infix Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Outer Infix Application</em>'.
   * @generated
   */
  OuterInfixApplication createOuterInfixApplication();

  /**
   * Returns a new object of class '<em>Name Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Expr</em>'.
   * @generated
   */
  NameExpr createNameExpr();

  /**
   * Returns a new object of class '<em>Next Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Next Variable</em>'.
   * @generated
   */
  NextVariable createNextVariable();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Infix Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Infix Application</em>'.
   * @generated
   */
  InfixApplication createInfixApplication();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns a new object of class '<em>Numeral</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeral</em>'.
   * @generated
   */
  Numeral createNumeral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SalPackage getSalPackage();

} //SalFactory
