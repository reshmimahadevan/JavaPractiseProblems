package javaassignment2025;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		// Remove 22 from Array

		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int a[] = new int[p.length - 1];
		int j = 0;

		for (int i = 0; i <= p.length - 1; i++) {

			if (p[i] != 22) {
				a[j] = p[i];
				j++;

			}

		}

		System.out.println(Arrays.toString(a));

		System.out.println("=====================");

//		Write a program to create a static Array, having following cricket data:
//
//                        --name, age, team name, DOB, gender, Strike Rate
//
//                        --Try to create multiple Object Arrays for different players 
//
//                        --Try to print all the values of each player on the console

		Object player[][] = new Object[5][5];
		Object players[][] = new Object[player.length][player.length];

		player[0][0] = "Rohit";
		player[0][1] = 29;
		player[0][2] = "MI";
		player[0][3] = 'F';
		player[0][4] = 80;

		player[1][0] = "Smrithi";
		player[1][1] = 20;
		player[1][2] = "RCB";
		player[1][3] = 'F';
		player[1][4] = 60;

		player[2][0] = "Dhoni";
		player[2][1] = 40;
		player[2][2] = "CSK";
		player[2][3] = 'M';
		player[2][4] = 100;

		player[3][0] = "Kholi";
		player[3][1] = 35;
		player[3][2] = "RR";
		player[3][3] = 'M';
		player[3][4] = 30;

		player[4][0] = "Deepthi";
		player[4][1] = 28;
		player[4][2] = "PW";
		player[4][3] = 'F';
		player[4][4] = 65;

		for (int i = 0; i < player.length; i++) {
			System.out.println("Player " + i);
			System.out.println("************");
			for (int k = 0; k < player.length; k++) {

				players[i][k] = player[i][k];
				System.out.println(players[i][k]);

			}

			System.out.println("=====================");
		}

		for (int l = 0; l <= 5; l++) {
			for (int m = 0; m <= 5; m++) {
				for (int n = 0; n <= 5; n++) {

					System.out.print(l + "" + m + "" + n + " ");
				}

				System.out.println();
			}
		}

	}

}
