package com.nspl.agingoptions.commoncode;

import java.time.Duration;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class AssetsCommonCode {

	private WebUtil util;

	public AssetsCommonCode(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//span[text()='Non-Retirement']")
	private WebElement non_RetirementSideBarLink;

	public void clickNon_RetirementSideBarLink() {
		util.click(non_RetirementSideBarLink, "Non_Retirement");
	}

	@FindBy(xpath="//button[contains(text(),'Add Asset')]")
	private WebElement addAssetsBT;

	public void clickAddAssetButton() {
		util.click(addAssetsBT, "Add Assets Button");
	}

	@FindBy(xpath="//div[contains(text(),'Click to upload your file')]/parent::div/preceding-sibling::div/input")
	private WebElement fileUpload;

	public void uploadFile() {
		String path=	System.getProperty("user.dir")+"\\src\\test\\resources\\Docs.pdf";
		util.uploadFile(fileUpload, path);
	}

	@FindBy(xpath="//button[contains(text(),'Save & Continue later')]")
	private WebElement saveContinueLaterBT;

	public void clickSaveContinueLaterButton() {
		util.click(saveContinueLaterBT, "Save & Continue Later Button");
	}

	@FindBy(xpath="//div[@id='information-table']")
	private WebElement Non_RetirementTable;

	public void waitUntilNon_RetirementTableIsPresentInUI(long seconds) {
		try {
			util.waitUntilPresentInUI(Non_RetirementTable, seconds);
		}catch(StaleElementReferenceException e) {
			util.waitUntilPresentInUI(Non_RetirementTable, seconds);
		}
	}

	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTB;

	public void inputEmail(String value) {
		util.sendValue(emailTB, value, "Phone Number");
	}

	public String getEmailInputText() {
		String value=	util.GetAttributevalue(emailTB, "value");
		return value;
	}

	@FindBy(xpath="//input[@id='phoneNumber']")
	private WebElement phoneNumberTB;

	public void inputPhoneNumber(String value) {
		util.sendValue(phoneNumberTB, value, "Phone Number");
	}

	public String getPhoneNumberInputText() {
		String value=	util.GetAttributevalue(phoneNumberTB, "value");
		String actualValue=	util.unformatPhoneNumber(value);
		return actualValue;
	}
	
	@FindBy(xpath="//p[text()='Address']/following-sibling::input")
	private WebElement addressTB;
	
	public void inputAddress(String value) {
		util.sendValue(addressTB, value, "Address");
		util.holdOn(Duration.ofSeconds(5));
		util.pressSpaceButton();
		util.pressBackSpaceButton();
		util.DownKey();
		util.DownKey();
		util.pressEnter();
	}

}
