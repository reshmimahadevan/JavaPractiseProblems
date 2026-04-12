package stringmanipulationassignment;

//Write a program to check two different strings equality
public class StringEquality {

	public static void main(String[] args) {

		String s1 = "Reshmi";
		String s2 = "reshmi";

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equalsIgnoreCase(s2));// true
		
		
		String s3 = "reshmi";
		String s4 = "reshmi";
		
		System.out.println(s3 == s4); // true
		System.out.println(s3.equals(s4)); // true
		

	}

}
