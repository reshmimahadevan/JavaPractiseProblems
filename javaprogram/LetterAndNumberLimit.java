package javaprogram;
import java.util.Scanner;

public class LetterAndNumberLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input text
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

      //  Check if the input text has the required length
        if (inputText.length() >= 14) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        // Check if the input text contains the required number of letters and numbers
        int letterCount = countLetters(inputText);
        int numberCount = countNumbers(inputText);

        if (letterCount >= 8) {
            System.out.println("Invalid input. The text must have only 8 letters.");
            scanner.close();
            return;
        }

        if (numberCount >= 6) {
            System.out.println("Invalid input. The text must have only 6 numbers.");
            scanner.close();
            return;
        }

        // Display success message
        System.out.println("Valid input. Accepted!");

        scanner.close();
    }

    // Helper method to count the number of letters in a string
    private static int countLetters(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
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
