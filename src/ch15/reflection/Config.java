package ch15.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	private String configFileName = "bin/properties/config.properties";
	
	public static String getName(){
		Properties properties = new Properties();
		String configFile = "bin/properties/config.properties";
		
		try {
			properties.load(new FileInputStream(configFile));
		} catch(FileNotFoundException ex){
			ex.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		return properties.getProperty("dbname", "SqlServer");
	}
}
