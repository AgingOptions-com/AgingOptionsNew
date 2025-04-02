package com.Ao.HousingPage;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingProfessionalDetailsPage extends HousingProfessionalDetailspageOr {
	public WebUtil wt;
	public HousingProfessionalDetailsPage(WebUtil util) {
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
	String text =wt.getInnerText(highlightedtoggleButton);
	wt.print("we are going to fill detail for " + text);
	
	}
	
	public void GoToClickEditIcon() {
		wt.click(Editicon, "Edit Icon");
	}
	public void verifyMortgageBroker() {
		wt.verifyInnerText(mortgageBrokerinnerText, "Mortgage Brokers", "Mortgage broker innertext");
	}

    public void  goToClickAddRealtorButton() {
	 wt.click(AddRealtorButton, "Add realtor button"); 
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
    
    public void addRealtorForPrimaryMember() {
    	HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(wt);
    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
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
    	wt.click(SaveAndContinueButton, "save and continue button");
    	wt.holdOn(Duration.ofSeconds(8));
    	verifyAddedprofessionalCountInTable();
    	
    	

    	
    }
    public void SaveAndAddAnotherprimaryMemberRealtorDetails() {
    	HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(wt);
    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
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
    
     public void  saveAndProceedPrimaryMemberRealtorDetail() {
    	 HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(wt);
     	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
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
     	wt.holdOn(Duration.ofSeconds(9));
     	wt.click(primaryMemberToggleButton, "Primary member toggle button");
     	wt.holdOn(Duration.ofSeconds(9));
     	verifyAddedprofessionalCountInTable();
     }
     public void saveAndContinueRealtorDetailsForSpouse() {
    		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(wt);
        	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
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
        	wt.click(SaveAndContinueButton, "save and continue button");
        	wt.holdOn(Duration.ofSeconds(8));
        	verifyAddedprofessionalCountInTable(); 
     }
     public void SaveAndAddAnotherSpouseRealtorDetails() {
    	 HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(wt);
     	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
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
     
     public void SaveAndProceedSpouseRealtorDetails() {
    	 HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(wt);
      	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
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
     public void copysamedataToSpouseRealtorDetails() {
    	 HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(wt);
     	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
     	wt.holdOn(Duration.ofSeconds(3));
     	verifyClient();
     	String previousClientRealtorCount=verifyAddedprofessionalCountInTable();
     	GotoClickSpouseToggleButton();
    	wt.holdOn(Duration.ofSeconds(3));
    	verifyClient();
    	String previousSpouseRealtorCount=verifyAddedprofessionalCountInTable();
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
     	String SpouseNewRealtorCount=verifyAddedprofessionalCountInTable();
     	wt.holdOn(Duration.ofSeconds(2));
     	GoTOClickPrimaryMemberToggleButton();
     	wt.holdOn(Duration.ofSeconds(5));
      String clientNewRealtorCount=	verifyAddedprofessionalCountInTable();
      wt.holdOn(Duration.ofSeconds(5));
      wt.print("Spouse previous realtor count- " + previousSpouseRealtorCount);
      wt.print("Spouse New realtor count- " + SpouseNewRealtorCount);
      wt.print("Primary Member previous realtor count- " + previousClientRealtorCount);
      wt.print("Spouse New realtor count- " + clientNewRealtorCount);
      
       
     }
     
     public void UpdateRealtorDetails() {
    	 HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(wt);
     	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
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
     	wt.click(SaveAndContinueButton, "save and continue button");
     	wt.holdOn(Duration.ofSeconds(8));
     	GoToClickEditIcon();
    	wt.holdOn(Duration.ofSeconds(6));
    	wt.click(FirstName, "Firstname");
     	FirstName.clear();
     	String updatedName="Test345";
    	wt.holdOn(Duration.ofSeconds(4));
     	wt.sendValue(FirstName, updatedName, "First name");
     	wt.holdOn(Duration.ofSeconds(3));
     	wt.click(UpdateButton, "Update button");
     	wt.holdOn(Duration.ofSeconds(8));
     	GoToClickEditIcon();
        wt.holdOn(Duration.ofSeconds(5));
      String value=  wt.GetAttributevalue(FirstName, "value");
      wt.verifyActualExpectedTextContains(value, updatedName, "First name");
     	
     	
     	
        
     }
}
