package com.nspl.agingoptions.healthpage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.health.MedicationSupplementsPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class MedicationSupplementsTestCases extends BaseTest {


	@Test(priority = 1)
	public void TC_033_PrimaryMemberMedicationSaveAndContinueLaterButton() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(3));
		lpo.clickHealthModule();
		util.holdOn(Duration.ofSeconds(5));
		MedicationSupplementsPage medication=	new MedicationSupplementsPage(util);
		medication.clickMedicationSupplmentsSideBarLink();
		medication.clickAddMedictionButton();
		medication.selectAbcavirSulfateMedicationType();
		String expectedDosage="220MG";
		medication.inputDosage(expectedDosage);
		String expectedHowOftenDoYouTake="3 Times Per Day.";
		medication.inputHowOftenDoYouTakeThis(expectedHowOftenDoYouTake);
		String expectedTiming="Morning Evening";
		medication.inputTiming(expectedTiming);
		String expectedNotes="You have to take this timily.";
		medication.inputNote(expectedNotes);
		CommonCode common=	new CommonCode(util);
		common.clickSaveContinueLaterButton();
		medication.clickAbcavirMedicationEditIcon();
		String medicationTypeActualText=	medication.getMedicationTypeDropDownSelectedText();
		String actualDosageText=		medication.getDosageInputText();
		String actualHowOftenText=	medication.getHowOfternDoYouTakeInputText();
		String actualTimingText=		medication.getTimingInputText();
		String actualNotesText=	medication.getNoteInputText();
		util.verifyActualExpectedText(medicationTypeActualText,"Abacavir Sulfate" ,"Medication Type" );
		util.verifyActualExpectedText(actualDosageText,expectedDosage ,"Dosage" );
		util.verifyActualExpectedText(actualHowOftenText,expectedHowOftenDoYouTake ,"How often do you take this?" );
		util.verifyActualExpectedText(actualTimingText,expectedTiming ,"Timing" );
		util.verifyActualExpectedText(actualNotesText,expectedNotes ,"Note" );
		common.clickPreviousButton();

	}

	@Test(priority = 2)
	public void TC_034_PrimaryMemberMedicationSaveAndAddAnotherButton() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(3));
		lpo.clickHealthModule();
		util.holdOn(Duration.ofSeconds(5));
		MedicationSupplementsPage medication=	new MedicationSupplementsPage(util);
		medication.clickMedicationSupplmentsSideBarLink();
		medication.clickAddMedictionButton();
		medication.selectOtherMedicationTypeDropDown();
		String expectedOtherMedicationTextValue="Paracetamol Medicine";
		util.holdOn(Duration.ofSeconds(1));
		medication.inputOtherMedicationTypeDescription(expectedOtherMedicationTextValue);
		String expectedDosage="5 MG";
		medication.inputDosage(expectedDosage);
		String expectedHowOftenDoYouTake="1 Times Per Week.";
		medication.inputHowOftenDoYouTakeThis(expectedHowOftenDoYouTake);
		String expectedTiming="Evening";
		medication.inputTiming(expectedTiming);
		String expectedNotes="You have to take this 1 time per week.";
		medication.inputNote(expectedNotes);
		CommonCode common=	new CommonCode(util);
		common.clickSaveAddAnotherButton();
		util.holdOn(Duration.ofSeconds(3));
		common.clickPreviousButton();
		util.holdOn(Duration.ofSeconds(2));
		medication.clickOtherEditIcon();
		String medicationTypeActualText=	medication.getMedicationTypeDropDownSelectedText();
		String actualDosageText=		medication.getDosageInputText();
		String actualHowOftenText=	medication.getHowOfternDoYouTakeInputText();
		String actualTimingText=		medication.getTimingInputText();
		String actualNotesText=	medication.getNoteInputText();
		util.verifyActualExpectedText(medicationTypeActualText,"Other" ,"Medication Type" );
		util.verifyActualExpectedText(actualDosageText,expectedDosage ,"Dosage" );
		util.verifyActualExpectedText(actualHowOftenText,expectedHowOftenDoYouTake ,"How often do you take this?" );
		util.verifyActualExpectedText(actualTimingText,expectedTiming ,"Timing" );
		util.verifyActualExpectedText(actualNotesText,expectedNotes ,"Note" );
		util.holdOn(Duration.ofSeconds(1));
		String otherMedicationTypeActualValue=	medication.getOtherMedicationTypeInputValue();
		util.verifyActualExpectedText(otherMedicationTypeActualValue,expectedOtherMedicationTextValue , "Other Medication Text Box");
		common.clickPreviousButton();
	}

	@Test(priority=3)
	public void TC_035_PrimaryMemberMedicationSaveAndProceedToSpouseButton() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(3));
		lpo.clickHealthModule();
		util.holdOn(Duration.ofSeconds(5));
		MedicationSupplementsPage medication=	new MedicationSupplementsPage(util);
		medication.clickMedicationSupplmentsSideBarLink();
		medication.clickAddMedictionButton();
		medication.clickAbelcetMedicationTypeDropDown();
		util.holdOn(Duration.ofSeconds(1));
		String expectedDosage="5 MG";
		medication.inputDosage(expectedDosage);
		String expectedHowOftenDoYouTake="1 Times Per Week.";
		medication.inputHowOftenDoYouTakeThis(expectedHowOftenDoYouTake);
		String expectedTiming="Evening";
		medication.inputTiming(expectedTiming);
		String expectedNotes="You have to take this 1 time per week.";
		medication.inputNote(expectedNotes);
		CommonCode common=	new CommonCode(util);
		common.clickSaveAndProceedToSpouseBT();
		util.holdOn(Duration.ofSeconds(3));
		common.clickPrimaryMemberToggleButton();
		util.holdOn(Duration.ofSeconds(2));
		medication.clickAbelcetMedicationEditIcon();
		String medicationTypeActualText=	medication.getMedicationTypeDropDownSelectedText();
		String actualDosageText=		medication.getDosageInputText();
		String actualHowOftenText=	medication.getHowOfternDoYouTakeInputText();
		String actualTimingText=		medication.getTimingInputText();
		String actualNotesText=	medication.getNoteInputText();
		util.verifyActualExpectedText(medicationTypeActualText,"Abelcet" ,"Medication Type" );
		util.verifyActualExpectedText(actualDosageText,expectedDosage ,"Dosage" );
		util.verifyActualExpectedText(actualHowOftenText,expectedHowOftenDoYouTake ,"How often do you take this?" );
		util.verifyActualExpectedText(actualTimingText,expectedTiming ,"Timing" );
		util.verifyActualExpectedText(actualNotesText,expectedNotes ,"Note" );
		util.holdOn(Duration.ofSeconds(1));
		common.clickPreviousButton();
	}

	@Test(priority=4)
	public void TC_036_SpouseMedicationSaveAndContinueLaterButton() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(3));
		lpo.clickHealthModule();
		util.holdOn(Duration.ofSeconds(5));
		CommonCode common=	new CommonCode(util);
		MedicationSupplementsPage medication=	new MedicationSupplementsPage(util);
		medication.clickMedicationSupplmentsSideBarLink();
		common.clickSpouseToggleButton();
		medication.clickAddMedictionButton();
		medication.selectAbcavirSulfateMedicationType();
		String expectedDosage="220MG";
		medication.inputDosage(expectedDosage);
		String expectedHowOftenDoYouTake="3 Times Per Day.";
		medication.inputHowOftenDoYouTakeThis(expectedHowOftenDoYouTake);
		String expectedTiming="Morning Evening";
		medication.inputTiming(expectedTiming);
		String expectedNotes="You have to take this timily.";
		medication.inputNote(expectedNotes);

		common.clickSaveContinueLaterButton();
		medication.clickAbcavirMedicationEditIcon();
		String medicationTypeActualText=	medication.getMedicationTypeDropDownSelectedText();
		String actualDosageText=		medication.getDosageInputText();
		String actualHowOftenText=	medication.getHowOfternDoYouTakeInputText();
		String actualTimingText=		medication.getTimingInputText();
		String actualNotesText=	medication.getNoteInputText();
		util.verifyActualExpectedText(medicationTypeActualText,"Abacavir Sulfate" ,"Medication Type" );
		util.verifyActualExpectedText(actualDosageText,expectedDosage ,"Dosage" );
		util.verifyActualExpectedText(actualHowOftenText,expectedHowOftenDoYouTake ,"How often do you take this?" );
		util.verifyActualExpectedText(actualTimingText,expectedTiming ,"Timing" );
		util.verifyActualExpectedText(actualNotesText,expectedNotes ,"Note" );
		common.clickPreviousButton();

	}

	@Test(priority = 5)
	public void TC_037_SpouseMedicationSaveAndAddAnotherButton() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(3));
		CommonCode common=	new CommonCode(util);
		lpo.clickHealthModule();
		util.holdOn(Duration.ofSeconds(5));
		MedicationSupplementsPage medication=	new MedicationSupplementsPage(util);
		medication.clickMedicationSupplmentsSideBarLink();
		common.clickSpouseToggleButton();
		medication.clickAddMedictionButton();
		medication.selectOtherMedicationTypeDropDown();
		String expectedOtherMedicationTextValue="Paracetamol Medicine";
		util.holdOn(Duration.ofSeconds(1));
		medication.inputOtherMedicationTypeDescription(expectedOtherMedicationTextValue);
		String expectedDosage="5 MG";
		medication.inputDosage(expectedDosage);
		String expectedHowOftenDoYouTake="1 Times Per Week.";
		medication.inputHowOftenDoYouTakeThis(expectedHowOftenDoYouTake);
		String expectedTiming="Evening";
		medication.inputTiming(expectedTiming);
		String expectedNotes="You have to take this 1 time per week.";
		medication.inputNote(expectedNotes);
		common.clickSaveAddAnotherButton();
		util.holdOn(Duration.ofSeconds(3));
		common.clickPreviousButton();
		util.holdOn(Duration.ofSeconds(2));
		medication.clickOtherEditIcon();
		String medicationTypeActualText=	medication.getMedicationTypeDropDownSelectedText();
		String actualDosageText=		medication.getDosageInputText();
		String actualHowOftenText=	medication.getHowOfternDoYouTakeInputText();
		String actualTimingText=		medication.getTimingInputText();
		String actualNotesText=	medication.getNoteInputText();
		util.verifyActualExpectedText(medicationTypeActualText,"Other" ,"Medication Type" );
		util.verifyActualExpectedText(actualDosageText,expectedDosage ,"Dosage" );
		util.verifyActualExpectedText(actualHowOftenText,expectedHowOftenDoYouTake ,"How often do you take this?" );
		util.verifyActualExpectedText(actualTimingText,expectedTiming ,"Timing" );
		util.verifyActualExpectedText(actualNotesText,expectedNotes ,"Note" );
		util.holdOn(Duration.ofSeconds(2));
		String otherMedicationTypeActualValue=	medication.getOtherMedicationTypeInputValue();
		util.verifyActualExpectedText(otherMedicationTypeActualValue,expectedOtherMedicationTextValue , "Other Medication Text Box");
		common.clickPreviousButton();
	}

	@Test(priority=6)
	public void TC_038_SpuseMedicationSaveAndProceedToHousingButton() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(3));
		lpo.clickHealthModule();
		util.holdOn(Duration.ofSeconds(5));
		CommonCode common=	new CommonCode(util);
		MedicationSupplementsPage medication=	new MedicationSupplementsPage(util);
		medication.clickMedicationSupplmentsSideBarLink();
		common.clickSpouseToggleButton();
		medication.clickAddMedictionButton();
		medication.clickAbelcetMedicationTypeDropDown();
		util.holdOn(Duration.ofSeconds(1));
		String expectedDosage="5 MG";
		medication.inputDosage(expectedDosage);
		String expectedHowOftenDoYouTake="1 Times Per Week.";
		medication.inputHowOftenDoYouTakeThis(expectedHowOftenDoYouTake);
		String expectedTiming="Evening";
		medication.inputTiming(expectedTiming);
		String expectedNotes="You have to take this 1 time per week.";
		medication.inputNote(expectedNotes);
		medication.clickSaveProceedToHousingButton();
		common.waitUntilToasterMessageisHide();
		util.holdOn(Duration.ofSeconds(3));
		lpo.clickHealthModule();
		util.holdOn(Duration.ofSeconds(2));
		medication.clickMedicationSupplmentsSideBarLink();
		common.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(2));
		medication.clickAbelcetMedicationEditIcon();
		String medicationTypeActualText=	medication.getMedicationTypeDropDownSelectedText();
		String actualDosageText=		medication.getDosageInputText();
		String actualHowOftenText=	medication.getHowOfternDoYouTakeInputText();
		String actualTimingText=		medication.getTimingInputText();
		String actualNotesText=	medication.getNoteInputText();
		util.verifyActualExpectedText(medicationTypeActualText,"Abelcet" ,"Medication Type" );
		util.verifyActualExpectedText(actualDosageText,expectedDosage ,"Dosage" );
		util.verifyActualExpectedText(actualHowOftenText,expectedHowOftenDoYouTake ,"How often do you take this?" );
		util.verifyActualExpectedText(actualTimingText,expectedTiming ,"Timing" );
		util.verifyActualExpectedText(actualNotesText,expectedNotes ,"Note" );
		util.holdOn(Duration.ofSeconds(1));
		common.clickPreviousButton();
	}

















}
