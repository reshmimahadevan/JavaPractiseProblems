package javaprogram2025;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		// Creating array using new keyword

		int i[] = new int[4];

		// Prints the hash code of memory address where this array is located
		System.out.println(i);

		// Before assigning the values if we try to print default int value 0 will be
		// printed

		System.out.println(i[0]);

		// Assigning the Array vales

		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;

		// Array Index Out Of Bound Exception as no neg values allowed
		// System.out.println(i[-1]);

		// Array Index Out Of Bound Exception as no outside values allowed
		// System.out.println(i[4]);

		System.out.println("Lowest index of an Array = " + 0);
		int len = i.length;
		System.out.println("Highest index of an Array = " + (len - 1));

		System.out.println("============================");

		// Printing all Array values using for loop

		// for(int k=0;k<=len-1;k++)
		for (int k = 0; k < len; k++) {

			System.out.println(i[k]);
		}

		System.out.println("============================");

		// If you don't want to use for loop
		System.out.println(Arrays.toString(i));

		System.out.println("============================");

		// For Each loop
		for (int y : i) {
			System.out.println(y);
		}

		System.out.println("============================");

		int[] p = new int[4];

		// Directely assigning vale to 1st index instead 0 no error assigned value will
		// be printed and for oth index default 0 will be printed
		p[1] = 100;
		p[2] = 'a';

		System.out.println(p[2]);
		System.out.println(p[1]);
		System.out.println(p[0]);

		System.out.println("============================");

		// Different types of data stored in Object Array
		// Name,Age,Female,Salary,isPermanent
		Object employee[] = new Object[5];
		employee[0] = "Reshmi";
		employee[1] = 29;
		employee[2] = "F";
		employee[3] = "20.0";
		employee[4] = true;

		System.out.println(Arrays.toString(employee));

		for (Object e : employee) {
			System.out.println(e);

			// Int equals will be done by == but here we use equals since 29 is treated as
			// Non-Primitive Integer since it belogns to Object class

			if (e.equals(29)) {
				System.out.println("Age of the person is less than 30");
			}
			if (e.equals("Reshmi")) {
				System.out.println("Name is equals Reshmi");
			}
		}

		System.out.println("============================");

		int t[] = new int[4];
		t[0] = 1;
		t[1] = 2;
		t[2] = 3;
		t[3] = 4;

		for (int l = t.length - 1; l >= 0; l--) {
			System.out.println(t[l]);
		}

		System.out.println("============================");

		int count = t.length - 1;
		for (int e : t) {
			// e will point to 0 index to make it point it to last index assigning it to count
			e = count;
			//t[1] = 0;
			System.out.println(e + " " + t[e]);
			count--;

		}

		System.out.println("============================");

		// Character reverse array

		char[] letters = new char[26];
		int index = 0;

		// Fill array from Z to A
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			letters[index++] = ch;
		}

		// for-each loop
		for (char ch : letters) {
			System.out.print(ch + " ");
		}

		System.out.println();
		System.out.println("============================");

		// Creating array using Literals

		int u[] = { 1, 2, 3, 4, 5 };
		System.out.println(u.length);
		System.out.println(u[1]);
		System.out.println(Arrays.toString(u));
		// Loss of data but not in case of Dynamic Array
		u[1] = 0;
		System.out.println(Arrays.toString(u));

	}

}
