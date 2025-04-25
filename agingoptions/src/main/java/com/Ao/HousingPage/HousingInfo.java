package com.Ao.HousingPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingInfo extends HousingInfoOr{

	public WebUtil wt;

	public HousingInfo(WebUtil util) {
		super(util);
		this.wt=util;

	}

	public void verifyHousingInformationPage() {
		wt.verifyInnerText(HousingInformationText, "Housing Information", "Housing information page");
	}
	public void verifyCheckYes__IsYourHousingLivingIn() {
		wt.clickRadioButton(isYourHousingLivingYesCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? Yes radio button");
		wt.holdOn(Duration.ofSeconds(3));		
		wt.verifyInnerText(OntheScaleOfOneToFiveOwnHomeInnerText, "On a scale of 1 to 5, how likely is it that you will remain in your current home? 1-Not at all, 5-Will be in my own home", "On The Scale On One Two Five.. dropdown");
		
	}

	public void verifyCheckNotSure_IsYourHousingLivingIn() {
		
			wt.click(IsYourHousingLivingNotSureCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? Yes radio button");	

		//	wt.click(isYourHousingLivingYesCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? Yes radio button");	
}
	public void verifyCheckYes_IsYourHousingLivingIn() {
	
		wt.click(isYourHousingLivingYesCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? Yes radio button");	
}
	
	public void verifyHousingInformation() {
		HousingInfo HousinginfoObj= new HousingInfo(wt);
		HousinginfoObj.verifyHousingInformationPage();

	}
	public void VerifyCheck_NoRadioButton_IsYourHousingLivingIn() {
		wt.click(IsYourHousingLivingNoCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? No radio Button  ");
		wt.verifyInnerText(whereWouldYouWantToRetire_Innertext, "Where would you eventually like to retire (city and state)?", "Where would you eventually like to retire.. text box");
	}
	public void onTheScaleOfTwoToFiveDropDownSelection() throws InterruptedException {
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On the scale of One to five own Home ..dropdown");
		wt.click(OntheScaledropDown_option2, "option 2");
		wt.isDisplayed(CaregiverSuitability, "CareGiver suitability text");
		wt.isDisplayed(CurrentResidenceCharactarstics_Text, "Current residence Charactarstics");
		wt.holdOn(Duration.ofSeconds(5));
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On the scale of One to five own Home ..dropdown");
		wt.click(OntheScaledropDown_option3, "option 3");
		wt.isDisplayed(CaregiverSuitability, "CareGiver suitability text");
		wt.isDisplayed(CurrentResidenceCharactarstics_Text, "Current residence Charactarstics");
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On the scale of One to five own Home ..dropdown");
		wt.click(OntheScaledropDown_option4, "option 4");
		wt.isDisplayed(CaregiverSuitability, "CareGiver suitability text");
		wt.isDisplayed(CurrentResidenceCharactarstics_Text, "Current residence Charactarstics");
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On the scale of One to five own Home ..dropdown");
		wt.click(OntheScaledropDown_option5, "option 5");
		wt.isDisplayed(CaregiverSuitability, "CareGiver suitability text");
		wt.isDisplayed(CurrentResidenceCharactarstics_Text, "Current residence Charactarstics");

	}
	public void OntheScaleOfOneToFive_select1() {
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On the scale of One to five own Home ..dropdown");
		wt.click(OntheScaledropDown_option1, "option 1");
		wt.isNotDisplayed(CaregiverSuitability, "CareGiver suitability text");
		wt.isNotDisplayed(CurrentResidenceCharactarstics_Text, "Current residence Charactarstics");
		SoftAssert  assertObj =new SoftAssert();
		assertObj.assertAll();
	}
	public void UpdateAndContinueThedetailsWithIstheHouse_yesCheck_and_OntheScaleOnFive_Select1(String closestrelativedistanceInMiles) {
		verifyCheckYes_IsYourHousingLivingIn();
		verifyCheckYes_IsYourHousingLivingIn();
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On The Scale On One To Five Own Home Drop Down");
		wt.click(ClosestRelativeDropdown, "Closest Relative DropDown");
		wt.click(ClosestrelativeContent, "Closest relative");
		wt.sendValue(HowManyMilesToClosestRelative,"45", "How Many miles to closest relative Text box");
		wt.click(WouldYouConsiderLivingWithAChildCheckBox_Yes, "Would you consider Living With Child radio button");
		wt.click(WouldYouConsiderMovingToCondoniumCheckBox_Yes, "Would you consider to moving condonium radio button");
		wt.click(WouldYouConsiderMovingToLifeStyleCommunity_Yes, "Would you consider to lifestyle community");
		wt.click(WouldYouConsiderToMovingRetirementCommunity_Yes, "would you consider to moving retirement community radio button");
		wt.click(updateAndContinueButton, "Update and continue");
		wt.holdOn(Duration.ofSeconds(3));
	       wt.click(accordian,"accordian");
	}
	public void SaveAndProceedThedetailsWithIstheHouse_NotsureCheck_and_OntheScaleOnFive_Select1(String closestrelativedistanceInMiles) {
		verifyCheckYes_IsYourHousingLivingIn();
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On The Scale On One To Five Own Home Drop Down");
		wt.click(ClosestRelativeDropdown, "Closest Relative DropDown");
		wt.click(ClosestrelativeContent, "Closest relative");
		wt.sendValue(HowManyMilesToClosestRelative,"45", "How Many miles to closest relative Text box");
		wt.click(WouldYouConsiderLivingWithAChildCheckBox_Yes, "Would you consider Living With Child radio button");
		wt.click(WouldYouConsiderMovingToCondoniumCheckBox_Yes, "Would you consider to moving condonium radio button");
		wt.click(WouldYouConsiderMovingToLifeStyleCommunity_Yes, "Would you consider to lifestyle community");
		wt.click(WouldYouConsiderToMovingRetirementCommunity_Yes, "would you consider to moving retirement community radio button");
		wt.click(SaveAndNextProfessional, "Save and Next :Professional Button");
		

	}
	public void verifyHousingProfessionalPage() {
		wt.verifyInnerText(IDoNotHaveRealtorInnerText, "I don’t have a Realtor", "Housing professional Page");
	}
	
	public void gotoClickHousingOptions() {
		wt.click(HousingOptionsection, "Housingoption section");
	}
	public void UpdateAndContinueTheDetailsIsTheHouseYouAreLivingWith_NoRadioButtonSelected(String RetirementPlace) {
		wt.click(IsYourHousingLivingNoCheckBox, "Is the House You are Living In No Radio button");
		wt.sendValue(WhereWouldYouLikeTORetireTB, RetirementPlace, "Where Would you want to retire");
		wt.click(ClosestRelativeDropdown, "Closest relative dropdown");
		wt.click(ClosestrelativeContent, "Closest relative ");
		wt.click(HowManyMilesToClosestRelative, "How many miles to closest relative text box");
		wt.click(WouldYouConsiderLivingWithAChildCheckBox_Yes, "Would you consider to living with child and family member");
		wt.click(WouldYouConsiderMovingToCondoniumCheckBox_Yes, "Would you consider to moving to a condonium");
		wt.click(WouldYouConsiderMovingToLifeStyleCommunity_Yes, "Would you consider to moving lifestyle community");
		wt.click(WouldYouConsiderToMovingRetirementCommunity_Yes, "Would you consider to moving to retirement community");
		wt.click(updateAndContinueButton, "Update and continue Button");
		CommonCode cmc=new CommonCode(wt);
		cmc.verifyToasterMessage("Your data have been updated successfully");
		wt.holdOn(Duration.ofSeconds(3));
       wt.click(accordian,"accordian");
	}

	public void SaveAndNextToHousingProfessional_ThedetailsTheHousingYouAreLivingWith_NoRadioButtonSelected(String RetirementPlace) {
		wt.clickRadioButton(IsYourHousingLivingNoCheckBox, "Is the House You are Living In No Radio button");
		wt.clearTextBox(WhereWouldYouLikeTORetireTB);
		wt.sendValue(WhereWouldYouLikeTORetireTB, RetirementPlace, "Where Would you want to retire");
		wt.click(ClosestRelativeDropdown, "Closest relative dropdown");
		wt.click(ClosestrelativeContent, "Closest relative ");
		wt.click(HowManyMilesToClosestRelative, "How many miles to closest relative text box");
		wt.click(WouldYouConsiderLivingWithAChildCheckBox_Yes, "Would you consider to living with child and family member");
		wt.click(WouldYouConsiderMovingToCondoniumCheckBox_Yes, "Would you consider to moving to a condonium");
		wt.click(WouldYouConsiderMovingToLifeStyleCommunity_Yes, "Would you consider to moving lifestyle community");
		wt.click(WouldYouConsiderToMovingRetirementCommunity_Yes, "Would you consider to moving to retirement community");
		wt.click(SaveAndNextProfessional, "Save And Next: professional");
		wt.holdOn(Duration.ofSeconds(3));
		verifyHousingProfessionalPage();

	}
	public void verifyHowManyStoriesDoesItHaveOptions() throws InterruptedException {
		wt.holdOn(Duration.ofSeconds(1));
		wt.click(isYourHousingLivingYesCheckBox, "Is the housing Living With Not sure Radio Button");
		wt.holdOn(Duration.ofSeconds(3));
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On THe Scale On five Own Drodwn ");
		wt.click(OntheScaledropDown_option2, "Option 2");
		wt.click(accordian, "accordian");
		wt.click(HowManyStoryDoesItHave_DropDown, "how many story does it have dropdown");
		List<WebElement> ListWeb=wt.driver.findElements(By.xpath("//ul[@id='dropDownDivId']//li"));
		for(int i=0; i<ListWeb.size(); i++) {
			String text=ListWeb.get(i).getText();
		    wt.printDataInReport("Option"+i+"-"+text);
			
		}
		wt.click(updateAndContinueButton, "Update and continue button");
		wt.click(accordian, "Accordian");
	 
	}
	public void VerifyWhenWeSelectTWoThreeAndMore_HowManyStoryDoesItHave() throws InterruptedException {
		wt.holdOn(Duration.ofSeconds(1));
		wt.click(isYourHousingLivingYesCheckBox, "Is the housing Living With yes Radio Button");
		wt.click(isYourHousingLivingYesCheckBox, "Is the housing Living With yes sure Radio Button");
		wt.holdOn(Duration.ofSeconds(1));
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On THe Scale On five Own Drodwn ");
		wt.click(OntheScaledropDown_option2, "Option 2");
		wt.click(accordian, "accordian");
		wt.click(HowManyStoryDoesItHave_DropDown, "How many story does it have dropdown");
		wt.click(HowManyStoryDoesItHave_Option2, "Option 2");
		wt.isDisplayed(IsThereBedRoomOnMainFloor_InnerText, "Is there bed room On main floor text box");
		wt.isDisplayed(WhatFloorIsLaundryOn_InnerText, "What floor is laundry on text box");
		wt.click(HowManyStoryDoesItHave_DropDown, "How many story does it have dropdown");
		wt.click(HowManyStoryDoesItHave_Option3, "option 3");
		wt.isDisplayed(IsThereBedRoomOnMainFloor_InnerText, "Is there bed room On main floor text box");
		wt.isDisplayed(WhatFloorIsLaundryOn_InnerText, "What floor is laundry on text box");
		wt.click(HowManyStoryDoesItHave_DropDown, "How many story does it have dropdown");
		wt.click(HowManyStoryDoesItHave_OptionMore, "Option More");
		wt.isDisplayed(IsThereBedRoomOnMainFloor_InnerText, "Is there bed room On main floor text box");
		wt.isDisplayed(WhatFloorIsLaundryOn_InnerText, "What floor is laundry on text box");
	}  
   public void VerifyUpdateAndContinueWhenSelectIsYourHouseLivingInYesCheckAndSelectTwoOntheScaleOfOneTwoFive(String ClosestrelativeDistance) {
	   wt.click(isYourHousingLivingYesCheckBox, "Is the house you are living in");
	   wt.click(isYourHousingLivingYesCheckBox, "Is the house you are living in");
	   wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On the scale of five own dropdown");
	   wt.click(OntheScaledropDown_option2, "Option 2");
	   wt.click(accordian, "Parent Accordian");
	   wt.click(ClosestRelativeDropdown, "Closest relative dropdown");
	   wt.click(ClosestrelativeContent, "Closest relataive");
	   wt.sendValue(HowManyMilesToClosestRelative, ClosestrelativeDistance, "Closest relative textbox");
	   wt.click(WouldYouConsiderLivingWithAChildCheckBox_No, "Would you consider living with child and family member No radio button");
	   wt.click(WouldYouConsiderMovingToCondoniumCheckBox_No, "Would you consider to moving to condonium No radio button");
	   wt.click(WouldYouConsiderMovingToLifeStyleComunity_No, "Would you consider to moving Lifestylke community No radio button");
	   wt.click(WouldYouConsiderMovingRetirementCommunity_No, "Would you consider to moving retirement community");
	   wt.click(AreYouComfortableHavingCareGiverCheckBox_No, "Are you comfortable to having caregiver No radio button");
	   wt.click(IsYourHomeSuitableForLiveACareGiverCheckBox_No, "Is your home suitable to live No Radio button");
	   wt.sendValue(WhatYearWasYourHomeBuiltTB, "2024", "What year was home built");
	   wt.sendValue(whatIsTheMaintainedYardSizeTB, "34 feet", "What is the Maintained yard size? Text Box" );
	   wt.sendValue(WhatIsYourHomeSquareFootageTB, "52 foot", "What is your home square footage?");
	   wt.sendValue(WhatAreTheDoorWidthTB, "67 feet", "What are the door widths");
	   wt.click(HowManyStoryDoesItHave_DropDown, "How many story does it have dropdown");
	   wt.click(HowManyStoryDoesItHave_Option2, "Option 2");
	   wt.sendValue(WhatAreTheHallwayWidthTB, "34 feet","What are the hallway widths?");
	   wt.sendValue(HowManyStepDoYouHaveToClimbToGetFrontDoorTB, "45 ", "How many steps do you have to climb to get to the front door");
	   wt.sendValue(HowManyStepsDoYouHaveToNevigateToBackYardTB, "53", "How many steps do you have to navigate to get to the backyard?");
	   wt.sendValue(HowManyStepsDoYouhaveToNavigateHouseFromGarageTB, "78", "How many steps do you have to navigate to get in to the house from the garage (if house has a built-in garage)?");
	   wt.click(IsItSplitLevelCheckBox_No, "Is it split level? No radio button");
	   wt.sendValue(IsThereBedRoomOnMainFloor_TB, "No", "Is there a bedroom on the main floor(reachable without stairs)?");
	   wt.sendValue(WhatFloorIslaundryOn_TB, "5th", "What floor is laundry on");
	   wt.click(updateAndContinueButton, "Update and continue button");
	   CommonCode cmc=new CommonCode(wt);
		cmc.verifyToasterMessage("Your data have been updated successfully");
		wt.holdOn(Duration.ofSeconds(3));
	       wt.click(accordian,"accordian");

   }
   public void VerifySaveAndProceedToProfessionalWhenSelectIsYourHouseLivingInYesCheckAndSelectTwoOntheScaleOfOneTwoFive() {
	   wt.click(isYourHousingLivingYesCheckBox, "Is the house you are living in");
	   wt.click(isYourHousingLivingYesCheckBox, "Is the house you are living in");
	   wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On the scale of five own dropdown");
	   wt.click(OntheScaledropDown_option2, "Option 2");
	   wt.click(accordian, "Parent Accordian");
//	   wt.click(ClosestRelativeDropdown, "Closest relative dropdown");
//	   wt.click(ClosestrelativeContent, "Closest relataive");
	   wt.sendValue(HowManyMilesToClosestRelative, "53", "Closest relative textbox");
	   wt.click(WouldYouConsiderLivingWithAChildCheckBox_NotSure, "Would you consider living with child and family member Not sure radio button");
	   wt.click(WouldYouConsidermovingToCondoniumCheckBox_NotSure, "Would you consider to moving to condonium Not sure radio button");
	   wt.click(WouldyouConsiderMovingToLifeStyleCommunity_NotSure, "Would you consider to moving Lifestylke community Not sure radio button");
	   wt.click(WouldYouConsiderToMovingRetirementComunity_NotSure, "Would you consider to moving retirement community");
	   wt.click(AreYouComfortablehavingCareGiverCheckBox_NotSure, "Are you comfortable to having caregiver Not sure radio button");
	   wt.click(IsYourHomeSuitableForLiveACareGiverCheckBox_NotSure, "Is your home suitable to live Not sure Radio button");
	   wt.sendValue(WhatYearWasYourHomeBuiltTB, "2024", "What year was home built");
	   wt.sendValue(whatIsTheMaintainedYardSizeTB, "34 feet", "What is the Maintained yard size? Text Box" );
	   wt.sendValue(WhatIsYourHomeSquareFootageTB, "52 foot", "What is your home square footage?");
	   wt.sendValue(WhatAreTheDoorWidthTB, "67 feet", "What are the door widths");
	   wt.click(HowManyStoryDoesItHave_DropDown, "How many story does it have dropdown");
	   wt.click(HowManyStoryDoesItHave_Option3, "Option 3");
	   wt.sendValue(WhatAreTheHallwayWidthTB, "34 feet","What are the hallway widths?");
	   wt.sendValue(HowManyStepDoYouHaveToClimbToGetFrontDoorTB, "45 ", "How many steps do you have to climb to get to the front door");
	   wt.sendValue(HowManyStepsDoYouHaveToNevigateToBackYardTB, "53", "How many steps do you have to navigate to get to the backyard?");
	   wt.sendValue(HowManyStepsDoYouhaveToNavigateHouseFromGarageTB, "78", "How many steps do you have to navigate to get in to the house from the garage (if house has a built-in garage)?");
	   wt.click(IsItSplitLevelCheckBox_Yes, "Is it split level? Yes radio button");
	   wt.sendValue(IsThereBedRoomOnMainFloor_TB, "No", "Is there a bedroom on the main floor(reachable without stairs)?");
	   wt.sendValue(WhatFloorIslaundryOn_TB, "5th", "What floor is laundry on");  
	   wt.click(SaveAndNextProfessional, "Save and next: professional button");
	   CommonCode cmc=new CommonCode(wt);
		cmc.verifyToasterMessage("Your data have been updated successfully");

		
   }
}


