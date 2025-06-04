package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.LegalInfoPage.BeneficiaryLetterPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class BeneficiaryLetterTestScript extends BaseTest {
	
	@Test(priority = 1)
	public void verifyBeneficiaryLetterPage() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	   BeneficiaryLetterPage beneficiaryPageObj=  new BeneficiaryLetterPage(util);
	   beneficiaryPageObj.verifyBeneficiryLetterPage();
	}
	@Test(priority = 2)
	public void VerifyBeneficiaryLetterDetails() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	     BeneficiaryLetterPage beneficiaryPageObj=  new BeneficiaryLetterPage(util);
		   beneficiaryPageObj.AddBeneficiaryLetterDetails();
	}
	@Test(priority = 3)
   public void VerifyClickGenerateButtonWithoutSelectingAsset() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));
	     BeneficiaryLetterPage beneficiaryPageObj=  new BeneficiaryLetterPage(util);
		   beneficiaryPageObj.verifyClickGenerateButtonWithoutSelectingAsset();   
   }
}
