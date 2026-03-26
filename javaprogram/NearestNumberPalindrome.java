package javaprogram;

import java.util.Scanner;

public class NearestNumberPalindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        int nearestPalindrome = findNearestPalindrome(inputNumber);
        System.out.println("Nearest palindrome number: " + nearestPalindrome);

        scanner.close();
    }

    private static int findNearestPalindrome(int number) {
        int smallerPalindrome = findSmallerPalindrome(number - 1);
        int largerPalindrome = findLargerPalindrome(number + 1);

        // Find the nearest palindrome
        if (number - smallerPalindrome <= largerPalindrome - number) {
            return smallerPalindrome;
        } else {
            return largerPalindrome;
        }
    }

    private static int findSmallerPalindrome(int num) {
        while (!isPalindrome(num)) {
            num--;
        }
        return num;
    }

    private static int findLargerPalindrome(int num) {
        while (!isPalindrome(num)) {
            num++;
        }
        return num;
    }

    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}


	
