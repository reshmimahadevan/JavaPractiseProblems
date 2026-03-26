 package javaprogram;

public class MaxNumberIntFromString {

	public static void main(String args[]) {
		String str = "1,20,0,5,7,88";

		String[] str1 = str.split(",");
		int[] result = new int[str1.length];
		int max = result[0];
		for (int i = 0; i < str1.length; i++) {
 
			result[i] = Integer.parseInt(str1[i]);
			System.out.print(result[i] + " ");
			if (max < result[i] ) {
				max = result[i];
			}

		}
		System.out.println(" ");
		System.out.println("The maximum number in the integer array is " + max);

	}
}
