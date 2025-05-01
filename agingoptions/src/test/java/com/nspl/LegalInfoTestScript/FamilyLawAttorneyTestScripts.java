package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.HousingProfessionalLandScapperPage;
import com.Ao.HousingPage.ProfessionalDetailsPage;
import com.agingoptions.LegalInfoPage.FamilyLawAttorney;
import com.agingoptions.LegalInfoPage.LegalProfessionalElderLawAttorneyPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class FamilyLawAttorneyTestScripts extends BaseTest {

	@Test(priority = 1)
	public void VerifyFamilyLawAttorneyPageOnLegalProfessional() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	     FamilyLawAttorney ElaObj= new   FamilyLawAttorney(util);
	     ElaObj.GoTofamilylawAttorneyPageOnLegalProfessional();;
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionlObj= new ProfessionalDetailsPage(util);
        util.holdOn(Duration.ofSeconds(5));
		housingProfessionlObj.verifyFamilyLawAttorneyPage();

}
	@Test(priority = 2)
	public void VerifyIdONotHaveFamilyLawAttorneyFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		  util.holdOn(Duration.ofSeconds(8));
		FamilyLawAttorney fla= new FamilyLawAttorney(util);
		fla.IdoNotHaveFLAFunctionality();
		
	}
	@Test(priority = 3)
	public void VerifyClickIDoNotHaveFamilyLawAttorneyCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		util.holdOn(Duration.ofSeconds(8));
		FamilyLawAttorney fla=	new FamilyLawAttorney(util);
		fla.ClickIdoNotHaveFLA();
	}
	@Test(priority = 4)
	public void verifyToggleButton() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();	
		util.holdOn(Duration.ofSeconds(8));
		FamilyLawAttorney fla=	new FamilyLawAttorney(util);
		fla.verifytoggleButton();
		
	}
	@Test(priority = 5)
	public void verifyaddFamilyLawAttorneyForPraimaryMember() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();	
		util.holdOn(Duration.ofSeconds(4));
	FamilyLawAttorney fla=	new FamilyLawAttorney(util);
	fla.GoTofamilylawAttorneyPageOnLegalProfessional();
	 util.holdOn(Duration.ofSeconds(8));
	 ProfessionalDetailsPage ProfessionalObj=	new ProfessionalDetailsPage(util);
	 ProfessionalObj.addProfessionalForPrimaryMember();
}
	@Test(priority = 6)
	public void VerifySaveAndAddAnotherPrimaryMemberFamilyLawAttorney() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickLegalModule();	
		util.holdOn(Duration.ofSeconds(4));	
		FamilyLawAttorney fla=	new FamilyLawAttorney(util);
		fla.GoTofamilylawAttorneyPageOnLegalProfessional();
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberProfessionalDetails();
}
	@Test(priority = 7)
	 public void VerifySaveAndproceedPrimaryMemberFamilyLawAttorneyDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();	
			util.holdOn(Duration.ofSeconds(4));	
			FamilyLawAttorney fla=	new FamilyLawAttorney(util);
			fla.GoTofamilylawAttorneyPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage ProfessionalObj=	new ProfessionalDetailsPage(util); 
		    ProfessionalObj.saveAndProceedPrimaryMemberProfessionalDetail();
		    ProfessionalObj.verifyBusinessSuccessiorPage();;
}
	@Test(priority = 8)
	 public void VerifySaveAndContinueSpouseFamilyLawAttorneyDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			FamilyLawAttorney fla=	new FamilyLawAttorney(util);
			fla.GoTofamilylawAttorneyPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.saveAndContinueProfessionalDetailsForSpouse();
}
	@Test(priority = 9)
	 public void VerifySaveAndAddAnotherSpouseFamilyLawAttorneyDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();	
			util.holdOn(Duration.ofSeconds(4));	
			FamilyLawAttorney fla=	new FamilyLawAttorney(util);
			fla.GoTofamilylawAttorneyPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.SaveAndAddAnotherSpouseProfessionalDetails();
}
	 @Test(priority = 10)
	 public void VerifySaveAndProceedSpouseFamilyLawAttorneyDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			FamilyLawAttorney fla=	new FamilyLawAttorney(util);
			fla.GoTofamilylawAttorneyPageOnLegalProfessional();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.saveAndProceedSpouseFamilyLawAttorneyDetails();
		}
	
	 @Test(priority = 11)
	 public void VerifyUpdateFamilyLawAttorneyDetails() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			FamilyLawAttorney fla=	new FamilyLawAttorney(util);
			fla.GoTofamilylawAttorneyPageOnLegalProfessional();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.UpdateProfessionalDetails();
	}
	 @Test(priority = 12)
	 public void VerifyClientFamilyLawAttorneyDetailsWithUncheckCopySamedataTospouseCheckBox() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickLegalModule();;	
			util.holdOn(Duration.ofSeconds(4));	
			FamilyLawAttorney fla=	new FamilyLawAttorney(util);
			fla.GoTofamilylawAttorneyPageOnLegalProfessional();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.VerifyClientProfessionalDetailsWithUncheckCopySamedataTospouseCheckBox();
	 }
}
