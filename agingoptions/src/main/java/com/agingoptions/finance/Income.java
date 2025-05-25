package com.agingoptions.finance;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class Income {

	private WebUtil util;

	public Income(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindAll(@FindBy(xpath="//td[contains(text(),'Social Security (gross)')]/parent::tr//input"))
	private List<WebElement> socialSecurityGrossTB;

	@FindAll(@FindBy(xpath="//td[contains(text(),'Employment (gross)')]/parent::tr//input"))
	private List<WebElement> employmentGrossTB;

	@FindAll(@FindBy(xpath="//td[contains(text(),'Pension (gross)')]/parent::tr//input"))
	private List<WebElement> pensionGrossTB;

	@FindAll(@FindBy(xpath="//td[contains(text(),'IRAs')]/parent::tr//input"))
	private List<WebElement> iraTB;

	@FindAll(@FindBy(xpath="//td[contains(text(),'Annuities')]/parent::tr//input"))
	private List<WebElement> annutiesTB;

	@FindAll(@FindBy(xpath="//td[contains(text(),'Income from investments')]/parent::tr//input"))
	private List<WebElement> incomeFromInvestmentsTB;

	@FindAll(@FindBy(xpath="//td[contains(text(),'Rental income (net,before taxes)')]/parent::tr//input"))
	private List<WebElement> rentalIncomeTB;

	@FindAll(@FindBy(xpath="//td[contains(text(),'Business Interestes (net,EBITDA)')]/parent::tr//input"))
	private List<WebElement> bussinessInterestestTB;

	@FindAll(@FindBy(xpath="//td[contains(text(),'Salary')]/parent::tr//input"))
	private List<WebElement> salaryTB;

	@FindAll(@FindBy(xpath="//tr[@id='otherRowsData0']//td[contains(text(),'Other')]/parent::tr//input"))
	private List<WebElement> otherTB;

	public void inputSocialSecurityGrossValues(List<String> socialSecurityExpectedValue) {
		int actualSize=	socialSecurityGrossTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	socialSecurityGrossTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(socialSecurityExpectedValue.get(i));
		}
	}

	public void inputEmploymentGrossValues(List<String> employmentGrossExpectedValues) {
		int actualSize=	employmentGrossTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	employmentGrossTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(employmentGrossExpectedValues.get(i));
		}
	}

	public void inputPensionGrossValues(List<String> pensionsGrossExpectedValues) {
		int actualSize=	pensionGrossTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	pensionGrossTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(pensionsGrossExpectedValues.get(i));
		}
	}

	public void inputIrasValues(List<String> irasExpectedValues) {
		int actualSize=	iraTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	iraTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(irasExpectedValues.get(i));
		}
	}

	public void inputAnnutiesValues(List<String> annutiesExpectedValues) {
		int actualSize=	annutiesTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	annutiesTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(annutiesExpectedValues.get(i));
		}
	}

	public void inputIncomeFromInvestmentValues(List<String> incomeFromInvestmentExpectedValues) {
		int actualSize=	incomeFromInvestmentsTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	incomeFromInvestmentsTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(incomeFromInvestmentExpectedValues.get(i));
		}
	}

	public void inputRentalIncomeValues(List<String> rentalIncomeExpectedValues) {
		int actualSize=	rentalIncomeTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	rentalIncomeTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(rentalIncomeExpectedValues.get(i));
		}
	}

	public void inputBusinessInterestValues(List<String> businessInterestExpectedValues) {
		int actualSize=	bussinessInterestestTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	bussinessInterestestTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(businessInterestExpectedValues.get(i));
		}
	}

	public void inputSalaryValues(List<String> salaryExpectedValues) {
		int actualSize=	salaryTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	salaryTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(salaryExpectedValues.get(i));
		}
	}

	public void inputOtherValues(List<String> otherExpectedValues) {
		int actualSize=	otherTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	otherTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(otherExpectedValues.get(i));
		}
	}

	@FindBy(xpath="//div[contains(text(),'Add New Income Type')]")
	private WebElement addNewIncomeTypeBT;

	public void clickAddNewIncomeTypeButton() {
		util.click(addNewIncomeTypeBT, "Add New Income Type");
	}

	@FindAll(@FindBy(xpath="//tr[@id='otherRowsData1']//input[@inputmode='decimal']"))
	private List<WebElement> otherInputTypeTB;

	public void inputOtherIncomeTypeInputValues(List<String> otherInputTypeExpectedValues) {
		int actualSize=	otherInputTypeTB.size();
		for(int i=0; i<=actualSize-1; i++) {
			WebElement oneByOneElement=	otherInputTypeTB.get(i);
			oneByOneElement.clear();
			oneByOneElement.sendKeys(otherInputTypeExpectedValues.get(i));
		}
	}

	@FindBy(xpath="//input[@placeholder='Enter Income Type']")
	private WebElement incomeTypeTB;

	public void inputIncomeTypeValue(String value) {
		util.sendValue(incomeTypeTB, value, "Enter Income Type");
	}

	@FindBy(xpath="(//div[contains(text(),'What is your current net income? (Primary Member)')]/parent::div/parent::div//input)[1]")
	private WebElement primaryMemberWhatIsYourCurrentNetIncomeTB;

	public void inputPrimaryMemberWhatIsYourCurrentNetIncome(String value) {
		util.sendValue(primaryMemberWhatIsYourCurrentNetIncomeTB, value, "What is your current net income? (Primary Member)");
	}

	@FindBy(xpath="(//div[contains(text(),'What is your current net income? (Primary Member)')]/parent::div/parent::div//input)[2]")
	private WebElement spouseWhatIsYourCurrentNetIncomeTB;

	public void inputSpouseMemberWhatIsYourCurrentNetIncome(String value) {
		util.sendValue(spouseWhatIsYourCurrentNetIncomeTB, value, "What is your current net income? (Spouse)");
	}

	@FindBy(xpath="//div[contains(text(),'From your net income')]/parent::div/parent::div//input")
	private WebElement fromYourNetIncomeTB;

	public void inputFromYourNetIncomeValue(String value) {
		util.sendValue(fromYourNetIncomeTB, value, "From your net income, how much do you contribute towards savings or retirement each month?");
	}

	@FindBy(xpath="//p[contains(text(),'Do you have any pension ?')]/parent::div/div/label/p[text()='Yes']")
	private WebElement doYouHavePensionYesRadioBT;

	public void checkDoYouHavePensionYesRadioButton() {
		util.checkCheckBox(doYouHavePensionYesRadioBT, "Do you have any pension ?");
	}

	@FindBy(xpath="//div[contains(text(),'How much ?')]/parent::div/parent::div//input")
	private WebElement howMuchTB;

	public void inputHowMuchValue(String value) {
		util.sendValue(howMuchTB, value, "How Much Text Box");
	}

	@FindBy(xpath="//p[contains(text(),'Will the pension continue to the surviving spouse if the client or spouse dies?')]/parent::div/div/label/p[text()='Yes']")
	private WebElement willTheClientContinueRadioBT;

	public void checkWillTheClientContinueYesRadioButton() {
		util.checkCheckBox(willTheClientContinueRadioBT, "Will the pension continue to the surviving spouse if the client or spouse dies?");
	}

	@FindBy(xpath="//p[contains(text(),'Pension percentage')]/parent::div//input")
	private WebElement pensionPercentageTB;

	public void inputPensionPercentage(String value) {
		util.sendValue(pensionPercentageTB, value, "Pension Percentage");
	}

	@FindBy(xpath="//p[contains(text(),'Do you anticipate any changes to your income?')]/parent::div/div/label/p[text()='Yes']")
	private WebElement doYouHaveAnyChangesYesRadioBT;

	public void checkDoYouHaveAnyAnticipatedChangesYesRadioButton() {
		util.checkCheckBox(doYouHaveAnyChangesYesRadioBT, "Do you anticipate any changes to your income?");
	}

	@FindBy(xpath="//p[contains(text(),'Anticipated Amount')]/parent::div//input")
	private WebElement anticipatedAmountTB;

	public void inputAnticipatedAmountValue(String value) {
		util.sendValue(anticipatedAmountTB, value, "Anticipated Amount");
	}

	@FindBy(xpath="//p[contains(text(),'Anticipated Amount')]/parent::div//textarea")
	private WebElement commentsTB;

	public void inputCommentValue(String value) {
		util.sendValue(commentsTB, value, "Comments");
	}

	@FindBy(xpath="//button[contains(text(),'Save & Proceed to Current Expenses')]")
	private WebElement saveProceedToCurrentExpensesBT;

	public void clickSaveProceedToCurrentExpensesButton() {
		util.click(saveProceedToCurrentExpensesBT, "Save & Proceed to Current Expenses");
	}

	@FindBy(xpath="(//td[contains(text(),'Total')]/following-sibling::td)[1]//input")
	private WebElement primaryCurrentTotalAmountTB;

	public String getPrimaryCurrentTotalAmountValue() {
		String value=	util.GetAttributevalue(primaryCurrentTotalAmountTB, "value");
		String amount=util.convertAmountActualValue(value);
		return amount;
	}

	@FindBy(xpath="(//td[contains(text(),'Total')]/following-sibling::td)[2]//input")
	private WebElement primaryProjectedRetirementTotalAmountTB;

	public String getPrimaryProjectedRetirementTotalAmountValue() {
		String value=	util.GetAttributevalue(primaryProjectedRetirementTotalAmountTB, "value");
		String amount=util.convertAmountActualValue(value);
		return amount;
	}

	@FindBy(xpath="(//td[contains(text(),'Total')]/following-sibling::td)[3]//input")
	private WebElement spouseCurrentTotalAmountTB;

	public String getSpouseCurrentTotalAmountValue() {
		String value=	util.GetAttributevalue(spouseCurrentTotalAmountTB, "value");
		String amount=util.convertAmountActualValue(value);
		return amount;
	}

	@FindBy(xpath="(//td[contains(text(),'Total')]/following-sibling::td)[4]//input")
	private WebElement spouseProjectedRetirementTotalAmountTB;

	public String getSpouseProjectedRetirementTotalAmountValue() {
		String value=	util.GetAttributevalue(spouseProjectedRetirementTotalAmountTB, "value");
		String amount=util.convertAmountActualValue(value);
		return amount;
	}

	public String getPrimaryMemberWhatIsYourCurrentNetIncome() {
		String value=	util.GetAttributevalue(primaryMemberWhatIsYourCurrentNetIncomeTB, "value");
		String amt=	util.convertAmountActualValue(value);
		return amt;
	}

	public String getSpouseWhatIsYourCurrentNetIncome() {
		String value=	util.GetAttributevalue(spouseWhatIsYourCurrentNetIncomeTB, "value");
		String amt=	util.convertAmountActualValue(value);
		return amt;
	}

	public String getFromYourNetIncomeHowMuchDoYou() {
		String value=	util.GetAttributevalue(fromYourNetIncomeTB, "value");
		String amt=	util.convertAmountActualValue(value);
		return amt;
	}

	public String getHowMuchInputValue() {
		String value=	util.GetAttributevalue(howMuchTB, "value");
		String amt=	util.convertAmountActualValue(value);
		return amt;
	}

	public String getPensionInputValue() {
		String value=	util.GetAttributevalue(pensionPercentageTB, "value");
		String amt=	util.convertAmountActualValue(value);
		return amt;
	}

	public String getAnticipatedIncomeInputValue() {
		String value=	util.GetAttributevalue(anticipatedAmountTB, "value");
		String amt=	util.convertAmountActualValue(value);
		return amt;
	}

	public String getCommentInputText() {
		String value=	util.GetAttributevalue(commentsTB, "value");
		String amt=	util.convertAmountActualValue(value);
		return amt;
	}

}
