package com.nspl.agingoptions.healthpage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.health.FamilyMedicalHistory;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class MarriedUserFamilyMedicalHistoryTestCases extends BaseTest{


	@Test(priority=1)
	public void TC_010_Health_FamilyMedicalHistoryLivingParentInfoDetails() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(10));
		lpoLanding.clickHealthModule();
		FamilyMedicalHistory familyMedical=    new FamilyMedicalHistory(util);
		util.holdOn(Duration.ofSeconds(5));
		familyMedical.clickFamilyMedicalHistorySideBarLink();
		familyMedical.openMyParentInfoAccordian();
		util.holdOn(Duration.ofSeconds(5));
		String primaryMemberFatherExpectedAge="79";
		familyMedical.inputPrimaryMemberFathersCurrentAge(primaryMemberFatherExpectedAge);
		String primaryMemberMotherExpectedAge="84";
		familyMedical.inputPrimaryMemberMotherCurrentAge(primaryMemberMotherExpectedAge);
		String spouseFatherExpectedAge="77";
		familyMedical.inputSpouseFathersCurrentAge(spouseFatherExpectedAge);
		String spouseMotherExpectedAge="82";
		familyMedical.inputSpouseMotherCurrentAge(spouseMotherExpectedAge);
		familyMedical.clickSaveProceedToPrimaryCarePhysicianBT();
		util.holdOn(Duration.ofSeconds(5));
		familyMedical.clickFamilyMedicalHistorySideBarLink();
		util.holdOn(Duration.ofSeconds(3));
		String primaryFatherActualText=      familyMedical.getPrimaryFatherCurrentAgeInputText();
		String primaryMotherActualText=      familyMedical.getPrimarySpouseCurrentAgeInputText();
		String spouseFatherActualText=      familyMedical.getSpouseFatherCurrentAgeInputText();
		String spouseMotherActualText=     familyMedical.getSpouseMotherCurrentAgeInputText();
		util.verifyActualExpectedText(primaryMemberFatherExpectedAge,primaryFatherActualText ,"Primary Member Father’s current age" );
		util.verifyActualExpectedText(primaryMemberMotherExpectedAge,primaryMotherActualText ,"Primary Member Mother's current age" );
		util.verifyActualExpectedText(spouseFatherExpectedAge,spouseFatherActualText , "Spouse Father’s current age");
		util.verifyActualExpectedText(spouseMotherExpectedAge,spouseMotherActualText ,"Spouse Mother's Current Age" );

	}

	@Test(priority=2)
	public void TC_011_Health_familyMedicalHistoryNonLivingParentInfoDetails() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		lpoLanding.clickHealthModule();
		FamilyMedicalHistory familyMedical=    new FamilyMedicalHistory(util);
		util.holdOn(Duration.ofSeconds(5));
		familyMedical.clickFamilyMedicalHistorySideBarLink();
		familyMedical.openMyParentInfoAccordian();;
		util.holdOn(Duration.ofSeconds(5));
		familyMedical.clickPrimaryMemberIsYourFatherCurrentlyLivingNoRadioButton();
		familyMedical.clickprimaryMemberIsYourMotherLivingNoRadioBT();
		familyMedical.clickSpouseIsYourFatherCurrentlyLivingNoRadioButton();
		familyMedical.clickSpouseIsYourMotherLivingNoRadioBT();
		String primaryFatherAgeDeathExpectedText="94";
		familyMedical.inputPrimaryFatherAgeAtDeath(primaryFatherAgeDeathExpectedText);
		String primaryFatherCauseOfDeathDesc="Incident";
		familyMedical.inputPrimaryMemberFatherCauseOfDeath(primaryFatherCauseOfDeathDesc);
		String spouseFatherAgeDeathExpectedText="91";
		familyMedical.inputSpouseFatherAgeAtDeath(spouseFatherAgeDeathExpectedText);
		String spouseFatherCauseOfDeathDescExpectedText="Dementia";
		familyMedical.inputSpouseFatherCauseOfDeath(spouseFatherCauseOfDeathDescExpectedText);
		String PrimaryMotherAgeAtDeathExpectedText="89";
		familyMedical.inputprimaryMemberMothersAgeAtDeathTB(PrimaryMotherAgeAtDeathExpectedText);
		String primarMotherCauseOfDeathDesc="Due to Illness";
		familyMedical.inputPrimaryMemberMothersCauseAtDeath(primarMotherCauseOfDeathDesc);
		String spouseMotherAgeAtDeathExpectedText="86";
		familyMedical.inputSpuseMothersAgeAtDeathTB(spouseMotherAgeAtDeathExpectedText);
		String spouseMotherCauseAtDeathActualText="While Sleeping";
		familyMedical.inputSpouseMothersCauseAtDeath(spouseMotherCauseAtDeathActualText);
		familyMedical.clickSaveProceedToPrimaryCarePhysicianBT();
		util.holdOn(Duration.ofSeconds(10));
		familyMedical.clickFamilyMedicalHistorySideBarLink();
		util.holdOn(Duration.ofSeconds(5));
		String primaryFatherAgeDeathActualText=	familyMedical.getPrimaryMemberFatherAgeAtDeathActualText();
		String spouseFatherAgeAtDeathActualText=	familyMedical.getSpouseFatherAgeAtDeathActualText();
		String primaryFatherCauseOfDeathActualText=	familyMedical.getPrimaryMemberFatherCauseOfDeathActualText();
		String spouseFatherCauseOfDeathActualText=	familyMedical.getSpouseFatherCauseOfDeathAcutalText();
		String primaryMemberMotherAgeAtDeathActualText=	familyMedical.getPrimaryMemberMotherAgeAtDeathActualText();
		String spouseMotherAgeAtDeathActualText=	familyMedical.getSpouseMotherAgeAtDeathActualText();
		String primaryMemberMotherCauseOfDeathActualText=	familyMedical.getPrimaryMemberMotherCauseOfDeathActualText();
		String spouseMotherCauseOfDeathActualText=	familyMedical.getSpouseMotherCauseOfDeathActualText();
		util.verifyActualExpectedText(primaryFatherAgeDeathActualText,primaryFatherAgeDeathExpectedText ,"Primary Member Father’s age at death");
		util.verifyActualExpectedText(spouseFatherAgeAtDeathActualText,spouseFatherAgeDeathExpectedText ,"Spouse Father’s age at death");
		util.verifyActualExpectedText(primaryFatherCauseOfDeathActualText,primaryFatherCauseOfDeathDesc ,"Primary Father’s age at death");
		util.verifyActualExpectedText(spouseFatherCauseOfDeathActualText,spouseFatherCauseOfDeathDescExpectedText ,"Spouse Father’s age at death");
		util.verifyActualExpectedText(primaryMemberMotherAgeAtDeathActualText,PrimaryMotherAgeAtDeathExpectedText ,"Primary Member Mother's age at death");
		util.verifyActualExpectedText(spouseMotherAgeAtDeathActualText,spouseMotherAgeAtDeathExpectedText ,"Spouse Mother's age at death");
		util.verifyActualExpectedText(primaryMemberMotherCauseOfDeathActualText,primarMotherCauseOfDeathDesc ,"Primary Mother's Cause at death");
		util.verifyActualExpectedText(spouseMotherCauseOfDeathActualText, spouseMotherCauseAtDeathActualText,"Spouse Mother's Cause at death");
	}

	@Test(priority=3)
	public void TC_012_FamilyMedicalHistoryNonLivingParentInfoDetails() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		FamilyMedicalHistory familyMedical=    new FamilyMedicalHistory(util);
		util.holdOn(Duration.ofSeconds(5));
		familyMedical.clickFamilyMedicalHistorySideBarLink();
		familyMedical.openMySiblingInfoAccordian();
		String actualPrimaryMemberLivingSibling="3";
		familyMedical.inputPrimaryMemberNoOfLivingSiblingValue(actualPrimaryMemberLivingSibling);
		String actualSpouseLivingSibling="2";	
		familyMedical.inputSpouseNoOfLivingSiblingValue(actualSpouseLivingSibling);
		String actualPrimaryMemberDeceasedSibling="1";
		familyMedical.inputPrimaryMemberNoOfDeceasedSiblingValue(actualPrimaryMemberDeceasedSibling);
		String spouseNoOfDeceasedSibling="2";
		familyMedical.inputSpouseNoOfDeceasedSiblingValue(spouseNoOfDeceasedSibling);
		util.holdOn(Duration.ofSeconds(1));
		familyMedical.clickSaveProceedToPrimaryCarePhysicianBT();
		util.holdOn(Duration.ofSeconds(8));
		familyMedical.clickFamilyMedicalHistorySideBarLink();
		util.holdOn(Duration.ofSeconds(5));
		familyMedical.openMySiblingInfoAccordian();
		String primaryMemberActualLivingChild=	familyMedical.getPrimaryMemberNoOfLivingSiblingActualValue();
		String spouseActualLivingChild=      familyMedical.getSpouseNoOfLivingSiblingActualValue();
		String primaryMemberNoOfDeceasedSibling=    familyMedical.getPrimaryMemberNoOfDeceasedSiblingActualValue();
		String spouseNoOfDeceasedChild=     familyMedical.getSpouseNoOfDeceasedSiblingActualValue();
		util.verifyActualExpectedText(primaryMemberActualLivingChild,actualPrimaryMemberLivingSibling , "Primary Member Number of living siblings");
		util.verifyActualExpectedText(spouseActualLivingChild,actualSpouseLivingSibling , "Spouse Number of living siblings");
		util.verifyActualExpectedText(primaryMemberNoOfDeceasedSibling,actualPrimaryMemberDeceasedSibling , "Primary Member Number of deceased siblings");
		util.verifyActualExpectedText(spouseNoOfDeceasedSibling,spouseNoOfDeceasedChild , "Spouse Number of deceased siblings");

	}

	@Test(priority=4)
	public void TC_013_FamilyMedicalHistoryMyFamilyMedicalHistoryYesRadioButton() {
		LpoLandingPage lpoLanding=    new LpoLandingPage(util);
		lpoLanding.clickHealthModule();
		FamilyMedicalHistory familyMedi=	new FamilyMedicalHistory(util);
		familyMedi.clickFamilyMedicalHistorySideBarLink();
		familyMedi.openMyFamilyMedcialHistoryAccordian();
		familyMedi.clickPrimaryMemberAreYouAdoptedYesRadioBT();
		familyMedi.clickSpouseAreYouAdoptedYesRadioBT();
		familyMedi.clickSaveProceedToPrimaryCarePhysicianBT();
		util.holdOn(Duration.ofSeconds(2));
		familyMedi.clickFamilyMedicalHistorySideBarLink();
		familyMedi.openMyFamilyMedcialHistoryAccordian();
		familyMedi.PrimaryMemberAreYouAdoptedYesRadioButtonSelectionStatus();
		familyMedi.spouseAreYouAdoptedYesRadioButtonSelectionStatus();
	}

	@Test(priority=5)
	public void TC_014_FamilyMedicalHistoryMyFamilyMedicalHistoryNoRadioButton() {
		LpoLandingPage lpoLanding=    new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(3));
		lpoLanding.clickHealthModule();
		FamilyMedicalHistory familyMedi=	new FamilyMedicalHistory(util);
		util.holdOn(Duration.ofSeconds(5));
		familyMedi.clickFamilyMedicalHistorySideBarLink();
		familyMedi.openMyFamilyMedcialHistoryAccordian();
		util.holdOn(Duration.ofSeconds(3));
		familyMedi.clickprimaryMemberAreYouAdoptedNoRadioBT();
		util.holdOn(Duration.ofSeconds(1));
		familyMedi.clickSpouseAreYouAdoptedNoRadioBT();
		familyMedi.clickdementiaCheckboxes();
		familyMedi.clickParkinsonsCheckboxes();
		familyMedi.clickHeartDiseaaseCheckboxes();
		familyMedi.clickStrokeCheckboxes();
		familyMedi.clickDiabetesCheckboxes();
		familyMedi.clickBloodPressureCheckboxes();
		familyMedi.clickElevatedCholesterolCheckboxes();
		familyMedi.clickglaucomaCheckboxes();
		familyMedi.clickSaveProceedToPrimaryCarePhysicianBT();
		util.holdOn(Duration.ofSeconds(4));
		familyMedi.clickFamilyMedicalHistorySideBarLink();
		familyMedi.openMyFamilyMedcialHistoryAccordian();
		familyMedi.dementiaCheckBoxStatus();
		familyMedi.parkinsonsCheckBoxStatus();
		familyMedi.heartDiseaseCheckBoxStatus();
		familyMedi.strokeCheckBoxStatus();
		familyMedi.diabetesCheckBoxStatus();
		familyMedi.bloodPressureCheckBoxStatus();
		familyMedi.elevatedCheckBoxStatus();
		familyMedi.glaucomeCheckBoxStatus();
	}







}

