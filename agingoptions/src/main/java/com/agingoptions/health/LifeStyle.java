package com.agingoptions.health;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class LifeStyle {

	private WebUtil util;

	public LifeStyle(WebUtil ut) {
		PageFactory.initElements(ut.getDriver(), this);
		this.util = ut;
	}

	@FindBy(xpath = "(//p[contains(text(),'Do you consider yourself to be at a healthy weight?')]/following-sibling::div/label/p[text()='Yes'])[1]")
	private WebElement primaryMemberDoYouConsiderYesRadioBT;

	@FindBy(xpath = "(//p[contains(text(),'Do you consider yourself to be at a healthy weight?')]/following-sibling::div/label/p[text()='Yes'])[2]")
	private WebElement spouseDoYouConsiderYesRadioBT;

	public void clickPrimaryMemberYesRadioButtonDoYouConsiderHealthWeight() {
		util.click(primaryMemberDoYouConsiderYesRadioBT,"Primary Member Do you consider yourself to be at a healthy weight?");
	}

	public void clickSpouseYesRadioButtonDoYouConsiderHealthWeight() {
		util.click(spouseDoYouConsiderYesRadioBT, "Spouse Do you consider yourself to be at a healthy weight?");
	}

	@FindBy(xpath = "(//p[text()='Sedentary'])[1]")
	private WebElement primaryMemberSedentaryRadioBT;

	@FindBy(xpath = "(//p[text()='Sedentary'])[2]")
	private WebElement SpouseSedentaryRadioBT;

	public void clickPrimaryMemberSedentaryRadioButton() {
		util.click(primaryMemberSedentaryRadioBT, "Primary Member Sedentery Radio Button");
	}

	public void clickSpouseSedentaryRadioButton() {
		util.click(SpouseSedentaryRadioBT, "Spouse Sedentery Radio Button");
	}

	@FindBy(xpath = "(//p[text()='Regularly exercise'])[2]")
	private WebElement spouseRegularlyExerciseRadioBT;

	public void clickSpouseRegularlyExerciseRadioBT() {
		util.click(spouseRegularlyExerciseRadioBT, "Spouse Regurlarly Exercise Radio Button");
	}

	@FindBy(xpath = "//div[@id='label104']/preceding-sibling::div/span")
	private WebElement spouseHowOftenDoYouExerciseRadioButtonIcon;

	@FindBy(xpath = "//ul[@id='dropDownDivId']//li[text()='7']")
	private WebElement dropDown7Options;

	public void selectSpouseHowOftenDoYouExerciseDropDown7Options(String howOftenExpectedValue) {
		util.click(spouseHowOftenDoYouExerciseRadioButtonIcon, "Spouse How often do you exercise each week?");
		util.click(dropDown7Options, howOftenExpectedValue);
	}

	@FindBy(xpath = "(//textarea[@id='292'])[1]")
	private WebElement primaryMemberDescribeTextBox;

	public void inputPrimaryMemberDescribeValue(String value) {
		util.sendValue(primaryMemberDescribeTextBox, value,"Primary Member How would you describe your exercise habits? Description ");
	}

	@FindBy(xpath = "(//textarea[@id='292'])[2]")
	private WebElement spouseDescribeTextBox;

	public void inputSpouseDescribeValue(String value) {
		util.sendValue(spouseDescribeTextBox, value,
				"Spouse How would you describe your exercise habits? Description ");
	}

	@FindBy(xpath = "(//p[text()='Do you worry about your health?']/parent::div/div//p[text()='Yes'])[1]")
	private WebElement primaryMemberYesRadioButtonDoYouWorryAboutHealth;

	public void clickPrimaryMemberYesRadioButtonDoYouWorryAboutHealth() {
		util.click(primaryMemberYesRadioButtonDoYouWorryAboutHealth, "Primary Member Do you worry about health? ");
	}

	@FindBy(xpath = "(//p[text()='Do you worry about your health?']/parent::div/div//p[text()='Yes'])[2]")
	private WebElement spouseYesRadioButtonDoYouWorryAboutHealth;

	public void clickSpouseYesRadioButtonDoYouWorryAboutHealth() {
		util.click(spouseYesRadioButtonDoYouWorryAboutHealth, "Spouse Do you worry about health? ");
	}

	@FindBy(xpath = "//p[contains(text(),'When you exercise, how long do you exercise?')]/parent::div//textarea[@id=14]")
	private WebElement spouseWhenYouExerciseDescribeTB;

	public void inputSpouseWhenYouExerciseDescriptionTextBox(String value) {
		util.sendValue(spouseWhenYouExerciseDescribeTB, value, "Spouse When you exercise, how long do you exercise?");
	}

	@FindBy(xpath = "(//p[text()='Are you good about getting regular checkups?']/parent::div/div//p[text()='Yes'])[1]")
	private WebElement primaryMemberAreYouGoodRegularCheckupYesRadioBT;

	public void clickprimaryMemberAreYouGoodRegularCheckupYesRadioBT() {
		util.click(primaryMemberAreYouGoodRegularCheckupYesRadioBT, "Are you good about getting regular checkups?");
	}

	@FindBy(xpath = "(//p[text()='Are you good about getting regular checkups?']/parent::div/div//p[text()='Yes'])[2]")
	private WebElement spouseAreYouGoodRegularCheckupYesRadioBT;

	public void clickSpouseAreYouGoodRegularCheckupYesRadioBT() {
		util.click(spouseAreYouGoodRegularCheckupYesRadioBT, "Spouse Are you good about getting regular checkups?");
	}

	@FindBy(xpath = "(//label[contains(text(),'On a scale of 1 to 10 (1 = poor; 10 = great), how would')]/parent::div/following-sibling::div)[1]")
	private WebElement PrimaryMemberOnAScaleDropDown;

	public void clickPrimaryMemberOnAScaleDropDown() {
		util.click(PrimaryMemberOnAScaleDropDown,
				"Primary Member On a scale of 1 to 10 (1 = poor; 10 = great), how would you rate your eating habits?");
	}

	@FindBy(xpath = "(//label[contains(text(),'On a scale of 1 to 10 (1 = poor; 10 = great), how would')]/parent::div/following-sibling::div)[2]")
	private WebElement spouseOnAScaleDropDown;

	public void clickSpouseOnAScaleDropDown() {
		util.click(spouseOnAScaleDropDown,
				"Spouse On a scale of 1 to 10 (1 = poor; 10 = great), how would you rate your eating habits?");
	}

	@FindBy(xpath = "(//div[@id='label106'])[1]")
	private WebElement primaryMemberOnAScaleDDIcon;

	@FindBy(xpath = "(//div[@id='label106'])[2]")
	private WebElement spouseOnAScaleDDIcon;

	@FindBy(xpath = "//ul[@id='dropDownDivId']/li[text()='8']")
	private WebElement onAScaleDropDown8Options;

	public void clickPrimaryMemberOnAScale8Options() {
		util.click(primaryMemberOnAScaleDDIcon, "Primary Member On a scale drop down Icone 8");
		util.click(onAScaleDropDown8Options,"On a scale of 1 to 10 (1 = poor; 10 = great), how would you rate your eating habits?");
	}

	public void clickSpouseOnAScale8Options() {
		util.click(spouseOnAScaleDDIcon, "Spouse On a scale drop down Icone 8");
		util.click(onAScaleDropDown8Options,
				"On a scale of 1 to 10 (1 = poor; 10 = great), how would you rate your eating habits?");
	}

	@FindBy(xpath = "//span[text()='Lifestyle']")
	private WebElement lifeStyleSideBarLink;

	public void clickLifeStyleSideBarLink() {
		util.waitUntilPresentInUI(lifeStyleSideBarLink, "Life Style Module");
		util.waitUntilElementToBeClickable(lifeStyleSideBarLink);
		util.click(lifeStyleSideBarLink, "Life Style Module");
	}

	@FindBy(xpath = "(//textarea[@id='284'])[1]")
	private WebElement primaryMemberWhatIsYourWorryTextBox;

	public void inputPrimaryMemberWhatIsYourWorriedTB(String value) {
		util.sendValue(primaryMemberWhatIsYourWorryTextBox, value, "Primary Member What is your worry?");
	}

	@FindBy(xpath = "(//textarea[@id='284'])[2]")
	private WebElement spouseWhatIsYourWorryTextBox;

	public void inputSpouseWhatIsYourWorriedTB(String value) {
		util.sendValue(spouseWhatIsYourWorryTextBox, value, "Primary Member What is your worry?");
	}

	@FindBy(xpath = "(//p[text()='Describe your nutrition details']/parent::div//div[@id='custom-textarea-field']/textarea)[1]")
	private WebElement primaryMemberNutritionDetailsTB;

	public void inputPrimaryMemberNutritionDetails(String value) {
		util.sendValue(primaryMemberNutritionDetailsTB, value, "Primary Member Nutrition Details");
	}

	@FindBy(xpath = "(//p[text()='Describe your nutrition details']/parent::div//div[@id='custom-textarea-field']/textarea)[2]")
	private WebElement spouseNutritionDetailsTB;

	public void inputSpouseNutritionDetails(String value) {
		util.sendValue(spouseNutritionDetailsTB, value, "Spouse Nutrition Details");
	}

	@FindBy(xpath = "//button[text()='Save & Proceed to Family Medical History']")
	private WebElement saveProceedToFamilyMedicalHistoryButton;

	public void clickSaveProceedToFamilyMedicalHistoryButton() {
		util.waitUntilElementToBeClickable(saveProceedToFamilyMedicalHistoryButton);
		util.click(saveProceedToFamilyMedicalHistoryButton, "Save & Proceed To Family Medical History Button");
	}

	public void checkPrimaryMemberDoYouConsiderRadioButtonYesIsSelected() {
		util.isSelected(primaryMemberDoYouConsiderYesRadioBT, "Do you consider yourself to be at a healthy weight?");
	}

	public void checkSpouseDoYouConsiderRadioButtonYesIsSelected() {
		util.isSelected(spouseDoYouConsiderYesRadioBT, "Spouse Do you consider yourself to be at a healthy weight?");
	}

	public void isPrimaryMemberSedentaryRadioButtonIsSelected() {
		util.isSelected(primaryMemberSedentaryRadioBT, "Primary Member Sedentary Radio Button");
	}

	public void isSpouseRegularExerciseRadioButtonIsSelected() {
		util.isSelected(spouseRegularlyExerciseRadioBT, "Primary Member Sedentary Radio Button");
	}

	public String getHowOftenDoYouExerciseDropDownSelectedText() {
		String text=  util.getInnerText(spouseHowOftenDoYouExerciseRadioButtonIcon); 
		return text;
	}

	public String getPrimaryMemberDescribeText() {
		String actulaText=	util.getInnerText(primaryMemberDescribeTextBox);
		return actulaText;
	}

	public String getSpouseDescribeText() {
		String actulaText=	util.getInnerText(spouseDescribeTextBox);
		return actulaText;
	}

	public String getPrimaryMemberWhatIsYourWorryText() {
		String actualText=	util.getInnerText(primaryMemberWhatIsYourWorryTextBox);
		return actualText;
	}

	public String getSpouseWhatIsYourWorryText() {
		String actualText=	util.getInnerText(spouseWhatIsYourWorryTextBox);
		return actualText;
	}

	public String getSpouseWhenYouExerciseText() {
		String whenYouExerciseTB=		util.getInnerText(spouseWhenYouExerciseDescribeTB);
		return whenYouExerciseTB;
	}

	@FindBy(xpath="(//div[@id='label106']/preceding-sibling::div/span)[1]")
	private WebElement primaryMemberOnAScaleText;

	public String getPrimaryMemberOnAScaleSelectedText() {
		String actualOnAScaleText=	util.getInnerText(primaryMemberOnAScaleText);
		return actualOnAScaleText;
	}

	@FindBy(xpath="(//div[@id='label106']/preceding-sibling::div/span)[2]")
	private WebElement spouseOnAScaleText;

	public String getSpouseOnAScaleSelectedText() {
		String actualOnAScaleText=	util.getInnerText(spouseOnAScaleText);
		return actualOnAScaleText;
	}

	public String getPrimaryMemberNutritionDetailsText() {
		String nutritionDetails=	util.getInnerText(primaryMemberNutritionDetailsTB);
		return nutritionDetails;
	}

	public String getSpouseNutritionDetailsText() {
		String nutritionDetails=	util.getInnerText(spouseNutritionDetailsTB);
		return nutritionDetails;
	}

	@FindBy(xpath="//button[text()='Substance Use']")
	private WebElement substanceUseAccordian;

	public void openSubStanceUseAccordian() {
		util.scrollIntoElement(substanceUseAccordian, "SubStance Accordian");
		util.openAccordion(substanceUseAccordian,"Substance Use Accordian" );
	}

	@FindBy(xpath="(//p[text()='Do you use drugs recreationally?']/parent::div/div//p[text()='Yes'])[1]")
	private WebElement primaryMemberDoYouUseDrugsYesRadioButton;

	public void clickPrimaryMemberDoYouUseDrugsYesRadioButton() {
		util.click(primaryMemberDoYouUseDrugsYesRadioButton, "Primary Member Do you use drugs recreationally?");
	}

	@FindBy(xpath="(//p[text()='Do you use drugs recreationally?']/parent::div/div//p[text()='Yes'])[2]")
	private WebElement spouseDoYouUseDrugsYesRadioButton;

	public void clickSpouseDoYouUseDrugsYesRadioButton() {
		util.click(spouseDoYouUseDrugsYesRadioButton, "Spouse Do you use drugs recreationally?");
	}

	@FindBy(xpath="(//textarea[contains(@placeholder, 'Enter drugs')])[1]")
	private WebElement primaryMemberWhichOneTextBox;

	public void inputPrimaryMemberWhichOneTextBox(String value) {
		util.sendValue(primaryMemberWhichOneTextBox,value ,"Primary Member Which ones?" );
	}

	@FindBy(xpath="(//textarea[contains(@placeholder, 'Enter drugs')])[2]")
	private WebElement spouseWhichOneTextBox;

	public void inputSpouseWhichOneTextBox(String value) {
		util.sendValue(spouseWhichOneTextBox,value ,"Spouse Member Which ones?" );
	}

	@FindBy(xpath="(//p[text()='Do you currently smoke?']/parent::div/div//p[text()='No'])[1]")
	private WebElement primaryMemberDoYouCurrentlySmokeNoRadioBT;

	public void clickPrimaryMemberDoYouCurrentlySmokeNoRadioBT() {
		util.click(primaryMemberDoYouCurrentlySmokeNoRadioBT, "Primary Member Do You Currently Smoke No Radio Button");
	}

	@FindBy(xpath="(//p[text()='Do you currently smoke?']/parent::div/div//p[text()='Yes'])[2]")
	private WebElement spouseDoYouCurrentlySmokeYesRadioBT;

	public void clickSpouseDoYouCurrentlySmokeYesRadioBT() {
		util.click(spouseDoYouCurrentlySmokeYesRadioBT, "Spouse Do you currently smoke?");
	}

	@FindBy(xpath="//p[contains(text(),'Have you ever smoked?')]/parent::div//label/p[text()='Yes']")
	private WebElement primaryMemberHaveYouEverSmokedYesRadioBT;

	public void clickprimaryMemberHaveYouEverSmokedYesRadioBT() {
		util.click(primaryMemberHaveYouEverSmokedYesRadioBT, "Primary Member Have you ever smoked?");
	}

	@FindBy(xpath="(//p[contains(text(),'When did you quit smoking?')]/parent::div//textarea)[1]")
	private WebElement primaryMemberWhenDidYouQuitSmokingTB;

	public void inputPrimaryMemberWhenDidYouQuitSmokingTB(String value) {
		util.sendValue(primaryMemberWhenDidYouQuitSmokingTB, value, "Primary Member When Did You quit smoking");
	}

	@FindBy(xpath="(//p[text()='Do you consume alcohol?']/parent::div/div//p[text()='Yes'])[2]")
	private WebElement spouseDoYouConsumeAlcoholYesRadioBT;

	public void clickSpouseDoYouConsumeAlcoholYesRadioBT() {
		util.click(spouseDoYouConsumeAlcoholYesRadioBT, "Spouse Do you consume alcohol?");
	}

	@FindBy(xpath="(//p[text()='Do you consume alcohol?']/parent::div/div//p[text()='Yes'])[1]")
	private WebElement primaryDoYouConsumeAlcoholYesRadioBT;

	public void clickPrimaryMemberDoYouConsumeAlcoholYesRadioBT() {
		util.click(primaryDoYouConsumeAlcoholYesRadioBT, "Primary Member Do you consume alcohol?");
	}

	@FindBy(xpath="(//input[@id='drinks'])[1]")
	private WebElement primaryMemberHowManyAlcoholicDrinksDoYouConsumeTB;

	public void inputPrimaryMemberHowManyAlcoholicDrinksDoYouConsumeTB(String value) {
		util.sendValue(primaryMemberHowManyAlcoholicDrinksDoYouConsumeTB, value, "Primary Member How Many Alcoholic Drinks Do You Consume ");
	}

	@FindBy(xpath="(//input[@id='drinks'])[2]")
	private WebElement spouseHowManyAlcoholicDrinksDoYouConsumeTB;

	public void inputSpouseHowManyAlcoholicDrinksDoYouConsumeTB(String value) {
		util.sendValue(spouseHowManyAlcoholicDrinksDoYouConsumeTB, value, "Spouse How Many Alcoholic Drinks Do You Consume ");
	}

	@FindBys(@FindBy(xpath="(//p[text()='Which of these do you drink?']/parent::div)[1]//div/label/input"))
	private List<WebElement> primaryMemberWhichOfTheseDrinkCheckBoxes;

	public void checkPrimaryMemberWhichOfTheseDoYouDrinkCheckBoxes() {
		for(int i=0; i<=primaryMemberWhichOfTheseDrinkCheckBoxes.size()-1; i++) {
			primaryMemberWhichOfTheseDrinkCheckBoxes.get(i).click();
		}
	}

	@FindBys(@FindBy(xpath="(//p[text()='Which of these do you drink?']/parent::div)[2]//div/label/input"))
	private List<WebElement> spouseWhichOfTheseDrinkCheckBoxes;

	public void checkSpouseWhichOfTheseDoYouDrinkCheckBoxes() {
		for(int i=0; i<=spouseWhichOfTheseDrinkCheckBoxes.size()-1; i++) {
			spouseWhichOfTheseDrinkCheckBoxes.get(i).click();
		}
	}

	public String getPrimaryMemberWhichOneInputText() {
		String actualText=	util.getInnerText(primaryMemberWhichOneTextBox);
		return actualText;
	}

	public String getSpouseWhichOneInputText() {
		String actualText=	util.getInnerText(spouseWhichOneTextBox);
		return actualText;
	}

	public String getPrimaryMemberWhenDidYouQuitSmokingActualText() {
		String actualText=	util.getInnerText(primaryMemberWhenDidYouQuitSmokingTB);
		return actualText;
	}

	public String getPrimaryMemberHowManyAlcoholicdrinksText() {
		String actualText=	util.GetAttributevalue(primaryMemberHowManyAlcoholicDrinksDoYouConsumeTB,"value");
		return actualText;
	}

	public String getSpouseHowManyAlcoholicdrinksText() {
		String actualText=	util.GetAttributevalue(spouseHowManyAlcoholicDrinksDoYouConsumeTB,"value");
		return actualText;
	}

	public void checkStatusPrimaryMemberWhichOfTheseDoYouDrinkCheckBoxes() {
		for(int i=0; i<=primaryMemberWhichOfTheseDrinkCheckBoxes.size()-1; i++) {
			WebElement we=	primaryMemberWhichOfTheseDrinkCheckBoxes.get(i);
			util.isSelected(we, "Which Of These Drink CheckBoxes");
		}
	}

	public void checkSpouseStatusWhichOfTheseDoYouDrinkCheckBoxes() {
		for(int i=0; i<=spouseWhichOfTheseDrinkCheckBoxes.size()-1; i++) {
			WebElement we=	spouseWhichOfTheseDrinkCheckBoxes.get(i);
			util.isSelected(we, "Spouse Which Of These Drink CheckBoxes");
		}
	}

	@FindBy(xpath="//button[contains(text(),'Social Habits')]")
	private WebElement socialHabitsAccordian;

	public void OpenSocialHabitsAccordian() {
		util.scrollIntoElement(socialHabitsAccordian, "Social Habits Accordian");
		util.openAccordion(socialHabitsAccordian, "Socal Habits Accordian");
	}

	@FindBy(xpath="(//p[contains(text(),'Outside of work, how do you and your spouse (if married) keep socially engaged?')]/parent::div//textarea)[1]")
	private WebElement primaryMemberOutSideOfWorkHowDoYouSociallyEngaged;

	public void inputprimaryMemberOutSideOfWorkHowDoYouSociallyEngaged(String value) {
		util.sendValue(primaryMemberOutSideOfWorkHowDoYouSociallyEngaged, value,"Primary Member Outside of work, how do you and your spouse (if married) keep socially engaged?" );
	}

	@FindBy(xpath="(//p[contains(text(),'Outside of work, how do you and your spouse (if married) keep socially engaged?')]/parent::div//textarea)[2]")
	private WebElement spouseOutSideOfWorkHowDoYouSociallyEngaged;

	public void inputSpouseOutSideOfWorkHowDoYouSociallyEngaged(String value) {
		util.sendValue(spouseOutSideOfWorkHowDoYouSociallyEngaged, value,"Spouse Outside of work, how do you and your spouse (if married) keep socially engaged?" );
	}

	public String getPrimaryMemberOutSideOfWorkHowDoYouActualText() {
		String actualText=  util.getInnerText(primaryMemberOutSideOfWorkHowDoYouSociallyEngaged);
		return actualText;
	}

	public String getSpouseOutSideOfWorkHowDoYouActualText() {
		String actualText=  util.getInnerText(spouseOutSideOfWorkHowDoYouSociallyEngaged);
		return actualText;
	}

	@FindBy(xpath="//button[contains(text(),'General Health & Nutrition')]")
	private WebElement generalNutritionDetailsAccordian;

	public void openGeneralNutritionAccordian() {
		util.openAccordion(generalNutritionDetailsAccordian,"General & Nutrition Details");
	}



}
