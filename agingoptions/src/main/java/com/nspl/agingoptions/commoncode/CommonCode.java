package com.nspl.agingoptions.commoncode;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.agingoptions.activationpage.ActivationPage;
import com.nspl.agingoptions.webUtil.DataUtil;
import com.nspl.agingoptions.webUtil.WebUtil;

public class CommonCode extends CommonCodeOR {

	private By shadowHost = By.cssSelector("div#mail-body"); // Shadow Root
	private By shadowElement = By.cssSelector("div#shadow-mail-body"); // OTP Container
	private WebUtil util;

	public CommonCode(WebUtil we) {
		super(we);
		this.util = we;
	}

	public String getTutaMailOtp() {
		util.openNewTab();
		util.hitUrl(util.getProperty("tutaMailUrl"));
		util.click(tutaMailEmailTB, "tuta mail text box");
		util.sendValue(tutaMailEmailTB, util.getProperty("tutaMailEmail"), "Attorney Email");
		util.click(tutaMailPasswordTB, "tuta mail text box");
		util.sendValue(tutaMailPasswordTB, util.getProperty("password"), "Attorney Password");
		util.click(tutaEmailLoginBT, "Login Button");
		util.holdOn(Duration.ofSeconds(4));
		util.waitUntilPresentInUI(otpMessage, "Otp message");
		util.click(otpMessage, "otp message");
		util.holdOn(Duration.ofSeconds(1));
		return getTutaOtpAlreadyOpenUrl();

	}

	public String getTutaOtpAlreadyOpenUrl() {
		WebElement element = util.getShadowElement(shadowHost, shadowElement);
		String otp = util.extractOTP(element);
		util.click(selectAllCheckBox, "select All checkbox");
		util.click(deleteIcon, "Delete all email");
		return otp;
	}

	public void loginParalegalTutaEmailPassword() {
		util.sendValue(loginEmailTB, util.getProperty("attorneyEmail"), "Login Page Email");
		util.sendValue(loginPasswordTB, util.getProperty("attorneyPassword"), "Login Page Password");
		util.click(universalLoginBT, "Universal Login Button");
		String otp = getTutaMailOtp();
		util.switchToWindowByUrlContains(util.getProperty("url") + "/Account/verifyOtp", "Otp Verify Page");
		util.sendValue(otpTB, otp, "OTP");
		util.click(clickVerifyOtpBT, "Verify Otp button");
		util.holdOn(Duration.ofSeconds(5));
		// util.waitUntilPresentInUI(selectAccountText, "Select Account Text");
		try {
			util.waitUntilElementClickableAndClick(paralegalOption);
		} catch (Exception e) {
			util.click(paralegalOption, "Paralegal Options");
		}

	}

	public void searchUserParaGotoLPO(String userEmail) {
		util.holdOn(Duration.ofSeconds(2));
		util.sendValueWithEnter(paralegalSearchTB, userEmail, "Paralegal Search");
		// waitParalegalScreenOldDesignUntilLoaderRandering();
		util.holdOn(Duration.ofSeconds(5));
		try {
			util.waitUntilPresentInUI(paralegalSearchedUser, userEmail);
			util.click(paralegalSearchedUser, "Paralegal screen searched user");
		} catch (Exception e) {
			util.click(paralegalSearchedUser, "Paralegal screen searched user");
		}
		util.holdOn(Duration.ofSeconds(3));
	}

	public void clickFamilySideIcon() {
		util.click(familySideIcon, "Family Side Icon");
	}

	public void gotoFamilyIcon(String userEmail) {
		loginParalegalTutaEmailPassword();
		searchUserParaGotoLPO(userEmail);
		clickFamilySideIcon();
	}

