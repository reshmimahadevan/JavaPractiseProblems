package inheritanceassignment;

public class TestHospitalClass {

	public static void main(String args[]) {

		Hospital h = new Hospital();
		h.registration();
		h.treatPatients();
		h.medicalServices();
		Hospital.billing();

		Apollo a = new Apollo();
		a.registration();
		a.medicalServices();
		a.emergencyServices();
		a.treatPatients();
		Apollo.billing();

		Fortis f = new Fortis();
		f.registration();
		f.medicalServices();
		f.neuroServices();
		f.treatPatients();
		Fortis.billing();

		Max m = new Max();
		m.registration();	
		m.medicalServices();
		m.oncologyServices();
		m.treatPatients();
		Max.billing();

		Hospital h1 = new Apollo();
		h1.registration();
		h1.treatPatients();
		h1.medicalServices();

		Hospital h2 = new Fortis();
		h2.registration();
		h2.treatPatients();
		h2.medicalServices();

		Hospital h3 = new Max();
		h3.registration();
		h3.treatPatients();
		h3.medicalServices();
	
		Max m1 = (Max)new Hospital();
	}
}