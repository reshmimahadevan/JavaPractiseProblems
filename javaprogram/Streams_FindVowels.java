package javaprogram;

import java.util.stream.Collectors;

public class Streams_FindVowels {

	public static void main(String[] args) {

		String str = "ReshmI";

		// Difference between mapTo and map, Refer
		// https://stackoverflow.com/questions/47807758/java-stream-difference-between-map-and-maptoobj
		String vowels = str.chars()
				.filter(c -> "aeiouAEIOU".indexOf(c) >= 0)
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());

		System.out.println(vowels);

	}

}