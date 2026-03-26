package inheritanceassignment;

public class Fortis extends Hospital{
	
	@Override
	public void registration()
	{
		System.out.println("Fortis Registration....");
	}
	
	@Override
	public void medicalServices()
	{
		System.out.println("Fortis Medical Service....");
	}
	
	public void neuroServices() {
	    System.out.println("Fortis -- Neuro Services");
	}


}
