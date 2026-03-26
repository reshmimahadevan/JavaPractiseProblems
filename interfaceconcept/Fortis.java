package interfaceconcept;

public class Fortis extends Medical implements USMedical, UKMedical, IndianMedical {

	static final int minfee = 50;

	@Override
	public void dentalServices() {

		System.out.println("FH(USA) -- dentalServices");

	}

	@Override
	public void OncologyServices() {

		System.out.println("FH(USA) -- OncologyServices");
	}

	@Override
	public void physioServices() {

		System.out.println("FH(USA) -- physioServices");
		// Medical Insurance is present in its own class so it will call that if not it
		// will call the inherited ones form USMedical
		medicalInsurance();

	}

	@Override
	public void entServices() {
		System.out.println("FH(UK) -- entServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH(UK) -- pediaServices");

	}

	@Override
	public void dermaServices() {
		System.out.println("FH(UK) -- dermaServices");

	}

	@Override
	public void gynoServices() {

		System.out.println("FH(India) -- gynoServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH(India) -- cardioServices");

	}

	@Override
	public void nueroServices() {
		System.out.println("FH(India) -- nueroServices");

	}

	// Individual Methods
	public void medicalTraining() {
		System.out.println("FH -- Medical Training");
	}

	public void pathalogyService() {
		System.out.println("FH -- Pathalogy Services");
	}

	@Override
	public void emergencyServices() {

		System.out.println("FH -- Emergency Services");

	}

	public static void billing() {
		System.out.println("Fortis billing....");
	}

	// Trying to override the default method of USMedical Interface
	// Prompts with error - so remove default keyword and replace it with public
	

	@Override
	public void medicalInsurance() {
		System.out.println("Fortis Insurance....");

	}

	// WHO
	@Override
	public void covidVaccination() {

		System.out.println("Fortis -- Covid Vaccination");

	}
	
	@Override
	public void medicalRD()
	{
		System.out.println("Medical R and D");
	}

}
