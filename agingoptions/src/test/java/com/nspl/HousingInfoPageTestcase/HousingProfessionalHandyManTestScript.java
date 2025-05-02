package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.ProfessionalDetailsPage;
import com.Ao.HousingPage.HousingProfessionalHandyManPage;
import com.Ao.HousingPage.HousingProfessionalMortgageBrokerPage;
import com.Ao.HousingPage.HousingProfessional_realtor;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class HousingProfessionalHandyManTestScript extends BaseTest {

	@Test(priority = 1)
	public void verifyHandymanPageOnHousingProfessional() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		util.holdOn(Duration.ofSeconds(8));
		HousingProfessionalHandyManPage handymanProfessionalObj=   new HousingProfessionalHandyManPage(util);
		handymanProfessionalObj.GoToHandymanPageOnHousingInfo();
		util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionlObj= new ProfessionalDetailsPage(util);
		util.holdOn(Duration.ofSeconds(7));
		housingProfessionlObj.VerifyHandymanProfessional();;
		
	}
	@Test
	public void VerifyIdONotHaveHandymanCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		util.holdOn(Duration.ofSeconds(8));
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.IdoNotHavehandymanFunctionality();
	}
	@Test
	public void VerifyClickIDoNotHaveHandymanCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		util.holdOn(Duration.ofSeconds(8));
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.ClickIdoNotHaveHandyman();
	}
	@Test
	public void verifyToggleButton() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(8));
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.verifytoggleButton();

	}
	@Test
	public void verifyaddHandymanForPraimaryMember() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(8));
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.GoToHandymanPageOnHousingInfo();
		util.holdOn(Duration.ofSeconds(7));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.addProfessionalForPrimaryMember();
	}
	@Test
	public void VerifySaveAndAddAnotherPrimaryMemberHandymanDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.GoToHandymanPageOnHousingInfo();
		util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberProfessionalDetails();
	}
	@Test
	public void VerifySaveAndproceedPrimaryMemberHandyManDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.GoToHandymanPageOnHousingInfo();
		util.holdOn(Duration.ofSeconds(6));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util); 
		housingProfessionalObj.saveAndProceedPrimaryMemberProfessionalDetail();
		housingProfessionalObj.VerifyLandScapperPage();
	}
	@Test
	public void VerifySaveAndContinueSpouseHandymanDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.GoToHandymanPageOnHousingInfo();
		util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.saveAndContinueProfessionalDetailsForSpouse();
	}
	@Test
	public void VerifySaveAndAddAnotherSpouseHandymanDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.GoToHandymanPageOnHousingInfo();
		util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherSpouseProfessionalDetails();
	}
	@Test(enabled = false)
	public void VerifySaveAndProceedSpouseHandymanDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.GoToHandymanPageOnHousingInfo();
		util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndProceedSpouseHandyManDetails();
	}
	@Test
	public void VerifyCopySameDataFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.GoToHandymanPageOnHousingInfo();
		util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.copysamedataToSpouseProfessionalDetails();
	}
	@Test
	public void VerifyUpdateHandymanDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalHandyManPage housingHandyManObj=	 new HousingProfessionalHandyManPage(util);
		housingHandyManObj.GoToHandymanPageOnHousingInfo();
		util.holdOn(Duration.ofSeconds(3));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.UpdateProfessionalDetails();
	}
}


