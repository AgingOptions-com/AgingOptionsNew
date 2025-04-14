package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.LegalInfoPage.FiduciaryBeneficiaryPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class FiduciaryBeneficiaryTestScript  extends BaseTest{
   
	@Test(enabled =false )
	public void VerifyFiduciaryBeneficiaryPage() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyFiduciaryBeneficiaryPage();
	}
	
	@Test(priority = 2 ,enabled = false)
	public void VerifyPrimaryMemberAndSpouseFiduciaryBeneficiaryPageMemberList() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyPrimaryMemberAndSposueFidbenList();
	}
	@Test(priority = 1)
	public void VerifyClientTableFiduciaryBeneficiaryCheckboxFunctionality() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifyClientTableFidBenCheckBox();
	   util.holdOn(Duration.ofSeconds(5));
	}
	@Test(priority = 3)
	public void VerifySpouseTableFiduciaryBeneficiaryCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifySpouseTableFidBenCheckBox();
	   util.holdOn(Duration.ofSeconds(5));
	}
	@Test(priority = 2)
	public void VerifyAddFiduciaryBeneficiaryDetailsWithoutAddressAndContact() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyAddFiduciary();
	}
}
