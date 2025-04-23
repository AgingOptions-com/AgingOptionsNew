package com.agingoptions.finance;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class TransportAssets {

	private WebUtil util;

	public TransportAssets(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//button[contains(text(),'Add Transport Assets')]")
	private WebElement addTransportAssetsBT;

	public void clickAddTransportButton() {
		util.click(addTransportAssetsBT, "Add Transportation");
	}

	@FindBy(xpath="//p[contains(text(),'Auto')]")
	private WebElement autoRadioBT;

	public void clickAutoRadioButton() {
		util.click(autoRadioBT, "Auto");
	}

	@FindBy(xpath="//p[contains(text(),'Boat')]")
	private WebElement boatRadioBT;

	public void clickBoatRadioButton() {
		util.click(boatRadioBT, "Boat");
	}

	@FindBy(xpath="//p[contains(text(),'Plane')]/preceding-sibling::input")
	private WebElement planeRadioBT;

	public void clickPlaneRadioButton() {
		util.click(planeRadioBT, "Plane");
	}

	@FindBy(xpath="//p[contains(text(),'Other')]")
	private WebElement otherTransportationTypeRadioBT;

	public void clickOtherRadioButton() {
		util.click(otherTransportationTypeRadioBT, "Other");
	}

	@FindBy(xpath="//button[contains(text(),'Auto Information')]")
	private WebElement autoInformationAccordianBT;

	public void openAutoInformationAccordian() {
		util.openAccordion(autoInformationAccordianBT, "Auto Information Accordian");
	}

	@FindBy(xpath="//div[@id='yearMade']")
	private WebElement yearMakeDropDown;

	@FindBy(xpath="//div[@id='dropDownDivId']/li[contains(text(),'2010')]")
	private WebElement yearMade2010;

	public void select2010FromYearMadeDropDown() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(yearMakeDropDown, "Year Make Drop Down");
		util.click(yearMade2010, "2010");
	}


	@FindBy(xpath="//input[@id='MaknameOfInstitutione']")
	private WebElement makeTB;

	public void inputMake(String value) {
		util.sendValue(makeTB, value, "Make");
	}

	@FindBy(xpath="//input[@id='modelNumber']")
	private WebElement modelNumTB;

	public void inputModelNum(String value) {
		util.sendValue(modelNumTB, value, "Model Number");
	}

	@FindBy(xpath="//label[contains(text(),'Value')]/parent::div/div/input")
	private WebElement valueTB;

	public void inputValueTB(String value) {
		util.sendValue(valueTB, value, "Value");
	}

	@FindBy(xpath="//input[@id='Color']")
	private WebElement colorTB;

	public void inputColorTB(String value) {
		util.sendValue(colorTB, value, "Color");
	}

	@FindBy(xpath="//input[@id='License']")
	private WebElement licenseTB;

	public void inputLicense(String value) {
		util.sendValue(licenseTB, value, "License");
	}

	@FindBy(xpath="//input[@id='VIN']")
	private WebElement vinTB;

	public void inputVin(String value) {
		util.sendValue(vinTB, value, "VIN");
	}

	@FindBy(xpath="//input[@id='exipryDate']")
	private WebElement vehicalExpiryDateTB;

	public void inputVehicalRegistrationExpiryDate(String value) {
		util.sendValue(vehicalExpiryDateTB, value, "Vehical registration expiry date");
	}

	@FindBy(xpath="//button[contains(text(),'Ownership & Loan Information')]")
	private WebElement ownershipLoanInfoAccordian;

	public void openOwnershipLoanAccordian() {
		util.openAccordion(ownershipLoanInfoAccordian, "Ownership and Loan Information");
	}

	@FindBy(xpath="//p[contains(text(),'Owned')]")
	private WebElement ownedRadioBT;

	public void clickOwnedRadioButton() {
		util.click(ownedRadioBT, "Owned");
	}


	@FindBy(xpath="//span[contains(text(),'Is there a loan against this transport?')]/parent::p/parent::div//label/p[contains(text(),'Yes')]")
	private WebElement isThereALoanYesRadioBT;

	public void clickIsThereALoanYesRadioButton() {
		util.click(isThereALoanYesRadioBT, "Is there a loan against this transport? Yes Radio Button");
	}

	@FindBy(xpath="//span[contains(text(),'Is there a loan against this transport?')]/parent::p/parent::div//label/p[contains(text(),'No')]/preceding-sibling::input")
	private WebElement isThereALoanNoRadioBT;

	@FindBy(xpath="//button[contains(text(),'Loan Details')]")
	private WebElement loanDetailsAccordian;

	public void openLoanDetailsAccordian() {
		util.click(loanDetailsAccordian, "Loan Details");
	}

	@FindBy(xpath="//input[@id='nameofInstitutionOrLender']")
	private WebElement nameOfCompanyTB;

	public void inputNameOfCompany(String value) {
		util.sendValue(nameOfCompanyTB, value, "Name Of company");
	}

	@FindBy(xpath="//input[@id='interestRate']")
	private WebElement interestRateTB;

	public void inputInterestRate(String value) {
		util.sendValue(interestRateTB, value, "Interest Rate");
	}

	@FindBy(xpath="//label[translate(normalize-space(text()), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = 'monthly amount']/parent::div//input")
	private WebElement monthlyAmountTB;

	public void inputMonthlyAmount(String value) {
		util.sendValue(monthlyAmountTB, value, "Monthly Amount");
	}

	@FindBy(xpath="//div[@id='outstandingBalance']//input")
	private WebElement outstandingBalanceTB;

	public void inputOutstandingBalance(String value) {
		util.sendValue(outstandingBalanceTB, value, "Outstanding Balance");
	}

	@FindBy(xpath="//input[translate(@id, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = 'payoffdate']")
	private WebElement payOffDate;

	public void inputPayOffDate(String value) {
		util.sendValue(payOffDate, value, "PayOff Date");
	}

	@FindBy(xpath="//input[@id='loanNumber']")
	private WebElement loanNumberTB;

	public void inputLoanNumber(String value) {
		util.sendValue(loanNumberTB, value, "Loan Number");
	}

	@FindBy(xpath="//button[contains(text(),'Loan Company Contact & Address Information')]")
	private WebElement loanCompanyContactAddressInfoAccordian;

	public void openLoanCompanyContactAddressAccordian() {
		util.openAccordion(loanCompanyContactAddressInfoAccordian, "Loan Company");
	}

	@FindBy(xpath="//td[contains(text(),'Auto')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement autoEditIcon;

	public void clickAutoEditIcon() {
		util.click(autoEditIcon, "Auto Edit Icon");
	}

	public String getYearMadeSelectedText() {
		String value=	util.getInnerText(yearMakeDropDown);
		return value;
	}

	public String getMakeInputText() {
		String value=	util.GetAttributevalue(makeTB,"value");
		return value;
	}

	public String getModelInputText() {
		String value=	util.GetAttributevalue(modelNumTB,"value");
		return value;
	}

	public String getValueInputText() {
		String value=	util.GetAttributevalue(valueTB,"value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getColorInputText() {
		String value=	util.GetAttributevalue(colorTB,"value");
		return value;
	}

	public String getLicensePlateInputText() {
		String value=	util.GetAttributevalue(licenseTB,"value");
		return value;
	}

	public String getVINNoInputText() {
		String value=	util.GetAttributevalue(vinTB,"value");
		return value;
	}

	public String getVehicalRegistrationInputText() {
		String value=	util.GetAttributevalue(vehicalExpiryDateTB,"value");
		String text=	util.convertDateFormatMMDDYYYY(value);
		return text;
	}

	public String getNameOfCompanyInputText() {
		String value=	util.GetAttributevalue(nameOfCompanyTB,"value");
		return value;
	}

	public String getInterestRateInputText() {
		String value=	util.GetAttributevalue(interestRateTB,"value");
		return value;
	}

	public String getMonthlyAmountInputText() {
		String value=	util.GetAttributevalue(monthlyAmountTB,"value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getOutstandingBalanceInputText() {
		String value=	util.GetAttributevalue(outstandingBalanceTB,"value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getPayOffDateInputText() {
		String value=	util.GetAttributevalue(payOffDate,"value");
		String text=	util.convertDateFormatMMDDYYYY(value);
		return text;
	}

	public String getLoanNoInputText() {
		String value=	util.GetAttributevalue(loanNumberTB,"value");
		return value;
	}

	@FindBy(xpath="//p[contains(text(),'Leased')]")
	private WebElement leasedRadioBT;

	public void clickLeasedRadioButton() {
		util.click(leasedRadioBT, "Leased");
	}

	@FindBy(xpath="//td[contains(text(),'Boat')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement boatEditIcon;

	public void clickBoatEditIcon() {
		util.click(boatEditIcon, "Boat Edit Icon");
	}

	@FindBy(xpath="//input[@id='other']")
	private WebElement otherTB;

	public void inputOtherTransportationValue(String value) {
		util.sendValue(otherTB, value, "Other Transportation");
	}

	public String getOtherTransportationInputValue() {
		String value=	util.GetAttributevalue(otherTB, "value");
		return value;
	}

	@FindBy(xpath="//button[contains(text(),'Next: Life Insurance')]")
	private WebElement nextLifeInsuranceBT;

	public void clickNextLifeInsuranceButton() {
		util.click(nextLifeInsuranceBT, "Next: Life Insurance");
	}

	@FindBy(xpath="//td[contains(text(),'Motorcycle')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement motorCycleEditIcon;

	public void clickMotorCycleEditIcon() {
		util.click(motorCycleEditIcon, "MotorCycle Edit Icon");
	}


}
