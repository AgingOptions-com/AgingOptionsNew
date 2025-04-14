package com.agingoptions.LegalInfoPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FiduciaryBeneficiaryPage  extends FiducuaryBeneficiaryPageOr{

	public WebUtil wt;
	public FiduciaryBeneficiaryPage(WebUtil util) {
		super(util);
		this.wt=util;

	}

	public void verifyFiduciaryBeneficiaryPage() {
		wt.click(FiduciaryBeneficiaryDrawer, "Fiduciary Beneficiary Drawer");
		wt.verifyInnerText(FiduciaryBeneficiaryText, "Fiduciary/Beneficiary", "Fiducoiary beneficiary text");
	}
	public void verifyPrimaryMemberAndSposueFidbenList() {
		wt.click(FiduciaryBeneficiaryDrawer, "Fiduciary Beneficiary Drawer");
		String primarymembertext=	wt.getInnerText(Primarymembertogglebuttontext);
		wt.printDataInReport("Primary member-: " + primarymembertext + "fiduciary beneficiary page member list");
		List<WebElement> ListObj =wt.driver.findElements(By.xpath("//tbody[@class='table-body-tr']//tr//td[@class='fidBenName']"));
		wt.printDataInReport("Primary Member fiduciary beneficiary");
		for(int i=0; i<ListObj.size(); i++) {
			String fiduciaryBeneficirypageMember=ListObj.get(i).getText();
			wt.print(i+"."+fiduciaryBeneficirypageMember);
		}
		wt.click(spousetogglebuttontext, "Spouse toggle button");
		String Spousetext=	wt.getInnerText(spousetogglebuttontext);
		wt.printDataInReport("Spouse-: " + Spousetext + "fiduciary beneficiary page member list");
		for(int j=0; j<ListObj.size(); j++) {
			String fiduciaryBeneficirypageMember=ListObj.get(j).getText();
			wt.print(j+"."+fiduciaryBeneficirypageMember); 	
		}
	}
	public void VerifyClientTableFidBenCheckBox() {
		wt.click(FiduciaryBeneficiaryDrawer, "Fiduciary Beneficiary Drawer");	
		wt.click(SpouseTablebenCheckbox, "Spouse Table Beneficiary check box");
		wt.click(SpouseTablefidCheckBox, "Spouse fiduciary check box");
		wt.click(ProceedtoButton, "Proceed to spouse button");
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(primaryMemberToggleButton, "Primary member toggle button");
		wt.click(ClientSpouseEditIcon, "Edit icon");
		wt.holdOn(Duration.ofSeconds(5));
		wt.isSelected(FiduciaryCheckBoxInDetails, "Fiduciary CheckBox in details Page");
		wt.isSelected(BeneficiaryCheckBoxInDetails, "Beneficiary Checkbox in details Page");  
		wt.click(PreviousIcon, "Previous Icon");
	}
	public void VerifySpouseTableFidBenCheckBox() {
		wt.click(FiduciaryBeneficiaryDrawer, "Fiduciary Beneficiary Drawer");
		wt.click(spousetogglebuttontext, "Spouse toggle button");
		wt.holdOn(Duration.ofSeconds(4));
		wt.click(SpouseTablebenCheckbox, "Spouse Table Beneficiary check box");
		wt.click(SpouseTablefidCheckBox, "Spouse fiduciary check box");
		wt.click(ProceedtoButton, "Proceed to living will button");
		wt.holdOn(Duration.ofSeconds(6));
		wt.verifyInnerText(LivingWillVerificationText, "Please identify your choices for your living will.", "Living Will page text");
		wt.click(FiduciaryBeneficiaryDrawer, "Fiduciary beneficiary drawer");
		wt.holdOn(Duration.ofSeconds(3));
		wt.click(spousetogglebuttontext, "Spouse toggle button");
		wt.holdOn(Duration.ofSeconds(2));
		wt.click(ClientSpouseEditIcon, "Edit icon");
		wt.holdOn(Duration.ofSeconds(5));
		wt.isSelected(FiduciaryCheckBoxInDetails, "Fiduciary CheckBox in details Page");
		wt.isSelected(BeneficiaryCheckBoxInDetails, "Beneficiary Checkbox in details Page");
		wt.click(PreviousIcon, "Previous Icon");
	}
	public void verifyAddFiduciary() {
		wt.click(FiduciaryBeneficiaryDrawer, "Fiduciary Beneficiary Drawer");
		VerifyFidbenCount();
       wt.click(AddAnotherButton, "Add another button");
       wt.holdOn(Duration.ofSeconds(8));
       wt.click(accordian, "Accordian");
     String name = wt.getRandomText(5);
		wt.sendValue(FirstName, name, "First Name");
		wt.sendValue(MiddleName, "sen", "Middle name");
		wt.sendValue(LastName, "Singh", "Last Name");
		wt.click(PrefixSuffix, "Prefix suffix dropdown");
		wt.click(NonePrefix, "None option");
		wt.sendValue(NickName, "Saras", "Nickname");
		wt.click(Gender, "Gender");
		wt.click(Male, "Male");
	    wt.click(CalenderIcon, "calender icon");
		wt.selectDropDownByVisibleText(selectYearDropdown, "1999", "1999 year");
		wt.click(Date1, "1");
		wt.click(RelationShipWithPrimaryMemberDropDown, "Relationship with primary member dropdown");
		wt.click(relationShipOption, "Aunt option");
		wt.click(RelationShipWithSpouseDropDown, "Relationship with Spouse dropdown");
		wt.click(relationShipOption, "Aunt option");
		wt.click(FiduciaryCheckBoxInDetails, "Fiduciary check box");
		wt.click(BeneficiaryCheckBoxInDetails, "Beneficiary check box");
		wt.click(MakeThisAsEmergencyYesRadioButton, "Yes radio");
		wouldyoulikethispersontoreceiveSelect();
		wt.click(isThisExtendedEmployedYesRadioButton, "Employment yes radio button");
		wt.sendValue(occupationType, "employed", "Occupation");
		wt.click(AreYouDisabledWithSpecialNeedsNo, "Are you disabled No radio button");
		wt.click(addressTypeDropdown, "Address type dropdown");
		wt.click(PhysicialTypeOption, "Physicial");
		wt.sendValue(SearchAddress, "34 St - Herald Sq, New York, NY, USA", "Search Address");
		wt.sendValue(StreetNumberAndName, "34 St - Herald Sq", "Street Number");
		wt.sendValue(city, "New York", "City");
		wt.sendValue(state, "New York", "State");
		wt.sendValue(Zipcode, "10001", "Zip code");
		wt.sendValue(Country, "United States", "Country text box");
		wt.clickJavaScript(contacttypeDropdown, "Contact type DropDown");
		wt.click(PrimaryOptions, "Primary");
		wt.click(countrycodedropdown, "country code dropdown");
		wt.click(IndianContact, "+91 country code");
		wt.sendValueJs(phonenumber, "9878675645", "phone number");
		wt.sendValue(email, name+"@yopmail.com", "email");
		wt.click(SaveAndContinueButton, "Save And continue button");
		
	}
	public String VerifyFidbenCount() {
		String text=wt.getInnerText(fid_BenCount);
        wt.printDataInReport("Fiduciary/beneficiary Count- " + text);
        return text;
       }
	public void wouldyoulikethispersontoreceiveSelect() {
	List<WebElement>	ListObj=wt.driver.findElements(By.xpath("//div[@class='d-flex flex-column mb-1']//div[@class='custom-checkbox-setup  form-check']//input"));
		for(int i=0; i<ListObj.size(); i++) {
			ListObj.get(i).click();
			
		}
	}
}
