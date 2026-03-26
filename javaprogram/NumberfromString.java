package javaprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberfromString {

	public static void main(String[] args) {

		String string = "Reshmi 1234567 gh24 ik";
		Pattern digitRegex = Pattern.compile("\\d");   /* \\d -Digit */
		Matcher output = digitRegex.matcher(string);
		while (output.find()) {
			System.out.print(output.group());
		}

	}

}
