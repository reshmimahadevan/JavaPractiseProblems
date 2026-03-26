package inheritanceconcept;

//final class to prevent inheritance - If so the case Car cannot be parent
//public final class Car {
public class Car extends Vehicle {
	
	final int speed = 100;

	public void start() {
		System.out.println("Car Starting....");
	}

	public void stop() {
		System.out.println("Car Stopping....");
	}

    //final methods cannot be overriden - prevents overriding but can be called
	public final void refuel() {
		System.out.println("Car Refuelling....");
	}

	public static void billing() {
		System.out.println("Car Billing....");
	}
}
