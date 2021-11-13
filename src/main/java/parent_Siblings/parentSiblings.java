package parent_Siblings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentSiblings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating webDriver and setting chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\ecllipse\\Java_Selinium\\drivers\\chrome_driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		//Adding the web link
		driver.get("http://automationpractice.com/index.php");
		//Implicit Wait Time
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
		
		
	}
}