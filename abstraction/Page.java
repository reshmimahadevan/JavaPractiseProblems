package abstraction;

public abstract class Page extends WebDriverFactory {

	// We can have Abstract and Non-Abstract methods inside Abstract class
	// 0%/100%/partial abstraction allowed
	// Cannot create object of Abstract class
	// Can have constructor? Yes but it will be called when you create the object of
	// Child Class

	public abstract void title();

	public abstract void url();

	// Default constructor is mandatory if you have any parameterized constructor
	public Page() {
		System.out.println("Page Constructor....");
	}

	public Page(int a) {
		System.out.println("Page Constructor...." + a);
	}

	//Non-abstract method
	public void loading() {
		System.out.println("Page Loading in 20 secs");
	}

	public final void displayLogo() {
		System.out.println("Mylogo.jpg");
	}

}
