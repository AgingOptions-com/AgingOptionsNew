package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.HousingProfessionalLandScapperPage;
import com.Ao.HousingPage.HousingProfessionalMortgageBrokerPage;
import com.Ao.HousingPage.ProfessionalDetailsPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class HousingProfessionalLandScapperTestScript extends BaseTest{
	

	@Test(priority = 1)
	public void VerifyLandScapperPageOnHousingProfessional() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
	     util.holdOn(Duration.ofSeconds(10));
	     HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
	     landScapperObj.GoToLandScapperPageOnHousingInfo();
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionlObj= new ProfessionalDetailsPage(util);
        util.holdOn(Duration.ofSeconds(5));
		housingProfessionlObj.VerifyLandScapperPage();

}
	@Test(priority = 2)
	public void VerifyIdONotHaveLandScapperCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		  util.holdOn(Duration.ofSeconds(8));
		  HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
		     landScapperObj.IdoNotHaveLandScapperFunctionality();
	}
	@Test(priority = 3)
	public void VerifyClickIDoNotHaveLandScapperCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		util.holdOn(Duration.ofSeconds(8));
		 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
	     landScapperObj.ClickIdoNotHaveLandscapper();
	}
	@Test(priority = 4)
	public void verifyToggleButton() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(8));
		 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
	     landScapperObj.verifytoggleButton();
		
	}
	@Test(priority = 5)
	public void verifyaddLandScapperForPraimaryMember() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));
		 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
	     landScapperObj.GoToLandScapperPageOnHousingInfo();
	 util.holdOn(Duration.ofSeconds(8));
	 ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
	 housingProfessionalObj.addProfessionalForPrimaryMember();
}
	@Test(priority = 6)
	public void VerifySaveAndAddAnotherPrimaryMemberLandScapperDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
	     landScapperObj.GoToLandScapperPageOnHousingInfo();
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberProfessionalDetails();
}
	@Test(priority = 7)
	 public void VerifySaveAndproceedPrimaryMemberLandScapperDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
		     landScapperObj.GoToLandScapperPageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util); 
			housingProfessionalObj.saveAndProceedPrimaryMemberProfessionalDetail();
			housingProfessionalObj.VerifyFinancePage();
}
	@Test(priority = 8)
	 public void VerifySaveAndContinueSpouseLandScapperDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
		     landScapperObj.GoToLandScapperPageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.saveAndContinueProfessionalDetailsForSpouse();
}
	@Test(priority = 9)
	 public void VerifySaveAndAddAnotherSpouseLandScapperDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
		     landScapperObj.GoToLandScapperPageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.SaveAndAddAnotherSpouseProfessionalDetails();
}
	 @Test(priority = 10)
	 public void VerifySaveAndProceedSpouseLandScapperDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
		     landScapperObj.GoToLandScapperPageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.SaveAndProceedSpouseLandScapperDetails();
		}
	 @Test(enabled = false)
	 public void VerifyCopySameDataFunctionality() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
		     landScapperObj.GoToLandScapperPageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.copysamedataToSpouseProfessionalDetails();
}
	 @Test(priority = 11)
	 public void VerifyUpdateLandScappeDetails() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalLandScapperPage landScapperObj	=new HousingProfessionalLandScapperPage(util);
		     landScapperObj.GoToLandScapperPageOnHousingInfo();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.UpdateProfessionalDetails();
	}
}


