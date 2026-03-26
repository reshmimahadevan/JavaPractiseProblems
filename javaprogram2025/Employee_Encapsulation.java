package javaprogram2025;

public class Employee_Encapsulation {

	private String name;
	private int age;
	private double salary;
	private boolean isPerm;

	//It is similiar to setter but cannot update so using setter
	public Employee_Encapsulation(String name, int age, double salary, boolean isPerm) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}

}
