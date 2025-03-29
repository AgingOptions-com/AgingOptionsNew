package com.nspl.agingoptions.healthpage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.health.LifeStyle;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class MarriedUserLifeStyleTestCases extends BaseTest {

	@Test(priority=1)
	public void LifeStyleGeneralHealthNutritionDetailsHealth_TC_007() {

		LpoLandingPage lpoLanding=	 new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
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
		/*
		 * lifeSt.checkPrimaryMemberDoYouConsiderRadioButtonYesIsSelected();
		 * lifeSt.checkSpouseDoYouConsiderRadioButtonYesIsSelected();
		 * lifeSt.checkPrimaryMemberDoYouConsiderRadioButtonYesIsSelected();
		 * lifeSt.checkSpouseDoYouConsiderRadioButtonYesIsSelected();
		 * lifeSt.isPrimaryMemberSedentaryRadioButtonIsSelected();
		 * lifeSt.isSpouseRegularExerciseRadioButtonIsSelected();
		 */
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

	@Test(priority=2)
	public void Health_InputSubstanceUseDetails_TC_008() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		util.holdOn(Duration.ofSeconds(5));
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

	@Test(priority=3)
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




}
