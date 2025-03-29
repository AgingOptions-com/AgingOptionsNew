package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.nspl.agingoptions.commoncode.HousingInfo;
import com.nspl.agingoptions.webUtil.BaseTest_Sk;

public class HousingInfoTestScript extends BaseTest_Sk {
	
	@Test(priority = 1 , enabled = false)
	public void LoginWithClientAndverifypersonainformationPage() {
		loginPageObj.verifyvalidLogin(util.getProperty("emailId"), util.getProperty("Password"));
		loginPageObj.verifyOtpPage();
	
	  commonpage.hiturlOfYopmail();
      commonpage.Gotosearchemail(util.getProperty("emailId"));
      
     String otp= commonpage.GoTofindtextOfOTP();
     commonpage.gotoinputotp(otp);
     commonpage.GoToClickVerifyButton();
     try {
		Thread.sleep(Duration.ofSeconds(13));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
    
     commonpage.verifyPersonalInfoPage();
	}
	@Test(priority = 2, enabled = false)
	public void verifyHousingInformation() {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 

	}
	@Test(priority = 3, enabled = false)
   public void verifySelecctYesorNotSureCheckBox_IsYourHouseLivingIn____() {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HousinginfoObj.verifyCheckYes_NotSure_IsYourHousingLivingIn();
   }
	
	@Test(priority = 4, enabled = false)
	public void VerifySelectNoCheckBox_IsYourHousingLivingIn___() {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 HousinginfoObj.VerifyCheck_NoRadioButton_IsYourHousingLivingIn(); 
	}
	
	@Test(priority = 5, enabled = false)
	public void VerifyOnTheScaleOfOneTwoFiveOwnHomeDropDownSelection() throws InterruptedException {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HousinginfoObj.verifyCheckYes_IsYourHousingLivingIn();
		 HousinginfoObj.onTheScaleOfTwoToFiveDropDownSelection();
		 
		 
	}
	@Test(priority = 6, enabled = false)
	public void VerifyOnTheScaleOfOneTwoFive_Select1() {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HousinginfoObj.verifyCheckYes_IsYourHousingLivingIn();
		 HousinginfoObj.OntheScaleOfOneToFive_select1();
	}
	
	@Test(priority = 7 ,enabled = false)
	public void VerifySaveAndContinueTheDetailsWithIstheHouseYouAreliving_Yes_And_Select1_OnTheScaleOnToFive(){
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 HousinginfoObj.UpdateAndContinueThedetailsWithIstheHouse_yesCheck_and_OntheScaleOnFive_Select1(util.getProperty("ClosestRelativeDistanceInMile"));
	}
	@Test(priority = 8 ,enabled = false)
	public void VerifySaveAndNextToprofessional_TheDetailsWithIstheHouseYouAreliving_Yes_And_Select1_OnTheScaleOnToFive() {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HousinginfoObj.SaveAndProceedThedetailsWithIstheHouse_yesCheck_and_OntheScaleOnFive_Select1(util.getProperty("ClosestRelativeDistanceInMile"));
		HousinginfoObj.verifyHousingProfessionalPage();
	}
	@Test(priority = 9)
	public void VerifyUpdateAndContinue_IsTheHousingYouAreLivingWithNoRadioButtonChecked() {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HousinginfoObj.UpdateAndContinueTheDetailsIsTheHouseYouAreLivingWith_NoRadioButtonSelected(util.getProperty("RetirementPlace")); 
	}
	@Test(priority = 10)
	public void VerifySaveAndNextToProfessional_IsTheHousingYouAreLivingWithNoRadioButtonChecked() {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HousinginfoObj.SaveAndNextToHousingProfessional_ThedetailsTheHousingYouAreLivingWith_NoRadioButtonSelected(util.getProperty("RetirementPlace")); 
	}
	 
	@Test (priority = 11)
	public void VerifyHowManyStoriesDoesItHaveDropdownContent() throws InterruptedException {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		 HousinginfoObj.verifyHowManyStoriesDoesItHaveOptions();
	  
	}
	@Test(priority = 12)
	public void VerifyWhenWeSelectTwoThreeMoreOption_HowManyStoryDoesItHave() throws InterruptedException {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HousinginfoObj.VerifyWhenWeSelectTWoThreeAndMore_HowManyStoryDoesItHave(); 
	}
	
	
}
