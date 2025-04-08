package com.agingoptions.health;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HealthInsurance {

	private WebUtil util;

	public HealthInsurance(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="(//span[text()='Health Insurance'])[1]/parent::div")
	private WebElement healthInsuranceSideBarLink;

	public void clickHealthInsuranceSideBarLink() {
		try {
			util.clickButtonAfterCheckingEnable(healthInsuranceSideBarLink);
		}catch(Exception e) {
			util.click(healthInsuranceSideBarLink, "Health Insurance");	
		}
	}

	@FindBy(xpath="//button[text()='Add Health Insurance']")
	private WebElement addHealthInsuranceBT;

	public void clickAddHealthInsuranceButton() {
		util.click(addHealthInsuranceBT, "Health Insurance");
	}

	@FindBy(xpath="//div[@id='typePlanId']/preceding-sibling::div/span")
	private WebElement healthInsuranceTypeDropDown;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Medigap']")
	private WebElement medigapOptions;

	public void selectMedigapTypeFromInsuranceTypeDropDown() {
		util.click(healthInsuranceTypeDropDown, "Health Insurance type");
		util.click(medigapOptions,"Medigap");
	}

	@FindBy(xpath="//div[@id='insComId']")
	private WebElement insuranceCompanyDD;

	@FindBy(xpath="//div[@id='dropDownDivId']/li[text()='Allstate Ins Group']")
	private WebElement allStateInsGroupOptions;

	public void selectAllStateInsGroupFromInsuranceCompanyDD() {
		util.click(insuranceCompanyDD, "Insurance Company");
		util.click(allStateInsGroupOptions, "All State Ins Group");
	}

	@FindBy(xpath="//input[@id='insName']")
	private WebElement policyNameTB;

	public void inputPolicyName(String value) {
		util.sendValue(policyNameTB, value, "Policy/Plan Name");
	}

	@FindBy(xpath="//input[@id='insCardPath1']")
	private WebElement policyNumberTB;

	public void inputPolicyNumber(String value) {
		util.sendValue(policyNumberTB, value, "Policy Number");
	}

	@FindBy(xpath="//input[@id='groupNo']")
	private WebElement groupNumberTB;

	public void inputGroupNumber(String value) {
		util.sendValue(groupNumberTB, value, "Group Number");
	}

	@FindBy(xpath="//div[@id='premiumFrePerYear']/preceding-sibling::div/span")
	private WebElement premiumFrequencyDD;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Single']")
	private WebElement singlePremiumFrequency;

	public void selectSinglePremiumFrequency() {
		util.click(premiumFrequencyDD, "Premium Frequency");
		util.click(singlePremiumFrequency, "Single Premium Frequency");
	}

	@FindBy(xpath="//div[@id='premiumAmt']/input")
	private WebElement premiumAmountTB;

	public void inputPremiumAmount(String value) {
		util.sendValue(premiumAmountTB, value, "Premium amount");
	}

	@FindBy(xpath="//div[@id='deductibleAmount']/input")
	private WebElement deductibleAmountTB;

	public void inputDeductibleAmount(String value) {
		util.sendValue(deductibleAmountTB, value, "Deductible amount");
	}

	@FindBy(xpath="//div[@id='coPayment']/input")
	private WebElement coPaymentTB;

	public void inputCoPayment(String value) {
		util.sendValue(coPaymentTB, value, "Co-payment");
	}

	@FindBy(xpath="//div[@id='outOfPocketMaximum']/input")
	private WebElement outOfPocketMaximumTB;

	public void inputOutOfPocketMaximum(String value) {
		util.sendValue(outOfPocketMaximumTB, value, "Out of pocket maximum");
	}

	@FindBy(xpath="//input[@id='insStartDate']")
	private WebElement coverageStartDateTB;

	public void inputInsuranceStartDate(String value) {
		util.sendValue(coverageStartDateTB, value, "Coverage start date");
	}

	@FindBy(xpath="//input[@id='insEndDate']")
	private WebElement coverageEndDateTB;

	public void inputInsuranceEndDate(String value) {
		util.sendValue(coverageEndDateTB, value, "Coverage End date");
	}

	@FindBy(xpath="//p[text()='Manually']")
	private WebElement howAreTheExpensesPaidManuallyRadioBT;

	public void clickHowAreTheExpensePaidManuallyRadioBT() {
		util.click(howAreTheExpensesPaidManuallyRadioBT, "How are the expenses paid? Manually Radio Button");
	}

	@FindBy(xpath="//td[text()='Medigap']/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement medigapEditIcon;

	public void clickMedigapEditIcon() {
		util.click(medigapEditIcon, "Medigap Edit");
	}

	@FindBy(xpath="//p[text()='In Person']")
	private WebElement inPersonRadioBT;

	public void clickInPersonRadioButton() {
		util.click(inPersonRadioBT, "In Person Radio Button");
	}

	@FindBy(xpath="//div[@class='upload-component-file p-4']//input[@type='file']")
	private WebElement fileUploadIcon;

	public void uploadFile() {
		String path=	System.getProperty("user.dir")+"\\src\\test\\resources\\HealthInsurance.pdf";
		util.uploadFile(fileUploadIcon, path);
	}

	@FindBy(xpath="//td[text()='Medigap']")
	private WebElement medigaptText;

	public String getMedigapInnerText() {
		String text=  util.getInnerText(medigaptText);
		return text;
	}

	@FindBy(xpath="//div[@id='suppPlanId']")
	private WebElement supplementInsuranceDropDown;

	@FindBy(xpath="//div[@id='dropDownDivId']/li[contains(text(),'Medigap Plan A')]")
	private WebElement medigapPlanAOptions;

	public void selectMedigapPlanAOptionsFromSupplementInsurance() {
		util.click(supplementInsuranceDropDown, "Supplement insurance");
		util.click(medigapPlanAOptions, "Medigap Plan A");
	}

	public String getHealthInsuranceTypeSelectedText() {
		String text=  util.getInnerText(healthInsuranceTypeDropDown);
		return text;
	}

	public String getSupplementInsuranceTypeSelectedText() {
		String text=  util.getInnerText(supplementInsuranceDropDown);
		return text;
	}

	public String getInsuranceCompanySelectedText() {
		String text=  util.getInnerText(insuranceCompanyDD);
		return text;
	}

	public String getPolicyNameInputText() {
		String value=	  util.GetAttributevalue(policyNameTB, "value");
		return value;
	}

	public String getPolicyNumberInputText() {
		String value=	  util.GetAttributevalue(policyNumberTB, "value");
		return value;
	}

	public String getGroupNumberInputText() {
		String value=	  util.GetAttributevalue(groupNumberTB, "value");
		return value;
	}

	public String getPremiumFrequnecySelectedText() {
		String text=	util.getInnerText(premiumFrequencyDD);
		return text;
	}

	public String getPremiumAmountInputText() {
		String value=	  util.GetAttributevalue(premiumAmountTB, "value");
		String amount=	util.convertAmountActualValue(value);
		return amount;
	}

	public String getDeductableAmountInputText() {
		String value=	  util.GetAttributevalue(deductibleAmountTB, "value");
		String amount=	util.convertAmountActualValue(value);
		return amount;

	}

	public String getCoPaymentInputText() {
		String value=	  util.GetAttributevalue(coPaymentTB, "value");
		String amount=	util.convertAmountActualValue(value);
		return amount;
	}

	public String getOutOfPaymentInputText() {
		String value=	  util.GetAttributevalue(outOfPocketMaximumTB, "value");
		String amount=	util.convertAmountActualValue(value);
		return amount;
	}

	public String getCoverageStartInputText() {
		String value=	  util.GetAttributevalue(coverageStartDateTB, "value");
		String date=	util.convertDateFormatMMDDYYYY(value);
		return date;
	}

	public String getCoverageEndInputText() {
		String value=	  util.GetAttributevalue(coverageEndDateTB, "value");
		String date=	util.convertDateFormatMMDDYYYY(value);
		return date;
	}

	@FindBy(xpath="//div[@id='information-table']")
	private WebElement healthInsuranceTable;

	public void waitUntilHealthInsuranceTableIsPresent() {
		util.waitUntilPresentInUI(healthInsuranceTable, "Health Insurance Table");
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Private Plan']")
	private WebElement privateTypeInsuranceText;

	public void selectPrivateTypeInsurance() {
		util.click(healthInsuranceTypeDropDown, "Health Insurance Type");
		util.click(privateTypeInsuranceText, "Private type");
	}

	@FindBy(xpath="//div[@id='dropDownDivId']/li[text()='Other']")
	private WebElement otherInsuranceCompanyOptions;

	public void selectOtherInsuranceCompany() {
		util.click(insuranceCompanyDD, "Insurance Company");
		util.click(otherInsuranceCompanyOptions, "Other");
	}

	@FindBy(xpath="//p[text()='Insurance company']/parent::div/parent::div/following-sibling::div//input")
	private WebElement insuranceCompanyOtherTB;

	public void inputInsuranceCompanyOtherTextBoxValue(String value) {
		util.sendValue(insuranceCompanyOtherTB, value, "Insurance Company Other Text Box");
	}

	@FindBy(xpath="//p[text()='Auto Pay']")
	private WebElement howAreTheExpensePaidAutoPayRadioButton;

	public void clickHowAreTheExpensePaidAutoPayRadioButton() {
		util.click(howAreTheExpensePaidAutoPayRadioButton, "How are the expenses paid? Auto Pay");
	}

	@FindBy(xpath="//input[@id='bankname']")
	private WebElement bankNameTB;

	public void inputBankName(String value) {
		util.sendValue(bankNameTB, value, "Bank Name");
	}

	@FindBy(xpath="//input[@id='accountnumber']")
	private WebElement bankAccountNumberTB;

	public void inputAccountNumber(String value) {
		util.sendValue(bankAccountNumberTB, value, "Bank Name");
	}

	@FindBy(xpath="//td[text()='Private Plan']/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement privatePlanEditIcon;

	public void clickPrivateHealthInsurancePlanEditIcon() {
		util.click(privatePlanEditIcon, "Private Plan Edit Icon");
	}

	public String getInsuranceCompanyOtherDescriptionInputText() {
		String value=	util.GetAttributevalue(insuranceCompanyOtherTB, "value");
		return value;
	}

	public String getInputBankNameText() {
		util.holdOn(Duration.ofSeconds(1));
		String value=	util.GetAttributevalue(bankNameTB, "value");
		return value;
	}

	public String getInputBankAccountText() {
		util.holdOn(Duration.ofSeconds(1));
		String value=	util.GetAttributevalue(bankAccountNumberTB, "value");
		return value;
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Other']")
	private WebElement healthInsuranceTypeOtherOptions;

	public void selectOtherFromHealthInsuranceType() {
		util.click(healthInsuranceTypeDropDown, "Health Insurance Type");
		util.click(healthInsuranceTypeOtherOptions, "Other");
	}

	@FindBy(xpath="//p[text()='Type']/parent::div/parent::div/following-sibling::div//input[@id='other']")
	private WebElement insuranceTypeOtherTextBox;

	public void inputInsuranceTypeOtherDescription(String value) {
		util.sendValue(insuranceTypeOtherTextBox, value, "Insurance Type");
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Quaterly']")
	private WebElement quaterlyOption;

	public void selectQuaterlyPremiumFrequency() {
		util.click(premiumFrequencyDD, "Premium Frequency");
		util.click(quaterlyOption, "Quaterly Premium Frequency");
	}

	@FindBy(xpath="//td[text()='Quaterly']/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement typeOfPlanOtherQuaterlyEditIcon;

	public void clickQuaterlyEditIcon() {
		util.click(typeOfPlanOtherQuaterlyEditIcon, "Other Type Plan Edit Icon");
	}

	public String getTypePlanOtherTextBoxInputText() {
		String text=util.GetAttributevalue(insuranceTypeOtherTextBox,"value");
		return text;
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Dental']")
	private WebElement dentalTypeHealthInsurance;

	public void selectDentalHealthInsuranceTypeDropDown() {
		util.click(healthInsuranceTypeDropDown, "Health Insurance Type Drop Down");
		util.click(dentalTypeHealthInsurance,"Dental" );
	}

	@FindBy(xpath="//button[contains(text(),'Save & Proceed to Medication & Supplements')]")
	private WebElement saveProceedToMedicationSupplementBT;

	public void clickSaveProceedToMedicationSupplementBT() {
		util.click(saveProceedToMedicationSupplementBT, "Save & Proceed to Medication & Supplements");
	}
	
	@FindBy(xpath="//td[text()='Dental']/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement dentalTypeEditIconTable;

	public void clickDentalTypeEditIconInTable() {
		util.click(dentalTypeEditIconTable, "Dental Type Edit Icon");
	}


}
