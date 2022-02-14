package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {
	
	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//ul[@class='breadcrumb']/li/a)[1]")
	private WebElement homePageIcon;
	@FindBy(xpath = "(//ul[@class='breadcrumb']/li/a)[2]")
	private WebElement phoneAndPDAs;
	@FindBy(xpath = "//h2[text()='MP3 Players']")
	private WebElement mp3PlayersHeader;
	@FindBy(xpath = "//div[@class='col-sm-2']/img")
	private WebElement mp3PlayersImage;
	@FindBy(xpath = "//div[@class='col-sm-10']/p")
	private WebElement mp3PlayersText;
	@FindBy(xpath = "//div/h3")
	private WebElement refineSearch;
	@FindBy(xpath = "(//div[@class='row'])[4]/div/ul/li")
	private WebElement allTestLocators;
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
	@FindBy(xpath = "//img[@alt='iPod Classic']")
	private WebElement ipodClassicImage;
	@FindBy(xpath = "//h4/a[text()='iPod Classic']")
	private WebElement ipodClassicHeader;
	@FindBy(xpath = "(//div[@class='caption'])[2]/p[1]")
	private WebElement ipodDescription;
	@FindBy(xpath = "(//p[contains(@class, 'price')])[1]")
	private WebElement ipodClassicPrice;
	@FindBy(xpath = "(//p/span[contains(@class, 'price')])[1]")
	private WebElement ipodClassicTax;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[1]")
	private WebElement ipodClassicAddToCart;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[1]")
	private WebElement  ipodClassicAddToWishList;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[1]")
	private WebElement ipodClassiCompare;
	@FindBy(xpath = "//img[@alt='iPod Nano']")
	private WebElement ipodNanoImage;
	@FindBy(xpath = "//h4/a[text()='iPod Nano']")
	private WebElement ipodNanoHeader;
	@FindBy(xpath = "(//div[@class='caption'])[2]/p[1]")
	private WebElement ipodNanoDescrip;
	@FindBy(xpath = "(//p[contains(@class, 'price')])[2]")
	private WebElement ipodNanoPrice ;
	@FindBy(xpath = "(//p/span[contains(@class, 'price')])[2]")
	private WebElement ipodNanoTax;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[2]")
	private WebElement addToCartIpodNano;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[2]")
	private WebElement addToWishListIpodNano;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[2]")
	private WebElement compareIpodNano;
	@FindBy(xpath = "//img[@alt='iPod Shuffle']")
	private WebElement ipodShuffleImage;
	@FindBy(xpath = "//h4/a[text()='iPod Shuffle']")
	private WebElement ipodShuffleHeader;
	@FindBy(xpath = "(//div[@class='caption'])[3]/p[1]")
	private WebElement ipodShuffleDescription;
	@FindBy(xpath = "(//p[contains(@class, 'price')])[3]")
	private WebElement ipodShufflePrice;
	@FindBy(xpath = "(//p/span[contains(@class, 'price')])[3]")
	private WebElement ipodShuffleTax;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[3]")
	private WebElement addToCartIpodShuffle;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[3]")
	private WebElement addToWishListIpodShuffle;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[3]")
	private WebElement compareIpodShuffle;
	@FindBy(xpath = "//img[@alt='iPod Touch']")
	private WebElement ipodTouchImage;
	@FindBy(xpath = "//h4/a[text()='iPod Touch']")
	private WebElement ipodTouchHeader;
	@FindBy(xpath = "(//div[@class='caption'])[4]/p[1]")
	private WebElement ipodTouchDescription;
	@FindBy(xpath = "(//p[contains(@class, 'price')])[4]")
	private WebElement ipodTouchPrice ;
	@FindBy(xpath = "(//p/span[contains(@class, 'price')])[4]")
	private WebElement ipodTouchTax;
	@FindBy(xpath = "(//button[contains(@onclick, 'cart.add')])[4]")
	private WebElement addToCartIpodTouch;
	@FindBy(xpath = "(//button[contains(@onclick, 'wishlist.add')])[4]")
	private WebElement addToWishListIpodTouch;
	@FindBy(xpath = "(//button[contains(@onclick, 'compare.add')])[4]")
	private WebElement compareIpodTouch;
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


