package javaprogram;

public class Unicode {

	public static void main(String args[]) {
		char[] ch1 = new char[] { 'R', 'e', 's', 'h', 'm', 'i' };
		System.out.println("The input is : Reshmi");

		int i1 = 2, l1 = 4;
		int r1 = Character.codePointAt(ch1, i1, l1);

		System.out.println("Unicode code point is : " + r1);

		char[] ch2 = new char[] { 'R', 'a', 'g', 'n', 'i', 'M', 'a', 'h', 'a', 'd', 'e', 'v', 'a', 'n' };
		System.out.println("The input is : RagniMahadevan");

		int i2 = 2, l2 = 11;
		int r2 = Character.codePointAt(ch2, i2, l2);
		System.out.println("Unicode code point is : " + r2);
		
		String myStr = "SudhaMahadevan";
		int result = myStr.codePointCount(0,9);
		System.out.println("The input is : SudhaMahadevan");
		System.out.println("Unicode code point is : " + result);
		
	}
}

