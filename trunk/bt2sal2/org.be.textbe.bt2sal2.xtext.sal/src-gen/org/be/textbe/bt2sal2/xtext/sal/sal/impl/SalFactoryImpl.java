/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal.impl;

import org.be.textbe.bt2sal2.xtext.sal.sal.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SalFactoryImpl extends EFactoryImpl implements SalFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SalFactory init()
  {
    try
    {
      SalFactory theSalFactory = (SalFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.be.org/textbe/bt2sal2/xtext/sal/Sal"); 
      if (theSalFactory != null)
      {
        return theSalFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SalFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SalPackage.CONTEXT: return createContext();
      case SalPackage.CONTEXT_BODY: return createContextBody();
      case SalPackage.DECLARATIONS: return createDeclarations();
      case SalPackage.DECLARATION: return createDeclaration();
      case SalPackage.TYPE_DECLARATION: return createTypeDeclaration();
      case SalPackage.TYPE_DEF: return createTypeDef();
      case SalPackage.TYPE: return createType();
      case SalPackage.BASIC_TYPE: return createBasicType();
      case SalPackage.QUALIFIED_NAME: return createQualifiedName();
      case SalPackage.ACTUAL_PARAMETERS: return createActualParameters();
      case SalPackage.SUBRANGE: return createSubrange();
      case SalPackage.BOUND: return createBound();
      case SalPackage.SCALAR_TYPE: return createScalarType();
      case SalPackage.MODULE_DECLARATION: return createModuleDeclaration();
      case SalPackage.MODULE: return createModule();
      case SalPackage.BASE_MODULE: return createBaseModule();
      case SalPackage.BASE_DECLARATIONS: return createBaseDeclarations();
      case SalPackage.BASE_DECLARATION: return createBaseDeclaration();
      case SalPackage.INPUT_DECL: return createInputDecl();
      case SalPackage.OUTPUT_DECL: return createOutputDecl();
      case SalPackage.LOCAL_DECL: return createLocalDecl();
      case SalPackage.DEF_DECL: return createDefDecl();
      case SalPackage.INIT_DECL: return createInitDecl();
      case SalPackage.TRANS_DECL: return createTransDecl();
      case SalPackage.VAR_DECLS: return createVarDecls();
      case SalPackage.VAR_DECL: return createVarDecl();
      case SalPackage.DEFINITIONS: return createDefinitions();
      case SalPackage.DEFINITION_OR_COMMAND: return createDefinitionOrCommand();
      case SalPackage.DEFINITION: return createDefinition();
      case SalPackage.SIMPLE_DEFINITION: return createSimpleDefinition();
      case SalPackage.LHS: return createLhs();
      case SalPackage.RHS_DEFINITION: return createRhsDefinition();
      case SalPackage.RHS_EXPRESSION: return createRhsExpression();
      case SalPackage.SOME_COMMANDS: return createSomeCommands();
      case SalPackage.SOME_COMMAND: return createSomeCommand();
      case SalPackage.NAMED_COMMAND: return createNamedCommand();
      case SalPackage.GUARDED_COMMAND: return createGuardedCommand();
      case SalPackage.GUARD: return createGuard();
      case SalPackage.ASSIGNMENTS: return createAssignments();
      case SalPackage.ELSE_COMMAND: return createElseCommand();
      case SalPackage.EXPRESSION: return createExpression();
      case SalPackage.BRACKETED_EXPRESSION: return createBracketedExpression();
      case SalPackage.OUTER_INFIX_APPLICATION: return createOuterInfixApplication();
      case SalPackage.NAME_EXPR: return createNameExpr();
      case SalPackage.NEXT_VARIABLE: return createNextVariable();
      case SalPackage.APPLICATION: return createApplication();
      case SalPackage.FUNCTION: return createFunction();
      case SalPackage.ARGUMENT: return createArgument();
      case SalPackage.INFIX_APPLICATION: return createInfixApplication();
      case SalPackage.NAME: return createName();
      case SalPackage.NUMERAL: return createNumeral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextBody createContextBody()
  {
    ContextBodyImpl contextBody = new ContextBodyImpl();
    return contextBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarations createDeclarations()
  {
    DeclarationsImpl declarations = new DeclarationsImpl();
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDeclaration createTypeDeclaration()
  {
    TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualParameters createActualParameters()
  {
    ActualParametersImpl actualParameters = new ActualParametersImpl();
    return actualParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subrange createSubrange()
  {
    SubrangeImpl subrange = new SubrangeImpl();
    return subrange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bound createBound()
  {
    BoundImpl bound = new BoundImpl();
    return bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarType createScalarType()
  {
    ScalarTypeImpl scalarType = new ScalarTypeImpl();
    return scalarType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleDeclaration createModuleDeclaration()
  {
    ModuleDeclarationImpl moduleDeclaration = new ModuleDeclarationImpl();
    return moduleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseModule createBaseModule()
  {
    BaseModuleImpl baseModule = new BaseModuleImpl();
    return baseModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseDeclarations createBaseDeclarations()
  {
    BaseDeclarationsImpl baseDeclarations = new BaseDeclarationsImpl();
    return baseDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseDeclaration createBaseDeclaration()
  {
    BaseDeclarationImpl baseDeclaration = new BaseDeclarationImpl();
    return baseDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputDecl createInputDecl()
  {
    InputDeclImpl inputDecl = new InputDeclImpl();
    return inputDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputDecl createOutputDecl()
  {
    OutputDeclImpl outputDecl = new OutputDeclImpl();
    return outputDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalDecl createLocalDecl()
  {
    LocalDeclImpl localDecl = new LocalDeclImpl();
    return localDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefDecl createDefDecl()
  {
    DefDeclImpl defDecl = new DefDeclImpl();
    return defDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitDecl createInitDecl()
  {
    InitDeclImpl initDecl = new InitDeclImpl();
    return initDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransDecl createTransDecl()
  {
    TransDeclImpl transDecl = new TransDeclImpl();
    return transDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecls createVarDecls()
  {
    VarDeclsImpl varDecls = new VarDeclsImpl();
    return varDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definitions createDefinitions()
  {
    DefinitionsImpl definitions = new DefinitionsImpl();
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionOrCommand createDefinitionOrCommand()
  {
    DefinitionOrCommandImpl definitionOrCommand = new DefinitionOrCommandImpl();
    return definitionOrCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleDefinition createSimpleDefinition()
  {
    SimpleDefinitionImpl simpleDefinition = new SimpleDefinitionImpl();
    return simpleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lhs createLhs()
  {
    LhsImpl lhs = new LhsImpl();
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RhsDefinition createRhsDefinition()
  {
    RhsDefinitionImpl rhsDefinition = new RhsDefinitionImpl();
    return rhsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RhsExpression createRhsExpression()
  {
    RhsExpressionImpl rhsExpression = new RhsExpressionImpl();
    return rhsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeCommands createSomeCommands()
  {
    SomeCommandsImpl someCommands = new SomeCommandsImpl();
    return someCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeCommand createSomeCommand()
  {
    SomeCommandImpl someCommand = new SomeCommandImpl();
    return someCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedCommand createNamedCommand()
  {
    NamedCommandImpl namedCommand = new NamedCommandImpl();
    return namedCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardedCommand createGuardedCommand()
  {
    GuardedCommandImpl guardedCommand = new GuardedCommandImpl();
    return guardedCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard createGuard()
  {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignments createAssignments()
  {
    AssignmentsImpl assignments = new AssignmentsImpl();
    return assignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseCommand createElseCommand()
  {
    ElseCommandImpl elseCommand = new ElseCommandImpl();
    return elseCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BracketedExpression createBracketedExpression()
  {
    BracketedExpressionImpl bracketedExpression = new BracketedExpressionImpl();
    return bracketedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OuterInfixApplication createOuterInfixApplication()
  {
    OuterInfixApplicationImpl outerInfixApplication = new OuterInfixApplicationImpl();
    return outerInfixApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExpr createNameExpr()
  {
    NameExprImpl nameExpr = new NameExprImpl();
    return nameExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NextVariable createNextVariable()
  {
    NextVariableImpl nextVariable = new NextVariableImpl();
    return nextVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfixApplication createInfixApplication()
  {
    InfixApplicationImpl infixApplication = new InfixApplicationImpl();
    return infixApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Numeral createNumeral()
  {
    NumeralImpl numeral = new NumeralImpl();
    return numeral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalPackage getSalPackage()
  {
    return (SalPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SalPackage getPackage()
  {
    return SalPackage.eINSTANCE;
  }

} //SalFactoryImpl
