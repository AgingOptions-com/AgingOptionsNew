package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class BurialCremationPlanPageOr {

	public BurialCremationPlanPageOr(WebUtil wt) {
	PageFactory.initElements(wt.getDriver(), this);
	}
	
	@FindBy(xpath="//span[text()='Burial Cremation Plan']")
	protected WebElement BurialCremationPlanDrawer;
	
	@FindBy(xpath="//button[text()='Handling of remains']")
	protected WebElement HandlingOfRemains;
	
	@FindBy(xpath="(//input[@id='108'])[1]")
	protected WebElement ClientHowWillYouRemainsDisposed_BurrialRadioBT;
	
	@FindBy(xpath="(//input[@id='108'])[2]")
	protected WebElement SpouseHowWillYouRemainsDisposed_BurrialRadioBT;
	
	@FindBy(xpath="(//input[@id='109'])[1]")
	protected WebElement ClientHowWillYouRemainsDisposed_CremationRadioBT;
	
	@FindBy(xpath="(//input[@id='109'])[2]")
	protected WebElement SpouseHowWillYouRemainsDisposed_CremationRadioBT;
	
	@FindBy(xpath="(//input[@id='845'])[1]")
	protected WebElement ClientHowWillYouRemainsDisposed_DoNotKnowYet;
	
	@FindBy(xpath="(//input[@id='845'])[2]")
	protected WebElement SposueHowWillYouRemainsDisposed_DoNotKnowYet;
	
	@FindBy(xpath="(//input[@id='110'])[1]")
	protected WebElement ClientDoYouWishToHaveFuneralService_YesradioBt;
	
	@FindBy(xpath="(//input[@id='110'])[2]")
	protected WebElement SpouseDoYouWishToHaveFuneralService_YesradioBt;
	
	@FindBy(xpath="(//input[@id='111'])[1]")
	protected WebElement ClientDoYouWishToHaveFuneralService_NoRadioBt;
	
	@FindBy(xpath="(//input[@id='111'])[2]")
	protected WebElement SposueDoYouWishToHaveFuneralService_NoRadioBt;
	
	@FindBy(xpath="(//input[@id='290'])[1]")
	protected WebElement ClientDoYouWishToHaveFuneralService_DiscretionOfAgentRadioBt;
	
	@FindBy(xpath="(//input[@id='290'])[2]")
	protected WebElement SposueDoYouWishToHaveFuneralService_DiscretionOfAgentRadioBt;
	
	@FindBy(xpath="//button[text()='Burial / Cremation plan']")
	protected WebElement BurrialCremationPlanBT;
	
	@FindBy(xpath="(//p[text()='What do you want to do with the ashes ?'])[1]")
	protected WebElement ClientWhatDoYouWantDoWithAshesText;
	
	@FindBy(xpath="(//p[text()='What do you want to do with the ashes ?'])[2]")
	protected WebElement SposueWhatDoYouWantDoWithAshesText;
	
	@FindBy(xpath="(//textarea[@id='291'])[1]")
	protected WebElement ClientWhatDoYouWantDoWithAshesCommentBox;
	
	@FindBy(xpath="(//textarea[@id='291'])[2]")
	protected WebElement SposueWhatDoYouWantDoWithAshesCommentBox;
	
	@FindBy(xpath="(//input[@id='114'])[1]")
	protected WebElement ClientDoYouHaveBurialPlotOrNiche_YesRadioBT;
	
	@FindBy(xpath="(//input[@id='114'])[2]")
	protected WebElement SposueDoYouHaveBurialPlotOrNiche_YesRadioBT;
	
	@FindBy(xpath="(//input[@id='115'])[1]")
	protected WebElement ClientDoYouHaveBurialPlotOrNiche_NoRadioBT;
	
	@FindBy(xpath="(//input[@id='115'])[2]")
	protected WebElement SposueDoYouHaveBurialPlotOrNiche_NoRadioBT;
	
	@FindBy(xpath="(//p[text()='Name of Contact'])[1]")
	protected WebElement clientNameOfContactText;
	
	@FindBy(xpath="(//p[text()='Name of Contact'])[2]")
	protected WebElement SposueNameOfContactText;
	
	@FindBy(xpath="(//input[@id='267'])[1]")
	protected WebElement ClientNameOfContactTB;
	
	@FindBy(xpath="(//input[@id='267'])[2]")
	protected WebElement SposueNameOfContactTB;
	
	@FindBy(xpath="(//input[@id='268'])[1]")
	protected WebElement ClientNameOfCemetryHome;
	
	@FindBy(xpath="(//input[@id='268'])[2]")
	protected WebElement SposueNameOfCemetryHome;
	
	@FindBy(xpath="(//input[@id='269'])[1]")
	protected WebElement ClientContactNumber;
	
	@FindBy(xpath="(//input[@id='269'])[2]")
	protected WebElement SposueContactNumber;
	
	@FindBy(xpath="(//input[@id='270'])[1]")
	protected WebElement ClientPhoneNumber;
	
	@FindBy(xpath="(//input[@id='270'])[2]")
	protected WebElement SposuePhoneNumber;
	
	@FindBy(xpath="//textarea[@tabindex='14']")
	protected WebElement ClientAddress;
	
	@FindBy(xpath="//textarea[@tabindex='31']")
	protected WebElement SposueAddress;
	
	@FindBy(xpath="(//input[@id='272'])[1]")
	protected WebElement ClientWebSite;
	
	@FindBy(xpath="(//input[@id='272'])[2]")
	protected WebElement SposueWebSite;
	
	@FindBy(xpath="(//input[@id='273'])[1]")
	protected WebElement ClientFaxNumber;
	
	@FindBy(xpath="(//input[@id='273'])[2]")
	protected WebElement SposueFaxNumber;
	
	@FindBy(xpath="(//textarea[@id='441'])[1]")
	protected WebElement ClientDescription;
	
	@FindBy(xpath="(//textarea[@id='441'])[2]")
	protected WebElement SposueDescription;	
	
	@FindBy(xpath="//span[contains(text(),'We strongly suggest you take the initiative and get this detail addressed. It will go a long way to ensure')]")
	protected WebElement ClientDoYouHaveBurialPlotNo_Message; 
	
	@FindBy(xpath="(//input[@id='424'])[1]")
	protected WebElement ClientIsBurialCremationPrepaid;
	
	@FindBy(xpath="(//input[@id='424'])[2]")
	protected WebElement SposueIsBurialCremationPrepaid_YesRadioBT;
	
	@FindBy(xpath="(//input[@id='425'])[1]")
	protected WebElement ClientIsBurialCremationPrepaid_NoRadioBT;
	
	@FindBy(xpath="(//input[@id='425'])[2]")
	protected WebElement SposueIsBurialCremationPrepaid_NoRadioBT;
	
	@FindBy(xpath="//p[contains(text(),'Often the organization you prepaid')]")
	protected WebElement IsBurialCremationPrepaid_YesVerificationMessage;
	
	@FindBy(xpath="(//input[@id='426'])[1]")
	protected WebElement ClientOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt;
	
	@FindBy(xpath="(//input[@id='426'])[2]")
	protected WebElement SposueOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt;
	
	@FindBy(xpath="(//input[@id='427'])[1]")
	protected WebElement ClientOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT;
	
	@FindBy(xpath="(//input[@id='427'])[2]")
	protected WebElement SposueOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT;
	
    @FindBy(xpath="(//p[contains(text(),'Is there any plan associated with')])[1]")
    protected WebElement ClientIsThereAnyPlanAssositedText;
    
    @FindBy(xpath="(//p[contains(text(),'Is there any plan associated with')])[2]")
    protected WebElement SposueIsThereAnyPlanAssositedText;
    
    @FindBy(xpath="(//input[@id='438'])[1]")
    protected WebElement ClientIsThereAnyPlanAssosited_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='438'])[2]")
    protected WebElement SpouseIsThereAnyPlanAssosited_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='439'])[1]")
    protected WebElement ClientIsThereAnyPlanAssosited_NoRadioBT; 
    
    @FindBy(xpath="(//input[@id='439'])[2]")
    protected WebElement SposueIsThereAnyPlanAssosited_NoRadioBT; 
    
    @FindBy(xpath="(//p[text()='Did the company give you a contract?'])[1]")
    protected WebElement ClientOftenYouOrganizationYouPrepaidYourBurial_NoRadioBTVerificationText;
    
    @FindBy(xpath="(//p[text()='Did the company give you a contract?'])[2]")
    protected WebElement SposueOftenYouOrganizationYouPrepaidYourBurial_NoRadioBTVerificationText;
    
    @FindBy(xpath="(//input[@id='429'])[1]")
    protected WebElement ClientDidTheCompanyGiveYouContract_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='429'])[2]")
    protected WebElement SposueDidTheCompanyGiveYouContract_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='nameOfContact'])[1]")
    protected WebElement ClientDidTheCompanyGiveYouContract_ContactName;
    
    @FindBy(xpath="(//input[@id='nameOfContact'])[2]")
    protected WebElement SposueDidTheCompanyGiveYouContract_ContactName;
    
    @FindBy(xpath="(//input[@id='nameOfCmp'])[1]")
    protected WebElement ClientDidTheCompanyGiveYouContract_NameOfCompany;
    
    @FindBy(xpath="(//input[@id='nameOfCmp'])[2]")
    protected WebElement SpouseDidTheCompanyGiveYouContract_NameOfCompany;
    
    @FindBy(xpath="(//input[@id='contactNo'])[1]")
    protected WebElement ClientDidTheCompanyGiveYouContract_ConatctNumber;
    
    
    @FindBy(xpath="(//input[@id='contactNo'])[2]")
    protected WebElement SpouseDidTheCompanyGiveYouContract_ConatctNumber; 
    
    
    @FindBy(xpath="(//input[@id='cellNo'])[1]")
    protected WebElement ClientDidTheCompanyGiveYouContract_CellNumber; 
    
    @FindBy(xpath="(//input[@id='cellNo'])[2]")
    protected WebElement SpouseDidTheCompanyGiveYouContract_CellNumber; 
    
    @FindBy(xpath="//textarea[@tabindex='23']")
    protected WebElement ClientDidTheCompanyGiveYouContract_address; 
    
    @FindBy(xpath="//textarea[@tabindex='40']")
    protected WebElement SpouseDidTheCompanyGiveYouContract_address; 
    
    @FindBy(xpath="(//input[@id='website'])[1]")
    protected WebElement ClientDidTheCompanyGiveYouContract_Website; 
    
    @FindBy(xpath="(//input[@id='website'])[2]")
    protected WebElement SpouseDidTheCompanyGiveYouContract_Website; 
    
    @FindBy(xpath="(//div[contains(text(),'You may want to ask')])[1]")
    protected WebElement ClientDidTheCompanyGiveYouContact_NoRadioBTVerificationMessage;
    
    @FindBy(xpath="(//div[contains(text(),'You may want to ask')])[2]")
    protected WebElement SpouseDidTheCompanyGiveYouContact_NoRadioBTVerificationMessage;
  
    @FindBy(xpath="(//input[@id='112'])[1]")
    protected WebElement ClientHaveYouMadeArrangement_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='112'])[2]")
    protected WebElement SpouseHaveYouMadeArrangement_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='nameOfCmp'])[2]")
    protected WebElement clientNameOfCemetry;
    
    @FindBy(xpath="(//input[@id='nameOfCmp'])[3]")
    protected WebElement SpouseNameOfCemetry;
    
    @FindBy(xpath="(//input[@id='plotNo'])[1]")
    protected WebElement ClientPlotNumber;
    
    @FindBy(xpath="(//input[@id='plotNo'])[2]")
    protected WebElement SpousePlotNumber;
    
    @FindBy(xpath="(//input[@id='faxNo'])[1]")
    protected WebElement ClientCemetryFaxNumber;
    
    @FindBy(xpath="(//input[@id='faxNo'])[2]")
    protected WebElement SpouseCemetryFaxNumber;
    
    @FindBy(xpath="(//p[text()='Would you like to make arrangements ?'])[1]")
    protected WebElement ClientHaveYouMadeArrangementHandlingOfRemains_NoRadioBtVerificationMsg;
    
    @FindBy(xpath="(//p[text()='Would you like to make arrangements ?'])[2]")
    protected WebElement SpouseHaveYouMadeArrangementHandlingOfRemains_NoRadioBtVerificationMsg;
    
    @FindBy(xpath="//input[@id='433']")
    protected WebElement SpouseWouldYouLikeToMakeArrangement_YesRadioBt;
    
    @FindBy(xpath="(//p[text()='Would you like to make arrangements ?']/parent::div//input)[1]")
    protected WebElement ClientWouldYouLikeMakeArragement_YesRadioBT; 
    
    @FindBy(xpath="(//p[contains(text(),'Would you like to have someone')])[1]")
    protected WebElement ClientWouldYouLikeMakeArragement_YesRadioBTVerificationMessage; 
    
    @FindBy(xpath="(//p[contains(text(),'Would you like to have someone')])[2]")
    protected WebElement SpouseWouldYouLikeMakeArragement_YesRadioBTVerificationMessage; 
    
    @FindBy(xpath="//p[contains(text(),'We strongly suggest you take')]")
    protected WebElement ClientWouldYouLikeToMakeArrangment_NoRadioBTMessage;
    
    @FindBy(xpath="(//p[contains(text(),'We strongly suggest you take')])[2]")
    protected WebElement SpouseWouldYouLikeToMakeArrangment_NoRadioBTMessage;
    
    @FindBy(xpath="(//input[@id='434'])[1]")
    protected WebElement ClientWouldYouLikeToMakeArrangementYesRadioBt; 
    
    @FindBy(xpath="(//input[@id='434'])[2]")
    protected WebElement SpouseWouldYouLikeToMakeArrangementYesRadioBt; 
    
    @FindBy(xpath="//button[text()='Save & Continue later']")
    protected WebElement SaveAndContinueBT;
    
    @FindBy(xpath="//button[text()='Next : Legal Professionals']")
    protected WebElement NextLegalProfessional;
    
    @FindBy(xpath="//img[@alt='accordion']")
    protected WebElement Accordian;
    
}
