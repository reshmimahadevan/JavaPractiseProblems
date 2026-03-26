package javaassignment2025;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {

	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		return this.length * this.width;
	}

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		System.out.println("The area of rectanlge calculated using default constructor " + r1.calculateArea());

		Rectangle r2 = new Rectangle(1.0, 2.0);
		System.out.println("The area of rectanlge calculated using default constructor " + r2.calculateArea());

	}

}


//Questions:
//1.What is the purpose of a default constructor in Java?The purpose of a default constructor is to initialize an object with default values (such as 0.0 for doubles, 0 for integers, or null for objects) when no arguments are provided during object creation. It ensures that the object is in a valid state as soon as it is instantiated.
//2.How can you differentiate between a default constructor and a constructor that takes in parameters?Default Constructor: Has no parameters / Parameterized Constructor: Has one or more parameters defined in the parentheses
//3.What is the access level of a constructor in Java?public (most common)/protected/private/default (package-private)
//4.Can a constructor be private? If so, why would you want to make a constructor private?Yes, a constructor can be private. You would do this to prevent instantiation of the class from outside.Eg:Utility Classes: Classes that only contain static methods (like java.lang.Math) and don't need to be turned into objects.
//5.Can a constructor call a method from another class?Yes. A constructor can call any visible method from another class. For example, it could call a static validation method from a Utils class to check if the length and width provided are positive numbers before assigning them.

