package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class lapTopAndNoteBooksSteps extends Base {

	LaptopsNoteBooksPageObject lapAndNoteBooks = new LaptopsNoteBooksPageObject();

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		lapAndNoteBooks.clickOnLapTopAndNotBooks();
		logger.info("User is clicked on Laptop & NoteBooks successfully");
	}

	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		lapAndNoteBooks.clickOnAllLapTopsAndNotBooks();
		logger.info("User clicked on all Laptop & NoteBooks");
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		lapAndNoteBooks.clickOnMacBook();
		logger.info("User clicked on MacBook item Successfully");

	}

	@When("User click add to Cart button for macBook")
	public void user_click_add_to_cart_button_for_mac_book() {
		lapAndNoteBooks.clickOnAddToCartButton();
		logger.info("User click add to Cart button for macBook successfully");
	}

	@Then("User should see macBook success message {string}")
	public void user_should_see_mac_book_success_message(String text1) {
		lapAndNoteBooks.macBookSuccessfulMessage(text1);
		logger.info("User see a successful message");

	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String shoppingCart) throws IOException {
		lapAndNoteBooks.totalItemInCartIsDisplayed(shoppingCart);
		logger.info("User should see" + " " + shoppingCart + " " + "showed to the cart successfully");
		Utilities.takeScreenShot("item(s)");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		lapAndNoteBooks.clickOnItem();
		logger.info("User click on shopping cart successfully");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		lapAndNoteBooks.clickToRemoveItem();
		logger.info("User remove the item from the cart successfully");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String totalCart) throws IOException {
		Assert.assertTrue(lapAndNoteBooks.validateCartTotal(totalCart));
		logger.info("Item should be removed and cart should show" + "" + totalCart + "");
		Utilities.takeScreenShot(" 0 item(s) - $0.00");
	}

	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String product1) {
		lapAndNoteBooks.clickOnCompareMacBook(product1);
		logger.info("User click on MacBook compare button successfully");
	}

	@When("User click on MacBook Air comparison icon on {string}")
	public void user_click_on_mac_book_air_comparison_icon_on(String product2) {
		lapAndNoteBooks.clickOnCompareMacBookAir(product2);
		logger.info("User click on MacBook Air compare button successfully");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String text2) {
		lapAndNoteBooks.seeCompareSuccessMessageMacBookAir(text2);
		logger.info("User should see a compare message successfully");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		lapAndNoteBooks.clickOnCompareLink();
		logger.info("User click on product comparison link successfully");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException {
		Assert.assertTrue(lapAndNoteBooks.seeCompareChart());
		logger.info("User should see product comparison chart successfully");
		Utilities.takeScreenShot("Product Details");
	}

	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String product) {
		lapAndNoteBooks.clickOnAddToWishListSonyVAIO(product);
		logger.info("User click on heart icon successfully");
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String text3) {
		Assert.assertTrue(lapAndNoteBooks.getMessageToLoginFirst(text3));
		logger.info("User get a message to login first");
	}

	@When("User click On {string} item")
	public void user_click_on_item(String product3) {
		lapAndNoteBooks.clickOnMacBookPro(product3);
		logger.info("User click on MacBookPro item successfully");
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String price) throws IOException {
		Assert.assertTrue(lapAndNoteBooks.validateMacBookProPrice(price));
		logger.info("User verify the price on UI for the MacBook Pro");
		Utilities.takeScreenShot("MacBook Pro");
	}

}
