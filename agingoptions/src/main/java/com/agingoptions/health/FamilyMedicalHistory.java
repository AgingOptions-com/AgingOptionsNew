package com.agingoptions.health;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FamilyMedicalHistory {

	private WebUtil util;

	public FamilyMedicalHistory(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="(//input[@id='fatherCurrentAge'])[1]")
	private WebElement primaryFatherCurrentAgeTB;

	public void inputPrimaryMemberFathersCurrentAge(String currentAge) {
		util.sendValue(primaryFatherCurrentAgeTB, currentAge, "Primary Member Father’s current age");
	}

	@FindBy(xpath="(//input[@id='fatherCurrentAge'])[2]")
	private WebElement spouseFatherCurrentAgeTB;

	public void inputSpouseFathersCurrentAge(String currentAge) {
		util.sendValue(spouseFatherCurrentAgeTB, currentAge, "Primary Member Father’s current age");
	}

	@FindBy(xpath="(//input[@id='motherCurrentAge'])[1]")
	private WebElement primaryMotherCurrentAgeTB;

	public void inputPrimaryMemberMotherCurrentAge(String currentAge) {
		util.sendValue(primaryMotherCurrentAgeTB, currentAge, "Primary Member Mother's current age");
	}

	@FindBy(xpath="(//input[@id='motherCurrentAge'])[2]")
	private WebElement spouseMotherCurrentAgeTB;

	public void inputSpouseMotherCurrentAge(String currentAge) {
		util.sendValue(spouseMotherCurrentAgeTB, currentAge, "Spouse Mother current age");
	}

	@FindBy(xpath="//button[text()='Save & Proceed to Primary Care Physician ']")
	private WebElement saveProceedToPrimaryCarePhysicianBT;

	public void clickSaveProceedToPrimaryCarePhysicianBT() {
		util.waitUntilElementToBeClickable(saveProceedToPrimaryCarePhysicianBT);
		util.clickActions(saveProceedToPrimaryCarePhysicianBT, "Save & Proceed to Primary Care Physician Button");
	}

	@FindBy(xpath="//span[text()='Family Medical History']")
	private WebElement familyMedicalHistorySideBarLink;

	public void clickFamilyMedicalHistorySideBarLink() {
		util.clickActions(familyMedicalHistorySideBarLink, "Family Medical History Side Bar Link");
	}

	@FindBy(xpath="//button[contains(text(),'My Parent Information')]")
	private WebElement myParentInfoAccordian;

	public void openMyParentInfoAccordian() {
		util.openAccordion(myParentInfoAccordian, "My Parent Info Accordian");
	}

	public String getPrimaryFatherCurrentAgeInputText() {
		String text=	util.GetAttributevalue(primaryFatherCurrentAgeTB, "value");
		return text;
	}

	public String getPrimarySpouseCurrentAgeInputText() {
		String text=util.GetAttributevalue(primaryMotherCurrentAgeTB, "value");
		return text;
	}

	public String getSpouseFatherCurrentAgeInputText() {
		String text=util.GetAttributevalue(spouseFatherCurrentAgeTB, "value");
		return text;
	}

	public String getSpouseMotherCurrentAgeInputText() {
		String text=	util.GetAttributevalue(spouseMotherCurrentAgeTB, "value");
		return text;
	}

	@FindBy(xpath="(//p[text()='Is your father currently living?'])[1]/parent::div//div//p[text()='No']")
	private WebElement primaryMemberIsYourFatherLivingNoRadioButton;

	public void clickPrimaryMemberIsYourFatherCurrentlyLivingNoRadioButton() {
		util.click(primaryMemberIsYourFatherLivingNoRadioButton, "Primary Member Is Your Father Currently Living No Radio Button");
	}

	@FindBy(xpath="(//p[text()='Is your father currently living?'])[2]/parent::div//div//p[text()='No']")
	private WebElement spouseIsYourFatherLivingNoRadioButton;

	public void clickSpouseIsYourFatherCurrentlyLivingNoRadioButton() {
		util.click(spouseIsYourFatherLivingNoRadioButton, "Spouse Is Your Father Currently Living No Radio Button");
	}

	@FindBy(xpath="(//p[text()='Is your mother currently living?'])[1]/parent::div//div//p[text()='No']")
	private WebElement primaryMemberIsYourMotherLivingNoRadioBT;

	public void clickprimaryMemberIsYourMotherLivingNoRadioBT() {
		util.click(primaryMemberIsYourMotherLivingNoRadioBT, "Spouse Is Your Mother Currently Living No Radio Button");
	}

	@FindBy(xpath="(//p[text()='Is your mother currently living?'])[2]/parent::div//div//p[text()='No']")
	private WebElement spouseIsYourMotherLivingNoRadioBT;

	public void clickSpouseIsYourMotherLivingNoRadioBT() {
		util.click(spouseIsYourMotherLivingNoRadioBT, "Spouse Is Your Mother Currently Living No Radio Button");
	}

	@FindBy(xpath="(//input[@id='fatherAgeAtDeath'])[1]")
	private WebElement primaryFatherAgeDeathTB;

	public void inputPrimaryFatherAgeAtDeath(String value) {
		util.sendValue(primaryFatherAgeDeathTB, value,"Primary Member Father’s age at death");
	}

	@FindBy(xpath="(//input[@id='fatherAgeAtDeath'])[2]")
	private WebElement spouseFatherAgeDeathTB;

	public void inputSpouseFatherAgeAtDeath(String value) {
		util.sendValue(spouseFatherAgeDeathTB, value,"Primary Member Father’s age at death");
	}

	@FindBy(xpath="(//p[text()='Father’s cause of death'])[1]/following-sibling::input")
	private WebElement primaryFathersCauseOfDeathTB;

	public void inputPrimaryMemberFatherCauseOfDeath(String value) {
		util.sendValue(primaryFathersCauseOfDeathTB,value ,"Primary Member Father’s cause of death description box" );
	}

	@FindBy(xpath="(//p[text()='Father’s cause of death'])[2]/following-sibling::input")
	private WebElement spouseFathersCauseOfDeathTB;

	public void inputSpouseFatherCauseOfDeath(String value) {
		util.sendValue(spouseFathersCauseOfDeathTB,value ,"Spouse Father’s cause of death Description box" );
	}

	@FindBy(xpath="(//input[@id='motherAgeAtDeath'])[1]")
	private WebElement primaryMemberMothersAgeAtDeathTB;

	public void inputprimaryMemberMothersAgeAtDeathTB(String value) {
		util.sendValue(primaryMemberMothersAgeAtDeathTB, value, "Primary Member Mother’s cause of death");
	}

	@FindBy(xpath="(//input[@id='motherAgeAtDeath'])[2]")
	private WebElement spouseMothersAgeAtDeathTB;

	public void inputSpuseMothersAgeAtDeathTB(String value) {
		util.sendValue(spouseMothersAgeAtDeathTB, value, "Spouse Mother’s cause of death");
	}

	@FindBy(xpath="(//p[text()='Mother’s cause of death']/following-sibling::input)[1]")
	private WebElement primaryMemberMothersCauseOfDeathTB;

	public void inputPrimaryMemberMothersCauseAtDeath(String value) {
		util.sendValue(primaryMemberMothersCauseOfDeathTB, value, "Primary Member Mother’s cause of death");
	}

	@FindBy(xpath="(//p[text()='Mother’s cause of death']/following-sibling::input)[2]")
	private WebElement spouseMothersCauseAtDeathTB;

	public void inputSpouseMothersCauseAtDeath(String value) {
		util.sendValue(spouseMothersCauseAtDeathTB, value, "Spouse Mother’s cause of death Description");
	}

	@FindBy(xpath="//button[contains(text(),'My Sibling Information')]")
	private WebElement mySiblingInfoAccordian;

	public void openMySiblingInfoAccordian() {
		util.openAccordion(mySiblingInfoAccordian, "My Sibling Info");
	}

	public String getPrimaryMemberFatherAgeAtDeathActualText() {
		String text=	util.GetAttributevalue(primaryFatherAgeDeathTB, "value");
		return text;
	}

	public String getSpouseFatherAgeAtDeathActualText() {
		String text=	util.GetAttributevalue(spouseFatherAgeDeathTB, "value");
		return text;
	}

	public String getPrimaryMemberFatherCauseOfDeathActualText() {
		String text=	util.GetAttributevalue(primaryFathersCauseOfDeathTB,"value");
		return text;
	}

	public String getSpouseFatherCauseOfDeathAcutalText() {
		String text=	util.GetAttributevalue(spouseFathersCauseOfDeathTB, "value");
		return text;
	}

	public String getPrimaryMemberMotherAgeAtDeathActualText() {
		String text=	util.GetAttributevalue(primaryMemberMothersAgeAtDeathTB, "value");
		return text;
	}

	public String getSpouseMotherAgeAtDeathActualText() {
		String text=	util.GetAttributevalue(spouseMothersAgeAtDeathTB, "value");
		return text;
	}

	public String getPrimaryMemberMotherCauseOfDeathActualText() {
		String text=	util.GetAttributevalue(primaryMemberMothersCauseOfDeathTB, "value");
		return text;
	}

	public String getSpouseMotherCauseOfDeathActualText() {
		String text=	util.GetAttributevalue(spouseMothersCauseAtDeathTB, "value");
		return text;
	}

	@FindBy(xpath="(//p[contains(text(),'Number of living siblings')]/following-sibling::input)[1]")
	private WebElement primaryMemberNumberOfLivingSiblingTB;

	public void inputPrimaryMemberNoOfLivingSiblingValue(String value) {
		util.sendValue(primaryMemberNumberOfLivingSiblingTB, value, "Number of living siblings");
	}

	@FindBy(xpath="(//p[contains(text(),'Number of living siblings')]/following-sibling::input)[2]")
	private WebElement spouseNumberOfLivingSiblingTB;

	public void inputSpouseNoOfLivingSiblingValue(String value) {
		util.sendValue(spouseNumberOfLivingSiblingTB, value, "Spouse Number of living siblings");
	}

	@FindBy(xpath="(//p[contains(text(),'Number of deceased siblings')]/following-sibling::input)[1]")
	private WebElement primaryMemberNoOfDeceasedSiblingTB;

	public void inputPrimaryMemberNoOfDeceasedSiblingValue(String value) {
		util.sendValue(primaryMemberNoOfDeceasedSiblingTB, value, "Primary Member Number of deceased siblings");
	}

	@FindBy(xpath="(//p[contains(text(),'Number of deceased siblings')]/following-sibling::input)[2]")
	private WebElement spouseNoOfDeceasedSiblingTB ;

	public void inputSpouseNoOfDeceasedSiblingValue(String value) {
		util.sendValue(spouseNoOfDeceasedSiblingTB,value ,"Spouse Number of deceased siblings" );
	}

	public String getPrimaryMemberNoOfLivingSiblingActualValue() {
		String text=	util.GetAttributevalue(primaryMemberNumberOfLivingSiblingTB, "value");
		return text;
	}

	public String getSpouseNoOfLivingSiblingActualValue() {
		String text=	util.GetAttributevalue(spouseNumberOfLivingSiblingTB, "value");
		return text;
	}

	public String getPrimaryMemberNoOfDeceasedSiblingActualValue() {
		String text=	util.GetAttributevalue(primaryMemberNoOfDeceasedSiblingTB, "value");
		return text;
	}

	public String getSpouseNoOfDeceasedSiblingActualValue() {
		String text=	util.GetAttributevalue(spouseNoOfDeceasedSiblingTB, "value");
		return text;
	}




}
