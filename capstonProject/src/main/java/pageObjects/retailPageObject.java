package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class retailPageObject extends Base {

	public retailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text() = 'My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text() = 'Login']")
	private WebElement login;

	@FindBy(xpath = "//input[@id = 'input-email']")
	private WebElement userNameFiled;

	@FindBy(xpath = "//input[@id = 'input-password']")
	private WebElement passwordFiled;

	@FindBy(xpath = "//input[@value = 'Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//div[@id = 'account-account']")
	private WebElement myAccountDashBoard;

	@FindBy(xpath = "//a[text() = 'Register for an affiliate account']")
	private WebElement registerAffilliateAccount;

	@FindBy(xpath = "//div/input[@name = 'search']")
	private WebElement companyName;
	@FindBy(xpath = "//div/input[@name = 'website']")
	private WebElement websiteName;
	@FindBy(xpath = "//div/input[@name = 'tax']")
	private WebElement enterTaxId;
	@FindBy(xpath = "(//div[@class ='radio'])[1]")
	private WebElement selectPaymentMethod;
	@FindBy(xpath = "//div/input[@name = 'cheque']")
	private WebElement enterChequePayeeName;
	@FindBy(xpath = "//input[@type = 'checkbox']")
	private WebElement checkBox;
	@FindBy(xpath = "//input[@class = 'btn btn-primary']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successMessage;
	@FindBy(xpath = "//a[text() = 'Edit your affiliate information']")
	private WebElement editAffiliateInfo;
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]/label")
	private WebElement bankTransfer;
	@FindBy(xpath = "//input[@id ='input-bank-name']")
	private WebElement bankname;
	@FindBy(xpath = "//input[@id = 'input-bank-swift-code']")
	private WebElement enterSwiftCode;
	@FindBy(xpath = "//input[@name ='bank_branch_number']")
	private WebElement abaNum;
	@FindBy(xpath = "//input[@id = 'input-bank-account-name']")
	private WebElement enterAccountName;
	@FindBy(xpath = "//input[@id = 'input-bank-account-number']")
	private WebElement accountNum;
	@FindBy(xpath = "//input[@value = 'Continue']")
	private WebElement continueButon1;
	@FindBy(xpath = "//input[@value = 'Continue']")
	private WebElement continueButon2;
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successMessage1;
	@FindBy(xpath = "//a[text() = 'Edit your account information']")
	private WebElement editAccountInfo;
	@FindBy(xpath = "//input[@id = 'input-firstname']")
	private WebElement editFirstName;
	@FindBy(xpath = "//input[@id = 'input-lastname']")
	private WebElement editLastName;
	@FindBy(xpath = "//input[@id = 'input-email']")
	private WebElement editEmail;
	@FindBy(xpath = "//input[@id = 'input-telephone']")
	private WebElement editTelephone;

	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterUserName(String userName) {
		userNameFiled.sendKeys("husnajan24@gmail.com");
	}

	public void enterPassword(String password) {
		passwordFiled.sendKeys("Sanna1");
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public boolean validateMyAccountDashBoard() {

		if (myAccountDashBoard.isDisplayed()) {
			return true;

		} else {
			return false;
		}
	}

	public void clickOnRegisterAffiliateAccount(String text) {
		registerAffilliateAccount.click();
	}

	public void enterCompanyName(String company) {
		companyName.sendKeys(company);
	}

	public void enterWebSiteName(String website) {
		websiteName.sendKeys(website);
	}

	public void enterTaxID(String taxID) {
		enterTaxId.sendKeys(taxID);
	}

	public void selectPaymentMethod(String paymentMethod) {
		selectPaymentMethod.click();
		selectPaymentMethod.isSelected();
	}

	public void ChequePayeeName(String chequePayeeName) {
		enterChequePayeeName.sendKeys(chequePayeeName);

	}

	public void selectCheckBox() {
		checkBox.click();
	}

	public void clickContinueButtton() {
		continueButton.click();
	}

	public boolean verifySuccessMessage() {
		String text = successMessage.getText();
		if (text.equalsIgnoreCase(" Success: Your account has been successfully updated.")) {
			return true;
		} else {
			return false;
		}
	}

	public void clickEditAffiliateInfo() {
		editAffiliateInfo.click();
	}

	public void enterBankTransfer() {
		Utilities.scrolldownPage();
		bankTransfer.click();
		bankTransfer.isSelected();
	}

	public void enterBankName(String bankName) {
		bankname.sendKeys(bankName);
	}

	public void enterABANum(String abaNumber) {
		abaNum.sendKeys(abaNumber);
	}

	public void enterSwiftCodeTo(String swiftCode) {
		enterSwiftCode.sendKeys(swiftCode);
	}

	public void enterAccountNameTo(String accountName) {
		enterAccountName.sendKeys(accountName);
	}

	public void enterAccountNumTo(String accountNumber) {
		accountNum.sendKeys(accountNumber);
	}

	public void clickOnContinueButton1() {
		continueButon1.click();
	}

	public void editAccountInformation() {
		editAccountInfo.click();
	}

	public void enterFirstName(String firstName) {
		editFirstName.clear();
		editFirstName.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		editLastName.clear();
		editLastName.sendKeys(lastName);
	}

	public void enterEmail(String email) {
		editEmail.clear();
		editEmail.sendKeys(email);
	}

	public void enterTelephone(String telephone) {
		editTelephone.clear();
		editTelephone.sendKeys(telephone);
	}

	public void clickOnContinueButton2() {
		continueButon2.click();
	}

}