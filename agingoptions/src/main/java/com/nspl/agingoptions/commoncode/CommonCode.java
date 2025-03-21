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
		util.waitUntilElementClickableAndClick(paralegalOption);

	}

	public void searchUserParaGotoLPO(String userEmail) {
		util.holdOn(Duration.ofSeconds(3));
		util.sendValueWithEnter(paralegalSearchTB, userEmail, "Paralegal Search");
		util.holdOn(Duration.ofSeconds(5));
		util.click(paralegalSearchedUser, "Paralegal screen searched user");
		util.holdOn(Duration.ofSeconds(1));
	}

	public void clickFamilySideIcon() {
		util.click(familySideIcon, "Family Side Icon");
	}

	public void gotoFamilyIcon(String userEmail) {
		loginAttorneyEmailPassword();
		searchUserParaGotoLPO(userEmail);
		clickFamilySideIcon();
	}
	public String createLifePlanningUser() {
		String firstNameValue=	util.getProperty("firstName");
		String lastName=	util.getProperty("lastName");
		String phoneNum=	util.getProperty("phoneNumber");
		String formattedNumber = "(" + phoneNum.substring(0, 3) + ")" + phoneNum.substring(3, 6) + "-" + phoneNum.substring(6);
		String email=	util.getProperty("email")+util.getRandomText(8)+"@maildrop.cc";
		util.holdOn(Duration.ofSeconds(3));
		util.click(newRegistrationBT,"New Registration Button");
		util.holdOn(Duration.ofSeconds(2));
		util.sendValueWithAct(phoneNumberTB, formattedNumber, "Phone Number");
		util.sendValue(firstNameTB, firstNameValue, "First Name");
		util.sendValue(lastNameTB, lastName, "Last Name");
		util.sendValueWithAct(emailNameTB, email, "email");
		util.selectDropDownByVisibleText(planDropDown, "Life Planning", "Life Planning");
		util.holdOn(Duration.ofSeconds(1));
        util.waitUntilElementToBeClickable(registerBT);
		util.clickJavaScript(registerBT, "Registration Name Button");
		util.holdOn(Duration.ofSeconds(1));
		util.click(registrationCloseIcon, "Registration Close Icon");
		return email;
	}
	public void inputMarriedUserAcitvationPageDetails(String noOfChild,String primaryMemberDob,String address,String spouseFirstName,String spouseDob ) {
		ActivationPage actObj=	new ActivationPage(util);
		actObj.selectMarriedRelationshipOptions();
		actObj.selectMaleAsPrimaryMember();
		actObj.inputNoOfChildren(noOfChild);
		actObj.inputPrimaryMemberDob(primaryMemberDob);
		//actObj.inputAddress(address);
		actObj.inputSpouseFirstName(spouseFirstName);
		actObj.inputSpouseDob(spouseDob);
		actObj.clickProceedSubmitButton();
		
	}

}
