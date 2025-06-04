package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.LegalInfoPage.FiduciaryBeneficiaryPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class FiduciaryBeneficiaryTestScript  extends BaseTest{
   
	@Test(priority = 1, enabled = false) 
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
	@Test(priority = 3)
	public void VerifyClientTableFiduciaryBeneficiaryCheckboxFunctionality() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifyClientTableFidBenCheckBox();
	   util.holdOn(Duration.ofSeconds(5));
	}
	@Test(priority = 4)
	public void VerifySpouseTableFiduciaryBeneficiaryCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifySpouseTableFidBenCheckBox();
	   util.holdOn(Duration.ofSeconds(5));
	}
	@Test(priority = 5)
	public void VerifyAddFiduciaryBeneficiaryDetails() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyAddFiduciary();
	}
	
	@Test(priority = 6)
	public void VerifyWhenWeMakeFiduciaryMemberAsSpecialNeeds() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyWhenWeMakeFiduciaryMemberspecialNeeds();	
	}
	@Test(priority = 7)
	public void VerifyWhenWeMakeFiduciaryBeneficiryMemberDeceased() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifyWhenWeMakeFiduciaryBenfeficiaryMemberDeceased();
	}
	@Test(priority = 8)
	public void VerifyWhenWeMakeSpecialNeedsMemberAsFiduciary() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyWhenWeMakeSpecialNeedsMemberFiduciary();
	}
	@Test(priority = 9)
	public void verifyAgeValidationForFiduciary() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifyAgeValidationForFiduciary();
	}
}
