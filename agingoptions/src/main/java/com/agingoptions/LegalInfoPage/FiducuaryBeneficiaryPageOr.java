package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FiducuaryBeneficiaryPageOr {
	
	public FiducuaryBeneficiaryPageOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
		
		
	}
  @FindBy(xpath="(//span[text()='Fiduciary/Beneficiary'])[1]")
  protected WebElement FiduciaryBeneficiaryDrawer; 
  @FindBy(xpath="(//span[text()='Fiduciary/Beneficiary'])[2]")
  protected WebElement FiduciaryBeneficiaryText;
  @FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[1]")
  protected WebElement Primarymembertogglebuttontext;
  @FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[2]")
  protected WebElement spousetogglebuttontext;
  @FindBy(xpath="(//input[@class='form-check-input'])[1]")
  protected WebElement SpouseTablebenCheckbox;
  @FindBy(xpath="(//input[@class='form-check-input'])[2]")
  protected WebElement SpouseTablefidCheckBox;
  @FindBy(xpath="(//img[@alt='Edit Icon'])[1]")
  protected WebElement ClientSpouseEditIcon;
  @FindBy(xpath="(//input[@id='custom-checkbox-setup '])[1]")
  protected WebElement FiduciaryCheckBoxInDetails;
  @FindBy(xpath="(//input[@id='custom-checkbox-setup '])[2]")
  protected WebElement BeneficiaryCheckBoxInDetails;
  @FindBy(xpath="//div[@class='d-flex justify-content-end']//button")
  protected WebElement ProceedtoButton;
  @FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[1]")
  protected WebElement primaryMemberToggleButton;
  @FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[2]")
  protected WebElement SpouseToggleButton;
  @FindBy(xpath="(//p[text()='Please identify your choices for your living will.'])[1]") 
  protected WebElement LivingWillVerificationText;
  @FindBy(xpath="//div[@class='w-25 d-flex flex-row-reverse']//button")
  protected WebElement AddAnotherButton;
  @FindBy(xpath="//input[@id='fName']")
  protected WebElement FirstName;
  @FindBy(xpath="//input[@id='mName']")
  protected WebElement MiddleName;
  @FindBy(xpath="//input[@id='lName']")
  protected WebElement LastName;
  @FindBy(xpath="(//div[@class='dropdown-icon '])[1]//img")
  protected WebElement PrefixSuffix;
  @FindBy(xpath="//input[@id='nickName']")
  protected WebElement NickName;
  @FindBy(xpath="(//div[@class='dropdown-icon '])[2]//img")
  protected WebElement Gender;
  @FindBy(xpath="(//div[@class='dropdown-icon '])[3]//img")
  protected WebElement CalenderIcon;
  @FindBy(xpath="//select[@tabindex='10']")
  protected WebElement selectYearDropdown;
  @FindBy(xpath="(//div[@class='dropdown-icon '])[5]/img")
  protected WebElement RelationShipWithPrimaryMemberDropDown;
  @FindBy(xpath="(//div[@class='dropdown-icon '])[6]/img")
  protected WebElement RelationShipWithSpouseDropDown;
  @FindBy(xpath="//div[@id='custom-textarea-field']//textarea")
  protected WebElement PlaceOfBirthTB;
  @FindBy(xpath="(//span[@tabindex='26'])[1]")
  protected WebElement MakeThisAsEmergencyYesRadioButton;
  @FindBy(xpath="(//span[@tabindex='39'])[1]")
  protected WebElement isThisExtendedEmployedYesRadioButton;
  @FindBy(xpath="(//span[@tabindex='39'])[2]")
  protected WebElement isThisExtendedEmployedNoRadioButton;
  @FindBy(xpath="(//span[@tabindex='45'])[1]")
  protected WebElement AreYouDisabledWithSpecialNeedsYes;
  @FindBy(xpath="(//span[@tabindex='45'])[2]")
  protected WebElement AreYouDisabledWithSpecialNeedsNo;
  @FindBy(xpath="//p[text()='Are you disabled / with special needs?']/parent::div//div//p[text()='Yes']")
  protected WebElement SpecialNeedsRadioButtonYes;
  @FindBy(xpath="//img[@class='allAccordionCloseButton']")
  protected WebElement accordian;
  @FindBy(xpath="(//img[@alt='Dropdown icon'])[6]")
  protected WebElement addressTypeDropdown;
  @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Physical']")
  protected WebElement PhysicialTypeOption;
  @FindBy(xpath="//input[@id='addressLine1']")
  protected WebElement SearchAddress;
  @FindBy(xpath="(//input[@tabindex='54'])[1]")
  protected WebElement StreetNumberAndName;
  @FindBy(xpath="(//input[@tabindex='54'])[2]")
  protected WebElement AptSuite;
  @FindBy(xpath="(//input[@tabindex='54'])[3]")
  protected WebElement city;
  @FindBy(xpath="(//input[@tabindex='54'])[4]")
  protected WebElement state;
  @FindBy(xpath="(//input[@tabindex='54'])[5]")
  protected WebElement Zipcode;
  @FindBy(xpath="(//input[@tabindex='54'])[6]")
  protected WebElement Country;
  @FindBy(xpath="//p[text()='Contact Type']/parent::div//div[@class='dropdown-icon ']//img")
  protected WebElement contacttypeDropdown;
  @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Primary']")
  protected WebElement PrimaryOptions;
  @FindBy(xpath="//input[@id='phoneNumber']")
  protected WebElement phonenumber;
  @FindBy(xpath="//input[@id='email']")
  protected WebElement email;
  @FindBy(xpath="//button[text()='Save & Continue later']")
  protected WebElement SaveAndContinueButton;
  @FindBy(xpath="//span[@class='badge ms-1']")
  protected WebElement fid_BenCount;
  @FindBy(xpath="//div[@id='dropDownDivId']//li[text()='None']")
  protected WebElement NonePrefix;
  @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Male']")
  protected WebElement Male;
  @FindBy(xpath="//div[text()='1']")
  protected WebElement Date1;
  @FindBy(xpath="//div[@id='dropDownDivId']//li[text()='Aunt']")
  protected WebElement relationShipOption;
  @FindBy(xpath="//input[@id='occupationType']")
  protected WebElement occupationType;
  @FindBy(xpath="//span[text()=' Previous']")
  protected WebElement PreviousIcon;
  @FindBy(xpath="//div[text()='(+91) IN']")
  protected WebElement IndianContact;
  @FindBy(xpath="//div[@class='css-19bb58m']//input")
  protected WebElement countrycodedropdown;
  @FindBy(xpath="//input[@id='search']")
  protected WebElement SearchFidBenmember;
  @FindBy(xpath="//div[@class='d-flex justify-content-around']//img")
  protected WebElement editIcon; 
  @FindBy(xpath="//div[@id='common-decease_modal_main_div']//h4")
  protected WebElement WarningMessageFidToSpecialNeed;
  @FindBy(xpath="//div[@id='common-decease_modal_main_div']//following-sibling::div//button[text()='Yes']")
  protected WebElement YesButtonOfWarning;
  @FindBy(xpath="//div[@class='new-decease_modal_email_temp-textarea']//textarea")
  protected WebElement EmailPreviewText;
  @FindBy(xpath="//button[text()='Send']")
  protected WebElement SendButtonOfEmailPreview;
  @FindBy(xpath="//button[text()='Update']")
  protected WebElement updateButton;
  @FindBy(xpath="(//div[@class='form-check-smoke'])[2]//input")
  protected WebElement FiduciaryCheckBoxSearchedMember;
  @FindBy(xpath="(//label[@class='radio-label mx-2 d mt-2 mb-0 custom-checkbox'])[2]//p")
  protected WebElement DeceasedRadioButton;
  @FindBy(xpath="//div[text()='No Data Found']")
  protected WebElement NoDataFoundText;
  @FindBy(xpath="//input[@id='dob']")
  protected WebElement DateOfBirthTB;
  
  
  
}
