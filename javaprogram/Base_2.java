package javaprogram;

public class Base_2 {
	
private int data ;
	
	public Base_2()
	{
		data = 6;
	}
	
	private int getData()
	{
		return data;
	}

	public static void main(String[] args) {
		
		Base_2 b = new Base_2();
		System.out.println(b.getData());
	}

}
