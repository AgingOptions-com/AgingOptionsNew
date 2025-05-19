package com.agingoptions.finance;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class LifeInsurance {

	private WebUtil util;

	public LifeInsurance(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//button[contains(text(),'Add Policy')]")
	private WebElement addPolicyBT;

	public void clickAddPolicyButton() {
		util.click(addPolicyBT, "Add Policy Button");
	}

	@FindBy(xpath="//p[contains(text(),'Type of policy')]/parent::div//span")
	private WebElement typeOfPolicyDropDown;

	@FindBy(xpath="//ul[@id='dropDownDivId']//li[contains(text(),'Hybrid')]")
	private WebElement hybridTypeOfPolicyDropDown;

	public void selectHybridTypePolicy() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(typeOfPolicyDropDown, "Type Of Policy Drop Down");
		util.click(hybridTypeOfPolicyDropDown, "Hybrid");
	}

	public String getTypeOfPolicySelectedText() {
		String text=	util.getInnerText(typeOfPolicyDropDown);
		return text;
	}

	@FindBy(xpath="//p[contains(text(),'Policy start date')]/parent::div//input")
	private WebElement policyStartDateTB;

	public void inputPolicyStartDate(String value) {
		util.sendValue(policyStartDateTB, value, "Policy Start Date");
	}

	@FindBy(xpath="//p[contains(text(),'Policy end date')]/parent::div//input")
	private WebElement policyEndDateTB;

	public void inputPolicyEndDate(String value) {
		util.sendValue(policyEndDateTB, value, "Policy End Date");
	}

	@FindBy(xpath="//button[contains(text(),'Financial Information')]")
	private WebElement financialInfoAccordian;

	public void openFinancialInfoAccordian() {
		util.openAccordion(financialInfoAccordian, "Financial Information");
	}

	@FindBy(xpath="//button[contains(text(),'Beneficiary Information')]")
	private WebElement beneficiaryInfoAccordian;

	public void openBeneficiaryInfoAccordian() {
		util.openAccordion(beneficiaryInfoAccordian, "Beneficiary Information");
	}

	@FindBy(xpath="//label[contains(text(),'Cash value')]/parent::div//input")
	private WebElement cashValueTB;

	public void inputCashValue(String value) {
		util.sendValue(cashValueTB, value, "Cash Value");
	}

	@FindBy(xpath="//label[contains(text(),'Death benefit')]/parent::div//input")
	private WebElement deathBenefitTB;

	public void inputDeathBenefitValue(String value) {
		util.sendValue(deathBenefitTB, value, "Death Benefit");
	}

	@FindBy(xpath="//div[@id='Beneficiary']/preceding-sibling::div/span")
	private WebElement beneficiaryDropDownIcon;

	@FindBy(xpath="//ul[@name='Beneficiary']//li")
	private WebElement spouseBeneficiary;

	public void selectSpouseAsBeneficiary() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(beneficiaryDropDownIcon, "Beneficiary Drop Down");
		util.click(spouseBeneficiary, "Spouse");
	}

	@FindBy(xpath="//td[contains(text(),'Allstate Ins Group')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement allStateInsEditIcon;

	public void clickAllStateInsEditIcon() {
		util.click(allStateInsEditIcon, "All State Ins Edit");
	}

	public String getPolicyStartDate() {
		String value=      util.GetAttributevalue(policyStartDateTB, "value");
		String text=	util.convertDateFormatMMDDYYYY(value);
		return text;
	}

	public String getPolicyEndDate() {
		String value=      util.GetAttributevalue(policyEndDateTB, "value");
		String text=	util.convertDateFormatMMDDYYYY(value);
		return text;
	}

	public String getCashValueSelectedText() {
		String value=	util.GetAttributevalue(cashValueTB,"value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getDeathBenefitSelectedText() {
		String value=	util.GetAttributevalue(deathBenefitTB,"value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getBeneficiarySelectedText() {
		String text=	util.getInnerText(beneficiaryDropDownIcon);
		return text;
	}

	@FindBy(xpath="//td[contains(text(),'Chubb INA Group')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement chubbInaGroupEditIcon;

	public void clickChubbInaGroupEditIcon() {
		util.click(chubbInaGroupEditIcon, "All State Ins Edit");
	}

	@FindBy(xpath="//p[contains(text(),'Type of policy')]/parent::div/parent::div//ul//li[contains(text(),'Other')]")
	private WebElement otherTypeOfPolicy;

	public void selectOtherTypePolicy() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(typeOfPolicyDropDown, "Type Of Policy Drop Down");
		util.click(otherTypeOfPolicy, "Other");
	}

	@FindBy(xpath="//p[contains(text(),'Type of policy')]/parent::div/parent::div/following-sibling::div//input[@id='other']")
	private WebElement otherTypeOfPolicyTB;

	public void inputOtherTypePolicyValue(String value) {
		util.sendValue(otherTypeOfPolicyTB, value, "Other Type Of Policy Value");
	}

	@FindBy(xpath="//button[contains(text(),'Next:') and contains(text(),'Life Insurance')]")
	private WebElement nextLifeInsuranceBT;

	public void clickNextLifeInsuranceButton() {
		util.click(nextLifeInsuranceBT, "Next: Life Insurance Button");
	}

	@FindBy(xpath="//td[contains(text(),'Half Life')]/following-sibling::td//div//img[@alt='Edit Icon']")
	private WebElement halfLifeEditIcon;

	public void clickHalfLifeEditIcon() {
		util.click(halfLifeEditIcon, "Half Life Edit Icon");
	}

	public String getOtherTypeOfPolicyTextBoxInputValue() {
		String value=	util.GetAttributevalue(otherTypeOfPolicyTB, "value");
		return value;
	}

	@FindBy(xpath="//td[contains(text(),'USAA Group')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement usaaGroupEditIcon;

	public void clickUsaaGroupEditIcon() {
		util.click(usaaGroupEditIcon, "USAA Group Edit");
	}
	
	@FindBy(xpath="//button[contains(text(),'Next:Long-Term Care Policy')]")
	private WebElement nextLongTermCarePolicyBT;
	
	public void clickNextLongTermCarePolicyButton() {
		util.click(nextLongTermCarePolicyBT, "Next:Long-Term Care Policy");
	}

	@FindBy(xpath="//td[contains(text(),'Nationwide Group')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement nationwideGroupEditIcon;

	public void clickNationwideGroupEditIcon() {
		util.click(nationwideGroupEditIcon, "Nationwide Group Edit Icon");
	}
	
	@FindBy(xpath="//td[contains(text(),'INSOTHER3849384')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement otherInsuranceProviderEditIcon;

	public void clickOtherInsuranceProviderEditIcon() {
		util.click(otherInsuranceProviderEditIcon, "Other Insurance Provider Edit Icon");
	}
	
	@FindBy(xpath="//td[contains(text(),'9458457OTH')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement otherTypeOfPolicEditIcon;

	public void clickOtherTYpeOfPolicyEditIcon() {
		util.click(otherTypeOfPolicEditIcon, "Other Type Of Policy Edit Icon");
	}

}
