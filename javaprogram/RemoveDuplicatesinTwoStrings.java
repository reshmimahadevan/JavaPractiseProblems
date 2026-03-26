package javaprogram;

public class RemoveDuplicatesinTwoStrings {

	public static void main(String[] args) {

		String first = "sudha";
		String second = "reshmi";
		String result = " ";

		for (int i = 0; i < first.length(); i++) {
			if (!second.contains(String.valueOf(first.charAt(i)))) {
				result = result + first.charAt(i);
			}

		}

		System.out.println(result);
	}
}
