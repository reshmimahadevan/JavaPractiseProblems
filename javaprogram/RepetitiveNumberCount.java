package javaprogram;

import java.util.ArrayList;

public class RepetitiveNumberCount {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 2, 2, 8, 8, 3 };

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			int k = 1;
			if (!al.contains(a[i])) {
				al.add(a[i]);
			

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}

				}
				System.out.println(a[i] + " " + "is repeated for" + " " + k + " " + "times");

				if (k == 1) {
					System.out.println("Unique element is" + " " + a[i]);
				}

			}

		}

	}
}