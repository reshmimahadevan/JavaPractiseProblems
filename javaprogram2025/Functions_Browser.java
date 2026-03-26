package javaprogram2025;

public class Functions_Browser {

	public void click(String element) {
		System.out.println("Click on the element " + element);
	}

	public void sendKeys(String element, String value) {
		System.out.println("Enter " + value + " to " + element);
	}

	public String getTitle() {
		return "Google";
	}

	public boolean lauchBrowser(String browserName) {
		
		System.out.println("Browser Name " + browserName);
		boolean flag= true;

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
            System.out.println("Lauch Chrome browser");
			break;
		case "firefox":
            System.out.println("Lauch firefox browser");
			break;
		case "safari":
            System.out.println("Lauch safari browser");
			break;
		case "edge":
            System.out.println("Lauch edge browser");
			break;

		default:
			System.out.println("Please pass the right browser name " +browserName);
			flag=false;
			break;
		}
		
		return flag;
	}

	public static void main(String args[]) {
		
		Functions_Browser b = new Functions_Browser();
		boolean exec = b.lauchBrowser("Chrome");
		System.out.println(exec);
		if(exec)
		{
			System.out.println("Enter the URL");
		}
		

	}

}
