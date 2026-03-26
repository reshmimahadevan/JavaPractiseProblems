package javaprogram;

import java.util.Stack;

public class StackPractise1 {

	public static void main(String[] args) {
		String s = "1hi45hi";
		String result = reverseNonDigitSubstring(s);
		System.out.println(result);
	}

	private static String reverseNonDigitSubstring(String s) {
		StringBuilder result = new StringBuilder();
		Stack<Character> nonDigitStack = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				while (!nonDigitStack.isEmpty()) {
					result.append(nonDigitStack.pop());
				}
				result.append(ch);
			} else {
				nonDigitStack.push(ch);
			}
		}

		while (!nonDigitStack.isEmpty()) {
			result.append(nonDigitStack.pop());
		}

		return result.toString();
	}
}