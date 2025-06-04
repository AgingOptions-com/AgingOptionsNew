package com.agingoptions.LegalInfoPage;

import java.time.Duration;

import org.openqa.selenium.By;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class BeneficiaryLetterPage extends BeneficiaryLetterPageOr {
	
	public WebUtil wt;
	public BeneficiaryLetterPage(WebUtil util) {
		super(util);
		this.wt=util;
		
	}
   public void verifyBeneficiryLetterPage() {
	  gotoBeneficiryLetterDrawer();
	  wt.holdOn(Duration.ofSeconds(13));;
     wt.verifyInnerText(AssetsTextbeneficiaryLetterPage, "Assets:", "Assets text");
	   
   }
   public void gotoBeneficiryLetterDrawer() {
	  wt.click(beneficiaryLetterDrawer, "Beneficiary letter drawer"); 
   }
   public void selectSavingAccountFromTypeOfAssets() {
		wt.holdOn(Duration.ofSeconds(1));
		wt.click(typeOfAssetDropDown, "Type Of Assets");
	   wt.click(checkingSavingAccountDropDownOption, "Checking/Saving Account");
	}

	public void inputNameOfInstituion(String value) {
		wt.sendValue(nameOfInstituionTB, value, "Name Of Instituion");
	}
	public void inputBalance(String value) {
		wt.sendValue(balanceTB, value, "Balance");
	}
	public void selectOwnerAsJoint() {
		wt.holdOn(Duration.ofSeconds(1));
		wt.click(ownerDropDownIcon, "Owner Drop Down");
		wt.click(jointDropDownOption, "Joint");
	}
	public void inputAccountNumber(String value) {
		wt.sendValue(accountNumberTB, value, "Account Number");
	}
	public void openAddressAccordian() {
		wt.openAccordion(addressAccordian, "Address Accordian");
	}
	public void openBeneficiaryAccordian() {
		wt.openAccordion(beneficiaryAccordian, "Beneficiary");
	}
	public void openDocumentUploadAccordian() {
		wt.openAccordion(documentUploadAccordian, "Document Upload");
	}
	public void clickAddCharityButton() {
		wt.click(addCharityBT, "Add Charity");
	}
	public void inputCharityNameTB(String value) {
		wt.sendValue(charityNameTB, value, "Charity Name");
	}
	public void inputPercentage(String value) {
		wt.sendValue(charityPercentageTB, value, "Percentage");
	}
	public void inputCharityPhoneNumber(String value) {
		try {
			wt.sendValue(charityPhoneNumber, value, "Charity Phone Number");
			wt.waitUntilValueIsSend(charityPhoneNumber, 5, value);
		}catch(Exception e) {
			wt.sendValue(charityPhoneNumber, value, "Charity Phone Number");
		}

	}
	public void inputCharityEmail(String value) {
		try {
			wt.sendValue(charityEmail, value, "Charity Email");
			wt.waitUntilValueIsSend(charityEmail, 5, value);
		}catch(Exception e) {
			wt.sendValue(charityEmail, value, "Charity Email");
		}	}
	public void selectOtherTypeOfAssets() {
		wt.holdOn(Duration.ofSeconds(1));
		wt.click(typeOfAssetDropDown, "Type Of Asset");
		wt.click(otherDropDownOption, "Other");
	}
	public void inputOtherDescription(String value) {
		wt.sendValue(otherTypeTextBox, value, "Other Description Text box");
	}

	
	public void AddNonretirement() {
		wt.click(FinanceSectonUnderSetUpPage, "finance Section under setup page");
		wt.click(addasset, "Add asset button");
		wt.holdOn(Duration.ofSeconds(6));
		selectSavingAccountFromTypeOfAssets();
       wt.sendValue(nameOfInstituionTB, "Asdf", "Name of institution");
       wt.sendValue(balanceTB, "34000","Balance text box");
        selectOwnerAsJoint();
       wt.sendValue(accountNumberTB, "34567373737373", "Account Number");
       openAddressAccordian();
       wt.holdOn(Duration.ofSeconds(4));
       wt.sendValue(AddressLine, "34 St - Herald Sq", "Address Line");
	   wt.sendValue(Suite, "", "Suite");
	   wt.sendValue(city, "New York", "City");
	   wt.sendValue(State, "New York", "State");
	   wt.sendValue(Zipcode, "10001", "Zip code");
	   wt.sendValue(phonenumbertextBox, "9875678765", "phone number");
	   wt.sendValue(email, "satya23@yopmail.com", "email");
	   openBeneficiaryAccordian();
       clickAddCharityButton();
       inputCharityNameTB("satya");
       wt.click(saveBT, "Save button");
       wt.holdOn(Duration.ofSeconds(7));
       wt.click(SaveAndContinueButton, "Save and continue letter button");
       wt.holdOn(Duration.ofSeconds(10));
}
	public void AddRetirementDetails() {
		wt.click(FinanceSectonUnderSetUpPage, "finance Section under setup page");	
		wt.click(RetirementDrawer, "Retirement drawer");
		wt.click(addasset, "Add asset button");
		wt.holdOn(Duration.ofSeconds(6));
		selectOtherTypeOfAssets();
		inputOtherDescription("other");
       wt.sendValue(nameOfInstituionTB, "Asdf", "Name of institution");
       wt.sendValue(balanceTB, "34000","Balance text box");
        selectOwnerAsJoint();
       wt.sendValue(accountNumberTB, "34567373737373", "Account Number");
       openAddressAccordian();
       wt.holdOn(Duration.ofSeconds(4));
       wt.sendValue(AddressLine, "34 St - Herald Sq", "Address Line");
	   wt.sendValue(Suite, "", "Suite");
	   wt.sendValue(city, "New York", "City");
	   wt.sendValue(State, "New York", "State");
	   wt.sendValue(Zipcode, "10001", "Zip code");
	   wt.sendValue(phonenumbertextBox, "9845678765", "phone number");
	   wt.sendValue(email, "satya@yopmail.com", "email");
	   openBeneficiaryAccordian();
       clickAddCharityButton();
       inputCharityNameTB("satya");
       wt.click(saveBT, "Save button");
       wt.holdOn(Duration.ofSeconds(5));
       wt.click(SaveAndContinueButton, "Save and continue letter button");
       wt.holdOn(Duration.ofSeconds(9));
	}
	
	public void AddLifeInsurance() {
		wt.click(LifeinsuranceDrawer, "Life insurancedrawer");
		wt.click(AddPolicyButton, "Add policy button");
		wt.holdOn(Duration.ofSeconds(7));
		wt.driver.findElement(By.xpath("//div[@id='insuranceCompanyId']//img")).click();
		wt.driver.findElement(By.xpath("//ul[@id='dropDownDivId']//li[text()='Chubb INA Group']")).click();
		wt.driver.findElement(By.xpath("(//img[@alt='Dropdown icon'])[2]")).click();
		wt.driver.findElement(By.xpath("//ul[@id='dropDownDivId']//li[text()='Term Insurance']")).click();
		wt.driver.findElement(By.xpath("//p[text()='Policy number']/following-sibling::input")).sendKeys("74883333939");
		wt.openAccordion(beneficiaryAccordianText,"beneficiary accordian");
		wt.click(BeneficiaryMemberDropdown, "Beneficiary member dropdown");
		wt.click(beneficiarymemberOptions, "beneficiary option");
		wt.click(SaveAndContinueButton, "save and continue letter button");
		
	}
	public void AddBeneficiaryLetterDetails() {
	FiduciaryBeneficiaryPage fidobj=	new FiduciaryBeneficiaryPage(wt);
	  fidobj.VerifyClientTableFidBenCheckBox();
		AddNonretirement();
       AddRetirementDetails();
       AddLifeInsurance();
       wt.holdOn(Duration.ofSeconds(5));
       wt.click(legalButtonUnderSetUpPage, "Legal button under setup page");
       wt.holdOn(Duration.ofSeconds(4));
       wt.click(beneficiaryLetterDrawer, "beneficiary letter drawer");
       
       
	}
	public void verifyClickGenerateButtonWithoutSelectingAsset() {
//		FiduciaryBeneficiaryPage fidobj=	new FiduciaryBeneficiaryPage(wt);
//		  fidobj.VerifyClientTableFidBenCheckBox();
			AddNonretirement();
	       AddRetirementDetails();
	       AddLifeInsurance();
	       wt.holdOn(Duration.ofSeconds(5));
	       wt.click(legalButtonUnderSetUpPage, "Legal button under setup page");
	       wt.holdOn(Duration.ofSeconds(4));
	       wt.click(beneficiaryLetterDrawer, "beneficiary letter drawer");
	       wt.holdOn(Duration.ofSeconds(15));
	       wt.click(NonRetirementParentCheckbox, "Non retirement check box");
	       wt.click(RetirementParentCheckBox, "Retirement check box");
	       wt.click(LifeInsuranceParentCheckbox, "Lifeinsurance check box");
	       wt.click(GenerateButton, "Generate button");
	       wt.toasterverification(toastermessage, "Kindly select a checkbox to generate Beneficiary letter");
	}
	
	
}
