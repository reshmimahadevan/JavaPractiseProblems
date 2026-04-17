package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	// Static to avoid unnecessary object creation
	public final static String CONFIG_FILE_PATH = "./src/PropertiesFile/config.properties";
	//Properites - collection which also hold key/value pair like HashMap and HashTable
	static Properties prop;

	public static void main(String[] args) {

		try {
			// Making connection with Prop file and read it
			FileInputStream fis = new FileInputStream(CONFIG_FILE_PATH);
			// Object created in Heap for Properties
			prop = new Properties();
			// Loading all the properties
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		String url = prop.getProperty("url");
		System.out.println(url);

//		String m1 = prop.getProperty("naveen");
//		System.out.println(m1);  //Output : Null
		
		prop.setProperty("browser", "edge");
		browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
//      Adding a new property (that is not in config.properties)		
		prop.setProperty("version", "99.0");
		String version = prop.getProperty("version");
		System.out.println(version);
		
//      New Properties also taken into account but it will be shown in output only not be added in config file
		System.out.println(prop.size());

        
		
	}

}
