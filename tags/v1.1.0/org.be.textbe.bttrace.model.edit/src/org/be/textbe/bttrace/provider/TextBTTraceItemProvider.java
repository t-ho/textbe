/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace.provider;


import java.util.Collection;
import java.util.List;

import org.be.textbe.bttrace.BttraceFactory;
import org.be.textbe.bttrace.BttracePackage;
import org.be.textbe.bttrace.TextBTTrace;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.be.textbe.bttrace.TextBTTrace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextBTTraceItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBTTraceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BttracePackage.Literals.TEXT_BT_TRACE__BT);
			childrenFeatures.add(BttracePackage.Literals.TEXT_BT_TRACE__DELAY);
			childrenFeatures.add(BttracePackage.Literals.TEXT_BT_TRACE__ACTIVATE);
			childrenFeatures.add(BttracePackage.Literals.TEXT_BT_TRACE__INTERLEAVE);
			childrenFeatures.add(BttracePackage.Literals.TEXT_BT_TRACE__TRACE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TextBTTrace.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextBTTrace"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TextBTTrace_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TextBTTrace.class)) {
			case BttracePackage.TEXT_BT_TRACE__BT:
			case BttracePackage.TEXT_BT_TRACE__DELAY:
			case BttracePackage.TEXT_BT_TRACE__ACTIVATE:
			case BttracePackage.TEXT_BT_TRACE__INTERLEAVE:
			case BttracePackage.TEXT_BT_TRACE__TRACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BttracePackage.Literals.TEXT_BT_TRACE__BT,
				 BttraceFactory.eINSTANCE.createBT()));

		newChildDescriptors.add
			(createChildParameter
				(BttracePackage.Literals.TEXT_BT_TRACE__DELAY,
				 BttraceFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(BttracePackage.Literals.TEXT_BT_TRACE__ACTIVATE,
				 BttraceFactory.eINSTANCE.createActivate()));

		newChildDescriptors.add
			(createChildParameter
				(BttracePackage.Literals.TEXT_BT_TRACE__INTERLEAVE,
				 BttraceFactory.eINSTANCE.createInterleave()));

		newChildDescriptors.add
			(createChildParameter
				(BttracePackage.Literals.TEXT_BT_TRACE__TRACE,
				 BttraceFactory.eINSTANCE.createTrace()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return bttraceEditPlugin.INSTANCE;
	}

}
