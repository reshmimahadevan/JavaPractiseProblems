package javaassignment2025;

public class Person {

	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {

		Person p1 = new Person("Bhavika", 25, 'F', 5.8);
		System.out.println(p1.name + " " + p1.age + " " + p1.gender + " " + p1.height);

		Person p2 = new Person("Reshmi", 28, 'F', 5.5);
		System.out.println(p2.name + " " + p2.age + " " + p2.gender + " " + p2.height);
	}

}

//Questions:
//1.What is the purpose of a constructor in Java? Avoid unwanted object creation and Initialize the value of the class variables with the help of local variables using THIS keyword
//2.How does a constructor differ from a regular method in Java?Constructor cannot have return type/even void .It does not have business logic in it . The name of constructor should be same as class name.Constructor is stored inside class loader 
//3.Can a Java class have multiple constructors? If so, how are they differentiated?Yes,with different class variables
//4/What happens if a constructor is not defined in a Java class?Hiden/Default constructor will be created by JVM
//5.Can a constructor call other methods or constructors within the same class?Yes
//Action	        Keyword	        Requirement
//Call Constructor	this()	        Must be the first line in the constructor.
//Call Method	    methodName()	Can be placed anywhere in the constructor.
