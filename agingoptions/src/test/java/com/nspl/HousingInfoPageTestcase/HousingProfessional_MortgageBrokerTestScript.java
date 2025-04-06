package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.HousingProfessionalDetailsPage;
import com.Ao.HousingPage.HousingProfessionalHandyManPage;
import com.Ao.HousingPage.HousingProfessionalMortgageBrokerPage;
import com.Ao.HousingPage.HousingProfessional_realtor;
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
		HousingProfessionalDetailsPage housingProfessionlObj= new HousingProfessionalDetailsPage(util);
        util.holdOn(Duration.ofSeconds(5));
		housingProfessionlObj.verifyMortgageBroker();

}
	@Test
	public void VerifyIdONotHaveRealtorCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		  util.holdOn(Duration.ofSeconds(8));
		 HousingProfessionalMortgageBrokerPage housingProfessionalObj =new HousingProfessionalMortgageBrokerPage(util);
		 housingProfessionalObj.IdoNotHaveMortgageFunctionality();
	}
	@Test
	public void VerifyClickIDoNotHaveMortgageCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		util.holdOn(Duration.ofSeconds(8));
		 HousingProfessionalMortgageBrokerPage housingProfessionalObj =new HousingProfessionalMortgageBrokerPage(util);
		 housingProfessionalObj.ClickIdoNotHaveMortgage();
	}
	@Test
	public void verifyToggleButton() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(8));
		HousingProfessionalMortgageBrokerPage housingProfessionalObj =new HousingProfessionalMortgageBrokerPage(util);
		 housingProfessionalObj.verifytoggleButton();
		
	}
	@Test
	public void verifyaddMortgageForPraimaryMember() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));
	 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
	 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
	 util.holdOn(Duration.ofSeconds(8));
	 HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
	 housingProfessionalObj.addProfessionalForPrimaryMember();
}
	@Test
	public void VerifySaveAndAddAnotherPrimaryMemberMortgageBrokerDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
		 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
		 util.holdOn(Duration.ofSeconds(4));
		HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberProfessionalDetails();
}
	@Test
	 public void VerifySaveAndproceedPrimaryMemberMortgageBrokerDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util); 
			housingProfessionalObj.saveAndProceedPrimaryMemberProfessionalDetail();
}
	@Test
	 public void VerifySaveAndContinueSpouseMortgageBrokerDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
			housingProfessionalObj.saveAndContinueProfessionalDetailsForSpouse();
}
	 public void VerifySaveAndAddAnotherSpouseMortgageBrokerDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
			housingProfessionalObj.SaveAndAddAnotherSpouseProfessionalDetails();
}
	 @Test
	 public void VerifySaveAndProceedSpouseMortgageBrokerDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			 HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
			housingProfessionalObj.SaveAndProceedSpouseMortgageDetails();
		}
	 @Test
	 public void VerifyCopySameDataFunctionality() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
			 util.holdOn(Duration.ofSeconds(4));
			HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
			housingProfessionalObj.copysamedataToSpouseProfessionalDetails();
}
	 @Test
	 public void VerifyUpdateMortgageBrokerDetails() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			HousingProfessionalMortgageBrokerPage MortgageBrokerObj=	new HousingProfessionalMortgageBrokerPage(util);
			 MortgageBrokerObj.GoToMortgaePageOnHousingInfo();
	    	util.holdOn(Duration.ofSeconds(3));
			HousingProfessionalDetailsPage housingProfessionalObj=	new HousingProfessionalDetailsPage(util);
			housingProfessionalObj.UpdateProfessionalDetails();
	}
}