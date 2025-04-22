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
}
