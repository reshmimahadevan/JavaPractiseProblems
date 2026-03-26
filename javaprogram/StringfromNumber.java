package javaprogram;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class StringfromNumber {

	public static void main(String[] args) {

		String stringToSearch = "Reshmi 1234567 gh24 ik";

		int count = 0;

		for (char c : stringToSearch.toCharArray()) {
			if (Character.isLetter(c)) {
				System.out.print(c);
				count++;

			}

		}

		System.out.println(" NonDigit Count is " +count);

	}

}

//		Pattern digitRegex = Pattern.compile("\\D");          /* \\D -Not Digit */
//		Matcher string = digitRegex.matcher(stringToSearch);
//		while (string.find()) {
//			System.out.print(string.group());
//		}
