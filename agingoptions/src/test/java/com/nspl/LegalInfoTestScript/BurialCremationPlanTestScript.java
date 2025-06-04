package com.nspl.LegalInfoTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.LegalInfoPage.BurialCremationPlanPageOr;
import com.agingoptions.LegalInfoPage.BurrialCreamtionPlanPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class BurialCremationPlanTestScript extends BaseTest {

 @Test(priority = 1)
 public void VerifyBurialCremationPlanPage() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.verifyBurialCremationPage();
}
	
 @Test(priority = 2)
  public void VerifyWhenWeCheckedCremationRadioButton() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.verifyWhenWeCheckedCremationRadioButton();

  }
 @Test(priority = 3)
 public void VerifyDoYouHaveBurialPlotCheckYesRadio() {
	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyDoYouHaveBurialPlotCheckYesRadio();
 }
	
  @Test(priority = 4)
 public void VerifyDoYouHaveBurialPlotCheckNoRadioButton() {
	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyDoYouHaveBurialPlotCheckNoRadioButton();
 }
  @Test(priority = 5)
  public void VerifyIsYourBurialCremationPrepaid_YesChecked() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyIsYourBurialCremationPrepaid_YesChecked();
  }
 @Test(priority=7)
  public void VerifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_YesRadioBT() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.verifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_YesRadioBT();
  }
  @Test(priority = 6)
  public void VerifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_NoRadioChecked() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.verifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_NoRadioChecked(); 
  }
@Test(priority =8 )
  public void VerifyDidTheCompanyGiveYouAContractNoRadioChecked() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyDidTheCompanyGiveYouAContractNoRadioChecked();
  }
@Test(priority = 10)
  public void VerifyHaveYouMadeArrangementsForHandlingYesChecked() {
	  LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyHaveYouMadeArrangementsForHandlingYesChecked();  
  }
    @Test(priority = 9)
  
   public void VerifyHaveYouMadeArrangementsForHandlingNoChecked() {
	   LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyHaveYouMadeArrangementsForHandlingNoChecked();
   }
    @Test(priority = 11)
    public void VerifyWouldYouLikeToMakeArrangementYes() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.VerifyWouldYouLikeToMakeArrangementYes();
	     
    }
    @Test(priority = 12)
    public void VerifyWouldYouLikeMakeArrangementNoChecked() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.verifyWouldYouLikeMakeArrangementNoChecked();
    }
    @Test(priority = 13)
    public void VerifyWouldYouLikeTohaveSomeoneContactYouYesChecked() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.WouldYouLikeTohaveSomeoneContactYouYes();
    }
    @Test(priority =14)
    public void VerifyWouldYouLikeToHaveSomeOneContactYouNoChecked() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.WouldYouLikeToHaveSomeOneContactYouNoChecked();
    }
    @Test(enabled = false)
    public void SaveAndContinueBurialcremationPlanDetails_WithYesCheck() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickLegalModule();
	     util.holdOn(Duration.ofSeconds(10));	
	     BurrialCreamtionPlanPage BurialCremationObj  =new BurrialCreamtionPlanPage(util);
	     BurialCremationObj.saveAndContinueBurialCremationPlanDetails();
    }
}
