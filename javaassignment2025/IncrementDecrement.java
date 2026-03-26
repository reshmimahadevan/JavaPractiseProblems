package javaassignment2025;

public class IncrementDecrement {

	public static void main(String[] args) {

		int i = 11;

		i = i++ + ++i;

		System.out.println(i);

		System.out.println("-----------------");

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println("a=" + a);

		System.out.println("b=" + b);

		System.out.println("c=" + c);

		System.out.println("-----------------");
		
		int i1=0;

		i1 = i1++ - --i1 + ++i1 - i1--;

	    System.out.println(i1);
	    
	    System.out.println("-----------------");
	    
//	    boolean b1 = true;

//	    b1++;

//	    System.out.println(b1);  Cannot increment boolean value
	    
	    int i2=1, j=2, k=3;

	    int m = i2-- - j-- - k--;

	    System.out.println("i="+i2 );

	    System.out.println("j="+j);

	    System.out.println("k="+k);

	    System.out.println("m="+m);
	    
	    System.out.println("-----------------");
	    
	    int a1=1, b1=2;

	    System.out.println(--b1 - ++a1 + ++b1 - --a1);
	    
	    System.out.println(a1);
	    
	    System.out.println(b1);
	    
	    System.out.println("-----------------");
	    
	    int i3=19, j3=29, k3=0;

	    int m1 = i3-- - j3-- - k3--;

	    System.out.println("i="+i3);

	    System.out.println("j="+j3);

	    System.out.println("k="+k3);
	    
	    System.out.println(m1);
	    
	    System.out.println("-----------------");

//	    int i4 = 11;

//	    int j4 = --(i4++);  Cannot be declared like this
	    
	    int m2= 0, n = 0;

	    int p = --m2 * --n * n-- * m2--;

	    System.out.println(p);
	    
	    System.out.println(m2);
	    
	    System.out.println(n);
	    
	    System.out.println("-----------------");
	    
	    int a2=1;

	    a2 = a2++ + ++a2 * --a2 - a2--;

	    System.out.println(a2);
	    
	    System.out.println("-----------------");
	    
//	    int a3 = 11++; Cannot increment numbers

//	    System.out.println(a3); 
	    
	    int ch = 'A';

	    System.out.println(ch++);
	    
	    System.out.println("-----------------");
	    
	    char ch1 = 'A';

	    System.out.println(++ch1);
	    
	    System.out.println("-----------------");
	    
	    double d = 1.5, D = 2.5;

	    System.out.println(d++ + ++D);
	    
	}

}
