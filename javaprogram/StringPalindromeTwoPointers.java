package javaprogram;

public class StringPalindromeTwoPointers {

	public static void main(String[] args) {

		// String inputString = "Hello, World! 123 ";

		String inputString = "M6a#da1&  m * 78 ";

		String res = inputString.toLowerCase();

		// String inputString = " Hello , World! 123 ";

		// Remove whitespace and special characters using regex
		// String result = res.replaceAll("[^a-zA-Z0-9]", "");

		// Remove whitespace , special characters , numbers using regex
		String result = res.replaceAll("[^a-zA-Z]", "");

		// Remove only whitespace
		// String result = inputString.replaceAll("\\s", "");

		System.out.println("Original string: " + inputString);
		System.out.println("Result string: " + result);

		// Continue checking characters from both ends until they meet in the middle
		if (isPalindrome(result)) {
			System.out.println(result + " is a palindrome.");
		} else {
			System.out.println(result + " is not a palindrome.");
		}
	}

	static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		// Continue checking characters from both ends until they meet in the middle
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false; // Characters do not match, not a palindrome
			}
			left++;
			right--;
		}

		return true; // If the loop completes, it's a palindrome
	}
}
