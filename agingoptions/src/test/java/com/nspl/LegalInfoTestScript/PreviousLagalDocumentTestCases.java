package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.LegalInfoPage.PreviousLegalDocument;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class PreviousLagalDocumentTestCases extends BaseTest {

	
	@Test(priority = 1, enabled = false)
	public void verifyLegalInfoPage() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
	    legalDocumentObj.GotoVerifyLegalInformationPage();
	}
	
	@Test(priority = 2, enabled = false)
	public void verifyDoYouCurrentlyLegalPlanningQuestions() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
	    legalDocumentObj.doYouCurrentlyhaveLegalPlanning();
	}
	
	@Test(priority=3, enabled = false)
	public void VerifyClickYesRadioButton_DoYouCurrentlyhaveLegalPlanning() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
	    legalDocumentObj.verifyCheckYesRadioButton_DoYouCurrentlyHaveLegalPlaaning();
	}
	@Test(priority = 4, enabled = false)
	public void verifyClickNoRadioButton_DoYouCurrentlyhaveLegalPlanning() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
	    legalDocumentObj.verifyNoRadioButton_DoYouCurrentlyhaveLegalPlanning();
	}
	@Test(priority = 1)
	public void verifyWillDocument() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
	    legalDocumentObj.willList();
	}
	@Test(priority = 2)
   public void VerifySaveAndContinue_DoYouCurrentlyHaveLegalPlanning_NoCheck() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
	    legalDocumentObj.gotoSaveDetailDoYoucurrentlyHavelegalplanning_NoCheck();
   }
	
	@Test(priority = 3)
	public void VerifyTrustDocument() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
	    legalDocumentObj.TrustList();
	}
	@Test(priority= 4)
	 public void VerifySaveAndProceedFidBen_DoYouCurrentlyHaveLegalPlanning_NoCheck() {
			LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
			lpoLadning.clickLegalModule();
		     util.holdOn(Duration.ofSeconds(10));	
		    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
		    legalDocumentObj.gotoclickNext_FidBenButtonDoYouCurrentlyHaveLegalPlanning();
		    util.holdOn(Duration.ofSeconds(5));
		    legalDocumentObj.gotoClickPreviousLegalDocumentDrawer();
	   }
	@Test(priority=5)
	public void verifySaveAndContinueWithWillTypeDocuments() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
	    legalDocumentObj.VerifySaveAndContinueWithWillTypeDetails();;
	}
	@Test(priority = 6)
	public void VerifySaveAndContinueWithTrustTypeDocumentsDetails() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	    PreviousLegalDocument legalDocumentObj= new PreviousLegalDocument(util);
	    legalDocumentObj.verifySaveAndContinueWithTrustTypeDocument();
	}
	
}
