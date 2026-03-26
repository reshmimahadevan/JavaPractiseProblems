package javaassignment2025;

public class Loops {

	public static void main(String[] args) {

		System.out.println("Using While");
		int u = 0;
		while (u < 5) {
			System.out.println("I am Batman");
			u++;
		}
		System.out.println("========================");
		System.out.println("Using For");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Batman﻿");
		}

		System.out.println("========================");

		for (int i = 1; i <= 9; i++) {
			System.out.println("I am Batman" + " " + i);
		}

		System.out.println("========================");
		System.out.println("Using For Loop");

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("========================");
		System.out.println("Using While Loop");

		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		System.out.println("========================");
		System.out.println("Using Do-While Loop");

		int k = 10;
		do {

			System.out.println(k);
			k--;

		} while (k >= 1);

		System.out.println("========================");

		String message = "Hello World";
		int j = 1;
		while (j <= 10) {
			System.out.println(message);
			j++;
		}

		System.out.println("========================");
		System.out.println("Printing * of 5 until 100 using For Loop");

		for (int l = 1; l <= 100; l++) {
			if (l % 5 == 0) {
				System.out.println(l);
			}
		}

		System.out.println("========================");
		System.out.println("Printing * of 5 until 100 using While Loop");

		int l = 1;
		while (l <= 100) {
			if (l % 5 == 0) {
				System.out.println(l);
			}
			l++;
		}

		System.out.println("========================");
		System.out.println("Printing * of 5 until 100 using Do-While Loop");

		int o = 1;
		do {
			if (o % 5 == 0) {
				System.out.println(o);

			}
			o++;

		} while (o <= 100);

		System.out.println("========================");
		System.out.println("Printing Odd and Even using For Loop");
		System.out.println("Even Numbers");
		for (int s = 1; s <= 100; s++) {

			if (s % 2 == 0) {
				System.out.println(s);
			}
		}
		System.out.println("========================");
		System.out.println("Odd Numbers");
		for (int h = 1; h <= 100; h++) {

			if (h % 2 != 0) {
				System.out.println(h);
			}

		}

//		System.out.println("========================");
//		int m = 1;
//
//		while (m <= 1) {
//
//			System.out.println("Hi Java");
//
//		}   ->  Output - Infifnite loop

		System.out.println("========================");
		System.out.println("ASCII using For Loop");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + "=" + (byte) ch);
		}

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + "=" + (byte) ch);

		}
		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println(ch + " = " + (byte) ch);
		}

		System.out.println("========================");
		System.out.println("ASCII using While Loop");
		char ch = 'a';
		while (ch <= 'z') {
			System.out.println(ch + "=" + (byte) ch);
			ch++;
		}
		char ch1 = 'A';
		while (ch1 <= 'Z') {
			System.out.println(ch1 + "=" + (byte) ch1);
			ch1++;
		}
		char ch2 = '0';
		while (ch2 <= '9') {
			System.out.println(ch2 + "=" + (byte) ch2);
			ch2++;
		}

		System.out.println("========================");
		System.out.println("Printing Series 1");
		for (double t = 1.0; t <= 10.0; t++) {
			System.out.print(t + " ");
		}

		System.out.println(" ");
		System.out.println("========================");
		System.out.println("Printing Series 2");
		for (int y = 0; y <= 11; y++) {
			int result = y * 9;
			System.out.print(result + " ");
		}

		System.out.println(" ");
		System.out.println("========================");
		System.out.println("Vowels using For Loop");
		for (char c = 'a'; c <= 'z'; c++) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.print(c + " ");
			}
		}

		System.out.println(" ");
		System.out.println("========================");
		System.out.println("Vowels using While Loop");
		char c1 = 'a';
		while (c1 <= 'z') {
			if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
				System.out.print(c1 + " ");
			}

			c1++;
		}

		System.out.println("");
		System.out.println("=====================");
		System.out.println("Break immediately if you find the * of 7 from 1 to 10");
		for (int d = 1; d <= 7; d++) {

			System.out.println(d);
			if (d % 7 == 0) {
				System.out.println("Bye, see you tomorrow");
				break;
			}
		}
	}
}
