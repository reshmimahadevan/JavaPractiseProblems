package javaprogram2025;

public class TestEmployee_Encapsulation {

	public static void main(String[] args) {

//		Employee_Encapsulation ec = new Employee_Encapsulation();
//		ec.setName("Bhavika");
//		String name =ec.getName();
//		System.out.println(name);

		//Creating a fresh user:POST
		Employee_Encapsulation ec1 = new Employee_Encapsulation("Bhavika", 25, 15, true);
		
		//Retrive:GET
		System.out.println(ec1.getName() + " " + ec1.getAge() + " " + ec1.getSalary() + " " + ec1.isPerm());
		
		//Update:PUT
		ec1.setAge(28);
		ec1.setSalary(30);
		
		//Retrive:GET
		System.out.println(ec1.getName() + " " + ec1.getAge() + " " + ec1.getSalary() + " " + ec1.isPerm());

	}

}
