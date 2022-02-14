package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {
	
	public SoftwarePageObject() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[5]/a")
	private WebElement software;
	@FindBy(xpath = "//a[text() = 'Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//a[text() = 'My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text() = 'Order History']")
	private WebElement orderHistory;
	@FindBy(xpath = "//a[text() = 'Wish List']")
	private WebElement wishList;
	@FindBy(xpath = "//a[text() = 'Newsletter']")
	private WebElement newsLetter;
	@FindBy(xpath = "//a[text() = 'Brands']")
	private WebElement brands;
	@FindBy(xpath = "//a[text() = 'Gift Certificates']")
	private WebElement giftCertificates;
	@FindBy(xpath = "//a[text() = 'Affiliate']")
	private WebElement affilliate;
	@FindBy(xpath = "//a[text() = 'Specials']")
	private WebElement specials;
	@FindBy(xpath = "//a[text() = 'Returns']")
	private WebElement returns;
	@FindBy(xpath = "//a[text() = 'Site Map']")
	private WebElement siteMap;
	@FindBy(xpath = "//a[text() = 'Contact Us']")
	private WebElement contactUs;
	@FindBy(xpath = "//a[text() = 'About Us']")
	private WebElement aboutUs;
	@FindBy(xpath = "//a[text() = 'Delivery Information']")
	private WebElement deliveryInformation;
	@FindBy(xpath = "//a[text() = 'Privacy Policy']")
	private WebElement privacyPolicy;
	@FindBy(xpath = "//a[text() = 'Terms & Conditions']")
	private WebElement termsAndCondations;
}
