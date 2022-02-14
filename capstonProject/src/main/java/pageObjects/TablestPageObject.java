package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablestPageObject extends Base{
	
	public TablestPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[4]/a")
	private WebElement tablets;
	
	@FindBy(xpath = "(//select[@id = 'input-sort']/option)")
    private WebElement sortByMenu;
	@FindBy(xpath = "//a[text() = 'Product Compare (0)']")
    private WebElement productCompare;
	@FindBy(xpath = "(//select[@id = 'input-limit']/option)")
    private WebElement showMenuBar;
	@FindBy(xpath = "//div[@class = 'product-thumb']/div/div/h4/a[text() = 'Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxyTab10;
	@FindBy(xpath = "//div/button[contains(@onclick,'cart.add')]")
	private WebElement addToCartSamsungGalaxy10;
	@FindBy(xpath = "//div/button[contains(@onclick,'wishlist.add')]")
	private WebElement addTowishListSamsungGalaxy10;
	@FindBy(xpath = "//div/button[contains(@onclick,'compare.add')]")
	private WebElement compareSamsungGalaxy10;
}
