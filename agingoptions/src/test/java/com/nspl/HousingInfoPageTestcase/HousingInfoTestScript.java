package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.nspl.agingoptions.commoncode.HousingInfo;
import com.nspl.agingoptions.webUtil.BaseTest_Sk;

public class HousingInfoTestScript extends BaseTest_Sk {
	
	@Test(priority = 1 )
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
	@Test(priority = 2)
	public void verifyHousingInformation() {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 

	}
	@Test(priority = 3)
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
	
	@Test(priority = 4)
	public void VerifySelectNoCheckBox_IsYourHousingLivingIn___() {
		 HousingInfo HousinginfoObj= new HousingInfo(util); 
		 HousinginfoObj.GotoTheHousingInformation(); 
		 HousinginfoObj.VerifyCheck_NoRadioButton_IsYourHousingLivingIn(); 
	}
	
	@Test(priority = 5)
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
	@Test(priority = 6)
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
	
	@Test(priority = 7)
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
	@Test(priority = 8)
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
	
}
