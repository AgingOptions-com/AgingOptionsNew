package com.agingoptions.finance;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class Non_Retirement_And_RetirementPage {

	private WebUtil util;

	public Non_Retirement_And_RetirementPage(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//div[@id='agingAssetTypeId']/preceding-sibling::div/span")
	private WebElement typeOfAssetDropDown;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Checking/Saving Account')]")
	private WebElement checkingSavingAccountDropDownOption;

	public void selectSavingAccountFromTypeOfAssets() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(typeOfAssetDropDown, "Type Of Assets");
		util.click(checkingSavingAccountDropDownOption, "Checking/Saving Account");
	}

	@FindBy(xpath="//input[@id='nameOfInstitution']")
	private WebElement nameOfInstituionTB;

	public void inputNameOfInstituion(String value) {
		util.sendValue(nameOfInstituionTB, value, "Name Of Instituion");
	}

	@FindBy(xpath="//div[@id='balance']/input")
	private WebElement balanceTB;

	public void inputBalance(String value) {
		util.sendValue(balanceTB, value, "Balance");
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

	@FindBy(xpath="//p[contains(text(),'Last four digits of the account number')]/following-sibling::input")
	private WebElement accountNumberTB;

	public void inputAccountNumber(String value) {
		util.sendValue(accountNumberTB, value, "Account Number");
	}

	@FindBy(xpath="//button[text()='Address']")
	private WebElement addressAccordian;

	public void openAddressAccordian() {
		util.openAccordion(addressAccordian, "Address Accordian");
	}


	@FindBy(xpath="//button[contains(text(),'Beneficiary')]")
	private WebElement beneficiaryAccordian;

	public void openBeneficiaryAccordian() {
		util.openAccordion(beneficiaryAccordian, "Beneficiary");
	}

	@FindBy(xpath="//button[contains(text(),'Document Upload')]")
	private WebElement documentUploadAccordian;

	public void openDocumentUploadAccordian() {
		util.openAccordion(documentUploadAccordian, "Document Upload");
	}

	@FindBy(xpath="//button[text()='Add Charity']")
	private WebElement addCharityBT;

	public void clickAddCharityButton() {
		util.click(addCharityBT, "Add Charity");
	}

	@FindBy(xpath="//p[contains(text(),'Charity Name*')]/following-sibling::input")
	private WebElement charityNameTB;

	public void inputCharityNameTB(String value) {
		util.sendValue(charityNameTB, value, "Charity Name");
	}

	@FindBy(xpath="//label[contains(text(),'Percentage')]/following-sibling::div/input")
	private WebElement charityPercentageTB;

	public void inputPercentage(String value) {
		util.sendValue(charityPercentageTB, value, "Percentage");
	}

	@FindBy(xpath="//h5[contains(text(),'Charity Information')]/ancestor::div[@class='costumModal-content']//input[@id='phoneNumber']")
	private WebElement charityPhoneNumber;

	public void inputCharityPhoneNumber(String value) {
		try {
			util.sendValue(charityPhoneNumber, value, "Charity Phone Number");
			util.waitUntilValueIsSend(charityPhoneNumber, 5, value);
		}catch(Exception e) {
			util.sendValue(charityPhoneNumber, value, "Charity Phone Number");
		}

	}

	@FindBy(xpath="//h5[contains(text(),'Charity Information')]/ancestor::div[@class='costumModal-content']//input[@id='email']")
	private WebElement charityEmail;

	public void inputCharityEmail(String value) {
		try {
			util.sendValue(charityEmail, value, "Charity Email");
			util.waitUntilValueIsSend(charityEmail, 5, value);
		}catch(Exception e) {
			util.sendValue(charityEmail, value, "Charity Email");
		}	}

	@FindBy(xpath="//h5[contains(text(),'Charity Information')]/ancestor::div[@class='costumModal-content']//button[contains(text(),'Save')]")
	private WebElement charitySaveBT;

	public void clickCharitySaveButton() {
		util.click(charitySaveBT, "Charity Save Button");
	}

	@FindBy(xpath="(//td[contains(text(),'Checking/Saving Account')]/following-sibling::td//img[contains(@alt,'Icon')])[2]")
	private WebElement savingAccountEditIcon;

	public void clickSavingAccountEditIcon() {
		util.click(savingAccountEditIcon, "Saving Account Edit Icon");
	}

	public String getTypeOfAssetDropDownSelectedOption() {
		String text=	util.getInnerText(typeOfAssetDropDown);
		return text;
	}

	public String getNameOfInstitutionInputValue() {
		String text=	util.GetAttributevalue(nameOfInstituionTB, "value");
		return text;
	}

	public String getBalanceInputValue() {
		String text=	util.GetAttributevalue(balanceTB, "value");
		String acutal=	util.convertAmountActualValue(text);
		return acutal;
	}

	public String getOwnerSelectedText() {
		String text=	util.getInnerText(ownerDropDownIcon);
		return text;
	}

	public String getAccountNumberInputValue() {
		String text=util.GetAttributevalue(accountNumberTB, "value");
		return text;
	}

	@FindBy(xpath="(//h5[contains(text(),'Enter Beneficiary Details')]/parent::div/following-sibling::div//td//p[@class='mt-1 text-dark']/following-sibling::img)[1]")
	private WebElement editCharityBT;

	public void clickEditCharityButton() {
		util.click(editCharityBT, "Edit Charity Button");
	}

	public String getCharityInputName() {
		String value=	util.GetAttributevalue(charityNameTB, "value");
		return value;
	}

	public String getCharityPercentageInputText() {
		String value=	util.GetAttributevalue(charityPercentageTB, "value");
		return value;
	}

	public String getCharityInputPhoneNumber() {
		String value=	util.GetAttributevalue(charityPhoneNumber, "value");
		String actual=util.unformatPhoneNumber(value);
		return actual;
	}

	public String getCharityInputEmail() {
		String value=	util.GetAttributevalue(charityEmail, "value");
		return value;
	}

	@FindBy(xpath="//h5[contains(text(),'Charity Information')]/ancestor::div[@class='costumModal-content']//button[contains(text(),'Cancel')]")
	private WebElement charityCancelButton;

	public void clickCharityCancelButton() {
		util.click(charityCancelButton, "Charity Cancel Button");
	}

	public void waitUntilCharityModalIsOpen(long seconds) {
		util.waitUntilPresentInUI(charityNameTB, seconds);
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Money Market fund')]")
	private WebElement moneyMarketFundDDOptions;

	public void selectMoneyMarketFundAssets() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(typeOfAssetDropDown, "Type of Asset");
		util.click(moneyMarketFundDDOptions, "Money Market fund");
	}

	@FindBy(xpath="(//td[contains(text(),'Money Market fund')]/following-sibling::td//img[contains(@alt,'Icon')])[2]")
	private WebElement moneyMarketFundEditIcon;

	public void clickMoneyMarketEditIcon() {
		util.click(moneyMarketFundEditIcon, "Money Market fund");
	}

	@FindBy(xpath="//button[contains(text(),'Next: Retirement')]")
	private WebElement nextRetirementBT;

	public void clickNextRetirementButton() {
		util.click(nextRetirementBT, "Next:Retirement Button");
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Other')]")
	private WebElement otherDropDownOption;

	public void selectOtherTypeOfAssets() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(typeOfAssetDropDown, "Type Of Asset");
		util.click(otherDropDownOption, "Other");
	}

	@FindBy(xpath="//input[@id='other']")
	private WebElement otherTypeTextBox;

	public void inputOtherDescription(String value) {
		util.sendValue(otherTypeTextBox, value, "Other Description Text box");
	}

	public String getOtherDescriptionInputText() {
		String value=	util.GetAttributevalue(otherTypeTextBox, "value");
		return value;
	}

	@FindBy(xpath="//td[contains(text(),'Bank of USA')]/following-sibling::td/div/img[contains(@alt,'Edit Icon')]")
	private WebElement bankOfUsaEditIcon;

	public void clickBankOfUsaEditIcon() {
		util.click(bankOfUsaEditIcon, "Edit Icon");
	}

	public String getOtherTextBoxInputValue() {
		String value=	util.GetAttributevalue(otherTypeTextBox, "value");
		return value;
	}

	@FindBy(xpath="//li[contains(text(),'Traditional IRA')]")
	private WebElement traditionalIRAOptions;

	public void selectTraditionalIRAFromTypeOfRetirementDropDown() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(typeOfAssetDropDown, "Type Of Retirement Asset");
		util.click(traditionalIRAOptions, "Traditional IRA Options");
	}

	@FindBy(xpath="(//td[contains(text(),'Bank of America')]/following-sibling::td//img[contains(@alt,'Icon')])[2]")
	private WebElement bankOfAmericaEditIcon;

	public void clickBankOfAmericaEditIcon() {
		util.click(bankOfAmericaEditIcon, "Traditional IRA Edit Icon");
	}
	
	@FindBy(xpath="(//td[contains(text(),'Indian Retirement Assets')]/following-sibling::td//img[contains(@alt,'Icon')])[2]")
	private WebElement indianNonRetirementAssetEditIcon;

	public void clickIndianNonRetirementEditIcon() {
		util.click(indianNonRetirementAssetEditIcon, "Indian Retirement Edit Icon");
	}

	@FindBy(xpath="//div[@id='information-table']//tbody//div[contains(@class,'dropdown-selected')]")
	private WebElement beneficiaryDropDown;

	public void clickBeneficiaryDropDown() {
		util.click(beneficiaryDropDown, "Beneficiary Drop Down");
	}

	@FindBy(xpath="(//div[@id='dropDownDivId']/li)[1]")
	private WebElement spouseBeneficiaryOption;

	public void selectSpouseAsBeneficiary() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(beneficiaryDropDown, "Beneficiary Drop Down");
		util.click(spouseBeneficiaryOption, "Spouse Drop Down Options");
	}

	@FindBy(xpath="//input[contains(@class,'form-control form-control-percentage')]")
	private WebElement beneficiaryPercentageTB;

	public void inputBeneficiaryPercentageText(String value) {
		util.sendValue(beneficiaryPercentageTB, value, "Percentage");
	}

	public String getBeneficiaryDropDownSelectedName() {
		util.holdOn(Duration.ofSeconds(1));
		String value=	util.getInnerText(beneficiaryDropDown);
		return value;
	}

	public String getPercentageInputValue() {
		String value=	util.GetAttributevalue(beneficiaryPercentageTB, "value");
		return value;
	}

	@FindBy(xpath="(//ul[@id='dropDownDivId']/li)[1]")
	private WebElement primaryMemberDDOption;

	public void selectPrimaryMemberAsOwner() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(ownerDropDownIcon, "Owner");
		util.click(primaryMemberDDOption, "Primary Member");
	}

	@FindBy(xpath="//td[contains(text(),'Bank of United State Of America')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement bankOfUnitedStateOfAmericaEditIcon;
	
	public void clickBankOfUnitedStateOfAmericaEditIcon() {
		util.click(bankOfUnitedStateOfAmericaEditIcon, "Bank of United State");
	}
	

}
