package com.agingoptions.finance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class TaxInformation {

	private WebUtil util;

	public TaxInformation(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//p[contains(text(),'Does your spouse file a separate tax return ?')]/parent::div//input[@id='877']/following-sibling::span")
	private WebElement doesYourSpouseFileSeperateTaxYesRadioBT;

	public void clickDoesYourSpouseFileSeperateTaxYesRadioBT() {
		util.click(doesYourSpouseFileSeperateTaxYesRadioBT, "Does your spouse file a separate tax return ?");
	}

	@FindBy(xpath="//button[contains(text(),'Add Tax')]")
	private WebElement addTaxBT;

	public void clickAddTaxButton() {
		util.click(addTaxBT, "Add Tax");
	}

	@FindBy(xpath="//div[@id='taxYearFin']/span")
	public WebElement taxYearDD;

	@FindBy(xpath="//li[contains(text(),'2025')]")
	private WebElement yrs2025;

	public void select2025() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(taxYearDD, "Tax Drop Down");
		util.click(yrs2025, "2025");
	}

	@FindBy(xpath="//li[contains(text(),'2024')]")
	private WebElement yrs2024;

	public void select2024() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(taxYearDD, "Tax Drop Down");
		util.click(yrs2024, "2024");
	}

	@FindBy(xpath="//label[contains(text(),'Adjustable Gross Income*')]/parent::div//input")
	private WebElement adjustedGrossIncomeTB;

	public void inputAdjustedGrossIncome(String value) {
		util.sendValue(adjustedGrossIncomeTB, value, "Adjustable Gross Income*");
	}

	@FindBy(xpath="//label[contains(text(),'Taxable Income*')]/parent::div//input")
	private WebElement taxableIncomeTB;

	public void inputTaxableIncomeTB(String value) {
		util.sendValue(taxableIncomeTB, value, "Taxable Income*");
	}

	@FindBy(xpath="//label[contains(text(),'Total Taxes*')]/parent::div//input")
	private WebElement totalTaxes;

	public void inputTotalTaxes(String value) {
		util.sendValue(totalTaxes, value, "Total Taxes");
	}

	@FindBy(xpath="//p[contains(text(),'2025')]/parent::td/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement yrs2025EditIcon;

	public void click2025YrsEditIcon() {
		util.click(yrs2025EditIcon, "2025");
	}

	public String getAdjustedGrossIncomeText() {
		String value=		util.GetAttributevalue(adjustedGrossIncomeTB, "value");
		String text=      util.convertAmountActualValue(value);
		return text;
	}

	public String getTaxableIncomeText() {
		String value=		util.GetAttributevalue(taxableIncomeTB, "value");
		String text=      util.convertAmountActualValue(value);
		return text;
	}

	public String getTotalTaxesText() {
		String value=		util.GetAttributevalue(totalTaxes, "value");
		String text=      util.convertAmountActualValue(value);
		return text;
	}

	@FindBy(xpath="//div[@id='dropDownDivId']/li")
	public List<WebElement> taxlist;

	@FindBy(xpath="//p[contains(text(),'2024')]/parent::td/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement yrs2024EditIcon;

	public void click2024YrsEditIcon() {
		util.click(yrs2024EditIcon, "2024");
	}

	@FindBy(xpath="//li[contains(text(),'2023')]")
	private WebElement yrs2023;

	public void select2023() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(taxYearDD, "Tax Drop Down");
		util.click(yrs2023, "2023");
	}
	
	@FindBy(xpath="//p[contains(text(),'2023')]/parent::td/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement yrs2023EditIcon;

	public void click2023YrsEditIcon() {
		util.click(yrs2023EditIcon, "2023");
	}

	@FindBy(xpath="//li[contains(text(),'2022')]")
	private WebElement yrs2022;

	public void select2022() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(taxYearDD, "Tax Drop Down");
		util.click(yrs2022, "2022");
	}
	
	@FindBy(xpath="//li[contains(text(),'2021')]")
	private WebElement yrs2021;

	public void select2021() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(taxYearDD, "Tax Drop Down");
		util.click(yrs2021, "2021");
	}

	@FindBy(xpath="//li[contains(text(),'2020')]")
	private WebElement yrs2020;

	public void select2020() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(taxYearDD, "Tax Drop Down");
		util.click(yrs2020, "2020");
	}
	
	@FindBy(xpath="//p[contains(text(),'2022')]/parent::td/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement yrs2022EditIcon;

	public void click2022YrsEditIcon() {
		util.click(yrs2022EditIcon, "2022");
	}
	
	@FindBy(xpath="//p[contains(text(),'2021')]/parent::td/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement yrs2021EditIcon;

	public void click2021YrsEditIcon() {
		util.click(yrs2021EditIcon, "2021");
	}
	
	@FindBy(xpath="//p[contains(text(),'2020')]/parent::td/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement yrs2020EditIcon;

	public void click2020YrsEditIcon() {
		util.click(yrs2020EditIcon, "2020");
	}
	
	
}
