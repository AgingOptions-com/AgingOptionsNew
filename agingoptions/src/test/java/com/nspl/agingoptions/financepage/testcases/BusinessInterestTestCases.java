package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.BusinessInterest;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class BusinessInterestTestCases extends BaseTest {

	@Test(priority=1)
	public void FTC_010_BusinessInterestSaveContinueLaterButton() {
		CommonCode common=   new CommonCode(util);
		LpoLandingPage lpo = new LpoLandingPage(util);
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickAssetsSideBarLink();
		assets.clickBusinessInterestSideBarLink();
		BusinessInterest bussinessInt=	new BusinessInterest(util);
		bussinessInt.clickAddBusinessButton();
		String expectedNameOfBusines="BrightPath Solutions";
		bussinessInt.inputNameOfBusiness(expectedNameOfBusines);
		bussinessInt.selectSoloProProprietorshipBusinessType();
		String expectedBusinessStartDate="11-19-2020";
		common.inputInsuranceStartDate(expectedBusinessStartDate);
		String expectedEstimatedMarketValue="9843"	;
		bussinessInt.inputEstimatedMarketValue(expectedEstimatedMarketValue);
		String expectedUbiNumber="UBUIN384334";
		bussinessInt.inputUBINumber(expectedUbiNumber);
		String expectedFederalTax="FDRL39843";
		bussinessInt.inputFederalTax(expectedFederalTax);
		String expectedBusinessDescriptionText="Generic Business Description  is a sole proprietorship committed to delivering high-quality and reliable services tailored to meet individual client needs.";
		bussinessInt.inputBusinessDescription(expectedBusinessDescriptionText);
		bussinessInt.openBusinessAddressAccordian();
		assets.inputAddress("122001");
		bussinessInt.openOwnerCoOwnerAccordian();
		String expectedOwnerOrCoOwner="Aditya Kapoor";
		bussinessInt.inputOwnerCoOnwer(expectedOwnerOrCoOwner);
		bussinessInt.openBusinessAddressAccordian();
		assets.openDocumentUploadAccoridian();
		assets.uploadFile();
		common.clickSaveContinueLaterButton();
		bussinessInt.clickSoleProperietorshipEditIcon();
		String actualNameOfBusiness=		bussinessInt.getNameOfBussinesInputText();
		String actualBusinessTypeSelectedText=	bussinessInt.getBusinessTypeSelectedText();
		String actualCoverageStartDate=	common.getCoverageStartInputText();
		String actualEstimatedMarketValue=	bussinessInt.getEstimatedMarketValue();
		String acutalUbiNumber=	bussinessInt.getUBINumberValue();
		String actualFederalTax=	bussinessInt.getFederalTaxIdValue();
		String actualBusinessDescription=	bussinessInt.getBusinessDescriptionTB();
		bussinessInt.openOwnerCoOwnerAccordian();
		String actualOwnerCoOwnerText=	bussinessInt.getOwnerCoOwnerInputText();
		util.verifyActualExpectedText(expectedNameOfBusines,actualNameOfBusiness , "Name of Business*");
		util.verifyActualExpectedText(actualBusinessTypeSelectedText,"Sole Proprietorship" , "Business Type*");
		util.verifyActualExpectedText(actualCoverageStartDate,expectedBusinessStartDate , "Start date");
		util.verifyActualExpectedText(actualEstimatedMarketValue,expectedEstimatedMarketValue , "Estimated market value");
		util.verifyActualExpectedText(acutalUbiNumber,expectedUbiNumber , "UBI number");
		util.verifyActualExpectedText(actualFederalTax, expectedFederalTax, "Federal tax ID no");
		util.verifyActualExpectedTextContains(actualBusinessDescription, expectedBusinessDescriptionText, "Business description");
		util.verifyActualExpectedText(actualOwnerCoOwnerText, expectedOwnerOrCoOwner, "Owner(S) & Co-Owner(S)");
		common.clickPreviousButton();
	}

	@Test(priority=2)
	public void FTC_011_BusinessInterestSaveAddAnotherButton() {
		CommonCode common=   new CommonCode(util);
		LpoLandingPage lpo = new LpoLandingPage(util);
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickAssetsSideBarLink();
		assets.clickBusinessInterestSideBarLink();
		BusinessInterest bussinessInt=	new BusinessInterest(util);
		bussinessInt.clickAddBusinessButton();
		String expectedNameOfBusines="NextGen Ventures";
		bussinessInt.inputNameOfBusiness(expectedNameOfBusines);
		bussinessInt.selectPartnershipBusinessType();
		String expectedBusinessStartDate="10-10-2019";
		common.inputInsuranceStartDate(expectedBusinessStartDate);
		String expectedEstimatedMarketValue="98765"	;
		bussinessInt.inputEstimatedMarketValue(expectedEstimatedMarketValue);
		String expectedUbiNumber="UBINUM3984";
		bussinessInt.inputUBINumber(expectedUbiNumber);
		String expectedFederalTax="FDLRGH9384";
		bussinessInt.inputFederalTax(expectedFederalTax);
		String expectedBusinessDescriptionText="For a Local Service Provider (e.g., repair, salon, coaching)";
		bussinessInt.inputBusinessDescription(expectedBusinessDescriptionText);
		bussinessInt.openBusinessAddressAccordian();
		assets.inputAddress("122001");
		bussinessInt.openOwnerCoOwnerAccordian();
		String expectedOwnerOrCoOwner="Aakash Jain";
		bussinessInt.inputOwnerCoOnwer(expectedOwnerOrCoOwner);
		assets.openDocumentUploadAccoridian();
		assets.uploadFile();
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		common.clickPreviousButton();
		bussinessInt.clickPartnershipEditIcon();
		String actualNameOfBusiness=		bussinessInt.getNameOfBussinesInputText();
		String actualBusinessTypeSelectedText=	bussinessInt.getBusinessTypeSelectedText();
		String actualCoverageStartDate=	common.getCoverageStartInputText();
		String actualEstimatedMarketValue=	bussinessInt.getEstimatedMarketValue();
		String acutalUbiNumber=	bussinessInt.getUBINumberValue();
		String actualFederalTax=	bussinessInt.getFederalTaxIdValue();
		String actualBusinessDescription=	bussinessInt.getBusinessDescriptionTB();
		bussinessInt.openOwnerCoOwnerAccordian();
		String actualOwnerCoOwnerText=	bussinessInt.getOwnerCoOwnerInputText();
		util.verifyActualExpectedText(expectedNameOfBusines,actualNameOfBusiness , "Name of Business*");
		util.verifyActualExpectedText(actualBusinessTypeSelectedText,"Partnership" , "Business Type*");
		util.verifyActualExpectedText(actualCoverageStartDate,expectedBusinessStartDate , "Start date");
		util.verifyActualExpectedText(actualEstimatedMarketValue,expectedEstimatedMarketValue , "Estimated market value");
		util.verifyActualExpectedText(acutalUbiNumber,expectedUbiNumber , "UBI number");
		util.verifyActualExpectedText(actualFederalTax, expectedFederalTax, "Federal tax ID no");
		util.verifyActualExpectedTextContains(actualBusinessDescription, expectedBusinessDescriptionText, "Business description");
		util.verifyActualExpectedText(actualOwnerCoOwnerText, expectedOwnerOrCoOwner, "Owner(S) & Co-Owner(S)");
		common.clickPreviousButton();
	}

	@Test(priority=3)
	public void FTC_012_BusinessInterestSaveAddAnotherButton() {
		CommonCode common=   new CommonCode(util);
		LpoLandingPage lpo = new LpoLandingPage(util);
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickAssetsSideBarLink();
		assets.clickBusinessInterestSideBarLink();
		BusinessInterest bussinessInt=	new BusinessInterest(util);
		bussinessInt.clickAddBusinessButton();
		String expectedNameOfBusines="Franchise Ventures";
		bussinessInt.inputNameOfBusiness(expectedNameOfBusines);
		String expectedOtherBusinessTB="Nonprofit Organization";
		bussinessInt.selectOtherBusinessType();
		bussinessInt.inputOtherBusinessTypeValue(expectedOtherBusinessTB);
		String expectedBusinessStartDate="10-10-2010";
		common.inputInsuranceStartDate(expectedBusinessStartDate);
		String expectedEstimatedMarketValue="67589"	;
		bussinessInt.inputEstimatedMarketValue(expectedEstimatedMarketValue);
		String expectedUbiNumber="UBNM3489";
		bussinessInt.inputUBINumber(expectedUbiNumber);
		String expectedFederalTax="FLKJD98349";
		bussinessInt.inputFederalTax(expectedFederalTax);
		String expectedBusinessDescriptionText="For a Local Service Provider (e.g., repair, salon, coaching)";
		bussinessInt.inputBusinessDescription(expectedBusinessDescriptionText);
		bussinessInt.openOwnerCoOwnerAccordian();
		String expectedOwnerOrCoOwner="Kiara Mehta";
		bussinessInt.inputOwnerCoOnwer(expectedOwnerOrCoOwner);
		assets.openDocumentUploadAccoridian();
		assets.uploadFile();
		bussinessInt.clickNextTransportationButton();
		common.waitUntilToasterMessageisSeen();
		assets.clickBusinessInterestSideBarLink();
		bussinessInt.clickNonProfitEditIcon();
		String actualNameOfBusiness=		bussinessInt.getNameOfBussinesInputText();
		String actualBusinessTypeSelectedText=	bussinessInt.getBusinessTypeSelectedText();
		String actualCoverageStartDate=	common.getCoverageStartInputText();
		String actualEstimatedMarketValue=	bussinessInt.getEstimatedMarketValue();
		String acutalUbiNumber=	bussinessInt.getUBINumberValue();
		String actualFederalTax=	bussinessInt.getFederalTaxIdValue();
		String actualBusinessDescription=	bussinessInt.getBusinessDescriptionTB();
		util.holdOn(Duration.ofSeconds(3));
		String actualOtherBusinessTextBoxValue=	bussinessInt.getOtherBusinessTypeValue();
		bussinessInt.openOwnerCoOwnerAccordian();
		String actualOwnerCoOwnerText=	bussinessInt.getOwnerCoOwnerInputText();
		util.verifyActualExpectedText(expectedNameOfBusines,actualNameOfBusiness , "Name of Business*");
		util.verifyActualExpectedText(actualBusinessTypeSelectedText,"Other" , "Business Type*");
		util.verifyActualExpectedText(actualOtherBusinessTextBoxValue, expectedOtherBusinessTB, "Other bussiness Text Box");
		util.verifyActualExpectedText(actualCoverageStartDate,expectedBusinessStartDate , "Start date");
		util.verifyActualExpectedText(actualEstimatedMarketValue,expectedEstimatedMarketValue , "Estimated market value");
		util.verifyActualExpectedText(acutalUbiNumber,expectedUbiNumber , "UBI number");
		util.verifyActualExpectedText(actualFederalTax, expectedFederalTax, "Federal tax ID no");
		util.verifyActualExpectedTextContains(actualBusinessDescription, expectedBusinessDescriptionText, "Business description");
		util.verifyActualExpectedText(actualOwnerCoOwnerText, expectedOwnerOrCoOwner, "Owner(S) & Co-Owner(S)");
		common.clickPreviousButton();
		
	}



}
