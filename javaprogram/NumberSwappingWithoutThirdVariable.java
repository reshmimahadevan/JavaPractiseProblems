package javaprogram;

public class NumberSwappingWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 21;
		int b = 31;

		System.out.println("Before Swapping");

		System.out.println("*********************");

		System.out.println("a=" + a);

		System.out.println("b=" + b);

		a = a + b;

		b = a - b;

		a = a - b;

		System.out.println("After Swapping");

		System.out.println("*********************");

		System.out.println("a =" + a);

		System.out.println("b =" + b);
	}
}
