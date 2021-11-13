package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_and_or_operators {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\CrazyCoder\\Downloads\\Eclipse\\Selenium_Java\\drivers\\chrome_Driver\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		//Find the Elements LinkText using Contains
    	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
//		
//		//Find the Elements using the AND Operator
		driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control' and @id='email']")).sendKeys("protech@test.com");
		driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control' and @id='passwd']")).sendKeys("123456");
		
		//Find Elements using the OR Operator (Most rarely used)
		driver.findElement(By.xpath("//input[(@class='is_required validate account_input form-control' and @id='email') or (//input[@class='is_required validate account_input form-control'])]")).sendKeys("digitalcutlet@gmail.com");
		driver.findElement(By.xpath("//input[(@class='is_required validate account_input form-control' and @id='passwd') or (//input[@class='is_required validate account_input form-control'])]")).sendKeys("123456");
        
		//Find Elements using the starts-with
		String Auth = driver.findElement(By.xpath("//h1[starts-with(@class,'page-heading')]")).getText();
		System.out.println(Auth);
		
//		driver.get("https://www.protechbms.com/");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superadmin");
//		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("mcd$ffr#");
//		driver.findElement(By.xpath("//button[@class='btn buttonbg textsmall']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		//Find 
	}

}
