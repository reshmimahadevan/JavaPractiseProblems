package exceptionhandling;

public class CrossBrowserTest {

	public static void main(String[] args) {

		String browser = "opera";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		
		else {
			System.out.println("plz pass the right browser");
			//Not handled using try catch block as even it passed wrong browser The down Syso's gets printed
			//So don't handle the exception here in this case
			throw new MyException("browsernotfoundexception");
		}
		
		System.out.println("Launch URL");
		System.out.println("Login to App");
		System.out.println("Shop a Product");
		System.out.println("Clsoe the Browser");
		
	}

}
