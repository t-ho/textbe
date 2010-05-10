/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class BtAbstractExpectedElement implements org.be.textbe.bt.textbt.resource.bt.IBtExpectedElement {
	
	private java.util.Set<org.be.textbe.bt.textbt.resource.bt.IBtExpectedElement> followers = new java.util.LinkedHashSet<org.be.textbe.bt.textbt.resource.bt.IBtExpectedElement>();
	
	public BtAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(org.be.textbe.bt.textbt.resource.bt.IBtExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtExpectedElement> getFollowers() {
		return followers;
	}
	
}
