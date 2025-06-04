package com.agingoptions.PersonalInfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class PersonalInfoPageOr {
	
	public PersonalInfoPageOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
		
	}
	@FindBy(xpath="(//span[text()='Personal Info'])[1]")
	protected WebElement PersonalInfoButtonUnderSetUpPage;
	
	@FindBy(xpath="(//span[@class='selectedUserName'])[1]")
	protected WebElement primaryMemberToggleButton;
   
	@FindBy(xpath="(//span[@class='selectedUserName'])[2]")
	protected WebElement SpouseToggleButton;
	
	@FindBy(xpath="//h3[text()='Personal Details']")
	protected WebElement PersonalDetailsSection;
	
	@FindBy(xpath="//h3[text()='Status & Background Information']")
	protected WebElement StatusBackGroundSection;
	
	@FindBy(xpath="//h3[text()='Contact & Address Information']")
	protected WebElement ContactAndAddressInformation;
	
	@FindBy(xpath="//textarea[@placeholder='Enter planning objective']")
	protected WebElement WhatArePlanningObjective;
	
	@FindBy(xpath="//span[@class='d-inline-block']//img")
	protected WebElement BackToParalegalIcon;
	
	@FindBy(xpath="//h1[text()='Personal Information']")
	protected WebElement PersonalInformationtext;
	
	@FindBy(xpath="//div[@class='d-flex ']//p")
	protected WebElement ParalegalPageText;
	
	@FindBy(xpath="(//p[text()='Prefix / Suffix'])[1]/parent::div//div[@class='dropdown-icon ']//img")
	protected WebElement PrimaryMemberPrefixDropdown;
	
	@FindBy(xpath="(//p[text()='Prefix / Suffix'])[2]/parent::div//div[@class='dropdown-icon ']//img")
	protected WebElement SpousePrefixDropdown;
	
	@FindBy(xpath="//div[@id='dropDownDivId']//li[text()='Sr.']")
	protected WebElement SrOption;
	
	@FindBy(xpath="//input[@id='fName']")
	protected WebElement ClientFirstName;
	
	@FindBy(xpath="(//input[@id='fName'])[2]")
	protected WebElement spouseFirstName;
	
	@FindBy(xpath="//input[@id='mName']")
	protected WebElement ClientMiddleName;
	
	@FindBy(xpath="(//input[@id='mName'])[2]")
	protected WebElement SpouseMiddleName;
	
	@FindBy(xpath="(//input[@id='lName'])[2]")
	protected WebElement SpouseLastName;
	
	@FindBy(xpath="//input[@id='lName']")
	protected WebElement ClientLastName;
	
	@FindBy(xpath="//input[@id='nickName']")
	protected WebElement ClientNickName;
	
	@FindBy(xpath="(//input[@id='nickName'])[2]")
	protected WebElement SposueNickName;
	
	@FindBy(xpath="(//p[text()='Gender'])[1]/parent::div//div[@class='dropdown-icon ']//img")
	protected WebElement  clientGenderDropDown;
	
	@FindBy(xpath="(//p[text()='Gender'])[2]/parent::div//div[@class='dropdown-icon ']//img")
	protected WebElement SpouseGenderDropdown;
	
	@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Male']")
	protected WebElement MaleOptions;
	
	@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Female']")
	protected WebElement FemaleOptions;
	
	@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='Non-binary']")
	protected WebElement NonBinaryOptions;
	
	@FindBy(xpath="//p[text()='Date of birth*']/parent::div//div[@class='dropdown-icon ']//img")
	protected WebElement ClientCalenderIcon;
	
	@FindBy(xpath="//p[text()='Date of birth']/parent::div//div[@class='dropdown-icon ']//img")
	protected WebElement SpouseCalanderIcon;
	
	@FindBy(xpath="((//div[@id='custom-calendar'])[1]//select)[2]")
	protected WebElement ClientCalanderICon;
	
	@FindBy(xpath="(//div[@id='citizenshipId'])[1]")
	protected WebElement clientCitizenship;
	
	@FindBy(xpath="(//div[@id='citizenshipId'])[2]")
	protected WebElement spouseCitizenship;
	
	@FindBy(xpath="(//textarea[@placeholder='Place of birth'])[1]")
	protected WebElement clientPlaceOfBirth;
	
	@FindBy(xpath="(//textarea[@placeholder='Place of birth'])[2]")
	protected WebElement spousePlaceOfBirth;
	
	@FindBy(xpath="//input[@id='matNo']")
	protected WebElement matterNumber;
	
	@FindBy(xpath="(//p[text()='Relationship status*'])[1]/parent::div//div[@class=' dropdown-selected']//span")
	protected WebElement ClientRelationshipStatus;
	
	@FindBy(xpath="(//p[text()='Relationship status*'])[2]/parent::div//div[@class=' dropdown-selected']//span")
	protected WebElement SpouseRelationshipStatus;
	
	@FindBy(xpath="(//input[@id='noOfChildren'])[1]")
	protected WebElement NumberOfChildren;
	
	@FindBy(xpath="(//input[@id='noOfChildren'])[2]")
	protected WebElement SpouseNumberOfChildren;
	
	@FindBy(xpath="//p[text()='Date of Marriage']/parent::div//div[@class='dropdown-icon ']//img")
	protected WebElement ClientCalender;
	
	@FindBy(xpath="((//div[@class='calendar-header-selectors'])[3]//select)[2]")
	protected WebElement yearSectonOfDateOfMarriedCalender;
	
	@FindBy(xpath="((//div[@class='calendar-header-selectors'])[3]//select)[1]")
	protected WebElement MonthSectonOfDateOfMArriedCalender;
	
	@FindBy(xpath="(//input[@id='dob'])[1]")
	protected WebElement DateOfBirth;
	
	@FindBy(xpath="(//p[text()='Are you disabled / with special needs?']/parent::div//label//p)[1]")
	protected WebElement AreYouDisabledWithSpecialneedsYes;
	
	@FindBy(xpath="(//p[text()='Are you disabled / with special needs?']/parent::div//label//p)[2]")
	protected WebElement AreYouDisabledWithSpecialneedsNo;
	
	@FindBy(xpath="//textarea[@id='reasonOfDisable']")
	protected WebElement ClientSpecialneedsDescription;
	
	@FindBy(xpath="(//p[text()='Are you employed?']/parent::div//label//p)[1]")
	protected WebElement AreYouEmployedYes;
	
	@FindBy(xpath="(//p[text()='Are you employed?']/parent::div//label//p)[2]")
	protected WebElement AreYouEmployedNo;
	
	@FindBy(xpath="//p[text()='Occupation*']")
	protected WebElement occupationtext;
	
	@FindBy(xpath="//p[text()='Professional background']")
	protected WebElement professionalBackground;
	
	@FindBy(xpath="(//p[text()='Are you planning to retire overseas?']/parent::div//label//p)[1]")
	protected WebElement AreYouPlanningToretireOverSeas;
	
	@FindBy(xpath="//p[text()='In which place are you planning to retire?']")
	protected WebElement InWhichPlaceAreYouPlanningToRetire;
	
	@FindBy(xpath="(//p[text()='Are you a U.S Veteran?']/parent::div//label//p)[1]")
	protected WebElement  AreYouUSVeteranYesRadioBT;
	
	@FindBy(xpath="//p[text()='War period*']")
	protected WebElement WarPeriodText;
	
	
	
	
	
	
}
