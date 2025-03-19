package com.nspl.agingoptions.commoncode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class CommonCodeOR   {

	public CommonCodeOR(WebUtil we) {
		PageFactory.initElements(we.getDriver(), this);
	}

	@FindBy(xpath = "//input[@type='email']")
	protected WebElement tutaMailEmailTB;

	@FindBy(xpath = "//input[@type='password']")
	protected WebElement tutaMailPasswordTB;

	@FindBy(xpath = "//input[@class='icon checkbox-override click']")
	protected WebElement storePasswordCheckBox;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	protected WebElement tutaEmailLoginBT;

	@FindBy(xpath="//div[@class='flex mb-xs border-radius pt-m pb-m pl pr ml-s']")
	protected WebElement otpMessage;

	@FindBy(xpath="//input[@name='emailId']")
	protected WebElement loginEmailTB;

	@FindBy(xpath="//input[@name='password']")
	protected WebElement loginPasswordTB;

	@FindBy(xpath="//button[text()='Login']")
	protected WebElement universalLoginBT;

	@FindBy(xpath="//div[@id='first-box']/input")
	protected WebElement otpTB;

	@FindBy(xpath="//button[text()='Verify OTP']")
	protected WebElement clickVerifyOtpBT;

	@FindBy(xpath="//input[@title='Select all loaded items']")
	protected WebElement selectAllCheckBox;

	@FindBy(xpath="//button[@title='Trash']//div")
	protected WebElement deleteIcon;
	
	@FindBy(xpath="//span[text()='Paralegal']")
	protected WebElement paralegalOption;


}













