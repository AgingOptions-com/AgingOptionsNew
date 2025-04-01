package com.agingoptions.health;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
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
		util.waitUntilElementToBeClickable(familyMedicalHistorySideBarLink);
		util.holdOn(Duration.ofSeconds(1));
		util.waitUntilElementClickableAndClick(familyMedicalHistorySideBarLink);
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

	@FindBy(xpath="(//p[contains(text(),'Are you adopted?')]/parent::div//label//p[text()='Yes'])[1]/preceding-sibling::input")
	private WebElement primaryMemberAreYouAdoptedYesRadioBT;

	public void clickPrimaryMemberAreYouAdoptedYesRadioBT() {
		util.click(primaryMemberAreYouAdoptedYesRadioBT,"Primary Member Are You Adopted Yes Radio Button" );
	}

	@FindBy(xpath="(//p[contains(text(),'Are you adopted?')]/parent::div//label//p[text()='Yes'])[2]/preceding-sibling::input")
	private WebElement spouseAreYouAdoptedYesRadioBT;

	public void clickSpouseAreYouAdoptedYesRadioBT() {
		util.click(spouseAreYouAdoptedYesRadioBT,"Spouse Are You Adopted Yes Radio Button" );
	}

	@FindBy(xpath="//button[text()='My Family Medical History']")
	private WebElement myFamilyMedicalHistoryAccordianBT;

	public void openMyFamilyMedcialHistoryAccordian() {
		util.waitUntilPresentInUI(myFamilyMedicalHistoryAccordianBT,"My Family Medical History Accordian" );
		util.openAccordion(myFamilyMedicalHistoryAccordianBT, "My Family Medical History Accordian");
	}

	public void PrimaryMemberAreYouAdoptedYesRadioButtonSelectionStatus() {
		util.isSelected(primaryMemberAreYouAdoptedYesRadioBT,"Primary Member Are You Adopted Yes Radio button");
	}

	public void spouseAreYouAdoptedYesRadioButtonSelectionStatus() {
		util.isSelected(spouseAreYouAdoptedYesRadioBT,"Spouse Are You Adopted Yes Radio button");
	}

	@FindBy(xpath="(//p[contains(text(),'Are you adopted?')]/parent::div//label//p[text()='No'])[1]")
	private WebElement primaryMemberAreYouAdoptedNoRadioBT;

	public void clickprimaryMemberAreYouAdoptedNoRadioBT() {
		util.click(primaryMemberAreYouAdoptedNoRadioBT, "Primary Member Are You Adopted No Radio Button");
	}

	@FindBy(xpath="(//p[contains(text(),'Are you adopted?')]/parent::div//label//p[text()='No'])[2]")
	private WebElement spouseAreYouAdoptedNoRadioBT;

	public void clickSpouseAreYouAdoptedNoRadioBT() {
		util.click(spouseAreYouAdoptedNoRadioBT, "Spouse Are You Adopted No Radio Button");
	}

	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveBT;

	@FindBys(@FindBy(xpath="//input[contains(@name,'Dementia/Alzheimer')]"))
	private List<WebElement> dementiaAlzheimerCheckBoxes;

	public void clickdementiaCheckboxes() {
		for(int i=0; i<=dementiaAlzheimerCheckBoxes.size()-1; i++) {
			WebElement ele=		dementiaAlzheimerCheckBoxes.get(i);
			ele.click();
			util.holdOn(Duration.ofMillis(500));
			util.clickJavaScript(saveBT, "Save Pop Up");
		}
	}

	@FindBys(@FindBy(xpath="//input[contains(@name,'Parkinson’s')]"))
	private List<WebElement> parkinsonsCheckBoxes;

	public void clickParkinsonsCheckboxes() {
		for(int i=0; i<=parkinsonsCheckBoxes.size()-1; i++) {
			WebElement ele=		parkinsonsCheckBoxes.get(i);
			ele.click();
			util.holdOn(Duration.ofMillis(500));
			util.clickJavaScript(saveBT, "Save Pop Up");
		}
	}

	@FindBys(@FindBy(xpath="//input[contains(@name,'Heart disease')]"))
	private List<WebElement> heartDiseaseCheckBoxes;

	public void clickHeartDiseaaseCheckboxes() {
		for(int i=0; i<=heartDiseaseCheckBoxes.size()-1; i++) {
			WebElement ele=heartDiseaseCheckBoxes.get(i);
			ele.click();
		}
	}

	@FindBys(@FindBy(xpath="//input[contains(@name,'Stroke')]"))
	private List<WebElement> strokeCheckBoxes;

	public void clickStrokeCheckboxes() {
		for(int i=0; i<=strokeCheckBoxes.size()-1; i++) {
			WebElement ele=strokeCheckBoxes.get(i);
			ele.click();
		}
	}

	@FindBys(@FindBy(xpath="//input[contains(@name,'Diabetes')]"))
	private List<WebElement> diabetesCheckBoxes;

	public void clickDiabetesCheckboxes() {
		for(int i=0; i<=diabetesCheckBoxes.size()-1; i++) {
			WebElement ele=diabetesCheckBoxes.get(i);
			ele.click();
		}
	}

	@FindBys(@FindBy(xpath="//input[contains(@name,'Blood pressure issues')]"))
	private List<WebElement> bloodPressureCheckBoxes;

	public void clickBloodPressureCheckboxes() {
		for(int i=0; i<=bloodPressureCheckBoxes.size()-1; i++) {
			WebElement ele=bloodPressureCheckBoxes.get(i);
			ele.click();
		}
	}

	@FindBys(@FindBy(xpath="//input[contains(@name,'Elevated cholesterol')]"))
	private List<WebElement> elevatedCholesterolCheckBoxes;

	public void clickElevatedCholesterolCheckboxes() {
		for(int i=0; i<=elevatedCholesterolCheckBoxes.size()-1; i++) {
			WebElement ele=elevatedCholesterolCheckBoxes.get(i);
			ele.click();
		}
	}

	@FindBys(@FindBy(xpath="//input[contains(@name,'Glaucoma')]"))
	private List<WebElement> glaucomeCheckBoxes;

	public void clickglaucomaCheckboxes() {
		for(int i=0; i<=glaucomeCheckBoxes.size()-1; i++) {
			WebElement ele=glaucomeCheckBoxes.get(i);
			ele.click();
		}
	}

	public void dementiaCheckBoxStatus() {
		for(int i=0; i<=dementiaAlzheimerCheckBoxes.size()-1; i++) {
			WebElement ele=	dementiaAlzheimerCheckBoxes.get(i);
			util.isSelected(ele, "Dementia Alzheimer checkbox");
		}
	}

	public void parkinsonsCheckBoxStatus() {
		for(int i=0; i<=parkinsonsCheckBoxes.size()-1; i++) {
			WebElement ele=	parkinsonsCheckBoxes.get(i);
			util.isSelected(ele, "Parkinson’ checkbox");
		}
	}

	public void heartDiseaseCheckBoxStatus() {
		for(int i=0; i<=heartDiseaseCheckBoxes.size()-1; i++) {
			WebElement ele=	heartDiseaseCheckBoxes.get(i);
			util.isSelected(ele, "Heart Disease checkbox");
		}}

	public void strokeCheckBoxStatus() {
		for(int i=0; i<=strokeCheckBoxes.size()-1; i++) {
			WebElement ele=	strokeCheckBoxes.get(i);
			util.isSelected(ele, "Stroke checkbox");
		}}

	public void diabetesCheckBoxStatus() {
		for(int i=0; i<=diabetesCheckBoxes.size()-1; i++) {
			WebElement ele=	diabetesCheckBoxes.get(i);
			util.isSelected(ele, "Diabetes checkbox");
		}}

	public void bloodPressureCheckBoxStatus() {
		for(int i=0; i<=bloodPressureCheckBoxes.size()-1; i++) {
			WebElement ele=	bloodPressureCheckBoxes.get(i);
			util.isSelected(ele, "Blood Pressure checkbox");
		}}

	public void elevatedCheckBoxStatus() {
		for(int i=0; i<=elevatedCholesterolCheckBoxes.size()-1; i++) {
			WebElement ele=	elevatedCholesterolCheckBoxes.get(i);
			util.isSelected(ele, "Elevated Cholesterol checkbox");
		}}
	
	public void glaucomeCheckBoxStatus() {
		for(int i=0; i<=glaucomeCheckBoxes.size()-1; i++) {
			WebElement ele=	glaucomeCheckBoxes.get(i);
			util.isSelected(ele, "Glaucome checkbox");
		}}
	


}
