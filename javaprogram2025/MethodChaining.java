package javaprogram2025;

public class MethodChaining {

	// NS -- NS > direct calling
	// S -- S > direct calling/using class name
	// NS -- S > direct calling/using class name
	// S -- NS > create an object and call

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
		t1();
	}

	public void m3() {
		System.out.println("m3 method");
		MethodChaining.t1();
	}

	public void m4() {
		System.out.println("bye m4");
	}

	public static void t1() {
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
		MethodChaining mc1 = new MethodChaining();
		mc1.m4();
	}

	public static void main(String[] args) {

		MethodChaining mc = new MethodChaining();
		mc.m1();
		MethodChaining.t1();

	}

}
