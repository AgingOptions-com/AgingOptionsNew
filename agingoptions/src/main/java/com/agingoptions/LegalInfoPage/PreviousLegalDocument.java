package com.agingoptions.LegalInfoPage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class PreviousLegalDocument extends PreviousLegalDocumentOr {
 
	public WebUtil wt;
	
	public PreviousLegalDocument(WebUtil util) {
		super(util);
		this.wt=util;
	
	} 
	
	public void gotoClickLegalInfoModule() {
		wt.click(LegalButtonUndersetUp, "Legal info buton uder setup page");
	}
	public void verifyfiduciaryBeneficirypage() {
		wt.verifyInnerText(fiduciaryBeneficiaryInnerText, "Fiduciary/Beneficiary", "Fiduciary beneficiary text");
	}
	public void gotoClickPreviousLegalDocumentDrawer() {
		wt.click(previousLegaldocumentDrawer, "Previous legal document drawer");
	}
	public void GotoVerifyLegalInformationPage() {
		wt.verifyInnerText(LegalInformationText, " Legal information", "Legal information text");
	}
	public void doYouCurrentlyhaveLegalPlanning() {
		wt.isDisplayed(DoYouCurrentlyHaveLegalPlanningYesRadioButton, "Yes radio button");
		wt.isDisplayed(DoYouCurrentlyHaveLegalPlanningNoRadioButton, "No radio button");
		
	}
	public void verifyCheckYesRadioButton_DoYouCurrentlyHaveLegalPlaaning() {
		wt.click(DoYouCurrentlyHaveLegalPlanningYesRadioButton, "Yes radio button");
		wt.holdOn(Duration.ofSeconds(4));
		wt.verifyInnerText(isYouPlanWillBaseOrTrustbaseText, "Is your plan a Will based or a Trust (Revocable Living Trust) based plan?", "Is your plan a Will based or a Trust (Revocable Living Trust) based plan? questions");
		
	}
	public void verifyNoRadioButton_DoYouCurrentlyhaveLegalPlanning() {
		wt.click(DoYouCurrentlyHaveLegalPlanningNoRadioButton, "No Radio button");
		wt.holdOn(Duration.ofSeconds(4));
		wt.verifyInnerText(isYouPlanWillBaseOrTrustbaseText, "Is your plan a Will based or a Trust (Revocable Living Trust) based plan?", "Is your plan a Will based or a Trust (Revocable Living Trust) based plan? questions");
	}
	public void gotoSaveDetailDoYoucurrentlyHavelegalplanning_NoCheck() {
		wt.click(DoYouCurrentlyHaveLegalPlanningNoRadioButton, "No Radio button");
		wt.holdOn(Duration.ofSeconds(3));
		wt.click(saveAndContinueButton, "Save and continue button");
		CommonCode common = new  CommonCode(wt);
		common.verifyToasterMessage("Your data have been saved successfully.");
	}
	public void gotoclickNext_FidBenButtonDoYouCurrentlyHaveLegalPlanning() {
		wt.click(DoYouCurrentlyHaveLegalPlanningNoRadioButton, "No Radio button");
		wt.click(nextFiduciaryBeneficiryButton, "Next Fiduciary/Beneficiary button");
		wt.holdOn(Duration.ofSeconds(6));
		verifyfiduciaryBeneficirypage();
		
	}
	public void verifySelectWillRedioButton() {
		wt.click(DoYouCurrentlyHaveLegalPlanningYesRadioButton, "Yes redio button");
		wt.click(WillRadioButton, "Will redio button");
		
	}
	
	public void willList() {
		wt.click(DoYouCurrentlyHaveLegalPlanningYesRadioButton, "Yes redio button");
		wt.click(WillRadioButton, "Will redio button");
		wt.print("Mapping of will type document");;
		List<WebElement > listObj =wt.driver.findElements(By.xpath("//tr[@class='mainIncomeType']//td//p"));
	  List<String>	lis=WllListAdd();
		for (int i = 0; i < listObj.size(); i++) {
		String expelist=	listObj.get(i).getText();
		 wt.print(i + " Expected Will Document -: " + expelist);
			String actual= lis.get(i);
			 wt.print(i + " Actual Will Document-: " + expelist);
			wt.verifyActualExpectedText(actual, expelist, "Will Document List");
		}
		
		
		
	}
	public LinkedList<String>  WllListAdd() {
		LinkedList<String> linked =new LinkedList<>();
		linked.add(0, "Last Will and Testament"); 
		linked.add(1, "Community Property Agreement");
		linked.add(2, "Living Will");
		linked.add(3, "Handling of remains");
		linked.add(4, "Mental Health Advance Directive");
		linked.add(5, "Pour Over Will");
		linked.add(6, "Revocation of Community Property Agreement");
		return linked;
	}
	
	public LinkedList<String>  TrustListAdd() {
		LinkedList<String> linked =new LinkedList<>();
		linked.add(0, "Community Property Agreement"); 
		linked.add(1, "Revocable Trust");
		linked.add(2, "Durable Power of Attorney For Finance");
		linked.add(3, "Durable Power of Attorney For Healthcare");
		linked.add(4, "HIPAA Release");
		linked.add(5, "Revocation of Community Property Agreement");
		linked.add(6, "Pet Trust");
		return linked;
	}
	
	public void TrustList() {
		wt.click(DoYouCurrentlyHaveLegalPlanningYesRadioButton, "Yes redio button");
		wt.click(TrustRadioButton, "Trust redio button");
		wt.print("Mapping of Trust type document");;
		List<WebElement > listObj =wt.driver.findElements(By.xpath("//tr[@class='mainIncomeType']//td//p"));
	  List<String>	lis=TrustListAdd();
		for (int i = 0; i < listObj.size(); i++) {
		String expelist=	listObj.get(i).getText();
		 wt.print(i + " Expected Trust Document -: " + expelist);
			String actual= lis.get(i);
			 wt.print(i + " Actual Trust Document-: " + expelist);
			wt.verifyActualExpectedText(actual, expelist, " Trust Document ");
		}
		
		
		
	}
	
	public void uploadDocument() {
	List<WebElement >  LisObj=wt.driver.findElements(By.xpath("//div[@class=' d-flex justify-content-end']//input[@type='file']"));
	 for(int i=0; i<LisObj.size(); i++) {
		WebElement FileWeb =LisObj.get(i);
		wt.printDataInReport("File upload for Document- " + i);
		wt.holdOn(Duration.ofSeconds(2));
		FileWeb.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\DashboardReport_27-03-2025.pdf");
		wt.holdOn(Duration.ofSeconds(3));
			wt.driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			wt.printDataInReport("Click perform on confirm button");
		}
	 }
	
	

	public void VerifySaveAndContinueWithWillTypeDetails() {
		wt.click(DoYouCurrentlyHaveLegalPlanningYesRadioButton, "Yes redio button");
		wt.click(WillRadioButton, "Will redio button");
		wt.click(CalenderIcon, "Calender icon");
		wt.click(DateSelect, "4 april");
		wt.holdOn(Duration.ofSeconds(5));
		uploadDocument();
		wt.holdOn(Duration.ofSeconds(13));
		wt.click(saveAndContinueButton, "Save and continue button");
		CommonCode common = new  CommonCode(wt);
		common.verifyToasterMessage("Your data have been saved successfully.");
	}
	public void verifySaveAndContinueWithTrustTypeDocument() {
		wt.click(DoYouCurrentlyHaveLegalPlanningYesRadioButton, "Yes radio button");
		wt.holdOn(Duration.ofSeconds(3));
		wt.click(TrustRadioButton, "Trust radio button");
		verifydeleteConfirmationWillToTrust();
		wt.click(CalenderIcon, "Calender icon");
		wt.click(DateSelect, "4 april");
		wt.holdOn(Duration.ofSeconds(5));
		uploadDocument();
		wt.holdOn(Duration.ofSeconds(13));
		wt.click(saveAndContinueButton, "Save and continue button");
		CommonCode common = new  CommonCode(wt);
		common.verifyToasterMessage("Your data have been saved successfully.");	
	}
	public void verifydeleteConfirmationWillToTrust() {
		wt.verifyInnerText(DeleteConfirmationmessage, "You have a previously Will-based saved document list. Would you like to remove it?", "Delete Confirmation -: Switch Will to trust");
		wt.click(deleteconfirmation, "Delete Confrimation");
	}
	
	
	
	
	public void verifyNewCommonDocument() {
		wt.click(DoYouCurrentlyHaveLegalPlanningYesRadioButton, "Yes radio button");
		wt.holdOn(Duration.ofSeconds(3));
		wt.click(TrustRadioButton, "Trust radio button");
		wt.click(addNewDocumentTypeButton, "Add new document button");
		wt.click(AddNewDocumentDropdown, "New Document Dropdown");
		List<String> ActualList=  actualNewCommonDocument();
	List<WebElement> ListWebElement=	wt.driver.findElements(By.xpath("//ul[@id='dropDownDivId']//li"));
	   for(int i=0; i<ListWebElement.size(); i++) {
		  String ActualNewDocument= ActualList.get(i);
		  wt.printDataInReport(ActualNewDocument);
		String ExpectedNewDocument=   ListWebElement.get(i).getText();
		wt.printDataInReport(ExpectedNewDocument);
		wt.verifyActualExpectedText(ActualNewDocument, ExpectedNewDocument, "New Document list");
		   
	   }
		
	}
	public List<String> actualNewCommonDocument() {
	 List<String> listObj=	new LinkedList<String>();
	 listObj.add(0, "Other");
	 listObj.add(1, "Pre/Post-Nuptial Agreement");
	 listObj.add(2, "Stand-Alone Safe Harbor Trust");
	 listObj.add(3, "Directive to Attorney");
	 listObj.add(4, "Limited Power of Attorney");
	 listObj.add(5, "Deed");
	 listObj.add(6, "Gun Trust");
	 listObj.add(7, "In Case of Emergency Cards");
	 return listObj;
	}
	
	public void verifySaveAndContinueWithAddnewDocument() {
		VerifySaveAndContinueWithWillTypeDetails();
		wt.holdOn(Duration.ofSeconds(6));
		wt.click(addNewDocumentTypeButton, "Add new document button");
		wt.click(AddNewDocumentDropdown, "New Document Dropdown");
		wt.click(OtherDocument, "Other option");
		wt.sendValue(otherDescription, "Other", "Other  description");
		wt.click(nextFiduciaryBeneficiryButton, "Next : fiduciary beneficiary");
		wt.holdOn(Duration.ofSeconds(5));
		verifyfiduciaryBeneficirypage();
	}
	
	
}

