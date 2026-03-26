package javaassignment2025;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {

//		System.out.println("Greatest Number");
//		System.out.println("================");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input the 1st number");
//		int p = sc.nextInt();
//		System.out.println("Input the 2nd number");
//		int q = sc.nextInt();
//		System.out.println("Input the 3rd number");
//		int r = sc.nextInt();
//		System.out.println("Input the 4th number");
//		int s = sc.nextInt();
//		if ((p > q) && (p > r) && (p > s)) {
//			System.out.println("The greatest: " + p);
//		} else if ((q > r) && (q > s)) {
//			System.out.println("The greatest: " + q);
//		} else if (r > s) {
//			System.out.println("The greatest: " + r);
//		} else {
//			System.out.println("The greatest: " + s);
//		}

//		System.out.println("Test a number is positive or negative");
//		System.out.println("======================================");
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Input number:");
//		int num = sc1.nextInt();
//		if (num > 0) {
//			System.out.println("Positive number");
//		} else {
//			System.out.println("Negative number");
//		}
//		System.out.println("Test a number is odd or even");
//		System.out.println("======================================");
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("Input number:");
//		int num = sc2.nextInt();
//		if (num%2 !=0 ) {
//			System.out.println("Odd");
//		} else {
//			System.out.println("Even");
//		}

//		System.out.println("Vowels Or Consonants");
//		System.out.println("====================");
//		Scanner sc3 = new Scanner(System.in);
//		System.out.println("Enter the character");
//		char ch = sc3.next().toLowerCase().trim().charAt(0);
//		switch (ch) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println(ch + "is a vowel");
//			break;
//		default:
//			if (ch >= 'a' && ch <= 'z') {
//				System.out.println(ch + " is a consonant");
//			} else {
//				System.out.println("Input is not a valid alphabet");
//			}

//		System.out.println("Environment Testing");
//		System.out.println("====================");
//		Scanner sc4 = new Scanner(System.in);
//		System.out.println("Enter the environment");
//		String env = sc4.next().toUpperCase();
//		switch (env) {
//		case "QA":
//			System.out.println("Executing in QA env");
//			break;
//		case "STAGE":
//			System.out.println("Executing in STAGE env");
//			break;
//		case "DEV":
//			System.out.println("Executing in DEV env");
//			break;
//		case "UAT":
//			System.out.println("Executing in UAT env");
//			break;
//		case "PROD":
//			System.out.println("Executing in PROD env");
//			break;
//		default:
//			System.out.println("Enter the valid environment");
//		}

//		System.out.println("Book the specific type of car from the Uber app");
//		System.out.println("====================");
//		Scanner sc5 = new Scanner(System.in);
//		System.out.println("Enter the car type");
//		String car = sc5.next().toLowerCase();
//		switch (car) {
//		case "mini":
//			System.out.println("Mini will come and pick you");
//			break;
//		case "sedan":
//			System.out.println("Sedan will come and pick you");
//			break;
//		case "suv":
//			System.out.println("SUV will come and pick you");
//			break;
//		case "premium":
//			System.out.println("Premium will come and pick you");
//			break;
//		default:
//			System.out.println("Please print the right car type");
//		}

//		System.out.println("Launch browser");
//		System.out.println("====================");
//		Scanner sc6 = new Scanner(System.in);
//		System.out.println("Enter the browser");
//		String browser = sc6.next().toLowerCase();
//		switch (browser) {
//		case "chrome":
//			System.out.println("Chrome is launched");
//			break;
//		case "firefox":
//			System.out.println("Firefox is launched");
//			break;
//		case "ie":
//			System.out.println("IE is launched");
//			break;
//		case "safari":
//			System.out.println("Safari is launched");
//			break;
//		default:
//			System.out.println("Please pass the right browser name");
//		}

//		System.out.println("Launch Browser");
//		System.out.println("================");
//
//		Scanner sc7 = new Scanner(System.in);
//		System.out.println("Input the browser name");
//		String browser = sc7.next().toLowerCase();
//		if (browser.equals("chrome")) {
//			System.out.println("Chrome is launched");
//		} else if (browser.equals("firefox")) {
//			System.out.println("Firefox is launched");
//		} else if (browser.equals("ie")) {
//			System.out.println("IE is launched");
//		} else if (browser.equals("safari")) {
//			System.out.println("Safari is launched");
//		} else {
//			System.out.println("Please pass the right browser name");
//		}
//
//		sc7.close(); // Close the scanner to prevent memory leaks
//	}

		String loanType = "Housing Loan";
		double salary = 36000;
		double interestRate = 0;

		switch (loanType) {
		case "Car Loan":
			interestRate = 6.5;
			break;

		case "Housing Loan":
			if (salary < 35000) {
				System.out.println("NA for Housing Loan");
				return; // Exit program if salary condition fails
			}
			interestRate = 7.5;
			break;

		case "Personal Loan":
			interestRate = 10.0;
			break;

		case "Education Loan":
			interestRate = 8.0;
			break;

		default:
			System.out.println("Invalid loan type");
			return; // Exit program for invalid input
		}

		// Print the interest rate only if it's applicable
		System.out.println("Interest rate for " + loanType + " is " + interestRate + "%");

		
	}
}