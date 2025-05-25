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
		util.holdOn(Duration.ofSeconds(4));
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



}
