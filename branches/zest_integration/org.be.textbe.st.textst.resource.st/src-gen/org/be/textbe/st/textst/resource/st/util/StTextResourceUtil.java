/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.util;

/**
 * Class StTextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 * This class is deprecated and has been replaced by
 * org.be.textbe.st.textst.resource.st.util.StResourceUtil.
 */
public class StTextResourceUtil {
	
	@Deprecated	
	public static org.be.textbe.st.textst.resource.st.mopp.StResource getResource(org.eclipse.core.resources.IFile file) {
		return org.be.textbe.st.textst.resource.st.util.StResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static org.be.textbe.st.textst.resource.st.mopp.StResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.be.textbe.st.textst.resource.st.util.StResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static org.be.textbe.st.textst.resource.st.mopp.StResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.be.textbe.st.textst.resource.st.util.StResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static org.be.textbe.st.textst.resource.st.mopp.StResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.be.textbe.st.textst.resource.st.util.StResourceUtil.getResource(uri, options);
	}
	
}
