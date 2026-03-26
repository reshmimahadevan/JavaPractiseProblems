package javaprogram;

public class StringConcept {

	public static void main(String[] args) {
		
		String str = "Java,Maven,Git,TestNG,Jenkins";
		
		String[] strings = str.split(",");
		
		for( String string : strings)
		{
			System.out.print(string +" ");
		}
		
		
		String s1="ABC";
		String s2="XYZ";
		String s3="EFG";
		
		StringBuffer s=new StringBuffer(s1);
		System.out.println(s.append(s2).append(s3));
		
		System.out.println(s1.concat(s2).concat(s3));
	}
	
	

}
