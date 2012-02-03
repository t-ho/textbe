/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.debug;

public class StSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.be.textbe.st.textst.resource.st.debug.StStackFrame) {
			org.be.textbe.st.textst.resource.st.debug.StStackFrame frame = (org.be.textbe.st.textst.resource.st.debug.StStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
