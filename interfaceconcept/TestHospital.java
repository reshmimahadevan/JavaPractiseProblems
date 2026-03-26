package interfaceconcept;

//Check the Interface Diagram for the flow - Onedrive
//Collor Class - Creating the objects and calling the methods
public class TestHospital {

	public static void main(String[] args) {

		Fortis fh = new Fortis();
		fh.dentalServices();
		fh.physioServices();
		fh.OncologyServices();
		fh.entServices();
		fh.pediaServices();
		fh.dermaServices();
		fh.gynoServices();
		fh.cardioServices();
		fh.nueroServices();
		fh.medicalTraining();
		fh.pathalogyService();
		fh.emergencyServices();
		//Medical Insurance is present in its own class so it will call that if not it will call the inherited ones form USMedical
		fh.medicalInsurance(); //Inherited
		fh.covidVaccination();
		fh.medicalNews();	
		fh.medicalRD();

		// Top Casting - Child class object reffered by parent class interface variable

		USMedical us = new Fortis();
		us.dentalServices();
		us.physioServices();
		us.OncologyServices();
		us.emergencyServices();
		System.out.println("------------");
		us.medicalInsurance();
		us.covidVaccination();
		
		//Top Casting - Interface  - Webdriver->ChromeDriver->JavascriptExecutor
		//Not only same level type casting
		
		UKMedical uk = (UKMedical)us;
		uk.entServices();
		uk.pediaServices();
		uk.dermaServices();
		uk.emergencyServices();
		us.dentalServices();
		us.physioServices();
		us.OncologyServices();
		us.medicalInsurance();
		us.emergencyServices();
		us.covidVaccination();
		
		//Parent-child type casting also allowed
		WHO w =(WHO)us;
		w.covidVaccination();
	
		
		System.out.println(USMedical.minfee);
		
		System.out.println(Fortis.minfee);

		// Down Casting - Cannot create object for Interface so fails at compile time
		// itself

		// Fortis fh1 = new USMedical();

		USMedical.billing();

		Fortis.billing();
		
		

	}

}
