package stringmanipulationconcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "Hi Good Morning.This is my Java Code.I feel happy today.Hiii";

		// Finding length
		System.out.println(str.length());
		int len = str.length();
		System.out.println("Li= " + 0);
		System.out.println("Hi= " + (len - 1));

		// What char is present on a specific index
		System.out.println(str.charAt(50));
		System.out.println(str.charAt(2)); // Space
		// System.out.println(str.charAt(55));//SIOB
		// System.out.println(str.charAt(-1));//SIOB

		// What inndex is present for a specific char
		System.out.println(str.indexOf('M'));

		// 1st occurance of i
		System.out.println(str.indexOf('i')); // Many i are present if it finds the 1st i it will print that paticular
												// index

		// This is a two-step process:
		// Step 1 → str.indexOf('i') finds the 1st 'i' at position 3
		// Step 2 → Add +1 to get position 4, then say: "Now start searching from
		// position 4 onwards, find me the next 'i'."
		// It skips past the first 'i' and finds the second one → prints 8

		// 2nd occurance of i
		System.out.println(str.indexOf('i', str.indexOf('i') + 1)); // Looking for next index i but start form 2nd index

		int p2 = (str.indexOf('i', str.indexOf('i') + 1));
		System.out.println("Second occurance " + p2);

		int p3 = str.indexOf('i', p2 + 1);
		System.out.println("Third occurrence " + p3);

		int p4 = str.indexOf('i', p2 + p3 + 1);
		System.out.println("Fourth occurance " + p4);

		// Checks for Substrings as well
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("Python")); // -1 as Python is not present

		String mesg = "Welcome admin";
		if (mesg.indexOf("admin") == 8) {
			System.out.println("Admin is present--PASS");
		} else {
			System.out.println("Admin is not present--FAIL");
		}

		String m1 = "Adopting safety measures and cultivating awareness of potential pitfalls is essential for a secure and satisfying experience.";
		if (m1.indexOf("essential for a") >= 0) {
			System.out.println("PASS");
		}

		String t1 = "     hello world     ";
		// trim - remove spaces from the corner
		System.out.println(t1.trim());

		String l1 = "hello jAva world";
		System.out.println(l1.toUpperCase());
		System.out.println(l1.toLowerCase());

		// Replace
		String dob = "01-01-1997";
		System.out.println(dob.replace("-", "/"));

		String t2 = "hello world";
		System.out.println(t2.replace(" ", ""));

		// Contains - Returns Boolean value
		String test = "I love Java Coding";
		System.out.println(test.contains("Java"));
		System.out.println(test.contains("java")); // false

		if (test.contains("Java")) {
			System.out.println("PASS");

		} else {
			System.out.println("FAIL");
		}
		
		//Equals - Returns Boolean Value
		//Case Sensitive
		String r1 = "Hello Selenium";
		//String r2 = "Hello selenium ";
		//System.out.println(r1.equalsIgnoreCase(r2));//false so indroducing trim to make it true
		String r2 = "Hello selenium ";
		System.out.println(r1.equals(r2)); //false
		System.out.println(r1.equalsIgnoreCase(r2.trim()));//true
		

		//Split
		String lang="JAVA_PYTHON_RUBY_JAVASCRIPT";
		String arr[] = lang.split("_");
		System.out.println(arr[0]);
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		//Very famous Interview Question
		String pop = "xXHelloXxXSeleniumxXTestingXxXGoogleX";
		String arr1[] = pop.split("xX");
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[0]); //Space
		System.out.println(arr1[0].length()); //Nothing
		//System.out.println(arr1[5]);//AIOB
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("naveen;automation;labs".split(";")[0]);
		
		String otp = "Your OTP is 12345";
		String arr2[] = otp.split(" ");
		System.out.println(arr2[arr2.length-1]);
		
		
	}
}
