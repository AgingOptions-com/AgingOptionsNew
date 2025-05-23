package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.HousingProfessionalLandScapperPage;
import com.Ao.HousingPage.ProfessionalDetailsPage;
import com.agingoptions.LegalInfoPage.FamilyLawAttorney;
import com.agingoptions.LegalInfoPage.LegalProfessionalElderLawAttorneyPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class LegalProfessionalElA  extends BaseTest{

	@Test(priority = 1)
	public void VerifyElderLawAttorneyPageOnLegalProfessional() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	     LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
	     ElaObj.GoToELAPageOnLegalProfessional();
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionlObj= new ProfessionalDetailsPage(util);
        util.holdOn(Duration.ofSeconds(5));
		housingProfessionlObj.VerifyElderLawAttorneypage();

}
	@Test(priority = 2)
	public void VerifyIdONotHaveElderLawAttorneyFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		  util.holdOn(Duration.ofSeconds(8));
		  LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
		     ElaObj.IdoNotHaveELAFunctionality();
		
	}
	@Test(priority = 3)
	public void VerifyClickIDoNotHaveLandScapperCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		util.holdOn(Duration.ofSeconds(8));
		LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
	     ElaObj.ClickIdoNotHaveELA();
	}
	@Test(priority = 4)
	public void verifyToggleButton() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();	
		util.holdOn(Duration.ofSeconds(8));
		LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
	     ElaObj.verifytoggleButton();
		
	}
	@Test(priority = 5)
	public void verifyaddElderLawAttorneyForPraimaryMember() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();	
		util.holdOn(Duration.ofSeconds(4));
		LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
	     ElaObj.GoToELAPageOnLegalProfessional();
	 util.holdOn(Duration.ofSeconds(8));
	 ProfessionalDetailsPage ProfessionalObj=	new ProfessionalDetailsPage(util);
	 ProfessionalObj.addProfessionalForPrimaryMember();
}
	@Test(priority = 6)
	public void VerifySaveAndAddAnotherPrimaryMemberElderLawAttorney() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();	
		util.holdOn(Duration.ofSeconds(4));	
		LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
	     ElaObj.GoToELAPageOnLegalProfessional();
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberProfessionalDetails();
}
	@Test(priority = 7)
	 public void VerifySaveAndproceedPrimaryMemberElderLawAttorneyDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
		     ElaObj.GoToELAPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage ProfessionalObj=	new ProfessionalDetailsPage(util); 
		    ProfessionalObj.saveAndProceedPrimaryMemberProfessionalDetail();
		    ProfessionalObj.verifyFamilyLawAttorneyPage();
}
	@Test(priority = 8)
	 public void VerifySaveAndContinueSpouseElderLawAttorneyDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
		     ElaObj.GoToELAPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.saveAndContinueProfessionalDetailsForSpouse();
}
	@Test(priority = 9)
	 public void VerifySaveAndAddAnotherSpouseElderLawAttorneyDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
		     ElaObj.GoToELAPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.SaveAndAddAnotherSpouseProfessionalDetails();
}
	 @Test(priority = 10)
	 public void VerifySaveAndProceedSpouseElderLawAttorneyDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
		     ElaObj.GoToELAPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.saveAndProceedSpouseELADetails();
		}
	
	 @Test(priority = 11)
	 public void VerifyUpdateElderLawAttorneyDetails() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
		     ElaObj.GoToELAPageOnLegalProfessional();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.UpdateProfessionalDetails();
	}
	 @Test(priority = 12)
	 public void VerifyClientElderLawAttorneyDetailsWithUncheckCopySamedataTospouseCheckBox() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			LegalProfessionalElderLawAttorneyPage  ElaObj= new   LegalProfessionalElderLawAttorneyPage(util);
		     ElaObj.GoToELAPageOnLegalProfessional();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.VerifyClientProfessionalDetailsWithUncheckCopySamedataTospouseCheckBox();
	 }
}
