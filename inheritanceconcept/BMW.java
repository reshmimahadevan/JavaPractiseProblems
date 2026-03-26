package inheritanceconcept;

public class BMW extends Car {

	// No variable overriden can happen but you can inherit it from Parent
	int speed = 200;

	@Override
	public void start() {
		System.out.println("BMW Starting....");
		autoParking();//Method Chaining
		refuel();//Inheritance

	}

	public void autoParking() {
		System.out.println("BMV Parking....");

	}

	@Override
	public void stop() {
		System.out.println("BMW Stopping....");
	}

//	public void refuel() {
//		System.out.println("BMW Stopping....");
//	}

	// @Override - prompt error as static override is not allowed
	// Method Hiding
	// public static void billing() {
	// System.out.println("BMW Billing....");
	// }

	// private cannot be overriden
	private void getCarInfo() {
		System.out.println("Getting BMW Info...");
	}

	// Accessing private via public methods - Encapsulation
	public void getInfo() {
		getCarInfo();
	}

	@Override
	public void engine() {
		System.out.println("BMW vehicle engine....");
	}

	// Composition - BMW is having truck class object and and able to access its
	// methods
	public void bmwLoading() {
		Truck t = new Truck();
		t.heavyLoading();
	}
}
