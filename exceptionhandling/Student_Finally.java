package exceptionhandling;

//Refer Java_24_FinallyBlock_Examples_AccessModifiers_Public_Private_Protected_Default
public class Student_Finally {

	public static int getMarks(String name) {

		System.out.println("getting marks for : " + name);

		if (name.equals("suchi")) {
			// try will look for finally only
			try {
				// int i = 9 / 3;
				int i = 9 / 0;
				System.exit(1);
				return 90;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				return 80;
			} finally {
				System.out.println("Final Marks!!!!!");
				return 50;
			}
		}

		else if (name.equals("Abhi")) {
			return 90;
		} else if (name.equals("riya")) {
			return 80;
		} else {
			System.out.println("student not found..");
			// throw new MyException("studentnotfoundexception");
			// The reason you don't see an ArithmeticException (AE) stack trace is that the
			// return statement inside the finally block effectively "swallows" the
			// exception.
			try {
				int p = 9 / 0;
			} finally {
				return 5;
			}
		}

	}

	public static void main(String[] args) {
		int m = getMarks("reshmi");
		System.out.println(m);

	}

}
