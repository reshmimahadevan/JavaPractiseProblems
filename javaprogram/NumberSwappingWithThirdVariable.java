package javaprogram;

public class NumberSwappingWithThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 21;
		int b = 31;
		int c;

		System.out.println("Before Swapping");

		System.out.println("*********************");

		System.out.println("a=" + a);

		System.out.println("b=" + b);

		c = a;
		a = b;
		b = c;

		System.out.println("After Swapping");

		System.out.println("*********************");

		System.out.println("a =" + a);

		System.out.println("b =" + b);
	}
}
