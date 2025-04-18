package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.LegalInfoPage.LivingWillPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class LivingWillDetailsTestSript extends BaseTest{
	@Test(priority = 1)
	public void VerifyLivingWillDetailsPage() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	    LivingWillPage LivingWillPageObj= new LivingWillPage(util);
	    LivingWillPageObj.VerifyLivingWillDetailsPage();
	}
	
	
    @Test(priority = 5)
	public void verifyIWantMaximumTreatmentCheckedAsYes() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	    LivingWillPage LivingWillPageObj= new LivingWillPage(util);
	    LivingWillPageObj.verifyIWantMaximumTreatmentYes();
	    
		
	}
    @Test(priority = 2)
    public void SaveAndContinueIWantMaximumTreatMentYes() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	    LivingWillPage LivingWillPageObj= new LivingWillPage(util);
	    LivingWillPageObj.saveAndContinueIWantMaximumTreatMentYes();
    }
    @Test(priority = 3)
    public void SaveAndContinueIWantMaximumTreatmentNo() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	    LivingWillPage LivingWillPageObj= new LivingWillPage(util);
	    LivingWillPageObj.SaveAndContinueIWantMaximumTreatMentNo();
    }
    @Test(priority = 4)
  public void VerifySaveAndProceedLivingWillDetails() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	    LivingWillPage LivingWillPageObj= new LivingWillPage(util);
	    LivingWillPageObj.SaveAndProceedOrganDonationDetails();  
  }
    @Test(priority = 6)
    public void verifyIWantMaximumTreatmentCheckedAsNo() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	    LivingWillPage LivingWillPageObj= new LivingWillPage(util);
	    LivingWillPageObj.verifyIWantMaximumTreatmentNo();
    }
}
