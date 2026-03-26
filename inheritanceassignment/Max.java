package inheritanceassignment;

public class Max extends Hospital{
	
	@Override
	public void registration()
	{
		System.out.println("Max Registration....");
	}
	
	@Override
	public void medicalServices()
	{
		System.out.println("Max Medical Service....");
	}
	
	public void oncologyServices() {
	    System.out.println("Max -- Oncology Services");
	}

}
