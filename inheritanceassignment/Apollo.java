package inheritanceassignment;

public class Apollo extends Hospital{
	
	@Override
	public void registration()
	{
		System.out.println("Apollo Registration....");
	}
	
	@Override
	public void medicalServices()
	{
		System.out.println("Apollo Medical Service....");
	}

	public void emergencyServices() {
	    System.out.println("Apollo -- Emergency Services");
	}
}
