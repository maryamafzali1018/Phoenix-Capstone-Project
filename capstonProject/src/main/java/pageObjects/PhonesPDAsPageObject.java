package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base{
	
	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//ul[@class='breadcrumb']/li/a)[1]")
	private WebElement homePageIcon;
	@FindBy(xpath = "(//ul[@class='breadcrumb']/li/a)[2]")
	private WebElement phoneAndPDAs;
	@FindBy(xpath = "//h2[text()='Phones & PDAs']")
	private WebElement headerPhonesAndPDAs ;
	@FindBy(xpath = "//button[@id='list-view']")
	private WebElement list;
	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement grid ;
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement coompare ;
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sort;
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement show;
	@FindBy(xpath = "//img[@alt='HTC Touch HD']")
	private WebElement htcTouchHDImage;
	@FindBy(xpath = "//h4/a[text()='HTC Touch HD']")
	private WebElement htcTouchHD;
	@FindBy(xpath = "(//div[@class='caption'])[1]/p[1]")
	private WebElement htcDescription;
	@FindBy(xpath = "(//p[contains(@class, 'price')])[1]")
	private WebElement htcPrice;
	@FindBy(xpath = "(//p/span[contains(@class, 'price')])[1]")
	private WebElement htcTax ;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[1]")
	private WebElement addToCartHtc ;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[1]")
	private WebElement addToWishListHtc;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[1]")
	private WebElement compareHtc;
	@FindBy(xpath = "//img[@alt='iPhone']")
	private WebElement iphoneImage;
	@FindBy(xpath = "//h4/a[text()='iPhone']")
	private WebElement iphone;
	@FindBy(xpath = "(//div[@class='caption'])[2]/p[1]")
	private WebElement iphoneDescription;
	@FindBy(xpath = "(//p[contains(@class, 'price')])[2]")
	private WebElement iphonePrice;
	@FindBy(xpath = "(//p/span[contains(@class, 'price')])[2]")
	private WebElement iphoneTax;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[2]")
	private WebElement iphoneAddToCart;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[2]")
	private WebElement iphoneAddToWishList ;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[2]")
	private WebElement iphoneCompare;
	@FindBy(xpath = "//img[@alt='Palm Treo Pro']")
	private WebElement palmTreoProImage; 
	@FindBy(xpath = "//h4/a[text()='Palm Treo Pro']")
	private WebElement plamTreoPro;
	@FindBy(xpath = "(//div[@class='caption'])[3]/p[1]")
	private WebElement palmTreoProDescrip;
	@FindBy(xpath = "(//p[contains(@class, 'price')])[3]")
	private WebElement palmTreoProPrice;
	@FindBy(xpath = "(//p/span[contains(@class, 'price')])[3]")
	private WebElement palmTreoProTax;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[3]")
	private WebElement AddToCartPalm;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[3]")
	private WebElement AddToWishListPalm;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[3]")
	private WebElement comparePalm;
	@FindBy(xpath = "//div[contains(@class, 'col-sm-6 text-right')]")
	private WebElement showingPage1To3;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[12]")
	private WebElement myAccount;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[13]")
	private WebElement orderHistory;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[14]")
	private WebElement wishList;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[15]")
	private WebElement newsLetter;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[8]")
	private WebElement brands;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[9]")
	private WebElement giftCertificates;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[10]")
	private WebElement affilliate;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[11]")
	private WebElement specials;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[6]")
	private WebElement returns;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[7]")
	private WebElement siteMap;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[5]")
	private WebElement contactUs;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[1]")
	private WebElement aboutUs;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[2]")
	private WebElement deliveryInformation;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[3]")
	private WebElement privacyPolicy;
	@FindBy(xpath = "(//div[@class='col-sm-3']/ul/li/a)[4]")
	private WebElement termsAndCondations;
	@FindBy(xpath = "((//h5)[2]")
	private WebElement customerService;
}
