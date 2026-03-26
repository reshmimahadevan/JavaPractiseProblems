package javaassignment2025;

public class Person_Encapsulation {

	private String name;
	private int age;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

	public static void main(String args[])
	{
		Person_Encapsulation pe = new Person_Encapsulation();
		pe.setName("Reshmi");
		pe.setAge(28);
		pe.setGender("Female");
		pe.printInfo();
		pe.setAge(30);
		pe.printInfo();
	}
	
}

//Questions:
//1.What is encapsulation and how does it relate to object-oriented programming?It is wrapping data and methods into a single unit (a class) to keep the data hidden and safe.
//2.Why is it important to use getter and setter methods instead of accessing attributes directly?They provide a controlled way to look at or change private data without touching the variables directly.
//3.How can encapsulation improve the security and reliability of a program?It prevents outside code from accidentally putting "bad" or invalid data into your variables.
//4.What is the difference between a private attribute and a public attribute?Private can only be seen inside its own class, while Public can be seen and changed by any other class.
//5.How does encapsulation help with code maintainability and scalability?you can upgrade your program easily without having to fix every other part of it.


