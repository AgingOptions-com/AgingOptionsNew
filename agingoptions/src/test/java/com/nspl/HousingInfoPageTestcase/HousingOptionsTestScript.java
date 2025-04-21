package com.nspl.HousingInfoPageTestcase;


import org.testng.annotations.Test;
import java.time.Duration;



import com.Ao.HousingPage.HousingInfo;
import com.agingoptions.lpolandingpage.LpoLandingPage;

import com.nspl.agingoptions.webUtil.BaseTest;

public class HousingOptionsTestScript extends BaseTest {


	
	@Test(priority = 1 )
	public void verifyHousingInformation() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousingInfo HousinginfoObj= new HousingInfo(util); 
		HousinginfoObj.verifyHousingInformation(); 

	}
	@Test(priority = 2)
	public void verifySelectYesorNotSureCheckBox_IsYourHouseLivingIn____() {
		HousingInfo HousinginfoObj= new HousingInfo(util);
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousinginfoObj.verifyHousingInformation(); 
		util.holdOn(Duration.ofSeconds(8));
		HousinginfoObj.verifyCheckYes_NotSure_IsYourHousingLivingIn();
	}

	@Test(priority = 3)
	public void VerifySelectNoCheckBox_IsYourHousingLivingIn___() {
		HousingInfo HousinginfoObj= new HousingInfo(util); 
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousinginfoObj.verifyHousingInformation(); 
		HousinginfoObj.VerifyCheck_NoRadioButton_IsYourHousingLivingIn(); 
	}

	@Test(priority = 5)
	public void VerifyOnTheScaleOfOneTwoFiveOwnHomeDropDownSelection() throws InterruptedException {
		HousingInfo HousinginfoObj= new HousingInfo(util);
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousinginfoObj.verifyHousingInformation(); 
		util.holdOn(Duration.ofSeconds(10));
		HousinginfoObj.verifyCheckNotSure_IsYourHousingLivingIn();
		HousinginfoObj.onTheScaleOfTwoToFiveDropDownSelection();


	}
	@Test(priority = 4)
	public void VerifyOnTheScaleOfOneTwoFive_Select1() {
		
		HousingInfo HousinginfoObj= new HousingInfo(util); 
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousinginfoObj.verifyHousingInformation(); 
		util.holdOn(Duration.ofSeconds(8));
		HousinginfoObj.verifyCheckYes_IsYourHousingLivingIn();
		HousinginfoObj.OntheScaleOfOneToFive_select1();
	}

	@Test(priority = 6)
	public void VerifySaveAndContinueTheDetailsWithIstheHouseYouAreliving_Yes_And_Select1_OnTheScaleOnToFive(){
		HousingInfo HousinginfoObj= new HousingInfo(util); 
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousinginfoObj.verifyHousingInformation(); 
		util.holdOn(Duration.ofSeconds(8));
		HousinginfoObj.UpdateAndContinueThedetailsWithIstheHouse_yesCheck_and_OntheScaleOnFive_Select1(util.getProperty("ClosestRelativeDistanceInMile"));
	}
	@Test(priority = 8)
	public void VerifySaveAndNextToprofessional_TheDetailsWithIstheHouseYouAreliving_Notsure_And_Select1_OnTheScaleOnToFive() {
		HousingInfo HousinginfoObj= new HousingInfo(util); 
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousinginfoObj.verifyHousingInformation(); 
		util.holdOn(Duration.ofSeconds(8));
		HousinginfoObj.SaveAndProceedThedetailsWithIstheHouse_NotsureCheck_and_OntheScaleOnFive_Select1(util.getProperty("ClosestRelativeDistanceInMile"));
		util.holdOn(Duration.ofSeconds(4));
		HousinginfoObj.verifyHousingProfessionalPage();
		HousinginfoObj.gotoClickHousingOptions();
	}
	@Test(priority = 7)
	public void VerifyUpdateAndContinue_IsTheHousingYouAreLivingWithNoRadioButtonChecked() {
		HousingInfo HousinginfoObj= new HousingInfo(util); 
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousinginfoObj.verifyHousingInformation(); 
		util.holdOn(Duration.ofSeconds(8));
		HousinginfoObj.UpdateAndContinueTheDetailsIsTheHouseYouAreLivingWith_NoRadioButtonSelected(util.getProperty("RetirementPlace")); 
	}
	@Test(priority = 9)
	public void VerifySaveAndNextToProfessional_IsTheHousingYouAreLivingWithNoRadioButtonChecked() {
		HousingInfo HousinginfoObj= new HousingInfo(util); 
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousinginfoObj.verifyHousingInformation(); 
		util.holdOn(Duration.ofSeconds(4));
		HousinginfoObj.SaveAndNextToHousingProfessional_ThedetailsTheHousingYouAreLivingWith_NoRadioButtonSelected(util.getProperty("RetirementPlace")); 
		HousinginfoObj.gotoClickHousingOptions();
	}

	@Test (priority = 10)
	public void VerifyHowManyStoriesDoesItHaveDropdownContent() throws InterruptedException {
		HousingInfo HousinginfoObj= new HousingInfo(util); 
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		util.holdOn(Duration.ofSeconds(8));	
		HousinginfoObj.verifyHousingInformation(); 
		HousinginfoObj.verifyHowManyStoriesDoesItHaveOptions();

	}
	@Test(priority = 11)
	public void VerifyWhenWeSelectTwoThreeMoreOption_HowManyStoryDoesItHave() throws InterruptedException {
		HousingInfo HousinginfoObj= new HousingInfo(util);
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		util.holdOn(Duration.ofSeconds(8));
		HousinginfoObj.verifyHousingInformation(); 
		HousinginfoObj.VerifyWhenWeSelectTWoThreeAndMore_HowManyStoryDoesItHave(); 
	}
  @Test(priority = 12)
	public void VerifyUpdateAndContinue_SelectIsYourHouseLivingInNotsureCheckAndSelectTwoOntheScaleOfOneTwoFive() {
	  HousingInfo HousinginfoObj= new HousingInfo(util);
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		util.holdOn(Duration.ofSeconds(8));
		HousinginfoObj.VerifyUpdateAndContinueWhenSelectIsYourHouseLivingInYesCheckAndSelectTwoOntheScaleOfOneTwoFive(util.getProperty("ClosestRelativeDistanceInMile"));
		
	}
  @Test(priority = 13)
	public void VerifySaveAandNextProfessional_SelectIsYourHouseLivingInYesCheckAndSelectTwoOntheScaleOfOneTwoFive() {
		  HousingInfo HousinginfoObj= new HousingInfo(util);
			LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
			lpoLadning.clickHousingModule();
			util.holdOn(Duration.ofSeconds(8));	
			HousinginfoObj.VerifySaveAndProceedToProfessionalWhenSelectIsYourHouseLivingInYesCheckAndSelectTwoOntheScaleOfOneTwoFive();
			util.holdOn(Duration.ofSeconds(4));	
			HousinginfoObj.verifyHousingProfessionalPage();
			HousinginfoObj.gotoClickHousingOptions();
            
            
	}
}
