package javaprogram2025;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		
		System.out.println("Value of a :" +a);
		System.out.println("Value of b :" +b);
		System.out.println("Sum of a and b :" +a+b);
		System.out.println("Sum of a and b :" +(a+b));
		
		String x="hello";
		String y= "world";
		
		//Left to right execution
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		
		double c=12.33;
		double d=23.44;
		System.out.println(x+y+c+d);
		System.out.println(a+b+c+d+x+y);

		char c1='a';
		char c2='b';
	
		System.out.println(c1+c2+x+y);
		System.out.println(c1+""+c2);
		System.out.println(c1+" "+c2);
		System.out.println(c1+' '+c2);
		System.out.println(x+" "+y);
		
		String t1="a";
		String t2="b";
		System.out.println(t1+t2);
		
		System.out.println(c1+' '+c2);
		
		System.out.println(true+x);
		System.out.println('a'+'b'+"hello"+"selenium"+100+200+12.33);
		
		
		//Space ASCII value 32
		System.out.println(' '+' ');
		System.out.println(" "+' ');  //double space
		System.out.println(' ' +" ");//double space
		System.out.println(' ' +" "+"b");
		System.out.println(' '+' '+" ");
		System.out.println(" "+' '+' ');
		System.out.println((' '+' ')+" ");
		
	
	}

}
