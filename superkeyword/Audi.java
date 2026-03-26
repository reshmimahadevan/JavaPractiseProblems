package superkeyword;

public class Audi extends Car {

	public Audi() {
		super();
		System.out.println("Audi Default Constructor....");
	}

	public Audi(int a) {
		// super(100);
		// Prints the same value 10 for both Car and Audi
		super(a);
		System.out.println("Audi Parameterized Constructor-1...." + a);
		System.out.println(super.speed);
	}

	public Audi(int a, int b) {
		super(100, 200);
		System.out.println("Audi Parameterized Constructor-2...." + (a + b));
		super.start();
		Car.testing();

	}

}
