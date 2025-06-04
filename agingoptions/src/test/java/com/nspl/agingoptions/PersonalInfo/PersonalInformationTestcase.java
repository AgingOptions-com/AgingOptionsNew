package com.nspl.agingoptions.PersonalInfo;

import org.testng.annotations.Test;

import com.agingoptions.PersonalInfo.PersonalInfoPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class PersonalInformationTestcase extends BaseTest {

	@Test(priority = 1, enabled = false)
	public void VerifyPersonalInfoPage() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.VerifyPersonalInfoPage();
	}
	@Test(priority = 2, enabled = false)
	public void VerifyMaritalStatus() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.VerifyMarriedUser();
	}
	@Test(priority = 3,enabled = false)
	public void VerifyBackToParalegalFunctionality() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.verifybackToParalegalFunctionality();
	}
	@Test(priority = 1, enabled = false)
	public void VerifyActivationFormDataReflectingPersonalInfo() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.verifyActivationComparison();
	}
	@Test(priority = 2, enabled = false)
	public void SpousemaritalStatusDisable() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.verifyDisabilityOfSpouseMaritalstatusAndfollowingSection();
	}
	@Test(priority = 3, enabled = false)
	public void VerifyAreYouEmployedWithYesChecked() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.verifyClickAreYouEmployedYes();
	}
	@Test(priority = 4, enabled = false)
	public void VerifyAreYouEmployedWithNoChecked() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.verifyClickAreYouEmployedNo();
	}
	
	@Test(priority = 1)
	public void VerifyAreYouSpecialNeedsYes() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.VerifyAreDisableAndSpecialNeeds();
	}
  @Test(priority = 2)
	public void VerifyAreYouPlanningToRetireOverSeasYes() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.verifyAreYouPlanningToRetireOverSeasYes();
	}
  @Test(priority = 3)
	public void VerifyAreYouUSVeteranYes() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickPersonalInfoModule();
		PersonalInfoPage personal= new PersonalInfoPage(util);
		personal.VerifyAreYouUSVeteranYesRadioButtonChecked();
	}
}
