package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.LegalInfoPage.BurialCremationPlanPageOr;
import com.agingoptions.LegalInfoPage.BurrialCreamtionPlanPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class BurialCremationPlanTestScript extends BaseTest {

 @Test(priority = 1,enabled = false)
 public void VerifyBurialCremationPlanPage() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.verifyBurialCremationPage();
}
	
 @Test(priority = 2,enabled = false)
  public void VerifyWhenWeCheckedCremationRadioButton() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.verifyWhenWeCheckedCremationRadioButton();

  }
 @Test(priority = 3,enabled = false)
 public void VerifyDoYouHaveBurialPlotCheckYesRadio() {
	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyDoYouHaveBurialPlotCheckYesRadio();
 }
	
  @Test(priority = 4,enabled = false)
 public void VerifyDoYouHaveBurialPlotCheckNoRadioButton() {
	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyDoYouHaveBurialPlotCheckNoRadioButton();
 }
  @Test(priority = 5,enabled = false)
  public void VerifyIsYourBurialCremationPrepaid_YesChecked() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyIsYourBurialCremationPrepaid_YesChecked();
  }
 @Test(priority=2)
  public void VerifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_YesRadioBT() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.verifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_YesRadioBT();
  }
  @Test(priority = 1)
  public void VerifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_NoRadioChecked() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.verifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_NoRadioChecked(); 
  }
@Test(priority =3 )
  public void VerifyDidTheCompanyGiveYouAContractNoRadioChecked() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyDidTheCompanyGiveYouAContractNoRadioChecked();
  }
@Test(priority = 4)
  public void VerifyHaveYouMadeArrangementsForHandlingYesChecked() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyHaveYouMadeArrangementsForHandlingYesChecked();  
  }
    @Test(priority = 5)
  
   public void VerifyHaveYouMadeArrangementsForHandlingNoChecked() {
	   LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyHaveYouMadeArrangementsForHandlingNoChecked();
   }
   
}
