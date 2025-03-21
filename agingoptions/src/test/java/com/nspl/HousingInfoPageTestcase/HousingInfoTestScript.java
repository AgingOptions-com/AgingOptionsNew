package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.nspl.agingoptions.webUtil.BaseTest_Sk;

public class HousingInfoTestScript extends BaseTest_Sk {
	
	@Test
	public void LoginWithClientAndverifypersonainformationPage() {
		loginPageObj.verifyvalidLogin(util.getProperty("emailId"), util.getProperty("Password"));
		loginPageObj.verifyOtpPage();
	
	  commonpage.hiturlOfYopmail();
      commonpage.Gotosearchemail(util.getProperty("emailId"));
      
     String otp= commonpage.GoTofindtextOfOTP();
     commonpage.gotoinputotp(otp);
     commonpage.GoToClickVerifyButton();
     try {
		Thread.sleep(Duration.ofSeconds(9));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     commonpage.verifyPersonalInfoPage();
	}
	@Test
	public void verifyHousingInformation() {
		loginPageObj.verifyvalidLogin(util.getProperty("emailId"), util.getProperty("Password"));
		loginPageObj.verifyOtpPage();
	
	  commonpage.hiturlOfYopmail();
      commonpage.Gotosearchemail(util.getProperty("emailId"));
      
     String otp= commonpage.GoTofindtextOfOTP();
     commonpage.gotoinputotp(otp);
     commonpage.GoToClickVerifyButton();
     try {
		Thread.sleep(Duration.ofSeconds(9));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     commonpage.verifyPersonalInfoPage();
     commonpage.goToClickHousingButtonUnderSetUp();

	}

}
