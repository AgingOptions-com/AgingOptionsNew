package com.agingoptions.PersonalInfo;

import java.time.Duration;
import java.util.Map;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class PersonalInfoPage extends PersonalInfoPageOr {
 
	public WebUtil wt;
	public PersonalInfoPage(WebUtil util) {
		super(util);
		this.wt=util;
	}
	
   public void VerifyPersonalInfoPage() {
	 wt.verifyInnerText(PersonalInformationtext, "Personal Information", "personal information text");
   }
   public void VerifyMarriedUser() {
	   wt.verifyInnerText(primaryMemberToggleButton, "(Primary)", "Primary member toggle button");
	   wt.verifyInnerText(SpouseToggleButton, "(Spouse)", "Spouse toggle button");
   }
   public void verifybackToParalegalFunctionality() {
	   wt.click(BackToParalegalIcon, "Back to paralegal icon");
	   wt.holdOn(Duration.ofSeconds(10));
	   wt.verifyInnerText(ParalegalPageText, "Paralegal", "Paralegal page text");
   }
   
   public void verifyActivationComparison() {
	CommonCode commonObj=new CommonCode(wt);
	Map<String,String> mapObj=commonObj.LoginWithNewMarriedUser1();
    String AcctualFirstname=mapObj.get("firstName");
    String ActualLastName= mapObj.get("lastName");
    String AcctualNumberObChild=mapObj.get("noOfChild");
    String ActualprimaryMemberDob= mapObj.get("primaryMemberDob");
    String spouseFirstName=mapObj.get("spouseFirstName");
   // String spouseDob= mapObj.get("spouseDob");
    String matterNumber= mapObj.get("matterNumber");
    String planningObjective= mapObj.get("PlanningObjective");
   String expectedClientName=  wt.GetAttributevalue(ClientFirstName, "value");
    String expectedClientLastName=wt.GetAttributevalue(ClientLastName, "value");
   String ExpectedSpouseFirstName= wt.GetAttributevalue(this.spouseFirstName, "value");
    String expectedClientDob=wt.GetAttributevalue(DateOfBirth, "value"); 
    String expectedMatterNumber=  wt.GetAttributevalue(this.matterNumber, "value");
    String expectedPlanningObjective=wt.GetAttributevalue(WhatArePlanningObjective, "value");
    wt.click(StatusBackGroundSection,"Background section");
    String expectedClientNoOfChildren=  wt.GetAttributevalue(NumberOfChildren, "value");
    wt.holdOn(Duration.ofSeconds(5));
    wt.verifyActualExpectedText(AcctualFirstname ,expectedClientName, "first name");
    wt.verifyActualExpectedText(ActualLastName ,expectedClientLastName, "Last name");
    wt.verifyActualExpectedText(AcctualNumberObChild ,expectedClientNoOfChildren, "Number of children");
    wt.verifyActualExpectedText(ActualprimaryMemberDob ,expectedClientDob, "Date of birth");
    wt.verifyActualExpectedText(spouseFirstName ,ExpectedSpouseFirstName, " Spouse first name");
    wt.verifyActualExpectedText(matterNumber ,expectedMatterNumber, "Matter number");
    wt.verifyActualExpectedText(planningObjective ,expectedPlanningObjective, "Planning objective");
    
   }
   
   public void verifyDisabilityOfSpouseMaritalstatusAndfollowingSection() {
	   wt.verifyEnabled(SpouseRelationshipStatus);
	   wt.verifyEnabled(SpouseNumberOfChildren);
   }
   public void verifyClickAreYouEmployedYes() {
	   wt.click(StatusBackGroundSection, "Status and background section");
	   wt.click(AreYouEmployedYes,"Are you employed yes button");
	   wt.verifyInnerText(occupationtext, "Occupation*", "occupation text");
   }
   
   public void verifyClickAreYouEmployedNo() {
	   wt.click(StatusBackGroundSection, "Status and background section");
	   wt.click(AreYouEmployedNo, "Are you employed No ");
	   wt.verifyInnerText(professionalBackground, "Professional background", "professional background");
   }
   public void VerifyAreDisableAndSpecialNeeds() {
	   wt.click(StatusBackGroundSection, "Status and background section");
	   wt.click(AreYouDisabledWithSpecialneedsYes, "Are you disabled with special needs");
	   wt.sendValue(ClientSpecialneedsDescription, "He meet an acciden in his childhood", "Special needs description");
	   
   }
   public void verifyAreYouPlanningToRetireOverSeasYes() {
	   wt.click(StatusBackGroundSection, "Status and background section"); 
	   wt.click(AreYouEmployedYes, "Are you employed Yes radio button");
	   wt.click(AreYouPlanningToretireOverSeas, "Are You Planning To Retire Yes");
	   wt.verifyInnerText(InWhichPlaceAreYouPlanningToRetire, "In which place are you planning to retire?", "In which place are you planning to retire");
   }
   public void VerifyAreYouUSVeteranYesRadioButtonChecked() {
	   wt.click(StatusBackGroundSection, "Status and background section"); 
	   wt.click(AreYouUSVeteranYesRadioBT, "Are you Us veteran yes radio button");
	   wt.verifyInnerText(WarPeriodText, "War period*", "War period text");
   }
}
