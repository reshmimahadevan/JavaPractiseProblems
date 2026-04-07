package accessmodifier;

public class BMW extends Car {

	public static void main(String args[]) {
		// Same package subclass
		// Private not allowed
		// Public Protected Default allowed
		BMW b = new BMW();
		b.name = "BMW";
		b.color = "Grey";
		b.price = 130000;

	}

}
