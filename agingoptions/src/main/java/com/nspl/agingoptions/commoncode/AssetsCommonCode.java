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
		util.DownKey();
		util.DownKey();
		util.pressEnter();
	}

	@FindBy(xpath="//span[contains(text(),'Previous')]")
	private WebElement previosBT;

	public void waitUntilPreviousButtonIsShown() {
		util.waitUntilPresentInUI(previosBT, 30);
	}

	public void waitUntilAddAssetsButtonIsShown() {
		util.waitUntilPresentInUI(addAssetsBT, 30);
	}

	@FindBy(xpath="//span[text()='Retirement']")
	private WebElement retirementSideBarLink;

	public void clickRetirementSideBarLink() {
		util.click(retirementSideBarLink, "Non_Retirement");
	}

	@FindBy(xpath="(//span[contains(text(),'Real Estate')])[1]")
	private WebElement realEstateSideBarLink;

	public void clickRealEstate() {
		util.waitUntilPresentInUI(realEstateSideBarLink, "Real Estate");
		util.waitUntilElementToBeClickable(realEstateSideBarLink);
		util.click(realEstateSideBarLink, "Real Estate");
	}

	@FindBy(xpath="//p[contains(text(),'Owner*')]/parent::div/div//span")
	private WebElement ownerDropDownIcon;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Joint']")
	private WebElement jointDropDownOption;

	public void selectOwnerAsJoint() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(ownerDropDownIcon, "Owner Drop Down");
		util.click(jointDropDownOption, "Joint");
	}

	@FindBy(xpath="(//ul[@id='dropDownDivId']/li)[1]")
	private WebElement primaryMemberDDOption;

	public void selectPrimaryMemberAsOwner() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(ownerDropDownIcon, "Owner");
		util.click(primaryMemberDDOption, "Primary Member");
	}

	public String getOwnerSelectedText() {
		String text=	util.getInnerText(ownerDropDownIcon);
		return text;
	}

	@FindBy(xpath="//p[contains(text(),'Contact Type')]/parent::div/div//span")
	private WebElement contactTypeDropDown;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Primary')]")
	private WebElement primaryPhoneNumOption;

	public void selectPrimaryPhoneNumberOptions() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(contactTypeDropDown, "Contact Type Drop Down");
		util.click(primaryPhoneNumOption, "Primary Phone Number");
	}

	@FindBy(xpath="//span[contains(text(),'Liabilities')]")
	private WebElement liabilitiesSideBarLink;

	public void clickLiabilitiesSideBarLink() {
		util.waitUntilElementToBeClickable(liabilitiesSideBarLink);
		util.click(liabilitiesSideBarLink, "Liabilities");
	}

	@FindBy(xpath="(//span[contains(text(),'Assets')])[1]")
	private WebElement assetsSideBarLink;

	public void clickAssetsSideBarLink() {
		util.click(assetsSideBarLink, "Assets");
	}

	@FindBy(xpath="(//ul[@id='dropDownDivId']/li)[2]")
	private WebElement spouseMemberDDOption;

	public void selectSpouseAsOwner() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(ownerDropDownIcon, "Owner");
		util.click(spouseMemberDDOption, "Spouse");
	}

	@FindBy(xpath="//button[contains(text(),'Next: Business Interests')]")
	private WebElement nextBusinessInterestBT;

	public void clickNextBusinessInterestButton() {
		util.waitUntilPresentInUI(nextBusinessInterestBT, 10);
		util.click(nextBusinessInterestBT, "Next: Business Interest Button");
	}

	@FindBy(xpath="(//span[contains(text(),'Business Interests')])[1]")
	private WebElement businessInterestSideBarLink;

	public void clickBusinessInterestSideBarLink() {
		util.waitUntilElementToBeClickable(businessInterestSideBarLink);
		util.click(businessInterestSideBarLink, "Bussiness Interest Side Bar Link");
	}

	@FindBy(xpath="//button[contains(text(),'Document Upload')]")
	private WebElement documentUploadAccordian;

	public void openDocumentUploadAccoridian() {
		util.openAccordion(documentUploadAccordian, "Document Upload Accoridan");
	}
	
	@FindBy(xpath="//span[contains(text(),'Transport Assets')]")
	private WebElement transportAssetsSideBarLink;
	
	public void clickTransportAssetsSideBarLink() {
		util.click(transportAssetsSideBarLink, "Transport Assets");
	}
	
	
	



}
