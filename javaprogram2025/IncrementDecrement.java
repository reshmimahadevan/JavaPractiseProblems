package javaprogram2025;


public class IncrementDecrement {

	public static void main(String[] args) {
		
		// /(division),*(multiplication),+(addition),-(subtraction)   -->Priority

		// Post Increment - First you assign and then increase
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);

		int h = -99;
		int g = h++;
		System.out.println(h);
		System.out.println(g);

		int s = 5;
		System.out.println(s++);
		System.out.println(s);

		// Pre Increment - First increment and then assign
		int x = 1;
		int y = ++x;
		System.out.println(x);
		System.out.println(y);

		int u = -999;
		int p = ++u;
		System.out.println(u);
		System.out.println(p);

		int total = 10;
		System.out.println(++total);
		System.out.println(total);

		// Post decrement - First assign and then decrement
		int p1 = 1;
		int q1 = p1--;
		System.out.println(p1);
		System.out.println(q1);

		int v = -999;
		int k = v--;
		System.out.println(v);
		System.out.println(k);

		// Pre decrement - First decrease and then assign
		int o = 2;
		int d = --o;
		System.out.println(o);
		System.out.println(d);
		
		int pop=10;
		System.out.println(--pop);
		System.out.println(pop);
		
		int bill=-1000;
		int finalBill = --bill;
		System.out.println(bill);
		System.out.println(finalBill);
		
		
		int th=5;
		System.out.println(th--);
		System.out.println(th);
		
		
		//Interview Questions
		int y1=11;
		int z= y1++ + ++y1;
		System.out.println(z);
		System.out.println(y1);

		
		int f=11,m=22,r;
		r= f+ m+ f++ + m++ + ++f + ++m;
		System.out.println(f);
		System.out.println(m);
		System.out.println(r);
		
		int f1=0;
		int m1= f1++ - --f1 + ++f1 -f1--;
		System.out.println(f1);
		System.out.println(m1);
		
		
//		Cannot increment/decrement boolean as type mismatch
//		boolean b1=true;
//		b1++;
//		System.out.println(b);
		
		int i3= 1,j3=2,k3=3;
		int m3 = i3-- - j3-- - k3--;
		System.out.println(i3);
		System.out.println(j3);
		System.out.println(k3);
		System.out.println(m3);
		
		
		int y2=1,y3=2;
		System.out.println(--y3 - ++y2 + ++y3 - --y2);
		System.out.println(y2);
		System.out.println(y3);
		
		
		int h1=0,u1=0;
		int l= --h1*--u1*u1--*h1--;
		System.out.println(l);
		System.out.println(h1);
		System.out.println(u1);
		
		//int a=++11;  You cannot apply to numbers
		
		int ch='A';
		System.out.println(ch++);
		System.out.println(ch);
		
		char e='A';
		System.out.println(e++);
		System.out.println(e);
		

		
		double do1 = 1.5 ,do2 = 2.5;
		double do3 =do1++ + ++do2;
		System.out.println(do3);
		System.out.println(do1);
		System.out.println(do2);
		
		
		char re='z'; //122
		System.out.println(re++);
		System.out.println(re); //123 so prints {
		
		int de=1;
		while(de<=10)
		{
			System.out.println(++de);
		}
		
		
		
	}

}
