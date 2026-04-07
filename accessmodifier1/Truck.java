package accessmodifier1;

import accessmodifier.Car;

public class Truck {

	public static void main(String[] args) {
		// Different Package not subclass
		// PrivatevPitected Default not allowed
		// Public allowed
		Car c= new Car();
		c.price=90000;

	}

}
