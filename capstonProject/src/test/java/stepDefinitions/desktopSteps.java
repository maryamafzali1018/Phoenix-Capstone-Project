package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import pageObjects.DestopsPageObject;
import utilities.Utilities;

public class desktopSteps extends Base {

	DestopsPageObject desktop = new DestopsPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
		Assert.assertTrue(desktop.testEnvironmentIsDisplayed());
		logger.info("User is on the Retail Website");
		Utilities.takeScreenShot("Show All Desktops");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() throws IOException {
		desktop.clickOnDesktopsButton();
		logger.info("Desktop button is clicked successfully");
		Utilities.takeScreenShot("Desktops");
	}

	@When("User click on show all desktops")
	public void user_click_on_show_all_desktops() throws IOException {
		desktop.clickAllDesktopsButton();
		logger.info("AllDesktops button is clicked successfully");
		Utilities.takeScreenShot("Show All Desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
		Assert.assertTrue(desktop.validateDesktopPage());
		logger.info("User can see all items in desktop page");
		Utilities.takeScreenShot("Desktops");

	}

	@When("User click  ADD TO CART option on {string} item")
	public void user_click_add_to_cart_option_on_item(String item) throws IOException {
		desktop.clickAddToCartHPLP3065(item);
		logger.info("user is clicked add to cart button successfully");
		Utilities.takeScreenShot("item");
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer quantity) {
		desktop.selectQuantiy(quantity);
		logger.info("User is cliked quantity 1 successfully");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.clickAddToCart();
		logger.info("User is cliked add to cart button successfully");
	}

	@Then("User should see a message for HP {string}")
	public void user_should_see_a_message_for_HP(String text) throws IOException {
		Assert.assertTrue(desktop.successfulTextForHP(text));
		logger.info("User see a successful message");
		Utilities.takeScreenShot("successfulText");

	}

	@When("User click On ADD TO CART option on {string} item")
	public void user_click_on_add_to_cart_option_on_item(String itemB) throws IOException {
		desktop.clickAddToCartCanonEOS5D(itemB);
		logger.info("User clicked on Add To Cart option successfully");
		Utilities.takeScreenShot("itemB");

	}

	@When("User select color from dropdown {string}")
	public void user_select_color_from_dropdown(String color) throws IOException {
		desktop.selectColorFromDropDown(color);
		logger.info("User select color from dropdwon successfully");
		Utilities.takeScreenShot("color");
	}

	@Then("User should see a message for Canon {string}")
	public void user_should_see_a_message_for_canon(String text1) {
		desktop.successMessageForCanon(text1);
		logger.info("User should see a success message for adding Canon.");

	}

	@When("User click on {string} item")
	public void user_click_on_item(String itemB) {
		desktop.clickOnCanonEOS5D(itemB);
		logger.info("User is clicked on canonEOS5D successfully");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() throws IOException {
		desktop.clickOnWriteReview();
		logger.info("User is clicked on write a review link successfully");
		Utilities.takeScreenShot("Write a review");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) throws IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktop.enterYourName(data.get(0).get("yourname"));
		desktop.enterYourReview(data.get(0).get("review"));
		desktop.selectRating(data.get(0).get("rating"));

		logger.info("User entered data successfully");
		Utilities.takeScreenShot("information");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() throws IOException {
		desktop.clickOnContinueButton();
		logger.info("User is clicked on continue button successfully");
		Utilities.takeScreenShot("Continue");
	}

	@Then("User should see a success message for filling out review {string}")
	public void user_should_see_a_success_message_for_filling_out_review(String text2) {

		desktop.reviewSuccessMessage(text2);
		logger.info("User should see a success review message");

	}
}
