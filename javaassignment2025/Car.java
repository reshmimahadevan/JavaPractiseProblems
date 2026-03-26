package javaassignment2025;

public class Car {

	String make;
	String model;
	int year;

	public Car() {

		this.make = "Unknown";
		this.model = "Unknown";
		this.year = 0;

	}

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;

	}

	public static void main(String args[]) {

		Car c1 = new Car();

		System.out.println(c1.make + " " + c1.model + " " + c1.year);

		Car c2 = new Car();
		c2.make = "BMW";
		c2.model = "B1";
		c2.year = 2019;

		System.out.println(c2.make + " " + c2.model + " " + c2.year);

		Car c3 = new Car("Audi", "A5", 2018);

		System.out.println(c3.make + " " + c3.model + " " + c3.year);

	}
}

//Questions:
//1.What is the purpose of a default constructor in Java?The purpose of a default constructor is to initialize an object with default values (like null for Strings or 0 for integers) when no arguments are passed during object creation.
//2.Can a default constructor take in parameters?No. By definition, a default constructor (or a no-argument constructor) does not take any parameters. If you add parameters, it becomes a parameterized constructor.
//3.Can a constructor be overloaded in Java? If so, what does it mean to overload a constructor?Yes. Constructor overloading means having more than one constructor in the same class, but with different parameter lists (different types, number, or order of arguments). In your code, you overloaded the Car constructor by having one with no parameters and one with three parameters (String, String, int).
//4.Can you create an object of a Java class without calling a constructor?No. Every time you use the new keyword to create an object (e.g., new Car()), a constructor must be called to allocate memory and initialize the object. If you don't write one yourself, Java provides an invisible "implicit" default constructor for you.
//5.How are instance variables accessed and modified outside of the class they are defined in?They are accessed and modified using the dot operator (.) on an object instance.
//To access: System.out.println(c1.make);
//To modify: c1.make = "BMW";
//(Note: If the variables were marked private for encapsulation, you would use Getter and Setter methods instead.)