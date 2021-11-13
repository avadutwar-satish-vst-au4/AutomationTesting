package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import pages_Check.HomePage_Check;

public class TestBase {
	
	public HomePage_Check homePageCheckObj;

@BeforeClass 
public void navigateBrowser() {
	WebDriver driver;
driver = new ChromeDriver();

homePageCheckObj = new HomePage_Check(driver);




}

}
