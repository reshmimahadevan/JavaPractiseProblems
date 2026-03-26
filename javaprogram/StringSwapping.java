package javaprogram;

public class StringSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Reshmi";

		String s2 = "Mahadevan";

		System.out.println("Before Swapping");

		System.out.println("*********************");

		System.out.println("String s1 =" + s1);

		System.out.println("String s2 =" + s2);

		s1 = s1 + s2;

		s2 = s1.substring(0, s1.length() - s2.length());

		s1 = s1.substring(s2.length());

		System.out.println("After Swapping");

		System.out.println("*********************");

		System.out.println("String s1 =" + s1);

		System.out.println("String s2 =" + s2);
	}

}
