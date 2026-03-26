package javaprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMostFrequentCharacter {
	private static void printSecondMaxOccurringChars(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
        //Remove spaces 
		char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();
		
		
       //Occurances of character
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		//Finding the second most frequent character
		Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();

		int maxCount = 0;
		int secondMaxCount = 0;

		for (Entry<Character, Integer> entry : entrySet) {
			int count = entry.getValue();

			//else if working debug "madam" string
			if (count > maxCount) {
				secondMaxCount = maxCount;
				maxCount = count;
			} else if (count > secondMaxCount && count < maxCount) {
				secondMaxCount = count;
			}
		}

		System.out.println("Input String : " + inputString);

		System.out.println("Second Maximum Occurring chars :");
		
		//All character with secondMaxCount
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == secondMaxCount) {
				System.out.print(entry.getKey());
			}
		}
		System.out.println(" : " + secondMaxCount);
	}

	public static void main(String[] args) {
		printSecondMaxOccurringChars("December");
		printSecondMaxOccurringChars("1223334444");
		printSecondMaxOccurringChars("madam");
		printSecondMaxOccurringChars("Java is a good programming language");

	}
}