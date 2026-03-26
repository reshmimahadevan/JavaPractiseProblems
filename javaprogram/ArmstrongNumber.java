package javaprogram;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 153;
		if (isArmstrong(number)) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}

	private static boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0;
		// String.valueOf(num)- Converts Integer to String
		int numberOfDigits = String.valueOf(num).length();

		while (num > 0) {
			// Remainder
			int digit = num % 10;
			sum += Math.pow(digit, numberOfDigits);
			// Quotient
			num /= 10;
		}

		return sum == originalNum;
	}
}
