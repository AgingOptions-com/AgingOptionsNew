package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.HousingProfessionalDetailsPage;
import com.Ao.HousingPage.HousingProfessional_realtor;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class HousingProfessional_RealtorTestscript extends BaseTest {

	@Test(priority =1)
	public void verifyRealtorPageOnHousingProfessional() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();


	}
	@Test(priority =2)
	public void VerifyIdONotHaveRealtorCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.IdoNotHaveRealtorFunctionality();
	}
	@Test(priority =3)
	public void VerifyClickIDoNotHaveRealtorCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.ClickIdoNotHaveRealtor();
	}
	@Test(priority =4)
	public void verifyToggleButton() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.verifytoggleButton();
	}
	@Test(priority = 5)
	public void verifyaddRealtorForPraimaryMember() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
		util.holdOn(Duration.ofSeconds(3));
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.addProfessionalForPrimaryMember();

	}
	@Test(priority = 6)
	public void VerifySaveAndAddAnotherPrimaryMemberRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
		util.holdOn(Duration.ofSeconds(3));
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberProfessionalDetails();
	}

	@Test(priority = 7)
	public void VerifySaveAndproceedPrimaryMemberRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
		util.holdOn(Duration.ofSeconds(3));
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util); 
		housingProfessionalObj.saveAndProceedPrimaryMemberProfessionalDetail();

	}
	@Test(priority = 8)
	public void VerifySaveAndContinueSpouseRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
		util.holdOn(Duration.ofSeconds(3));
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.saveAndContinueProfessionalDetailsForSpouse();
	}
	@Test(priority = 9)
	public void VerifySaveAndAddAnotherSpouseRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
		util.holdOn(Duration.ofSeconds(3));
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherSpouseProfessionalDetails();
	}
	@Test(priority = 10)
	public void VerifySaveAndProceedSpouseRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
		util.holdOn(Duration.ofSeconds(3));
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndProceedSpouseProfessionalDetails();
	}

	@Test(priority = 11)
	public void VerifyCopySameDataFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
		util.holdOn(Duration.ofSeconds(3));
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.copysamedataToSpouseProfessionalDetails();
	}
	@Test(priority = 12)
	public void VerifyUpdateRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
		util.holdOn(Duration.ofSeconds(3));
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.UpdateProfessionalDetails();
	}


}
