package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObjects extends Base {

	public HomePageObjects() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text() = 'Currency']")
	private WebElement currency;
	@FindBy(xpath = "//button[@class ='currency-select btn btn-link btn-block']")
	private WebElement euro;
	@FindBy(xpath = "//button[@class = 'btn btn-link dropdown-toggle']")
	private WebElement validateEruo;
	@FindBy(xpath = "//span[text() = 'My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	@FindBy(xpath = "//a[text() = 'Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//span[text() = 'Wish List (0)']")
	private WebElement wishList;
	@FindBy(xpath = "//span[text() = 'Shopping Cart']")
	public WebElement shoppingCart;
	@FindBy(xpath = "//div/p[text() = 'Your shopping cart is empty!']")
	public WebElement emptyShoppingCart;
	@FindBy(xpath = "//span[text() = 'Checkout']")
	private WebElement checkout;
	@FindBy(xpath = "//a[text() = 'TEST ENVIRONMENT']")
	private WebElement testEnvironment;
	@FindBy(xpath = "//input[@type = 'text']")
	private WebElement searchBox;
	@FindBy(css = "button[class = 'btn btn-default btn-lg']")
	private WebElement searchButton;
	@FindBy(css = "span[id = 'cart-total']")
	private WebElement items;
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[1]/a")
	private WebElement deskTops;
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[2]/a")
	private WebElement lapTopAndNoteBooks;
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[3]/a")
	private WebElement components;
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[4]/a")
	private WebElement tablets;
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[5]/a")
	private WebElement software;
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[6]/a")
	private WebElement phonesAndPDAs;
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[7]/a")
	private WebElement camera;
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[8]/a")
	private WebElement mp3Players;
	@FindBy(xpath = "//a[text() = 'MacBook']")
	private WebElement macBook;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[1]")
	private WebElement macBookAddToCart;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[1]")
	private WebElement mcBookAddToWish;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[1]")
	private WebElement mcBookCompare;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphone;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[2]")
	private WebElement iphoneAddToCart;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[2]")
	private WebElement iphoneAddToWish;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[2]")
	private WebElement iphoneCompare;
	@FindBy(xpath = "//a[contains(text(),'Cinema')]")
	private WebElement appleCinema30;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[3]")
	private WebElement appleCinema30AddToCart;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[3]")
	private WebElement appleCinema30AddToWish;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[3]")
	private WebElement appleCinema30Compare;
	@FindBy(xpath = "//a[contains(text(),'EOS')]")
	private WebElement canonEOS5D;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[4]")
	private WebElement canonEOS5DAddToCart;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[4]")
	private WebElement canonEOS5DAddToWish;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[4]")
	private WebElement canonEOS5D30Compare;

	public void clickCurrency() {
		currency.click();
	}

	public void clickOnEuro() {
		euro.click();
	}

	public boolean verifyEuro() {
		String text = validateEruo.getText();
		if (text.equalsIgnoreCase("€ Currency ")) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnShoppingCart() {
		shoppingCart.click();
	}

	public boolean validateEmptyShoppingCart() {
		String text1 = emptyShoppingCart.getText();
		if (text1.equalsIgnoreCase("Your shopping cart is empty!")) {
			return true;
		} else {
			return false;
		}
	}
}
