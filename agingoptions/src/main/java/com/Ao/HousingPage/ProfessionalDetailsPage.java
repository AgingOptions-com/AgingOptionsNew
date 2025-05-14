package com.Ao.HousingPage;

import java.time.Duration;


import com.nspl.agingoptions.webUtil.WebUtil;

public class ProfessionalDetailsPage extends ProfessionalDetailspageOr {
	public WebUtil wt;
	public ProfessionalDetailsPage(WebUtil util) {
		super(util);
		this.wt=util;

	}

	public void Addaddress() {
		wt.sendValue(AddressLine1, "34 St - Herald Sq", "Address Line One");
		wt.sendValue(city, "New York", "city");
		wt.sendValue(State, "New York", "State");
		wt.sendValue(Zipcode, "10001", "ZipCode");
	}
	public void verifyClient() {
		wt.waitUntilPresentInUI(highlightedtoggleButton, "Highlighted toggle button");
		String text =wt.getInnerText(highlightedtoggleButton);
		wt.print("we are going to fill detail for " + text);

	}
	public void GoToClickMortgageSecton() {
		wt.click(MortgageBrokerSection , "Mortgage Broker Secton");
	}
	public void verifyLegalPage() {
		wt.verifyInnerText(LegalInfoInnerText, " Legal information", "Legal Information");
	}

	public void GoToClickHandyManSection() {
		wt.click(handyManSection, "Handyan button");
	}
	public void verifyFamilyLawAttorneyPage() {
		wt.verifyInnerText(FamilyLawAttorneyText, "Family Law Attorney", "Family Law Attorney text");
	}
	public void verifyBusinessSuccessiorPage() {
		wt.verifyInnerText(businessSuccessior,"Business Successors", "Business successior");
	}
	
	public void VerifyMyServiceProvider() {
		wt.verifyInnerText(Myserviceprovider, "My service provider", "My service provider page");
	}
	public void GoToClickEditIcon() {
		wt.waitUntilPresentInUI(Editicon, "edit icon");
		wt.click(Editicon, "Edit Icon");
	}
	public void verifyMortgageBroker() {
		wt.verifyInnerText(mortgageBrokerinnerText, "Mortgage Brokers", "Mortgage broker innertext");
	}
    
	public void VerifyLandScapperPage() {
		wt.verifyInnerText(LandscapperPageInnerText, "Landscaper", "LandScapper text");
	}
	public void  goToClickAddRealtorButton() {
		wt.click(AddRealtorButton, "Add Professional button"); 
	}
	public void VerifyHandymanProfessional() {
		wt.verifyInnerText(Handymaninnertext, "Handyman Services", "Handyman Services innertext"); 
	}

	public String verifyAddedprofessionalCountInTable() {
		String text=wt.getInnerText(ProfessionalCount);
		return text;
	}
	public String randomName() {
		String randomName =wt.getRandomText(5);
		return randomName;
	}
	public void GotoClickSpouseToggleButton() {
		wt.click(SpousetoggleButton, "Spouse toggle button");
	}
	public void GoTOClickPrimaryMemberToggleButton() {
		wt.click(primaryMemberToggleButton, "Primary member toggle button");
	}
	public void gotoClickRealtorSecton() {
		wt.click(RealtorIcon,"Realtor Secton");
	}

	public void GoToClickCopySameDataSpouseCheckBox() {
		wt.click(samedataToSpouseCheckBox, "Same data to spouse checkbox");
	}
	
	public void VerifyElderLawAttorneypage() {
		wt.verifyInnerText(ElderatorneyText, "Elder Attorneys ", "Elder Attorneys  text");
	}

