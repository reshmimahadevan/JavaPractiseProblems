package DataConversion;

import java.util.Arrays;

public class DataConvert {

	public static void main(String[] args) {

		// Wrapper Classes
		// String to Int
		String x = "100";
		System.out.println(x + 20);

		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		// Exception in thread "main" java.lang.NumberFormatException: For input string:
		// "100A" if trying to do int i = Integer.parseInt(y+20);
		String y = "100A";
		int j = Integer.parseInt(y.replace("A", ""));
		System.out.println(j + 20);

		// Null Pointer Exception
        // String y1 = null;
        // Double j1 = Double.parseDouble(y1);

		// Number Format Exception
		String y2 = null;
		Integer j2 = Integer.parseInt(y2);

		String totalPrice = "1000";
		int price = Integer.parseInt(totalPrice);
		System.out.println(price - 100);

		// String to Double
		String s = "100.33";
		System.out.println(s + 20);
		Double d = Double.parseDouble(s);
		System.out.println(d + 20);

		// int to String
		int t = 100;
		System.out.println(t + 20); // 120
		String e = String.valueOf(t); // "100"
		System.out.println(e + 20); // 10020

		// double to String
		double marks = 200.33;
		String m1 = String.valueOf(marks); // "200.33"
		System.out.println(m1 + 20); // "200.3320"

		char ch = 'A';
		String cs = String.valueOf(ch); // "A"
		// Even concat works
		System.out.println(cs + 20); // "A20"

		// String to boolean
		// String tr = "true"; //It will work for TRUE as well
		String tr = "reshmi";
		Boolean flag = Boolean.parseBoolean(tr);
		if (flag) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// boolean to String
		boolean gr = true;
		String k = String.valueOf(gr);
		System.out.println(k); // "true"
		System.out.println(k + 20); // "true20"

		char cd[] = { 's', 'e', 'l', 'e', 'n', 'i', 'u', 'm' };
		String td = String.valueOf(cd);
		System.out.println(td); // selenium

		// Give Memory address only applicable for char array as shown above
//		String ar [] = {"Java","Python","Ruby"};
//		String arr = String.valueOf(ar);
//		System.out.println(arr);

		Integer v = 100;
		Integer v2 = 100;

		if (v == v2) {
			System.out.println("Hi");
		}

		if (v.equals(v2)) {
			System.out.println("hello");
		}

		System.out.println(v + 20); // 120
		int v1 = v.intValue();
		System.out.println(v1);

		// primitive data type compare : ==
		// non-primitive data type compare : .equals

		// Escape Character
		String rest = "I love \"Java code \" and \"Selenium\" programming";
		System.out.println(rest);

		String data = "Reshmi;Mahadevan;9898989898;TN;India";
		String arr[] = data.split(";");
		System.out.println(Arrays.toString(arr));

		// ./|/|| - Java is not treating some characters as we imagine it so use escape
		// characters
		String data1 = "Reshmi.Mahadevan.9898989898.TN.India";
		// String arr1[] = data1.split(".");
		String arr1[] = data1.split("\\.");
		System.out.println(Arrays.toString(arr1));

		String data2 = "Reshmi|Mahadevan|9898989898|TN|India";
		// String arr2[] = data2.split("|");
		String arr2[] = data2.split("\\|");
		System.out.println(Arrays.toString(arr2));

		String data3 = "Reshmi||Mahadevan||9898989898||TN||India";
		// String arr3[] = data3.split("||");
		String arr3[] = data3.split("\\|\\|");
		System.out.println(Arrays.toString(arr3));

		// Number starting with 0 is treated as Octal
		// Octal Number range - 0-7
		// We are doing Octal to Decimal Conversion here

		// 7 = (7 × 8⁰) = 7
		int l = 07;
		System.out.println(l);

		// 053 = (0 × 8²) + (5 × 8¹) + (3 × 8⁰) = 43
		int l1 = 053;
		System.out.println(l1);

	}

}
