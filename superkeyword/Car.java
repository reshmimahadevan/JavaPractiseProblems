package superkeyword;

public class Car extends Vehicle {

	// int speed = 300;

	public Car() {
		System.out.println("Car Default Constructor....");
	}

	public Car(int a) {
		System.out.println("Car Parameterized Constructor-1...." + a);
	}

	public Car(int a, int b) {
		System.out.println("Car Parameterized Constructor-2...." + (a + b));
	}

	public void start() {
		System.out.println("Car starting....");
	}

	public void stop() {
		System.out.println("Car stopping....");
	}
	
	public static void testing()
	{
		System.out.println("Car Testing....");
	}

}
