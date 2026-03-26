package superkeyword;

public class TestCar {

	public static void main(String args[]) {

//		BMW b = new BMW();
//		b.start();
//		b.dispalySpeed();

		Audi a = new Audi();
//      Car Default Constructor and Audi Default Constructor		
		Audi a1 = new Audi(10);
//		Audi a2 = new Audi(10, 20);

//      Output : In genral Parent class default and then resp child constructor will be called
//		Car Default Constructor....
//		Audi Parameterized Constructor-1....10

//      After introducing super keyword in parametized contructor default will be ignored 
//      Output :
//		Car Parameterized Constructor-1....100
//		Audi Parameterized COnstructor-1....10	
		
		Honda h = new Honda();
//      Output:
//		Car Default Constructor....
//		Honda Parameterized Constructor-1....10
//		Honda Default Constructor....
		
//      After final program
//		Output:
//		Car Default Constructor....
//		Honda Parameterized Constructor-2....30
//		Honda Parameterized Constructor-1....10
//		Honda Default Constructor....
		
//		Honda h = new Honda(10);
//      Output:
//		Car Default Constructor....
//		Honda Parameterized Constructor-2....30
//		Honda Parameterized Constructor-1....10

		

	}
}
