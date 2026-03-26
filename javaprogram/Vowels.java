package javaprogram;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {

	public static void main(String[] args) {

//		String input = "ReshmiMahadevan";
//		Pattern p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
//		Matcher m = p.matcher(input);
//		if (m.find()) {
//		    System.out.println(String.format("First vowel %s", m.group()));
//		}
//		 while(m.find()) {
	         // get the matched string
//	         String vowel = m.group();
//	         System.out.print(vowel +" ");
//		}
		 
		String input = "ReshmiMahadevan loves you";
		Set<Character> distinctVowels = new HashSet<Character>();

		Pattern p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(input);

		while (m.find()) {
			
// get the matched vowel
//m.group().charAt(0): This part takes the substring (which is a vowel) obtained from m.group() and uses the charAt(0) method 
//to get the first character of that substring. This is done because m.group() returns a string, and charAt(0) extracts the first character of that string.


			char vowel = m.group().charAt(0);
			distinctVowels.add(vowel);
		}

		System.out.println("Distinct Vowels: " + distinctVowels);

	}

}
