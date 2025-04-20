package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.LegalInfoPage.OrganDonationDetails;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class OrganDonationDetailsTestSripts extends BaseTest {

   @Test(priority = 1)
	public void VerifyOrganDonationDetailsPage() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		util.holdOn(Duration.ofSeconds(10));
		OrganDonationDetails OrganDonationObj= new OrganDonationDetails(util);
		OrganDonationObj.verifyOrganDonationDetailsPage();
	}
   @Test(priority = 3)
	public void VerifyDoYouWishToBeAnOrganDonnerYes() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		util.holdOn(Duration.ofSeconds(10));
		OrganDonationDetails OrganDonationObj= new OrganDonationDetails(util);
		OrganDonationObj.VerifyDoYouWishToBeAnOrganDonnerYes();
	}
   @Test(priority = 5)
	public void VerifySaveAndContinueDoYouWishToBeAnOrganDonnerYes() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		util.holdOn(Duration.ofSeconds(10));
		OrganDonationDetails OrganDonationObj= new OrganDonationDetails(util);
		OrganDonationObj.VerifySaveAndContinueDoYouWishToBeAnOrganDonnerYes();
	}
	@Test(priority = 4)
	public void VerifySaveAndProceedDoYouWishToBeAnOrganDonnerNo() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		util.holdOn(Duration.ofSeconds(10));
		OrganDonationDetails OrganDonationObj= new OrganDonationDetails(util);
		OrganDonationObj.VerifySaveAndProceedDoYouWishToBeAnOrganDonnerNo();
	}
	@Test(priority = 2)
	public void VerifySaveAndContinueWishToDonateYourBodyForScientificResearch_Yes() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
		util.holdOn(Duration.ofSeconds(10));
		OrganDonationDetails OrganDonationObj= new OrganDonationDetails(util);
		OrganDonationObj.VerifySaveAndContinueWishToDonateYourBodyForScientificResearch_Yes();
	}
}
