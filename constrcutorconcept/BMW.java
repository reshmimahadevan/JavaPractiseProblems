package constrcutorconcept;

public class BMW extends Car {

	public BMW()
	{
		System.out.println("BMW Constructor");
	}
	
	public BMW(int i)
	{
		super(i);
		System.out.println("BMW Constructor " +i );
	}
}
