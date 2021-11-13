package pages_Check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage_Check {

WebDriver driver;

	public HomePage_Check(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/span[1]")
	private WebElement callusnow;

	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchTextBox;

	@FindBy(name = "submit_search")
	private WebElement Button;

	@FindBy(xpath = "//b[contains(text(),'Cart')]")
	private WebElement Addtocart;

	@FindBy(linkText = "Sign in")
	private WebElement signInLink;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	private WebElement Signout;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	private WebElement contactUs;

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}
	
	// SETTERS and GETTERS links

	public void setSearchTextBox(String val) {
		this.searchTextBox.sendKeys(val);
	}

	public WebElement getCallusnow() {
		return callusnow;
	}

	public WebElement getButton() {
		return Button;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getSignout() {
		return Signout;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	
}
