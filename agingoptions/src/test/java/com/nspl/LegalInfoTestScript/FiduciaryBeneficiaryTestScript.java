package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.LegalInfoPage.FiduciaryBeneficiaryPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class FiduciaryBeneficiaryTestScript  extends BaseTest{
   
	@Test
	public void VerifyFiduciaryBeneficiaryPage() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyFiduciaryBeneficiaryPage();
	}
	
	@Test(priority = 2)
	public void VerifyPrimaryMemberAndSpouseFiduciaryBeneficiaryPageMemberList() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyPrimaryMemberAndSposueFidbenList();
	}
	@Test
	public void VerifyTableFiduciaryBeneficiaryCheckboxFunctionality() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyTableFidBenCheckBox();
	}
}
