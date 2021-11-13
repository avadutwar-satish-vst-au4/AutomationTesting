package pagesLinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;

import xpath.xpath_and_or_operators;

public class headerPage {

	//BIG BASKET Logo
	@FindBy(xpath="//a[@class='bb-logo change-logo hidden-xs hidden-sm']")
	public WebElement bigBasketLogo;
	
	// Search Box
	@FindBy(xpath="//input[@id='input']")
	public WebElement searchBox;
	
	//Search Button
	@FindBy(xpath="//button[@class='btn btn-default bb-search']")
	public WebElement searchButton;
	
	//Contact Number
	@FindBy(xpath = "//li[@class='ng-scope' and @ng-if='!vm.isB2BSite']")
	public WebElement contactNumber;
	
	//User Location Drop-Down
	@FindBy(xpath = "//div[@class='dropdown new-to-bb xhrcalls-only']")
	public WebElement userLocationDropDown;
	
	//select city in drop-down
	@FindBy(xpath = 'div[qa='cityDD'] span[xpath='1']')
	public WebElement selectCity;
	
	//Select PinCode
	@FindBy(xpath = "//input[@id='areaselect']")
	public WebElement pincode;
	
	//Select Click Button
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	public WebElement clickButton;
	
	//Click Login/SignUp
	@FindBy(xpath = "//a[@ng-show='vm.newLoginFlow']")
	public WebElement login;
	
	//Select Cart
	@FindBy(xpath = "//a[@type='button']")
	public WebElement cart;
	
	//Select Offers
	@FindBy(xpath = "//a[@class='bb-offers-link']")
	public WebElement offers;
	
	//Select Shop By Category
	@FindBy(xpath = "//a[contains(text(),'Shop by')]")
	public WebElement shopByCategory;
	
	//All Elements in "SHOP BY CATEGORY" list with Each List
	
	             //FRUITS and VEGETABLES
	
	//Select Fruits and vegetables
	@FindBy(xpath = "//a[@data-sectioninteractionplower='{\"EventName\":\"ItemClicked\",\"ScreenInPageContext\":\"sbc\"}'][normalize-space()='Fruits & Vegetables']"
	public WebElement fruitsAndVegetables;
	
	           //Elements in FRUITS and VEGETABLES
	
	//Select Fresh Vegetables
	@FindBy(xpath = '(//a[@class='ng-binding l2select'][normalize-space()='Fresh Vegetables'])[2]')
	public WebElement freshVegetables;
	
	           //Elements in FRESH VEGETABLES
	
	   //Select SUB - Element Potato,Onion & Tomato
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Potato, Onion & Tomato'])[2]')
	public WebElement potatoOnionAndTomato;
	
	  //Select SUB - Element Cucumber and Capsicum
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Cucumber & Capsicum'])[2]')
	public WebElement cucumberCapsicum;
	
	  //Select SUB - Element Root Vegetables
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Root Vegetables'])[2]')
	public WebElement rootVegetables;
	
	  //Select SUB - Element Leafy Vegetables
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Leafy Vegetables'])[2]')
	public WebElement leafyVegetables;
	
	  //Select SUB - Element Beans , Brinjals and Okra
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Beans, Brinjals & Okra'])[2]')
	public WebElement beansBrinjalsOkra;
	
	  //Select SUB - Element Cabbage and Califlower
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Cabbage & Cauliflower'])[2]')
	public WebElement cabbageCaliflower;
	
	  //Select SUB - Element Gourd, Pumpkin, Drumstick
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Gourd, Pumpkin, Drumstick'])[2]')
	public WebElement gourdPumpkinDrumstick;
	
	  //Select SUB - Element Speciality
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Specialty'])[2]')
	public WebElement speciality;
	
	      //POPULAR Searches
	//Select Vegetables
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Vegetables'])[2]')
	public WebElement vegetables;
	
	//Select Onions
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Onion'])[2]')
	public WebElement onions;
	
	//Select Tomato
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Tomato'])[2]')
	public WebElement tomato;
	
	//Select Potato
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Potato'])[2]')
	public WebElement potato;
	
	//Select Vegetables
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Vegetable'])[2]')
	public WebElement vegetable;
	
	//Select Carrot
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Carrot'])[2]')
	public WebElement carrot;
	
	
	
              //Select Herbs and Seasonings
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Herbs & Seasonings'])[2]')
    public WebElement herbsAndSeasonings;
	
	         // Elements in HERBS AND SEASONINGS
	
	//Select Lemon, Ginger & Garlic
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Lemon, Ginger & Garlic'])[2]')
	public WebElement lemonGingerGarlic;
	
	//Select Indian and Exotic Herbs
	@FindBy(xpath = '(//a[@class='ng-binding'][normalize-space()='Indian & Exotic Herbs'])[2]')
	public WebElement indianAndExoticHerb;
	
	
	
	
	
}
