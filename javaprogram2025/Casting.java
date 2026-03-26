package javaprogram2025;

public class Casting {

	public static void main(String[] args) {

		byte a = 1;
		byte b = 2;

		int c = a + b; // Compiler is well aware that in future if value exceeds the byte range so use
						// integer
		System.out.println(c);

		short s = 100;
		short v = 200;

		int n = s + v; // same goes with short also

		System.out.println(n);

		// Widening
		byte g = 10;
		int u = g;
		System.out.println(u);

		// Narrowing - loosing data happens
		// Byte range is 127 only so data loss happens thats y the o/p is -56
		int r = 200;
		byte e = (byte) r;
		System.out.println(e);

		int r1 = 1;
		byte e1 = (byte) r1;
		System.out.println(e1);

		char c1 = 'a';
		//char-int -> widening , int-byte ->narrowing
		byte b1 = (byte)((int)c1);
		System.out.println(b1);

		// No loss of data eventhough we are storing from big to small data type since
		// number is within int data range
		double do1 = 12.33;
		int in1 = (int) do1;
		System.out.println(in1);
		
		
		//Now data loss happens since 1312 can't be accomodated by byte
		double do2 = 1312.33;
		byte by1 = (byte) do2;
		System.out.println(by1);
		char cv1 = (char)do2;
		System.out.println(cv1);
		double do3 = 97.33;
		char cv2 = (char)do3;
		int in2 =(char)do3;
		System.out.println(cv2);
		System.out.println(in2);
		
		
		//Dataloss
     	System.out.println((byte)1000);
     	
     	int s2 = (byte) 146;
     	System.out.println(s2);
		
		
		
		

	}

}
