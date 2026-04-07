package exceptionhandling;

public class Error {
	
	public void m1()
	{
		System.out.println("m1");
		m2();
	}
	
	public void m2()
	{
		System.out.println("m1");
		m1();
	}
	
	public static void main(String args[])
	{
		Error e = new Error();
		try
		{
		e.m1();
		}
		catch(StackOverflowError e1)
		{
			System.out.println("Some Error is coming");
			//e1.printStackTrace();
		}
		
		System.out.println("Bye");
	}

}
