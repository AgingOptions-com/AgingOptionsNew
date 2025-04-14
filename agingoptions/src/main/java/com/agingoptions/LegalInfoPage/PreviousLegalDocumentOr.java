package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class PreviousLegalDocumentOr {

	public PreviousLegalDocumentOr(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}
	@FindBy(xpath="//span[text()=' Legal information']")
	protected WebElement LegalInformationText;
	@FindBy(xpath="//div//p[text()='Do you currently have Legal Planning in place?']")
	protected WebElement doYoCurrentlyHaveLegalPlanningText;
	@FindBy(xpath="(//span[@tabindex='1'])[1]")
	protected WebElement DoYouCurrentlyHaveLegalPlanningYesRadioButton;
	@FindBy(xpath="(//span[@tabindex='1'])[2]")
	protected WebElement DoYouCurrentlyHaveLegalPlanningNoRadioButton;
	@FindBy(xpath="//p[text()='Is your plan a Will based or a Trust (Revocable Living Trust) based plan?']")
	protected WebElement IsYourPlanWillOrTrustInnerText;
	@FindBy(xpath="//p[text()='Will']")
	protected WebElement WillRadioButton;
	@FindBy(xpath="//p[text()='Trust']")
	protected WebElement TrustRadioButton;
	@FindBy(xpath="//span[text()='Previous Legal Documents']")
	protected WebElement previousLegaldocumentDrawer;
	@FindBy(xpath="(//img[@alt='Calendar Icon'])[1]")
	protected WebElement CalenderIcon;
	@FindBy(xpath="(//select[@tabindex='5'])[1]")
	protected WebElement YearselectDropDown;
	@FindBy(xpath="(//option[text()='2025'])[1]")
	protected WebElement Year2025FirstCalender; 
	@FindBy(xpath="(//option[text()='2025'])[2]")
	protected WebElement Year2025SecondCalender;
	@FindBy(xpath="(//img[@alt='Edit Icon'])[1]")
	protected WebElement UploadPdfIcon;
	 @FindBy(xpath="(//span[text()='Legal'])[2]")
	protected WebElement LegalButtonUndersetUp;
	 @FindBy(xpath="//p[text()='Is your plan a Will based or a Trust (Revocable Living Trust) based plan?']")
	 protected WebElement isYouPlanWillBaseOrTrustbaseText;
     @FindBy(xpath="//div[@class='AddNewButton text-center align-items-center']")
     protected WebElement addNewDocumentTypeButton;
     @FindBy(xpath="(//img[@alt='Delete Icon'])[1]")
     protected WebElement FirstDeleteButton;
     @FindBy(xpath="//button[text()='Save & Continue later']")
     protected WebElement saveAndContinueButton;
     @FindBy(xpath="//button[text()='Next : Fiduciary/Beneficiary']")
     protected WebElement nextFiduciaryBeneficiryButton;
     @FindBy(xpath="(//span[text()='Fiduciary/Beneficiary'])[2]")
     protected WebElement fiduciaryBeneficiaryInnerText;
     @FindBy(xpath="(//div[text()='4'])[1]")
     protected WebElement DateSelect;
     @FindBy(xpath="(//input[@id='dateExecuted'])[2]")
     protected WebElement SecondDocument;
     @FindBy(xpath="//span[text()='Previous Legal Documents']")
     protected WebElement PreviousLegalDocumentDrawer;
     @FindBy(xpath="//button[text()='Delete']")
     protected WebElement deleteconfirmation;
     @FindBy(xpath="//p[text()='You have a previously Will-based saved document list. Would you like to remove it?']")
     protected WebElement DeleteConfirmationmessage;
     @FindBy(xpath="//span[text()='Select']")
     protected WebElement addNewDocumentPlaaceHolder;
     @FindBy(xpath="//img[@alt='Dropdown icon']")
     protected WebElement AddNewDocumentDropdown;
     @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Other']")
     protected WebElement OtherDocument;
     @FindBy(xpath="//input[@id='otherLabel']")
     protected WebElement otherDescription;
}