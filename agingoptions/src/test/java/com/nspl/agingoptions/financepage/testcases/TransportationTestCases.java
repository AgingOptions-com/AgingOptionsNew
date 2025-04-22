package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.Liabilities;
import com.agingoptions.finance.TransportAssets;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class TransportationTestCases extends BaseTest {

	@Test(priority  =1)
	public void FTC_013_TransportationSaveContinueLaterButton() {

		CommonCode common=   new CommonCode(util);
		LpoLandingPage lpo = new LpoLandingPage(util);
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickAssetsSideBarLink();
		assets.clickTransportAssetsSideBarLink();
		TransportAssets transport=	new TransportAssets(util);
		transport.clickAddTransportButton();
		transport.clickAutoRadioButton();
		transport.openAutoInformationAccordian();
		transport.select2010FromYearMadeDropDown();
		String expectedMake="TATA";
		transport.inputMake(expectedMake);
		String expectedModelNum="MODELNUM3483948";
		transport.inputModelNum(expectedModelNum);
		String expectedValue="24234";
		transport.inputValueTB(expectedValue);
		String expectedColor="Red";
		transport.inputColorTB(expectedColor);
		String expectedLicensePlate="LICENSEPLATE92834";
		transport.inputLicense(expectedLicensePlate);
		String expectedVinNum="VINNUM934839";
		transport.inputVin(expectedVinNum);
		String expectedVehicalRegistration="10-11-2030";
		transport.inputVehicalRegistrationExpiryDate(expectedVehicalRegistration);
		transport.openOwnershipLoanAccordian();
		assets.selectOwnerAsJoint();
		transport.clickOwnedRadioButton();
		transport.clickIsThereALoanYesRadioButton();
		transport.openLoanDetailsAccordian();
		String expectedNameOfCompany="Agingoptions";
		transport.inputNameOfCompany(expectedNameOfCompany);
		String expectedInterestRate="12";
		transport.inputInterestRate(expectedInterestRate);
		String expectedMonthlyAmount="35345";
		transport.inputMonthlyAmount(expectedMonthlyAmount);
		String expectedOutstandigBalance="36456";
		transport.inputOutstandingBalance(expectedOutstandigBalance);
		String expectedLoanNumber="LOAN9284923";
		transport.inputLoanNumber(expectedLoanNumber);
		String expectedPayOffDate="12-11-2029";
		transport.inputPayOffDate(expectedPayOffDate);
		transport.openLoanCompanyContactAddressAccordian();
		assets.inputAddress("122002");
		assets.selectPrimaryPhoneNumberOptions();
		String expectedPhoneNum="9859348594";
		assets.inputPhoneNumber(expectedPhoneNum);
		String expectedEmail="testtransportation@maildrop.cc";
		assets.inputEmail(expectedEmail);
		assets.openDocumentUploadAccoridian();
		assets.uploadFile();
		common.clickSaveContinueLaterButton();
		common.waitUntilToasterMessageisSeen();
		transport.clickAutoEditIcon();
		transport.openAutoInformationAccordian();
		util.holdOn(Duration.ofSeconds(5));
		String actualYearMadeText=      transport.getYearMadeSelectedText();
		String actualMakeText=transport.getMakeInputText();
		String actualModelNumText=    transport.getModelInputText();
		String actualValueInputText= transport.getValueInputText();
		String actualColorInputText= transport.getColorInputText();
		String actualLicensePlateText=transport.getLicensePlateInputText();
		String actualVinNoInputText=        transport.getVINNoInputText();
		String acutalVehicalRegistrationExpiryDate=     transport.getVehicalRegistrationInputText();
		transport.openOwnershipLoanAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualOwnerSelectedText=	assets.getOwnerSelectedText();
		transport.openLoanDetailsAccordian();
		String actualNameOfCompany=      transport.getNameOfCompanyInputText();
		String actualInterestRate=  transport.getInterestRateInputText();
		String actualMonthlyAmountText=        transport.getMonthlyAmountInputText();
		String actualOutstandingBalance=     transport.getOutstandingBalanceInputText();
		String actualPayOffDate=  transport.getPayOffDateInputText();
		String actualLoanNoText=    transport.getLoanNoInputText();
		transport.openLoanCompanyContactAddressAccordian();
		Liabilities liability=      new Liabilities(util);
		util.holdOn(Duration.ofSeconds(2));
		String actualPhysicalAddressText=	liability.getPhysicalAddressText();
		String actualPrimaryContactText=	liability.getPrimaryContactText();
		util.verifyActualExpectedText(actualYearMadeText,"2010","Year Made" );
		util.verifyActualExpectedText(actualMakeText,expectedMake,"Make");
		util.verifyActualExpectedText(actualModelNumText,expectedModelNum,"Model");
		util.verifyActualExpectedText(actualValueInputText,expectedValue,"Value");
		util.verifyActualExpectedText(actualColorInputText,expectedColor,"Color");
		util.verifyActualExpectedText(actualLicensePlateText,expectedLicensePlate,"License Plate");
		util.verifyActualExpectedText(actualVinNoInputText,expectedVinNum,"VIN No.");
		util.verifyActualExpectedText(acutalVehicalRegistrationExpiryDate,expectedVehicalRegistration,"Vehical registration expiry date");
		util.verifyActualExpectedText(actualOwnerSelectedText, "Joint", "Owner");
		util.verifyActualExpectedText(actualNameOfCompany, expectedNameOfCompany, "Name Of Company");
		util.verifyActualExpectedText(actualInterestRate, expectedInterestRate, "Interest Rate");
		util.verifyActualExpectedText(actualMonthlyAmountText, expectedMonthlyAmount, "Monthly Amount");
		util.verifyActualExpectedText(actualOutstandingBalance, expectedOutstandigBalance, "Out Standing Balance");
		util.verifyActualExpectedText(actualPayOffDate, expectedPayOffDate, "Pay Off Date");
		util.verifyActualExpectedText(actualLoanNoText, expectedLoanNumber, "Loan Number");
		util.verifyActualExpectedText(actualPhysicalAddressText, "Physical Address", "Address");
		util.verifyActualExpectedText(actualPrimaryContactText, "Primary contact", "Contact");
		common.clickPreviousButton();
		assets.clickLiabilitiesSideBarLink();
		liability.clickAgingOptionsEditIcon();
		util.holdOn(Duration.ofSeconds(2));
		String actualTypeOfLiabilitiesText=	liability.getTypeOfLiabilitesSelectedText();
		String actualSubTypeOfLiabilitiesText=liability.getSubTypeOfLiabilitesSelectedText();
		String acutalNameOfLenderText=	liability.getNameOfLenderInputText();
		String actualLiabilityPayOffDate=  liability.getPayOffDate();
		String actualLiabilityOutStandingBalance=  liability.getOutstandingBalanceInputText();
		String actualLiabilityMonthlyAmount= 	liability.getMonthlyAmountInputText();
		liability.openLenderContactAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualLiabilityPhysicalAddressText=   liability.getPhysicalAddressText();
		String actualLiabilityPrimaryContactText=   liability.getPrimaryContactText();
		util.verifyActualExpectedText(actualTypeOfLiabilitiesText,"Transport Assets" , "Types of liabilities*");
		util.verifyActualExpectedText(actualSubTypeOfLiabilitiesText,"Auto Loan" , "Sub-types of liabilities*");
		util.verifyActualExpectedText(acutalNameOfLenderText,expectedNameOfCompany , "Name of lender*");
		util.verifyActualExpectedText(actualLiabilityPayOffDate,expectedPayOffDate , "PayOff Date");
		util.verifyActualExpectedText(actualLiabilityOutStandingBalance,expectedOutstandigBalance , "OutStanding Balance");
		util.verifyActualExpectedText(actualLiabilityMonthlyAmount,expectedMonthlyAmount , "Monthly Amount");
		util.verifyActualExpectedText(actualLiabilityPhysicalAddressText, "Physical Address", "Address");
		util.verifyActualExpectedText(actualLiabilityPrimaryContactText, "Primary contact", "Contact");
		common.clickPreviousButton();
	}




}
