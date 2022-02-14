package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.retailPageObject;
import utilities.Utilities;

public class retailPageSteps extends Base {

	retailPageObject retail = new retailPageObject();

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() throws InterruptedException {
		retail.clickOnMyAccount();
		logger.info("User click on MyAcoount successfully");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickOnLogin();
		logger.info("User click on login button successfully");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password) {
		retail.enterUserName(userName);
		retail.enterPassword(password);
		logger.info("User entered username and password successfully");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickOnLoginButton();
		logger.info("User is clicked on login button successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
		Assert.assertTrue(retail.validateMyAccountDashBoard());
		logger.info("User logged to MyAccount dashboard successfully");
		Utilities.takeScreenShot("account-account");
	}

	@When("User click on {string} link")
	public void user_click_on_link(String text) {
		retail.clickOnRegisterAffiliateAccount(text);
		logger.info("User click on Register for an affiliate account link successfully");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		retail.enterCompanyName(data1.get(0).get("company"));
		retail.enterWebSiteName(data1.get(0).get("website"));
		retail.enterTaxID(data1.get(0).get("taxID"));
		retail.selectPaymentMethod(data1.get(0).get("paymentMethod"));
		retail.ChequePayeeName(data1.get(0).get("ChequePayeeName"));

		logger.info("User entered data1 to fill affiliate form successfully");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.selectCheckBox();
		logger.info("User click on About us check box successfully");
	}

	@When("User click On the Continue  button")
	public void user_click_on_the_continue_button() throws IOException {
		retail.clickContinueButtton();
		logger.info("User click on continue button successfully");
		Utilities.takeScreenShot("Continue");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException {
		retail.verifySuccessMessage();
		logger.info("User see a success message");
		Utilities.takeScreenShot("My Affiliate Account");
	}
	

@When("User click On {string} link1")
	public void user_click_on_link1(String text2) {
		retail.clickEditAffiliateInfo();
		logger.info("User click on edit Affiliat Account successfully");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws InterruptedException {
		retail.enterBankTransfer();
		logger.info("User click on bank transfer successfully");
		Thread.sleep(3000);
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data2 = dataTable.asMaps(String.class, String.class);
		retail.enterBankName(data2.get(0).get("bankName"));
		retail.enterABANum(data2.get(0).get("abaNumber"));
		retail.enterSwiftCodeTo(data2.get(0).get("swiftCode"));
		retail.enterAccountNameTo(data2.get(0).get("accountName"));
		retail.enterAccountNumTo(data2.get(0).get("accountNumber"));

		logger.info("User entered data2 to fill bank information successfully");

	}

	@When("User Click on Continue button1")
	public void user_click_on_continue_button1() {
		retail.clickOnContinueButton1();
		logger.info("User click on continue button1");
	}

	@When("User click on {string} link2")
	public void user_click_on_link2(String text3) {
		retail.editAccountInformation();
		logger.info("User click on edit oyur account information successfully");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> data3 = dataTable.asMaps(String.class, String.class);
		retail.enterFirstName(data3.get(0).get("firstName"));
		retail.enterLastName(data3.get(0).get("lastName"));
		retail.enterEmail(data3.get(0).get("email"));
		retail.enterTelephone(data3.get(0).get("telephone"));

		logger.info("User entered data3 to edit Account information successfully");
	}

	@When("User Click on Continue button2")
	public void user_click_on_continue_button2() {
		retail.clickOnContinueButton2();
		logger.info("User click on continue button2");
	}

}




	