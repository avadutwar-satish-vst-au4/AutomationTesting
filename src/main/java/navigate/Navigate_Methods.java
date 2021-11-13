package navigate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Creating webDriver and setting chrome browser
				System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\ecllipse\\Java_Selinium\\drivers\\chrome_driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver;
				driver = new ChromeDriver();
				//Adding the navigate method
				driver.navigate().to("http://automationpractice.com/index.php");
				//Implicit Wait Time
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				driver.findElement(By.linkText("Sign in")).click();
				//Navigate to back
				driver.navigate().back();
				Thread.sleep(5000);
				//Navigate to Forward
				driver.navigate().forward();
				Thread.sleep(5000);
				//Navigate to Refresh
				driver.navigate().refresh();
				Thread.sleep(5000);
				driver.quit();
				
				

	}

}
