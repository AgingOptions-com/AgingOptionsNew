package com.nspl.agingoptions.commoncode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

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
	public void verifyCheckYes_NotSure_IsYourHousingLivingIn() {
		wt.clickRadioButton(isYourHousingLivingYesCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? Yes radio button");
		try {
			Thread.sleep(Duration.ofSeconds(3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wt.verifyInnerText(OntheScaleOfOneToFiveOwnHomeInnerText, "On a scale of 1 to 5, how likely is it that you will remain in your current home? 1-Not at all, 5-Will be in my own home", "On The Scale On One Two Five.. dropdown");
		wt.click(IsYourHousingLivingNotSureCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? Not Sure radio button ");
		wt.verifyInnerText(OntheScaleOfOneToFiveOwnHomeInnerText, "On a scale of 1 to 5, how likely is it that you will remain in your current home? 1-Not at all, 5-Will be in my own home", "On The Scale On One Two Five.. dropdown");
	}
	
	public void verifyCheckYes_IsYourHousingLivingIn() {
		if(isYourHousingLivingYesCheckBox.isSelected()==false) {
			wt.click(isYourHousingLivingYesCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? Yes radio button");	
			
			wt.click(isYourHousingLivingYesCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? Yes radio button");	
		
		}else 
			wt.click(isYourHousingLivingYesCheckBox, "Is the house you are living in, the house you like to spend the rest of your life? Yes radio button");	
			}
	public void GotoTheHousingInformation() {
		LoginPage loginpageObj=new LoginPage(wt);
		loginpageObj.verifyvalidLogin(wt.getProperty("emailId"), wt.getProperty("Password"));
		loginpageObj.verifyOtpPage();
		CommonCode commonpage=new CommonCode(wt);
	
	  commonpage.hiturlOfYopmail();
      commonpage.Gotosearchemail(wt.getProperty("emailId"));
      
     String otp= commonpage.GoTofindtextOfOTP();
     commonpage.gotoinputotp(otp);
     commonpage.GoToClickVerifyButton();
     try {
		Thread.sleep(Duration.ofSeconds(30));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     commonpage.verifyPersonalInfoPage();
      try {
		Thread.sleep(Duration.ofSeconds(4));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     commonpage.goToClickHousingButtonUnderSetUp();
     try {
		Thread.sleep(Duration.ofSeconds(5));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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
		Thread.sleep(Duration.ofSeconds(5));
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
        wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On The Scale On One To Five Own Home Drop Down");
        wt.click(ClosestRelativeDropdown, "Closest Relative DropDown");
        wt.click(ClosestrelativeContent, "Closest relative");
        wt.sendValue(HowManyMilesToClosestRelative,"45", "How Many miles to closest relative Text box");
        wt.clickRadioButton(WouldYouConsiderLivingWithAChildCheckBox_Yes, "Would you consider Living With Child radio button");
        wt.clickRadioButton(WouldYouConsiderMovingToCondoniumCheckBox_Yes, "Would you consider to moving condonium radio button");
        wt.clickRadioButton(WouldYouConsiderMovingToLifeStyleCommunity_Yes, "Would you consider to lifestyle community");
	    wt.clickRadioButton(WouldYouConsiderToMovingRetirementCommunity_Yes, "would you consider to moving retirement community radio button");
	    wt.click(updateAndContinueButton, "Update and continue");
	    CommonCode cmc=new CommonCode(wt);
	    cmc.verifyToasterMessage("Your data have been updated successfully");
	}
	public void SaveAndProceedThedetailsWithIstheHouse_yesCheck_and_OntheScaleOnFive_Select1(String closestrelativedistanceInMiles) {
		    wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On The Scale On One To Five Own Home Drop Down");
	        wt.click(ClosestRelativeDropdown, "Closest Relative DropDown");
	        wt.click(ClosestrelativeContent, "Closest relative");
	        wt.sendValue(HowManyMilesToClosestRelative,"45", "How Many miles to closest relative Text box");
	        wt.clickRadioButton(WouldYouConsiderLivingWithAChildCheckBox_Yes, "Would you consider Living With Child radio button");
	        wt.clickRadioButton(WouldYouConsiderMovingToCondoniumCheckBox_Yes, "Would you consider to moving condonium radio button");
	        wt.clickRadioButton(WouldYouConsiderMovingToLifeStyleCommunity_Yes, "Would you consider to lifestyle community");
		    wt.clickRadioButton(WouldYouConsiderToMovingRetirementCommunity_Yes, "would you consider to moving retirement community radio button");
		    wt.click(SaveAndNextProfessional, "Save and Next :Professional Button");
		    CommonCode cmc=new CommonCode(wt);
		    cmc.verifyToasterMessage("Your data have been updated successfully");
		    
	}
	public void verifyHousingProfessionalPage() {
		wt.verifyInnerText(IDoNotHaveRealtorInnerText, "I don’t have a Realtor", "Housing professional Page");
	}
	public void UpdateAndContinueTheDetailsIsTheHouseYouAreLivingWith_NoRadioButtonSelected(String RetirementPlace) {
	wt.clickRadioButton(IsYourHousingLivingNoCheckBox, "Is the House You are Living In No Radio button");
	wt.sendValue(WhereWouldYouLikeTORetireTB, RetirementPlace, "Where Would you want to retire");
	wt.click(ClosestRelativeDropdown, "Closest relative dropdown");
	wt.click(ClosestrelativeContent, "Closest relative ");
	wt.click(HowManyMilesToClosestRelative, "How many miles to closest relative text box");
	wt.clickRadioButton(WouldYouConsiderLivingWithAChildCheckBox_Yes, "Would you consider to living with child and family member");
	wt.clickRadioButton(WouldYouConsiderMovingToCondoniumCheckBox_Yes, "Would you consider to moving to a condonium");
	wt.click(WouldYouConsiderMovingToLifeStyleCommunity_Yes, "Would you consider to moving lifestyle community");
	wt.clickRadioButton(WouldYouConsiderToMovingRetirementCommunity_Yes, "Would you consider to moving to retirement community");
	wt.click(updateAndContinueButton, "Update and continue Button");
	 CommonCode cmc=new CommonCode(wt);
	    cmc.verifyToasterMessage("Your data have been updated successfully");
		
	}
	
	public void SaveAndNextToHousingProfessional_ThedetailsTheHousingYouAreLivingWith_NoRadioButtonSelected(String RetirementPlace) {
		
		wt.clickRadioButton(IsYourHousingLivingNoCheckBox, "Is the House You are Living In No Radio button");
		wt.clearTextBox(WhereWouldYouLikeTORetireTB);
		wt.sendValue(WhereWouldYouLikeTORetireTB, RetirementPlace, "Where Would you want to retire");
		wt.click(ClosestRelativeDropdown, "Closest relative dropdown");
		wt.click(ClosestrelativeContent, "Closest relative ");
		wt.click(HowManyMilesToClosestRelative, "How many miles to closest relative text box");
		wt.clickRadioButton(WouldYouConsiderLivingWithAChildCheckBox_Yes, "Would you consider to living with child and family member");
		wt.clickRadioButton(WouldYouConsiderMovingToCondoniumCheckBox_Yes, "Would you consider to moving to a condonium");
		wt.click(WouldYouConsiderMovingToLifeStyleCommunity_Yes, "Would you consider to moving lifestyle community");
		wt.clickRadioButton(WouldYouConsiderToMovingRetirementCommunity_Yes, "Would you consider to moving to retirement community");
		wt.click(SaveAndNextProfessional, "Save And Next: professional");
		 CommonCode cmc=new CommonCode(wt);
		    cmc.verifyToasterMessage("Your data have been updated successfully");
		    verifyHousingProfessionalPage();
			
	}
	public void verifyHowManyStoriesDoesItHaveOptions() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(1));
		wt.click(IsYourHousingLivingNotSureCheckBox, "Is the housing Living With Not sure Radio Button");
		Thread.sleep(Duration.ofSeconds(3));
		wt.click(OnTheScaleOfFiveOwnHomeDropDown, "On THe Scale On five Own Drodwn ");
		wt.click(OntheScaledropDown_option2, "Option 2");
		wt.click(accordian, "accordian");
		List<WebElement> ListWeb=wt.driver.findElements(By.xpath("//ul[@id='dropDownDivId']//li"));
		wt.click(HowManyStoryDoesItHave_DropDown, "How many story does it have dropdown");
		  wt.ListSize(ListWeb);
		 
		   
		   
	   }
		public void VerifyWhenWeSelectTWoThreeAndMore_HowManyStoryDoesItHave() throws InterruptedException {
			Thread.sleep(Duration.ofSeconds(1));
			wt.clickRadioButton(IsYourHousingLivingNotSureCheckBox, "Is the housing Living With Not sure Radio Button");
			Thread.sleep(Duration.ofSeconds(1));
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
		
		
	}
	

