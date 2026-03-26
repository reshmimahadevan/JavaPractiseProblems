package javaprogram2025;

public class TestingStack {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
		System.out.println("Bye");
	}

	public void m3() {
		System.out.println("m3 method");
		//m1(); //Before it was not there included to showcase StackOverflow
	}

	public static void main(String[] args) {

		TestingStack ts = new TestingStack();
		ts.m1(); // 4 (main/m1/m2/ - stack) - Refer StackOverflow file in OneDrive

	}

}
