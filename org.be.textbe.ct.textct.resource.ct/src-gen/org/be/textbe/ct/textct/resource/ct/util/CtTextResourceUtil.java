/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.util;

/**
 * Class CtTextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 * This class is deprecated and has been replaced by
 * org.be.textbe.ct.textct.resource.ct.util.CtResourceUtil.
 */
public class CtTextResourceUtil {
	
	@Deprecated	
	public static org.be.textbe.ct.textct.resource.ct.mopp.CtResource getResource(org.eclipse.core.resources.IFile file) {
		return org.be.textbe.ct.textct.resource.ct.util.CtResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static org.be.textbe.ct.textct.resource.ct.mopp.CtResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.be.textbe.ct.textct.resource.ct.util.CtResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static org.be.textbe.ct.textct.resource.ct.mopp.CtResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.be.textbe.ct.textct.resource.ct.util.CtResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static org.be.textbe.ct.textct.resource.ct.mopp.CtResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.be.textbe.ct.textct.resource.ct.util.CtResourceUtil.getResource(uri, options);
	}
	
}
