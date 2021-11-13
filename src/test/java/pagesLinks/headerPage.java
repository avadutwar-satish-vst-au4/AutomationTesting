package pagesLinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class headerPage  {
	 WebDriver driver;
	@SuppressWarnings("unused")
	public headerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		String searchBoxText = "Onions";
		String selectCityText = "Hyderabad";
		int  pincode = 500100;
	}

	//BIG BASKET Logo
	@FindBy(xpath="//a[@class='bb-logo change-logo hidden-xs hidden-sm']")
	private WebElement bigBasketLogo;
	
	// Search Box
	@FindBy(xpath="//input[@id='input']")
	private WebElement searchBox;
	
	//Search Button
	@FindBy(xpath="//button[@class='btn btn-default bb-search']")
	private WebElement searchButton;
	
	//Contact Number
	@FindBy(xpath = "//li[@class='ng-scope' and @ng-if='!vm.isB2BSite']")
	private WebElement contactNumber;
	
	//User Location Drop-Down
	@FindBy(xpath = "//div[@class='dropdown new-to-bb xhrcalls-only']")
	private WebElement userLocationDropDown;
	
	//select city in drop-down
	@FindBy(xpath = "(//span[@aria-label='Select box activate'])[1]")
	private WebElement selectCity;
	
	//Click on City
	@FindBy(xpath = "(//a[@class='ui-select-choices-row-inner'])[27]")
	private WebElement clickCity;
	
	//Select PinCode
	@FindBy(xpath = "//input[@id='areaselect']")
	private WebElement pincode;
	
	//Select Click Button
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	private WebElement clickButton;
	
	//Click Login/SignUp
	@FindBy(xpath = "//a[@ng-show='vm.newLoginFlow']")
	private WebElement login;
	
	//Select Cart
	@FindBy(xpath = "//a[@type='button']")
	private WebElement cart;
	
	//Select Offers
	@FindBy(xpath = "//a[@class='bb-offers-link']")
	private WebElement offers;
	
	//Select Shop By Category
	@FindBy(xpath = "//a[contains(text(),'Shop by')]")
	private WebElement shopByCategory;
	
	//All Elements in "SHOP BY CATEGORY" list with Each List
	
	             //FRUITS and VEGETABLES
	
	//Select Fruits and vegetables
	@FindBy(xpath = "//a[@data-sectioninteractionplower='{\"EventName\":\"ItemClicked\",\"ScreenInPageContext\":\"sbc\"}'][normalize-space()='Fruits & Vegetables']")
	private WebElement fruitsAndVegetables;
	
	           //Elements in FRUITS and VEGETABLES
	
	//Select Fresh Vegetables
	@FindBy(xpath = "(//a[@class='ng-binding l2select'][normalize-space()='Fresh Vegetables'])[2]")
	private WebElement freshVegetables;
	
	           //Elements in FRESH VEGETABLES
	
	   //Select SUB - Element Potato,Onion & Tomato
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Potato, Onion & Tomato'])[2]")
	private WebElement potatoOnionAndTomato;
	
	  //Select SUB - Element Cucumber and Capsicum
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Cucumber & Capsicum'])[2]")
	private WebElement cucumberCapsicum;
	
	  //Select SUB - Element Root Vegetables
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Root Vegetables'])[2]")
	private WebElement rootVegetables;
	
	  //Select SUB - Element Leafy Vegetables
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Leafy Vegetables'])[2]")
	private WebElement leafyVegetables;
	
	  //Select SUB - Element Beans , Brinjals and Okra
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Beans, Brinjals & Okra'])[2]")
	private WebElement beansBrinjalsOkra;
	
	  //Select SUB - Element Cabbage and Califlower
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Cabbage & Cauliflower'])[2]")
	private WebElement cabbageCaliflower;
	
	  //Select SUB - Element Gourd, Pumpkin, Drumstick
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Gourd, Pumpkin, Drumstick'])[2]")
	private WebElement gourdPumpkinDrumstick;
	
	  //Select SUB - Element Speciality
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Specialty'])[2]")
	private WebElement speciality;
	
	      //POPULAR Searches
	//Select Vegetables
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Vegetables'])[2]")
	private WebElement vegetables;
	
	//Select Onions
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Onion'])[2]")
	private WebElement onions;
	
	//Select Tomato
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Tomato'])[2]")
	private WebElement tomato;
	
	//Select Potato
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Potato'])[2]")
	private WebElement potato;
	
	//Select Vegetables
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Vegetable'])[2]")
	private WebElement vegetable;
	
	//Select Carrot
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Carrot'])[2]")
	private WebElement carrot;
	
	
              //Select Herbs and Seasonings
	@FindBy(xpath = "(//a[@class='ng-binding'][normalize-space()='Herbs & Seasonings'])[2]")
	private WebElement herbsAndSeasonings;
	/**
	 * @return the searchBox
	 */
	public WebElement getSearchBox() {
		return searchBox;
	}


	/**
	 * @param searchBox the searchBox to set
	 * @return 
	 */
	public WebElement setSearchBox(String val ) {
		this.searchBox.sendKeys(val);
		return searchBox;
	}


	/**
	 * @return the selectCity
	 */
	public WebElement getSelectCity() {
		return selectCity;
	}


	/**
	 * @param selectCity the selectCity to set
	 */
	public void setSelectCity(String val) {
		this.selectCity.sendKeys(val);
	}


	/**
	 * @param clickCity the clickCity to set
	 * @return 
	 */
	
	public WebElement getClickCity() {
		return clickCity;
	}
	
	
	public void setClickCity(String val) {
		this.clickCity.sendKeys(val);
	}


	/**
	 * @return the pincode
	 */
	public WebElement getPincode() {
		return pincode;
	}


	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String val ) {
		this.pincode.sendKeys(val);
	}


	/**
	 * @return the bigBasketLogo
	 */
	public WebElement getBigBasketLogo() {
		return bigBasketLogo;
	}


	/**
	 * @return the searchButton
	 */
	public WebElement getSearchButton() {
		return searchButton;
	}


	/**
	 * @return the contactNumber
	 */
	public WebElement getContactNumber() {
		return contactNumber;
	}


	/**
	 * @return the userLocationDropDown
	 */
	public WebElement getUserLocationDropDown() {
		return userLocationDropDown;
	}


	/**
	 * @return the clickButton
	 */
	public WebElement getClickButton() {
		return clickButton;
	}


	/**
	 * @return the login
	 */
	public WebElement getLogin() {
		return login;
	}


	/**
	 * @return the cart
	 */
	public WebElement getCart() {
		return cart;
	}


	/**
	 * @return the offers
	 */
	public WebElement getOffers() {
		return offers;
	}


	/**
	 * @return the shopByCategory
	 */
	public WebElement getShopByCategory() {
		return shopByCategory;
	}


	/**
	 * @return the fruitsAndVegetables
	 */
	public WebElement getFruitsAndVegetables() {
		return fruitsAndVegetables;
	}


	/**
	 * @return the freshVegetables
	 */
	public WebElement getFreshVegetables() {
		return freshVegetables;
	}


	/**
	 * @return the potatoOnionAndTomato
	 */
	public WebElement getPotatoOnionAndTomato() {
		return potatoOnionAndTomato;
	}


	/**
	 * @return the cucumberCapsicum
	 */
	public WebElement getCucumberCapsicum() {
		return cucumberCapsicum;
	}


	/**
	 * @return the rootVegetables
	 */
	public WebElement getRootVegetables() {
		return rootVegetables;
	}


	/**
	 * @return the leafyVegetables
	 */
	public WebElement getLeafyVegetables() {
		return leafyVegetables;
	}


	/**
	 * @return the beansBrinjalsOkra
	 */
	public WebElement getBeansBrinjalsOkra() {
		return beansBrinjalsOkra;
	}


	/**
	 * @return the cabbageCaliflower
	 */
	public WebElement getCabbageCaliflower() {
		return cabbageCaliflower;
	}


	/**
	 * @return the gourdPumpkinDrumstick
	 */
	public WebElement getGourdPumpkinDrumstick() {
		return gourdPumpkinDrumstick;
	}


	/**
	 * @return the speciality
	 */
	public WebElement getSpeciality() {
		return speciality;
	}


	/**
	 * @return the vegetables
	 */
	public WebElement getVegetables() {
		return vegetables;
	}


	/**
	 * @return the onions
	 */
	public WebElement getOnions() {
		return onions;
	}


	/**
	 * @return the tomato
	 */
	public WebElement getTomato() {
		return tomato;
	}


	/**
	 * @return the potato
	 */
	public WebElement getPotato() {
		return potato;
	}


	/**
	 * @return the vegetable
	 */
	public WebElement getVegetable() {
		return vegetable;
	}


	/**
	 * @return the carrot
	 */
	public WebElement getCarrot() {
		return carrot;
	}


	/**
	 * @return the herbsAndSeasonings
	 */
	public WebElement getHerbsAndSeasonings() {
		return herbsAndSeasonings;
	}
	
}
