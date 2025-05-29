package com.agingoptions.filecabinet.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.filecabinet.FileCabinetParalegal;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class FileCabinetParalegalTestCases extends BaseTest {

	@Test(priority=1)
	public void FTC_061_EstatePlanningPrimaryMemberDocsUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickEstatePlanningDocumentTab();
		fileCabinet.clickCurrentLink();
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectAssessmentLetter();
		fileCabinet.selectPrimaryMemberBelongsTODD();
		String expectedDateOfSignOff = "12-18-2023";
		fileCabinet.inputDateOfSignOff(expectedDateOfSignOff);
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(2));
		String actualFileType = fileCabinet.getUploadedFileDocumentType();
		util.verifyActualExpectedText(actualFileType, "Assessment", "Assessment Letter");
	}

	@Test(priority = 2)
	public void FTC_062_EstatePlanningJointsDocsUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickEstatePlanningDocumentTab();
		fileCabinet.clickCurrentLink();
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectCertificateofTrust();
		fileCabinet.selectJointBelongsTODD();
		String expectedDateOfSignOff = "12-18-2024";
		fileCabinet.inputDateOfSignOff(expectedDateOfSignOff);
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(3));
		String actualFileType = fileCabinet.getUploadedFileDocumentType();
		util.verifyActualExpectedText(actualFileType, "Certificate of Trust", "Certificate of Trust");
		fileCabinet.clickSpouseToggleButton();
		String spoueActualFileType = fileCabinet.getUploadedFileDocumentType();
		util.verifyActualExpectedText(spoueActualFileType, "Certificate of Trust", "Spouse Certificate of Trust");
	}

	@Test(priority = 3)
	public void FTC_063_LifePlanJointsDocsUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickLifePlanTab();
		fileCabinet.clickCurrentLink();
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectGunTrust();
		fileCabinet.selectJointBelongsTODD();
		String expectedDateOfSignOff = "12-18-2024";
		fileCabinet.inputDateOfSignOff(expectedDateOfSignOff);
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(2));
		String actualFileType = fileCabinet.getUploadedFileDocumentType();
		util.verifyActualExpectedText(actualFileType, "Gun Trust", "Gun Trust");
		fileCabinet.clickSpouseToggleButton();
		String spoueActualFileType = fileCabinet.getUploadedFileDocumentType();
		util.verifyActualExpectedText(spoueActualFileType, "Gun Trust", "Spouse Gun Trust");
	}

	@Test(priority=4)
	public void FTC_064_LifePlanFeeAgreementDocsUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickFeeAgreementOtherFormsTab();
		fileCabinet.clickCurrentLink();
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectAnnualMaintananceDocs();
		fileCabinet.selectPrimaryMemberBelongsTODD();
		String expectedDateOfSignOff = "11-09-2024";
		fileCabinet.inputDateOfSignOff(expectedDateOfSignOff);
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(2));
		String actualFileType = fileCabinet.getUploadedFileDocumentType();
		util.verifyActualExpectedText(actualFileType, "Annual Maintenance Agreement", "Annual Maintenance Agreement");
	}

	@Test(priority = 5)
	public void FTC_065_LifePlanFeeAgreementDocsArchivedFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickFeeAgreementOtherFormsTab();
		fileCabinet.clickCurrentLink();
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectAnnualMaintananceDocs();
		fileCabinet.selectPrimaryMemberBelongsTODD();
		String expectedDateOfSignOff = "11-09-2024";
		fileCabinet.inputDateOfSignOff(expectedDateOfSignOff);
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickFeeAgreementOtherFormsTab();
		fileCabinet.clickCurrentLink();
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectAnnualMaintananceDocs();
		fileCabinet.selectPrimaryMemberBelongsTODD();
		expectedDateOfSignOff = "12-11-2023";
		fileCabinet.inputDateOfSignOff(expectedDateOfSignOff);
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		String currentActualFileType = fileCabinet.getUploadedFileDocumentType();
		fileCabinet.clickArchivedFile();
		String archivedActualFileType = fileCabinet.getUploadedFileDocumentType();
		util.verifyActualExpectedText(currentActualFileType, archivedActualFileType, "Annual Maintenance Agreement");
	}

	@Test(priority=6)
	public void FTC_066_PrimaryMemberFinanceDrawerFileUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickFinanceDrawer();
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectPrimaryMemberBelongsTODD();
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.click3DotIcon();
		fileCabinet.clickEditIcon();
		String actualEmergencySelectedText=fileCabinet.getYouWantIncludeThisAnEmergencyContactSelectedText();
		String actualClientDocsVisibleText=fileCabinet.getClientDocumentVisibleSelectedText();
        fileCabinet.clickUpdateButton();
		util.verifyActualExpectedText(actualEmergencySelectedText, "Yes", "You want to include this as an Emergency Document");
		util.verifyActualExpectedText(actualClientDocsVisibleText, "Yes", "Will this document's be visible to the client");
	}

	@Test(priority=7)
	public void FTC_067_SpouseFinanceDrawerFileUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickFinanceDrawer();
		fileCabinet.clickSpouseToggleButton();
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectSpouseBelongsTODD();
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.click3DotIcon();
		fileCabinet.clickEditIcon();
		String actualEmergencySelectedText=fileCabinet.getYouWantIncludeThisAnEmergencyContactSelectedText();
		String actualClientDocsVisibleText=fileCabinet.getClientDocumentVisibleSelectedText();
        fileCabinet.clickUpdateButton();
		util.verifyActualExpectedText(actualEmergencySelectedText, "Yes", "You want to include this as an Emergency Document");
		util.verifyActualExpectedText(actualClientDocsVisibleText, "Yes", "Will this document's be visible to the client");
	}

	@Test(priority = 8)
	public void FTC_068_PrimaryHealthDrawerFileUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickHealthDrawer();
		
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectPrimaryMemberBelongsTODD();
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.click3DotIcon();
		fileCabinet.clickEditIcon();
		String actualEmergencySelectedText=fileCabinet.getYouWantIncludeThisAnEmergencyContactSelectedText();
		String actualClientDocsVisibleText=fileCabinet.getClientDocumentVisibleSelectedText();
        fileCabinet.clickUpdateButton();
		util.verifyActualExpectedText(actualEmergencySelectedText, "Yes", "You want to include this as an Emergency Document");
		util.verifyActualExpectedText(actualClientDocsVisibleText, "Yes", "Will this document's be visible to the client");
	}
	
	@Test(priority=9)
	public void FTC_069_SpouseHealthDrawerFileUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickHealthDrawer();
		fileCabinet.clickSpouseToggleButton();
		fileCabinet.clickUploadYourFileButton();
		util.holdOn(Duration.ofSeconds(2));
		fileCabinet.selectSpouseBelongsTODD();
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.click3DotIcon();
		fileCabinet.clickEditIcon();
		String actualEmergencySelectedText=fileCabinet.getYouWantIncludeThisAnEmergencyContactSelectedText();
		String actualClientDocsVisibleText=fileCabinet.getClientDocumentVisibleSelectedText();
        fileCabinet.clickUpdateButton();
		util.verifyActualExpectedText(actualEmergencySelectedText, "Yes", "You want to include this as an Emergency Document");
		util.verifyActualExpectedText(actualClientDocsVisibleText, "Yes", "Will this document's be visible to the client");
	}

	@Test(priority=10)
	public void FTC_070_PrimaryHousingDrawerFileUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickHousingDrawer();
		
		fileCabinet.clickUploadYourFileButton();
		fileCabinet.selectPrimaryMemberBelongsTODD();
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.click3DotIcon();
		fileCabinet.clickEditIcon();
		String actualEmergencySelectedText=fileCabinet.getYouWantIncludeThisAnEmergencyContactSelectedText();
		String actualClientDocsVisibleText=fileCabinet.getClientDocumentVisibleSelectedText();
        fileCabinet.clickUpdateButton();
		util.verifyActualExpectedText(actualEmergencySelectedText, "Yes", "You want to include this as an Emergency Document");
		util.verifyActualExpectedText(actualClientDocsVisibleText, "Yes", "Will this document's be visible to the client");
	}
	
	@Test(priority=11)
	public void FTC_071_SpouseHousingDrawerFileUploadFunctionality() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpo.clickFileCabinetSideBarLink();
		FileCabinetParalegal fileCabinet = new FileCabinetParalegal(util);
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.clickHousingDrawer();
		fileCabinet.clickSpouseToggleButton();
		fileCabinet.clickUploadYourFileButton();
		util.holdOn(Duration.ofSeconds(2));
		fileCabinet.selectSpouseBelongsTODD();
		fileCabinet.selectYesRadioButtonAsEmergencyDocument();
		fileCabinet.uploadFile();
		fileCabinet.clickFileCabinetSaveButton();
		fileCabinet.clickCancelButton();
		util.holdOn(Duration.ofSeconds(5));
		fileCabinet.click3DotIcon();
		fileCabinet.clickEditIcon();
		String actualEmergencySelectedText=fileCabinet.getYouWantIncludeThisAnEmergencyContactSelectedText();
		String actualClientDocsVisibleText=fileCabinet.getClientDocumentVisibleSelectedText();
        fileCabinet.clickUpdateButton();
		util.verifyActualExpectedText(actualEmergencySelectedText, "Yes", "You want to include this as an Emergency Document");
		util.verifyActualExpectedText(actualClientDocsVisibleText, "Yes", "Will this document's be visible to the client");
	}
	

}
