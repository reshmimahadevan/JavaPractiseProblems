package javaprogram;

import java.util.Scanner;

public class CharacterAndNumberLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input text
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        // Specify the character and number limits
        int maxCharacters = 30;
        int maxNumbers = 3;

        // Remove whitespace from the input text
        String textWithoutWhitespace = inputText.replaceAll("\\s", "");

        // Count the number of characters and numbers
        int characterCount = textWithoutWhitespace.length();
        int numberCount = countNumbers(textWithoutWhitespace);

        // Check if the limits are exceeded
        if (characterCount > maxCharacters) {
            System.out.println("Character limit exceeded. Maximum " + maxCharacters + " characters allowed.");
        }

        if (numberCount > maxNumbers) {
            System.out.println("Number limit exceeded. Maximum " + maxNumbers + " numbers allowed.");
        }

        // Display the character and nRumber counts
        System.out.println("Character count: " + characterCount);
        System.out.println("Number count: " + numberCount);

        scanner.close();
    }

    // Helper method to count the number of digits in a string
    private static int countNumbers(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
