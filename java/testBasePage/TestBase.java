package testBasePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import pagesLinks.headerPage;

import org.testng.annotations.AfterTest;

public class TestBase {
	public WebDriver driver;
	public headerPage HeaderPageobj;
  
  @BeforeMethod
  public void waitTime() throws InterruptedException {
	  
	  Thread.sleep(5000);  
  }

  @AfterMethod
  public void navigateBack() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.navigate().to("https://www.bigbasket.com");
  }

  @SuppressWarnings("deprecation")
@BeforeClass
  public void openWebsite() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.bigbasket.com");
	  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  HeaderPageobj = new headerPage(driver);
  }

  @AfterClass
  public void deleteCookies() {
	  driver.manage().deleteAllCookies();
  }

  @SuppressWarnings("unused")
@BeforeTest
  public void openBrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\CrazyCoder\\Downloads\\Eclipse\\Selenium_Java\\drivers\\chrome_Driver\\chromedriver.exe"); 
	//WebDriver driver;
	driver = new ChromeDriver();
	
  }

  @AfterTest
  public void exitBrowser() {
	driver.quit();
  }
  
}
