package accessmodifier;

public class Cycle {

	public static void main(String args[]) {
		// Same Package not subclass
		// Private not allowed
		// Public Protected Default allowed
		Car c = new Car();
		c.color = "Yellow";
		c.name = "Tesla";
		c.price = 60000;

	}

}
