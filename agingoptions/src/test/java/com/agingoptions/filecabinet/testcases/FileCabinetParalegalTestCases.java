package com.agingoptions.filecabinet.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.filecabinet.FileCabinetParalegal;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class FileCabinetParalegalTestCases extends BaseTest {

	@Test
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
	

}
