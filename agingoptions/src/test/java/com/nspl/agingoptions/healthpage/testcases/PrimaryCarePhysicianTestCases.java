package com.nspl.agingoptions.healthpage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.health.PrimaryCarePhysician;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class PrimaryCarePhysicianTestCases extends BaseTest {


	@Test(priority=1)
	public void TC_015_PrimaryMemberIDontHavePrimaryCarePhyscian() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		PrimaryCarePhysician primaryCare=	new PrimaryCarePhysician(util);
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickHealthProfessionalLK();
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.checkIDontHavePrimaryCarePhysicianCheckBox();
		primaryCare.clickProceedTOSpouseBT();
		util.holdOn(Duration.ofSeconds(3));
		primaryCare.clickPrimaryMemberToggleButton();
		util.holdOn(Duration.ofSeconds(2));		
		primaryCare.iDontHavePrimaryCarePhysicianCheckboxStatus();
	}

	@Test(priority = 2)
	public void TC_016_SpouseIDontHavePrimaryCarePhyscian() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		PrimaryCarePhysician primaryCare=	new PrimaryCarePhysician(util);
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickHealthProfessionalLK();
		util.holdOn(Duration.ofSeconds(1));
		primaryCare.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(2));
		primaryCare.checkIDontHavePrimaryCarePhysicianCheckBox();
		primaryCare.clickSaveProceedToSpecialistBT();
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickPrimaryCarePhysicianLK();
		util.holdOn(Duration.ofSeconds(2));
		primaryCare.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(1));
		primaryCare.iDontHavePrimaryCarePhysicianCheckboxStatus();
	}
	
	@Test(priority=3)
	public void TC_017_inputPrimaryMemberCarePhysicianAndSave() {
		
		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		PrimaryCarePhysician primaryCare=	new PrimaryCarePhysician(util);
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickHealthProfessionalLK();
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.uncheckIDontHavePrimaryCarePhysician();
		String expectedFirstName="Dr Varun";
		primaryCare.inputFirstName(expectedFirstName);
		String expectedLastName="Gupta";
		primaryCare.inputLastName(expectedLastName);
		primaryCare.clickSpecialityDropDown();
		primaryCare.clickARNPDropDownOption();
		String expectedAffiliatedHospital="Dr Varun Gupta Health Specialst";
		primaryCare.inputAffiliatedHospital(expectedAffiliatedHospital);
		String expectedWebsiteName="https://varunguptahealthspecialist.com";
		primaryCare.inputWebsiteName(expectedWebsiteName);
		String expectedYearAsDoctorSeen="3";
		primaryCare.inputYearAsYourDoctorSeen(expectedYearAsDoctorSeen);
		primaryCare.clickAreYouHappyWithHisCareYesRadioButton();
		primaryCare.clickIsThisPhysicianIsAGeritricianYesRadioBT();
		primaryCare.clickAreTheyCertifiedYesRadioBT();
		String expectedNotesForTheAgents="Agent will have to perform well";
		primaryCare.inputNotesForAgents(expectedNotesForTheAgents);
		primaryCare.openContactAndAddressInfoAccordian();
		String expectedEmail="varungupta238@maildrop.cc";
		String expectedCellNum="9876459834";
		primaryCare.inputPrimaryContactEmail(expectedCellNum, expectedEmail);
		//primaryCare.clickAddAnotherContactButton();
		primaryCare.inputAddress("122002");
		primaryCare.clickSaveAndProceedToSpouseBT();
		util.holdOn(Duration.ofSeconds(3));
		primaryCare.clickPrimaryMemberToggleButton();
	}
	

}
