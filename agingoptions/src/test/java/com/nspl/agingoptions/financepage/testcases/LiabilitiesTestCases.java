package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.Liabilities;
import com.agingoptions.finance.RealEstatePage;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class LiabilitiesTestCases extends BaseTest{


	@Test(priority=1)
	public void  FTC_029_LiabilitiesSaveContinueLaterButton() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickAssetsSideBarLink();
		assets.clickLiabilitiesSideBarLink();
		Liabilities liability=	new Liabilities(util);
		liability.clickAddLiabilityButton();
		liability.selectCreditCardTypeOfLiabilities();
		RealEstatePage realEstate=	new RealEstatePage(util);
		String expectedNameOfLender="MKS9348";
		realEstate.inputNameOfLender(expectedNameOfLender);
		String expectedPayOffDate="12-18-2027";
		realEstate.inputPayOffDate(expectedPayOffDate);
		String expectedOutStandingBalance="92384";
		realEstate.inputOutstandingBalance(expectedOutStandingBalance);
		String expectedMonthlyAmount="29384";
		realEstate.inputMonthlyAmount(expectedMonthlyAmount);
		util.holdOn(Duration.ofSeconds(3));
		liability.openLenderContactAddressInfoAccordian();
		common.selectPhysicalAddressFromAddressType();
		assets.inputAddress("122002");
		assets.selectPrimaryPhoneNumberOptions();
		String expectedPhoneNumber="9438539458";
		assets.inputPhoneNumber(expectedPhoneNumber);
		String expectedEmail="nkjhak3498@maildrop.cc";
		assets.inputEmail(expectedEmail);
		assets.clickSaveContinueLaterButton();
		liability.clickCreditCardEditIcon();
		String actualTypeOfLiabilitiesSelectedText=	liability.getTypeOfLiabilitiesSelectedText();
		String actualNameOfLenderText=	realEstate.getNameOfLenderInputText();
		String actualPayOffDate=	liability.getPayOffDate();
		String actualOutStandingBalance=	liability.getOutstandingBalanceInputText();
		String actualMonthlyAmount=	liability.getMonthlyAmountInputText();
		liability.openLenderContactAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(1));
		String actualPrimaryContactText=	liability.getPrimaryContactText();
		String actualPhysicalText=	liability.getPhysicalAddressText();
		util.verifyActualExpectedText(actualTypeOfLiabilitiesSelectedText, "Credit Cards","Type Of Liabilities" );
		util.verifyActualExpectedText(actualNameOfLenderText,expectedNameOfLender ,"Name Of Lender" );
		util.verifyActualExpectedText(expectedPayOffDate,actualPayOffDate ,"PayOff Date" );
		util.verifyActualExpectedText(expectedOutStandingBalance,actualOutStandingBalance ,"Out Standing Balance" );
		util.verifyActualExpectedText(expectedMonthlyAmount,actualMonthlyAmount ,"Monthly Amount" );
		util.verifyActualExpectedText(actualPrimaryContactText,"Primary contact" ,"Primary Contact" );
		util.verifyActualExpectedText(actualPhysicalText,"Physical Address" ,"Physical Address" );
		common.clickPreviousButton();
	}

	@Test(priority = 2, enabled =true)
	public void  FTC_030_LiabilitiesSaveAddAnotherButton() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickAssetsSideBarLink();
		assets.clickLiabilitiesSideBarLink();
		Liabilities liability=	new Liabilities(util);
		liability.clickAddLiabilityButton();
		liability.selectOtherTypeOfLiabilities();
		String expectedTypeOfLiabilitiesOtherTextBoxValue="Legal responsibility";
		liability.inputTypeOfLiabilitiesOtherTextBoxValue(expectedTypeOfLiabilitiesOtherTextBoxValue);
		RealEstatePage realEstate=	new RealEstatePage(util);
		String expectedNameOfLender="SK98924823";
		realEstate.inputNameOfLender(expectedNameOfLender);
		String expectedPayOffDate="11-22-2026";
		realEstate.inputPayOffDate(expectedPayOffDate);
		String expectedOutStandingBalance="678564";
		realEstate.inputOutstandingBalance(expectedOutStandingBalance);
		String expectedMonthlyAmount="56784";
		realEstate.inputMonthlyAmount(expectedMonthlyAmount);
		util.holdOn(Duration.ofSeconds(3));
		liability.openLenderContactAddressInfoAccordian();
		assets.selectPrimaryPhoneNumberOptions();
		String expectedPhoneNumber="8798674565";
		assets.inputPhoneNumber(expectedPhoneNumber);
		String expectedEmail="nkj5345345@maildrop.cc";
		assets.inputEmail(expectedEmail);
		util.holdOn(Duration.ofSeconds(1));
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		util.holdOn(Duration.ofSeconds(4));
		common.clickPreviousButton();
		liability.clickLegalResponsibilityEditIcon();
		util.holdOn(Duration.ofSeconds(4));
		String actualTypeOfLiabilitiesSelectedText=	liability.getTypeOfLiabilitiesSelectedText();
		String actualNameOfLenderText=	realEstate.getNameOfLenderInputText();
		String actualPayOffDate=	liability.getPayOffDate();
		String actualOutStandingBalance=	liability.getOutstandingBalanceInputText();
		String actualMonthlyAmount=	liability.getMonthlyAmountInputText();
		String actualTypeOfLiabilityOtherValue=	liability.getOtherTypeOfLiabilityTextBoxValue();
		liability.openLenderContactAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualPrimaryContactText=	liability.getPrimaryContactText();
		util.verifyActualExpectedText(actualTypeOfLiabilitiesSelectedText, "Other","Type Of Liabilities" );
		util.verifyActualExpectedText(actualNameOfLenderText,expectedNameOfLender ,"Name Of Lender" );
		util.verifyActualExpectedText(actualTypeOfLiabilityOtherValue,expectedTypeOfLiabilitiesOtherTextBoxValue ,"Type Of Liability Other Text Box" );
		util.verifyActualExpectedText(expectedPayOffDate,actualPayOffDate ,"PayOff Date" );
		util.verifyActualExpectedText(expectedOutStandingBalance,actualOutStandingBalance ,"Out Standing Balance" );
		util.verifyActualExpectedText(expectedMonthlyAmount,actualMonthlyAmount ,"Monthly Amount" );
		util.verifyActualExpectedText(actualPrimaryContactText,"Primary contact" ,"Primary Contact" );
		common.clickPreviousButton();
	}

	@Test(priority=3)
	public void  FTC_031_LiabilitiesSaveAndProceedToIncomeButton() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickAssetsSideBarLink();
		assets.clickLiabilitiesSideBarLink();
		Liabilities liability=	new Liabilities(util);
		liability.clickAddLiabilityButton();
		liability.selectStudentLoanTypeOfLiabilities();
		RealEstatePage realEstate=	new RealEstatePage(util);
		String expectedNameOfLender="LAKS9384";
		realEstate.inputNameOfLender(expectedNameOfLender);
		String expectedPayOffDate="12-18-2026";
		realEstate.inputPayOffDate(expectedPayOffDate);
		String expectedOutStandingBalance="5675";
		realEstate.inputOutstandingBalance(expectedOutStandingBalance);
		String expectedMonthlyAmount="96765";
		realEstate.inputMonthlyAmount(expectedMonthlyAmount);
		util.holdOn(Duration.ofSeconds(3));
		liability.openLenderContactAddressInfoAccordian();
		assets.selectPrimaryPhoneNumberOptions();
		String expectedPhoneNumber="9856958556";
		assets.inputPhoneNumber(expectedPhoneNumber);
		String expectedEmail="alskdjfalkdf@maildrop.cc";
		assets.inputEmail(expectedEmail);
		liability.clickSaveProceedToIncomeButton();
		common.waitUntilToasterMessageisSeen();
		assets.clickLiabilitiesSideBarLink();
		util.holdOn(Duration.ofSeconds(4));
		liability.clickStudentLoanEditIcon();
		String actualTypeOfLiabilitiesSelectedText=	liability.getTypeOfLiabilitiesSelectedText();
		String actualNameOfLenderText=	realEstate.getNameOfLenderInputText();
		String actualPayOffDate=	liability.getPayOffDate();
		String actualOutStandingBalance=	liability.getOutstandingBalanceInputText();
		String actualMonthlyAmount=	liability.getMonthlyAmountInputText();
		liability.openLenderContactAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(1));
		String actualPrimaryContactText=	liability.getPrimaryContactText();
		util.verifyActualExpectedText(actualTypeOfLiabilitiesSelectedText, "Student Loan","Type Of Liabilities" );
		util.verifyActualExpectedText(actualNameOfLenderText,expectedNameOfLender ,"Name Of Lender" );
		util.verifyActualExpectedText(expectedPayOffDate,actualPayOffDate ,"PayOff Date" );
		util.verifyActualExpectedText(expectedOutStandingBalance,actualOutStandingBalance ,"Out Standing Balance" );
		util.verifyActualExpectedText(expectedMonthlyAmount,actualMonthlyAmount ,"Monthly Amount" );
		util.verifyActualExpectedText(actualPrimaryContactText,"Primary contact" ,"Primary Contact" );
		common.clickPreviousButton();
	}

}
