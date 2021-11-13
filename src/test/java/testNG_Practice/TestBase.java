package testNG_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public WebDriver driver;
	
	// Declaring the property as "Public"
	public Properties property;
	// Declaring the FileInputStream as "Public"
	public FileInputStream fileinput;
	
	
	@BeforeClass (groups= {"P1","P2","P3","P4"}) 
	  public void beforeMethod() throws InterruptedException, IOException {
		
		//Accessing the property
		property= new Properties();
		
		//Accessing the FileInputStream
		FileInputStream fileinput = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\propertiesRead\\config.properties");
		
		//Loading the fileinput data using the property
		property.load(fileinput);
		
		//Selecting the browser based on the config file
		
		if(property.getProperty("browser").equals("chrome")) {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\ecllipse\\Java_Selinium\\drivers\\chrome_driver\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		}else {
			System.out.println("Provided browser is not supported");
		}
			
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//Acceesing the URL from the config.properties file using the getProperty command
		driver.get(property.getProperty("url"));
		 Thread.sleep(5000);
	}
	
	@BeforeMethod (groups= {"P1","P2","P3","P4"})
	public void clearCookies() {
		driver.manage().deleteAllCookies();
	}
	
	@AfterTest (groups= {"P1","P2","P3","P4"})
	  public void afterMethod() throws InterruptedException {
		//driver.navigate().back();
		Thread.sleep(5000);
		driver.quit();
	  }
	
	
	
	
	
 
}
