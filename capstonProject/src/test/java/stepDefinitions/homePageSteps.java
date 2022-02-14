package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import pageObjects.HomePageObjects;
import utilities.Utilities;

public class homePageSteps extends Base {

	HomePageObjects home = new HomePageObjects();

	@When("User click on Currency")
	public void user_click_on_currency() throws IOException {
		home.clickCurrency();
		logger.info("user click on currency successfully");
		Utilities.takeScreenShot("Currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws IOException {
		home.clickOnEuro();
		logger.info("User chose Euro from dropdown list successfully");
		Utilities.takeScreenShot("€ Euro");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
		Assert.assertTrue(home.verifyEuro());
		logger.info("User can see currency change to Euro");
		Utilities.takeScreenShot("€ Currency ");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		home.clickOnShoppingCart();
		logger.info("User click on shopping cart successfully");
	}

	@Then("{string} message should display")
	public void message_should_display(String string) throws IOException {
		Assert.assertTrue(home.validateEmptyShoppingCart());
		logger.info("This message Your shopping cart is empty! is displayed");
		Utilities.takeScreenShot("Shopping Cart");
	}

}
