package com.Ao.HousingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingInfoOr {

	
public HousingInfoOr (WebUtil wt) {
	PageFactory.initElements(wt.getDriver(),this);
	
}
@FindBy (xpath=" // span[text()='Housing Information']")
protected WebElement HousingInformationText;

@FindBy(xpath="(//div[@class='d-flex flex-column']//p[text()='Yes'])[1]")
protected WebElement isYourHousingLivingYesCheckBox;

@FindBy(xpath="(//div[@class='d-flex flex-column']//p[text()='No'])[1]")
protected WebElement IsYourHousingLivingNoCheckBox;

@FindBy(xpath="(//div[@class='d-flex flex-column']//p[text()='Not Sure'])[1]")
protected WebElement IsYourHousingLivingNotSureCheckBox;

@FindBy(xpath="//p[contains(text(),'On a scale of 1 to 5, how likely is it that you will remain in your current home? 1-Not at all, 5-Will be in my ')]")
protected WebElement OntheScaleOfOneToFiveOwnHomeInnerText;

@FindBy(xpath="//div[@id='ownhome']")
protected WebElement OnTheScaleOfFiveOwnHomeDropDown;

@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='1']")
protected WebElement OntheScaledropDown_option1;

@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='2']")
protected WebElement OntheScaledropDown_option2;

@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='3']")
protected WebElement OntheScaledropDown_option3;

@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='4']")
protected WebElement OntheScaledropDown_option4;

@FindBy(xpath="//ul[@id='dropDownDivId']//li[text()='5']")
protected WebElement OntheScaledropDown_option5;


@FindBy(xpath="//input[@id='39']")
protected WebElement WhereWouldYouLikeTORetireTB;

@FindBy(xpath="//p[contains(text(),'Where would you eventually like to retire (city and state')]")
protected WebElement whereWouldYouWantToRetire_Innertext;

@FindBy(xpath="//div[@id='closestRelative']")
protected WebElement ClosestRelativeDropdown;

@FindBy(xpath="//ul[@id='dropDownDivId']//li")
protected WebElement ClosestrelativeContent;

@FindBy(xpath="//input[@id='41']")
protected WebElement HowManyMilesToClosestRelative;

@FindBy(xpath="(//p[text()='Yes'])[2]")
protected WebElement WouldYouConsiderLivingWithAChildCheckBox_Yes;

@FindBy(xpath="(//p[text()='No'])[2]")
protected WebElement WouldYouConsiderLivingWithAChildCheckBox_No;

@FindBy(xpath="(//p[text()='Not Sure'])[2]")
protected WebElement WouldYouConsiderLivingWithAChildCheckBox_NotSure;

@FindBy(xpath="(//p[text()='Yes'])[3]")
protected WebElement WouldYouConsiderMovingToCondoniumCheckBox_Yes;

@FindBy(xpath="(//p[text()='No'])[3]")
protected WebElement WouldYouConsiderMovingToCondoniumCheckBox_No;

@FindBy(xpath="(//p[text()='Not Sure'])[3]")
protected WebElement WouldYouConsidermovingToCondoniumCheckBox_NotSure;

@FindBy(xpath="(//p[text()='Yes'])[4]")
protected WebElement WouldYouConsiderMovingToLifeStyleCommunity_Yes;

@FindBy(xpath="(//p[text()='No'])[4]")
protected WebElement WouldYouConsiderMovingToLifeStyleComunity_No;

@FindBy(xpath="(//p[text()='Not Sure'])[4]")
protected WebElement WouldyouConsiderMovingToLifeStyleCommunity_NotSure;

@FindBy(xpath="(//p[text()='Yes'])[5]")
protected WebElement WouldYouConsiderToMovingRetirementCommunity_Yes;

@FindBy(xpath="(//p[text()='No'])[5]")
protected WebElement WouldYouConsiderMovingRetirementCommunity_No;

@FindBy(xpath="(//p[text()='Not Sure'])[5]")
protected WebElement WouldYouConsiderToMovingRetirementComunity_NotSure;

