package com.nspl.agingoptions.healthpage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.health.PrimaryCarePhysician;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class PrimaryCarePhysicianTestCases extends BaseTest {


	@Test(priority=1, enabled=true)
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

	@Test(priority = 2, enabled=true)
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
		util.holdOn(Duration.ofSeconds(8));
		primaryCare.clickPrimaryMemberToggleButton();
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.uncheckIDontHavePrimaryCarePhysician();
		primaryCare.openPersonalDetailsAccoordian();
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
		//		primaryCare.clickAreYouHappyWithHisCareYesRadioButton();
		//		primaryCare.clickIsThisPhysicianIsAGeritricianYesRadioBT();
		//		primaryCare.clickAreTheyCertifiedYesRadioBT();
		String expectedNotesForTheAgents="Agent will have to perform well";
		primaryCare.inputNotesForAgents(expectedNotesForTheAgents);
		primaryCare.openContactAndAddressInfoAccordian();
		String expectedEmail="varungupta238@maildrop.cc";
		String expectedCellNum="9876459834";
		primaryCare.inputPrimaryContactEmail(expectedCellNum, expectedEmail);
		//primaryCare.clickAddAnotherContactButton();
		primaryCare.inputAddress("122002");
		primaryCare.clickSaveAndProceedToSpouseBT();
		util.holdOn(Duration.ofSeconds(10));
		primaryCare.clickPrimaryMemberToggleButton();
		util.holdOn(Duration.ofSeconds(4));
		String actualFirstName=	primaryCare.getPrimaryCarePhysicianOrSpecialistActualFirstName();
		String actualLastName=primaryCare.getPrimaryCarePhysicianOrSpecialistActualLastName();
		String actualSpecialityText=primaryCare.getPrimaryCarePhysicianOrSpecialistActualSpeciality();
		String actualAffiliatedText=	primaryCare.getAffiliatedHospitalActualText();
		String webSiteLinkActualText=primaryCare.getWebSiteLinkAcutalText();
		String yearAsSeenActualText=    primaryCare.getYearAsYourDoctorText();    
		String notesToAgentsActualText=           primaryCare.getNotesToAgentsText(); 
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(1));
		String actualPhysicalText=  primaryCare.getPhysicalAddressText();
		String actualPrimaryContactInnerText=	primaryCare.getPrimaryAddressText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName,expectedLastName , "Last Name");
		util.verifyActualExpectedText(actualSpecialityText,"Advanced Registered Nurse Practitioner (ARNP)" , "Speciality");
		util.verifyActualExpectedText(actualAffiliatedText,expectedAffiliatedHospital , "Affiliated hospital (s)");
		util.verifyActualExpectedText(webSiteLinkActualText,expectedWebsiteName , "Website Link");
		util.verifyActualExpectedText(yearAsSeenActualText,expectedYearAsDoctorSeen , "Years as your doctor seen");
		util.verifyActualExpectedText(notesToAgentsActualText,expectedNotesForTheAgents , "Notes for Agents");
		util.verifyActualExpectedText(actualPhysicalText,"Physical Address" , "Physical Address");
		util.verifyActualExpectedText(actualPrimaryContactInnerText,"Primary contact" , "Primary Contact");

	}

	@Test(priority=4)
	public void TC_018_inputSpouseCarePhysicianAndSave() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		PrimaryCarePhysician primaryCare=	new PrimaryCarePhysician(util);
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickHealthProfessionalLK();
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(1));
		primaryCare.uncheckIDontHavePrimaryCarePhysician();
		primaryCare.openPersonalDetailsAccoordian();
		String expectedFirstName="Dr Sangeeta";
		primaryCare.inputFirstName(expectedFirstName);
		String expectedLastName="Sharma";
		primaryCare.inputLastName(expectedLastName);
		primaryCare.clickSpecialityDropDown();
		primaryCare.clickARNPDropDownOption();
		String expectedAffiliatedHospital="Dr Sangeet Sharma Health Specialst";
		primaryCare.inputAffiliatedHospital(expectedAffiliatedHospital);
		String expectedWebsiteName="https://sangeetasharmahealthspecialist.com";
		primaryCare.inputWebsiteName(expectedWebsiteName);
		String expectedYearAsDoctorSeen="3";
		primaryCare.inputYearAsYourDoctorSeen(expectedYearAsDoctorSeen);
		//		primaryCare.clickAreYouHappyWithHisCareYesRadioButton();
		//		primaryCare.clickIsThisPhysicianIsAGeritricianYesRadioBT();
		//		primaryCare.clickAreTheyCertifiedYesRadioBT();
		String expectedNotesForTheAgents="Agent will have to perform well";
		primaryCare.inputNotesForAgents(expectedNotesForTheAgents);
		primaryCare.openContactAndAddressInfoAccordian();
		String expectedEmail="sangeetasharma9893@maildrop.cc";
		String expectedCellNum="7098659877";
		primaryCare.inputPrimaryContactEmail(expectedCellNum, expectedEmail);
		//primaryCare.clickAddAnotherContactButton();
		primaryCare.inputAddress("122002");
		primaryCare.clickSaveProceedToSpecialistBT();
		util.holdOn(Duration.ofSeconds(10));
		primaryCare.clickPrimaryCarePhysicianLK();
		util.holdOn(Duration.ofSeconds(3));
		primaryCare.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(4));
		String actualFirstName=	primaryCare.getPrimaryCarePhysicianOrSpecialistActualFirstName();
		String actualLastName=primaryCare.getPrimaryCarePhysicianOrSpecialistActualLastName();
		String actualSpecialityText=primaryCare.getPrimaryCarePhysicianOrSpecialistActualSpeciality();
		String actualAffiliatedText=	primaryCare.getAffiliatedHospitalActualText();
		String webSiteLinkActualText=primaryCare.getWebSiteLinkAcutalText();
		String yearAsSeenActualText=    primaryCare.getYearAsYourDoctorText();    
		String notesToAgentsActualText=           primaryCare.getNotesToAgentsText(); 
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(1));
		String actualPhysicalText=  primaryCare.getPhysicalAddressText();
		String actualPrimaryContactInnerText=	primaryCare.getPrimaryAddressText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName,expectedLastName , "Last Name");
		util.verifyActualExpectedText(actualSpecialityText,"Advanced Registered Nurse Practitioner (ARNP)" , "Speciality");
		util.verifyActualExpectedText(actualAffiliatedText,expectedAffiliatedHospital , "Affiliated hospital (s)");
		util.verifyActualExpectedText(webSiteLinkActualText,expectedWebsiteName , "Website Link");
		util.verifyActualExpectedText(yearAsSeenActualText,expectedYearAsDoctorSeen , "Years as your doctor seen");
		util.verifyActualExpectedText(notesToAgentsActualText,expectedNotesForTheAgents , "Notes for Agents");
		util.verifyActualExpectedText(actualPhysicalText,"Physical Address" , "Physical Address");
		util.verifyActualExpectedText(actualPrimaryContactInnerText,"Primary contact" , "Primary Contact");

	}


}
