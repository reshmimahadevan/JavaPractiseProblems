package interfaceconcept;

public interface USMedical extends WHO {

	// Interface variables are static and final in nature
	int minfee = 10;

	// Abstract Method - Method without body

	public void dentalServices();

	public void OncologyServices();

	public void physioServices();

	public void emergencyServices();

	// After jdk 1.8 only static method body allowed

	// 1. A static mehtod cannot be abstract in nature

	public static void billing() {
		System.out.println("US Medical billing....");
	}

	// 2. Can have a notstatic method with method body but with the default keyword
	// We can override default method check Fortis class

	// If you have the same default method in UKMedical/Indian Medical then it
	// prompts with error in compile time itself that Duplicate methods are not allowed 
	// Note : not overrided in Fortis coz if called using fortis object the overrided method
	// will only be called coz first it searches in own class and if not present
	// then only check for next ones.
	
	//Even without overriding you can call it by using fortis class object 
	//You can even Inherit it in child class
	//But you cannot have same default method in multiple interfaces
	
	@Override
	default void medicalInsurance() {
		//default method actually contains code (an implementation), it behaves a bit like a method in a regular class.
		WHO.super.medicalInsurance();
		System.out.println("US Medical Insurance....");

	}

	// private non-static method : Abstract? -> Not allowed
	// private void freeMedical();

	// final method :Abstract? -> Not allowed
	// public final void medicalResults()

}
