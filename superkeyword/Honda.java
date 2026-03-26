package superkeyword;

public class Honda extends Car {

	public Honda() {
		this(10); //is calling same class constructor
		System.out.println("Honda Default Constructor....");
	}

	public Honda(int a) {
		//this(10); If called using parameterized constructor it will become recursive so prompts with error that recursion is not allowed in constructor
		this(10,20);
		System.out.println("Honda Parameterized Constructor-1...." + a);
	}

	public Honda(int a, int b) {
		System.out.println("Honda Parameterized Constructor-2...." + (a + b));
	}

}
