package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_parent {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        @SuppressWarnings("unused")
		String testMail  = "protech@test.com" , Passwd = "abcd" ;
        		
		System.setProperty("webdriver.chrome.driver", "D:\\CrazyCoder\\Downloads\\Eclipse\\Selenium_Java\\drivers\\chrome_Driver\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		//Find the Elements LinkText using Contains
    	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    	
    	// Find the ELement Using the Parent-Child Method
		driver.findElement(By.xpath("//div[@class='form-group']/input[@id='email_create']")).sendKeys(testMail);
		driver.findElement(By.xpath("//div[@class='form-group']//input[@id='passwd']")).sendKeys(Passwd);
		driver.findElement(By.xpath("//div[@class='form-group']//input[@id='passwd']")).clear();
		// Find the Elements using Parent-GranChild
		//driver.findElement(By.xpath("//div/form/div/div//input[@id='passwd']")).sendKeys(Passwd);
		
		driver.findElement(By.xpath("//form//input[@id='email']")).sendKeys(testMail);
		//driver.findElement(By.xpath("//div/form/div/div//input[@id='passwd']")).sendKeys(Passwd);
		driver.findElement(By.xpath("//form//input[@id='passwd']")).sendKeys(Passwd);
		Thread.sleep(5000);
		
		//Find the Element Using the INDEX based Selection
		driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]")).sendKeys(testMail);
		
		//Find the Parent Element
		driver.findElement(By.xpath("//input[starts-with(@data-validate,'isEmail')]//parent::div")).sendKeys(testMail);
		
		
		
		
	
	}
}