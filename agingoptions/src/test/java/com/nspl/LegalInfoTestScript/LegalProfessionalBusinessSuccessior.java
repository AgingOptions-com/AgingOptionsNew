package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.ProfessionalDetailsPage;
import com.agingoptions.LegalInfoPage.FamilyLawAttorney;
import com.agingoptions.LegalInfoPage.LegalProfessionalBusinessSuccessiorPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class LegalProfessionalBusinessSuccessior extends BaseTest {


	@Test(priority = 1)
	public void VerifyBusinessSuccessiorPageLegalProfessional() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
	LPBS.GoToBusinessSuccessiorPageOnLegalProfessional();
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionlObj= new ProfessionalDetailsPage(util);
        util.holdOn(Duration.ofSeconds(5));
		housingProfessionlObj.verifyBusinessSuccessiorPage();

}
	@Test(priority = 2)
	public void VerifyIdONotHaveBusinessSuccessiorFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		  util.holdOn(Duration.ofSeconds(8));
		  LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
			LPBS.IdoNotHaveBusinessSuccessiorFunctionality();
		
	}
	@Test(priority = 3)
	public void VerifyClickIDoNotHaveBusinessSuccessiorCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		util.holdOn(Duration.ofSeconds(8));
		LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
		LPBS.ClickIdoNotHaveBusinessSuccessior();
	}
	@Test(priority = 4)
	public void verifyToggleButton() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();	
		util.holdOn(Duration.ofSeconds(8));
		LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
		LPBS.verifytoggleButton();
		
	}
	@Test(priority = 5)
	public void verifyaddBusinessSuccessiorForPraimaryMember() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();	
		util.holdOn(Duration.ofSeconds(4));
		LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
		LPBS.GoToBusinessSuccessiorPageOnLegalProfessional();
	 util.holdOn(Duration.ofSeconds(8));
	 ProfessionalDetailsPage ProfessionalObj=	new ProfessionalDetailsPage(util);
	 ProfessionalObj.addProfessionalForPrimaryMember();
}
	@Test(priority = 6)
	public void VerifySaveAndAddAnotherPrimaryMemberBusinessSuccessior() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();	
		util.holdOn(Duration.ofSeconds(4));	
		LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
		LPBS.GoToBusinessSuccessiorPageOnLegalProfessional();
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberProfessionalDetails();
}
	@Test(priority = 7)
	 public void VerifySaveAndproceedPrimaryMemberBusinessSuccessiorDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
			LPBS.GoToBusinessSuccessiorPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage ProfessionalObj=	new ProfessionalDetailsPage(util); 
		    ProfessionalObj.saveAndProceedPrimaryMemberProfessionalDetail();
		    ProfessionalObj.VerifyMyServiceProvider();
		    util.holdOn(Duration.ofSeconds(4));
		    ProfessionalObj.GotoClickLegalSectonUnderSetUpPage();
}
	@Test(priority = 8)
	 public void VerifySaveAndContinueSpouseBusinessSuccessiorDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
			LPBS.GoToBusinessSuccessiorPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.saveAndContinueProfessionalDetailsForSpouse();
}
	@Test(priority = 9)
	 public void VerifySaveAndAddAnotherSpouseBusinessSuccessiorDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();	
			LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
			LPBS.GoToBusinessSuccessiorPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.SaveAndAddAnotherSpouseProfessionalDetails();
}
	 @Test(priority = 10)
	 public void VerifySaveAndProceedSpouseBusinessSuccessiorDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
			LPBS.GoToBusinessSuccessiorPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.saveAndProceedSpouseBusinessSuccessiorDetails();
		}
	
	 @Test(priority = 12)
	 public void VerifyUpdateBusinessSuccessiorDetails() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
			LPBS.GoToBusinessSuccessiorPageOnLegalProfessional();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.UpdateProfessionalDetails();
	}
	 @Test(priority = 11)
	 public void VerifyClientBusinessSuccessiorDetailsWithUncheckCopySamedataTospouseCheckBox() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalBusinessSuccessiorPage LPBS=   new LegalProfessionalBusinessSuccessiorPage(util);
			LPBS.GoToBusinessSuccessiorPageOnLegalProfessional();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.VerifyClientProfessionalDetailsWithUncheckCopySamedataTospouseCheckBox();
	 }
}
