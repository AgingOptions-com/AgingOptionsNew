package com.Ao.HousingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingProfessionalDetailspageOr {

	public HousingProfessionalDetailspageOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
		
		
	}
	
	@FindBy(xpath="//input[@id='fName']")
	protected WebElement FirstName;
	
	@FindBy(xpath="//input[@id='lName']")
	protected WebElement LastName;
	
	@FindBy(xpath="//input[@id='business']")
	protected WebElement BusinessName;
	
	@FindBy(xpath="//input[@id='websiteLink']")
	protected WebElement WebSiteLink;
	
	@FindBy(xpath="//textarea[@id='instructionsToAgent']")
	protected WebElement NoteForAgent;
	
   @FindBy(xpath="//img[@alt='accordion']")
   protected WebElement Accordian;
   
   @FindBy(xpath="//img[@alt='Dropdown icon']")
   protected WebElement contactTypeDropdown;
   
   @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Other']")
   protected WebElement OtherOptions;
   
   @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Primary']")
   protected WebElement primaryContactOptions;
   
   @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Secondary']")
   protected WebElement SecondaryContactOptions;
   
   @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Work']")
   protected WebElement WorkContactOptions;
   
   @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Home']")
   protected WebElement HomeContactOptions;
   
   @FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Fax']")
   protected WebElement FaxContactOptions;
   
   @FindBy(xpath="//input[@id='other']")
   protected WebElement OthertypeTextBox;
   
   @FindBy(xpath="(//div[@class='country-select css-b62m3t-container']/following-sibling::div)[1]")
   protected WebElement PhoneNumber;
   
   @FindBy(xpath="//input[@id='email']")
   protected WebElement Email;
   
   @FindBy(xpath="//div[@class='prof-count']")
	protected WebElement ProfessionalCount;
   
   @FindBy(xpath="//div[@class='d-flex addAnotherTextSize imgSizeWithText align-self-center']")
   protected WebElement AddAnotherContact;
   
   @FindBy(xpath="//input[@type='checkbox']")
   protected WebElement samedataToSpouseCheckBox;
   
   @FindBy(xpath="//p[text()='Copy same data to spouse']")
   protected WebElement copySameDataToSpouseText;
   
   @FindBy(xpath="//button[text()='Save & Continue later']")
   protected WebElement SaveAndContinueButton;
   
   @FindBy(xpath="//button[text()='Save & Add Another']")
   protected WebElement SaveAndAddAnotherButton;
   
	@FindBy(xpath="//div[@class='btn-div addBorderToToggleButton ms-auto']//button[@class='view-btn active selectedToglleBorder']")
	protected WebElement highlightedtoggleButton;
   
   @FindBy(xpath="//button[text()='Save & Add Another']/following-sibling::button")
   protected WebElement SaveAndProceedTo;
	@FindBy(xpath="(//div[@class='search']/following::button)[1]")
	protected WebElement AddRealtorButton;
	
	@FindBy(xpath="//input[@id='addressLine1']")
	protected WebElement AddressLine1;
	
	@FindBy(xpath="//input[@id='country']")
	protected WebElement CountryRegionField;
	@FindBy(xpath="//input[@id='city']")
	protected WebElement city;
	
	@FindBy(xpath="//input[@id='state']")
	protected WebElement State;
	@FindBy(xpath="//input[@id='zipCode']")
	protected WebElement Zipcode;
	@FindBy(xpath="//span[text()=' Previous']")
	protected WebElement PreviousIcon;

	@FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[2]")
	protected WebElement SpousetoggleButton;
	
	@FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[1]")
	protected WebElement primaryMemberToggleButton;
	
	@FindBy(xpath="//div[@class='header-box']//p")
	protected WebElement mortgageBrokerinnerText;
	
	@FindBy(xpath="//span[text()='Realtor']")
	protected WebElement RealtorIcon;
	
	@FindBy(xpath="//img[@alt='Edit Icon']")
	protected WebElement Editicon;
	
	@FindBy(xpath="//button[text()='Update']")
	protected WebElement UpdateButton;
	
	@FindBy(xpath="//span[text()='Mortgage Broker']")
	protected WebElement MortgageBrokerSection;
	@FindBy(xpath="//span[text()=' Legal information']")
	protected WebElement LegalInfoInnerText;
	
	@FindBy(xpath="(//span[text()='Housing'])[2]")
	protected WebElement HousingButtonUnderSetup;
	
	@FindBy(xpath="//span[text()='Housing Professionals']")
	protected WebElement HousoingProfessionalsecton;
	
	@FindBy(xpath="//span[text()='Handyman']")
	protected WebElement handyManSection;
	
	@FindBy(xpath="(//p[text()='Handyman Services'])[2]")
	protected WebElement Handymaninnertext;
}
