package javaprogram2025;

public class ClassBasics {

	int id;
	String name;
	char gender;
	double salary;
	boolean isPerm;

	public static void main(String args[]) {

		// new Employee() - Object - Heap Memory
		// e1 - Object reference name - Stack Memory

		ClassBasics e1 = new ClassBasics();

		// Local variable
		ClassBasics e2;
		// Creating Object
		e2 = new ClassBasics();

		// Before Initialization
		System.out.println(e1.id + " " + e1.name + " " + e1.gender + " " + e1.salary + " " + e1.isPerm);
		System.out.println("==========================================");

		e1.id = 1;
		e1.name = "Reshmi";
		e1.gender = 'M';
		e1.salary = 25.0;
		e1.isPerm = true;

		// After Initialization
		System.out.println(e1.id + " " + e1.name + " " + e1.gender + " " + e1.salary + " " + e1.isPerm);
		System.out.println("==========================================");

		// Reassigning values
		e1.gender = 'F';
		System.out.println(e1.id + " " + e1.name + " " + e1.gender + " " + e1.salary + " " + e1.isPerm);
		System.out.println("==========================================");

		ClassBasics e3 = new ClassBasics();
		e3.id = 2;
		e3.name = "Bhavika";
		e3.gender = 'F';
		e3.salary = 55.0;
		e3.isPerm = true;
		System.out.println(e3.id + " " + e3.name + " " + e3.gender + " " + e3.salary + " " + e3.isPerm);
		System.out.println("==========================================");

		ClassBasics e4 = new ClassBasics();
		e4.id = 3;
		e4.name = "Sudha";
		e4.gender = 'F';
		e4.salary = 50.0;
		e4.isPerm = true;
		System.out.println(e4.id + " " + e4.name + " " + e4.gender + " " + e4.salary + " " + e4.isPerm);
		System.out.println("==========================================");

		// Assigning one reference variable to another
		e1 = e3 = e4;
		System.out.println(e1.id + " " + e1.name + " " + e1.gender + " " + e1.salary + " " + e1.isPerm);
		System.out.println(e3.id + " " + e3.name + " " + e3.gender + " " + e3.salary + " " + e3.isPerm);
		System.out.println(e4.id + " " + e4.name + " " + e4.gender + " " + e4.salary + " " + e4.isPerm);
		System.out.println("==========================================");

		e1 = e3; // (e1 starts pointing to e3)
		System.out.println("==========================================");
		System.out.println(e1.id + " " + e1.name + " " + e1.gender + " " + e1.salary + " " + e1.isPerm);
		System.out.println(e3.id + " " + e3.name + " " + e3.gender + " " + e3.salary + " " + e3.isPerm);
		System.out.println(e4.id + " " + e4.name + " " + e4.gender + " " + e4.salary + " " + e4.isPerm);
		System.out.println("==========================================");

		e3 = e4; // (e3 starts pointing to e4)
		System.out.println(e1.id + " " + e1.name + " " + e1.gender + " " + e1.salary + " " + e1.isPerm);
		System.out.println(e3.id + " " + e3.name + " " + e3.gender + " " + e3.salary + " " + e3.isPerm);
		System.out.println(e4.id + " " + e4.name + " " + e4.gender + " " + e4.salary + " " + e4.isPerm);
		System.out.println("==========================================");

		e4 = e1; // (e4 starts pointing to e1)
		System.out.println(e1.id + " " + e1.name + " " + e1.gender + " " + e1.salary + " " + e1.isPerm);
		System.out.println(e3.id + " " + e3.name + " " + e3.gender + " " + e3.salary + " " + e3.isPerm);
		System.out.println(e4.id + " " + e4.name + " " + e4.gender + " " + e4.salary + " " + e4.isPerm);
		System.out.println("==========================================");

		// No reference
		new ClassBasics();
		new ClassBasics().gender = 'F';
		// We cannot print like this again a new object will be created and pointing
		// gender to default value i.e. space
		System.out.println(new ClassBasics().gender);

		// Null reference
		// ClassBasics r = new ClassBasics();
		// r = null;
		// r.name = null;
		// r.gender = 'F';
		// System.out.println(r.gender);
		// System.gc(); //No guarentee that gc will be called monitiored by JVM

	}

}
