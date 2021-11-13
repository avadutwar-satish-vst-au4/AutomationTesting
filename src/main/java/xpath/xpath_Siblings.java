package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Siblings {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        @SuppressWarnings("unused")
		String testMail  = "protech@test.com" , Passwd = "abcd" ;
        		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\ecllipse\\Java_Selinium\\drivers\\chrome_driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		//Find the Elements LinkText using Contains
    	//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    	
    	// Find the Elements using Siblings\
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("shirts");
		driver.findElement(By.xpath("//input[@id='search_query_top']//following-sibling::button")).click();
		
		//  Find the Element using child to parent parent to child using siblings
		
		driver.findElement(By.xpath("//input[@id='email']//parent::div/following-sibling::div//input")).sendKeys(Passwd);
		//find the elements in table
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				List<WebElement> searchText =driver.findElements(By.xpath("	//table[@id='customers']/tbody/tr/td[1]"));
				for(int i=0; i<searchText.size(); i++) {
				String table = searchText.get(i).getText();
				System.out.println(table);			
			}
	
	}
}