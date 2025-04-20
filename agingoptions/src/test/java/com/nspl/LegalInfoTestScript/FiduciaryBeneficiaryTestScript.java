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
	
	@Test(enabled = false)
	public void VerifyPrimaryMemberAndSpouseFiduciaryBeneficiaryPageMemberList() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyPrimaryMemberAndSposueFidbenList();
	}
	@Test(enabled = false)
	public void VerifyClientTableFiduciaryBeneficiaryCheckboxFunctionality() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifyClientTableFidBenCheckBox();
	   util.holdOn(Duration.ofSeconds(5));
	}
	@Test(enabled = false)
	public void VerifySpouseTableFiduciaryBeneficiaryCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifySpouseTableFidBenCheckBox();
	   util.holdOn(Duration.ofSeconds(5));
	}
	@Test(enabled = false)
	public void VerifyAddFiduciaryBeneficiaryDetails() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyAddFiduciary();
	}
	
	@Test(enabled = false)
	public void VerifyWhenWeMakeFiduciaryMemberAsSpecialNeeds() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyWhenWeMakeFiduciaryMemberspecialNeeds();	
	}
	@Test(priority = 1)
	public void VerifyWhenWeMakeFiduciaryBeneficiryMemberDeceased() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifyWhenWeMakeFiduciaryBenfeficiaryMemberDeceased();
	}
	@Test(priority = 2)
	public void VerifyWhenWeMakeSpecialNeedsMemberAsFiduciary() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.verifyWhenWeMakeSpecialNeedsMemberFiduciary();
	}
	@Test(priority = 3)
	public void verifyAgeValidationForFiduciary() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	   FiduciaryBeneficiaryPage fidbenObj=  new FiduciaryBeneficiaryPage(util);
	   fidbenObj.VerifyAgeValidationForFiduciary();
	}
}
