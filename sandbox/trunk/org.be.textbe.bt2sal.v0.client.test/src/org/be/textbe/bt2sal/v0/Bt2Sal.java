package org.be.textbe.bt2sal.v0;

class Bt2Sal {
	private static native String translateToSal(String tree, int priority, int buff,
			int withSets, String sets, String init);

	public static void main(String[] args) {
		System.loadLibrary("org.be.textbe.bt2sal.v0.library");
		String tree = "#RT R1 R1\r\n#C C1 DOOR\r\n#S 1 Closed\r\n#C C2 USER\r\n#S 1 sdfs\r\n#T R1 C1 1; R1 C2 1\r\n\r\n";
		int priority = 0;
		int buff = 0;
		int withSets = 0;
		String sets = "";
		String init = "";
		String result = Bt2Sal.translateToSal(tree, priority, buff, withSets,
				sets, init);
		System.out.println(result);
	}
}
