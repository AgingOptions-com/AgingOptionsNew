package com.agingoptions.health;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class MedicationSupplementsPage {

	private WebUtil util;

	public MedicationSupplementsPage(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="(//span[contains(text(),'Medication & Supplements')])[1]")
	private WebElement medicationSupplmentsSideBarLink;

	public void clickMedicationSupplmentsSideBarLink() {
		util.click(medicationSupplmentsSideBarLink, "Medication & Supplments");
	}

	@FindBy(xpath="//button[contains(text(),'Add Medication')]")
	private WebElement addMedicationBT;

	public void clickAddMedictionButton() {
		util.click(addMedicationBT, "Add medication");
	}

	@FindBy(xpath="//p[contains(text(),'Medication type')]/parent::div/div")
	private WebElement medicationTypeDropDown;

	private void clickMedictaionTypeDropDown() {
		util.click(medicationTypeDropDown, "Medication Type Drop Down");
	}

	@FindBy(xpath="//div[@id='dropDownDivId']/li[text()='Abacavir Sulfate']")
	private WebElement abcavirSulfateText;

	public void selectAbcavirSulfateMedicationType() {
		util.holdOn(Duration.ofSeconds(1));
		clickMedictaionTypeDropDown();
		util.click(abcavirSulfateText, "Abacavir Sulfate");
	}

	@FindBy(xpath="//p[text()='Dosage']/following-sibling::input")
	private WebElement 	dosageTB;

	public void inputDosage(String value) {
		util.sendValue(dosageTB, value, "Dosage");
	}

	@FindBy(xpath="//p[text()='How often do you take this?']/following-sibling::input")
	private WebElement howOfternDoYouTakeTB;

	public void inputHowOftenDoYouTakeThis(String value) {
		util.sendValue(howOfternDoYouTakeTB, value, "How often do you take this?");
	}

	@FindBy(xpath="//p[text()='Timing']/following-sibling::input")
	private WebElement timingTB;

	public void inputTiming(String value) {
		util.sendValue(timingTB, value, "Timing");
	}

	@FindBy(xpath="//p[text()='Note']/following-sibling::textarea")
	private WebElement noteTB;

	public void inputNote(String value) {
		util.sendValue(noteTB, value, "Note");
	}

	@FindBy(xpath="//td[text()='Abacavir Sulfate']/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement abcavirMedicationEditIcon;

	public void clickAbcavirMedicationEditIcon() {
		util.click(abcavirMedicationEditIcon, "Abacavir Sulfate	Edit Icon");
	}

	public String getMedicationTypeDropDownSelectedText() {
		String text=	util.getInnerText(medicationTypeDropDown);
		return text;
	}

	public String getDosageInputText() {
		String text=	util.GetAttributevalue(dosageTB, "value");
		return text;
	}

	public String getHowOfternDoYouTakeInputText() {
		String text=	util.GetAttributevalue(howOfternDoYouTakeTB, "value");
		return text;
	}

	public String getTimingInputText() {
		String text=	util.GetAttributevalue(timingTB, "value");
		return text;
	}

	public String getNoteInputText() {
		String text=	util.GetAttributevalue(noteTB, "value");
		return text;
	}

	@FindBy(xpath="//div[@id='dropDownDivId']/li[text()='Other']")
	private WebElement otherMedicationTypeDropDownOption;

	public void selectOtherMedicationTypeDropDown() {
		util.holdOn(Duration.ofSeconds(1));
		clickMedictaionTypeDropDown();
		util.click(otherMedicationTypeDropDownOption, "Other");
	}

	@FindBy(xpath="//p[text()='Other']/following-sibling::input")
	private WebElement OtherMedicationTypeDescriptionTB;

	public void inputOtherMedicationTypeDescription(String value) {
		util.sendValue(OtherMedicationTypeDescriptionTB, value, "Other Medication Type Text Box");
	}

	public String getOtherMedicationTypeInputValue() {
		util.waitUntilPresentInUI(OtherMedicationTypeDescriptionTB,"Other Text Box");
		String text=	util.GetAttributevalue(OtherMedicationTypeDescriptionTB, "value");
		return text;
	}

	@FindBy(xpath="//td[text()='5 MG']/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement otherEditIcon;

	public void clickOtherEditIcon() {
		util.click(otherEditIcon, "Other");
	}

	@FindBy(xpath="//div[@id='dropDownDivId']/li[text()='Abelcet']")
	private WebElement MedicationTypeAbelcetDropDownOption;

	public void clickAbelcetMedicationTypeDropDown() {
		util.holdOn(Duration.ofSeconds(2));
		util.click(medicationTypeDropDown, "Medication Type Drop Down");
		util.click(MedicationTypeAbelcetDropDownOption, "Abelcet");
	}

	@FindBy(xpath="//td[text()='Abelcet']/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement abelcetMedicationTypeEditIcon;

	public void clickAbelcetMedicationEditIcon() {
		util.click(abelcetMedicationTypeEditIcon, "Abelcet");
	}

	@FindBy(xpath="//button[contains(text(),'Save & Proceed to Housing')]")
	private WebElement saveProceedToHousing;

	public void clickSaveProceedToHousingButton() {
		util.click(saveProceedToHousing, "Save & Proceed To Spouse Button");
	}
	
	@FindBy(xpath="(//button[contains(text(),'Add Medication')])[2]")
	private WebElement spouseAddMedicationButton;
	
	public void clickSpouseAddMedictionButton() {
		util.click(spouseAddMedicationButton, "Spouse Add medication");
	}

}
