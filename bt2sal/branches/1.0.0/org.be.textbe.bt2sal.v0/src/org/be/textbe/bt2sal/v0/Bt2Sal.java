package org.be.textbe.bt2sal.v0;

public class Bt2Sal {

	static {
		System.loadLibrary("bt2sal");
	}

	/**
	 * @param tree
	 * @param priority
	 * @param buff
	 * @param withSets
	 * @param sets
	 * @param init
	 * @return
	 */
	public static native String translateToSal(String tree, int priority,
			int buff, int withSets, String sets, String init);

}
