package com.agingoptions.health;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class Specialists extends CommonCode {

	private WebUtil util;

	public Specialists(WebUtil util) {
		super(util);
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//span[contains(text(),'Specialists')]")
	private WebElement specialistSideBarLk;

	public void clickSpecilistLink() {
		util.click(specialistSideBarLk, "Specialist Side Bar Link");
	}

	@FindBy(xpath="//input[@name='iDontHaveOne']")
	private WebElement iDonhaveSpecialistCheckbox;

	public void clickIdonHaveSpecialistCheckbox() {
		util.checkCheckBox(iDonhaveSpecialistCheckbox, "I don’t have a Specialist");
	}

	@FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton']/button)[1]")
	private WebElement primaryMemberToggleButton;

	public void clickPrimaryMemberToggleButton() {
		util.click(primaryMemberToggleButton, "Primary Member Toggle Button");
	}

	@FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton']/button)[2]")
	private WebElement spouseToggleButton;

	public void clickSpouseToggleButton() {
		util.click(spouseToggleButton, "Spouse Toggle Button");
	}

	@FindBy(xpath="//button[contains(text(),'Proceed')]")
	private WebElement proceedToSpouseInfoBT;

	public void clickProceedToSpouseBT() {
		util.click(proceedToSpouseInfoBT, "Proceed To Spouse Information");
	}

	public void IdontHaveSpecialistRadioButtonStatus() {
		util.waitUntilElementIsSelected(iDonhaveSpecialistCheckbox, 10);
		util.isSelected(iDonhaveSpecialistCheckbox, "I don't have Specialist");
	}

	@FindBy(xpath="//input[@id='fName']")
	private WebElement firstNameTB;

	public void inputFirstName(String value) {
		util.sendValue(firstNameTB, value, "First Name");
	}

	@FindBy(xpath="//input[@id='lName']")
	private WebElement lastNameTB;

	public void inputLastName(String value) {
		util.sendValue(lastNameTB, value, "Last Name");
	}

	@FindBy(xpath="//input[@id='business']")
	private WebElement affiliatedHospitalTB;

	public void inputAffiliatedHospital(String value) {
		util.sendValue(affiliatedHospitalTB, value, "Affiliated hospital (s)");
	}

	@FindBy(xpath="//input[@id='websiteLink']")
	private WebElement websiteLinkTB;

	public void inputWebsiteLink(String value) {
		util.sendValue(websiteLinkTB, value, "WebSite Link");
	}

	@FindBy(xpath="//input[@id='visit_Duration']")
	private WebElement yearAsYourDoctorSeenTB;

	public void inputyearAsYourDoctorSeen(String value) {
		util.waitUntilPresentInUI(yearAsYourDoctorSeenTB, "Year As Seen");
		//util.sendValue(yearAsYourDoctorSeenTB, value, "Years as your doctor");
		util.waitUntilValueIsSend(yearAsYourDoctorSeenTB, 10, value);
	}

	@FindBy(xpath="//textarea[@id='instructionsToAgent']")
	private WebElement notesForAgentsTB;

	public void inputNotesForAgents(String value) {
		util.sendValue(notesForAgentsTB, value, "Notes for agents");
	}

	@FindBy(xpath="//p[text()='Are you happy with his/her care?']/parent::div/div//p[text()='Yes']")
	private WebElement areYouHappyWithHisCareYesRadioBT;

	public void clickAreYouHappyWithHisCareYesRadioButton() {
		util.click(areYouHappyWithHisCareYesRadioBT, "Are you happy with his/her care?");
	}

	@FindBy(xpath="//button[text()='Add Specialist']")
	private WebElement addSpecialistBT;

	public void clickAddSpecialistButton() {
		util.click(addSpecialistBT, "Add Specialist");
	}

	@FindBy(xpath="//div[@id='specialty']/span")
	private WebElement specialityDropDown;

	private void clickSpecialityDropDown() {
		util.click(specialityDropDown, "Specialist Drop Down");
	}

	@FindBy(xpath="//div[@id='dropDownDivId']/li[contains(text(),'Addiction and Substance Abuse Counseling')]")
	private WebElement addictionAndSubstanceAbuseCounsellingOption;

	public void selectAddictionAndSubstanceAbuse() {
		util.holdOn(Duration.ofSeconds(3));
		clickSpecialityDropDown();
		util.waitUntilElementToBeClickable(addictionAndSubstanceAbuseCounsellingOption);
		util.click(addictionAndSubstanceAbuseCounsellingOption, "Addiction and Substance Abuse Counseling");
	}

	@FindBy(xpath="//img[@alt='Edit Icon']")
	private WebElement editIcon;

	public void clickEditIcon() {
		util.waitUntilElementToBeClickable(editIcon);
		util.click(editIcon, "Edit Icon");
	}

	public String getSpecialistActualFirstName() {
		String firstName=	util.GetAttributevalue(firstNameTB, "value");
		return firstName;
	}

	public String getSpecialistActualLastName() {
		String lastName=	util.GetAttributevalue(lastNameTB, "value");
		return lastName;
	}

	public String getSpecialistSpeciality() {
		String speciality=	util.getInnerText(specialityDropDown);
		return speciality;
	}

	public String getAffiliatedHospitalActualText() {
		String actualText=	util.GetAttributevalue(affiliatedHospitalTB, "value");
		return actualText;
	}

	public String getWebSiteLinkAcutalText() {
		String text=	util.GetAttributevalue(websiteLinkTB, "value");
		return text;
	}

	public String getYearAsYourDoctorText() {
		String text=	util.GetAttributevalue(yearAsYourDoctorSeenTB, "value");
		return text;
	}

	public String getNotesToAgentsText() {
		String text=	util.GetAttributevalue(notesForAgentsTB, "value");
		return text;
	}

	@FindBy(xpath="(//div[normalize-space()='Physical Address'])[1]")
	private WebElement physicalAddressText;

	public String getPhysicalAddressText() {
		String actualText=	util.getInnerText(physicalAddressText);
		return actualText ;
	}

	@FindBy(xpath="(//div[normalize-space()='Primary contact'])[1]")
	private WebElement primaryContactText;

	public String getPrimaryAddressText() {
		String actualText=	util.getInnerText(primaryContactText);
		return actualText ;
	}



}