@FindBy(xpath="//button[text()='Current Residence Characteristics']")
protected WebElement CurrentResidenceCharactarstics_Text;

@FindBy(xpath="//button[text()='Caregiver Suitability']")
protected WebElement CaregiverSuitability;

@FindBy(xpath="(//p[text()='Yes'])[6]")
protected WebElement AreYouComfortableHavingCareGiverCheckBox_Yes;

@FindBy(xpath="(//p[text()='No'])[6]")
protected WebElement AreYouComfortableHavingCareGiverCheckBox_No;

@FindBy(xpath="(//p[text()='Not Sure'])[6]")
protected WebElement AreYouComfortablehavingCareGiverCheckBox_NotSure;

@FindBy(xpath="(//p[text()='Yes'])[7]")
protected WebElement IsyourHomeSuitableForLiveACareGiverCheckBox_Yes;

@FindBy(xpath="(//p[text()='No'])[7]")
protected WebElement IsYourHomeSuitableForLiveACareGiverCheckBox_No;

@FindBy(xpath="(//p[text()='Not Sure'])[7]")
protected WebElement  IsYourHomeSuitableForLiveACareGiverCheckBox_NotSure;

@FindBy(xpath="//input[@id='56']")
protected WebElement WhatYearWasYourHomeBuiltTB;

@FindBy(xpath="//input[@id='66']")
protected WebElement whatIsTheMaintainedYardSizeTB;

@FindBy(xpath="//input[@id='57']")
protected WebElement WhatIsYourHomeSquareFootageTB;

@FindBy(xpath="//input[@id='70']")
protected WebElement WhatAreTheDoorWidthTB;

@FindBy(xpath="//div[@id='stories']")
protected WebElement HowManyStoryDoesItHave_DropDown;

@FindBy(xpath="//ul//li[text()='1']")
protected WebElement HowManyStoryDoesitHave_option1;

@FindBy(xpath="//ul//li[text()='2']")
protected WebElement HowManyStoryDoesItHave_Option2;

@FindBy(xpath="//ul//li[text()='3']")
protected WebElement HowManyStoryDoesItHave_Option3;

@FindBy (xpath="//ul//li[text()='More']")
protected WebElement HowManyStoryDoesItHave_OptionMore;

@FindBy(xpath="//input[@id='71']")
protected WebElement WhatAreTheHallwayWidthTB;

@FindBy(xpath="//input[@id='67']")
protected WebElement HowManyStepDoYouHaveToClimbToGetFrontDoorTB; 

@FindBy(xpath="//input[@id='68']")
protected WebElement HowManyStepsDoYouHaveToNevigateToBackYardTB;


@FindBy(xpath="//input[@id='69']")
protected WebElement HowManyStepsDoYouhaveToNavigateHouseFromGarageTB;


@FindBy(xpath="(//p[text()='Yes'])[8]")
protected WebElement IsItSplitLevelCheckBox_Yes;

@FindBy(xpath="(//p[text()='No'])[8]")
protected WebElement IsItSplitLevelCheckBox_No;

@FindBy (xpath="//p[contains(text(),'Is there a bedroom on the main floor(reachable without')]")
protected WebElement IsThereBedRoomOnMainFloor_InnerText;

@FindBy(xpath="//p[contains(text(),'What floor is the laundry on')]")
protected WebElement WhatFloorIsLaundryOn_InnerText;

@FindBy(xpath="//input[@id='63']")
protected WebElement IsThereBedRoomOnMainFloor_TB;

@FindBy(xpath="//input[@id='62']")
protected WebElement WhatFloorIslaundryOn_TB;

@FindBy(xpath="//button[text()='Update & Continue later']")
protected WebElement updateAndContinueButton;

@FindBy(xpath="//button[text()='Save & Next: Housing Professionals']")
protected WebElement SaveAndNextProfessional;

@FindBy(xpath="//div[@class='i-dont-have-one']//p")
protected WebElement IDoNotHaveRealtorInnerText;

@FindBy(xpath="//img[@alt='accordion']")
protected WebElement accordian;

}
