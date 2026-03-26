package abstraction;

public class WebDriverFactory {

	public void launchBrowser() {
		System.out.println("WebDriverFactory: Launching Browser...");
	}

	public WebDriverFactory() {
		System.out.println("WebDriverFactory Constructor....");
	}

	public WebDriverFactory(int a) {
		System.out.println("Web	DriverFactory Constructor...." + a);
	}
}
