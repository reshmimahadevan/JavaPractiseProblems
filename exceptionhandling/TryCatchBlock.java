package exceptionhandling;

public class TryCatchBlock {

	int age;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {

			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.age = 20;// NPE
			int i = 9 / 0;
			System.out.println("hello");

		}

		catch (NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}

		catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}

//      Not Recommended	cause its not readable	
//      If Exception and then Arithmetic written Arithmetic will throw error but its not the case for vice versa
//		catch (Exception e) {
//			System.out.println("Some Exception is coming");
//			e.printStackTrace();
//		}

//      Since Throwable is the parent class for Exception
//		catch (Throwable e) {
//			System.out.println("Some Exception is coming");
//			e.printStackTrace();
//		}

//      Since Object class is super class of all classes		
//      Error:No exception of type Object can be thrown; an exception type must be a subclass of Throwable
//		catch (Object e) {
//			System.out.println("Some Exception is coming");
//			e.printStackTrace();
//		}

		System.out.println("Bye");

	}

}
