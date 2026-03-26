package abstraction;

public class TestPage {

	public static void main(String[] args) {

		WebDriverFactory ef = new WebDriverFactory();
		ef.launchBrowser();

		WebDriverFactory ef1 = new WebDriverFactory(10);

		System.out.println("====================================");
		LoginPage lp = new LoginPage(); // default grandparent class -> default parent class -> child class default
		LoginPage lp1 = new LoginPage(10); // default grandparent class -> default parent class -> child class
										   // parameterized
		lp.title();
		lp.url();
		lp.loading();
		lp.doLogin();

		// Cannot create object for abstract class
		// Page p = new Page();

		// Top Casting
		// Page methods and what all methods overriden and inherited in Login page
		// Loading since its overriden the child class will be taken into account
		Page pg = new LoginPage();
		pg.loading();
		pg.displayLogo();
		pg.title();
		pg.url();
		pg.loading();

	}

}
