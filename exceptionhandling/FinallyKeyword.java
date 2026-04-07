package exceptionhandling;

public class FinallyKeyword {

	public static void main(String[] args) {

		System.out.println("hi");

		try {
			int i = 9 / 0;
		}

//		catch (ArithmeticException e) {
//			System.out.println("AE is coming");
//		}

		finally {
			System.out.println("Byeee -- finally block");
		}

		// In this case the exception is not handled as catch in commented so bye will
		// not printed
		System.out.println("Bye");

	}

}
