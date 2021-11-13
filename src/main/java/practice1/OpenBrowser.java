	package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		// creating the web driver connection 
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\ecllipse\\Java_Selinium\\drivers\\chrome_driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		// adding the website
		
		driver.get("https://www.amazon.in/");
		
		// finding the element using the id
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earphones");
		
		// creating the 5ms time wait
		
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// Clear the inserted text in the search-box
		
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		// creating and finding the element using the XPATH
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
		driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
