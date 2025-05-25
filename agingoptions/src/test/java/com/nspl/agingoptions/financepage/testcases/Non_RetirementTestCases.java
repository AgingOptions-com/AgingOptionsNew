package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.Non_Retirement_And_RetirementPage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class Non_RetirementTestCases extends BaseTest {

	@Test(priority = 1)
	public void FTC01_Non_RetirementSaveContinueLaterButton() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		CommonCode common=		new CommonCode(util);
		lpo.clickFinanceSideBarLink();
		util.holdOn(Duration.ofSeconds(3));
		util.refreshPage();
		AssetsCommonCode assets=	new AssetsCommonCode(util);
		assets.clickNon_RetirementSideBarLink();
		assets.clickAddAssetButton();
		Non_Retirement_And_RetirementPage nonRetirement=	new Non_Retirement_And_RetirementPage(util);
		nonRetirement.selectSavingAccountFromTypeOfAssets();
		String expectedNameOfInstituion="Indian non-Retirement Assets";
		nonRetirement.inputNameOfInstituion(expectedNameOfInstituion);
		String expectedBalance="434534";
		nonRetirement.inputBalance(expectedBalance);
		nonRetirement.selectOwnerAsJoint();
		String expectedAccountNumber="8743";
		nonRetirement.inputAccountNumber(expectedAccountNumber);
		nonRetirement.openAddressAccordian();
		//assets.inputAddress("122002");
		String expectedPhoneNumber="8734563443";
		assets.inputPhoneNumber(expectedPhoneNumber);
		String expectedEmail="rohannonretirementassets@maildrop.cc";
		assets.inputEmail(expectedEmail);
		nonRetirement.openBeneficiaryAccordian();
		nonRetirement.clickAddCharityButton();
		util.holdOn(Duration.ofSeconds(5));
		String expectedCharityName="Sohan Charity";
		nonRetirement.inputCharityNameTB(expectedCharityName);
		String expectedPercetnage="12";
		nonRetirement.inputPercentage(expectedPercetnage);
		//	assets.inputAddress("122002");
		String expectedCharityPhoneNum="7782734833";
		util.holdOn(Duration.ofSeconds(4));
		nonRetirement.inputCharityPhoneNumber(expectedCharityPhoneNum);
		String expectedCharityEmail="sohancharity2983@maildrop.cc";
		util.holdOn(Duration.ofSeconds(1));
		nonRetirement.inputCharityEmail(expectedCharityEmail);
		util.holdOn(Duration.ofSeconds(1));
		nonRetirement.clickCharitySaveButton();
		util.holdOn(Duration.ofSeconds(1));
		nonRetirement.openDocumentUploadAccordian();
		assets.uploadFile();
		assets.clickSaveContinueLaterButton();
		assets.waitUntilNon_RetirementTableIsPresentInUI(40);
		nonRetirement.clickSavingAccountEditIcon();
		util.holdOn(Duration.ofSeconds(3));
		String actualTypeOfAssetSelectOption=	nonRetirement.getTypeOfAssetDropDownSelectedOption();
		String actualNameOfInstitutionValue=	nonRetirement.getNameOfInstitutionInputValue();
		String actualBalance=nonRetirement.getBalanceInputValue();
		String actualOwnerSelectedText=  nonRetirement.getOwnerSelectedText();
		String actualAccountNumberText= nonRetirement.getAccountNumberInputValue();
		nonRetirement.openAddressAccordian();
		util.holdOn(Duration.ofSeconds(1));
		String actualPhoneNo=	assets.getPhoneNumberInputText();
		String acutalEmail=		assets.getEmailInputText();
		nonRetirement.openBeneficiaryAccordian();
		nonRetirement.clickEditCharityButton();
		nonRetirement.waitUntilCharityModalIsOpen(10);
		util.holdOn(Duration.ofSeconds(3));
		String actualCharityName=	nonRetirement.getCharityInputName();
		String actualCharityPercentage=	nonRetirement.getCharityPercentageInputText();
		util.holdOn(Duration.ofSeconds(2));
		String actualCharityInputPhoneNumber=	nonRetirement.getCharityInputPhoneNumber();
		String acutalCharityEmail=	nonRetirement.getCharityInputEmail();
		nonRetirement.clickCharityCancelButton();
		util.verifyActualExpectedText(actualTypeOfAssetSelectOption,"Checking/Saving Account" ,"Type Of Assets" );
		util.verifyActualExpectedText(actualNameOfInstitutionValue,expectedNameOfInstituion , "Name of institution");
		util.verifyActualExpectedText(actualBalance,expectedBalance , "Balance");
		util.verifyActualExpectedText(actualOwnerSelectedText,"Joint" , "Owner");
		util.verifyActualExpectedText(actualAccountNumberText,expectedAccountNumber , "Account Number");
		util.verifyActualExpectedText(actualPhoneNo,expectedPhoneNumber , "Phone Number");
		util.verifyActualExpectedText(acutalEmail,expectedEmail , "Email");
		util.verifyActualExpectedText(actualCharityName,expectedCharityName , "Charity Name");
		util.verifyActualExpectedText(actualCharityPercentage,expectedPercetnage , "Charity Percentage");
		util.verifyActualExpectedText(actualCharityInputPhoneNumber,expectedCharityPhoneNum , "Charity Phone Number");
		util.verifyActualExpectedText(expectedCharityEmail,acutalCharityEmail , "Charity Email");
		common.clickPreviousButton();

	}

	@Test(priority=2)
	public void FTC02_Non_RetirementSaveAddAnotherButton() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		CommonCode common=		new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets=	new AssetsCommonCode(util);
		assets.clickNon_RetirementSideBarLink();
		assets.clickAddAssetButton();
		Non_Retirement_And_RetirementPage nonRetirement=	new Non_Retirement_And_RetirementPage(util);
		nonRetirement.selectMoneyMarketFundAssets();
		String expectedNameOfInstituion="Bank of America";
		nonRetirement.inputNameOfInstituion(expectedNameOfInstituion);
		String expectedBalance="984394";
		nonRetirement.inputBalance(expectedBalance);
		nonRetirement.selectOwnerAsJoint();
		String expectedAccountNumber="8733";
		nonRetirement.inputAccountNumber(expectedAccountNumber);
		nonRetirement.openAddressAccordian();
		String expectedPhoneNumber="8745874854";
		assets.inputPhoneNumber(expectedPhoneNumber);
		String expectedEmail="skassetsofusa@maildrop.cc";
		assets.inputEmail(expectedEmail);
		nonRetirement.openBeneficiaryAccordian();
		nonRetirement.clickAddCharityButton();
		util.holdOn(Duration.ofSeconds(5));
		String expectedCharityName="Sohan Charity";
		nonRetirement.inputCharityNameTB(expectedCharityName);
		String expectedPercetnage="12";
		nonRetirement.inputPercentage(expectedPercetnage);
		String expectedCharityPhoneNum="7782734833";
		util.holdOn(Duration.ofSeconds(4));
		nonRetirement.inputCharityPhoneNumber(expectedCharityPhoneNum);
		String expectedCharityEmail="sohancharity2983@maildrop.cc";
		util.holdOn(Duration.ofSeconds(1));
		nonRetirement.inputCharityEmail(expectedCharityEmail);
		util.holdOn(Duration.ofSeconds(1));
		nonRetirement.clickCharitySaveButton();
		util.holdOn(Duration.ofSeconds(1));
		nonRetirement.openDocumentUploadAccordian();
		assets.uploadFile();
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisHide();
		assets.waitUntilPreviousButtonIsShown();
		common.clickPreviousButton();
		assets.waitUntilNon_RetirementTableIsPresentInUI(20);
		nonRetirement.clickMoneyMarketEditIcon();
		util.holdOn(Duration.ofSeconds(3));
		String actualTypeOfAssetSelectOption=	nonRetirement.getTypeOfAssetDropDownSelectedOption();
		String actualNameOfInstitutionValue=	nonRetirement.getNameOfInstitutionInputValue();
		String actualBalance=nonRetirement.getBalanceInputValue();
		String actualOwnerSelectedText=  nonRetirement.getOwnerSelectedText();
		String actualAccountNumberText= nonRetirement.getAccountNumberInputValue();
		nonRetirement.openAddressAccordian();
		util.holdOn(Duration.ofSeconds(1));
		String actualPhoneNo=	assets.getPhoneNumberInputText();
		String acutalEmail=		assets.getEmailInputText();
		util.holdOn(Duration.ofSeconds(3));
		nonRetirement.openBeneficiaryAccordian();
		nonRetirement.clickEditCharityButton();
		nonRetirement.waitUntilCharityModalIsOpen(10);
		util.holdOn(Duration.ofSeconds(3));
		String actualCharityName=	nonRetirement.getCharityInputName();
		String actualCharityPercentage=	nonRetirement.getCharityPercentageInputText();
		util.holdOn(Duration.ofSeconds(2));
		nonRetirement.waitUntilCharityModalIsOpen(10);
		String actualCharityInputPhoneNumber=	nonRetirement.getCharityInputPhoneNumber();
		String acutalCharityEmail=	nonRetirement.getCharityInputEmail();
		nonRetirement.clickCharityCancelButton();
		util.verifyActualExpectedText(actualTypeOfAssetSelectOption,"Money Market fund" ,"Type Of Assets" );
		util.verifyActualExpectedText(actualNameOfInstitutionValue,expectedNameOfInstituion , "Name of institution");
		util.verifyActualExpectedText(actualBalance,expectedBalance , "Balance");
		util.verifyActualExpectedText(actualOwnerSelectedText,"Joint" , "Owner");
		util.verifyActualExpectedText(actualAccountNumberText,expectedAccountNumber , "Account Number");
		util.verifyActualExpectedText(actualPhoneNo,expectedPhoneNumber , "Phone Number");
		util.verifyActualExpectedText(acutalEmail,expectedEmail , "Email");
		util.verifyActualExpectedText(actualCharityName,expectedCharityName , "Charity Name");
		util.verifyActualExpectedText(actualCharityPercentage,expectedPercetnage , "Charity Percentage");
		util.verifyActualExpectedText(actualCharityInputPhoneNumber,expectedCharityPhoneNum , "Charity Phone Number");
		util.verifyActualExpectedText(expectedCharityEmail,acutalCharityEmail , "Charity Email");
	}

	@Test(priority=3)
	public void FTC03_Non_RetirementSaveAddProceedToRetirementButton() {

		LpoLandingPage lpo=	new LpoLandingPage(util);
		CommonCode common=		new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets=	new AssetsCommonCode(util);
		assets.clickNon_RetirementSideBarLink();
		assets.clickAddAssetButton();
		Non_Retirement_And_RetirementPage nonRetirement=	new Non_Retirement_And_RetirementPage(util);
		nonRetirement.selectOtherTypeOfAssets();
		String expectedNameOfInstituion="Bank of USA";
		nonRetirement.inputNameOfInstituion(expectedNameOfInstituion);
		String expectedOtherTextValue="Sk assets";
		nonRetirement.inputOtherDescription(expectedOtherTextValue);
		String expectedBalance="87454";
		nonRetirement.inputBalance(expectedBalance);
		nonRetirement.selectOwnerAsJoint();
		String expectedAccountNumber="9987";
		nonRetirement.inputAccountNumber(expectedAccountNumber);
		nonRetirement.openAddressAccordian();
		String expectedPhoneNumber="9958764454";
		assets.inputPhoneNumber(expectedPhoneNumber);
		String expectedEmail="americanassets@maildrop.cc";
		assets.inputEmail(expectedEmail);
		nonRetirement.openBeneficiaryAccordian();
		nonRetirement.clickAddCharityButton();
		util.holdOn(Duration.ofSeconds(5));
		String expectedCharityName="Sohan Charity";
		nonRetirement.inputCharityNameTB(expectedCharityName);
		String expectedPercetnage="12";
		nonRetirement.inputPercentage(expectedPercetnage);
		String expectedCharityPhoneNum="7782734833";
		util.holdOn(Duration.ofSeconds(4));
		nonRetirement.inputCharityPhoneNumber(expectedCharityPhoneNum);
		String expectedCharityEmail="sohancharity2983@maildrop.cc";
		util.holdOn(Duration.ofSeconds(1));
		nonRetirement.inputCharityEmail(expectedCharityEmail);
		util.holdOn(Duration.ofSeconds(1));
		nonRetirement.clickCharitySaveButton();
		nonRetirement.openDocumentUploadAccordian();
		assets.uploadFile();
		nonRetirement.clickNextRetirementButton();
		util.holdOn(Duration.ofSeconds(2));
		assets.waitUntilAddAssetsButtonIsShown();
		common.waitUntilToasterMessageisHide();
		assets.clickNon_RetirementSideBarLink();
		assets.waitUntilNon_RetirementTableIsPresentInUI(40);
		nonRetirement.clickBankOfUsaEditIcon();
		util.holdOn(Duration.ofSeconds(5));
		String actualTypeOfAssetSelectOption=	nonRetirement.getTypeOfAssetDropDownSelectedOption();
		String	actualOtherTextBoxValue=	nonRetirement.getOtherTextBoxInputValue();
		String actualNameOfInstitutionValue=	nonRetirement.getNameOfInstitutionInputValue();
		String actualBalance=nonRetirement.getBalanceInputValue();
		String actualOwnerSelectedText=  nonRetirement.getOwnerSelectedText();
		String actualAccountNumberText= nonRetirement.getAccountNumberInputValue();
		nonRetirement.openAddressAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualPhoneNo=	assets.getPhoneNumberInputText();
		String acutalEmail=		assets.getEmailInputText();
		nonRetirement.openBeneficiaryAccordian();
		nonRetirement.clickEditCharityButton();
		nonRetirement.waitUntilCharityModalIsOpen(10);
		util.holdOn(Duration.ofSeconds(3));
		String actualCharityName=	nonRetirement.getCharityInputName();
		String actualCharityPercentage=	nonRetirement.getCharityPercentageInputText();
		util.holdOn(Duration.ofSeconds(5));
		String actualCharityInputPhoneNumber=	nonRetirement.getCharityInputPhoneNumber();
		String acutalCharityEmail=	nonRetirement.getCharityInputEmail();
		nonRetirement.clickCharityCancelButton();
		util.verifyActualExpectedText(actualTypeOfAssetSelectOption,"Other" ,"Type Of Assets" );
		util.verifyActualExpectedText(actualOtherTextBoxValue, expectedOtherTextValue, "Other Text Box");
		util.verifyActualExpectedText(actualNameOfInstitutionValue,expectedNameOfInstituion , "Name of institution");
		util.verifyActualExpectedText(actualBalance,expectedBalance , "Balance");
		util.verifyActualExpectedText(actualOwnerSelectedText,"Joint" , "Owner");
		util.verifyActualExpectedText(actualAccountNumberText,expectedAccountNumber , "Account Number");
		util.verifyActualExpectedText(actualPhoneNo,expectedPhoneNumber , "Phone Number");
		util.verifyActualExpectedText(acutalEmail,expectedEmail , "Email");
		util.verifyActualExpectedText(actualCharityName,expectedCharityName , "Charity Name");
		util.verifyActualExpectedText(actualCharityPercentage,expectedPercetnage , "Charity Percentage");
		util.verifyActualExpectedText(actualCharityInputPhoneNumber,expectedCharityPhoneNum , "Charity Phone Number");
		util.verifyActualExpectedText(expectedCharityEmail,acutalCharityEmail , "Charity Email");
		common.clickPreviousButton();
	}

 




}
