package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.HousingProfessionalDetailsPage;
import com.Ao.HousingPage.HousingProfessional_realtor;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class HousingProfessional_RealtorTestscript extends BaseTest {

	@Test(priority =1, enabled = false)
public void verifyRealtorPageOnHousingProfessional() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
			
		
}
	@Test(priority =2, enabled = false)
	public void VerifyIdONotHaveRealtorCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.IdoNotHaveRealtorFunctionality();
	}
	@Test(priority =3, enabled = false)
	public void VerifyClickIDoNotHaveRealtorCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.ClickIdoNotHaveRealtor();
	}
	@Test(priority =4, enabled = false)
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
	HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
	housingProfessionalObj.addRealtorForPrimaryMember();
	
	}
	@Test(priority = 6)
	public void VerifySaveAndAddAnotherPrimaryMemberRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberRealtorDetails();
	}
	
	@Test(priority = 7)
	 public void VerifySaveAndproceedPrimaryMemberRealtorDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util); 
			housingProfessionalObj.saveAndProceedPrimaryMemberRealtorDetail();
	 
	 }
	@Test(priority = 8)
	public void VerifySaveAndContinueSpouseRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.saveAndContinueRealtorDetailsForSpouse();
	}
	@Test(priority = 9)
	public void VerifySaveAndAddAnotherSpouseRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherSpouseRealtorDetails();
	}
	@Test(priority = 10)
	public void VerifySaveAndProceedSpouseRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndProceedSpouseRealtorDetails();
	}
	
	@Test(priority = 11)
	public void VerifyCopySameDataFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.copysamedataToSpouseRealtorDetails();
	}
	 @Test(priority = 12)
	public void VerifyUpdateRealtorDetails() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
			housingProfessionalObj.UpdateRealtorDetails();
	}
	
	
}
