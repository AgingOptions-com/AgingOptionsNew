package com.nspl.agingoptions.login_registrationpage.testcases;


import java.time.Duration;
import java.util.Map;

import org.testng.annotations.Test;

import com.agingoptions.health.PersonalMedicalHistory;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;
import com.nspl.agingoptions.webUtil.DataUtil;

public class MarriedUserFamilyInfoTestCases extends BaseTest {

	@Test(priority = 1)
	public void Health_001_Personal_MedicalHistoryPage() {

		LpoLandingPage lpoLanding=    new LpoLandingPage(util);
		lpoLanding.clickHealhtModule();
		PersonalMedicalHistory personal=	new PersonalMedicalHistory(util);
		String actualPersonalMedicalHistoryText=	personal.getViewYourEditPersonalMedicalHistoryText();
		util.verifyActualExpectedTextContains(actualPersonalMedicalHistoryText, "View and add/edit your Personal Medical History.", "Personal Medical History Page");
		personal.bloodTypeAccordianStatus();
		personal.primaryMemberBloodTypeDDTextStatus();
		personal.SpouseBloodTypeDDTextStatus();
		personal.medicalConditionsAccordianStatus();
		personal.environmentalLifestyleFactorsAccordianStatus();
		personal.clickAccordianParentButton();
		util.scroll("5000");
		util.holdOn(Duration.ofSeconds(2));
	}

	@Test(priority =2,dependsOnMethods = "Health_001_Personal_MedicalHistoryPage")
	public void Health_002_MedicalConditionsElementVisibility() {

		PersonalMedicalHistory personal=	new PersonalMedicalHistory(util);
		personal.openMedicalConditionAccordian();
		personal.primaryMemberDementiaAlzheimerStatus();
		personal.spouseDementiaAlzheimerStatus();
		personal.primaryMemberParkinsonTextStatus();
		personal.spouseParkinsonTextStatus();
		personal.primaryMemberHeartDiseaseText(); personal.spouseHeartDiseaseText();
		personal.primaryMemberStrokeText(); personal.spouseStrokeText();
		personal.primaryMemberDiabetesText(); personal.spouseDiabetesText();
		personal.primaryMemberBloodPressureTextStatus();
		personal.spouseBloodPressureTextStatus();
		personal.primaryMemberElevatedCholesterolTextStatus();
		personal.spouseElevatedCholesterolTextStatus();
		personal.primaryMemberGlaucomaTextStatus();
		personal.spouseGlaucomaTextStatus();
	}

	@Test(priority=3,dependsOnMethods = "Health_001_Personal_MedicalHistoryPage")
	public void Health_003_EnvironmentalLifeStyleFactorsElementVisibility() {

		PersonalMedicalHistory personal=	new PersonalMedicalHistory(util);
		personal.primaryMemberDidYouGrowUpTextStatus();
		personal.spouseDidYouGrowUpTextStatus();
		personal.primaryMemberDoYouHaveConditionTextStatus();
		personal.spouseDoYouHaveConditionTextStatus();
		personal.primaryMemberDoYouhaveDifficultyTextStatus();
		personal.spouseDoYouHaveDifficultyTextStatus();
		personal.primaryMemberAreYouAllergicTextStatus();
		personal.spouseAreYouAllergicTextStatus();
		personal.selectAreYouAllergicYesRadioButtonPrimaryMember();
		personal.selectAreYouAllergicYesRadioButtonSpouse();
		personal.primaryMemberWhichMedicationText();
		personal.spouseWhichMedicationText();
	}

	@Test(priority =4,dependsOnMethods = "Health_001_Personal_MedicalHistoryPage")
	public void Health_004_BloodTypeSelection() {
		PersonalMedicalHistory personal=	new PersonalMedicalHistory(util);
		personal.clickPrimaryMeberBloodTypeDropDownIcon();
		personal.clickABPlusDropDownOption();
		personal.clickSpouseBloodTypeDropDownIcon();
		personal.clickNoneDropDownOption(); 
		personal.clickSaveProceedToLifeStyleButton();
		util.holdOn(Duration.ofSeconds(2));
		personal.clickpersonalMedicalHistorySideBarLink();
		util.holdOn(Duration.ofSeconds(4));
		String primaryMemberDropDownSelectedOptions=   personal.getPrimaryMemberDropDownSelectedOptions();
		String spouseDropDownSelectedOptions=   personal.getSpouseDropDownSelectedOptions();
		util.verifyActualExpectedText(primaryMemberDropDownSelectedOptions, "AB+", "Primary Member Blood Type Drop Down");
		util.verifyActualExpectedText(spouseDropDownSelectedOptions, "None", "Spouse Blood Type Drop Down");

	}

	@Test(priority=5)
	public void Health_005_MedicalConditionElement() {
		PersonalMedicalHistory personal=	new PersonalMedicalHistory(util);
		personal.openMedicalConditionAccordian();
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







	}




}
