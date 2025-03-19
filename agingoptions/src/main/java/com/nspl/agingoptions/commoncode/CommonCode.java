package com.nspl.agingoptions.commoncode;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nspl.agingoptions.webUtil.WebUtil;

public class CommonCode extends CommonCodeOR{

	private By shadowHost = By.cssSelector("div#mail-body"); // Shadow Root
	private By shadowElement = By.cssSelector("div#shadow-mail-body"); // OTP Container


	private WebUtil util;
	public CommonCode(WebUtil we) {
		super(we);
		this.util=we;
	}

	public String getTutaMailOtp() {

		util.openNewTab();
		util.hitUrl(util.getProperty("tutaMailUrl"));
		util.click(tutaMailEmailTB, "tuta mail text box");
		util.sendValue(tutaMailEmailTB, util.getProperty("tutaMailEmail"), "Attorney Email");  
		util.click(tutaMailPasswordTB, "tuta mail text box");
		util.sendValue(tutaMailPasswordTB, util.getProperty("password"), "Attorney Password");
		util.click(tutaEmailLoginBT, "Login Button");
		util.click(otpMessage, "otp message");
		util.holdOn(Duration.ofSeconds(1));
		return getTutaOtpAlreadyOpenUrl();

	}
	public String getTutaOtpAlreadyOpenUrl() {
		WebElement element = util.getShadowElement(shadowHost, shadowElement);
		String otp=	   util.extractOTP(element);
		util.click(selectAllCheckBox, "select All checkbox");
		util.click(deleteIcon, "Delete all email");
		return otp;
	}
	public void loginAttorneyEmailPassword() {

		util.sendValue(loginEmailTB, util.getProperty("attorneyEmail"), "Login Page Email");
		util.sendValue(loginPasswordTB, util.getProperty("attorneyPassword"), "Login Page Password");
		util.click(universalLoginBT, "Universal Login Button");
		String otp=	getTutaMailOtp();
		util.switchToWindowByUrlContains(util.getProperty("url")+"/Account/verifyOtp", "Otp Verify Page");
		util.sendValue(otpTB, otp, "OTP");
		util.click(clickVerifyOtpBT,"Verify Otp button");
		util.click(paralegalOption, "Paralegal Drop Down");

	}
	public void searchUserParaGotoLPO(String userEmail) {
		util.sendValueWithEnter(paralegalSearchTB, userEmail,"Paralegal Search");
		util.click(paralegalSearchedUser, "Paralegal screen searched user");
	}
	public void clickFamilySideIcon() {
		util.click(familySideIcon, "Family Side Icon");
	}
	public void gotoFamilyIcon(String userEmail) {
		loginAttorneyEmailPassword();
		searchUserParaGotoLPO(userEmail);
		clickFamilySideIcon();

	}

}
