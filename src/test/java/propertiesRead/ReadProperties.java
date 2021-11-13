package propertiesRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Reading the Properties
		
		Properties property = new Properties();
		FileInputStream fileinput = new FileInputStream("D:\\Software Testing\\ecllipse\\Java_Selinium\\src\\test\\java\\propertiesRead\\config.properties");
		property.load(fileinput);
		String url= property.getProperty("url");
		String email= property.getProperty("email");
		String password= property.getProperty("password");
	}

}
