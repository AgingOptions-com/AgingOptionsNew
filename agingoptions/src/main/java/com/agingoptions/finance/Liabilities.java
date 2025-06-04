package com.agingoptions.finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class Liabilities {

	private WebUtil util;

	public Liabilities(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//td[contains(text(),'CrossCountry Mortgage')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement crossCountryMortgageEditIcon;

	public void clickCrossCountryMortgageEditIcon() {
		util.click(crossCountryMortgageEditIcon, "Mortgage ");
	}

	@FindBy(xpath="(//div[@id='liabilityTypeId']/preceding-sibling::div/span)[1]")
	private WebElement typeOfLiabilitiesSelectedText;

	public String getTypeOfLiabilitesSelectedText() {
		String text=	util.getInnerText(typeOfLiabilitiesSelectedText);
		return text;
	}

	@FindBy(xpath="(//div[@id='liabilityTypeId']/preceding-sibling::div/span)[2]")
	private WebElement subTypeOfLiabilitiesSelectedText;

	public String getSubTypeOfLiabilitesSelectedText() {
		String text=	util.getInnerText(subTypeOfLiabilitiesSelectedText);
		return text;
	}

	@FindBy(xpath="//input[@id='nameofInstitutionOrLender']")
	private WebElement nameOfLenderTB;

	public String getNameOfLenderInputText() {
		String value=	util.GetAttributevalue(nameOfLenderTB, "value");
		return value;
	}

	@FindBy(xpath="//div[@id='monthlyAmount']/input")
	private WebElement monthlyAmountTB;

	public String getMonthlyAmountInputText() {
		String value=	util.GetAttributevalue(monthlyAmountTB, "value");
		String text=util.convertAmountActualValue(value);
		return text;
	}

	@FindBy(xpath="//div[@id='balance']/input")
	private WebElement outstandingBalanceTB;

	public String getOutstandingBalanceInputText() {
		String value=	util.GetAttributevalue(outstandingBalanceTB, "value");
		String text=util.convertAmountActualValue(value);
		return text;
	}

	@FindBy(xpath="//button[contains(text(),'Lender Contact and Address Information')]")
	private WebElement lenderContactAddressInfoAccordian;

	public void openLenderContactAddressInfoAccordian() {
		util.openAccordion(lenderContactAddressInfoAccordian, "Lender Contact Address Information Accordian");
	}

	@FindBy(xpath="//div[normalize-space()='Primary contact']//parent::td/following-sibling::td//img[contains(@class,'icon cursor-pointer')]")
	private WebElement primaryContactEditIcon;

	public void clickPrimaryContactEditIcon() {
		util.click(primaryContactEditIcon, "Primary Contact Edit Icon");
	}

	@FindBy(xpath="//input[@id='insStartDate']")
	private WebElement payOffDateTB;

	public String getPayOffDate() {
		String date=	util.GetAttributevalue(payOffDateTB, "value");
		String value=	util.convertDateFormatMMDDYYYY(date);
		return value;
	}

	@FindBy(xpath="//td[contains(text(),'Sample Adjustable Rate Mortgage')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement samplAdjustableRateMortgageEditIcon;

	public void clickEditIconofSampleAdjustableRateMortgage() {
		util.click(samplAdjustableRateMortgageEditIcon, "Sample Adjustable Rate Mortgage");
	}

	@FindBy(xpath="//td[contains(text(),'Dummy FHA Loan')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement dummyFHALoanMortgageEditIcon;

	public void clickEditIconofDummyFHALoanMortgageEditIcon() {
		util.click(dummyFHALoanMortgageEditIcon, "Dummy FHA Loan");
	}

	@FindBy(xpath="//td[contains(text(),'Mock USDA Loan')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement mockUSDALoanMortgageEditIcon;

	public void clickMockUSDALoanMortgageEditIconMortgageEditIcon() {
		util.click(mockUSDALoanMortgageEditIcon, "Mock USDA Loan");
	}

	@FindBy(xpath="(//div[normalize-space()='Physical Address'])[2]")
	private WebElement liabilitiesPhysicalAddressText;

	public String getPhysicalAddressText() {
		String text=	util.getInnerText(liabilitiesPhysicalAddressText);
		return text;
	}

	@FindBy(xpath="(//div[normalize-space()='Primary contact'])[2]")
	private WebElement liabilitiesPrimaryContactText;

	public String getPrimaryContactText() {
		String text=	util.getInnerText(liabilitiesPrimaryContactText);
		return text;
	}
	
	@FindBy(xpath="//td[contains(text(),'Agingoptions')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement agingOptionsEditIcon;
	
	public void clickAgingOptionsEditIcon() {
		util.click(agingOptionsEditIcon, "Aging Options");
	}
	
	@FindBy(xpath="//td[contains(text(),'Nspl')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement nsplEditIcon;
	
	public void clickNsplEditIcon() {
		util.click(nsplEditIcon, "NSPL Edit Icon");
	}
	

}


