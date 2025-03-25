package com.agingoptions.health;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class PersonalMedicalHistory {
	WebUtil util;

	public PersonalMedicalHistory(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//span[contains(text(),'View and add/edit your ')]")
	private WebElement viewYourEditPersonalMedicalHistoryText;

	public String getViewYourEditPersonalMedicalHistoryText() {
		String text=	util.getInnerText(viewYourEditPersonalMedicalHistoryText);
		return text;
	}

	@FindBy(xpath="(//p[text()='Blood Type'])[1]")
	private WebElement primaryMemberBloodTypeDDText;

	@FindBy(xpath="(//p[text()='Blood Type'])[2]")
	private WebElement spouseBloodTypeDDText;

	@FindBy(xpath="//button[text()='Blood Type']")
	private WebElement bloodTypeAccordian;

	@FindBy(xpath="//button[text()='Medical Conditions']")
	private WebElement medicalConditionsAccordian;

	@FindBy(xpath="//button[text()='Environmental & Lifestyle Factors']")
	private WebElement environmentalLifestyleFactorsAccordian;

	@FindBy(xpath="(//p[text()='Dementia/Alzheimer’s'])[1]")
	private WebElement primaryMemberDementiaAlzheimer;

	@FindBy(xpath="(//p[text()='Dementia/Alzheimer’s'])[2]")
	private WebElement spouseDementiaAlzheimer;

	public void primaryMemberBloodTypeDDTextStatus() {
		util.isDisplayed(primaryMemberBloodTypeDDText, "Primary member Blood type Text");
	}
	public void SpouseBloodTypeDDTextStatus() {
		util.isDisplayed(spouseBloodTypeDDText, "spouse Blood type Text");
	}
	public void bloodTypeAccordianStatus() {
		util.isDisplayed(bloodTypeAccordian, "Blood type Accordian");
	}
	public void medicalConditionsAccordianStatus() {
		util.isDisplayed(medicalConditionsAccordian, "Medical Condition Accordian");
	}
	public void environmentalLifestyleFactorsAccordianStatus() {
		util.isDisplayed(environmentalLifestyleFactorsAccordian, "Environmental & Lifestyle Factors Accordian");
	}
	public void clickMedicalConditionAccordian() {
		util.clickJavaScript(medicalConditionsAccordian,"Medical Condition Accordian");
	}
	public void primaryMemberDementiaAlzheimerStatus() {
		util.isDisplayed(primaryMemberDementiaAlzheimer, "Primary member Dementia/Alzheimer’s text");
	}
	public void spouseDementiaAlzheimerStatus() {
		util.waitUntilPresentInUI(spouseDementiaAlzheimer, "spouse Dementia/Alzheimer’s text");
		util.isDisplayed(spouseDementiaAlzheimer, "spouse Dementia/Alzheimer’s text");
	}

	@FindBy(xpath="(//p[text()='Parkinson’s'])[1]")
	private WebElement primaryMemberParkinsonText;

	public void primaryMemberParkinsonTextStatus() {
		util.isDisplayed(primaryMemberParkinsonText, "primary Parkinsons,s text");
	}

	@FindBy(xpath="(//p[text()='Parkinson’s'])[2]")
	private WebElement spouseParkinsonText;

	public void spouseParkinsonTextStatus() {
		util.isDisplayed(spouseParkinsonText, "spouse Parkinsons,s text");
	}

	@FindBy(xpath="(//p[text()='Heart disease'])[1]")
	private WebElement primaryMemberHeartDiseaseText;

	public void primaryMemberHeartDiseaseText() {
		util.isDisplayed(primaryMemberHeartDiseaseText, "Heart Disease Text");
	}

	@FindBy(xpath="(//p[text()='Heart disease'])[2]")
	private WebElement spouseHeartDiseaseText;

	public void spouseHeartDiseaseText() {
		util.isDisplayed(spouseHeartDiseaseText, "Spouse Heart Disease Text");
	}

	@FindBy(xpath="(//p[text()='Stroke'])[2]")
	private WebElement spouseStrokeText;

	public void spouseStrokeText() {
		util.isDisplayed(spouseStrokeText, "Spouse Stroke Text");
	}

	@FindBy(xpath="(//p[text()='Stroke'])[1]")
	private WebElement primaryMemberStrokeText;

	public void primaryMemberStrokeText() {
		util.isDisplayed(primaryMemberStrokeText, "Primary Stroke Text");
	}

	@FindBy(xpath="(//p[text()='Diabetes'])[1]")
	private WebElement primaryDiabetesText;

	public void primaryMemberDiabetesText() {
		util.isDisplayed(primaryDiabetesText, "Primary Diabetes Text");
	}

	@FindBy(xpath="(//p[text()='Diabetes'])[2]")
	private WebElement spouseDiabetesText;

	public void spouseDiabetesText() {
		util.isDisplayed(spouseDiabetesText, "Spouse Diabetes Text");
	}

	@FindBy(xpath="(//p[text()='Blood pressure issues'])[1]")
	private WebElement primaryMemberBloodPressureText;

	public void primaryMemberBloodPressureTextStatus() {
		util.isDisplayed(primaryMemberBloodPressureText, "Primary member Blood Pressure Text");
	}

	@FindBy(xpath="(//p[text()='Blood pressure issues'])[2]")
	private WebElement spouseBloodPressureText;

	public void spouseBloodPressureTextStatus() {
		util.isDisplayed(spouseBloodPressureText, "Spouse  Blood Pressure issues Text");
	}

	@FindBy(xpath="(//p[text()='Elevated cholesterol'])[1]")
	private WebElement primaryMemberElevatedCholesterolText;

	public void primaryMemberElevatedCholesterolTextStatus() {
		util.isDisplayed(primaryMemberElevatedCholesterolText, "Primary member Elevated cholesterol Text");
	}

	@FindBy(xpath="(//p[text()='Elevated cholesterol'])[2]")
	private WebElement spouseElevatedCholesterolText;

	public void spouseElevatedCholesterolTextStatus() {
		util.isDisplayed(spouseElevatedCholesterolText, "Spouse Elevated cholesterol Text");
	}

	@FindBy(xpath="(//p[text()='Glaucoma'])[1]")
	private WebElement primaryMemberGlaucomaText;

	public void primaryMemberGlaucomaTextStatus() {
		util.isDisplayed(spouseElevatedCholesterolText, "Primary Member Glaucoma Text");
	}

	@FindBy(xpath="(//p[text()='Glaucoma'])[2]")
	private WebElement spouseGlaucomaText;

	public void spouseGlaucomaTextStatus() {
		util.isDisplayed(spouseGlaucomaText, "spouse Glaucoma Text");
	}

	@FindBy(xpath="//img[@class='allAccordionCloseButton']")
	private WebElement accordianParentButton;

	public void clickAccordianParentButton() {
		util.click(accordianParentButton, "Accordian Parent Button");
	}

	@FindBy(xpath="(//p[contains(text(),'Did you grow up in a smoking household or work in a smoking environment?')])[1]")
	private WebElement primaryMemberDidYouGrowUpSmokingText;

	public void primaryMemberDidYouGrowUpTextStatus() {
		util.isDisplayed(primaryMemberDidYouGrowUpSmokingText, "Primary Member Did you grow up in a smoking household or work in a smoking environment?");
	}

	@FindBy(xpath="(//p[contains(text(),'Did you grow up in a smoking household or work in a smoking environment?')])[2]")
	private WebElement spouseDidYouGrowUpSmokingText;

	public void spouseDidYouGrowUpTextStatus() {
		util.isDisplayed(spouseDidYouGrowUpSmokingText, "Spouse Did you grow up in a smoking household or work in a smoking environment?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have conditions that limit physical ability?')])[1]")
	private WebElement primaryMemberDoYouHaveConditionText;

	public void primaryMemberDoYouHaveConditionTextStatus() {
		util.isDisplayed(primaryMemberDoYouHaveConditionText,"Primary Member Do you have conditions that limit physical ability?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have conditions that limit physical ability?')])[2]")
	private WebElement spouseDoYouHaveConditionText;

	public void spouseDoYouHaveConditionTextStatus() {
		util.isDisplayed(spouseDoYouHaveConditionText,"Spouse Do you have conditions that limit physical ability?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have difficulty with gait, balance, or ambulation?')])[1]")
	private WebElement primaryMemberDoYouhaveDifficultyText;

	public void primaryMemberDoYouhaveDifficultyTextStatus() {
		util.isDisplayed(primaryMemberDoYouhaveDifficultyText, "Primary Member Do you have difficulty with gait, balance, or ambulation?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have difficulty with gait, balance, or ambulation?')])[2]")
	private WebElement spouseDoYouhaveDifficultyText;

	public void spouseDoYouHaveDifficultyTextStatus() {
		util.isDisplayed(spouseDoYouhaveDifficultyText, "Spouse Do you have difficulty with gait, balance, or ambulation?");
	}

	@FindBy(xpath="(//p[contains(text(),'Are you allergic to any medications?')])[1]")
	private WebElement primaryMemberAreYouAllergicText;

	public void primaryMemberAreYouAllergicTextStatus() {
		util.isDisplayed(primaryMemberAreYouAllergicText, "Primary Member Are you allergic to any medications?");
	}

	@FindBy(xpath="(//p[contains(text(),'Are you allergic to any medications?')])[2]")
	private WebElement spouseAreYouAllergicText;

	public void spouseAreYouAllergicTextStatus() {
		util.isDisplayed(spouseAreYouAllergicText, "Spouse Are you allergic to any medications?");
	}

	@FindBy(xpath="(//p[contains(text(),'Are you allergic to any medications?')]/following-sibling::div//p[text()='Yes'])[1]")
	private WebElement primaryMemberAreYouAllergicToAnyMedicationYesRadioButton;

	public void selectAreYouAllergicYesRadioButtonPrimaryMember() {
		util.selectRadioButton(primaryMemberAreYouAllergicToAnyMedicationYesRadioButton, "primary member Are you allergic to any medications? Yes Radio Button");
	}
	public void deSelectAreYouAllergicYesRadioButtonPrimaryMember() {
		util.deselectRadioButton(primaryMemberAreYouAllergicToAnyMedicationYesRadioButton, "primary member Are you allergic to any medications? Yes Radio Button");
	}

	@FindBy(xpath="(//p[contains(text(),'Are you allergic to any medications?')]/following-sibling::div//p[text()='Yes'])[2]")
	private WebElement spouseAreYouAllergicToAnyMedicationYesRadioButton;

	public void selectAreYouAllergicYesRadioButtonSpouse() {
		util.selectRadioButton(spouseAreYouAllergicToAnyMedicationYesRadioButton, "spouse Are you allergic to any medications? Yes Radio Button");
	}
	public void deSelectAreYouAllergicYesRadioButtonSpouse() {
		util.deselectRadioButton(spouseAreYouAllergicToAnyMedicationYesRadioButton, "Spouse Are you allergic to any medications? Yes Radio Button");
	}

	@FindBy(xpath="(//p[text()='Which medications ?'])[1]")
	private WebElement primaryMemberWhichMedicationText;

	public void primaryMemberWhichMedicationText() {
		util.isDisplayed(primaryMemberWhichMedicationText, "Which medications ? Text");
	}

	@FindBy(xpath="(//p[text()='Which medications ?'])[1]")
	private WebElement spouseWhichMedicationText;

	public void spouseWhichMedicationText() {
		util.isDisplayed(spouseWhichMedicationText, "Spouse Which medications ? Text");
	}

	public void clickEnvironmentalLifestayleAccordian() {
		util.click(environmentalLifestyleFactorsAccordian, "Environmental & Lifestyle Factors");
	}

	@FindBy(xpath="(//div[@class='dropdown-icon '])[1]")
	private WebElement primaryMemberBloodTypeIcon;

	public void clickPrimaryMeberBloodTypeDropDownIcon() {
		util.click(primaryMemberBloodTypeIcon, "Primary member Blood Type Icon");
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='AB+']")
	private WebElement abPlusDropDownOptions;

	public void clickABPlusDropDownOption(){
		util.click(abPlusDropDownOptions, "AB+ Blood Type Option");
	}

	@FindBy(xpath="(//div[@class='dropdown-icon '])[2]")
	private WebElement spouseBloodTypeIcon;

	public void clickSpouseBloodTypeDropDownIcon() {
		util.click(spouseBloodTypeIcon, "Spouse Blood Type Icon");
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='None']")
	private WebElement NoneDropDownOptions;

	public void clickNoneDropDownOption(){
		util.click(NoneDropDownOptions, "None Blood Type Option");
	}

	@FindBy(xpath="(//div[@class=' dropdown-selected'])[1]")
	private WebElement primaryMemberDropDownSelectedOptions;

	public String getPrimaryMemberDropDownSelectedOptions() {
		String primaryMemberBloodTypeSelectedOptions=	util.getInnerText(primaryMemberDropDownSelectedOptions);
		return primaryMemberBloodTypeSelectedOptions;
	}

	@FindBy(xpath="(//div[@class=' dropdown-selected'])[2]")
	private WebElement spouseDropDownSelectedOptions;

	public String getSpouseDropDownSelectedOptions(String text) {
		String spouseBloodTypeSelectedOptions;
		util.waitUntilTextPresentInUI(spouseDropDownSelectedOptions,text);
		spouseBloodTypeSelectedOptions=	util.getInnerText(spouseDropDownSelectedOptions);
		return spouseBloodTypeSelectedOptions;
	}

	@FindBy(xpath="//button[text()='Save & Proceed to LifeStyle']")
	private WebElement saveProceedToLifeStyleButton;

	public void clickSaveProceedToLifeStyleButton(){
		util.clickButtonAfterCheckingEnable(saveProceedToLifeStyleButton);
	}

	@FindBy(xpath="//div[@id='CustomSubSideBarLinks-sidebar']//span[text()='Personal Medical History']")
	private WebElement personalMedicalHistorySideBarLink;

	public void clickpersonalMedicalHistorySideBarLink() {
		util.waitUntilPresentInUI(personalMedicalHistorySideBarLink, "Personal Medical History Side Bar Link");
		util.waitUntilElementToBeClickable(personalMedicalHistorySideBarLink);
		util.clickActions(personalMedicalHistorySideBarLink,"Personal Medical History");
	}

	public void openMedicalConditionAccordian() {
		util.click(medicalConditionsAccordian, "Medical Condition Accordian");
	}

	@FindBy(xpath="(//input[@name='Dementia/Alzheimer’s'])[1]")
	private WebElement primaryMemberDementiaCheckbox;

	public void checkPrimaryMemberDementiaCheckbox() {
		util.checkCheckBox(primaryMemberDementiaCheckbox, "Primary Member Dementia/Alzheimer’s ");
	}

	@FindBy(xpath="(//input[@name='Dementia/Alzheimer’s'])[2]")
	private WebElement spouseDementiaCheckbox;

	public void checkSpouseDementiaCheckbox() {
		util.checkCheckBox(spouseDementiaCheckbox, "Spouse Dementia/Alzheimer’s ");
	}

	@FindBy(xpath="(//input[@name='Parkinson’s'])[1]")
	private WebElement primaryMemberParkinsonCheckBox;

	public void checkPrimaryMemberParkinsonCheckBox() {
		util.checkCheckBox(primaryMemberParkinsonCheckBox, "Spouse Dementia/Alzheimer’s ");
	}

	@FindBy(xpath="(//input[@name='Parkinson’s'])[2]")
	private WebElement spouseParkinsonCheckBox;

	public void checkSpouseParkinsonCheckBox() {
		util.checkCheckBox(spouseParkinsonCheckBox, "Spouse Parkinson’s");
	}

	@FindBy(xpath="(//input[@name='Heart disease'])[1]")
	private WebElement primaryMemberHeartDiseaseCheckBox;

	public void CheckprimaryMemberHeartDiseaseCheckBox() {
		util.checkCheckBox(primaryMemberHeartDiseaseCheckBox, "Primary Member Heart Disease");
	}

	@FindBy(xpath="(//input[@name='Heart disease'])[2]")
	private WebElement spouseHeartDiseaseCheckBox;

	public void CheckSpouseHeartDiseaseCheckBox() {
		util.checkCheckBox(spouseHeartDiseaseCheckBox, "Spouse Heart Disease");
	}

	@FindBy(xpath="(//input[@name='Stroke'])[1]")
	private WebElement primaryMemberStrokeCheckBox;

	public void checkPrimaryMemberStrokeCheckBox() {
		util.checkCheckBox(primaryMemberStrokeCheckBox, "Primary Member Heart Disease");
	}

	@FindBy(xpath="(//input[@name='Stroke'])[2]")
	private WebElement spouseStrokeCheckBox;

	public void checkSpouseStrokeCheckBox() {
		util.checkCheckBox(spouseStrokeCheckBox, "Spouse Heart Disease");
	}

	@FindBy(xpath="(//input[@name='Diabetes'])[1]")
	private WebElement primaryMemberDiabeterCheckBox;

	public void checkPrimaryMemberDiabetesCheckBox() {
		util.checkCheckBox(primaryMemberDiabeterCheckBox, "Primary Member Diabetes");
	}

	@FindBy(xpath="(//input[@name='Diabetes'])[2]")
	private WebElement spouseDiabeterCheckBox;

	public void checkSpouseDiabetesCheckBox() {
		util.checkCheckBox(spouseDiabeterCheckBox, "Spouse Diabetes");
	}

	@FindBy(xpath="(//input[@name='Blood pressure issues'])[1]")
	private WebElement primaryMemberBloodTypePressureIssueChckbox;

	public void checkPrimaryMemberBloodPressureIssueCheckbox() {
		util.checkCheckBox(primaryMemberBloodTypePressureIssueChckbox, "Primary Member Diabetes");
	}

	@FindBy(xpath="(//input[@name='Blood pressure issues'])[2]")
	private WebElement spouseBloodTypePressureIssueCheckbox;

	public void checkSpouseBloodPressureIssueCheckbox() {
		util.checkCheckBox(spouseBloodTypePressureIssueCheckbox, "Spouse Diabetes");
	}

	@FindBy(xpath="(//input[@name='Elevated cholesterol'])[1]")
	private WebElement PrimaryMemberElevatedCholesterolCheckbox;

	public void checkPrimaryMemberElevatedCholesterolCheckbox() {
		util.checkCheckBox(PrimaryMemberElevatedCholesterolCheckbox, "Primary Member Elevated cholesterol");
	}

	@FindBy(xpath="(//input[@name='Elevated cholesterol'])[2]")
	private WebElement spouseElevatedCholesterolCheckbox;

	public void checkSpouseElevatedCholesterolCheckbox() {
		util.checkCheckBox(spouseElevatedCholesterolCheckbox, "Spouse Elevated cholesterol");
	}

	@FindBy(xpath="(//input[@name='Glaucoma'])[1]")
	private WebElement primaryMemberGlaucomaCheckbox;

	public void checkPrimaryMemberGlaucomaCheckbox() {
		util.checkCheckBox(primaryMemberGlaucomaCheckbox, "Primary Member Glaucoma");
	}

	@FindBy(xpath="(//input[@name='Glaucoma'])[2]")
	private WebElement spouseGlaucomaCheckbox;

	public void checkSpouseGlaucomaCheckbox() {
		util.checkCheckBox(spouseGlaucomaCheckbox, "Spouse Glaucoma");
	}

	@FindBys(@FindBy(xpath = "//div[@id='custom-input-field']//input"))
	private List<WebElement> medicalConditionsTextBoxList;

	public List<WebElement> medicalConditionsTextBoxList() {
		List<WebElement> medicalList=	util.getWebElements(medicalConditionsTextBoxList);
		return medicalList;
	}

	@FindBy(xpath="(//p[contains(text(),'Did you grow up in a smoking household or work in a smoking environment?')]/parent::div//p[text()='Yes'])[1]")
	private WebElement primaryMemberDidYouGrowUpYesRadioBT;

	public void clickYesprimaryMemberDidYouGrowUpRadioBT() {
		util.click(primaryMemberDidYouGrowUpYesRadioBT, "Primary Member Did you grow up Yes Radio Button");
	}

	@FindBy(xpath="(//p[contains(text(),'Did you grow up in a smoking household or work in a smoking environment?')]/parent::div//p[text()='Yes'])[2]")
	private WebElement spouseDidYouGrowUpYesRadioBT;

	public void clickYesspouseDidYouGrowUpRadioBT() {
		util.click(spouseDidYouGrowUpYesRadioBT, "Spouse Did you grow up Yes Radio Button");
	}



	//	@FindBy(xpath="(//div[@id='custom-textarea-field']/textarea[@class='textareaStyling'])[1]")
	//	private WebElement didYouGrowUpCommentTB;
	//
	//	public void sendDidYouGrowUpComment(String didYouGrowUpText) {
	//		util.sendValue(didYouGrowUpCommentTB, didYouGrowUpText, "Did you grow up in a smoking household or work in a smoking environment?");
	//	}

	@FindBy(xpath="(//p[contains(text(),'Did you grow up in a smoking household or work in a smoking environment?')]/parent::div/following-sibling::div//textarea)[1]")
	private WebElement primaryMemberDidYouGrowUpCommentTB;

	public void sendPrimaryMemberDidYouGrowUpCommentText(String primaryMemberdidYouGrowUp) {
		util.sendValue(primaryMemberDidYouGrowUpCommentTB,primaryMemberdidYouGrowUp , "Primary Member Did you grow up comment");
	}

	@FindBy(xpath="(//p[contains(text(),'Did you grow up in a smoking household or work in a smoking environment?')]/parent::div/following-sibling::div//textarea)[2]")
	private WebElement spouseDidYouGrowUpCommentTB;

	public void sendSpouseDidYouGrowUpCommentText(String spousedidYouGrowUp) {
		util.sendValue(spouseDidYouGrowUpCommentTB,spousedidYouGrowUp , "Spouse Did you grow up comment");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have conditions that limit physical ability?')]/parent::div//p[text()='Yes'])[1]")
	private WebElement primaryMemberDoYouHaveConditionYesRadioButton;

	public void clickPrimaryMemberDoYouHaveConditionYesRadioButton() {
		util.click(primaryMemberDoYouHaveConditionYesRadioButton, "Primary Member Do you have conditions that limit physical ability?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have conditions that limit physical ability?')]/parent::div//p[text()='Yes'])[2]")
	private WebElement spouseDoYouHaveConditionYesRadioButton;

	public void clickspouseDoYouHaveConditionYesRadioButton() {
		util.click(spouseDoYouHaveConditionYesRadioButton, "Spouse Do you have conditions that limit physical ability?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have conditions that limit physical ability?')]/parent::div/following-sibling::div//textarea)[1]")
	private WebElement primaryMemberDoYouHaveConditionCommentTB;

	public void sendPrimaryMemberDoYouHaveConditionCommentTextBox(String primaryMemberDoYouHaveCondition) {
		util.sendValue(primaryMemberDoYouHaveConditionCommentTB,primaryMemberDoYouHaveCondition , "primary Member Do you have conditions that limit physical ability?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have conditions that limit physical ability?')]/parent::div/following-sibling::div//textarea)[2]")
	private WebElement spouseDoYouHaveConditionCommentTB;

	public void sendSpouseDoYouHaveConditionCommentTextBox(String primaryMemberDoYouHaveCondition) {
		util.sendValue(spouseDoYouHaveConditionCommentTB,primaryMemberDoYouHaveCondition , "Spouse Do you have conditions that limit physical ability?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have difficulty with gait, balance, or ambulation?')]/parent::div//p[text()='Yes'])[1]")
	private WebElement primaryMemberDoYouDifficultyYesRadioBT;

	public void clickPrimaryMemberYesRadioButtonDoYouDiffcultyWithGait() {
		util.click(primaryMemberDoYouDifficultyYesRadioBT,"Primary Member Do you Have Difficulty with gait Radio Button");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have difficulty with gait, balance, or ambulation?')]/parent::div//p[text()='Yes'])[2]")
	private WebElement spouseDoYouDifficultyYesRadioBT;

	public void clickSpouseYesRadioButtonDoYouDiffcultyWithGait() {
		util.click(spouseDoYouDifficultyYesRadioBT, "Spouse Do you have difficulty with gait, balance, or ambulation?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have difficulty with gait, balance, or ambulation?')]/parent::div/following-sibling::div//textarea)[1]")
	private WebElement primaryMemberDoYouHaveDifficultyGaitCommentTB;

	public void sendPrimaryMemberDoYouHaveDifficultyGaitCommentText(String comment) {
		util.sendValue(primaryMemberDoYouHaveDifficultyGaitCommentTB, comment, "Primary Member Do you have difficulty with gait, balance, or ambulation?");
	}

	@FindBy(xpath="(//p[contains(text(),'Do you have difficulty with gait, balance, or ambulation?')]/parent::div/following-sibling::div//textarea)[2]")
	private WebElement spouseDoYouHaveDifficultyGaitCommentTB;

	public void sendSpouseDoYouHaveDifficultyGaitCommentText(String comment) {
		util.sendValue(spouseDoYouHaveDifficultyGaitCommentTB, comment, "Primary Member Do you have difficulty with gait, balance, or ambulation?");
	}




}
