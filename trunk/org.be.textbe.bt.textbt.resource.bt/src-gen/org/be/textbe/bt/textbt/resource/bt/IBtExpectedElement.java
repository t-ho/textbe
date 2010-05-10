/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt;

// An element that is expected at a given position in a resource
// stream.
public interface IBtExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(org.be.textbe.bt.textbt.resource.bt.IBtExpectedElement follower);
	public java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtExpectedElement> getFollowers();
}
