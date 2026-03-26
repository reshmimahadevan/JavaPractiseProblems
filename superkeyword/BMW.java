package superkeyword;

public class BMW extends Car {

	int speed = 100;

	@Override
	public void start() {
		System.out.println("BMW starting....");
		// If calling only start without super this will be a recursive function
		// and Stack Overflow error occurs.
		// So super.start will call the parent class method
		super.start();
		super.stop();
	}

	public void autoParking() {
		System.out.println("BMW autoparking....");
	}

	public void dispalySpeed() {

		System.out.println("The speed is  " + speed);

		System.out.println("Parent speed is  " + super.speed);

		// Trying to access the grandparent speed variable as well but super is only
		// applicable for immediate parent only
		// If Car is not having speed then it goes and print the Grand parent variable
		// value

		System.out.println("Parent speed is  " + super.speed);
	}

}
