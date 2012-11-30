package org.be.textbe.bt2sal.test;

import org.junit.Test;

public class Bt2SalTest {

	@Test
	public void test() {
		String tree = "#RT R1 R1\r\n#C C1 DOOR\r\n#S 1 Closed\r\n#C C2 USER\r\n#S 1 sdfs\r\n#T R1 C1 1; R1 C2 1\r\n\r\n";
		int priority = 0;
		int buff = 0;
		int withSets = 0;
		String sets = "";
		String init = "";
		String result = org.be.textbe.bt2sal.v0.Bt2Sal.translateToSal(tree, priority, buff, withSets,
				sets, init);
		System.out.println(result);
	}

}
