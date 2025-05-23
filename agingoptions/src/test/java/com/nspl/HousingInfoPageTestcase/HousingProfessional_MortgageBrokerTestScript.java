package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.HousingProfessionalHandyManPage;
import com.Ao.HousingPage.HousingProfessionalMortgageBrokerPage;
import com.Ao.HousingPage.HousingProfessional_realtor;
import com.Ao.HousingPage.ProfessionalDetailsPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class HousingProfessional_MortgageBrokerTestScript  extends BaseTest {
	
	
	@Test(priority = 1)
	public void verifyMortgagePageOnHousingProfessional() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
	     util.holdOn(Duration.ofSeconds(10));
	     HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
		 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionlObj= new ProfessionalDetailsPage(util);
        util.holdOn(Duration.ofSeconds(5));
		housingProfessionlObj.verifyMortgageBroker();

}
	@Test(priority = 2)
	public void VerifyIdONotHaveRealtorCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		  util.holdOn(Duration.ofSeconds(8));
		 HousingProfessionalMortgageBrokerPage housingProfessionalObj =new HousingProfessionalMortgageBrokerPage(util);
		 housingProfessionalObj.IdoNotHaveMortgageFunctionality();
	}
	@Test(priority = 3)
	public void VerifyClickIDoNotHaveMortgageCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		util.holdOn(Duration.ofSeconds(8));
		 HousingProfessionalMortgageBrokerPage housingProfessionalObj =new HousingProfessionalMortgageBrokerPage(util);
		 housingProfessionalObj.ClickIdoNotHaveMortgage();
	}
	@Test(priority = 4)
	public void verifyToggleButton() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(8));
		HousingProfessionalMortgageBrokerPage housingProfessionalObj =new HousingProfessionalMortgageBrokerPage(util);
		 housingProfessionalObj.verifytoggleButton();
		
	}
	@Test(priority = 5)
	public void verifyaddMortgageForPraimaryMember() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));
	 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
	 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
	 util.holdOn(Duration.ofSeconds(8));
	 ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
	 housingProfessionalObj.addProfessionalForPrimaryMember();
}
	@Test(priority = 6)
	public void VerifySaveAndAddAnotherPrimaryMemberMortgageBrokerDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
		 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
		 util.holdOn(Duration.ofSeconds(4));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberProfessionalDetails();
}
	@Test(priority = 7)
	 public void VerifySaveAndproceedPrimaryMemberMortgageBrokerDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util); 
			housingProfessionalObj.saveAndProceedPrimaryMemberProfessionalDetail();
			housingProfessionalObj.VerifyHandymanProfessional();
}
	@Test(priority = 8)
	 public void VerifySaveAndContinueSpouseMortgageBrokerDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.saveAndContinueProfessionalDetailsForSpouse();
}
	@Test(priority = 9)
	 public void VerifySaveAndAddAnotherSpouseMortgageBrokerDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.SaveAndAddAnotherSpouseProfessionalDetails();
}
	 @Test(priority = 10)
	 public void VerifySaveAndProceedSpouseMortgageBrokerDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.SaveAndProceedSpouseMortgageDetails();
		}
	 @Test(enabled = false)
	 public void VerifyCopySameDataFunctionality() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.copysamedataToSpouseProfessionalDetails();
}
	 @Test(priority = 11)
	 public void VerifyUpdateMortgageBrokerDetails() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.UpdateProfessionalDetails();
	}
}