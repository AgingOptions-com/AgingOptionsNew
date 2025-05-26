package com.agingoptions.filecabinet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FileCabinetParalegal {

	private 	WebUtil util;

	public FileCabinetParalegal(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//span[contains(text(),'Estate planning documents')]")
	private WebElement estatePlanningDocumentTab;

	public void clickEstatePlanningDocumentTab() {
		util.click(estatePlanningDocumentTab, "Estate planning documents");
	}

	@FindBy(xpath="//button[contains(text(),'Current')]")
	private WebElement currentLink;

	public void clickCurrentLink() {
		util.click(currentLink, "Current");
	}

	@FindBy(xpath="//button[contains(text(),'Draft')]")
	private WebElement draftLink;

	public void clickDraftLink() {
		util.click(draftLink, "Draft");
	}

	@FindBy(xpath="//button[contains(text(),'Archived')]")
	private WebElement archivedLink;

	public void clickArchievedLink() {
		util.click(archivedLink, "Archived");
	}

	@FindBy(xpath="//span[contains(text(),'Click to upload your file')]")
	private WebElement uploadYourFileLink;

	public void clickUploadYourFileButton() {
		util.click(uploadYourFileLink, "Click to upload your file");
	}

	@FindBy(xpath="//input[@id='fileType']")
	private WebElement fileTypeDropDown;

	@FindBy(xpath="//h3[text()='Assessment']")
	private WebElement assessmentLetterDDOption;

	public void selectAssessmentLetter() {
		util.click(fileTypeDropDown, "File Type");
		util.click(assessmentLetterDDOption, "Assessment Letter");
	}
	
	@FindBy(xpath="//h3[text()='Certificate of Trust']")
	private WebElement certificateOfTrustDDOption;

	public void selectCertificateofTrust() {
		util.click(fileTypeDropDown, "File Type");
		util.click(certificateOfTrustDDOption, "Certificate of Trust");
	}
	
	@FindBy(xpath="//p[contains(text(),'Date of sign off')]/parent::div//input")
	private WebElement dateOfSignOffTB;

	public void inputDateOfSignOff(String value) {
		util.sendValue(dateOfSignOffTB, value, "Date of sign off");
	}

	@FindBy(xpath="//input[@id='EmergencyDocument']")
	private WebElement emergencyDocumentDDIcon;

	@FindBy(xpath="//h3[text()='Yes']")
	private WebElement yesRadioBT;

	public void selectYesRadioButtonAsEmergencyDocument() {
		util.click(emergencyDocumentDDIcon, "You want to include this as an Emergency Document?");
		util.click(yesRadioBT, "Yes");
	}

	@FindBy(xpath="//input[@id='clientsDocVisibility']")
	private WebElement isThisDocumentVisibleClientDD;

	public String getIsThisDocumentVisibleClientDropDownSelectedText() {
		String text=   util.getInnerText(isThisDocumentVisibleClientDD);
		return text;
	}

	@FindBy(xpath="//input[@id='file']")
	private WebElement fileUpload;

	public void uploadFile() {
		String path=	System.getProperty("user.dir")+"\\src\\test\\resources\\Docs.pdf";
		util.uploadFile(fileUpload, path);
	}

	@FindBy(xpath="//button[@class='fileSaveEditButton']")
	private WebElement fileCabinetSaveBT;

	public void clickFileCabinetSaveButton() {
		util.click(fileCabinetSaveBT, "Save Button");
	}

	@FindBy(xpath="//input[@id='BelongsTo']")
	private WebElement belongsToDD;

	@FindBy(xpath="(//p[contains(text(),'Belongs to*')]/parent::div//div[@class='options'])[1]/h3")
	private WebElement primaryMemberBelongsToDD;

	public void selectPrimaryMemberBelongsTODD() {
		util.click(belongsToDD, "Belongs to*");
		util.click(primaryMemberBelongsToDD, "Primary Member");
	}
	
	@FindBy(xpath="//h3[text()='Joint']")
	private WebElement jointOption;
	
	public void selectJointBelongsTODD() {
		util.click(belongsToDD, "Belongs to*");
		util.click(jointOption, "Joint");
	}
	

	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement cancelBT;

	public void clickCancelButton() {
		util.click(cancelBT, "Cancel");
	}

	@FindBy(xpath="(//tr[@class='filesTableMainDivWidth20']/td)[2]//p")
	private WebElement uploadedFileDocumentType;

	public String getUploadedFileDocumentType() {
		String text=	util.getInnerText(uploadedFileDocumentType);
		return text;
	}
	
	@FindBy(xpath="//button[@id='SpouseFileListShow']")
	private WebElement spouseToggleBT;
	
	public void clickSpouseToggleButton() {
		util.click(spouseToggleBT, "Spouse Toggle Button");
	}
	
	@FindBy(xpath="//span[contains(text(),'Life Plan')]")
	private WebElement lifePlanDocumentTab;

	public void clickLifePlanTab() {
		util.click(lifePlanDocumentTab, "Life Plan documents");
	}

	@FindBy(xpath="//h3[text()='Gun Trust']")
	private WebElement gunTrustDDOption;

	public void selectGunTrust() {
		util.click(fileTypeDropDown, "File Type");
		util.click(gunTrustDDOption, "Gun Trust");
	}


}
