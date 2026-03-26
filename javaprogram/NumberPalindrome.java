package javaprogram;

public class NumberPalindrome {

	public static void main(String[] args) {

		int num = 222;

		int rev = 0;

		int temp = num;

		while (num > 0) {
			int a = num % 10;
			rev = rev * 10 + a;
			num = num / 10;
		}

		if(temp==rev)
		{
			System.out.println(temp +" " +"is a palindrome");
		}
		else
		{
			System.out.println(temp +" "+ "is not a palindrome");
		}
	}

}
