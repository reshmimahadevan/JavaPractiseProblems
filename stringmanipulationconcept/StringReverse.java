package stringmanipulationconcept;

import java.util.Arrays;

public class StringReverse {

	public static String reverse(String s) {

		// Null check
		if (s == null) {
			throw new RuntimeException("VALUE CANNOT BE NULL");
		}

		// If String has only 1 character or no character
		if (s.length() == 1 || s.length() == 0) {
			return s;
		}

		// So many combinations will be created in the memory
		String str = "";
		int length = s.length();
		for (int i = length - 1; i >= 0; i--) {
			str = str + s.charAt(i);
		}

		return str.trim();

	}

	public static String[] reverseStringArray1(String s) {

		// Remove spaces from input first
		// String noSpaces = s.replace(" ", "");

//		String[] str = new String[noSpaces.length()];
//
//		int j = 0;
//		for (int i = noSpaces.length() - 1; i >= 0; i--) {
//			str[j] = String.valueOf(noSpaces.charAt(i));
//			j++;
//		}

		String[] str = new String[s.length()]; // ✅ use original string with spaces

		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			str[j] = String.valueOf(s.charAt(i));
			j++;
		}

		return str;
	}


	public static void reverseStringArray2(String s) {

		String st[] = s.split(" ");
		for (int i = 0; i <= st.length - 1; i++) {

			String word = st[i];
			String reversedWord = "";

			for (int k = word.length() - 1; k >= 0; k--) {
				reversedWord = reversedWord + word.charAt(k);
			}

			System.out.print(reversedWord + " ");
		}

	}

	public static void main(String[] args) {

		String s = "Selenium";
		String reverse = reverse(s);
		System.out.println(reverse);
		System.out.println(reverse("Reshmi"));
		System.out.println(reverse("T"));
		// System.out.println(reverse(null));
		System.out.println(reverse(" "));
		System.out.println(reverse("123"));
		System.out.println(reverse("null"));
		System.out.println(reverse("testing "));

		// Arrays.toString() → adds commas and brackets ❌
		// [y, b, u, R, , n, o, h, t, y, P, , a, v, a, J]

		// String.join("") → joins everything with empty string ✅
		// ybuR nohtyP avaJ

		System.out.println(Arrays.toString(reverseStringArray1("Java Python Ruby")));
		System.out.println(String.join("", reverseStringArray1("Java Python Ruby")));

		reverseStringArray2("Java Python Ruby");

	}

	// Best Approach
	public static String reverseUsingStringBuffer(String s) {

		StringBuilder sb = new StringBuilder(); // ✅ ONE object created
		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			sb.append(s.charAt(i)); // ✅ keeps appending to same object
		}

		return sb.toString().trim();
	}
}
