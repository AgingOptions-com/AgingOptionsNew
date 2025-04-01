package com.nspl.HousingInfoPageTestcase;

import org.testng.annotations.Test;

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
}
