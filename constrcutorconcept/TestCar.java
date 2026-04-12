package constrcutorconcept;

public class TestCar {

	public static void main(String[] args) {

		// Output:
		// Car Constructor
		// BMW
		//BMW b = new BMW();
		
		//Output:
		//Car Constructor
		//BMW Constructor 10
		BMW b = new BMW(10);
		
		//After adding super(i) in BMW and this() in parameterized constructor of Car
		//Output:
		//Car Constructor
		//Car Constructor 10
		//BMW Constructor 10
		//BMW b = new BMW(10);
		
		//Without this - calls construcotr in the same class
		//Output:
		//Car Constructor 10
		//BMW Constructor 10
		//BMW b = new BMW(10);
		
		
		
		

	}

}
