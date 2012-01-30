/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class CtContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.be.textbe.ct.textct.resource.ct.ICtContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.be.textbe.ct.textct.resource.ct.ICtReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public CtContextDependentURIFragmentFactory(org.be.textbe.ct.textct.resource.ct.ICtReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.be.textbe.ct.textct.resource.ct.ICtReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
