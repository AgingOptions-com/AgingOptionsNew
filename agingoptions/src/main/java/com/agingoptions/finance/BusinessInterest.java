package com.agingoptions.finance;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class BusinessInterest {

	private WebUtil util;

	public BusinessInterest(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//button[contains(text(),'Add Business')]")
	private WebElement addBusinessBT;

	public void clickAddBusinessButton() {
		util.click(addBusinessBT, "Add Business Button");
	}

	@FindBy(xpath="//input[@id='nameOfBusiness']")
	private WebElement nameOfBussinessTB;

	public void inputNameOfBusiness(String value) {
		util.sendValue(nameOfBussinessTB, value, "Name of Business");
	}

	@FindBy(xpath="//p[contains(text(),'Business Type*')]/parent::div//span")
	private WebElement businessTypeDD;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Sole Proprietorship')]")
	private WebElement soloProprietorshipDropDown;

	public void selectSoloProProprietorshipBusinessType() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(businessTypeDD, "Business Type");
		util.click(soloProprietorshipDropDown, "Sole Proprietorship");
	}

	@FindBy(xpath="//div[@id='balance']/input")
	private WebElement estimatedMarketValueTB;

	public void inputEstimatedMarketValue(String value) {
		util.sendValue(estimatedMarketValueTB, value, "Estimated Market Value");
	}

	@FindBy(xpath="//input[@id='ubiNumber']")
	private WebElement ubiNumberTB;

	public void inputUBINumber(String value) {
		util.sendValue(ubiNumberTB, value, "UBI Number");
	}

	@FindBy(xpath="//input[@id='federaltaxno']")
	private WebElement federalTaxIdTB;

	public void inputFederalTax(String value) {
		util.sendValue(federalTaxIdTB, value, "Federal tax ID no");
	}

	@FindBy(xpath="//textarea[@id='businessDescription']")
	private WebElement businessDescriptionTB;

	public void inputBusinessDescription(String value) {
		util.sendValue(businessDescriptionTB, value, "Business Description ");
	}

	@FindBy(xpath="//button[contains(text(),'Business Address (Optional)')]")
	private WebElement businessAddressAccordian;

	public void openBusinessAddressAccordian() {
		util.openAccordion(businessAddressAccordian, "Business Address Accordian");
	}

	@FindBy(xpath="//input[@id='addressLine1']")
	private WebElement addressTB;

	@FindBy(xpath="//button[contains(text(),'Owners & Co-owners Information')]")
	private WebElement ownserCownersAccordian;

	public void openOwnerCoOwnerAccordian() {
		util.openAccordion(ownserCownersAccordian, "Owner Co-Owner Accordian");
	}

	@FindBy(xpath="//input[@id='ownershipType']")
	private WebElement ownerCoownerTB;

	public void inputOwnerCoOnwer(String value) {
		util.sendValue(ownerCoownerTB, value, "Owner(S) & Co-Owner(S) ");
	}

	@FindBy(xpath="//td[contains(text(),'Sole Proprietorship')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement soleProprietorshipEditIcon;

	public void clickSoleProperietorshipEditIcon() {
		util.click(soleProprietorshipEditIcon, "Sole Proprietorship");
	}

	public String getNameOfBussinesInputText() {
		String value=	util.GetAttributevalue(nameOfBussinessTB, "value");
		return value;
	}

	public String getBusinessTypeSelectedText() {
		String value=	util.getInnerText(businessTypeDD);
		return value;
	}

	public String getEstimatedMarketValue() {
		String value=	util.GetAttributevalue(estimatedMarketValueTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getUBINumberValue() {
		String value=	util.GetAttributevalue(ubiNumberTB, "value");
		return value;
	}

	public String getFederalTaxIdValue() {
		String value=	util.GetAttributevalue(federalTaxIdTB, "value");
		return value;
	}

	public String getBusinessDescriptionTB() {
		String value=	util.getInnerText(businessDescriptionTB);
		return value;
	}

	public String getOwnerCoOwnerInputText() {
		String value=	util.GetAttributevalue(ownerCoownerTB, "value");
		return value;
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Partnership')]")
	private WebElement partnershipDropDown;

	public void selectPartnershipBusinessType() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(businessTypeDD, "Business Type");
		util.click(partnershipDropDown, "Partnership Business Type");
	}

	@FindBy(xpath="//td[contains(text(),'Partnership')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement partnershipEditIcon;

	public void clickPartnershipEditIcon() {
		util.click(partnershipEditIcon, "Partnership");
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Other')]")
	private WebElement otherBusinessTypeDropDown;

	public void selectOtherBusinessType() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(businessTypeDD, "Business Type");
		util.click(otherBusinessTypeDropDown, "Other Business Type");
	}

	@FindBy(xpath="//input[@id='other']")
	private WebElement otherTB;

	public void inputOtherBusinessTypeValue(String value) {
		util.sendValue(otherTB, value, "Other Business Type Drop Down");
	}

	public String getOtherBusinessTypeValue() {
		String value=	util.GetAttributevalue(otherTB, "value");
		return value;
	}
	
	@FindBy(xpath="//button[contains(text(),'Next: Transportation')]")
	private WebElement nextTransportationBT;
	
	public void clickNextTransportationButton() {
		util.click(nextTransportationBT, "Next Transportation Button");
	}
	
	@FindBy(xpath="//td[contains(text(),'Nonprofit Organization')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement nonProfitEditIcon;

	public void clickNonProfitEditIcon() {
		util.click(nonProfitEditIcon, "Other Bussiness");
	}

}
