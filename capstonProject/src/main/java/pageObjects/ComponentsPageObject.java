package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {
	
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[3]/a")
	private WebElement componenets;
	@FindBy(xpath = "(//div[@class = 'dropdown-menu']/a)[3]")
	private WebElement showAllComponents;
	@FindBy(xpath = "(//div[@class = 'row'])[3]/div/ul/li/a[text() ='Mice and Trackballs (0)']")
	private WebElement miceAndTrackBalls;
	@FindBy(xpath = "(//div[@class = 'row'])[3]/div/ul/li/a[text() ='Monitors (2)']")
	private WebElement monitors;
	@FindBy(xpath = "(//div[@class = 'row'])[3]/div/ul/li/a[text() ='Printers (0)']")
	private WebElement printers;
	@FindBy(xpath = "(//div[@class = 'row'])[3]/div/ul/li/a[text() ='Scanners (0)']")
	private WebElement scanners;
	@FindBy(xpath = "(//div[@class = 'row'])[3]/div/ul/li/a[text() ='Web Cameras (0)']")
	private WebElement webCameras;
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
