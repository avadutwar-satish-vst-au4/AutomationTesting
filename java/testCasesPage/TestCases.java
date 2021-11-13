package testCasesPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import testBasePage.TestBase;


public class TestCases extends TestBase{
	
	//Click on Big Basket Logo
	@Test
  public void bigBasketLogo() {
	  HeaderPageobj.getBigBasketLogo().click();
  }
	
	//Enter the Text in SearchBox and Click Button
  @Test
  public void searchBox() {
	  Actions keyPress = new Actions(driver);
	  keyPress.moveToElement(HeaderPageobj.setSearchBox("cucumber")).click().keyDown(Keys.SHIFT).sendKeys("onions").build().perform();
	  HeaderPageobj.getSearchButton().click();
  }
  
    //Enter the Location
  @Test
  public void userLocation() throws InterruptedException {
	HeaderPageobj.getUserLocationDropDown().click();
	HeaderPageobj.getSelectCity().click();
	HeaderPageobj.getClickCity().click();
	//HeaderPageobj.setClickCity("Hyderabad");
	Thread.sleep(10000);
	HeaderPageobj.setPincode("500100");
	HeaderPageobj.getClickButton().click();
}

}

