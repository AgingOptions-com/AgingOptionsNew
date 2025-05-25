package com.agingoptions.finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class LongTermCarePolicy {

	private WebUtil util;

	public LongTermCarePolicy(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//p[contains(text(),'Type of policy*')]/parent::div/div/div/span")
	private WebElement typeOfPolicyDD;

	@FindBy(xpath="//p[contains(text(),'Type of policy*')]/parent::div/ul/li[contains(text(),'Hybrid')]")
	private WebElement hybridTypeOfPolicy;

	public void selectHybridTypeOfPolicy() {
		util.click(typeOfPolicyDD, "Type Of Policy");
		util.click(hybridTypeOfPolicy, "Hybrid");
	}

	@FindBy(xpath="//p[contains(text(),'Policy start date')]/parent::div//input")
	private WebElement policyStartDateTB;

	public void inputPolicyStartDate(String value) {
		util.sendValue(policyStartDateTB, value, "Policy Start Date");
	}

	@FindBy(xpath="//p[contains(text(),'When was the last premium increased')]/parent::div//input")
	private WebElement whenWasLastPremiumIncreaseTB;

	public void inputWhenWasLastPremiumIncrease(String value) {
		util.sendValue(whenWasLastPremiumIncreaseTB, value, "When was the last premium increased");
	}

	@FindBy(xpath="//button[contains(text(),'Benefit Information')]")
	private WebElement benefitInfoAccordian;

	public void openBenefitInfoAccordian() {
		util.openAccordion(benefitInfoAccordian, "Benefit Information");
	}

	@FindBy(xpath="//label[contains(text(),'Daily benefit amount-nursing home')]/parent::div//input")
	private WebElement dailyBenefitAmountTB;

	public void inputDailyBenefitAmount(String value) {
		util.sendValue(dailyBenefitAmountTB, value, "Daily Benefit Amount");
	}

	@FindBy(xpath="//label[contains(text(),'Daily benefit amount other than nurse home setting')]/parent::div//input")
	private WebElement dailyBenefitOtherThanNurseHome;

	public void inputDailyBenefitOtherThanNurseHomeAmount(String value) {
		util.sendValue(dailyBenefitOtherThanNurseHome, value, "Daily benefit amount other than nurse home setting");
	}

	@FindBy(xpath="//label[contains(text(),'Maximum lifetime benefits')]/parent::div//input")
	private WebElement maximumLifeTimeBenefitTB;

	public void inputMaximumLifeTimeBenefit(String value) {
		util.sendValue(maximumLifeTimeBenefitTB, value, "Maximum lifetime benefits");
	}

	@FindBy(xpath="//p[contains(text(),'Number of years benefits will continue')]/parent::div//input")
	private WebElement numberOfYearBenefitTB;

	public void inputNumberOfYearBenefit(String value) {
		util.sendValue(numberOfYearBenefitTB, value, "Number of Year");
	}

	@FindBy(xpath="//p[contains(text(),'Elimination period')]/parent::div//input")
	private WebElement eleminationPeriodTB;

	public void inputEleminationPeriod(String value) {
		util.sendValue(eleminationPeriodTB, value, "Elimination period");
	}

	@FindBy(xpath="//button[contains(text(),'Inflation Protection')]")
	private WebElement inflationProtectionAccordian;

	public void openInflationProtectionAccordian() {
		util.openAccordion(inflationProtectionAccordian, "Inflation Protection");
	}

	@FindBy(xpath="//p[contains(text(),'Does the plan have an inflation rider?')]/parent::div//label/p[contains(text(),'Yes')]")
	private WebElement doesThePlanHaveInflationYesRadioBT;

	public void clickDoesThePlanHaveInflationYesRadioButton() {
		util.click(doesThePlanHaveInflationYesRadioBT, "Does the plan have an inflation rider?");
	}

	@FindBy(xpath="//label[contains(text(),'Inflation Percentage')]/parent::div//input")
	private WebElement inflationPercentageTB;

	public void inputInflationPercentage(String value) {
		util.sendValue(inflationPercentageTB, value, "Inflation Percentage");
	}

	@FindBy(xpath="//p[contains(text(),'Simple')]")
	private WebElement simpleRadioBT;

	public void clickSimpleRadioButton() {
		util.click(simpleRadioBT, "Simple Radio Button");
	}

	@FindBy(xpath="//p[contains(text(),'Compound')]")
	private WebElement compoundRadioBT;

	public void clickCompoundRadioButton() {
		util.click(compoundRadioBT, "Compound Radio Button");
	}

	public String getTypeOfPolicySelectedText() {
		String value=	util.getInnerText(typeOfPolicyDD);
		return value;
	}

	public String getPolicyStartDate() {
		String value=	util.GetAttributevalue(policyStartDateTB, "value");
		String text=	util.convertDateFormatMMDDYYYY(value);
		return text;
	}

	public String getWhenWasTheLastPremiumIncreaseText() {
		String value=	util.GetAttributevalue(whenWasLastPremiumIncreaseTB, "value");
		String text=	util.convertDateFormatMMDDYYYY(value);
		return text;
	}

	public String getDailyBenefitAmountNursingHome() {
		String value=	util.GetAttributevalue(dailyBenefitAmountTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getDailyBenefitAmountOtherThanNursingHome() {
		String value=	util.GetAttributevalue(dailyBenefitOtherThanNurseHome, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getMaximumLifetimeBenefitsInputText() {
		String value=	util.GetAttributevalue(maximumLifeTimeBenefitTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getNumberOfYearInputText() {
		String value=	util.GetAttributevalue(numberOfYearBenefitTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getEleminationPeriodInputText() {
		String value=	util.GetAttributevalue(eleminationPeriodTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getInflationPercentageInputText() {
		String value=	util.GetAttributevalue(inflationPercentageTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	@FindBy(xpath="//p[contains(text(),'Type of policy*')]/parent::div/ul/li[contains(text(),'Traditional')]")
	private WebElement traditionalTypeOfPolicy;

	public void selectTraditionalTypeOfPolicy() {
		util.click(typeOfPolicyDD, "Type Of Policy");
		util.click(traditionalTypeOfPolicy, "Traditional");
	}

	@FindBy(xpath="//p[contains(text(),'Does the plan have an inflation rider?')]/parent::div//label/p[contains(text(),'No')]")
	private WebElement doesThePlanHaveInflationNoRadioBT;

	public void clickDoesThePlanHaveInflationNoRadioButton() {
		util.click(doesThePlanHaveInflationNoRadioBT, "Does the plan have an inflation rider?");
	}

	@FindBy(xpath="//p[contains(text(),'Type of policy*')]/parent::div/ul/li[contains(text(),'Other')]")
	private WebElement otherTypeOfPolicy;

	public void selectOtherTypeOfPolicy() {
		util.click(typeOfPolicyDD, "Type Of Policy");
		util.click(otherTypeOfPolicy, "Other");
	}

	@FindBy(xpath="//p[contains(text(),'Type of policy*')]//parent::div/parent::div/following-sibling::div//input")
	private WebElement typeOfPolicyOtherTB;

	public void inputTypeOfPolicyOtherValue(String value) {
		util.sendValue(typeOfPolicyOtherTB, value, "Type Of Policy Other Value");
	}

	@FindBy(xpath="//p[contains(text(),'Insurance provider')]/parent::div/parent::div/following-sibling::div//input[@id='other']")
	private WebElement insuranceProvideOtherTextBox;

	public void inputInsuranceProviderOtherValue(String value) {
		util.sendValue(insuranceProvideOtherTextBox, value, "Insurance Provider Other ");
	}

	public String getInsuranceProviderOtherValue() {
		util.waitUntilPresentInUI(typeOfPolicyOtherTB, 30);
		String value=  util.GetAttributevalue(typeOfPolicyOtherTB,"value" );
		return value;
	}

	public String getTypeOfPolicyOtherValue() {
		String value=  util.GetAttributevalue(insuranceProvideOtherTextBox,"value" );
		return value;
	}
	
	@FindBy(xpath="//button[contains(text(),'Save & Proceed To Future Expectations')]")
	protected WebElement saveProceedToFutureExpectationBT;
	
	public void clickSaveProceedToFutureExpectationButton() {
		util.click(saveProceedToFutureExpectationBT, "Save & Proceed To Future Expectations");
	}


}
