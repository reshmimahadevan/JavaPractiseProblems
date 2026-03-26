package javaprogram2025;

public class A_StackOverflowError {

	// A class will be called by JVM
	// Refer StackOverflow file in OneDrive

	public static void main(String[] args) {

		System.out.println("A class");

		B_StackOverflowError.main(args);

	}

}
