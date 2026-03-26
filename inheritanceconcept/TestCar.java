package inheritanceconcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start(); // Overriden
		b.refuel(); // Inherited
		b.stop(); // Overriden
		b.autoParking(); // Individual
		// b.theftSafety(); Not allowed as Audi is sibling
		BMW.billing();

		b.speed = 500;
		System.out.println(b.speed);

		b.engine();

		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		Car.billing();

		c.engine();

		// Cannot change the value of speed as its final
		// c.speed=500;
		System.out.println(c.speed);

		Audi a = new Audi();
		a.start(); // Overriden
		a.stop(); // Inherited
		a.refuel(); // Inherited
		a.theftSafety(); // Individual
		// a.autoParking(); Not allowed as BMW is sibling

		Vehicle v = new Vehicle();
		v.engine();

		// TopCast - Child class object can be referred by parent class refrenece
		// variable - LHS methods are only accessible but output is based on BMW first the Car
		Car c1 = new BMW();
		System.out.println("TopCast");
		c1.start(); // Overriden
		c1.stop(); // Overriden
		c1.refuel(); //Inherited
		System.out.println("** " +c1.speed);


		// DownCast - Parent class object can be referred by child class refrenece
		// variable
		// BMW b1 = new Car();Prompts with error

		// You can rectity with casting but when running Classcast esception occurs
		// BMW b1 = (BMW)new Car();

		// Child class object can be referred by grand-parent class refrenece variable
		Vehicle v1 = new BMW();
		v1.engine(); //Overriden
		
		

	}
}