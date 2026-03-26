package javaassignment2025;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "Naveen K";
		System.out.println(a + " " + b);

		int i = 74;
		int j = 36;
		System.out.println(i + j);

		System.out.println(50 / 3);

//           Scanner myObj = new Scanner(System.in);  
//           System.out.println("Enter the value of p");
//           double p = myObj.nextDouble(); 
//           System.out.println("Enter the value of q");
//           double q = myObj.nextDouble();
//           System.out.println("Enter the value of r");
//           double r = myObj.nextDouble();
//           System.out.println("Enter the value of s");
//           double s = myObj.nextDouble();
//           System.out.println("Enter the value of t");
//           double t = myObj.nextDouble(); 
//           System.out.println("Enter the value of u");
//           double u = myObj.nextDouble();
//           System.out.println((p*q-r*s)/(t-u));

		String s1 = "Hello Selenium ";
		System.out.println(s1 + 't');

		int g = 100;
		int h = 200;
		int k = 3400;
		int u = g + h + k;
		System.out.println("Your Total amount is. " + u);

		char c = 'h';
		System.out.println((byte) c);
		//OR
		int c1 = c+0;
		System.out.println(c1);

		char d = 'd';
		int result = (int) d + 3;
		System.out.println((char) result);

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number");
		double o = sc1.nextDouble();
		System.out.println("Squareroot of " + o + " is" + " " + o * o);
		//OR
		System.out.println(Math.pow(o, 2));

	}

}
