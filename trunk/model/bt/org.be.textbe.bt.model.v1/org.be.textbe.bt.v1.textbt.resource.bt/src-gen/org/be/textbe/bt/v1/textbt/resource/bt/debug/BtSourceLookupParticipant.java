/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.debug;

public class BtSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.be.textbe.bt.v1.textbt.resource.bt.debug.BtStackFrame) {
			org.be.textbe.bt.v1.textbt.resource.bt.debug.BtStackFrame frame = (org.be.textbe.bt.v1.textbt.resource.bt.debug.BtStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
