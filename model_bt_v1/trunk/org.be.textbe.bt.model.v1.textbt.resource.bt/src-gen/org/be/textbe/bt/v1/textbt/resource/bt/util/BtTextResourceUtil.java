/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.util;

/**
 * Class BtTextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 * This class is deprecated and has been replaced by
 * org.be.textbe.bt.v1.textbt.resource.bt.util.BtResourceUtil.
 */
public class BtTextResourceUtil {
	
	@Deprecated	
	public static org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtResource getResource(org.eclipse.core.resources.IFile file) {
		return org.be.textbe.bt.v1.textbt.resource.bt.util.BtResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.be.textbe.bt.v1.textbt.resource.bt.util.BtResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.be.textbe.bt.v1.textbt.resource.bt.util.BtResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.be.textbe.bt.v1.textbt.resource.bt.util.BtResourceUtil.getResource(uri, options);
	}
	
}