	public String createLifePlanningUser(String firstName, String lastName, String email, String phoneNumber) {
		String formattedNumber = "(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-"
				+ phoneNumber.substring(6);
		String userEmail = email + util.getRandomText(8) + "@maildrop.cc";
		util.holdOn(Duration.ofSeconds(3));
		util.click(newRegistrationBT, "New Registration Button");
		util.holdOn(Duration.ofSeconds(2));
		util.sendValue(countryCodeTB,"91","Country Code Drop Down" );
		util.holdOn(Duration.ofSeconds(1));
		util.click(countryCode91, "Country Code");
		util.sendValueWithAct(phoneNumberTB, formattedNumber, "Phone Number");
		util.sendValue(firstNameTB, firstName, "First Name");
		util.sendValue(lastNameTB, lastName, "Last Name");
		util.sendValueWithAct(emailNameTB, userEmail, "email");
		util.selectDropDownByVisibleText(planDropDown, "Life Planning", "Life Planning");
		util.holdOn(Duration.ofSeconds(1));
		util.waitUntilElementToBeClickable(registerBT);
		util.clickJavaScript(registerBT, "Registration Name Button");
		util.holdOn(Duration.ofSeconds(1));
		util.click(registrationCloseIcon, "Registration Close Icon");
		return userEmail;
	}

	public void inputMarriedUserAcitvationPageDetails(String noOfChild, String primaryMemberDob, String address,
			String spouseFirstName, String spouseDob) {
		ActivationPage actObj = new ActivationPage(util);
		util.holdOn(Duration.ofSeconds(3));
		actObj.selectMarriedRelationshipOptions();
		actObj.selectMaleAsPrimaryMember();
		actObj.inputNoOfChildren(noOfChild);
		//  util.click(countryCodeDropDown, "Country Drop Down");
		actObj.inputPrimaryMemberDob(primaryMemberDob);
		// actObj.inputAddress(address);
		actObj.inputSpouseFirstName(spouseFirstName);
		actObj.inputSpouseDob(spouseDob);
		util.holdOn(Duration.ofSeconds(1));
		actObj.clickProceedSubmitButton();
		util.holdOn(Duration.ofSeconds(5));
		String actualText=	getPersonalInfoText();
		System.out.println(actualText);
	}

	public void LoginWithNewMarriedUser() {
		DataUtil data = new DataUtil();
		Map<String, String> mapData = data.getTestCaseData("Health_001");
		String firstName = mapData.get("firstName");
		String lastName = mapData.get("lastName");
		String email = mapData.get("userEmail");
		String phoneNumber = mapData.get("phoneNumber");
		String noOfChild = mapData.get("noOfChild");
		String primaryMemberDob = mapData.get("primaryMemberDob");
		String spouseFirstName = mapData.get("spouseFirstName");
		String spouseDob = mapData.get("spouseDob");
		String address = mapData.get("address");
		CommonCode common = new CommonCode(util);
		String UserEmail = common.createLifePlanningUser(firstName, lastName, email, phoneNumber);
		util.holdOn(Duration.ofSeconds(3));
		common.searchUserParaGotoLPO(UserEmail);
		Duration.ofSeconds(3);
		common.inputMarriedUserAcitvationPageDetails(noOfChild, primaryMemberDob, address, spouseFirstName, spouseDob);
	}

	public void waitParalegalScreenOldDesignUntilLoaderRandering() {
		util.waitForLoaderToDisappear(By.xpath("//div[@class='spinner-border text-primary blockuiloader']"), 1);
	}

	public void waitNewDesignIntakeScreenUntilLoaderRandering() {
		util.waitForLoaderToDisappear(By.xpath("//div[@id='customLoader']"), 5);
	}

	//////////////////////////////////////////////////////////////////////////////////////////

	public void hiturlOfYopmail() {
		util.nevigetUrl("https://yopmail.com/en/", "Yop Mail");
	}

	public void searchYopEmail(String email) {

		util.clearTextBox(yopmailSearchBox);
		util.sendValue(yopmailSearchBox, email, "Email");
		util.click(YopmailSearchIcon, "Search icon");
		util.holdOn(Duration.ofSeconds(2));
		util.click(yopEmailRefreshIcon, "Yop Email Refresh Icon");
		util.holdOn(Duration.ofSeconds(4));
	}

