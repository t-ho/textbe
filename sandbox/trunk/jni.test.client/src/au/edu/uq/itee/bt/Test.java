package au.edu.uq.itee.bt;

public class Test {

	native String ping(String pong);

	static {
		// load library
		System.loadLibrary("jni.test.library");
	}

	public static void main(final String[] args) {
		String ping = new Test().ping("world");
		System.out.println(ping);
	}

	// native method signature
	public native void hello(String name);

}
