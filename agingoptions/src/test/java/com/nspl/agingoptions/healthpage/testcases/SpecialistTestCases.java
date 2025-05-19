package com.nspl.agingoptions.healthpage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.health.PrimaryCarePhysician;
import com.agingoptions.health.Specialists;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class SpecialistTestCases extends BaseTest {


	@Test(priority=1)
	public void TC_019_PrimaryMemberSpecialistIDontHave() {

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
	public void TC_020_SpouseSpecialistIDontHave() {

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
		CommonCode common=	new CommonCode(util);
		common.unCheckCopySameDataToSpouseCheckBox();
		specialist.clickAddSpecialistButton();
		util.holdOn(Duration.ofSeconds(1));
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
		util.holdOn(Duration.ofSeconds(10));
		specialist.clickEditIcon();
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
		CommonCode common=	new CommonCode(util);
		common.unCheckCopySameDataToSpouseCheckBox();
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
		specialist.clickNikitaRoyEditIcon();
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
		util.verifyActualExpectedText(actualSpecialityText,"Addiction and Substance Abuse Counseling" , "Speciality");
		util.verifyActualExpectedText(actualAffiliatedText,expectedAffiliatedHospital , "Affiliated hospital (s)");
		util.verifyActualExpectedText(webSiteLinkActualText,expectedWebsite , "Website Link");
		util.verifyActualExpectedText(yearAsSeenActualText,expectedYearAsSeen , "Years as your doctor seen");
		util.verifyActualExpectedText(notesToAgentsActualText,expectedNotesForAgent , "Notes for Agents");
		util.verifyActualExpectedText(actualPhysicalText,"Physical Address" , "Physical Address");
		util.verifyActualExpectedText(actualPrimaryContactInnerText,"Primary contact" , "Primary Contact");
	}

	@Test(priority=5)
	public void TC_023_PrimarySpecialistSaveDetailsSaveAndAddAnotherButtonAndSameAsSpouse() {

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
		util.holdOn(Duration.ofSeconds(2));
		String expectedFirstName="Dr Sonam";
		specialist.inputFirstName(expectedFirstName);
		util.holdOn(Duration.ofSeconds(1));
		specialist.checkCopySameDataToSpouseCheckBox();
		String expectedLastName="Yadav";
		specialist.inputLastName(expectedLastName);
		specialist.SelectAcupunctureDDOption();
		util.holdOn(Duration.ofSeconds(2));
		String expectedAffiliatedHospital="Dr Sonam Yadav Health Specialst";
		specialist.inputAffiliatedHospital(expectedAffiliatedHospital);
		String expectedWebsite="https://sonamyadavhealth.com";
		specialist.inputWebsiteLink(expectedWebsite);
		util.holdOn(Duration.ofSeconds(3));
		specialist.clickAreYouHappyWithHisCareYesRadioButton();
		util.holdOn(Duration.ofSeconds(2));
		String expectedYearAsSeen="2";
		specialist.inputyearAsYourDoctorSeen(expectedYearAsSeen);
		String expectedNotesForAgent="You have to work well to perform action.";
		specialist.inputNotesForAgents(expectedNotesForAgent);
		//specialist.checkCopySameDataToSpouseCheckBox();
		primaryCare.openContactAndAddressInfoAccordian();
		primaryCare.inputAddress("122002");
		String expectedMobileNum="8734837498";
		String expectedEmail="sonamyadav934@maildrop.cc";
		primaryCare.inputPrimaryContactEmail(expectedMobileNum, expectedEmail);
		specialist.clickSaveAddAnotherButton();
		util.holdOn(Duration.ofSeconds(7));
		specialist.clickPreviousButton();
		util.holdOn(Duration.ofSeconds(2));
		specialist.clickAcupnctureSpecialistEditIcon();
		util.holdOn(Duration.ofSeconds(2));
		String actualFirstName=	primaryCare.getPrimaryCarePhysicianOrSpecialistActualFirstName();
		String actualLastName=primaryCare.getPrimaryCarePhysicianOrSpecialistActualLastName();
		String actualSpecialityText=primaryCare.getPrimaryCarePhysicianOrSpecialistActualSpeciality();
		String actualAffiliatedText=	primaryCare.getAffiliatedHospitalActualText();
		String webSiteLinkActualText=primaryCare.getWebSiteLinkAcutalText();
		util.holdOn(Duration.ofSeconds(2));
		String yearAsSeenActualText=    primaryCare.getYearAsYourDoctorText();    
		String notesToAgentsActualText=           primaryCare.getNotesToAgentsText(); 
		util.holdOn(Duration.ofSeconds(5));
		primaryCare.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(1));
		String actualPhysicalText=  primaryCare.getPhysicalAddressText();
		String actualPrimaryContactInnerText=	primaryCare.getPrimaryAddressText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName,expectedLastName , "Last Name");
		util.verifyActualExpectedText(actualSpecialityText,"Acupuncture" , "Speciality");
		util.verifyActualExpectedText(actualAffiliatedText,expectedAffiliatedHospital , "Affiliated hospital (s)");
		util.verifyActualExpectedText(webSiteLinkActualText,expectedWebsite , "Website Link");
		util.verifyActualExpectedText(yearAsSeenActualText,expectedYearAsSeen , "Years as your doctor seen");
		util.verifyActualExpectedText(notesToAgentsActualText,expectedNotesForAgent , "Notes for Agents");
		util.verifyActualExpectedText(actualPhysicalText,"Physical Address" , "Physical Address");
		util.verifyActualExpectedText(actualPrimaryContactInnerText,"Primary contact" , "Primary Contact");
		specialist.clickPreviousButton();
		specialist.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(2));
		String copySameDataActualEmail=	specialist.getAcupunctureSpecialistEmail();
		util.verifyActualExpectedText(expectedEmail, copySameDataActualEmail, "Copy same data to spouse");

	}


	@Test(priority=6)
	public void TC_024_PrimaryMemberSpecialistSaveDetailsSaveAndProceedToSpouseButton() {

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
		CommonCode common=	new CommonCode(util);
		String expectedFirstName="Dr Sandhya";
		specialist.inputFirstName(expectedFirstName);
		String expectedLastName="Tiwari";
		common.clickCopySameDataCheckbox();
		common.unCheckCopySameDataToSpouseCheckBox();
		specialist.inputLastName(expectedLastName);
		specialist.selectOtherSpecilaistOptions();
		util.holdOn(Duration.ofSeconds(2));
		String otherExpectedValue="Teeth Specialist";
		specialist.inputOtherTextBox(otherExpectedValue);
		String expectedAffiliatedHospital="Dr Sandhya Tiwari Health Specialst";
		specialist.inputAffiliatedHospital(expectedAffiliatedHospital);
		String expectedWebsite="https://sandhyatiwarihealth.com";
		specialist.inputWebsiteLink(expectedWebsite);
		String expectedYearAsSeen="7";
		util.holdOn(Duration.ofSeconds(2));
		specialist.inputyearAsYourDoctorSeen(expectedYearAsSeen);
		specialist.clickAreYouHappyWithHisCareYesRadioButton();
		String expectedNotesForAgent="You have to check very well to perform action.";
		specialist.inputNotesForAgents(expectedNotesForAgent);
		primaryCare.openContactAndAddressInfoAccordian();
		String expectedMobileNum="9894839493";
		String expectedEmail="sandhyatiwari934@maildrop.cc";
		primaryCare.inputPrimaryContactEmail(expectedMobileNum, expectedEmail);
		specialist.clickProceedToSpouseBT();
		util.holdOn(Duration.ofSeconds(7));
		specialist.clickPrimaryMemberToggleButton();
		specialist.clickOtherTeethSpecialistEditIcon();
		String actualFirstName=	primaryCare.getPrimaryCarePhysicianOrSpecialistActualFirstName();
		String actualLastName=primaryCare.getPrimaryCarePhysicianOrSpecialistActualLastName();
		String actualSpecialityText=primaryCare.getPrimaryCarePhysicianOrSpecialistActualSpeciality();
		String actualAffiliatedText=	primaryCare.getAffiliatedHospitalActualText();
		String webSiteLinkActualText=primaryCare.getWebSiteLinkAcutalText();
		String yearAsSeenActualText=    primaryCare.getYearAsYourDoctorText();    
		String notesToAgentsActualText=           primaryCare.getNotesToAgentsText(); 
		util.holdOn(Duration.ofSeconds(2));
		String otherActualText=	specialist.getOtherSpecialistInputValue();
		util.holdOn(Duration.ofSeconds(3));
		primaryCare.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(1));
		String actualPrimaryContactInnerText=	primaryCare.getPrimaryAddressText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName,expectedLastName , "Last Name");
		util.verifyActualExpectedText(actualSpecialityText,"Other" , "Speciality");
		util.verifyActualExpectedText(otherActualText,otherExpectedValue , "Speciality");
		util.verifyActualExpectedText(actualAffiliatedText,expectedAffiliatedHospital , "Affiliated hospital (s)");
		util.verifyActualExpectedText(webSiteLinkActualText,expectedWebsite , "Website Link");
		util.verifyActualExpectedText(yearAsSeenActualText,expectedYearAsSeen , "Years as your doctor seen");
		util.verifyActualExpectedText(notesToAgentsActualText,expectedNotesForAgent , "Notes for Agents");
		util.verifyActualExpectedText(actualPrimaryContactInnerText,"Primary contact" , "Primary Contact");
		common.clickPreviousButton();
	}

	@Test(priority=7)
	public void TC_025_SpouseSpecialistSaveDetailsSaveAndAddAnotherButton() {

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
		util.holdOn(Duration.ofSeconds(2));
		CommonCode common=	new CommonCode(util);
		common.clickCopySameDataCheckbox();
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName="Reenu";
		specialist.inputFirstName(expectedFirstName);
		String expectedLastName="Dubey";
		specialist.inputLastName(expectedLastName);
		specialist.selectAddictionMedicineSpeciality();
		util.holdOn(Duration.ofSeconds(2));
		String expectedAffiliatedHospital="Dr Reenu Dubey Health Specialst";
		specialist.inputAffiliatedHospital(expectedAffiliatedHospital);
		String expectedWebsite="https://reenudubeyhealth.com";
		specialist.inputWebsiteLink(expectedWebsite);
		util.holdOn(Duration.ofSeconds(5));
		String expectedYearAsSeen="2";
		specialist.inputyearAsYourDoctorSeen(expectedYearAsSeen);
		specialist.clickAreYouHappyWithHisCareYesRadioButton();
		String expectedNotesForAgent="You have to work well to perform action.";
		specialist.inputNotesForAgents(expectedNotesForAgent);
		primaryCare.openContactAndAddressInfoAccordian();
		String expectedMobileNum="8734837498";
		String expectedEmail="reenudubey677@maildrop.cc";
		primaryCare.inputPrimaryContactEmail(expectedMobileNum, expectedEmail);
		specialist.clickSaveAddAnotherButton();
		util.holdOn(Duration.ofSeconds(7));
		specialist.clickPreviousButton();
		specialist.clickAddictionMedicineEditIcon();
		util.holdOn(Duration.ofSeconds(3));
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
		String actualPrimaryContactInnerText=	primaryCare.getPrimaryAddressText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName,expectedLastName , "Last Name");
		util.verifyActualExpectedText(actualSpecialityText,"Addiction Medicine" , "Speciality");
		util.verifyActualExpectedText(actualAffiliatedText,expectedAffiliatedHospital , "Affiliated hospital (s)");
		util.verifyActualExpectedText(webSiteLinkActualText,expectedWebsite , "Website Link");
		util.verifyActualExpectedText(yearAsSeenActualText,expectedYearAsSeen , "Years as your doctor seen");
		util.verifyActualExpectedText(notesToAgentsActualText,expectedNotesForAgent , "Notes for Agents");
		util.verifyActualExpectedText(actualPrimaryContactInnerText,"Primary contact" , "Primary Contact");
		specialist.clickPreviousButton();
		specialist.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(2));

	}

	@Test(priority=8)
	public void TC_026_SpouseSpecialistSaveDetailsSaveAndProceedToHealthInsurance() {

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
		CommonCode common=	new CommonCode(util);
		common.unCheckCopySameDataToSpouseCheckBox();
		util.holdOn(Duration.ofSeconds(4));
		String expectedFirstName="Dr Avantika";
		specialist.inputFirstName(expectedFirstName);
		String expectedLastName="Sharma";
		specialist.inputLastName(expectedLastName);
		specialist.selectAddictionPsychiatrySpecialistOptions();
		util.holdOn(Duration.ofSeconds(2));
		String expectedAffiliatedHospital="Dr Avantika Sharma Health Specialst";
		specialist.inputAffiliatedHospital(expectedAffiliatedHospital);
		String expectedWebsite="https://avantikasharmahealth.com";
		specialist.inputWebsiteLink(expectedWebsite);
		util.holdOn(Duration.ofSeconds(5));
		String expectedYearAsSeen="7";
		specialist.inputyearAsYourDoctorSeen(expectedYearAsSeen);
		specialist.clickAreYouHappyWithHisCareYesRadioButton();
		String expectedNotesForAgent="You have to work well to perform action.";
		specialist.inputNotesForAgents(expectedNotesForAgent);
		primaryCare.openContactAndAddressInfoAccordian();
		String expectedMobileNum="9384398434";
		String expectedEmail="avantikasharma677@maildrop.cc";
		primaryCare.inputPrimaryContactEmail(expectedMobileNum, expectedEmail);
		specialist.clickSaveProceedToHealthInsuranceButton();
		specialist.waitUntilToasterMessageisHide();
		primaryCare.clickHealthProfessionalLK();
		util.holdOn(Duration.ofSeconds(2));
		specialist.clickSpecilistLink();
		util.holdOn(Duration.ofSeconds(2));
		specialist.clickSpouseToggleButton();

		util.holdOn(Duration.ofSeconds(7));
		specialist.clickAddictionPsychiatryEditBTTable();
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
		String actualPrimaryContactInnerText=	primaryCare.getPrimaryAddressText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName,expectedLastName , "Last Name");
		util.verifyActualExpectedText(actualSpecialityText,"Addiction Psychiatry" , "Speciality");
		util.verifyActualExpectedText(actualAffiliatedText,expectedAffiliatedHospital , "Affiliated hospital (s)");
		util.verifyActualExpectedText(webSiteLinkActualText,expectedWebsite , "Website Link");
		util.verifyActualExpectedText(yearAsSeenActualText,expectedYearAsSeen , "Years as your doctor seen");
		util.verifyActualExpectedText(notesToAgentsActualText,expectedNotesForAgent , "Notes for Agents");
		util.verifyActualExpectedText(actualPrimaryContactInnerText,"Primary contact" , "Primary Contact");
		specialist.clickPreviousButton();
		specialist.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(2));

	}





}
