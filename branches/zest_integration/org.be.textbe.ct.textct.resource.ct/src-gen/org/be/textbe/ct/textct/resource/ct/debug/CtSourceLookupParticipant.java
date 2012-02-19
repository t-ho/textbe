/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.debug;

public class CtSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.be.textbe.ct.textct.resource.ct.debug.CtStackFrame) {
			org.be.textbe.ct.textct.resource.ct.debug.CtStackFrame frame = (org.be.textbe.ct.textct.resource.ct.debug.CtStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
