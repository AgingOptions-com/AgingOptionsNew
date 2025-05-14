package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class BeneficiaryLetterPageOr {

	public BeneficiaryLetterPageOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
		}
	
	@FindBy(xpath="//span[text()='Beneficiary Letter']")
	protected WebElement beneficiaryLetterDrawer; 
	
	@FindBy(xpath="//p[text()='Assets:']")
	protected WebElement AssetsTextbeneficiaryLetterPage;
	
	@FindBy(xpath="//button[@class=' filePrieviewClosebuttonStyle closeButt2']//img")
	protected WebElement CloseIcon;
	
	@FindBy(xpath="//button[text()='Close']")
	protected WebElement CloseButton;
	
	@FindBy(xpath="//button[text()='Generate']")
	protected WebElement GenerateButton;
	
	@FindBy(xpath="(//span[text()='Type of Assest'])[1]/preceding-sibling::input")
	protected WebElement NonRetirementParentCheckbox;
	
	@FindBy(xpath="(//span[text()='Type of Assest'])[2]/preceding-sibling::input")
	protected WebElement RetirementParentCheckBox;
	
	@FindBy(xpath="//span[text()='Insurance Company']/preceding-sibling::input")
	protected WebElement LifeInsuranceParentCheckbox;
	
	@FindBy(xpath="(//img[@alt='Edit Icon'])[1]")
	protected WebElement ViewPdfIconNonRetirement;
	
	@FindBy(xpath="//button[text()='Add Asset']")
	protected WebElement addasset;
	
	@FindBy(xpath="(//img[@alt='Edit Icon'])[2]")
	protected WebElement EditIconNonRetirement;
	
	@FindBy(xpath="(//span[text()='Finance'])[1]")
	protected WebElement FinanceSectonUnderSetUpPage;
	

	@FindBy(xpath="//div[@id='agingAssetTypeId']/preceding-sibling::div/span")
	protected WebElement typeOfAssetDropDown;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Checking/Saving Account')]")
	protected WebElement checkingSavingAccountDropDownOption;

	
	@FindBy(xpath="//input[@id='nameOfInstitution']")
	protected WebElement nameOfInstituionTB;
	
	@FindBy(xpath="//div[@id='balance']/input")
	protected WebElement balanceTB;
	
	@FindBy(xpath="//p[contains(text(),'Owner*')]/parent::div/div//span")
	protected WebElement ownerDropDownIcon;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Joint']")
	protected WebElement jointDropDownOption;
	
	@FindBy(xpath="//p[contains(text(),'Last four digits of the account number')]/following-sibling::input")
	protected WebElement accountNumberTB;
	
	@FindBy(xpath="//button[text()='Address']")
	protected WebElement addressAccordian;
	
	@FindBy(xpath="//button[contains(text(),'Beneficiary')]")
	protected WebElement beneficiaryAccordian;
	
	@FindBy(xpath="//button[contains(text(),'Document Upload')]")
	protected WebElement documentUploadAccordian;
	
	@FindBy(xpath="//button[text()='Add Charity']")
	protected WebElement addCharityBT;
	
	@FindBy(xpath="//p[contains(text(),'Charity Name*')]/following-sibling::input")
	protected WebElement charityNameTB;

	@FindBy(xpath="//label[contains(text(),'Percentage')]/following-sibling::div/input")
	protected WebElement charityPercentageTB;
	
	@FindBy(xpath="//h5[contains(text(),'Charity Information')]/ancestor::div[@class='costumModal-content']//input[@id='phoneNumber']")
	protected WebElement charityPhoneNumber;
	
	@FindBy(xpath="//h5[contains(text(),'Charity Information')]/ancestor::div[@class='costumModal-content']//input[@id='email']")
	protected WebElement charityEmail;
	
	@FindBy(xpath="//input[@id='addressLine1']")
	protected WebElement AddressLine;
	
	@FindBy(xpath="//input[@id='apt']")
	protected WebElement Suite;
	@FindBy(xpath="//input[@id='city']")
	protected WebElement city;
	
	@FindBy(xpath="//input[@id='state']")
	protected WebElement State;
	@FindBy(xpath="//input[@id='zipCode']")
	protected WebElement Zipcode;
	
	@FindBy(xpath="//button[text()='Save']")
	protected WebElement saveBT;
	
	@FindBy(xpath="//button[text()='Save & Continue later']")
	protected WebElement SaveAndContinueButton;
	
	@FindBy(xpath="//span[text()='Retirement']")
	protected WebElement RetirementDrawer;
	
	@FindBy(xpath="//span[text()='Life Insurance']")
	protected WebElement LifeinsuranceDrawer;
	
	@FindBy(xpath="//button[text()='Add Policy']")
	protected WebElement AddPolicyButton;
	
	@FindBy(xpath="//div[@id='Beneficiary']//img")
	protected WebElement BeneficiaryMemberDropdown;
	
	@FindBy(xpath="//ul[@id='dropDownDivId']//li")
	protected WebElement  beneficiarymemberOptions;
	
	@FindBy(xpath="//button[text()='Beneficiary Information']")
	protected WebElement beneficiaryAccordianText;
	
	@FindBy(xpath="//input[@id='phoneNumber']")
	protected WebElement phonenumbertextBox;
	
	@FindBy(xpath="//input[@id='email']")
	protected WebElement email;
	
	@FindBy(xpath="(//span[text()='Legal'])[1]")
	protected WebElement legalButtonUnderSetUpPage;
	

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Other')]")
	protected  WebElement otherDropDownOption;
	
	@FindBy(xpath="//input[@id='other']")
	protected WebElement otherTypeTextBox;
	
	@FindBy(xpath="//p[text()='Kindly select a checkbox to generate Beneficiary letter']")
	protected WebElement toastermessage;
}