	public String gettextOfOTP() {
		// util.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		util.switchToFrameByWebElement(iFrame);
		String text = util.getInnerText(otpText);
		// util.nevigateAction("Otp Page").back();
		// util.nevigateAction("").back();
		return text;
	}

	public void returntoframe() {
		util.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		util.nevigateAction("Otp Page").back();
		util.nevigateAction("").back();

	}

	public void inputotp(String otp) {
		util.holdOn(Duration.ofSeconds(2));
		util.sendValue(otpInputBox, otp, "OTP box");
	}

	public void clickVerifyOtpButton() {
		util.click(verifybutton, "OTP Verify button");
	}

	public void GoToClickSignUpLinkAndVerifySignUpPage() {
		util.click(SignUpLink, "SignUp Link");
		util.holdOn(Duration.ofSeconds(4));
		util.verifyInnerText(SignUpText, "Sign up", "Sign Up");
		// wt.verifyUrl("https://aologinuat.agingoptions.com/Account/Signup", "SignUp");
	}

	public void gotoClickParalegalOptions() {

		util.click(paralegalrole, "Paralegal Role options");
		util.holdOn(Duration.ofSeconds(10));
		// util.verifyTitle("Paralegal ", "Aging Options");
		util.verifyInnerText(ParalegalInnertext, "Intake / LPO Member List", "Paralegal screen");
		// wt.verifyUrl("https://aointakeformuat.agingoptions.com/paralegal", "Paralegal
		// page");
	}

	public void GotoclickAdminRoleoptions() {

		util.click(AdminRole, "Admin Role");
		util.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		util.verifyTitle("Admin", "AO Admin");
	}

	public void GoTOClickEventCoordinatorRole() {

		util.click(EventCoordinatiorRole, "Event Coordinator");
		util.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		util.verifyTitle("Counter Coordinator", "Counter-Coordinator");

	}

	public void GoToClickSignOnRole() {
		util.click(SignOnRole, "Sign On");
		util.holdOn(Duration.ofSeconds(8));
		util.verifyInnerText(welcomemessagetextofSignOn, "View portal users here.", "Sign on");
	}

	public void gotoClickVerifyButtonLoginAfterSignUp() {

		util.click(verifybutton, "OTP Verify button");
		util.holdOn(Duration.ofSeconds(8));
	}

	public void gotoclickOtpButton() {
		util.click(verifybutton, "OTP Verify button");
	}

	public void verifyToasterMessage(String Message) {
		util.toasterverification(toasterMessage, Message);
	}

	public void VerifyBackToLogin() {
		util.click(BackTologinLink, "Back To Login Link");
		util.holdOn(Duration.ofSeconds(4));
		util.verifyInnerText(LoginText, "Login", "Login Page");
	}

	public void ToasterMessage(String WarningMessage) {
		util.toasterverification(toasterMessage, WarningMessage);
	}

	public void goToClickHousingButtonUnderSetUp() {
		util.click(HousingButtonUnderSetUp, "Housing Button under SetUp Page");
	}

	public void verifyPersonalInfoPage() {
		util.verifyInnerText(PersonalInformationIcon, "Personal Information", "Personal Information text");

	}

	public void loginWithParalegalYopmail() {

		util.sendValue(loginEmailTB, util.getProperty("paralegalemail"), "Login Page Email");
		util.sendValue(loginPasswordTB, util.getProperty("paralegalPassword"), "Login Page Password");
		util.click(universalLoginBT, "Universal Login Button");
		CommonCode commonpage = new CommonCode(util);
		commonpage.verifyOtpPage();
		util.openNewTab();
		commonpage.hiturlOfYopmail();
		commonpage.searchYopEmail(util.getProperty("paralegalemail"));
		util.holdOn(Duration.ofSeconds(5));
		String otp = commonpage.gettextOfOTP();
		util.switchToWindowByUrlContains(util.getProperty("url") + "/Account/verifyOtp", "Otp Verify Page");
		commonpage.inputotp(otp);
		commonpage.clickVerifyOtpButton();
		util.holdOn(Duration.ofSeconds(5));
		try {
			util.waitUntilElementClickableAndClick(paralegalOption);
		} catch (Exception e) {
			util.click(paralegalOption, "Paralegal Options");
		}
		util.holdOn(Duration.ofSeconds(2));
	}

