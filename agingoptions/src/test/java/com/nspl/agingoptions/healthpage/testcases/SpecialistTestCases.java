package com.nspl.agingoptions.healthpage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.health.PrimaryCarePhysician;
import com.agingoptions.health.Specialists;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class SpecialistTestCases extends BaseTest {


	@Test(priority=1)
	public void TC_019_PrimaryMemberSpecialistIDonHave() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		PrimaryCarePhysician primaryCare=	new PrimaryCarePhysician(util);
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickHealthProfessionalLK();	
		Specialists specialist=	new Specialists(util);
		util.holdOn(Duration.ofSeconds(5));
		specialist.clickSpecilistLink();
		specialist.clickPrimaryMemberToggleButton();
		util.holdOn(Duration.ofSeconds(2));
		specialist.clickIdonHaveSpecialistCheckbox();
		specialist.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(1));
		specialist.clickPrimaryMemberToggleButton();
		util.holdOn(Duration.ofSeconds(1));
		specialist.IdontHaveSpecialistRadioButtonStatus();

	}

	@Test(priority=2)
	public void TC_020_SpouseSpecialistIDonHave() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		PrimaryCarePhysician primaryCare=	new PrimaryCarePhysician(util);
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickHealthProfessionalLK();	
		Specialists specialist=	new Specialists(util);
		specialist.clickSpecilistLink();
		util.holdOn(Duration.ofSeconds(5));
		specialist.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(3));
		specialist.clickIdonHaveSpecialistCheckbox();
		util.holdOn(Duration.ofSeconds(5));
		specialist.clickPrimaryMemberToggleButton();
		util.holdOn(Duration.ofSeconds(2));
		specialist.clickSpouseToggleButton();
		specialist.IdontHaveSpecialistRadioButtonStatus();

	}

	@Test(priority=3)
	public void TC_021_PrimaryMemberSpecialistSaveDetailsSaveContinueLaterButton() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		PrimaryCarePhysician primaryCare=	new PrimaryCarePhysician(util);
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickHealthProfessionalLK();	
		Specialists specialist=	new Specialists(util);
		specialist.clickSpecilistLink();
		util.holdOn(Duration.ofSeconds(5));
		specialist.clickPrimaryMemberToggleButton();
		specialist.clickAddSpecialistButton();
		String expectedFirstName="Dr Kavya";
		specialist.inputFirstName(expectedFirstName);
		String expectedLastName="Verma";
		specialist.inputLastName(expectedLastName);
		specialist.selectAddictionAndSubstanceAbuse();
		util.holdOn(Duration.ofSeconds(2));
		String expectedAffiliatedHospital="Dr Kavya Verma Health Specialst";
		specialist.inputAffiliatedHospital(expectedAffiliatedHospital);
		String expectedWebsite="https://kavyavermahealth.com";
		specialist.inputWebsiteLink(expectedWebsite);
		String expectedYearAsSeen="4";
		util.holdOn(Duration.ofSeconds(2));
		specialist.inputyearAsYourDoctorSeen(expectedYearAsSeen);
		specialist.clickAreYouHappyWithHisCareYesRadioButton();
		String expectedNotesForAgent="You have to work good.";
		specialist.inputNotesForAgents(expectedNotesForAgent);
		primaryCare.openContactAndAddressInfoAccordian();
		primaryCare.inputAddress("122002");
		String expectedMobileNum="9238492934";
		String expectedEmail="kavayaverma934@maildrop.cc";
		primaryCare.inputPrimaryContactEmail(expectedMobileNum, expectedEmail);
		specialist.clickSaveContinueLaterButton();
		util.holdOn(Duration.ofSeconds(7));
		specialist.clickEditIcon();
		String actualFirstName=	primaryCare.getPrimaryCarePhysicianActualFirstName();
		String actualLastName=primaryCare.getPrimaryCarePhysicianActualLastName();
		String actualSpecialityText=primaryCare.getPrimaryCarePhysicianActualSpeciality();
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
		util.verifyActualExpectedText(actualSpecialityText,"Addiction and Substance Abuse Counseling" , "Speciality");
		util.verifyActualExpectedText(actualAffiliatedText,expectedAffiliatedHospital , "Affiliated hospital (s)");
		util.verifyActualExpectedText(webSiteLinkActualText,expectedWebsite , "Website Link");
		util.verifyActualExpectedText(yearAsSeenActualText,expectedYearAsSeen , "Years as your doctor seen");
		util.verifyActualExpectedText(notesToAgentsActualText,expectedNotesForAgent , "Notes for Agents");
		util.verifyActualExpectedText(actualPhysicalText,"Physical Address" , "Physical Address");
		util.verifyActualExpectedText(actualPrimaryContactInnerText,"Primary contact" , "Primary Contact");
		specialist.clickPreviousButton();
	}

	@Test(priority=4)
	public void TC_022_SpouseSpecialistSaveDetailsSaveAndContinueButton() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		PrimaryCarePhysician primaryCare=	new PrimaryCarePhysician(util);
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.clickHealthProfessionalLK();	
		Specialists specialist=	new Specialists(util);
		specialist.clickSpecilistLink();
		util.holdOn(Duration.ofSeconds(5));
		specialist.clickSpouseToggleButton();
		specialist.clickAddSpecialistButton();
		String expectedFirstName="Dr Nikita";
		specialist.inputFirstName(expectedFirstName);
		String expectedLastName="Roy";
		specialist.inputLastName(expectedLastName);
		specialist.selectAddictionAndSubstanceAbuse();
		util.holdOn(Duration.ofSeconds(2));
		String expectedAffiliatedHospital="Dr Nikita Roy Health Specialst";
		specialist.inputAffiliatedHospital(expectedAffiliatedHospital);
		String expectedWebsite="https://nikitaroyhealth.com";
		specialist.inputWebsiteLink(expectedWebsite);
		String expectedYearAsSeen="4";
		util.holdOn(Duration.ofSeconds(2));
		specialist.inputyearAsYourDoctorSeen(expectedYearAsSeen);
		specialist.clickAreYouHappyWithHisCareYesRadioButton();
		String expectedNotesForAgent="You have to work well to perform action.";
		specialist.inputNotesForAgents(expectedNotesForAgent);
		primaryCare.openContactAndAddressInfoAccordian();
		primaryCare.inputAddress("122002");
		String expectedMobileNum="9485454544";
		String expectedEmail="nikitaroy934@maildrop.cc";
		primaryCare.inputPrimaryContactEmail(expectedMobileNum, expectedEmail);
		specialist.clickSaveContinueLaterButton();
		util.holdOn(Duration.ofSeconds(7));
		specialist.clickEditIcon();
		String actualFirstName=	primaryCare.getPrimaryCarePhysicianActualFirstName();
		String actualLastName=primaryCare.getPrimaryCarePhysicianActualLastName();
		String actualSpecialityText=primaryCare.getPrimaryCarePhysicianActualSpeciality();
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
		util.verifyActualExpectedText(actualSpecialityText,"Addiction and Substance Abuse Counseling" , "Speciality");
		util.verifyActualExpectedText(actualAffiliatedText,expectedAffiliatedHospital , "Affiliated hospital (s)");
		util.verifyActualExpectedText(webSiteLinkActualText,expectedWebsite , "Website Link");
		util.verifyActualExpectedText(yearAsSeenActualText,expectedYearAsSeen , "Years as your doctor seen");
		util.verifyActualExpectedText(notesToAgentsActualText,expectedNotesForAgent , "Notes for Agents");
		util.verifyActualExpectedText(actualPhysicalText,"Physical Address" , "Physical Address");
		util.verifyActualExpectedText(actualPrimaryContactInnerText,"Primary contact" , "Primary Contact");
		specialist.clickPreviousButton();
	}

  



}
