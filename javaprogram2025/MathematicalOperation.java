package javaprogram2025;

public class MathematicalOperation {

	public static void main(String[] args) {
          
		System.out.println(9/2);             //4
		System.out.println(9/2.0);           //4.5
		System.out.println(9.0/2);           //4.5
		System.out.println(9.0/2.0);         //4.5
		
		System.out.println(0/9);             //0
		System.out.println(0/9.0);           //0.0
		
		System.out.println(9.0/0);           //Infinity
		System.out.println(9/0.0);           //Infinity
		System.out.println(9.0/0.0);         //Infinity
		//System.out.println(9/0);           //Arithmetic Error
		
		//System.out.println(0/0);           //Arithmetic Error
		System.out.println(0.0/0.0);         //NaN
		System.out.println(0/0.0);           //NaN
		System.out.println(0.0/0);           //NaN
        System.out.println(0.1+0.4);         //0.5
        System.out.println(0.1+0.2);         //0.30000000000000004 
        
        System.out.println(10);              //4 bytes
        System.out.println((byte)10);        //1 byte
        
        char c5 = 97;
        System.out.println(c5);              //ASCII value of a
        System.out.println((byte)c5);        //97

	}

}
