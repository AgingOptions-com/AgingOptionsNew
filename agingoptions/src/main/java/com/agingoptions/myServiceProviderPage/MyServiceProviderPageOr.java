package com.agingoptions.myServiceProviderPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class MyServiceProviderPageOr {


	public MyServiceProviderPageOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
	}
	@FindBy(xpath="(//span[text()='My Service Providers'])[1]")
	protected WebElement MyServiceProviderSectionUndersetUpPage; 

	@FindBy(xpath="//span[text()='My service provider']")
	protected WebElement MyServiceProviderText;

	@FindBy(xpath="//button[text()='Add Professional']")
	protected WebElement AddProfessionalButton;

	@FindBy(xpath="//div[text()='Physician']/preceding-sibling::input")
	protected WebElement PhysicianCheckBoxUnderDropdown;

	@FindBy(xpath="//div[text()='Specialist']/preceding-sibling::input")
	protected WebElement  SpecialistCheckBoxUnderDropdown;
   
	@FindBy(xpath="//div[text()='Adult Day Service']/preceding-sibling::input")
	protected WebElement AdultDayService;
	
	@FindBy(xpath="//div[text()='Care Management']/preceding-sibling::input")
	protected WebElement CareManagement;
	
	@FindBy(xpath="//div[text()='Other']/preceding-sibling::input")
	protected WebElement Other;
	
	@FindBy(xpath="//div[text()='Realtor']/preceding-sibling::input")
	protected WebElement  RealtorCheckBoxUnderDropdown;
	
	@FindBy(xpath="//input[@id='other']")
	protected WebElement OtherOptionDescription;
	
	@FindBy(xpath="//div[text()='Geriatric Care Manager']/preceding-sibling::input")
	protected WebElement GCMCheckBoxUnderDropDown;

	@FindBy(xpath="//div[text()='Other']/preceding-sibling::input")
	protected WebElement  OtherCheckBoxUnderDropDown;
	
	@FindBy(xpath="(//span[text()='Housing'])[1]")
	protected WebElement HousingSectonUnderSetUpPage;
	
	@FindBy(xpath="//span[text()='Housing Professionals']")
	protected WebElement HousingProfessionalDrawer;
	
	@FindBy(xpath="(//span[text()='Finance'])[1]")
	protected WebElement FinanceProfessionalSectionUnderSetupPage;
	
	@FindBy(xpath="//span[text()='Financial Professionals']")
	protected WebElement FinanceProfessionalDrawer;
	
	

	@FindBy(xpath="//label[@class='radio-label m-2 e']//input")
	protected WebElement CopySameDataToSpouseCheckBox;

	@FindBy(xpath="//input[@id='fName']")
	protected WebElement FirstName;

	@FindBy(xpath="//input[@id='lName']")
	protected WebElement LastName;

	@FindBy(xpath="//input[@id='business']")
	protected WebElement  BusinessName;

	@FindBy(xpath="//input[@id='websiteLink']")
	protected WebElement WebSiteLink;

	@FindBy(xpath="//textarea[@id='instructionsToAgent']")
	protected WebElement NoteToAgent;

	@FindBy(xpath="//button[text()='Contact & Address Information']")
	protected WebElement ContactAndAddressAccordian; 

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

	@FindBy(xpath="(//p[text()='Contact Type']/following::img)[1]")
	protected WebElement contactTypeDropdown;

	@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Other']")
	protected WebElement OtherOptions;

	@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Primary']")
	protected WebElement primaryContactOptions;


	@FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[2]")
	protected WebElement SpousetoggleButton;

	@FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[1]")
	protected WebElement primaryMemberToggleButton;

	@FindBy(xpath="//div[@class='btn-div addBorderToToggleButton ms-auto']//button[@class='view-btn active selectedToglleBorder']")
	protected WebElement highlightedtoggleButton;
	
	@FindBy(xpath="(//span[text()='Health'])[3]")
	protected WebElement HealthSpecialityDrawer;
	
    @FindBy(xpath="(//span[text()='Housing'])[3]")
    protected WebElement HousingSpecialityDrawer;
    
    @FindBy(xpath="(//span[text()='Finance'])[3]")
    protected WebElement FinancialSpecialityDrawer;
    
    @FindBy(xpath="(//span[text()='Legal'])[3]")
    protected WebElement LegalSpecialityDrawer;
    
    @FindBy(xpath="//span[text()='Other']")
    protected WebElement OtherSpecialityDrawer;
    
    @FindBy(xpath="//input[@id='other']")
    protected WebElement OtherDescription; 
    
    @FindBy(xpath="//p[text()='Select Sub service provider']")
    protected WebElement SelectServiceProviderText;
    
    @FindBy(xpath="(//span[text()='Select'])[1]")
    protected WebElement SelectServiceProviderDropdown;
    
    @FindBy(xpath="//div[contains(text(),'Geriatric Care Manager')]")
    protected WebElement GCMTextUnderDropdown;
    
    @FindBy(xpath="//div[text()='Geriatric Medicine']/preceding-sibling::input")
    protected WebElement GeriaticMediciane;
    
    @FindBy(xpath="//div[text()='General Practitioner (GP)']/preceding-sibling::input")
    protected WebElement GeneralPractionerUnderSelectSubServiceProvider;
    
    @FindBy(xpath="//div[text()='Acupressure']/preceding-sibling::input")
    protected WebElement AccupressureUnderSubServiceProvider;
    
    @FindBy(xpath="//div[text()='Financial Advisor']/preceding-sibling::input")
    protected WebElement FinancialAdvisorServiceProvider;
	
	@FindBy(xpath="//button[text()='Save & Continue later']")
	protected WebElement SaveAndContinueBT; 
	
	@FindBy(xpath="//div[@class='prof-count']")
	protected WebElement ProfessionalCount;
	
	@FindBy(xpath="//div[@id='proSubTypeSelected']//img")
	protected WebElement SubServiceProviderDropdown;
	
	@FindBy(xpath="//input[@id='phoneNumber']")
	protected WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id='email']")
	protected WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	protected WebElement SearchBar;
	
	@FindBy(xpath="(//table[@class='custom-table mb-0 table']//tr//td)[2]")
	protected WebElement ExpectedSpeciality;
	
	@FindBy(xpath="//span[text()='Specialists']")
	protected WebElement specialistDrawer;
	
	@FindBy(xpath="(//span[text()='Health'])[1]")
	protected WebElement HealthSectionUnderSetupPage;
	
	@FindBy(xpath="(//span[text()='Housing'])[1]")
	protected WebElement HousingSectionUnderSetUpPage;
	
	@FindBy(xpath="//span[text()='Realtor']")
	protected WebElement RealtorDrawer;
	
	@FindBy(xpath="//span[text()='Health Professionals']")
	protected WebElement HealthprofessionalDrawer; 
	
	@FindBy(xpath="//span[text()='Specialists']")
	protected WebElement HealthProfessionalSpecialistDrawer;
	
	@FindBy(xpath="(//tbody//tr//td)[1]")
	protected WebElement professonalNameInTable;
	
	@FindBy(xpath="(//span[text()='Legal'])[1]")
	protected WebElement LegalButtonUnderSetUpPage;
	
	@FindBy(xpath="//span[text()='Legal Professionals']")
	protected WebElement LegalProfessionalDrawer;
	
	@FindBy(xpath="//div[text()='Elder Law Attorney']/preceding-sibling::input")
	protected WebElement ELAdrawer;
	
	@FindBy(xpath="(//div[@class='ms-auto']//button)[2]")
	protected WebElement SaveAndProceedToHomeButton;

	@FindBy(xpath="//h1[text()='Personal Information']")
	protected WebElement PersonalInformationText;
	
	@FindBy(xpath="(//div[@class='ms-auto']//button)[1]")
	protected WebElement SaveAndAddAnotherBT;
	
	@FindBy(xpath="//span[text()=' Previous']")
	protected WebElement PreviousIcon;
	
	@FindBy(xpath="//div[text()='No Data Found']")
	protected WebElement NoDataFoundText;
}
