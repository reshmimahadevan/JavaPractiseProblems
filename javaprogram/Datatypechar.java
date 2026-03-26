package javaprogram;

public class Datatypechar {

	public static void main(String[] args) {
		
		//float f = 3;
		float f = 3f;
		System.out.println(f);
		
		System.out.println('t');
		System.out.println('t'+10);
		
		byte i=30;
		byte j=40;
		// byte k =i+j; -- Error will throw to typecast to int because compiler is well aware that 
		// if in future if the value of i and j increases then it can't be hold by byte so change to 
		//int same goes to short also
		int k =i+j;
		System.out.println(k);
	}

}
