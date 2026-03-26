package javaassignment2025;

public class Functions {

	public void addition(int a, int b) {
		System.out.println("Addition " + (a + b));
		subtraction(a, b);
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction " + (a - b));
		multiplication(a, b);
	}

	public void multiplication(int a, int b) {
		System.out.println("Multiplication " + (a * b));
		division(a, b);
	}

	public void division(int a, int b) {
		System.out.println("Division " + (a / b));

	}

	public double multiplication(double a, double b) {
		double result = a * b;
		return result;
	}

	public static void areaOfCircle(Double pi, int radius) {
		double area = pi * radius;
		System.out.println("Area of the circle of radius " + radius + " is " + area);
		circumferenceOfCircle(pi, radius);
	}

	public static void circumferenceOfCircle(Double pi, int radius) {
		double circ = 2 * pi * radius;
		System.out.println("Circumference of the circle of radius " + radius + " is " + circ);

	}

	public void maximumOfThreeNumbers(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("A is greatest " + a);
		} else if (b > c) {
			System.out.println("B is greatest " + b);
		} else {
			System.out.println("C is greatest " + c);
		}
		manimumOfThreeNumbers(a, b, c);
	}

	public void manimumOfThreeNumbers(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println("A is smallest " + a);
		} else if (b < c) {
			System.out.println("B is smallest " + b);
		} else {
			System.out.println("C is smallest " + c);
		}
	}

	public boolean evenOrOdd(int num) {

		System.out.print("The number is " + num + " : ");
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean eligibilityToVote(int age) {

		System.out.print("The age is " + age + " : ");
		if (age >= 18) {
			return true;
		}
		return false;
	}

	public String calculateGrade(int marks) {
		System.out.print("The mark is " + marks + " : ");

		if (marks <= 40) {
			System.out.println("Fail");
			return "FAIL";

		}

		if (marks >= 91 && marks <= 100) {
			System.out.println("Grade AA");
			return "AA";
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("Grade AB");
			return "AB";
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("Grade BB");
			return "BB";
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("Grade BC");
			return "BC";
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("Grade CD");
			return "CD";
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("Grade DD");
			return "DD";
		} else {
			System.out.println("Invalid marks!");
			return "INVALID";
		}
	}

	public static int factorial(int number) {

		int factorial = 1;
		System.out.print("The factorial of " + number + " : ");
		if (number == 0 && number == 1) {
			return 1;
		}

		for (int i = number; i >= 1; i--) {

			factorial = factorial * i;
		}
		return factorial;

	}

	public static boolean compareStrings(String str1, String str2) {

		// Providing these checkpoints for nulll as if Comparing the Strings contains
		// null the program will result in NullPointer Excaption
		// Check it both strings are null
		if (str1 == null && str2 == null) {
			return true;
		}

		// Check if one is null while the other is not
		if (str1 == null || str2 == null) {
			return false;
		}

		// Compare the String
		return str1.trim().equalsIgnoreCase(str2.trim());

	}

	public static void main(String[] args) {

		Functions f1 = new Functions();
		f1.addition(10, 5);
		double result = f1.multiplication(1.2, 1.78);
		System.out.println("Double Multipication " + result);
		areaOfCircle(3.14, 4);
		f1.maximumOfThreeNumbers(11, -52, 3);
		boolean res = f1.evenOrOdd(8);
		if (res) {
			System.out.println("Its Even");
		} else {
			System.out.println("Its Odd");
		}
		boolean age = f1.eligibilityToVote(17);
		if (age) {
			System.out.println("You can vote");
		} else {
			System.out.println("You cannot vote");
		}
		f1.calculateGrade(40);
		f1.calculateGrade(90);
		int factorial = factorial(7);
		System.out.print(factorial);
		System.out.println();
		System.out.println(Functions.compareStrings("reshmi", "Reshmi"));
		System.out.println(Functions.compareStrings(null, "Resh"));
		System.out.println(Functions.compareStrings(null, null));

	}

}
