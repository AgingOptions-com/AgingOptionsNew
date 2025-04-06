package com.nspl.agingoptions.commoncode;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

	public void loginAttorneyEmailPassword() {
		util.sendValue(loginEmailTB, util.getProperty("attorneyEmail"), "Login Page Email");
		util.sendValue(loginPasswordTB, util.getProperty("attorneyPassword"), "Login Page Password");
		util.click(universalLoginBT, "Universal Login Button");
		String otp = getTutaMailOtp();
		util.switchToWindowByUrlContains(util.getProperty("url") + "/Account/verifyOtp", "Otp Verify Page");
		util.sendValue(otpTB, otp, "OTP");
		util.click(clickVerifyOtpBT, "Verify Otp button");
		util.holdOn(Duration.ofSeconds(5));
		util.waitUntilPresentInUI(selectAccountText, "Select Account Text");
		util.waitUntilElementClickableAndClick(paralegalOption);

	}

	public void searchUserParaGotoLPO(String userEmail) {
		util.holdOn(Duration.ofSeconds(2));
		util.sendValueWithEnter(paralegalSearchTB, userEmail, "Paralegal Search");
		waitParalegalScreenOldDesignUntilLoaderRandering();
		util.holdOn(Duration.ofSeconds(5));
		util.click(paralegalSearchedUser, "Paralegal screen searched user");
		util.holdOn(Duration.ofSeconds(3));
	}

	public void clickFamilySideIcon() {
		util.click(familySideIcon, "Family Side Icon");
	}

	public void gotoFamilyIcon(String userEmail) {
		loginAttorneyEmailPassword();
		searchUserParaGotoLPO(userEmail);
		clickFamilySideIcon();
	}

	public String createLifePlanningUser(String firstName,String lastName,String email, String phoneNumber) {
		String formattedNumber = "(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
		String userEmail=	email+util.getRandomText(8)+"@maildrop.cc";
		util.holdOn(Duration.ofSeconds(3));
		util.click(newRegistrationBT,"New Registration Button");
		util.holdOn(Duration.ofSeconds(2));
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
	public void inputMarriedUserAcitvationPageDetails(String noOfChild,String primaryMemberDob,String address,String spouseFirstName,String spouseDob ) {
		ActivationPage actObj=	new ActivationPage(util);
		util.holdOn(Duration.ofSeconds(3));
		actObj.selectMarriedRelationshipOptions();
		actObj.selectMaleAsPrimaryMember();
		actObj.inputNoOfChildren(noOfChild);
		actObj.inputPrimaryMemberDob(primaryMemberDob);
		//actObj.inputAddress(address);
		actObj.inputSpouseFirstName(spouseFirstName);
		actObj.inputSpouseDob(spouseDob);
		actObj.clickProceedSubmitButton();
		util.holdOn(Duration.ofSeconds(5));
	}
	public void LoginWithNewMarriedUser() {
		DataUtil data=	new DataUtil();
		Map<String,String>	mapData=data.getTestCaseData("Health_001");
		String firstName=	mapData.get("firstName");
		String lastName=	mapData.get("lastName");
		String email=	mapData.get("userEmail");
		String phoneNumber=	mapData.get("phoneNumber");
		String noOfChild=	mapData.get("noOfChild");
		String primaryMemberDob=	mapData.get("primaryMemberDob");
		String spouseFirstName=	mapData.get("spouseFirstName");
		String spouseDob=	mapData.get("spouseDob");
		String address=	mapData.get("address");
		CommonCode common = new CommonCode(util);
		String UserEmail=	common.createLifePlanningUser(firstName,lastName,email,phoneNumber);
		util.holdOn(Duration.ofSeconds(3));
		common.searchUserParaGotoLPO(UserEmail);
		Duration.ofSeconds(3);
		common.inputMarriedUserAcitvationPageDetails(noOfChild, primaryMemberDob, address, spouseFirstName, spouseDob);
	}

	public void waitParalegalScreenOldDesignUntilLoaderRandering() {
		util.waitForLoaderToDisappear(By.xpath("//div[@class='spinner-border text-primary blockuiloader']"),1);
	}
	public void waitNewDesignIntakeScreenUntilLoaderRandering() {
		util.waitForLoaderToDisappear(By.xpath("//div[@id='customLoader']"),5);
	}

	//////////////////////////////////////////////////////////////////////////////////////////

	public void hiturlOfYopmail() {
		util.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		util.nevigetUrl("https://yopmail.com/en/", "yopmail");
		util.verifyUrl("https://yopmail.com/en/","Yopmail" );

	}
	public void Gotosearchemail(String email) {

		util.clearTextBox(yopmailSearchBox);
		util.sendValue(yopmailSearchBox, email, "Email");

		util.click(YopmailSearchIcon, "Search icon");
		try {
			Thread.sleep(Duration.ofSeconds(4));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String GoTofindtextOfOTP() {
		util.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		util.switchToFrameByWebElement(iFrame);
		String text= util.getInnerText(otpText);
		util.nevigateAction("Otp Page").back();
		util.nevigateAction("").back();
		return text;
	}
	public void returntoframe() {
		util.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		util.nevigateAction("Otp Page").back();
		util.nevigateAction("").back();

	}

	public void gotoinputotp(String otp) {
		util.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		util.sendValue(otpInputBox, otp, "OTP box");
	}
	public void GoToClickVerifyButton() {
		util.click(verifybutton, "OTP Verify button");
	}

	public void GoToClickSignUpLinkAndVerifySignUpPage() {
		util.click(SignUpLink, "SignUp Link");
		try {
			Thread.sleep(Duration.ofSeconds(4));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		util.verifyInnerText(SignUpText, "Sign up","Sign Up");
		//wt.verifyUrl("https://aologinuat.agingoptions.com/Account/Signup", "SignUp");
	}
	public void gotoClickParalegalOptions() {

		util.click(paralegalrole, "Paralegal Role options");
		try {
			Thread.sleep(Duration.ofSeconds(10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//util.verifyTitle("Paralegal ", "Aging Options");
		util.verifyInnerText(ParalegalInnertext,"Intake / LPO Member List","Paralegal screen" );
		// wt.verifyUrl("https://aointakeformuat.agingoptions.com/paralegal", "Paralegal page");
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
		try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		util.verifyInnerText(welcomemessagetextofSignOn, "View portal users here." ,"Sign on");
	}
	public void gotoClickVerifyButtonLoginAfterSignUp() {

		util.click(verifybutton, "OTP Verify button");
		try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void gotoclickOtpButton() {
		util.click(verifybutton, "OTP Verify button"); 
	}
	public void verifyToasterMessage(String Message) {
		util.toasterverification(toasterMessage, Message);
	}
	public void VerifyBackToLogin() {
		util.click(BackTologinLink, "Back To Login Link");
		try {
			Thread.sleep(Duration.ofSeconds(4));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		util.verifyInnerText(LoginText, "Login", "Login Page");
	}
	public void ToasterMessage(String WarningMessage) {
		util.toasterverification(toasterMessage, WarningMessage);
	}

	public void goToClickHousingButtonUnderSetUp() {
		util.click(HousingButtonUnderSetUp, "Housing Button under SetUp Page");
	}
	public void verifyPersonalInfoPage()  {
		util.verifyInnerText(PersonalInformationIcon, "Personal Information", "Personal Information text");

	}
	public void loginWithParalegalYopmail() {

		util.sendValue(loginEmailTB, util.getProperty("paralegalemail"), "Login Page Email");
		util.sendValue(loginPasswordTB, util.getProperty("paralegalPassword"), "Login Page Password");
		util.click(universalLoginBT, "Universal Login Button");
		verifyOtpPage();
		CommonCode commonpage= new CommonCode(util);
		commonpage.hiturlOfYopmail();
		commonpage.Gotosearchemail(util.getProperty("paralegalemail"));
		String otp= commonpage.GoTofindtextOfOTP();
		commonpage.gotoinputotp(otp);
		commonpage.GoToClickVerifyButton();
		util.holdOn(Duration.ofSeconds(15));
		commonpage.gotoClickParalegalOptions();
		util.holdOn(Duration.ofSeconds(12)); }

	public void verifyOtpPage() {
		try {
			Thread.sleep(Duration.ofSeconds(3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		util.verifyInnerText( clicltoresendInnertext, "Click to resend" ,"Otp");
		// wt.verifyUrl("https://aologinuat.agingoptions.com/Account/verifyOtp","OTP page");
	}
}
