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
	
	@FindBy(xpath="(//input[@id='108'])[1]/following-sibling::span")
	protected WebElement ClientBurialRadioBT;
	
	@FindBy(xpath="(//input[@id='108'])[2]/following-sibling::span")
	protected WebElement SpouseBurialRadioBT;
	 
	@FindBy(xpath="(//input[@id='109'])[1]/following-sibling::span")
	protected WebElement ClientCremationRadioBT;
	
	@FindBy(xpath="(//input[@id='109'])[2]/following-sibling::span")
	protected WebElement SpouseCremationRadioBT;

	@FindBy(xpath="//button[text()='Handling of remains']")
	protected WebElement HandlingOfRemains;
	
	@FindBy(xpath="(//input[@id='108'])[1]/following-sibling::span")
	protected WebElement ClientHowWillYouRemainsDisposed_BurrialRadioBT;
	
	@FindBy(xpath="(//input[@id='108'])[2]/following-sibling::span")
	protected WebElement SpouseHowWillYouRemainsDisposed_BurrialRadioBT;
	
	@FindBy(xpath="(//input[@id='109'])[1]/following-sibling::span")
	protected WebElement ClientHowWillYouRemainsDisposed_CremationRadioBT;
	
	@FindBy(xpath="(//input[@id='109'])[2]/following-sibling::span")
	protected WebElement SpouseHowWillYouRemainsDisposed_CremationRadioBT;
	
	@FindBy(xpath="(//input[@id='845'])[1]/following-sibling::span")
	protected WebElement ClientHowWillYouRemainsDisposed_DoNotKnowYet;
	
	@FindBy(xpath="(//input[@id='845'])[2]/following-sibling::span")
	protected WebElement SposueHowWillYouRemainsDisposed_DoNotKnowYet;
	
	@FindBy(xpath="(//input[@id='110'])[1]/following-sibling::span")
	protected WebElement ClientDoYouWishToHaveFuneralService_YesradioBt;
	
	@FindBy(xpath="(//input[@id='110'])[2]/following-sibling::span")
	protected WebElement SpouseDoYouWishToHaveFuneralService_YesradioBt;
	
	@FindBy(xpath="(//input[@id='111'])[1]/following-sibling::span")
	protected WebElement ClientDoYouWishToHaveFuneralService_NoRadioBt;
	
	@FindBy(xpath="(//input[@id='111'])[2]/following-sibling::span")
	protected WebElement SposueDoYouWishToHaveFuneralService_NoRadioBt;
	
	@FindBy(xpath="(//input[@id='290'])[1]/following-sibling::span")
	protected WebElement ClientDoYouWishToHaveFuneralService_DiscretionOfAgentRadioBt;
	
	@FindBy(xpath="(//input[@id='290'])[2]/following-sibling::span")
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
	
	@FindBy(xpath="(//input[@id='114'])[1]/following-sibling::span")
	protected WebElement ClientDoYouHaveBurialPlotOrNiche_YesRadioBT;
	
	@FindBy(xpath="(//input[@id='114'])[2]/following-sibling::span")
	protected WebElement SposueDoYouHaveBurialPlotOrNiche_YesRadioBT;
	
	@FindBy(xpath="(//input[@id='115'])[1]/following-sibling::span")
	protected WebElement ClientDoYouHaveBurialPlotOrNiche_NoRadioBT;
	
	@FindBy(xpath="(//input[@id='115'])[2]/following-sibling::span")
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
	
	@FindBy(xpath="(//input[@id='424'])[1]/following-sibling::span")
	protected WebElement ClientIsBurialCremationPrepaid;
	
	@FindBy(xpath="(//input[@id='424'])[2]/following-sibling::span")
	protected WebElement SposueIsBurialCremationPrepaid_YesRadioBT;
	
	@FindBy(xpath="(//input[@id='425'])[1]/following-sibling::span")
	protected WebElement ClientIsBurialCremationPrepaid_NoRadioBT;
	
	@FindBy(xpath="(//input[@id='425'])[2]/following-sibling::span")
	protected WebElement SposueIsBurialCremationPrepaid_NoRadioBT;
	
	@FindBy(xpath="//p[contains(text(),'Often the organization you prepaid')]")
	protected WebElement IsBurialCremationPrepaid_YesVerificationMessage;
	
	@FindBy(xpath="(//input[@id='426'])[1]/following-sibling::span")
	protected WebElement ClientOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt;
	
	@FindBy(xpath="(//input[@id='426'])[2]/following-sibling::span")
	protected WebElement SposueOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt;
	
	@FindBy(xpath="(//input[@id='427'])[1]/following-sibling::span")
	protected WebElement ClientOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT;
	
	@FindBy(xpath="(//input[@id='427'])[2]/following-sibling::span")
	protected WebElement SposueOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT;
	
    @FindBy(xpath="(//p[contains(text(),'Is there any plan associated with')])[1]")
    protected WebElement ClientIsThereAnyPlanAssositedText;
    
    @FindBy(xpath="(//p[contains(text(),'Is there any plan associated with')])[2]")
    protected WebElement SposueIsThereAnyPlanAssositedText;
    
    @FindBy(xpath="(//input[@id='438'])[1]/following-sibling::span")
    protected WebElement ClientIsThereAnyPlanAssosited_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='438'])[2]/following-sibling::span")
    protected WebElement SpouseIsThereAnyPlanAssosited_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='439'])[1]/following-sibling::span")
    protected WebElement ClientIsThereAnyPlanAssosited_NoRadioBT; 
    
    @FindBy(xpath="(//input[@id='439'])[2]/following-sibling::span")
    protected WebElement SposueIsThereAnyPlanAssosited_NoRadioBT; 
    
    @FindBy(xpath="(//p[text()='Did the company give you a contract?'])[1]")
    protected WebElement ClientOftenYouOrganizationYouPrepaidYourBurial_NoRadioBTVerificationText;
    
    @FindBy(xpath="(//p[text()='Did the company give you a contract?'])[2]")
    protected WebElement SposueOftenYouOrganizationYouPrepaidYourBurial_NoRadioBTVerificationText;
    
    @FindBy(xpath="(//input[@id='429'])[1]/following-sibling::span")
    protected WebElement ClientDidTheCompanyGiveYouContract_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='429'])[2]/following-sibling::span")
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
    
    @FindBy(xpath="(//p[text()='Did the company give you a contract?'])[1]/parent::div/following-sibling::div[@class='status-message-livingwill']")
    protected WebElement ClientDidTheCompanyGiveYouContact_NoRadioBTVerificationMessage;
    
    @FindBy(xpath="(//p[text()='Did the company give you a contract?'])[2]/parent::div/following-sibling::div[@class='status-message-livingwill']")
    protected WebElement SpouseDidTheCompanyGiveYouContact_NoRadioBTVerificationMessage;
    
    @FindBy(xpath="(//input[@id='430'])[1]/following-sibling::span")
    protected WebElement ClientDidTheCompanyGiveYouContract_NoRadioBT;
  
    @FindBy(xpath="(//input[@id='430'])[2]/following-sibling::span")
    protected WebElement SpouseDidTheCompanyGiveYouContract_NoRadioBT;
    
    @FindBy(xpath="(//input[@id='112'])[1]/following-sibling::span")
    protected WebElement ClientHaveYouMadeArrangement_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='112'])[2]/following-sibling::span")
    protected WebElement SpouseHaveYouMadeArrangement_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='113'])[1]/following-sibling::span")
    protected WebElement ClientHaveYouMadeArrangement_NoRadioBT;
    
    @FindBy(xpath="(//input[@id='113'])[2]/following-sibling::span")
    protected WebElement SpouseHaveYouMadeArrangement_NoRadioBT;
    
    @FindBy(xpath="(//input[@id='268'])[1]")
    protected WebElement ClientNameOFCemetryHome;
    
    @FindBy(xpath="(//input[@id='268'])[2]")
    protected WebElement SpouseNameOFCemetryHome;
    
    @FindBy(xpath="(//input[@id='nameOfCmp'])[1]")
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
     
    
    @FindBy(xpath="(//p[contains(text(),'Would you like to have someone')])[1]")
    protected WebElement ClientWouldYouLikeMakeArragement_YesRadioBTVerificationMessage; 
    
    @FindBy(xpath="(//p[contains(text(),'Would you like to have someone')])[2]")
    protected WebElement SpouseWouldYouLikeMakeArragement_YesRadioBTVerificationMessage; 
    
    @FindBy(xpath="(//input[@id='434'])[1]/following-sibling::span")
    protected WebElement CLientWouldYouLikeToMakeArrangementNoRadioBT;
    
    @FindBy(xpath="(//input[@id='434'])[2]/following-sibling::span")
    protected WebElement SpouseWouldYouLikeToMakeArrangementNoRadioBT;
    
    @FindBy(xpath="//p[contains(text(),'We strongly suggest you take')]")
    protected WebElement ClientWouldYouLikeToMakeArrangment_NoRadioBTMessage;
    
    @FindBy(xpath="(//p[contains(text(),'We strongly suggest you take')])[2]")
    protected WebElement SpouseWouldYouLikeToMakeArrangment_NoRadioBTMessage;
    
    @FindBy(xpath="(//input[@id='433'])[1]/following-sibling::span")
    protected WebElement ClientWouldYouLikeToMakeArrangementYesRadioBt; 
    
    @FindBy(xpath="(//input[@id='433'])[2]/following-sibling::span")
    protected WebElement SpouseWouldYouLikeToMakeArrangementYesRadioBt; 
    
    @FindBy(xpath="(//input[@id='435'])[1]/following-sibling::span")
    protected WebElement ClientWouldYouLikeToHaveSomeOneToContact_YesRadioBT;
    
    @FindBy(xpath="(//input[@id='435'])[2]/following-sibling::span")
    protected WebElement SpouseWouldYouLikeToHaveSomeOneToContact_YesRadioBT;
    
    @FindBy(xpath="(//div[text()='We will get someone to call you'])[1]")
    protected WebElement  ClientWouldYouLikeToHaveSomoneToContact_YesVerificationMessage;
    
    @FindBy(xpath="(//div[text()='We will get someone to call you'])[2]")
    protected WebElement  SpouseWouldYouLikeToHaveSomoneToContact_YesVerificationMessage;
    
    @FindBy(xpath="(//input[@id='436'])[1]/following-sibling::span")
    protected WebElement ClientWouldYouLikeToHaveContactSomeone_NoRadioBT;
    
    @FindBy(xpath="(//input[@id='436'])[2]/following-sibling::span")
    protected WebElement SpouseWouldYouLikeToHaveContactSomeone_NoRadioBT;
    
    @FindBy(xpath="(//p[contains(text(),'We strongly suggest you take the initiative and get this')])[1]")
    protected WebElement ClientWouldYouLikeToHaveSomeoneNoRadioBT_VerificationMessage;
    
    @FindBy(xpath="(//p[contains(text(),'We strongly suggest you take the initiative and get this')])[2]")
    protected WebElement SpouseWouldYouLikeToHaveSomeoneNoRadioBT_VerificationMessage;
    
    @FindBy(xpath="//button[text()='Save & Continue later']")
    protected WebElement SaveAndContinueBT;
    
    @FindBy(xpath="//button[text()='Next : Legal Professionals']")
    protected WebElement NextLegalProfessional;
    
    @FindBy(xpath="//img[@alt='accordion']")
    protected WebElement Accordian;
    
    @FindBy(xpath="//button[text()='Burial / Cremation plan']")
    protected WebElement BurialCremationAccordian;
    
    @FindBy(xpath="//button[text()='Cemetery arrangement']")
    protected WebElement CemetryArrangementAccordian;
    
    @FindBy(xpath="//button[text()='Handling of remains']")
    protected WebElement HandlingOfRemainsAccordian;
    
    @FindBy(xpath="(//span[text()='Finance'])[1]")
    protected WebElement FinanceButtonUnderSetup;
    
    @FindBy(xpath="//span[text()='Life Insurance']")
    protected WebElement LifeInsuranceDrawer;
    
    @FindBy(xpath="//button[text()='Add Policy']")
    protected WebElement AddButton;
    
    @FindBy(xpath="//input[@type='checkbox']")
    protected WebElement SameAsSpouseCheckBox;
    
    @FindBy(xpath="(//input[@id='nameOfInsuranceCmp'])[1]")
    protected WebElement ClientIsThereAnyPlanAssociated_InsuranceCompanyName;
    
    @FindBy(xpath="(//input[@id='nameOfInsuranceCmp'])[2]")
    protected WebElement SpouseIsThereAnyPlanAssociated_InsuranceCompanyName;
    
    @FindBy(xpath="(//input[@id='policyNo'])[1]")
    protected WebElement ClientIsThereAnyPlanAssociated_ContractNumber;
    
    @FindBy(xpath="(//input[@id='policyNo'])[2]")
    protected WebElement SpouseIsThereAnyPlanAssociated_ContractNumber;
    
    @FindBy(xpath="(//img[@alt='Calendar Icon'])[1]")
    protected WebElement ClientIsThereAnyPlanAssociatedCalenderdicon;
    
    @FindBy(xpath="(//img[@alt='Calendar Icon'])[2]")
    protected WebElement SpouseIsThereAnyPlanAssociatedCalenderdicon;
    
   @FindBy(xpath="(//div[text()='3'])[1]")
   protected WebElement ClientIsthereAnyPlanAssociated_date;
   
   @FindBy(xpath="(//div[text()='4'])[2]")
   protected WebElement SpouseIsthereAnyPlanAssociated_date;
   
   @FindBy(xpath="(//input[@id='contactNo'])[1]")
   protected WebElement ClientIsthereAnyPlanAssociated_ContactNumber;
   
   @FindBy(xpath="(//input[@id='contactNo'])[1]")
   protected WebElement SpouseIsthereAnyPlanAssociated_ContactNumber;
   
   @FindBy(xpath="(//textarea[@Placeholder='Address'])[2]")
   protected WebElement ClientIsthereAnyPlanAssociated_Address;
   
   @FindBy(xpath="(//textarea[@Placeholder='Address'])[4]")
   protected WebElement SpouseIsthereAnyPlanAssociated_Address;
   
   @FindBy(xpath="(//input[@id='website'])[1]")
   protected WebElement ClientIsthereAnyPlanAssociated_Website;
   
   @FindBy(xpath="(//input[@id='website'])[2]")
   protected WebElement SpouseIsthereAnyPlanAssociated_Website;
    
}
