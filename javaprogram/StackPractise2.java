package javaprogram;

import java.util.Stack;

public class StackPractise2 {
    public static void main(String[] args) {
        String s = "1hi23hello456";
        String result = reverseDigitsSubstring(s);
        System.out.println(result);
    }

    private static String reverseDigitsSubstring(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentDigits = new StringBuilder();
        Stack<Character> digitStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitStack.push(ch);
            } else {
                while (!digitStack.isEmpty()) {
                    currentDigits.append(digitStack.pop());
                }
                result.append(currentDigits).append(ch);
                currentDigits.setLength(0); // Reset currentDigits for the next substring
            }
        }

        // Append any remaining digits at the end of the string
        while (!digitStack.isEmpty()) {
            currentDigits.append(digitStack.pop());
        }
        result.append(currentDigits);

        return result.toString();
    }
}
