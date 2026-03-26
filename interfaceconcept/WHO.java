package interfaceconcept;

//Not possible Class to Interface - FOr Interface parent should be the Interface only
//public interface WHO implements UN 
//public interface WHO  extends UN

public interface WHO {

	public void covidVaccination();
	
	default void medicalInsurance() {
		System.out.println("WHO Medical Insurance....");

	}

}
