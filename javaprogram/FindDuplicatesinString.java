package javaprogram;

import java.util.Arrays;

public class FindDuplicatesinString {

	public static void findDuplicates(char[] revisedName, int length) {

		int finalName = 0;

		int j;

		for (int i = 0; i < length; i++) {
			for (j = i+1; j < length; j++) {
				if (revisedName[i] == revisedName[j]) {
					revisedName[finalName++] = revisedName[i];
				}
			}

		}
		System.out.println(String.valueOf(Arrays.copyOf(revisedName, finalName)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ragniveshitha";

		char[] revisedName = name.toCharArray();

		int length = revisedName.length;

		findDuplicates(revisedName, length);

	}

}
