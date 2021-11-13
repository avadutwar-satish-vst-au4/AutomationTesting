package testNG_Practice;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class firstExample extends TestBase  {
	
	
	
  
  @Test (groups= {"P1"})
  public void firstEample() throws InterruptedException {
	  driver.findElement(By.linkText("Sign in")).click();
	 
		Thread.sleep(5000);
	
  }
  
  @Test  (groups= {"P2"})
  public void secondExample() throws InterruptedException{
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(property.getProperty("email"));
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(property.getProperty("password"));
	  
	  Thread.sleep(5000);
  }
  
  @Test (groups= {"P3"})
  public void thirdExample() throws InterruptedException {
	  driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
Thread.sleep(5000);
  }
  
  @Test (groups= {"P4"})
  public void fourthExample() throws InterruptedException {
	 Actions act = new Actions(driver);
	 WebElement search =  driver.findElement(By.xpath("//a[text()='Women']"));
	 //Thread.sleep(5000);
	 act.moveToElement(search).build().perform();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
	Thread.sleep(5000);
	  
  }
  
  
 
 
}


