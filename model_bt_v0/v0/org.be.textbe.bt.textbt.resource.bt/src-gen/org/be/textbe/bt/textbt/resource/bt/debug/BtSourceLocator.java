/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.debug;

public class BtSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new org.be.textbe.bt.textbt.resource.bt.debug.BtSourceLookupParticipant()});
	}
	
}
