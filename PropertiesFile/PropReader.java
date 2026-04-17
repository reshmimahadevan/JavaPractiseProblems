package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

	//Making variables private so no unecessary  variable access happens
	private final static String CONFIG_FILE_PATH = "./src/PropertiesFile/config.properties";
	//Removing static as parallel execution does not happen as it will be stored in CMA
	private Properties prop;

	public Properties initProperties() {
		try {
			FileInputStream fis = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
