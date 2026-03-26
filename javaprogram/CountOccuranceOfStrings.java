package javaprogram;

import java.util.HashMap;

public class CountOccuranceOfStrings {

	public static void getCharCount(String name) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// String name1 = name.toLowerCase(); //To convert all char to lower case and take count

		// char ch[] = name1.toCharArray();

		char ch[] = name.toCharArray();

		for (char c : ch) {
			// if (!String.valueOf(c).isBlank()) { //to remove blank space count
			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		// }
		System.out.println(name + ":" + hm);

	}

	public static void main(String[] args) {

		getCharCount(" Reshmi Mahadevan ");

	}

}