	public void addProfessionalForPrimaryMember() {
		verifyClient();
	  String ClientMortgageCount=	verifyAddedprofessionalCountInTable();
	  wt.click(SpousetoggleButton, "Spouse toggle button");
	  wt.holdOn(Duration.ofSeconds(3));
		verifyClient();
		  String spouseMortgageCount=	verifyAddedprofessionalCountInTable();
		  wt.holdOn(Duration.ofSeconds(2));
		  wt.click(primaryMemberToggleButton, "Primary member toggle button");
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(7));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		wt.verifyElementRadioButtonSelected(samedataToSpouseCheckBox, "Same data to spouse check box");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndContinueButton, "save and continue button");
		wt.holdOn(Duration.ofSeconds(8));
		String AfteraddedmortgageCountForClient=verifyAddedprofessionalCountInTable();
		  wt.click(SpousetoggleButton, "Spouse toggle button");
		  wt.holdOn(Duration.ofSeconds(4));
	   String AfteraddSpouseMortgageCount=	   verifyAddedprofessionalCountInTable();
	   wt.printDataInReport("Before save the details Client mortgage count -" + ClientMortgageCount);
	   wt.printDataInReport("Before save the details Spouse mortgage count -" + spouseMortgageCount);
	   wt.printDataInReport("After save the details Client mortgage count -" + AfteraddedmortgageCountForClient);
	   wt.printDataInReport("After save the details Spouse mortgage count -" + AfteraddSpouseMortgageCount);


	}
	public void SaveAndAddAnotherprimaryMemberProfessionalDetails() {
		verifyClient();
		String ClientMortgageCount=verifyAddedprofessionalCountInTable();
		 wt.click(SpousetoggleButton, "Spouse toggle button");
		  wt.holdOn(Duration.ofSeconds(3));
			verifyClient();
		String spouseMortgageCount=	verifyAddedprofessionalCountInTable();
		 wt.holdOn(Duration.ofSeconds(2));
	  wt.click(primaryMemberToggleButton, "Primary member toggle button");
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.holdOn(Duration.ofSeconds(2));
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndAddAnotherButton, "save and add another");
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(PreviousIcon, "Previous icon");
		wt.holdOn(Duration.ofSeconds(9));
		String AfterSaveClientMortgageCount=verifyAddedprofessionalCountInTable();
		 wt.click(SpousetoggleButton, "Spouse toggle button");
		  wt.holdOn(Duration.ofSeconds(4));
	   String AfteraddSpouseMortgageCount=	   verifyAddedprofessionalCountInTable();
	   wt.printDataInReport("Before save the details Client mortgage count -" + ClientMortgageCount);
	   wt.printDataInReport("Before save the details Spouse mortgage count -" + spouseMortgageCount);
	   wt.printDataInReport("After save the details Client mortgage count -" + AfterSaveClientMortgageCount);
	   wt.printDataInReport("After save the details Spouse mortgage count -" + AfteraddSpouseMortgageCount);
	}
	public void gotoClickMortggeSection() {
		wt.click(MortgageBrokerSection, "Mortgage Broker Section");
	}

	public void  saveAndProceedPrimaryMemberProfessionalDetail() { 
		wt.click(primaryMemberToggleButton, "Primary member toggle button");
		verifyClient();
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(primaryContactOptions, "primary Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndProceedTo, "save and proceed to");
		
		
	}
	public void saveAndContinueProfessionalDetailsForSpouse() {
		verifyClient();
		String clientMortgageCount=verifyAddedprofessionalCountInTable();
		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient();
		String SpouseClient=verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		wt.verifyElementRadioButtonSelected(samedataToSpouseCheckBox, "Same data to spouse Check box");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndContinueButton, "save and continue button");
		wt.holdOn(Duration.ofSeconds(8));
		String SpouseCountAfterAddDetails=verifyAddedprofessionalCountInTable(); 
		wt.click(primaryMemberToggleButton, "primary member toggle button");
		wt.holdOn(Duration.ofSeconds(3));
		String ClientCountAfterAddDetails=verifyAddedprofessionalCountInTable();
		 wt.printDataInReport("Before save the details Client Professional count -" + clientMortgageCount);
		   wt.printDataInReport("Before save the details Spouse Professional count -" + SpouseClient);
		   wt.printDataInReport("After save the details Client Professional count -" + SpouseCountAfterAddDetails);
		   wt.printDataInReport("After save the details Spouse professional count -" + ClientCountAfterAddDetails );
		
	}
	public void VerifyFinancePage() {
		wt.verifyInnerText(FinancialInfoPageText, " Financial information", "Financial page text");	
	}
	public void SaveAndAddAnotherSpouseProfessionalDetails() {

		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient();
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndAddAnotherButton, "save and add another");
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(PreviousIcon, "Previous icon");
		wt.holdOn(Duration.ofSeconds(9));
		verifyAddedprofessionalCountInTable();
	}

	public void SaveAndProceedSpouseProfessionalDetails() {
		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient(); 
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndProceedTo, "save and proceed to");
		wt.holdOn(Duration.ofSeconds(8));
		verifyMortgageBroker();
		gotoClickRealtorSecton();
		wt.holdOn(Duration.ofSeconds(3));
		wt.click(SpousetoggleButton, "Spouse toggle button");
		wt.holdOn(Duration.ofSeconds(3));
		verifyAddedprofessionalCountInTable();
	}
	public void SaveAndProceedSpouseMortgageDetails() {
		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient(); 
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndProceedTo, "save and proceed to");
		wt.holdOn(Duration.ofSeconds(8));
		VerifyHandymanProfessional();
		gotoClickMortggeSection();
		wt.holdOn(Duration.ofSeconds(3));
		wt.click(SpousetoggleButton, "Spouse toggle button");
		wt.holdOn(Duration.ofSeconds(3));
		verifyAddedprofessionalCountInTable();

	}
	public void SaveAndProceedSpouseHandyManDetails() {
		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient(); 
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndProceedTo, "save and proceed to");
		wt.holdOn(Duration.ofSeconds(8));
		wt.verifyInnerText(LandscapperPageInnerText, "Landscaper", "LandScapper page");
		wt.click(HousingButtonUnderSetup, "Housing Button under setUp");
		wt.holdOn(Duration.ofSeconds(6));
		wt.click(HousoingProfessionalsecton, "Housing professional");
		wt.holdOn(Duration.ofSeconds(3));
		GoToClickHandyManSection();
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(SpousetoggleButton, "Spouse toggle button");
		wt.holdOn(Duration.ofSeconds(3));
		verifyAddedprofessionalCountInTable();

	}
	public void saveAndProceedSpouseELADetails() {
		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient(); 
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndProceedTo, "save and proceed to");
		wt.holdOn(Duration.ofSeconds(8));
		verifyFamilyLawAttorneyPage();
		wt.click(ElderLawAttorneyDrawer, "Elder law attorney drawer");
		wt.holdOn(Duration.ofSeconds(6));
		wt.click(SpousetoggleButton, "Spouse toggle button");
		wt.holdOn(Duration.ofSeconds(3));
		verifyAddedprofessionalCountInTable();
	}
	public void saveAndProceedSpouseFamilyLawAttorneyDetails() {
		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient(); 
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndProceedTo, "save and proceed to");
		wt.holdOn(Duration.ofSeconds(8));
		verifyBusinessSuccessiorPage();
		wt.click(familyLawAttorneyDrawer, "family law attorney drawer");
		wt.holdOn(Duration.ofSeconds(6));
		wt.click(SpousetoggleButton, "Spouse toggle button");
		wt.holdOn(Duration.ofSeconds(3));
		verifyAddedprofessionalCountInTable();
	}
	public void GotoClickLegalSectonUnderSetUpPage() {
		wt.click(LegalUnderSetUpPage, "Legal under SetUp page");
	}
	
	public void saveAndProceedSpouseBusinessSuccessiorDetails() {
		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient(); 
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndProceedTo, "save and proceed to");
		wt.holdOn(Duration.ofSeconds(8));
		VerifyMyServiceProvider();
		wt.click(LegalUnderSetUpPage, "Legal Button under setuppage");
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(LegalProfessionalDrawer, "Legal professional drawer");
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(businessSuccessiorDrawer, "Business successior drawer");
		wt.click(SpousetoggleButton, "Spouse toggle button");
		wt.holdOn(Duration.ofSeconds(3));
		verifyAddedprofessionalCountInTable();
	}
	public void SaveAndProceedSpouseLandScapperDetails() {
		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient(); 
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndProceedTo, "save and proceed to");
		wt.holdOn(Duration.ofSeconds(8));
		VerifyFinancePage();
		wt.click(HousingButtonUnderSetup, "Housing Button under setUp");
		wt.holdOn(Duration.ofSeconds(6));
		wt.click(HousoingProfessionalsecton, "Housing professional");
		wt.holdOn(Duration.ofSeconds(3));
		wt.click(landScapperDrawer, "Landscapper drawer");
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(SpousetoggleButton, "Spouse toggle button");
		wt.holdOn(Duration.ofSeconds(3));
		verifyAddedprofessionalCountInTable();
	}
	public void copysamedataToSpouseProfessionalDetails() {


		verifyClient();
		String previousClientProfessionalCount=verifyAddedprofessionalCountInTable();
		GotoClickSpouseToggleButton();
		wt.holdOn(Duration.ofSeconds(3));
		verifyClient();
		String previousSpouseProfessionalCount=verifyAddedprofessionalCountInTable();
		wt.holdOn(Duration.ofSeconds(3));
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		GoToClickCopySameDataSpouseCheckBox();
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(PhoneNumber, "phonenumber");
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndContinueButton, "save and continue button");
		wt.holdOn(Duration.ofSeconds(8));
		String SpouseNewProfessionalCount=verifyAddedprofessionalCountInTable();
		wt.holdOn(Duration.ofSeconds(2));
		GoTOClickPrimaryMemberToggleButton();
		wt.holdOn(Duration.ofSeconds(5));
		String clientNewProfessionalCount=	verifyAddedprofessionalCountInTable();
		wt.holdOn(Duration.ofSeconds(5));
		wt.print("Spouse previous realtor count- " + previousSpouseProfessionalCount);
		wt.print("Spouse New realtor count- " + SpouseNewProfessionalCount);
		wt.print("Primary Member previous realtor count- " + previousClientProfessionalCount);
		wt.print("Spouse New realtor count- " + clientNewProfessionalCount);


	}

	public void UpdateProfessionalDetails() {
		verifyClient();
		verifyAddedprofessionalCountInTable();
		goToClickAddRealtorButton();
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(Accordian, "Accordian");
		wt.click(Accordian, "Accordian");
		String name=randomName();
		wt.sendValue(FirstName, name, "FirstName");
		String lastname=randomName();
		wt.sendValue(LastName, lastname, "LastName");
		wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
		wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
		wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
		wt.holdOn(Duration.ofSeconds(3));
		wt.verifyAttributeValue(CountryRegionField, "United States", "value");
		wt.holdOn(Duration.ofSeconds(4));
		Addaddress();
		wt.click(contactTypeDropdown, "Contact type DropDown");
		wt.click(OtherOptions, "Other Option on contact ");
		wt.holdOn(Duration.ofSeconds(3));
		wt.sendValue(OthertypeTextBox, name, "Other Type text box");
		wt.holdOn(Duration.ofSeconds(5));
		wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
		wt.sendValue(Email, name+"@yopmail.com", "email");
		wt.click(SaveAndContinueButton, "save and continue button");
		wt.holdOn(Duration.ofSeconds(10));
		wt.clearTextBox(SearchBar);
		wt.sendValueWithEnter(SearchBar, name, "Name");
		wt.holdOn(Duration.ofSeconds(3));
		GoToClickEditIcon();
		wt.holdOn(Duration.ofSeconds(6));
		wt.click(FirstName, "Firstname");
		String updatedName="test345";
		FirstName.clear();
		wt.holdOn(Duration.ofSeconds(4));
		wt.sendValue(FirstName, updatedName, "First name");
		wt.holdOn(Duration.ofSeconds(3));
		wt.click(UpdateButton, "Update button");
		wt.holdOn(Duration.ofSeconds(8));
		wt.clearTextBox(SearchBar);
		wt.sendValueWithEnter(SearchBar, updatedName, "Name");
		GoToClickEditIcon();
		wt.holdOn(Duration.ofSeconds(5));
		String value=  wt.GetAttributevalue(FirstName, "value");
		wt.verifyActualExpectedTextContains(value, updatedName, "First name");
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(UpdateButton, "Update button");	

	}
	
	public void VerifyClientProfessionalDetailsWithUncheckCopySamedataTospouseCheckBox() {
		verifyClient();
		  String ClientMortgageCount=	verifyAddedprofessionalCountInTable();
		  wt.click(SpousetoggleButton, "Spouse toggle button");
		  wt.holdOn(Duration.ofSeconds(3));
			verifyClient();
			  String spouseMortgageCount=	verifyAddedprofessionalCountInTable();
			  wt.holdOn(Duration.ofSeconds(2));
			  wt.click(primaryMemberToggleButton, "Primary member toggle button");
			goToClickAddRealtorButton();
			wt.holdOn(Duration.ofSeconds(7));
			wt.click(Accordian, "Accordian");
			wt.click(Accordian, "Accordian");
			wt.verifyElementRadioButtonSelected(samedataToSpouseCheckBox, "Same data to spouse check box");
			wt.click(samedataToSpouseCheckBox, "Same data to spouse check box");
			String name=randomName();
			wt.sendValue(FirstName, name, "FirstName");
			String lastname=randomName();
			wt.sendValue(LastName, lastname, "LastName");
			wt.sendValue(BusinessName, name +" pvt ltd ", "Business name");
			wt.sendValue(WebSiteLink, "Ac.com", "WebSite Name");
			wt.sendValue(NoteForAgent, "Not any note for agent", "Notes for Agent");
			wt.holdOn(Duration.ofSeconds(3));
			wt.verifyAttributeValue(CountryRegionField, "United States", "value");
			wt.holdOn(Duration.ofSeconds(4));
			Addaddress();
			wt.click(contactTypeDropdown, "Contact type DropDown");
			wt.click(OtherOptions, "Other Option on contact ");
			wt.holdOn(Duration.ofSeconds(3));
			wt.sendValue(OthertypeTextBox, name, "Other Type text box");
			wt.holdOn(Duration.ofSeconds(5));
			wt.sendValueJs(PhoneNumber, "9845678766", "Phone number");
			wt.sendValue(Email, name+"@yopmail.com", "email");
		String ProceedbuttonText=	wt.getInnerText(SaveAndProceedTo);
		wt.printDataInReport("Proceed button text-" + ProceedbuttonText );
			wt.click(SaveAndProceedTo, "save and proceed to spouse button");
			wt.holdOn(Duration.ofSeconds(8));
			String SpouseProfessionalCount=verifyAddedprofessionalCountInTable();
			  wt.click(primaryMemberToggleButton, "Primary member toggle button");
			  wt.holdOn(Duration.ofSeconds(4));
		   String AfteraddClientMortgageCount=	   verifyAddedprofessionalCountInTable();
		   wt.printDataInReport("Before save the details Client mortgage count -" + ClientMortgageCount);
		   wt.printDataInReport("Before save the details Spouse mortgage count -" + spouseMortgageCount);
		   wt.printDataInReport("After save the details Client mortgage count -" + AfteraddClientMortgageCount );
		   wt.printDataInReport("After save the details Spouse mortgage count -" +  SpouseProfessionalCount);
	}
	
	
}
