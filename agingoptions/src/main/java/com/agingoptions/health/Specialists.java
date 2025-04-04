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

	@FindBy(xpath="(//div[contains(@class,'btn-div addBorderToToggleButton')]/button)[1]")
	private WebElement primaryMemberToggleButton;

	public void clickPrimaryMemberToggleButton() {
		util.click(primaryMemberToggleButton, "Primary Member Toggle Button");
	}

	@FindBy(xpath="(//div[contains(@class,'btn-div addBorderToToggleButton')]/button)[2]")
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
		util.waitUntilPresentInUI(firstNameTB, "First Name");
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

	@FindBy(xpath="//div[@id='dropDownDivId']/li[text()='Addiction Medicine']")
	private WebElement addictionMedicineDropDownOption;

	public void selectAddictionMedicineSpeciality() {
		util.holdOn(Duration.ofSeconds(3));
		clickSpecialityDropDown();
		util.waitUntilElementToBeClickable(addictionMedicineDropDownOption);
		util.click(addictionMedicineDropDownOption, "Addiction Medicine");
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

	@FindBy(xpath="//td[text()='Acupuncture']/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement AcupnctureSpecialistTable;

	public void clickAcupnctureSpecialistEditIcon() {
		util.click(AcupnctureSpecialistTable, "Edit icon");
	}

	@FindBy(xpath="//div[@id='dropDownDivId']/li[text()='Acupuncture']")
	private WebElement AcupunctureOption;

	@FindBy(xpath="//div[@id='specialty']")
	private WebElement specialistyDropDown;

	public void SelectAcupunctureDDOption() {
		util.click(specialistyDropDown, "Specialist Drop Down");
		util.click(AcupunctureOption, "Acupuncture ");
	}

	@FindBy(xpath="//p[text()='Copy same data to spouse']/parent::div//input")
	private WebElement copySameDataToSpouseCheckBox;

	public void checkCopySameDataToSpouseCheckBox() {
		try {
			util.waitUntilElementIsDeselected(copySameDataToSpouseCheckBox, 10);
			util.checkCheckBox(copySameDataToSpouseCheckBox, "Copy Same Data To Spouse");
			util.waitUntilElementIsSelected(copySameDataToSpouseCheckBox, 5);
		}catch(Exception e) {
			util.checkCheckBox(copySameDataToSpouseCheckBox, "Copy Same Data To Spouse");
		}
	}

	@FindBy(xpath="(//td[text()='Acupuncture']/following-sibling::td)[2]")
	private WebElement acupunctureSpecialistEmail;

	public String getAcupunctureSpecialistEmail() {
		String emailText=	util.getInnerText(acupunctureSpecialistEmail);
		return emailText;
	}

	@FindBy(xpath="//div[@id='dropDownDivId']/li[text()='Other']")
	private WebElement otherDDOption;

	public void selectOtherSpecilaistOptions() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(specialistyDropDown, "Specialist Drop Down");
		util.click(otherDDOption, "Other Option");
	}

	@FindBy(xpath="//input[@id='other']")
	private WebElement otherTB;

	public void inputOtherTextBox(String value) {
		util.sendValue(otherTB, value, "Other Text Box");
	}

	public String getOtherSpecialistInputValue() {
		String value=	util.GetAttributevalue(otherTB, "value");
		return value;
	}

	@FindBy(xpath="//td[@class='name ps-24']/following-sibling::td[text()='Teeth Specialist']/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement teethSpecialistTableText;

	public String otherSpecialistEditIcon() {
		String text=	util.getInnerText(teethSpecialistTableText);
		return text;
	}

	public void clickOtherTeethSpecialistEditIcon() {
		util.waitUntilElementToBeClickable(teethSpecialistTableText);
		util.clickJavaScript(teethSpecialistTableText, "other Specialist");
	}

	@FindBy(xpath="//td[contains(text(),'Addiction and Substance Abuse Counseling')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement addictionAndSubstanceAbuseCoundelingTableEditIcon;

	public void clickAddictionAndSubstanceAbuseCounselingEditIcon() {
		util.click(addictionAndSubstanceAbuseCoundelingTableEditIcon, "Addiction and Substance Abuse Counseling");
	}

	@FindBy(xpath="//td[contains(text(),'Addiction Medicine')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement addictionMedicineEditIcon;

	public void clickAddictionMedicineEditIcon() {
		
		util.click(addictionMedicineEditIcon, "Addiction Medicine");
	}

	@FindBy(xpath="//button[contains(text(),'Save & Proceed to health insurance')]")
	private WebElement saveProceedToHealthInsuranceBT;
	
	public void clickSaveProceedToHealthInsuranceButton() {
		util.click(saveProceedToHealthInsuranceBT, "Save & Proceed to health insurance");
	}

	@FindBy(xpath="//div[@id='dropDownDivId']/li[text()='Addiction Psychiatry']")
	private WebElement specialityAddictionPsychiatryDDOptions;
	
	public void selectAddictionPsychiatrySpecialistOptions() {
	   util.click(specialistyDropDown, "Speciality Drop Down");
	   util.click(specialityAddictionPsychiatryDDOptions, "Addiction Psychiatry");
	}
	
	@FindBy(xpath="//td[contains(text(),'Addiction Psychiatry')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement addictionPsychiatryEditBT;
	
	public void clickAddictionPsychiatryEditBTTable() {
		util.click(addictionPsychiatryEditBT, "Addiction Psychiatry");
	}
	
	@FindBy(xpath="//div[@class='toaster_T']/following-sibling::h6")
	private WebElement toasterMessage;
	
	public void waitUntilToasterMessageisHide() {
		util.waitUntilElementIsDisappearFromThePage(toasterMessage, 0);
	}


}
