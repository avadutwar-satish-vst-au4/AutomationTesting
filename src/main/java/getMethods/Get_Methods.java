package getMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		//Creating webDriver and setting chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\ecllipse\\Java_Selinium\\drivers\\chrome_driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		//Adding the web link
		driver.get("http://automationpractice.com/index.php");
		//Implicit Wait Time
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//Find Element by ID
		driver.findElement(By.id("search_query_top")).sendKeys("Shirts");
		//Wait Time
		Thread.sleep(5000);
		// Clear the SearchBox
		driver.findElement(By.id("search_query_top")).clear();
		//Find Element by Name
		driver.findElement(By.name("search_query")).sendKeys("Pants");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).clear();
		//Find Element by LinkText
		driver.findElement(By.linkText("Search")).sendKeys("Shoes");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Search")).clear();
		//Find Element by Partial LinkText
		driver.findElement(By.partialLinkText("Search")).sendKeys("T-Shirts");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Search")).clear();
		//Find Element by TagName
		driver.findElement(By.tagName("search_query_top")).sendKeys("topWear");
		Thread.sleep(5000);
		driver.findElement(By.id("search_query_top")).clear();
		//Find Element by Class
		driver.findElement(By.className("search_query form-control ac_input")).sendKeys("slippers");
		Thread.sleep(5000);
		driver.findElement(By.className("search_query form-control ac_input")).clear();
		driver.quit();
	}

}
