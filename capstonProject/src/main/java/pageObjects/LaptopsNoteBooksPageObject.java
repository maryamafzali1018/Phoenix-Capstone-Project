package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	HomePageObjects homePage = new HomePageObjects();
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[2]/a")
	private WebElement lapTopAndNotBooks;
	@FindBy(xpath = "(//div[@class = 'dropdown-menu']/a)[2]")
	private WebElement allLapTopAndNotBooks;
	@FindBy(xpath = "(//select[@id = 'input-sort']/option)")
	private WebElement sortByMenu;
	@FindBy(xpath = "//a[text() = 'Product Compare (0)']")
	private WebElement productCompare;
	@FindBy(xpath = "(//select[@id = 'input-limit']/option)")
	private WebElement showMenuBar;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[1]")
	private WebElement hpLP3065;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[1]")
	private WebElement addToCartHPLP3065;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[1]")
	private WebElement addToWishListHPLP3065;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[1]")
	private WebElement compareHPLP3065;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[2]")
	private WebElement macBook;
	@FindBy(xpath = "//button[text() = 'Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[2]")
	private WebElement addToCartMacBook;
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement macBookSuccessMessage;
	@FindBy(xpath = "//span[@id ='cart-total']")
	private WebElement totalItemInCart;
	@FindBy(xpath = "//div[@id = 'cart']/button")
	private WebElement clickOnItem;
	@FindBy(xpath = "//td/button[@title = 'Remove']")
	private WebElement removeItem;
	@FindBy(xpath = "//span[@id = 'cart-total']")
	private WebElement cartTotal;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[2]")
	private WebElement addToWishMacBook;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[2]")
	private WebElement compareMacBook;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[3]")
	private WebElement macBookAir;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[3]")
	private WebElement addToCartMacBookAir;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[3]")
	private WebElement addToWishListMacBookAir;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[3]")
	private WebElement compareMacBookAir;
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement compareSuccessMessageMacBookAir;
	@FindBy(xpath = "//a[text() = 'product comparison']")
	private WebElement compareLink;
	@FindBy(xpath = "//div[@id = 'content']")
	private WebElement compareChart;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[4]")
	private WebElement macBookPro;
	@FindBy(xpath = "(//ul[@class ='list-unstyled'])/li/h2")
	private WebElement macBookProPrice;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[4]")
	private WebElement addToCartMacBookPro;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[4]")
	private WebElement addToWishListMacBookPro;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[4]")
	private WebElement compareMacBookPro;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[5]")
	private WebElement sonyVAIO;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[5]")
	private WebElement addToCartSonyVAIO;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[5]")
	private WebElement addToWishListSonyVAIO;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[5]")
	private WebElement compareSonyVAIO;
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement messageToLoginFirst;
	@FindBy(xpath = "//a[text() = 'My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text() = 'Order History']")
	private WebElement orderHistory;
	@FindBy(xpath = "//a[text() = 'Wish List']")
	private WebElement wishList;
	@FindBy(xpath = "//a[text() = 'Newsletter']")
	private WebElement newsLetter;
	@FindBy(xpath = "//a[text() = 'Returns']")
	private WebElement returns;
	@FindBy(xpath = "//a[text() = 'Contact Us']")
	private WebElement contactUs;
	@FindBy(xpath = "//a[text() = 'Delivery Information']")
	private WebElement deliveryInformation;
	@FindBy(xpath = "//a[text() = 'Privacy Policy']")
	private WebElement privacyPolicy;
	@FindBy(xpath = "//a[text() = 'Terms & Conditions']")
	private WebElement termsAndCondations;

	public void clickOnLapTopAndNotBooks() {
		lapTopAndNotBooks.click();
	}

	public void clickOnAllLapTopsAndNotBooks() {
		allLapTopAndNotBooks.click();
	}

	public void clickOnMacBook() {
		macBook.click();
	}

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public void macBookSuccessfulMessage(String text1) {

		if (text1.equalsIgnoreCase("Success: You have added MacBook to your shopping cart!")) {
			logger.info("Text match");
		} else {
			logger.info("Text does not match");

		}
	}

	public boolean totalItemInCartIsDisplayed(String shoppingCart) {
		String text = totalItemInCart.getText();
		if (text.equalsIgnoreCase(shoppingCart)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnItem() {
		clickOnItem.click();
	}

	public void clickToRemoveItem() {
		removeItem.click();
	}

	public boolean validateCartTotal(String totalCart) {
		if (cartTotal.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public void clickOnCompareMacBook(String product1) {
		compareMacBook.click();
	}

	public void clickOnCompareMacBookAir(String product2) {
		compareMacBookAir.click();
	}

	public void seeCompareSuccessMessageMacBookAir(String text1) {
		if (text1.equalsIgnoreCase("Success: You have added MacBook Air to your product comparison!")) {
			logger.info("Text match");
		} else {
			logger.info("Text does not match");

		}
	}

	public void clickOnCompareLink() {
		try {
		compareLink.click();

	}
		catch (StaleElementReferenceException e) {
			//@FindBy(xpath = "//a[text() = 'product comparison']")
			compareLink=driver.findElement(By.xpath("//a[text() = 'product comparison']"));
			compareLink.click();

		}
	}

	public boolean seeCompareChart() {
		if (compareChart.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnAddToWishListSonyVAIO(String product) {
		addToWishListSonyVAIO.click();
	}

	public boolean getMessageToLoginFirst(String text3) {
		if (text3.equals("You must login or create an account to save Sony VAIO to your wish list!")) {
			return true;

		} else {
			return false;
		}

	}

	public void clickOnMacBookPro(String product3) {
		macBookPro.click();
	}

	public boolean validateMacBookProPrice(String price) {
		if (price.equals("$2,000.00")) {
			return true;
		} else {
			return false;
		}
	}
}
