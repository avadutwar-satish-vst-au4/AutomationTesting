package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        @SuppressWarnings("unused")
		String testMail  = "protech@test.com" , Passwd = "1234";
        		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\ecllipse\\Java_Selinium\\drivers\\chrome_driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		//find the elements in table
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> searchText =driver.findElements(By.xpath("	//table[@id='customers']/tbody/tr/td[1]"));
		for(int i=0; i<searchText.size(); i++) {
		String table = searchText.get(i).getText();
		System.out.println(table);
		
		
	}

}
	
}
