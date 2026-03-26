package inheritanceconcept;

public class Audi extends Car{
	
	@Override
	public void start()
	{
		System.out.println("AUDI Starting....");
	}
	
	public void theftSafety()
	{
		System.out.println("AUDI TheftSafety....");
	}

}
