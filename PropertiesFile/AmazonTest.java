package PropertiesFile;

import java.util.Properties;

public class AmazonTest {

	public static void main(String[] args) {

		PropReader reader = new PropReader();
		Properties prop = reader.initProperties();

		String browserName = prop.getProperty("browser");
		switch (browserName.toLowerCase().trim()) {
		case "chrome": {
			System.out.println("Chrome is launched");
			break;
		}
		case "firefox": {
			System.out.println("Firefox is launched");
			break;
		}
		case "safari": {
			System.out.println("Safari is launched");
			break;
		}
		default:
			System.out.println("Plz pass the right browser...");
			break;

		}

		System.out.println(prop.getProperty("url"));
		System.out.println("Enter Username :" + prop.getProperty("username"));
		System.out.println("Enter Password :" + prop.getProperty("password"));
		System.out.println("Click on Login Button");

	}

}
