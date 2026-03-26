package javaprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccurringChar {
	private static void printMaxOccurringChar(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();

		int maxCount = 0;
		//char maxChar;

		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();

				char maxChar = entry.getKey();
			}
		}

		System.out.println("Input String : " + inputString);

		System.out.println("Maximum Occurring char and its count :");

		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == maxCount) {
				System.out.print(entry.getKey());
			}
		}
		System.out.println(" : " + maxCount);
	}

	public static void main(String[] args) {

		printMaxOccurringChar("December");
		printMaxOccurringChar("1223334444");
		printMaxOccurringChar("madam");
		printMaxOccurringChar("Java is a good programming language");
	}
}