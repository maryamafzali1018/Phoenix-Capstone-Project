package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class DestopsPageObject extends Base {

	public DestopsPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class = 'col-sm-4']//a")
	private WebElement testEnvironment;
	@FindBy(xpath = "//a[text() = 'Desktops']")
	private WebElement desktopsButton;
	@FindBy(xpath = "//a[text() = 'PC (0)']")
	private WebElement pc;
	@FindBy(xpath = "//a[text() = 'Mac (1)']")
	private WebElement mac;
	@FindBy(xpath = "(//div[@class = 'dropdown-menu']/a)[1]")
	private WebElement allDesktopsButton;
	@FindBy(xpath = "//h2[text() = 'Desktops']")
	private WebElement desktopPage;
	@FindBy(xpath = "(//select[@id = 'input-sort']/option)")
	private WebElement sortByMenu;
	@FindBy(xpath = "//a[text() = 'Product Compare (0)']")
	private WebElement productCompare;
	@FindBy(xpath = "(//select[@id = 'input-limit']/option)")
	private WebElement showMenuBar;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[1]")
	private WebElement apppleCinema30;
	@FindBy(xpath = "((//button[contains(@onclick, 'cart.add')])[1]")
	private WebElement addToCartAppleCinema30;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[1]")
	private WebElement addToWishListAppleCinema30;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[1]")
	private WebElement compareAppleCinema30;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[2]")
	private WebElement canonEOS5D;
	@FindBy(xpath = "//a[text() ='Write a review']")
	private WebElement writeReview;
	@FindBy(xpath = "//input[@name = 'name']")
	private WebElement yourName;
	@FindBy(xpath = "//textarea[@id ='input-review']")
	private WebElement yourReview;
	@FindBy(xpath = "(//div[@class = 'col-sm-12']//input[@type = 'radio'])[3]")
	private WebElement selectRating;
	@FindBy(xpath = "//button[@id = 'button-review']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@class ='alert alert-success alert-dismissible']")
	private WebElement reviewSuccessMessage;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[2]")
	private WebElement addToCartCanonEOS5D;
	@FindBy(xpath = "//select[@id = 'input-option226']")
	private WebElement selectColor;
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successMessageForCanon;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[2]")
	private WebElement addToWishListCanonEOS5D;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[2]")
	private WebElement compareCanonEOS5D;
	@FindBy(xpath = "//img[@title ='HP LP3065']")
	private WebElement hpLp3065Image;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[3]")
	private WebElement hpLP3065;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[3]")
	private WebElement addToCartHPLP3065;
	@FindBy(xpath = "//input[@id ='input-quantity']")
	private WebElement selectQuantiy;
	@FindBy(xpath = "//button[@id ='button-cart']")
	private WebElement clickAddToCart;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[3]")
	private WebElement addToWishListHPLP3065;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[3]")
	private WebElement compareHPLP3065;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[4]")
	private WebElement htcTouchHD;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[4]")
	private WebElement addToCartHtcTouchHD;
	@FindBy(css = "div[class ='alert alert-success alert-dismissible']")
	private WebElement successfulText;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[4]")
	private WebElement addToWishListHtcTouchHD;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[4]")
	private WebElement compareHtcTouchHD;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[5]")
	private WebElement iphone;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[5]")
	private WebElement addToCartIphone;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[5]")
	private WebElement addToWishListIphone;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[5]")
	private WebElement compareIphone;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[6]")
	private WebElement ipodClassic;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[6]")
	private WebElement addToCartIpodClassic;
	@FindBy(xpath = "(((//button[contains(@onclick, 'wishlist.add')])[6]")
	private WebElement addToWishListIpodClassic;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[6]")
	private WebElement compareIpodClassic;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[7]")
	private WebElement macBook;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[7]")
	private WebElement addToCartMacBook;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[7]")
	private WebElement addToWishMacBook;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[7]")
	private WebElement compareMacBook;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[8]")
	private WebElement macBookAir;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[8]")
	private WebElement addToCartMacBookAir;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[8]")
	private WebElement addToWishListMacBookAir;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[8]")
	private WebElement compareMacBookAir;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[9]")
	private WebElement palmTreoPro;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[9]")
	private WebElement addToCartPalmTreoPro;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[9]")
	private WebElement addToWishListPalmTreoPro;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[9]")
	private WebElement comparePalmTreoPro;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[10]")
	private WebElement product8;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[10]")
	private WebElement addToCartProduct8;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[10]")
	private WebElement addToWishListProduct8;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[10]")
	private WebElement compareProduct8;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[11]")
	private WebElement samsungSyncMaster941BW;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[11]")
	private WebElement addToCartSamsungSyncMaster941BW;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[11]")
	private WebElement addToWishListSamsungSyncMaster941BW;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[11]")
	private WebElement compareSamsungSyncMaster941BW;
	@FindBy(xpath = "(//div[contains(@class,'caption')]/h4/a)[12]")
	private WebElement sonyVAIO;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[12]")
	private WebElement addToCartSonyVAIO;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[12]")
	private WebElement addToWishListSonyVAIO;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[12]")
	private WebElement compareSonyVAIO;
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

	public boolean testEnvironmentIsDisplayed() {
		String text = testEnvironment.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnDesktopsButton() {
		desktopsButton.click();
		Utilities.scrolldownPage();
	}

	public void clickAllDesktopsButton() {
		allDesktopsButton.click();
	}

	public boolean validateDesktopPage() {

		if (desktopPage.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickAddToCartHPLP3065(String item) {
		addToCartHPLP3065.click();
	}

	public void selectQuantiy(int quantity) {
		selectQuantiy.click();
	}

	public void clickAddToCart() {
		clickAddToCart.click();
	}

	public boolean successfulTextForHP(String text) {

		if (text.equalsIgnoreCase("Success: you have added HP LP 3065 to your Shopping cart!")) {
			return true;
		} else {
			return false;

		}
	}

	public void clickAddToCartCanonEOS5D(String itemB) {
		addToCartCanonEOS5D.click();
	}

	public void selectColorFromDropDown(String color) {
		Utilities.selectByVisibleText(selectColor, color);
	}

	public void successMessageForCanon(String text1) {

		if (text1.equalsIgnoreCase("Success: You have added Canon EOS 5D to your shopping cart!")) {
			logger.info("Text match");
		} else {
			logger.info("Text does not match");

		}
	}

	public void clickOnCanonEOS5D(String itemB) {
		canonEOS5D.click();
	}

	public void clickOnWriteReview() {
		writeReview.click();
	}

	public void enterYourName(String yourname) {
		yourName.sendKeys(yourname);
	}

	public void enterYourReview(String review) {
		yourReview.sendKeys(review);
	}

	public void selectRating(String rating) {
		selectRating.click();
		selectRating.isSelected();
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public void reviewSuccessMessage(String text2) {

		if (text2.equalsIgnoreCase("Thank you for your review.")) {
			logger.info("Text match");
		} else {
			logger.info("Text does not match");

		}
	}

}
