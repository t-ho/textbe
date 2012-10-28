/**
 */
package org.be.textbe.bt2sal2.xtext.sal.sal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt2sal2.xtext.sal.sal.SalFactory
 * @model kind="package"
 * @generated
 */
public interface SalPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sal";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.be.org/textbe/bt2sal2/xtext/sal/Sal";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sal";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SalPackage eINSTANCE = org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl.init();

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Context Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__CONTEXT_BODY = 1;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextBodyImpl <em>Context Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextBodyImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getContextBody()
   * @generated
   */
  int CONTEXT_BODY = 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_BODY__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Context Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DeclarationsImpl <em>Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DeclarationsImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDeclarations()
   * @generated
   */
  int DECLARATIONS = 2;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIONS__DECLARATION = 0;

  /**
   * The number of structural features of the '<em>Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DeclarationImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__IDENTIFIER = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeDeclarationImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getTypeDeclaration()
   * @generated
   */
  int TYPE_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__IDENTIFIER = DECLARATION__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Type Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__TYPE_DEF = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeDefImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 5;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getType()
   * @generated
   */
  int TYPE = 6;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BasicTypeImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.QualifiedNameImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getQualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 8;

  /**
   * The feature id for the '<em><b>Identifier1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__IDENTIFIER1 = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actual Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__ACTUAL_PARAMETERS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Identifier2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__IDENTIFIER2 = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ActualParametersImpl <em>Actual Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ActualParametersImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getActualParameters()
   * @generated
   */
  int ACTUAL_PARAMETERS = 9;

  /**
   * The number of structural features of the '<em>Actual Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAMETERS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SubrangeImpl <em>Subrange</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SubrangeImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getSubrange()
   * @generated
   */
  int SUBRANGE = 10;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE__LOWER_BOUND = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE__UPPER_BOUND = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subrange</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BoundImpl <em>Bound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BoundImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBound()
   * @generated
   */
  int BOUND = 11;

  /**
   * The number of structural features of the '<em>Bound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ScalarTypeImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getScalarType()
   * @generated
   */
  int SCALAR_TYPE = 12;

  /**
   * The feature id for the '<em><b>Next Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_TYPE__NEXT_TYPE = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scalar Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_TYPE_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ModuleDeclarationImpl <em>Module Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ModuleDeclarationImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getModuleDeclaration()
   * @generated
   */
  int MODULE_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECLARATION__IDENTIFIER = DECLARATION__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECLARATION__MODULE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Module Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ModuleImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getModule()
   * @generated
   */
  int MODULE = 14;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseModuleImpl <em>Base Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseModuleImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBaseModule()
   * @generated
   */
  int BASE_MODULE = 15;

  /**
   * The number of structural features of the '<em>Base Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseDeclarationsImpl <em>Base Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseDeclarationsImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBaseDeclarations()
   * @generated
   */
  int BASE_DECLARATIONS = 16;

  /**
   * The feature id for the '<em><b>Base Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_DECLARATIONS__BASE_DECLARATION = BASE_MODULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Base Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_DECLARATIONS_FEATURE_COUNT = BASE_MODULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseDeclarationImpl <em>Base Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseDeclarationImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBaseDeclaration()
   * @generated
   */
  int BASE_DECLARATION = 17;

  /**
   * The number of structural features of the '<em>Base Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.InputDeclImpl <em>Input Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.InputDeclImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getInputDecl()
   * @generated
   */
  int INPUT_DECL = 18;

  /**
   * The feature id for the '<em><b>Var Decls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECL__VAR_DECLS = BASE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECL_FEATURE_COUNT = BASE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.OutputDeclImpl <em>Output Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.OutputDeclImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getOutputDecl()
   * @generated
   */
  int OUTPUT_DECL = 19;

  /**
   * The feature id for the '<em><b>Var Decls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECL__VAR_DECLS = BASE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECL_FEATURE_COUNT = BASE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.LocalDeclImpl <em>Local Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.LocalDeclImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getLocalDecl()
   * @generated
   */
  int LOCAL_DECL = 20;

  /**
   * The feature id for the '<em><b>Var Decls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECL__VAR_DECLS = BASE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECL_FEATURE_COUNT = BASE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefDeclImpl <em>Def Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefDeclImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDefDecl()
   * @generated
   */
  int DEF_DECL = 21;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DECL__DEFINITIONS = BASE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DECL_FEATURE_COUNT = BASE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.InitDeclImpl <em>Init Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.InitDeclImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getInitDecl()
   * @generated
   */
  int INIT_DECL = 22;

  /**
   * The feature id for the '<em><b>Definition Or Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_DECL__DEFINITION_OR_COMMAND = BASE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Init Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_DECL_FEATURE_COUNT = BASE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TransDeclImpl <em>Trans Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.TransDeclImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getTransDecl()
   * @generated
   */
  int TRANS_DECL = 23;

  /**
   * The feature id for the '<em><b>Definition Or Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANS_DECL__DEFINITION_OR_COMMAND = BASE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trans Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANS_DECL_FEATURE_COUNT = BASE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclsImpl <em>Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclsImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getVarDecls()
   * @generated
   */
  int VAR_DECLS = 24;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS__VAR_DECL = 0;

  /**
   * The number of structural features of the '<em>Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 25;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VAR = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__TYPE = 1;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionsImpl <em>Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionsImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDefinitions()
   * @generated
   */
  int DEFINITIONS = 26;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__DEFINITION = 0;

  /**
   * The number of structural features of the '<em>Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionOrCommandImpl <em>Definition Or Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionOrCommandImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDefinitionOrCommand()
   * @generated
   */
  int DEFINITION_OR_COMMAND = 27;

  /**
   * The number of structural features of the '<em>Definition Or Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_OR_COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 28;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = DEFINITION_OR_COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SimpleDefinitionImpl <em>Simple Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SimpleDefinitionImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getSimpleDefinition()
   * @generated
   */
  int SIMPLE_DEFINITION = 29;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DEFINITION__LHS = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DEFINITION__RHS_DEFINITION = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Simple Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.LhsImpl <em>Lhs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.LhsImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getLhs()
   * @generated
   */
  int LHS = 30;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LHS__IDENTIFIER = 0;

  /**
   * The number of structural features of the '<em>Lhs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LHS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.RhsDefinitionImpl <em>Rhs Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.RhsDefinitionImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getRhsDefinition()
   * @generated
   */
  int RHS_DEFINITION = 31;

  /**
   * The number of structural features of the '<em>Rhs Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHS_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.RhsExpressionImpl <em>Rhs Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.RhsExpressionImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getRhsExpression()
   * @generated
   */
  int RHS_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHS_EXPRESSION__EXPRESSION = RHS_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rhs Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHS_EXPRESSION_FEATURE_COUNT = RHS_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandsImpl <em>Some Commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandsImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getSomeCommands()
   * @generated
   */
  int SOME_COMMANDS = 33;

  /**
   * The feature id for the '<em><b>First Some Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_COMMANDS__FIRST_SOME_COMMAND = DEFINITION_OR_COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next Some Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_COMMANDS__NEXT_SOME_COMMAND = DEFINITION_OR_COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_COMMANDS__ELSE_COMMAND = DEFINITION_OR_COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Some Commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_COMMANDS_FEATURE_COUNT = DEFINITION_OR_COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandImpl <em>Some Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getSomeCommand()
   * @generated
   */
  int SOME_COMMAND = 34;

  /**
   * The number of structural features of the '<em>Some Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NamedCommandImpl <em>Named Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NamedCommandImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getNamedCommand()
   * @generated
   */
  int NAMED_COMMAND = 35;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_COMMAND__IDENTIFIER = SOME_COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Guarded Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_COMMAND__GUARDED_COMMAND = SOME_COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Named Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_COMMAND_FEATURE_COUNT = SOME_COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.GuardedCommandImpl <em>Guarded Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.GuardedCommandImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getGuardedCommand()
   * @generated
   */
  int GUARDED_COMMAND = 36;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARDED_COMMAND__GUARD = 0;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARDED_COMMAND__ASSIGNMENT = 1;

  /**
   * The number of structural features of the '<em>Guarded Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARDED_COMMAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.GuardImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 37;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.AssignmentsImpl <em>Assignments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.AssignmentsImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getAssignments()
   * @generated
   */
  int ASSIGNMENTS = 38;

  /**
   * The feature id for the '<em><b>First Simple Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENTS__FIRST_SIMPLE_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Next Simple Definition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENTS__NEXT_SIMPLE_DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Assignments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ElseCommandImpl <em>Else Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ElseCommandImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getElseCommand()
   * @generated
   */
  int ELSE_COMMAND = 39;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_COMMAND__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_COMMAND__ASSIGNMENTS = 1;

  /**
   * The number of structural features of the '<em>Else Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_COMMAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ExpressionImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 40;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = BOUND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BracketedExpressionImpl <em>Bracketed Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BracketedExpressionImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBracketedExpression()
   * @generated
   */
  int BRACKETED_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETED_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bracketed Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.OuterInfixApplicationImpl <em>Outer Infix Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.OuterInfixApplicationImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getOuterInfixApplication()
   * @generated
   */
  int OUTER_INFIX_APPLICATION = 42;

  /**
   * The feature id for the '<em><b>First Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_INFIX_APPLICATION__FIRST_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_INFIX_APPLICATION__NEXT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Outer Infix Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTER_INFIX_APPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NameExprImpl <em>Name Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NameExprImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getNameExpr()
   * @generated
   */
  int NAME_EXPR = 43;

  /**
   * The number of structural features of the '<em>Name Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NextVariableImpl <em>Next Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NextVariableImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getNextVariable()
   * @generated
   */
  int NEXT_VARIABLE = 44;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_VARIABLE__IDENTIFIER = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Next Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ApplicationImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 45;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__FUNCTION = 0;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__ARGUMENT = 1;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.FunctionImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 46;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ArgumentImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 47;

  /**
   * The feature id for the '<em><b>First Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__FIRST_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Next Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NEXT_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.InfixApplicationImpl <em>Infix Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.InfixApplicationImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getInfixApplication()
   * @generated
   */
  int INFIX_APPLICATION = 48;

  /**
   * The feature id for the '<em><b>First Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIX_APPLICATION__FIRST_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Second Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIX_APPLICATION__SECOND_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Infix Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFIX_APPLICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NameImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getName_()
   * @generated
   */
  int NAME = 49;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__IDENTIFIER = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NumeralImpl <em>Numeral</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NumeralImpl
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getNumeral()
   * @generated
   */
  int NUMERAL = 50;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERAL__NUMBER = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numeral</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Context#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Context#getIdentifier()
   * @see #getContext()
   * @generated
   */
  EAttribute getContext_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Context#getContextBody <em>Context Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context Body</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Context#getContextBody()
   * @see #getContext()
   * @generated
   */
  EReference getContext_ContextBody();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody <em>Context Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Body</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody
   * @generated
   */
  EClass getContextBody();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declarations</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ContextBody#getDeclarations()
   * @see #getContextBody()
   * @generated
   */
  EReference getContextBody_Declarations();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Declarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarations</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Declarations
   * @generated
   */
  EClass getDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Declarations#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaration</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Declarations#getDeclaration()
   * @see #getDeclarations()
   * @generated
   */
  EReference getDeclarations_Declaration();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Declaration#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Declaration#getIdentifier()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Identifier();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Declaration</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration
   * @generated
   */
  EClass getTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration#getTypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Def</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.TypeDeclaration#getTypeDef()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_TypeDef();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Type</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BasicType
   * @generated
   */
  EClass getBasicType();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BasicType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BasicType#getType()
   * @see #getBasicType()
   * @generated
   */
  EAttribute getBasicType_Type();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName
   * @generated
   */
  EClass getQualifiedName();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getIdentifier1 <em>Identifier1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier1</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getIdentifier1()
   * @see #getQualifiedName()
   * @generated
   */
  EAttribute getQualifiedName_Identifier1();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getActualParameters <em>Actual Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual Parameters</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getActualParameters()
   * @see #getQualifiedName()
   * @generated
   */
  EReference getQualifiedName_ActualParameters();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getIdentifier2 <em>Identifier2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier2</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.QualifiedName#getIdentifier2()
   * @see #getQualifiedName()
   * @generated
   */
  EAttribute getQualifiedName_Identifier2();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ActualParameters <em>Actual Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Parameters</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ActualParameters
   * @generated
   */
  EClass getActualParameters();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Subrange <em>Subrange</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subrange</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Subrange
   * @generated
   */
  EClass getSubrange();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Subrange#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Subrange#getLowerBound()
   * @see #getSubrange()
   * @generated
   */
  EReference getSubrange_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Subrange#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Subrange#getUpperBound()
   * @see #getSubrange()
   * @generated
   */
  EReference getSubrange_UpperBound();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Bound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bound</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Bound
   * @generated
   */
  EClass getBound();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType <em>Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Type</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType
   * @generated
   */
  EClass getScalarType();

  /**
   * Returns the meta object for the attribute list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType#getNextType <em>Next Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Next Type</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ScalarType#getNextType()
   * @see #getScalarType()
   * @generated
   */
  EAttribute getScalarType_NextType();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ModuleDeclaration <em>Module Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Declaration</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ModuleDeclaration
   * @generated
   */
  EClass getModuleDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ModuleDeclaration#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ModuleDeclaration#getModule()
   * @see #getModuleDeclaration()
   * @generated
   */
  EReference getModuleDeclaration_Module();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BaseModule <em>Base Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Module</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BaseModule
   * @generated
   */
  EClass getBaseModule();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations <em>Base Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Declarations</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations
   * @generated
   */
  EClass getBaseDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations#getBaseDeclaration <em>Base Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Base Declaration</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclarations#getBaseDeclaration()
   * @see #getBaseDeclarations()
   * @generated
   */
  EReference getBaseDeclarations_BaseDeclaration();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclaration <em>Base Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Declaration</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BaseDeclaration
   * @generated
   */
  EClass getBaseDeclaration();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InputDecl <em>Input Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Decl</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InputDecl
   * @generated
   */
  EClass getInputDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InputDecl#getVarDecls <em>Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Decls</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InputDecl#getVarDecls()
   * @see #getInputDecl()
   * @generated
   */
  EReference getInputDecl_VarDecls();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.OutputDecl <em>Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Decl</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.OutputDecl
   * @generated
   */
  EClass getOutputDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.OutputDecl#getVarDecls <em>Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Decls</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.OutputDecl#getVarDecls()
   * @see #getOutputDecl()
   * @generated
   */
  EReference getOutputDecl_VarDecls();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl <em>Local Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Decl</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl
   * @generated
   */
  EClass getLocalDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl#getVarDecls <em>Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Decls</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.LocalDecl#getVarDecls()
   * @see #getLocalDecl()
   * @generated
   */
  EReference getLocalDecl_VarDecls();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl <em>Def Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Decl</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl
   * @generated
   */
  EClass getDefDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definitions</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.DefDecl#getDefinitions()
   * @see #getDefDecl()
   * @generated
   */
  EReference getDefDecl_Definitions();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl <em>Init Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Decl</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl
   * @generated
   */
  EClass getInitDecl();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl#getDefinitionOrCommand <em>Definition Or Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definition Or Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InitDecl#getDefinitionOrCommand()
   * @see #getInitDecl()
   * @generated
   */
  EReference getInitDecl_DefinitionOrCommand();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl <em>Trans Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trans Decl</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl
   * @generated
   */
  EClass getTransDecl();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl#getDefinitionOrCommand <em>Definition Or Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definition Or Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.TransDecl#getDefinitionOrCommand()
   * @see #getTransDecl()
   * @generated
   */
  EReference getTransDecl_DefinitionOrCommand();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls <em>Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decls</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls
   * @generated
   */
  EClass getVarDecls();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls#getVarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var Decl</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.VarDecls#getVarDecl()
   * @see #getVarDecls()
   * @generated
   */
  EReference getVarDecls_VarDecl();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the attribute list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Var</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl#getVar()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.VarDecl#getType()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Type();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definitions</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Definitions
   * @generated
   */
  EClass getDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Definitions#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definition</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Definitions#getDefinition()
   * @see #getDefinitions()
   * @generated
   */
  EReference getDefinitions_Definition();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.DefinitionOrCommand <em>Definition Or Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Or Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.DefinitionOrCommand
   * @generated
   */
  EClass getDefinitionOrCommand();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition <em>Simple Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Definition</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition
   * @generated
   */
  EClass getSimpleDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition#getLhs()
   * @see #getSimpleDefinition()
   * @generated
   */
  EReference getSimpleDefinition_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition#getRhsDefinition <em>Rhs Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs Definition</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SimpleDefinition#getRhsDefinition()
   * @see #getSimpleDefinition()
   * @generated
   */
  EReference getSimpleDefinition_RhsDefinition();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Lhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lhs</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Lhs
   * @generated
   */
  EClass getLhs();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Lhs#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Lhs#getIdentifier()
   * @see #getLhs()
   * @generated
   */
  EAttribute getLhs_Identifier();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.RhsDefinition <em>Rhs Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rhs Definition</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.RhsDefinition
   * @generated
   */
  EClass getRhsDefinition();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.RhsExpression <em>Rhs Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rhs Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.RhsExpression
   * @generated
   */
  EClass getRhsExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.RhsExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.RhsExpression#getExpression()
   * @see #getRhsExpression()
   * @generated
   */
  EReference getRhsExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands <em>Some Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Commands</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands
   * @generated
   */
  EClass getSomeCommands();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getFirstSomeCommand <em>First Some Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Some Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getFirstSomeCommand()
   * @see #getSomeCommands()
   * @generated
   */
  EReference getSomeCommands_FirstSomeCommand();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getNextSomeCommand <em>Next Some Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next Some Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getNextSomeCommand()
   * @see #getSomeCommands()
   * @generated
   */
  EReference getSomeCommands_NextSomeCommand();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getElseCommand <em>Else Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommands#getElseCommand()
   * @see #getSomeCommands()
   * @generated
   */
  EReference getSomeCommands_ElseCommand();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommand <em>Some Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.SomeCommand
   * @generated
   */
  EClass getSomeCommand();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand <em>Named Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand
   * @generated
   */
  EClass getNamedCommand();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand#getIdentifier()
   * @see #getNamedCommand()
   * @generated
   */
  EAttribute getNamedCommand_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand#getGuardedCommand <em>Guarded Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guarded Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.NamedCommand#getGuardedCommand()
   * @see #getNamedCommand()
   * @generated
   */
  EReference getNamedCommand_GuardedCommand();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand <em>Guarded Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guarded Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand
   * @generated
   */
  EClass getGuardedCommand();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand#getGuard()
   * @see #getGuardedCommand()
   * @generated
   */
  EReference getGuardedCommand_Guard();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.GuardedCommand#getAssignment()
   * @see #getGuardedCommand()
   * @generated
   */
  EReference getGuardedCommand_Assignment();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Assignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignments</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Assignments
   * @generated
   */
  EClass getAssignments();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Assignments#getFirstSimpleDefinition <em>First Simple Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Simple Definition</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Assignments#getFirstSimpleDefinition()
   * @see #getAssignments()
   * @generated
   */
  EReference getAssignments_FirstSimpleDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Assignments#getNextSimpleDefinition <em>Next Simple Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next Simple Definition</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Assignments#getNextSimpleDefinition()
   * @see #getAssignments()
   * @generated
   */
  EReference getAssignments_NextSimpleDefinition();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand <em>Else Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Command</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand
   * @generated
   */
  EClass getElseCommand();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand#getIdentifier()
   * @see #getElseCommand()
   * @generated
   */
  EAttribute getElseCommand_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignments</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.ElseCommand#getAssignments()
   * @see #getElseCommand()
   * @generated
   */
  EReference getElseCommand_Assignments();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BracketedExpression <em>Bracketed Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bracketed Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BracketedExpression
   * @generated
   */
  EClass getBracketedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.BracketedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.BracketedExpression#getExpression()
   * @see #getBracketedExpression()
   * @generated
   */
  EReference getBracketedExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication <em>Outer Infix Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outer Infix Application</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication
   * @generated
   */
  EClass getOuterInfixApplication();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication#getFirstExpression <em>First Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication#getFirstExpression()
   * @see #getOuterInfixApplication()
   * @generated
   */
  EReference getOuterInfixApplication_FirstExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication#getNextExpression <em>Next Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.OuterInfixApplication#getNextExpression()
   * @see #getOuterInfixApplication()
   * @generated
   */
  EReference getOuterInfixApplication_NextExpression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NameExpr <em>Name Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Expr</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.NameExpr
   * @generated
   */
  EClass getNameExpr();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NextVariable <em>Next Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Next Variable</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.NextVariable
   * @generated
   */
  EClass getNextVariable();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.NextVariable#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.NextVariable#getIdentifier()
   * @see #getNextVariable()
   * @generated
   */
  EAttribute getNextVariable_Identifier();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Application#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Application#getFunction()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Function();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Application#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Application#getArgument()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Argument();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Function#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Function#getExpression()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Expression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Argument#getFirstExpression <em>First Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Argument#getFirstExpression()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_FirstExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Argument#getNextExpression <em>Next Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Argument#getNextExpression()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_NextExpression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication <em>Infix Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infix Application</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication
   * @generated
   */
  EClass getInfixApplication();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication#getFirstExpression <em>First Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication#getFirstExpression()
   * @see #getInfixApplication()
   * @generated
   */
  EReference getInfixApplication_FirstExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication#getSecondExpression <em>Second Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Expression</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.InfixApplication#getSecondExpression()
   * @see #getInfixApplication()
   * @generated
   */
  EReference getInfixApplication_SecondExpression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Name#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Name#getIdentifier()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Identifier();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Numeral <em>Numeral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeral</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Numeral
   * @generated
   */
  EClass getNumeral();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt2sal2.xtext.sal.sal.Numeral#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.be.textbe.bt2sal2.xtext.sal.sal.Numeral#getNumber()
   * @see #getNumeral()
   * @generated
   */
  EAttribute getNumeral_Number();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SalFactory getSalFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT__IDENTIFIER = eINSTANCE.getContext_Identifier();

    /**
     * The meta object literal for the '<em><b>Context Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__CONTEXT_BODY = eINSTANCE.getContext_ContextBody();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextBodyImpl <em>Context Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ContextBodyImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getContextBody()
     * @generated
     */
    EClass CONTEXT_BODY = eINSTANCE.getContextBody();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_BODY__DECLARATIONS = eINSTANCE.getContextBody_Declarations();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DeclarationsImpl <em>Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DeclarationsImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDeclarations()
     * @generated
     */
    EClass DECLARATIONS = eINSTANCE.getDeclarations();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATIONS__DECLARATION = eINSTANCE.getDeclarations_Declaration();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DeclarationImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__IDENTIFIER = eINSTANCE.getDeclaration_Identifier();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeDeclarationImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getTypeDeclaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Type Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__TYPE_DEF = eINSTANCE.getTypeDeclaration_TypeDef();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeDefImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.TypeImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BasicTypeImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasicType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__TYPE = eINSTANCE.getBasicType_Type();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.QualifiedNameImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getQualifiedName()
     * @generated
     */
    EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

    /**
     * The meta object literal for the '<em><b>Identifier1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME__IDENTIFIER1 = eINSTANCE.getQualifiedName_Identifier1();

    /**
     * The meta object literal for the '<em><b>Actual Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_NAME__ACTUAL_PARAMETERS = eINSTANCE.getQualifiedName_ActualParameters();

    /**
     * The meta object literal for the '<em><b>Identifier2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME__IDENTIFIER2 = eINSTANCE.getQualifiedName_Identifier2();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ActualParametersImpl <em>Actual Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ActualParametersImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getActualParameters()
     * @generated
     */
    EClass ACTUAL_PARAMETERS = eINSTANCE.getActualParameters();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SubrangeImpl <em>Subrange</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SubrangeImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getSubrange()
     * @generated
     */
    EClass SUBRANGE = eINSTANCE.getSubrange();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE__LOWER_BOUND = eINSTANCE.getSubrange_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE__UPPER_BOUND = eINSTANCE.getSubrange_UpperBound();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BoundImpl <em>Bound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BoundImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBound()
     * @generated
     */
    EClass BOUND = eINSTANCE.getBound();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ScalarTypeImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getScalarType()
     * @generated
     */
    EClass SCALAR_TYPE = eINSTANCE.getScalarType();

    /**
     * The meta object literal for the '<em><b>Next Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR_TYPE__NEXT_TYPE = eINSTANCE.getScalarType_NextType();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ModuleDeclarationImpl <em>Module Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ModuleDeclarationImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getModuleDeclaration()
     * @generated
     */
    EClass MODULE_DECLARATION = eINSTANCE.getModuleDeclaration();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_DECLARATION__MODULE = eINSTANCE.getModuleDeclaration_Module();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ModuleImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseModuleImpl <em>Base Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseModuleImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBaseModule()
     * @generated
     */
    EClass BASE_MODULE = eINSTANCE.getBaseModule();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseDeclarationsImpl <em>Base Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseDeclarationsImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBaseDeclarations()
     * @generated
     */
    EClass BASE_DECLARATIONS = eINSTANCE.getBaseDeclarations();

    /**
     * The meta object literal for the '<em><b>Base Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_DECLARATIONS__BASE_DECLARATION = eINSTANCE.getBaseDeclarations_BaseDeclaration();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseDeclarationImpl <em>Base Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BaseDeclarationImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBaseDeclaration()
     * @generated
     */
    EClass BASE_DECLARATION = eINSTANCE.getBaseDeclaration();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.InputDeclImpl <em>Input Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.InputDeclImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getInputDecl()
     * @generated
     */
    EClass INPUT_DECL = eINSTANCE.getInputDecl();

    /**
     * The meta object literal for the '<em><b>Var Decls</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_DECL__VAR_DECLS = eINSTANCE.getInputDecl_VarDecls();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.OutputDeclImpl <em>Output Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.OutputDeclImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getOutputDecl()
     * @generated
     */
    EClass OUTPUT_DECL = eINSTANCE.getOutputDecl();

    /**
     * The meta object literal for the '<em><b>Var Decls</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_DECL__VAR_DECLS = eINSTANCE.getOutputDecl_VarDecls();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.LocalDeclImpl <em>Local Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.LocalDeclImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getLocalDecl()
     * @generated
     */
    EClass LOCAL_DECL = eINSTANCE.getLocalDecl();

    /**
     * The meta object literal for the '<em><b>Var Decls</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_DECL__VAR_DECLS = eINSTANCE.getLocalDecl_VarDecls();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefDeclImpl <em>Def Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefDeclImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDefDecl()
     * @generated
     */
    EClass DEF_DECL = eINSTANCE.getDefDecl();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_DECL__DEFINITIONS = eINSTANCE.getDefDecl_Definitions();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.InitDeclImpl <em>Init Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.InitDeclImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getInitDecl()
     * @generated
     */
    EClass INIT_DECL = eINSTANCE.getInitDecl();

    /**
     * The meta object literal for the '<em><b>Definition Or Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_DECL__DEFINITION_OR_COMMAND = eINSTANCE.getInitDecl_DefinitionOrCommand();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.TransDeclImpl <em>Trans Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.TransDeclImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getTransDecl()
     * @generated
     */
    EClass TRANS_DECL = eINSTANCE.getTransDecl();

    /**
     * The meta object literal for the '<em><b>Definition Or Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANS_DECL__DEFINITION_OR_COMMAND = eINSTANCE.getTransDecl_DefinitionOrCommand();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclsImpl <em>Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclsImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getVarDecls()
     * @generated
     */
    EClass VAR_DECLS = eINSTANCE.getVarDecls();

    /**
     * The meta object literal for the '<em><b>Var Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLS__VAR_DECL = eINSTANCE.getVarDecls_VarDecl();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.VarDeclImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getVarDecl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVarDecl();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__VAR = eINSTANCE.getVarDecl_Var();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__TYPE = eINSTANCE.getVarDecl_Type();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionsImpl <em>Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionsImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDefinitions()
     * @generated
     */
    EClass DEFINITIONS = eINSTANCE.getDefinitions();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITIONS__DEFINITION = eINSTANCE.getDefinitions_Definition();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionOrCommandImpl <em>Definition Or Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionOrCommandImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDefinitionOrCommand()
     * @generated
     */
    EClass DEFINITION_OR_COMMAND = eINSTANCE.getDefinitionOrCommand();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.DefinitionImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SimpleDefinitionImpl <em>Simple Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SimpleDefinitionImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getSimpleDefinition()
     * @generated
     */
    EClass SIMPLE_DEFINITION = eINSTANCE.getSimpleDefinition();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_DEFINITION__LHS = eINSTANCE.getSimpleDefinition_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_DEFINITION__RHS_DEFINITION = eINSTANCE.getSimpleDefinition_RhsDefinition();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.LhsImpl <em>Lhs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.LhsImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getLhs()
     * @generated
     */
    EClass LHS = eINSTANCE.getLhs();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LHS__IDENTIFIER = eINSTANCE.getLhs_Identifier();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.RhsDefinitionImpl <em>Rhs Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.RhsDefinitionImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getRhsDefinition()
     * @generated
     */
    EClass RHS_DEFINITION = eINSTANCE.getRhsDefinition();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.RhsExpressionImpl <em>Rhs Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.RhsExpressionImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getRhsExpression()
     * @generated
     */
    EClass RHS_EXPRESSION = eINSTANCE.getRhsExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RHS_EXPRESSION__EXPRESSION = eINSTANCE.getRhsExpression_Expression();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandsImpl <em>Some Commands</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandsImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getSomeCommands()
     * @generated
     */
    EClass SOME_COMMANDS = eINSTANCE.getSomeCommands();

    /**
     * The meta object literal for the '<em><b>First Some Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOME_COMMANDS__FIRST_SOME_COMMAND = eINSTANCE.getSomeCommands_FirstSomeCommand();

    /**
     * The meta object literal for the '<em><b>Next Some Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOME_COMMANDS__NEXT_SOME_COMMAND = eINSTANCE.getSomeCommands_NextSomeCommand();

    /**
     * The meta object literal for the '<em><b>Else Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOME_COMMANDS__ELSE_COMMAND = eINSTANCE.getSomeCommands_ElseCommand();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandImpl <em>Some Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SomeCommandImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getSomeCommand()
     * @generated
     */
    EClass SOME_COMMAND = eINSTANCE.getSomeCommand();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NamedCommandImpl <em>Named Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NamedCommandImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getNamedCommand()
     * @generated
     */
    EClass NAMED_COMMAND = eINSTANCE.getNamedCommand();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_COMMAND__IDENTIFIER = eINSTANCE.getNamedCommand_Identifier();

    /**
     * The meta object literal for the '<em><b>Guarded Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_COMMAND__GUARDED_COMMAND = eINSTANCE.getNamedCommand_GuardedCommand();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.GuardedCommandImpl <em>Guarded Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.GuardedCommandImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getGuardedCommand()
     * @generated
     */
    EClass GUARDED_COMMAND = eINSTANCE.getGuardedCommand();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARDED_COMMAND__GUARD = eINSTANCE.getGuardedCommand_Guard();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARDED_COMMAND__ASSIGNMENT = eINSTANCE.getGuardedCommand_Assignment();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.GuardImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.AssignmentsImpl <em>Assignments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.AssignmentsImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getAssignments()
     * @generated
     */
    EClass ASSIGNMENTS = eINSTANCE.getAssignments();

    /**
     * The meta object literal for the '<em><b>First Simple Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENTS__FIRST_SIMPLE_DEFINITION = eINSTANCE.getAssignments_FirstSimpleDefinition();

    /**
     * The meta object literal for the '<em><b>Next Simple Definition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENTS__NEXT_SIMPLE_DEFINITION = eINSTANCE.getAssignments_NextSimpleDefinition();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ElseCommandImpl <em>Else Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ElseCommandImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getElseCommand()
     * @generated
     */
    EClass ELSE_COMMAND = eINSTANCE.getElseCommand();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELSE_COMMAND__IDENTIFIER = eINSTANCE.getElseCommand_Identifier();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_COMMAND__ASSIGNMENTS = eINSTANCE.getElseCommand_Assignments();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ExpressionImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.BracketedExpressionImpl <em>Bracketed Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.BracketedExpressionImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getBracketedExpression()
     * @generated
     */
    EClass BRACKETED_EXPRESSION = eINSTANCE.getBracketedExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRACKETED_EXPRESSION__EXPRESSION = eINSTANCE.getBracketedExpression_Expression();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.OuterInfixApplicationImpl <em>Outer Infix Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.OuterInfixApplicationImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getOuterInfixApplication()
     * @generated
     */
    EClass OUTER_INFIX_APPLICATION = eINSTANCE.getOuterInfixApplication();

    /**
     * The meta object literal for the '<em><b>First Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTER_INFIX_APPLICATION__FIRST_EXPRESSION = eINSTANCE.getOuterInfixApplication_FirstExpression();

    /**
     * The meta object literal for the '<em><b>Next Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTER_INFIX_APPLICATION__NEXT_EXPRESSION = eINSTANCE.getOuterInfixApplication_NextExpression();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NameExprImpl <em>Name Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NameExprImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getNameExpr()
     * @generated
     */
    EClass NAME_EXPR = eINSTANCE.getNameExpr();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NextVariableImpl <em>Next Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NextVariableImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getNextVariable()
     * @generated
     */
    EClass NEXT_VARIABLE = eINSTANCE.getNextVariable();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEXT_VARIABLE__IDENTIFIER = eINSTANCE.getNextVariable_Identifier();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ApplicationImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__FUNCTION = eINSTANCE.getApplication_Function();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__ARGUMENT = eINSTANCE.getApplication_Argument();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.FunctionImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__EXPRESSION = eINSTANCE.getFunction_Expression();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.ArgumentImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>First Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__FIRST_EXPRESSION = eINSTANCE.getArgument_FirstExpression();

    /**
     * The meta object literal for the '<em><b>Next Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__NEXT_EXPRESSION = eINSTANCE.getArgument_NextExpression();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.InfixApplicationImpl <em>Infix Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.InfixApplicationImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getInfixApplication()
     * @generated
     */
    EClass INFIX_APPLICATION = eINSTANCE.getInfixApplication();

    /**
     * The meta object literal for the '<em><b>First Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFIX_APPLICATION__FIRST_EXPRESSION = eINSTANCE.getInfixApplication_FirstExpression();

    /**
     * The meta object literal for the '<em><b>Second Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFIX_APPLICATION__SECOND_EXPRESSION = eINSTANCE.getInfixApplication_SecondExpression();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NameImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__IDENTIFIER = eINSTANCE.getName_Identifier();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt2sal2.xtext.sal.sal.impl.NumeralImpl <em>Numeral</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.NumeralImpl
     * @see org.be.textbe.bt2sal2.xtext.sal.sal.impl.SalPackageImpl#getNumeral()
     * @generated
     */
    EClass NUMERAL = eINSTANCE.getNumeral();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERAL__NUMBER = eINSTANCE.getNumeral_Number();

  }

} //SalPackage
