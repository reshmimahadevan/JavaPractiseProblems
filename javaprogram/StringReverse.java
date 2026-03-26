package javaprogram;

public class StringReverse {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String name = "Reshmi";

		System.out.println("The original string is"+" "+ name);

		char reversedName = ' ';

		String output = " ";

		for (int i = name.length() - 1; i >= 0; i--)

		{

			reversedName = name.charAt(i);

			output = output + reversedName;

		}

		System.out.println("The reversed string is" +" "+ output);

	}

}
