package com.agingoptions.health;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class PrimaryCarePhysician {

	private WebUtil util;

	public PrimaryCarePhysician(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util = util;
	}

	@FindBy(xpath = "//span[contains(text(),'Health Professionals')]/parent::div")
	private WebElement healthProfessionalLK;

	public void clickHealthProfessionalLK() {
		util.waitUntilElementToBeClickable(healthProfessionalLK);
		util.waitUntilPresentInUI(healthProfessionalLK, "Health Professional Side Bar Link");
		util.holdOn(Duration.ofSeconds(1));
		util.click(healthProfessionalLK, "Health Professional");
	}

	@FindBy(xpath = "//input[@name='iDontHaveOne']")
	private WebElement iDontHavePrimaryCarePhysicianCheckbox;

	public void checkIDontHavePrimaryCarePhysicianCheckBox() {
		util.waitUntilElementToBeClickable(iDontHavePrimaryCarePhysicianCheckbox);
		util.checkCheckBox(iDontHavePrimaryCarePhysicianCheckbox, "I Don't have primary Care Physician");
	}

	@FindBy(xpath = "//button[contains(text(),'Proceed to')]")
	private WebElement proccedToBT;

	public void clickProceedTOSpouseBT() {
		util.click(proccedToBT, "Proceed To Button");
	}

	@FindBy(xpath = "((//div[@class='btn-div addBorderToToggleButton ms-auto']/button))[1]")
	private WebElement primaryMemberToggleBT;

	public void clickPrimaryMemberToggleButton() {
		util.waitUntilElementToBeClickable(primaryMemberToggleBT);
		util.click(primaryMemberToggleBT, "Primary Member Toggle Button");
	}

	@FindBy(xpath = "((//div[@class='btn-div addBorderToToggleButton ms-auto']/button))[2]")
	private WebElement spouseToggleBT;

	public void clickSpouseToggleButton() {
		util.waitUntilElementToBeClickable(spouseToggleBT);
		util.click(spouseToggleBT, "Spouse Toggle Button");
	}

	public void iDontHavePrimaryCarePhysicianCheckboxStatus() {
		util.isSelected(iDontHavePrimaryCarePhysicianCheckbox, "I don't have primary care physician");
	}

	@FindBy(xpath = "//button[contains(text(),'Proceed to Specialists')]")
	private WebElement saveProceedToSpecialistBT;

	public void clickSaveProceedToSpecialistBT() {
		util.waitUntilPresentInUI(saveProceedToSpecialistBT, "Save & Proceed to Specialist Button");
		util.waitUntilElementToBeClickable(saveProceedToSpecialistBT);
		util.clickJavaScript(saveProceedToSpecialistBT, "save & Proceed to Specialist Button");
	}

	@FindBy(xpath = "//span[contains(text(),'Primary Care Physician')]")
	private WebElement primaryCarePhysicianLK;

	public void clickPrimaryCarePhysicianLK() {
		util.click(primaryCarePhysicianLK, "Primary Care Physician");
	}

	@FindBy(xpath = "//input[@id='fName']")
	private WebElement firstNameTB;

	public void inputFirstName(String value) {
		util.sendValue(firstNameTB, value, "First Name");
	}

	@FindBy(xpath = "//input[@id='lName']")
	private WebElement lastNameTB;

	public void inputLastName(String value) {
		util.sendValue(lastNameTB, value, "Last Name");
	}

	@FindBy(xpath = "//input[@id='business']")
	private WebElement affiliatedHospitalTB;

	public void inputAffiliatedHospital(String value) {
		util.sendValue(affiliatedHospitalTB, value, "Affiliated hospital (s)");
	}

	@FindBy(xpath = "//input[@id='websiteLink']")
	private WebElement websiteNameTB;

	public void inputWebsiteName(String value) {
		util.sendValue(websiteNameTB, value, "Website Link");
	}

	@FindBy(xpath = "//input[@id='visit_Duration']")
	private WebElement yearAsYourDoctorTB;

	public void inputYearAsYourDoctorSeen(String value) {
		util.sendValue(yearAsYourDoctorTB, value, "Years as your doctor");
	}

	@FindBy(xpath = "//textarea[@id='instructionsToAgent']")
	private WebElement notesForAgentsTB;

	public void inputNotesForAgents(String value) {
		util.sendValue(notesForAgentsTB, value, "Notes for Agents");
	}

	@FindBy(xpath = "//div[@id='specialty']")
	private WebElement specialistyDropDown;

	public void clickSpecialityDropDown() {
		util.click(specialistyDropDown, "Specialisty Drop Down");
	}

	@FindBy(xpath = "//div[@id='dropDownDivId']/li[contains(text(),'Advanced Registered Nurse Practitioner (ARNP)')]")
	private WebElement ARNPDropDownOption;

	public void clickARNPDropDownOption() {
		util.click(ARNPDropDownOption, "Advanced Registered Nurse Practitioner (ARNP)");
	}

	@FindBy(xpath = "(//p[contains(text(),'Are you happy with his/her care?')]/parent::div//label/input)[1]")
	private WebElement areYouHappyWithHisCareYesRadioBT;

	public void clickAreYouHappyWithHisCareYesRadioButton() {
		util.click(areYouHappyWithHisCareYesRadioBT, "Are you happy with his/her care?");
	}

	@FindBy(xpath = "(//p[contains(text(),'Is this Physician a geriatrician?')]/parent::div//label/input)[1]")
	private WebElement isThisPhysicianAGeritricainYesRadioBT;

	public void clickIsThisPhysicianIsAGeritricianYesRadioBT() {
		util.click(isThisPhysicianAGeritricainYesRadioBT, "Is this Physician a geriatrician?");
	}

	@FindBy(xpath = "(//p[contains(text(),'Are they board certified?')]/parent::div//label/input)[1]")
	private WebElement areTheyCertifiedYesRadioButton;

	public void clickAreTheyCertifiedYesRadioBT() {
		util.click(areTheyCertifiedYesRadioButton, "Are they board certified?");
	}

	@FindBy(xpath = "//button[contains(text(),'Contact & Address Information')]")
	private WebElement contactAddressInfoAccordian;

	public void openContactAndAddressInfoAccordian() {
		util.openAccordion(contactAddressInfoAccordian, "Contact & Address Information");
	}

	public void uncheckIDontHavePrimaryCarePhysician() {
		util.waitUntilElementIsSelected(iDontHavePrimaryCarePhysicianCheckbox, 10);
		util.unCheckCheckBox(iDontHavePrimaryCarePhysicianCheckbox, "I don't have Primary Care Physician");
		try {
			util.waitUntilElementIsDeselected(iDontHavePrimaryCarePhysicianCheckbox, 5);
		} catch (Exception e) {
			util.unCheckCheckBox(iDontHavePrimaryCarePhysicianCheckbox, "I don't have Primary Care Physician");
		}
	}

	@FindBy(xpath = "//p[contains(text(),'Contact Type')]/parent::div/div/div")
	private WebElement contactTypeDropDown;

	public void clickContactTypeDropDown() {
		util.click(contactTypeDropDown, "Contact Type");
	}

	@FindBy(xpath = "//ul[@id='dropDownDivId']/li[text()='Primary']")
	private WebElement primaryCellNo;

	public void clickPrimaryCellNo() {
		util.click(primaryCellNo, "Primary Cell No");
	}

	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement phoneNumberTB;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTB;

	public void inputPrimaryContactEmailMobileNo(String cellNum, String email) {
		util.holdOn(Duration.ofSeconds(1));
		clickContactTypeDropDown();
		clickPrimaryCellNo();
		util.sendValue(phoneNumberTB, cellNum, "Phone Number");
		util.sendValue(emailTB, email, "Email");
	}

	@FindBy(xpath = "//h5[contains(text(),'Add another contact')]")
	private WebElement addAnotherContactBT;

	public void clickAddAnotherContactButton() {
		util.click(addAnotherContactBT, "Add Another button");
	}

	@FindBy(xpath = "//input[@id='addressLine1']")
	private WebElement addressLine1TB;

	public void inputAddress(String value) {
		util.sendValue(addressLine1TB, value, "Address");
		util.holdOn(Duration.ofSeconds(4));
		util.DownKey();
		util.DownKey();
		util.pressEnter();
		util.pressTab();
	}

	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	private WebElement saveAndProceedToSpouseBT;

	public void clickSaveAndProceedToSpouseBT() {
		util.click(saveAndProceedToSpouseBT, "Save & Proceed To Spouse Button");
	}

	@FindBy(xpath = "//button[text()='Save & Continue later']")
	private WebElement saveContinueLaterButton;

	public void clickSaveContinueLateButton() {
		util.click(saveContinueLaterButton, "Save & Continue Later Button");
	}

	public String getPrimaryCarePhysicianOrSpecialistActualFirstName() {
		String firstName = util.GetAttributevalue(firstNameTB, "value");
		return firstName;
	}

	public String getPrimaryCarePhysicianOrSpecialistActualLastName() {
		String lastName = util.GetAttributevalue(lastNameTB, "value");
		return lastName;
	}

	public String getPrimaryCarePhysicianOrSpecialistActualSpeciality() {
		String speciality = util.getInnerText(specialistyDropDown);
		return speciality;
	}

	public String getAffiliatedHospitalActualText() {
		String actualText = util.GetAttributevalue(affiliatedHospitalTB, "value");
		return actualText;
	}

	public String getWebSiteLinkAcutalText() {
		String text = util.GetAttributevalue(websiteNameTB, "value");
		return text;
	}

	public String getYearAsYourDoctorText() {
		String text = util.GetAttributevalue(yearAsYourDoctorTB, "value");
		return text;
	}

	public String getNotesToAgentsText() {
		String text = util.GetAttributevalue(notesForAgentsTB, "value");
		return text;
	}

	@FindBy(xpath = "(//div[normalize-space()='Physical Address'])[1]")
	private WebElement physicalAddressText;

	public String getPhysicalAddressText() {
		String actualText = util.getInnerText(physicalAddressText);
		return actualText;
	}

	@FindBy(xpath = "(//div[normalize-space()='Primary contact'])[1]")
	private WebElement primaryContactText;

	public String getPrimaryContactText() {
		String actualText = util.getInnerText(primaryContactText);
		return actualText;
	}

	@FindBy(xpath = "//button[contains(text(),'Personal Details')]")
	private WebElement personalDetailsAccordian;

	public void openPersonalDetailsAccoordian() {
		util.openAccordion(personalDetailsAccordian, "Personal Details Accordian");
	}

}
