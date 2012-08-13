/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.be.textbe.bttrace.BttraceFactory
 * @model kind="package"
 * @generated
 */
public interface BttracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bttrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbttrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bttrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BttracePackage eINSTANCE = org.be.textbe.bttrace.impl.BttracePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bttrace.impl.TextBTTraceImpl <em>Text BT Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bttrace.impl.TextBTTraceImpl
	 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getTextBTTrace()
	 * @generated
	 */
	int TEXT_BT_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Bt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BT_TRACE__BT = 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BT_TRACE__DELAY = 1;

	/**
	 * The feature id for the '<em><b>Activate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BT_TRACE__ACTIVATE = 2;

	/**
	 * The feature id for the '<em><b>Interleave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BT_TRACE__INTERLEAVE = 3;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BT_TRACE__TRACE = 4;

	/**
	 * The number of structural features of the '<em>Text BT Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BT_TRACE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.be.textbe.bttrace.impl.BTImpl <em>BT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bttrace.impl.BTImpl
	 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getBT()
	 * @generated
	 */
	int BT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>BT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bttrace.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bttrace.impl.DelayImpl
	 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bttrace.impl.ActivateImpl <em>Activate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bttrace.impl.ActivateImpl
	 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getActivate()
	 * @generated
	 */
	int ACTIVATE = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE__COLOR = 0;

	/**
	 * The number of structural features of the '<em>Activate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bttrace.impl.InterleaveImpl <em>Interleave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bttrace.impl.InterleaveImpl
	 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getInterleave()
	 * @generated
	 */
	int INTERLEAVE = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVE__COLOR = 0;

	/**
	 * The number of structural features of the '<em>Interleave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bttrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bttrace.impl.TraceImpl
	 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 5;

	/**
	 * The feature id for the '<em><b>Node Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NODE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Loop Node Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__LOOP_NODE_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.be.textbe.bttrace.impl.NodeGroupImpl <em>Node Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bttrace.impl.NodeGroupImpl
	 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getNodeGroup()
	 * @generated
	 */
	int NODE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Active Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GROUP__ACTIVE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Interleave Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GROUP__INTERLEAVE_NODE = 1;

	/**
	 * The number of structural features of the '<em>Node Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.be.textbe.bttrace.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bttrace.impl.NodeImpl
	 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bttrace.COLORS <em>COLORS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bttrace.COLORS
	 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getCOLORS()
	 * @generated
	 */
	int COLORS = 8;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bttrace.TextBTTrace <em>Text BT Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text BT Trace</em>'.
	 * @see org.be.textbe.bttrace.TextBTTrace
	 * @generated
	 */
	EClass getTextBTTrace();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bttrace.TextBTTrace#getBt <em>Bt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bt</em>'.
	 * @see org.be.textbe.bttrace.TextBTTrace#getBt()
	 * @see #getTextBTTrace()
	 * @generated
	 */
	EReference getTextBTTrace_Bt();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bttrace.TextBTTrace#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see org.be.textbe.bttrace.TextBTTrace#getDelay()
	 * @see #getTextBTTrace()
	 * @generated
	 */
	EReference getTextBTTrace_Delay();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bttrace.TextBTTrace#getActivate <em>Activate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activate</em>'.
	 * @see org.be.textbe.bttrace.TextBTTrace#getActivate()
	 * @see #getTextBTTrace()
	 * @generated
	 */
	EReference getTextBTTrace_Activate();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bttrace.TextBTTrace#getInterleave <em>Interleave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interleave</em>'.
	 * @see org.be.textbe.bttrace.TextBTTrace#getInterleave()
	 * @see #getTextBTTrace()
	 * @generated
	 */
	EReference getTextBTTrace_Interleave();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bttrace.TextBTTrace#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see org.be.textbe.bttrace.TextBTTrace#getTrace()
	 * @see #getTextBTTrace()
	 * @generated
	 */
	EReference getTextBTTrace_Trace();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bttrace.BT <em>BT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BT</em>'.
	 * @see org.be.textbe.bttrace.BT
	 * @generated
	 */
	EClass getBT();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bttrace.BT#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.be.textbe.bttrace.BT#getValue()
	 * @see #getBT()
	 * @generated
	 */
	EAttribute getBT_Value();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bttrace.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see org.be.textbe.bttrace.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bttrace.Delay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.be.textbe.bttrace.Delay#getValue()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Value();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bttrace.Activate <em>Activate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activate</em>'.
	 * @see org.be.textbe.bttrace.Activate
	 * @generated
	 */
	EClass getActivate();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bttrace.Activate#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.be.textbe.bttrace.Activate#getColor()
	 * @see #getActivate()
	 * @generated
	 */
	EAttribute getActivate_Color();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bttrace.Interleave <em>Interleave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interleave</em>'.
	 * @see org.be.textbe.bttrace.Interleave
	 * @generated
	 */
	EClass getInterleave();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bttrace.Interleave#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.be.textbe.bttrace.Interleave#getColor()
	 * @see #getInterleave()
	 * @generated
	 */
	EAttribute getInterleave_Color();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bttrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.be.textbe.bttrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.bttrace.Trace#getNodeGroup <em>Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Group</em>'.
	 * @see org.be.textbe.bttrace.Trace#getNodeGroup()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_NodeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.bttrace.Trace#getLoopNodeGroup <em>Loop Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Node Group</em>'.
	 * @see org.be.textbe.bttrace.Trace#getLoopNodeGroup()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_LoopNodeGroup();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bttrace.NodeGroup <em>Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Group</em>'.
	 * @see org.be.textbe.bttrace.NodeGroup
	 * @generated
	 */
	EClass getNodeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bttrace.NodeGroup#getActiveNode <em>Active Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active Node</em>'.
	 * @see org.be.textbe.bttrace.NodeGroup#getActiveNode()
	 * @see #getNodeGroup()
	 * @generated
	 */
	EReference getNodeGroup_ActiveNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.bttrace.NodeGroup#getInterleaveNode <em>Interleave Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interleave Node</em>'.
	 * @see org.be.textbe.bttrace.NodeGroup#getInterleaveNode()
	 * @see #getNodeGroup()
	 * @generated
	 */
	EReference getNodeGroup_InterleaveNode();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bttrace.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.be.textbe.bttrace.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bttrace.Node#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.be.textbe.bttrace.Node#getValue()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Value();

	/**
	 * Returns the meta object for enum '{@link org.be.textbe.bttrace.COLORS <em>COLORS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COLORS</em>'.
	 * @see org.be.textbe.bttrace.COLORS
	 * @generated
	 */
	EEnum getCOLORS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BttraceFactory getBttraceFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.be.textbe.bttrace.impl.TextBTTraceImpl <em>Text BT Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bttrace.impl.TextBTTraceImpl
		 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getTextBTTrace()
		 * @generated
		 */
		EClass TEXT_BT_TRACE = eINSTANCE.getTextBTTrace();

		/**
		 * The meta object literal for the '<em><b>Bt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_BT_TRACE__BT = eINSTANCE.getTextBTTrace_Bt();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_BT_TRACE__DELAY = eINSTANCE.getTextBTTrace_Delay();

		/**
		 * The meta object literal for the '<em><b>Activate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_BT_TRACE__ACTIVATE = eINSTANCE.getTextBTTrace_Activate();

		/**
		 * The meta object literal for the '<em><b>Interleave</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_BT_TRACE__INTERLEAVE = eINSTANCE.getTextBTTrace_Interleave();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_BT_TRACE__TRACE = eINSTANCE.getTextBTTrace_Trace();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bttrace.impl.BTImpl <em>BT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bttrace.impl.BTImpl
		 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getBT()
		 * @generated
		 */
		EClass BT = eINSTANCE.getBT();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BT__VALUE = eINSTANCE.getBT_Value();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bttrace.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bttrace.impl.DelayImpl
		 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__VALUE = eINSTANCE.getDelay_Value();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bttrace.impl.ActivateImpl <em>Activate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bttrace.impl.ActivateImpl
		 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getActivate()
		 * @generated
		 */
		EClass ACTIVATE = eINSTANCE.getActivate();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATE__COLOR = eINSTANCE.getActivate_Color();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bttrace.impl.InterleaveImpl <em>Interleave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bttrace.impl.InterleaveImpl
		 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getInterleave()
		 * @generated
		 */
		EClass INTERLEAVE = eINSTANCE.getInterleave();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERLEAVE__COLOR = eINSTANCE.getInterleave_Color();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bttrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bttrace.impl.TraceImpl
		 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Node Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__NODE_GROUP = eINSTANCE.getTrace_NodeGroup();

		/**
		 * The meta object literal for the '<em><b>Loop Node Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__LOOP_NODE_GROUP = eINSTANCE.getTrace_LoopNodeGroup();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bttrace.impl.NodeGroupImpl <em>Node Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bttrace.impl.NodeGroupImpl
		 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getNodeGroup()
		 * @generated
		 */
		EClass NODE_GROUP = eINSTANCE.getNodeGroup();

		/**
		 * The meta object literal for the '<em><b>Active Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GROUP__ACTIVE_NODE = eINSTANCE.getNodeGroup_ActiveNode();

		/**
		 * The meta object literal for the '<em><b>Interleave Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GROUP__INTERLEAVE_NODE = eINSTANCE.getNodeGroup_InterleaveNode();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bttrace.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bttrace.impl.NodeImpl
		 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__VALUE = eINSTANCE.getNode_Value();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bttrace.COLORS <em>COLORS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bttrace.COLORS
		 * @see org.be.textbe.bttrace.impl.BttracePackageImpl#getCOLORS()
		 * @generated
		 */
		EEnum COLORS = eINSTANCE.getCOLORS();

	}

} //BttracePackage
