/**
 */
package org.be.textbe.bt.textbt.traceability;

import org.be.textbe.bt.textbt.TextbtPackage;

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
 * @see org.be.textbe.bt.textbt.traceability.TraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/traceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPackage eINSTANCE = org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.traceability.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.traceability.impl.RequirementImpl
	 * @see org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = TextbtPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = TextbtPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = TextbtPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.traceability.impl.TraceabilityLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.traceability.impl.TraceabilityLinkImpl
	 * @see org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl#getTraceabilityLink()
	 * @generated
	 */
	int TRACEABILITY_LINK = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_LINK__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_LINK__REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_LINK__NODE = 2;

	/**
	 * The feature id for the '<em><b>Updated In Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_LINK__UPDATED_IN_VERSION = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_LINK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.traceability.TraceabilityStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityStatus
	 * @see org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl#getTraceabilityStatus()
	 * @generated
	 */
	int TRACEABILITY_STATUS = 2;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.traceability.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.be.textbe.bt.textbt.traceability.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.traceability.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.be.textbe.bt.textbt.traceability.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityLink
	 * @generated
	 */
	EClass getTraceabilityLink();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityLink#getStatus()
	 * @see #getTraceabilityLink()
	 * @generated
	 */
	EAttribute getTraceabilityLink_Status();

	/**
	 * Returns the meta object for the reference list '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement</em>'.
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityLink#getRequirement()
	 * @see #getTraceabilityLink()
	 * @generated
	 */
	EReference getTraceabilityLink_Requirement();

	/**
	 * Returns the meta object for the container reference '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityLink#getNode()
	 * @see #getTraceabilityLink()
	 * @generated
	 */
	EReference getTraceabilityLink_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.traceability.TraceabilityLink#getUpdatedInVersion <em>Updated In Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated In Version</em>'.
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityLink#getUpdatedInVersion()
	 * @see #getTraceabilityLink()
	 * @generated
	 */
	EAttribute getTraceabilityLink_UpdatedInVersion();

	/**
	 * Returns the meta object for enum '{@link org.be.textbe.bt.textbt.traceability.TraceabilityStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.be.textbe.bt.textbt.traceability.TraceabilityStatus
	 * @generated
	 */
	EEnum getTraceabilityStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityFactory getTraceabilityFactory();

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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.traceability.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.traceability.impl.RequirementImpl
		 * @see org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.traceability.impl.TraceabilityLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.traceability.impl.TraceabilityLinkImpl
		 * @see org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl#getTraceabilityLink()
		 * @generated
		 */
		EClass TRACEABILITY_LINK = eINSTANCE.getTraceabilityLink();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY_LINK__STATUS = eINSTANCE.getTraceabilityLink_Status();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_LINK__REQUIREMENT = eINSTANCE.getTraceabilityLink_Requirement();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_LINK__NODE = eINSTANCE.getTraceabilityLink_Node();

		/**
		 * The meta object literal for the '<em><b>Updated In Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY_LINK__UPDATED_IN_VERSION = eINSTANCE.getTraceabilityLink_UpdatedInVersion();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.traceability.TraceabilityStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.traceability.TraceabilityStatus
		 * @see org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl#getTraceabilityStatus()
		 * @generated
		 */
		EEnum TRACEABILITY_STATUS = eINSTANCE.getTraceabilityStatus();

	}

} //TraceabilityPackage
