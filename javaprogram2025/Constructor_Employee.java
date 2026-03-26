package javaprogram2025;

public class Constructor_Employee {

	String name;
	int id;
	int age;
	double salary;
	String dob;
	char gender;
	boolean isPerm;
	static String companyName = "IBM";
	static int w;

//	public Constructor_Employee() {
//		System.out.println("Default Constructor");
//	}
//
//	public Constructor_Employee(int id) {
//		System.out.println("1 param constructor " + id);
//	}
//
//	public Constructor_Employee(double salary) {
//		System.out.println("1 param constructor " + salary);
//	}

	public Constructor_Employee(int id, double salary) {
		// Global = Local = this
		// The this keyword refers to the current object in a method or constructor.The
		// most common use of the this keyword is to eliminate the confusion between
		// class attributes and parameters with the same name
		this.id = id;
		this.salary = salary;
		Constructor_Employee.w = 4;
		System.out.println("Using this by assigning global to local");
		System.out.println("========================================");
		System.out.println(id + " " + salary); // 1 and 4.5
	}

	public Constructor_Employee(int id, double salary, String name, char gender) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.gender = gender;
		System.out.println("Using this by assigning global to local");
		System.out.println("========================================");
		System.out.println(id + " " + salary + " " + name + " " + salary);
	}

	public Constructor_Employee(int id, int age, String dob, char gender) {
		this.id = id;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		System.out.println("Using this by assigning global to local");
		System.out.println("========================================");
		System.out.println(id + " " + age + " " + dob + " " + gender);
	}

	public Constructor_Employee(String name, int id, int age, double salary, String dob, char gender, boolean isPerm) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.dob = dob;
		this.gender = gender;
		this.isPerm = isPerm;
		System.out.println("Using this by assigning global to local");
		System.out.println("========================================");
		System.out.println(name + " " + id + " " + age + " " + salary + " " + dob + " " + gender + " " + isPerm);
	}

	public static void main(String[] args) {

		Constructor_Employee ce = new Constructor_Employee(1, 4.5);
		System.out.println("Using Object");
		System.out.println("============");
		System.out.println(ce.id + " " + ce.salary + " " + Constructor_Employee.w);// 0 and 0.0 after putting
																					// this.variables values are 1 and
																					// 4.5 now
		Constructor_Employee ce1 = new Constructor_Employee(2, 8.5, "Reshmi", 'F');
		System.out.println("Using Object");
		System.out.println("============");
		System.out.println(ce1.id + " " + ce1.salary + " " + ce1.name + " " + ce1.salary);
		Constructor_Employee ce2 = new Constructor_Employee(3, 28, "04101997", 'F');
		System.out.println("Using Object");
		System.out.println("============");
		System.out.println(ce2.id + " " + ce2.age + " " + ce2.dob + " " + ce2.gender);
		Constructor_Employee ce3 = new Constructor_Employee("Bhavika", 4, 25, 12, "29112000", 'F', true);
		System.out.println("Using Object");
		System.out.println("============");
		System.out.println(ce3.name + " " + ce3.id + " " + ce3.age + " " + ce3.salary + " " + ce3.dob + " " + ce3.gender
				+ " " + ce3.isPerm);
	}

}
