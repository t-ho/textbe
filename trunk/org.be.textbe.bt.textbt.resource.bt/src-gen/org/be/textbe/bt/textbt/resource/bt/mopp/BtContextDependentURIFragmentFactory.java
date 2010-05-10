/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

// A factory for ContextDependentURIFragments. Given a feasible reference resolver,
// the factory returns a matching fragment that used the resolver to resolver proxy
// objects.
//
// @param <ContainerType> the type of the class containing the reference to be resolved
// @param <ReferenceType> the type of the reference to be resolved
//
public class BtContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.be.textbe.bt.textbt.resource.bt.IBtContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.be.textbe.bt.textbt.resource.bt.IBtReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public BtContextDependentURIFragmentFactory(org.be.textbe.bt.textbt.resource.bt.IBtReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.be.textbe.bt.textbt.resource.bt.IBtReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
