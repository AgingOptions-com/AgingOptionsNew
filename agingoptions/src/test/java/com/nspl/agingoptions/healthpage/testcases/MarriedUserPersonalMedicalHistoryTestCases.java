package com.nspl.agingoptions.healthpage.testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.agingoptions.health.FamilyMedicalHistory;
import com.agingoptions.health.LifeStyle;
import com.agingoptions.health.PersonalMedicalHistory;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;
import com.nspl.agingoptions.webUtil.DataUtil;

public class MarriedUserPersonalMedicalHistoryTestCases extends BaseTest {

	@Test(priority = 1)
	public void TC_001_Health_Personal_MedicalHistoryPage() {

		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(10));
		lpoLanding.clickHealthModule();
		PersonalMedicalHistory personal = new PersonalMedicalHistory(util);
		String actualPersonalMedicalHistoryText = personal.getViewYourEditPersonalMedicalHistoryText();
		util.verifyActualExpectedTextContains(actualPersonalMedicalHistoryText,"View and add/edit your Personal Medical History.", "Personal Medical History Page");
		personal.bloodTypeAccordianStatus();
		personal.primaryMemberBloodTypeDDTextStatus();
		personal.SpouseBloodTypeDDTextStatus();
		personal.medicalConditionsAccordianStatus();
		personal.environmentalLifestyleFactorsAccordianStatus();
		personal.clickAccordianParentButton();
		util.scroll("5000");
		util.holdOn(Duration.ofSeconds(2));
	}

	@Test(priority = 2, dependsOnMethods = "TC_001_Health_Personal_MedicalHistoryPage",enabled=true)
	public void TC_002_Health_Personal_Medical_History_MedicalConditionsElementVisibility() {

		PersonalMedicalHistory personal = new PersonalMedicalHistory(util);
		personal.primaryMemberDementiaAlzheimerStatus();
		personal.spouseDementiaAlzheimerStatus();
		personal.primaryMemberParkinsonTextStatus();
		personal.spouseParkinsonTextStatus();
		personal.primaryMemberHeartDiseaseText();
		personal.spouseHeartDiseaseText();
		personal.primaryMemberStrokeText();
		personal.spouseStrokeText();
		personal.primaryMemberDiabetesText();
		personal.spouseDiabetesText();
		personal.primaryMemberBloodPressureTextStatus();
		personal.spouseBloodPressureTextStatus();
		personal.primaryMemberElevatedCholesterolTextStatus();
		personal.spouseElevatedCholesterolTextStatus();
		personal.primaryMemberGlaucomaTextStatus();
		personal.spouseGlaucomaTextStatus();
	}

	@Test(priority = 3, dependsOnMethods = "TC_001_Health_Personal_MedicalHistoryPage",enabled=true)
	public void TC_003_Health_Personal_Medical_History_EnvironmentalLifeStyleFactorsElementVisibility() {

		PersonalMedicalHistory personal = new PersonalMedicalHistory(util);
		personal.primaryMemberDidYouGrowUpTextStatus();
		personal.spouseDidYouGrowUpTextStatus();
		personal.primaryMemberDoYouHaveConditionTextStatus();
		personal.spouseDoYouHaveConditionTextStatus();
		personal.primaryMemberDoYouhaveDifficultyTextStatus();
		personal.spouseDoYouHaveDifficultyTextStatus();
		personal.primaryMemberAreYouAllergicTextStatus();
		personal.spouseAreYouAllergicTextStatus();
		//		personal.selectAreYouAllergicYesRadioButtonPrimaryMember();
		//		personal.selectAreYouAllergicYesRadioButtonSpouse();
		//		personal.primaryMemberWhichMedicationText();
		//		personal.spouseWhichMedicationText();
	}

	@Test(priority = 4, dependsOnMethods = "TC_001_Health_Personal_MedicalHistoryPage",enabled=true)
	public void TC_004_Health_personal_Medical_History_BloodTypeSelection() {
		PersonalMedicalHistory personal = new PersonalMedicalHistory(util);
		personal.clickPrimaryMeberBloodTypeDropDownIcon();
		personal.clickABPlusDropDownOption();
		personal.clickSpouseBloodTypeDropDownIcon();
		personal.clickNoneDropDownOption();
		personal.clickSaveProceedToLifeStyleButton();
		util.holdOn(Duration.ofSeconds(8));
		personal.clickpersonalMedicalHistorySideBarLink();
		util.holdOn(Duration.ofSeconds(7));
		String primaryMemberDropDownSelectedOptions = personal.getPrimaryMemberDropDownSelectedOptions();
		util.holdOn(Duration.ofSeconds(4));
		String spouseDropDownSelectedOptions = personal.getSpouseDropDownSelectedOptions("None");
		util.verifyActualExpectedText(primaryMemberDropDownSelectedOptions, "AB+","Primary Member Blood Type Drop Down");
		util.verifyActualExpectedText(spouseDropDownSelectedOptions, "None", "Spouse Blood Type Drop Down");

	}

	@Test(priority = 5,enabled=true)
	public void TC_005_Health_personal_Medical_History_MedicalConditionElement() {
		LpoLandingPage lpo=	new LpoLandingPage(util);
		lpo.clickHealthModule();
		PersonalMedicalHistory personal = new PersonalMedicalHistory(util);
		personal.openMedicalConditionAccordian();
		util.holdOn(Duration.ofSeconds(2));
		personal.checkPrimaryMemberDementiaCheckbox();
		personal.checkSpouseDementiaCheckbox();
		personal.checkPrimaryMemberParkinsonCheckBox();
		personal.checkSpouseParkinsonCheckBox();
		personal.CheckprimaryMemberHeartDiseaseCheckBox();
		personal.CheckSpouseHeartDiseaseCheckBox();
		personal.checkPrimaryMemberStrokeCheckBox();
		personal.checkSpouseStrokeCheckBox();
		personal.checkPrimaryMemberDiabetesCheckBox();
		personal.checkSpouseDiabetesCheckBox();
		personal.checkPrimaryMemberBloodPressureIssueCheckbox();
		personal.checkSpouseBloodPressureIssueCheckbox();
		personal.checkPrimaryMemberElevatedCholesterolCheckbox();
		personal.checkSpouseElevatedCholesterolCheckbox();
		personal.checkPrimaryMemberGlaucomaCheckbox();
		personal.checkSpouseGlaucomaCheckbox();
		DataUtil dataUtil = new DataUtil();
		Map<String, String> mapData = dataUtil.getTestCaseData("Health_005");
		String primaryMemberDementia = mapData.get("primaryDementia");
		String primaryParkinson = mapData.get("primaryParkinson");
		String primaryHeartDesease = mapData.get("primaryHeartDesease");
		String primaryStroke = mapData.get("primaryStroke");
		String primaryDiabetes = mapData.get("primaryDiabetes");
		String primaryBloodType = mapData.get("primaryMemberBlood");
		String primaryElevated = mapData.get("primaryElevated");
		String primaryGlaucoma = mapData.get("primaryGlaucoma");
		String spouseDementia = mapData.get("spouseDementia");
		String spouseParkinson = mapData.get("spouseParkinson");
		String spouseHeartDisease = mapData.get("spouseHeartDisease");
		String spouseHeart = mapData.get("spouseHeart");
		String spouseBloodPressure = mapData.get("spouseBloodPressure");
		String spouseElevatedCholesterol = mapData.get("spouseElevatedCholesterol");
		String spouseGlaucome = mapData.get("spouseGlaucome");
		List<String> data = new ArrayList();
		data.add(primaryMemberDementia);
		data.add(primaryParkinson);
		data.add(primaryHeartDesease);
		data.add(primaryStroke);
		data.add(primaryDiabetes);
		data.add(primaryBloodType);
		data.add(primaryElevated);
		data.add(primaryGlaucoma);
		data.add(spouseDementia);
		data.add(spouseParkinson);
		data.add(spouseHeartDisease);
		data.add(spouseHeart);
		data.add(spouseBloodPressure);
		data.add(primaryBloodType);
		data.add(spouseElevatedCholesterol);
		data.add(spouseGlaucome);
		List<WebElement> medicalConditionsList = personal.medicalConditionsTextBoxList();
		for (int i = 0; i <= medicalConditionsList.size() - 1; i++) {
			WebElement listWeb = medicalConditionsList.get(i);
			util.sendValue(listWeb, data.get(i), data.get(i));
		}
		personal.clickSaveProceedToLifeStyleButton();
		util.holdOn(Duration.ofSeconds(10));
		personal.clickpersonalMedicalHistorySideBarLink();
		util.holdOn(Duration.ofSeconds(3));
		personal.clickMedicalConditionAccordian();
		List<WebElement> medicalConditionsInputVeryfication = personal.medicalConditionsTextBoxList();
		for (int i = 0; i <= medicalConditionsList.size() - 1; i++) {
			WebElement listWeb = medicalConditionsInputVeryfication.get(i);
			String text = listWeb.getAttribute("value");
			util.verifyActualExpectedText(text, data.get(i), text);
		}
	}

	@Test(priority = 6,enabled=true)
	public void TC_006_Health_Personal_Medical_History_EnvironmentalLifestyleFactorsDetails() {

		PersonalMedicalHistory personal = new PersonalMedicalHistory(util);
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickHealthModule();
		util.holdOn(Duration.ofSeconds(2));
		personal.clickpersonalMedicalHistorySideBarLink();
		personal.clickEnvironmentalLifestayleAccordian();
		util.holdOn(Duration.ofSeconds(2));
		personal.clickYesprimaryMemberDidYouGrowUpRadioBT();
		personal.clickYesspouseDidYouGrowUpRadioBT();
		String primaryMemberDidYouGrowExpectedText="Occasionally ";
		personal.sendPrimaryMemberDidYouGrowUpCommentText(primaryMemberDidYouGrowExpectedText);
		String spouseExpectedDidYouGrowUpText="Sometimes";
		personal.sendSpouseDidYouGrowUpCommentText(spouseExpectedDidYouGrowUpText);
		personal.clickPrimaryMemberDoYouHaveConditionYesRadioButton();
		personal.clickspouseDoYouHaveConditionYesRadioButton();
		String primaryMemberExpectedDoYouHaveCondition="Sometimes";
		personal.sendPrimaryMemberDoYouHaveConditionCommentTextBox(primaryMemberExpectedDoYouHaveCondition);
		String spouseExpectedDoYouHaveCondition="Never Taken";
		personal.sendSpouseDoYouHaveConditionCommentTextBox(spouseExpectedDoYouHaveCondition);
		util.holdOn(Duration.ofSeconds(3));
		personal.clickPrimaryMemberYesRadioButtonDoYouDiffcultyWithGait();
		personal.clickSpouseYesRadioButtonDoYouDiffcultyWithGait();
		String primaryMemberDoYouHaveDifficultyExpectedText="No I don't Have Difficulty";
		personal.sendPrimaryMemberDoYouHaveDifficultyGaitCommentText(primaryMemberDoYouHaveDifficultyExpectedText);  
		String spouseDoYouHaveDiffcultyGaitActualText="No I don't";
		personal.sendSpouseDoYouHaveDifficultyGaitCommentText(spouseDoYouHaveDiffcultyGaitActualText);
		personal.clickprimaryMemberAreYouAllergicToYesRadioBT();
		personal.clickSpouseAreYouAllergicToYesRadioBT();
		String primaryMemberWhichMedicationCommentTextBox="Not Any Medication";
		personal.sendValuePrimaryMemberWhichMedicationCommentTB(primaryMemberWhichMedicationCommentTextBox);
		String spouseWhichMedicationCommentTextBox="Not Any Medication";
		personal.sendValueSpouseWhichMedicationCommentTB(spouseWhichMedicationCommentTextBox);
		personal.clickSaveProceedToLifeStyleButton();
		personal.clickpersonalMedicalHistorySideBarLink();
		personal.clickEnvironmentalLifestayleAccordian();
		String primaryMemberDidYouGrowUpActualText=	personal.getPrimaryMemberDidYouGrowUpCommentInputText();
		String SpouseDidYouGrowUpActualText=	personal.getSpouseDidYouGrowUpCommentInputText();
		String primaryMemberDoYouHaveConditionCommentText=	personal.getPrimaryMemberDoYouHaveConditionCommentText();
		String spouseDoYouHaveConditionCommentText=	personal.getSpouseDoYouHaveConditionCommentText();
		String acutalPrimaryMemberDoYouHaveDiffcultyCommentText=	personal.getPrimaryMemberDoYouHaveDifficultyCommentText();
		String acutalSpouseDoYouHaveDiffcultyCommentText=	personal.getSpouseDoYouHaveDifficultyCommentText();
		String primaryMemberWhichMedicationAcutalText=	personal.getPrimaryMemberWhichMedicationCommentText();
		String spouseWhichMedicationAcutalText=personal.getSpouseWhichMedicationCommentText();
		util.verifyActualExpectedTextContains(primaryMemberDidYouGrowExpectedText, primaryMemberDidYouGrowUpActualText);
		util.verifyActualExpectedTextContains(spouseExpectedDidYouGrowUpText, SpouseDidYouGrowUpActualText);
		util.verifyActualExpectedTextContains(primaryMemberExpectedDoYouHaveCondition, primaryMemberDoYouHaveConditionCommentText);
		util.verifyActualExpectedTextContains(spouseExpectedDoYouHaveCondition, spouseDoYouHaveConditionCommentText);
		util.verifyActualExpectedTextContains(acutalPrimaryMemberDoYouHaveDiffcultyCommentText, primaryMemberDoYouHaveDifficultyExpectedText);
		util.verifyActualExpectedTextContains(acutalSpouseDoYouHaveDiffcultyCommentText, spouseDoYouHaveDiffcultyGaitActualText);
		util.verifyActualExpectedTextContains(primaryMemberWhichMedicationCommentTextBox, primaryMemberWhichMedicationAcutalText);
		util.verifyActualExpectedTextContains(spouseWhichMedicationAcutalText, primaryMemberWhichMedicationCommentTextBox);

	}

	public void LifeStyleGeneralHealthNutritionDetailsHealth_TC_007() {

		LpoLandingPage lpoLanding=	 new LpoLandingPage(util);
		lpoLanding.clickHealthModule();
		LifeStyle lifeSt=	new LifeStyle(util);
		lifeSt.clickLifeStyleSideBarLink();
		util.holdOn(Duration.ofSeconds(5));
		lifeSt.openGeneralNutritionAccordian();
		util.holdOn(Duration.ofSeconds(2));
		lifeSt.clickPrimaryMemberYesRadioButtonDoYouConsiderHealthWeight();
		lifeSt.clickSpouseYesRadioButtonDoYouConsiderHealthWeight();
		lifeSt.clickPrimaryMemberSedentaryRadioButton();
		lifeSt.clickSpouseRegularlyExerciseRadioBT();
		String primaryMemberDescribeExpectedText="There is no sedentary";
		lifeSt.inputPrimaryMemberDescribeValue(primaryMemberDescribeExpectedText);
		String howOftenExpectedValue="7";
		lifeSt.selectSpouseHowOftenDoYouExerciseDropDown7Options(howOftenExpectedValue);
		String spoueDescribeTextValue="Yes I regular Exercise";
		lifeSt.inputSpouseDescribeValue(spoueDescribeTextValue);
		lifeSt.clickPrimaryMemberYesRadioButtonDoYouWorryAboutHealth();
		String primaryMemberDoYouWorriedExpectedText="My Family Is worried for my health";
		lifeSt.inputPrimaryMemberWhatIsYourWorriedTB(primaryMemberDoYouWorriedExpectedText);
		lifeSt.clickSpouseYesRadioButtonDoYouWorryAboutHealth();
		String spouseDoYouWorriedExpectedText="No one is worried about me";
		lifeSt.inputSpouseWhatIsYourWorriedTB(spouseDoYouWorriedExpectedText);
		String spouseWhenYouExerciseExpectedText="I exercise in the every day";
		lifeSt.inputSpouseWhenYouExerciseDescriptionTextBox(spouseWhenYouExerciseExpectedText);
		lifeSt.clickprimaryMemberAreYouGoodRegularCheckupYesRadioBT();
		lifeSt.clickSpouseAreYouGoodRegularCheckupYesRadioBT();
		lifeSt.clickPrimaryMemberOnAScale8Options();
		String primaryMemberNutritionExpectedValue="I follow a balanced diet that includes a variety of fruits, vegetables, whole grains, and proteins.";
		lifeSt.inputPrimaryMemberNutritionDetails(primaryMemberNutritionExpectedValue);
		lifeSt.clickSpouseOnAScale8Options();
		String spouseNutritionDetailsExpectedValue=" do not have any dietary restrictions, but I prefer home-cooked meals over fast food.";
		lifeSt.inputSpouseNutritionDetails(spouseNutritionDetailsExpectedValue);
		lifeSt.clickSaveProceedToFamilyMedicalHistoryButton();
		util.holdOn(Duration.ofSeconds(3));
		lifeSt.clickLifeStyleSideBarLink();
		
		  lifeSt.checkPrimaryMemberDoYouConsiderRadioButtonYesIsSelected();
		  lifeSt.checkSpouseDoYouConsiderRadioButtonYesIsSelected();
		  lifeSt.checkPrimaryMemberDoYouConsiderRadioButtonYesIsSelected();
		  lifeSt.checkSpouseDoYouConsiderRadioButtonYesIsSelected();
		  lifeSt.isPrimaryMemberSedentaryRadioButtonIsSelected();
		  lifeSt.isSpouseRegularExerciseRadioButtonIsSelected();
		 
		String actualHowOftenSelectedValue=	lifeSt.getHowOftenDoYouExerciseDropDownSelectedText();
		String primaryMemberActualDescribeText=     lifeSt.getPrimaryMemberDescribeText();
		String spouseActualDescribeText=     lifeSt.getSpouseDescribeText();
		String primaryMemberWhatIsYourWorryActualText=lifeSt.getPrimaryMemberWhatIsYourWorryText();
		String spouseWhatIsYourWorryText=	lifeSt.getSpouseWhatIsYourWorryText();
		String actualSpouseWhenYouExerciseText=	lifeSt.getSpouseWhenYouExerciseText();
		String primaryMemberOnAScaleActualText=	lifeSt.getPrimaryMemberOnAScaleSelectedText();
		String SpouseOnAScaleActualText=	lifeSt.getSpouseOnAScaleSelectedText();
		String primaryMemberAcutalNutritionDetails=   lifeSt.getPrimaryMemberNutritionDetailsText();
		String spouseAcutalNutrtionDetails=    lifeSt.getSpouseNutritionDetailsText();
		util.verifyActualExpectedText(actualHowOftenSelectedValue, howOftenExpectedValue,"How Ofen Do You Exercise" );
		util.verifyActualExpectedText(primaryMemberActualDescribeText, primaryMemberDescribeExpectedText,"Describe " );
		util.verifyActualExpectedText(primaryMemberWhatIsYourWorryActualText, primaryMemberDoYouWorriedExpectedText,"Primary Member What is Your Worry" );
		util.verifyActualExpectedText(spouseActualDescribeText, spoueDescribeTextValue, "Describe ");
		util.verifyActualExpectedText(actualSpouseWhenYouExerciseText,spouseWhenYouExerciseExpectedText , "When you exercise, how long do you exercise?");
		util.verifyActualExpectedText(spouseWhatIsYourWorryText, spouseDoYouWorriedExpectedText, "Spouse What is your worry?");
		util.verifyActualExpectedText(primaryMemberOnAScaleActualText,"8" , "Primary Member On a scale of 1 to 10 (1 = poor; 10 = great), how would you rate your eating habits?");
		util.verifyActualExpectedText(SpouseOnAScaleActualText,"8" , "Primary Member On a scale of 1 to 10 (1 = poor; 10 = great), how would you rate your eating habits?");
		util.verifyActualExpectedTextContains(primaryMemberAcutalNutritionDetails,primaryMemberNutritionExpectedValue ,"Primary Member Describe your nutrition details." );
		util.verifyActualExpectedTextContains(spouseAcutalNutrtionDetails,spouseNutritionDetailsExpectedValue ,"Spouse Member Describe your nutrition details." );
	}

	public void Health_InputSubstanceUseDetails_TC_008() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		lpo.clickHealthModule();
		LifeStyle lifeSt=	new LifeStyle(util);
		lifeSt.clickLifeStyleSideBarLink();
		lifeSt.openSubStanceUseAccordian();
		util.holdOn(Duration.ofSeconds(4));
		lifeSt.clickPrimaryMemberDoYouUseDrugsYesRadioButton();
		lifeSt.clickSpouseDoYouUseDrugsYesRadioButton();
		String primaryWhichOneTextExpectedText="Paracetamol";
		lifeSt.inputPrimaryMemberWhichOneTextBox(primaryWhichOneTextExpectedText);
		String spouseWhichOneActualText="Nothing";
		lifeSt.inputSpouseWhichOneTextBox(spouseWhichOneActualText);
		lifeSt.clickPrimaryMemberDoYouCurrentlySmokeNoRadioBT();
		lifeSt.clickSpouseDoYouCurrentlySmokeYesRadioBT();
		lifeSt.clickprimaryMemberHaveYouEverSmokedYesRadioBT();
		String primaryMemberWhenDidYouQuitSmokingText="I Quit Smoking bafore some days back";
		lifeSt.inputPrimaryMemberWhenDidYouQuitSmokingTB(primaryMemberWhenDidYouQuitSmokingText);
		lifeSt.clickPrimaryMemberDoYouConsumeAlcoholYesRadioBT();
		lifeSt.clickSpouseDoYouConsumeAlcoholYesRadioBT();
		String primaryMemberHowManyAlcoholicDrinksExpectedText="5";
		lifeSt.inputPrimaryMemberHowManyAlcoholicDrinksDoYouConsumeTB(primaryMemberHowManyAlcoholicDrinksExpectedText);
		String spouseHowManyAlcoholicDrinksExpectedText="3";
		lifeSt.inputSpouseHowManyAlcoholicDrinksDoYouConsumeTB(spouseHowManyAlcoholicDrinksExpectedText);
		lifeSt.checkPrimaryMemberWhichOfTheseDoYouDrinkCheckBoxes();
		lifeSt.checkSpouseWhichOfTheseDoYouDrinkCheckBoxes();
		lifeSt.clickSaveProceedToFamilyMedicalHistoryButton();
		util.holdOn(Duration.ofSeconds(5));
		lifeSt.clickLifeStyleSideBarLink();
		lifeSt.openSubStanceUseAccordian();
		util.holdOn(Duration.ofSeconds(3));
		String primaryMemberWhichOneActualText=    lifeSt.getPrimaryMemberWhichOneInputText();
		String sposueWhichOneActualText=    lifeSt.getSpouseWhichOneInputText();
		String primaryWhenDidYouQuitSmokingActualText=     lifeSt.getPrimaryMemberWhenDidYouQuitSmokingActualText();
		String primaryMemberAlcoholicDrinksActualText=     lifeSt.getPrimaryMemberHowManyAlcoholicdrinksText();
		String spouseHowManyAlcoholicDrinkAcutalText= lifeSt.getSpouseHowManyAlcoholicdrinksText();
		util.verifyActualExpectedText(primaryMemberWhichOneActualText,primaryWhichOneTextExpectedText ,"Primary Member Which ones?" );
		util.verifyActualExpectedText(sposueWhichOneActualText, spouseWhichOneActualText,"Spouse Which ones?" );
		util.verifyActualExpectedText(primaryWhenDidYouQuitSmokingActualText,primaryMemberWhenDidYouQuitSmokingText ,"When did you quit smoking?" );
		util.verifyActualExpectedText(primaryMemberAlcoholicDrinksActualText,primaryMemberHowManyAlcoholicDrinksExpectedText , "Primary Member How many alcoholic drinks do you consume in a week?");
		util.verifyActualExpectedText(spouseHowManyAlcoholicDrinkAcutalText,spouseHowManyAlcoholicDrinksExpectedText ,"How many alcoholic drinks do you consume in a week?" );
		lifeSt.checkStatusPrimaryMemberWhichOfTheseDoYouDrinkCheckBoxes();
		lifeSt.checkSpouseStatusWhichOfTheseDoYouDrinkCheckBoxes();
	}

	public void Health_InputSocialHabitsDetails_TC_09() {
		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		lpoLanding.clickHealthModule();
		LifeStyle lifeSt=	new LifeStyle(util);
		util.holdOn(Duration.ofSeconds(5));
		lifeSt.clickLifeStyleSideBarLink();
		util.holdOn(Duration.ofSeconds(2));
		lifeSt.OpenSocialHabitsAccordian();
		String primaryExpectedOutSideOfWorkText="Outside of work, we enjoy spending time with family and friends. ";
		lifeSt.inputprimaryMemberOutSideOfWorkHowDoYouSociallyEngaged(primaryExpectedOutSideOfWorkText);
		String spouseExpectedOutSideOfWorkText="We stay socially engaged by being part of local community groups and attending events.";
		lifeSt.inputSpouseOutSideOfWorkHowDoYouSociallyEngaged(spouseExpectedOutSideOfWorkText);
		lifeSt.clickSaveProceedToFamilyMedicalHistoryButton();
		util.holdOn(Duration.ofSeconds(3));
		lifeSt.clickLifeStyleSideBarLink();
		util.holdOn(Duration.ofSeconds(1));
		lifeSt.OpenSocialHabitsAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String primaryMemberAcutalText=     lifeSt.getPrimaryMemberOutSideOfWorkHowDoYouActualText();
		String spouseActualText=     lifeSt.getSpouseOutSideOfWorkHowDoYouActualText();
		util.verifyActualExpectedText(primaryMemberAcutalText,primaryExpectedOutSideOfWorkText ,"Primary Member Outside of work, how do you and your spouse (if married) keep socially engaged?" );
		util.verifyActualExpectedText(spouseActualText,spouseExpectedOutSideOfWorkText ,"Spouse Outside of work, how do you and your spouse (if married) keep socially engaged?" );
	}

	public void familyMedicalHistoryLivingParentInfoDetails_TC_010() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		lpoLanding.clickHealthModule();
		FamilyMedicalHistory familyMedical=    new FamilyMedicalHistory(util);
		util.holdOn(Duration.ofSeconds(5));
		familyMedical.clickFamilyMedicalHistorySideBarLink();
		familyMedical.openMyParentInfoAccordian();
		util.holdOn(Duration.ofSeconds(5));
		String primaryMemberFatherExpectedAge="79";
		familyMedical.inputPrimaryMemberFathersCurrentAge(primaryMemberFatherExpectedAge);
		String primaryMemberSpouseExpectedAge="84";
		familyMedical.inputPrimaryMemberMotherCurrentAge(primaryMemberSpouseExpectedAge);
		String spouseFatherExpectedAge="77";
		familyMedical.inputSpouseFathersCurrentAge(spouseFatherExpectedAge);
		String spouseMotherExpectedAge="82";
		familyMedical.inputSpouseMotherCurrentAge(spouseMotherExpectedAge);
		familyMedical.clickSaveProceedToPrimaryCarePhysicianBT();
		util.holdOn(Duration.ofSeconds(5));
		familyMedical.clickFamilyMedicalHistorySideBarLink();
		util.holdOn(Duration.ofSeconds(3));
		String primaryFatherActualText=      familyMedical.getPrimaryFatherCurrentAgeInputText();
		String primarySpouseActualText=      familyMedical.getPrimarySpouseCurrentAgeInputText();
		String spouseFatherActualText=      familyMedical.getSpouseFatherCurrentAgeInputText();
		String spouseMotherActualText=     familyMedical.getSpouseMotherCurrentAgeInputText();
		util.verifyActualExpectedText(primaryMemberFatherExpectedAge,primaryFatherActualText ,"Primary Member Father’s current age" );
		util.verifyActualExpectedText(primaryMemberSpouseExpectedAge,primarySpouseActualText ,"Primary Member Mother's current age" );
		util.verifyActualExpectedText(spouseFatherExpectedAge,spouseFatherActualText , "Spouse Father’s current age");
		util.verifyActualExpectedText(spouseMotherExpectedAge,spouseMotherActualText ,"Spouse Mother's Current Age" );

	}

	public void familyMedicalHistoryNonLivingParentInfoDetails_TC_011() {

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
		String PrimaryMotherAgeAtDeathExpectedText="94";
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
		util.holdOn(Duration.ofSeconds(4));
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

	public void familyMedicalHistoryNonLivingParentInfoDetails_TC_012() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
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



}
