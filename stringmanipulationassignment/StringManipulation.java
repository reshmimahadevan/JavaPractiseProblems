package stringmanipulationassignment;

import java.util.Arrays;

public class StringManipulation {

	// Write a function/ method to reverse your own name

	public static String reverseName(String s) {
		int slength = s.length() - 1;
		String reversedName = "";

		for (int i = slength; i >= 0; i--) {
			reversedName = reversedName + s.charAt(i);
		}

		return reversedName;
	}

	// Write a program that gives you the last half of the string

	public static String halfString(String s) {
		int halfLength = s.length() / 2;
		int sLength = s.length() - 1;
		String result = "";

		for (int i = halfLength; i <= sLength; i++) {
			result = result + s.charAt(i);
		}

		return result;
	}

	public static int getSpecificIndex(String str, String target) {
		// indexOf naturally returns -1 if the string is not found
		return str.indexOf(target);
	}

	public static void main(String[] args) {

		String reversedName = reverseName("Reshmi Mahadevan");
		System.out.println(reversedName);

		String halfName = halfString("Reshmi Mahadevan");
		System.out.println(halfName);

		// Write a program that will  print out the last character and first character
		// of a word
		String s = "Reshmi Mahadevan";
		int slength = s.length();
		System.out.println("First character " + s.charAt(0));
		System.out.println("Last character " + s.charAt(slength - 1));

		// Write a program to verify a word or a character contained in the sentence
		String s1 = "Reshmi Mahadevan";
		if (s1.contains("shm")) {
			System.out.println("Word/Char is present");
		} else {
			System.out.println("Word/Char is not present");
		}

		// Write a program to get the 3rd  “ e “ of the string
		String s2 = "Welcome to Naveen Automation Labs ! ";
		// 1st e
		System.out.println(s2.indexOf('e'));
		// 2nd e
		int p2 = (s2.indexOf('e', s2.indexOf('e') + 1));
		System.out.println(s2.indexOf('e', s2.indexOf('e') + 1));
		// 3rd e
		System.out.println(s2.indexOf('e', p2 + 1));

		// Write a method which gives an index of (-1) if string is not available. it
		// should return integer. if String is present, then it should return the
		// specific index

		String message = "Welcome to Naveen Automation Labs";

		// Test cases
		int pos1 = getSpecificIndex(message, "Automation");
		int pos2 = getSpecificIndex(message, "Selenium");

		System.out.println("Index of 'Automation': " + pos1); // Output: 18
		System.out.println("Index of 'Selenium': " + pos2); // Output: -1

		// Write a program that breaks a whole string into small strings, and prints out
		// its all values . (Hint: split, loop)
		String mes = "Welcome to Naveen Automation Labs";

		// Split the string into an array
		String mesg[] = mes.split(" ");

		// Loop directly through 'mesg'
		for (int i = 0; i < mesg.length; i++) {
			System.out.println(mesg[i]);
		}

		// Assume that a string consists of 3 words, print out the middle one

		String mes1 = "Welcome to Automation";

		// Split the string into an array
		String mesg1[] = mes1.split(" ");

		// Loop directly through 'mesg'
		System.out.println("Middle word is: " + mesg1[1]);

		// [^0-9]: The ^ inside the brackets means "NOT". So, this matches every
		// character that is not a number (letters, colons, spaces) and replaces them
		// with a space.
		// replaceAll(" +", " "): This is a cleanup step that turns multiple spaces into
		// a single space.
		String str = "your transaction id is: 12345 and reference id is 34567";
		String ids = str.replaceAll("[^0-9]", " ").replaceAll(" +", " ").trim();
		System.out.println("Transaction IDs found: " + ids);

	}

}