	public void verifyOtpPage() {
		util.holdOn(Duration.ofSeconds(3));
		util.verifyInnerText(clickToResendInnertext, "Click to resend", "Otp");
		// wt.verifyUrl("https://aologinuat.agingoptions.com/Account/verifyOtp","OTP
		// page");
	}

	public void clickSaveContinueLaterButton() {
		util.click(saveContinueLaterBT, "Save & Continue Later Button");
	}

	public void clickSaveAddAnotherButton() {
		util.click(saveAddAnotherBT, "Save & Add Another button");
	}

	public void clickPreviousButton() {
		util.click(previousButton, "Previous Button");
	}

	@FindBy(xpath = "//p[text()='Copy same data to spouse']/parent::div//input")
	private WebElement copySameDataToSpouseCheckBox;

	public void checkCopySameDataToSpouseCheckBox() {
		try {
			util.waitUntilElementIsDeselected(copySameDataToSpouseCheckBox, 10);
			util.checkCheckBox(copySameDataToSpouseCheckBox, "Copy Same Data To Spouse");
			util.waitUntilElementIsSelected(copySameDataToSpouseCheckBox, 5);
		} catch (Exception e) {
			util.checkCheckBox(copySameDataToSpouseCheckBox, "Copy Same Data To Spouse");
		}
	}

	@FindBy(xpath = "(//div[contains(@class,'btn-div addBorderToToggleButton')]/button)[1]")
	private WebElement primaryMemberToggleButton;

	public void clickPrimaryMemberToggleButton() {
		util.click(primaryMemberToggleButton, "Primary Member Toggle Button");
	}

	@FindBy(xpath = "(//div[contains(@class,'btn-div addBorderToToggleButton')]/button)[2]")
	private WebElement spouseToggleButton;

	public void clickSpouseToggleButton() {
		util.click(spouseToggleButton, "Spouse Toggle Button");
	}

	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	private WebElement saveAndProceedToSpouseBT;

	public void clickSaveAndProceedToSpouseBT() {
		util.click(saveAndProceedToSpouseBT, "Save & Proceed To Spouse Button");
	}

	public void waitUntilToasterMessageisHide() {
		util.waitUntilElementIsDisappearFromThePage(toasterMessage, 20);
	}

	@FindBy(xpath="//h1[contains(text(),'Personal Information')]")
	private WebElement personalInfoText;

	public String getPersonalInfoText() {
		String text=	util.getInnerText(personalInfoText);
		return text;
	}
	public void unCheckCopySameDataToSpouseCheckBox() {
		try {
			util.holdOn(Duration.ofSeconds(1));
			util.unCheckCheckBox(copySameDataToSpouseCheckBox, "Copy Same Data To Spouse");
			util.waitUntilElementIsDeselected(copySameDataToSpouseCheckBox, 10);
		} catch (Exception e) {
			util.unCheckCheckBox(copySameDataToSpouseCheckBox, "Copy Same Data To Spouse");
		}
	}
	
	@FindBy(xpath="//input[@id='insStartDate']")
	private WebElement coverageStartDateTB;

	public void inputInsuranceStartDate(String value) {
		util.sendValue(coverageStartDateTB, value, "Coverage start date");
	}
	
	public String getCoverageStartInputText() {
		String value=	  util.GetAttributevalue(coverageStartDateTB, "value");
		String date=	util.convertDateFormatMMDDYYYY(value);
		return date;
	}

	public void waitUntilToasterMessageisSeen() {
		util.waitUntilElementIsAppearInThePage(toasterMessage, 40);
	}
	
}
