package javaassignment2025;

public class Employee {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Bhavika",29.8);
		System.out.println("Before Hike: " + e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		double raiseAmount = e1.getSalary()*0.10;
		e1.setSalary(e1.getSalary()+raiseAmount);
		System.out.println("After Hike: " + e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		

	}

}

//Questions:
//1.What is the purpose of a getter method in Java?The purpose of a getter method is to retrieve the value of a private instance variable. It provides a public way to read data while keeping the variables themselves protected (encapsulated).
//2.Can a getter method return void?No. A getter method must return the data type of the variable it is accessing (e.g., String, int, double). If it returned void, it wouldn't be able to provide the value to the caller.
//3.What is the access level of a getter method in Java?Typically, the access level is public. This allows other classes to "get" the data even if the variables are marked as private.
//4.What is the purpose of a setter method in Java?Modify or update the value of a private instance variable
//5.Can a setter method return a value other than void?Yes, though it is less common. While most setters return void, they can return a value. For example, a setter might return a boolean to indicate if the update was successful, or return the object itself to allow for method chaining.