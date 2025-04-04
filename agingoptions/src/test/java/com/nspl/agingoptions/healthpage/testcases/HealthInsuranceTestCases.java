package com.nspl.agingoptions.healthpage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.health.HealthInsurance;
import com.agingoptions.health.Specialists;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class HealthInsuranceTestCases extends BaseTest {


	@Test(priority=1)
	public void TC_027PrimaryMemberAddHealthInsuranceSaveAndContinueLaterButtonSameAsSpouse() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);

		lpoLanding.clickHealthModule();

		HealthInsurance healthIns=	new HealthInsurance(util);
		util.holdOn(Duration.ofSeconds(5));
		healthIns.clickHealthInsuranceSideBarLink();
		healthIns.clickAddHealthInsuranceButton();
		CommonCode common=	new CommonCode(util);
		common.checkCopySameDataToSpouseCheckBox();
		healthIns.selectMedigapTypeFromInsuranceTypeDropDown();
		healthIns.selectMedigapPlanAOptionsFromSupplementInsurance();
		healthIns.selectAllStateInsGroupFromInsuranceCompanyDD();
		String expectedPolicyName="Indian Health policy";
		healthIns.inputPolicyName(expectedPolicyName);
		String expectedPolicyNumber="POLICY938493849";
		healthIns.inputPolicyNumber(expectedPolicyNumber);
		String expecteGroupNumber="GRPNUM39843";
		healthIns.inputGroupNumber(expecteGroupNumber);
		healthIns.selectSinglePremiumFrequency();
		String expectedPremiumAmount="23423";
		healthIns.inputPremiumAmount(expectedPremiumAmount);
		String actualDeductibleAmount="57567";
		healthIns.inputDeductibleAmount(actualDeductibleAmount);
		String expectedCoPayment="276567";
		healthIns.inputCoPayment(expectedCoPayment);
		String expectedOutOfPocketAmount="78566";
		healthIns.inputOutOfPocketMaximum(expectedOutOfPocketAmount);
		String expectedInsuranceStartDate="11-19-1999";
		healthIns.inputInsuranceStartDate(expectedInsuranceStartDate);
		String expectedInsuranceEndDate="10-17-2024";
		healthIns.inputInsuranceEndDate(expectedInsuranceEndDate);
		healthIns.clickHowAreTheExpensePaidManuallyRadioBT();
		healthIns.clickInPersonRadioButton();
		healthIns.uploadFile();
		common.clickSaveContinueLaterButton();
		util.holdOn(Duration.ofSeconds(3));
		healthIns.waitUntilHealthInsuranceTableIsPresent();
		common.clickSpouseToggleButton();
		String actualTypeOfPlanText=		healthIns.getMedigapInnerText();
		util.verifyActualExpectedText(actualTypeOfPlanText,"Medigap" ,"Medigap Plan");
		common.clickPrimaryMemberToggleButton();
		healthIns.clickMedigapEditIcon();
		String actualHealthInsuranceType=		healthIns.getHealthInsuranceTypeSelectedText();
		String 	actualHealthSupplementInsurance=	healthIns.getSupplementInsuranceTypeSelectedText();
		String actualInsuranceCompany=	healthIns.getInsuranceCompanySelectedText();
		String actualPolicyName=	healthIns.getPolicyNameInputText();
		String actualPolicyNum=	healthIns.getPolicyNumberInputText();
		String actualGroupNum=	healthIns.getGroupNumberInputText();
		String actualPremiumFrequency=	healthIns.getPremiumFrequnecySelectedText();
		String actualPremiumAmount=	healthIns.getPremiumAmountInputText();
		String actualDedcuctableAmount=	healthIns.getDeductableAmountInputText();
		String actualCoPayment=	healthIns.getCoPaymentInputText();
		String actualOutOfPayment=	healthIns.getOutOfPaymentInputText();
		String actualCoverateStart=	healthIns.getCoverageStartInputText();
		String actualCoverageEndDate=healthIns.getCoverageEndInputText();
		util.verifyActualExpectedText(actualHealthInsuranceType,"Medigap" ,"Insurance type" );
		util.verifyActualExpectedText(actualHealthSupplementInsurance,"Medigap Plan A" ,"Supplement insurance");
		util.verifyActualExpectedText(actualInsuranceCompany,"Allstate Ins Group" ,"Insurance company");
		util.verifyActualExpectedText(actualPolicyName,expectedPolicyName ,"Policy Name");
		util.verifyActualExpectedText(actualPolicyNum,expectedPolicyNumber ,"Policy number");
		util.verifyActualExpectedText(actualGroupNum,expecteGroupNumber ,"Group number");
		util.verifyActualExpectedText(actualPremiumFrequency,"Single" ,"Premium Frequency");
		util.verifyActualExpectedText(actualPremiumAmount,expectedPremiumAmount ,"Premium amount");
		util.verifyActualExpectedText(actualDedcuctableAmount,actualDeductibleAmount ,"Deductable amount");
		util.verifyActualExpectedText(actualCoPayment,expectedCoPayment ,"Co Payment");
		util.verifyActualExpectedText(actualOutOfPayment, expectedOutOfPocketAmount,"Out of pocket amount");
		util.verifyActualExpectedText(actualCoverateStart, expectedInsuranceStartDate,"Insurance Start Date");
		util.verifyActualExpectedText(actualCoverageEndDate, expectedInsuranceEndDate,"Coverage end date");


	}

	@Test(priority=2)
	public void TC_028PrimaryMemberAddHealthInsuranceSaveAndAddAnotherButton() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		lpoLanding.clickHealthModule();
		util.refreshPage();
		HealthInsurance healthIns=	new HealthInsurance(util);
		util.holdOn(Duration.ofSeconds(3));
		healthIns.clickHealthInsuranceSideBarLink();
		healthIns.clickAddHealthInsuranceButton();
		CommonCode common=	new CommonCode(util);
		healthIns.selectPrivateTypeInsurance();
		healthIns.selectOtherInsuranceCompany();
		String expectedOtherTextBoxValue="Test Health Insurace";
		healthIns.inputInsuranceCompanyOtherTextBoxValue(expectedOtherTextBoxValue);
		String expectedPolicyName="Rk Hospital Health policy";
		healthIns.inputPolicyName(expectedPolicyName);
		String expectedPolicyNumber="PLC398493";
		healthIns.inputPolicyNumber(expectedPolicyNumber);
		String expecteGroupNumber="GRPN34839";
		healthIns.inputGroupNumber(expecteGroupNumber);
		healthIns.selectSinglePremiumFrequency();
		String expectedPremiumAmount="49837";
		healthIns.inputPremiumAmount(expectedPremiumAmount);
		String actualDeductibleAmount="8376";
		healthIns.inputDeductibleAmount(actualDeductibleAmount);
		String expectedCoPayment="9834";
		healthIns.inputCoPayment(expectedCoPayment);
		String expectedOutOfPocketAmount="938";
		healthIns.inputOutOfPocketMaximum(expectedOutOfPocketAmount);
		String expectedInsuranceStartDate="10-15-2009";
		healthIns.inputInsuranceStartDate(expectedInsuranceStartDate);
		String expectedInsuranceEndDate="10-17-2030";
		healthIns.inputInsuranceEndDate(expectedInsuranceEndDate);
		String actualInsuranceCompanyOtherDescriptionText=healthIns.getInsuranceCompanyOtherDescriptionInputText();
		healthIns.clickHowAreTheExpensePaidAutoPayRadioButton();
		String expectedBankName="Bank Of Baroda";
		healthIns.inputBankName(expectedBankName);
		String expectedAccountNumber="9834587348578";
		healthIns.inputAccountNumber(expectedAccountNumber);
		healthIns.uploadFile();
		common.clickSaveAddAnotherButton();
		new Specialists(util).waitUntilToasterMessageisHide();;
		util.holdOn(Duration.ofSeconds(5));
		common.clickPreviousButton();
		util.holdOn(Duration.ofSeconds(3));
		healthIns.waitUntilHealthInsuranceTableIsPresent();
		common.clickPrimaryMemberToggleButton();
		healthIns.clickPrivateHealthInsurancePlanEditIcon();
		String actualHealthInsuranceType=		healthIns.getHealthInsuranceTypeSelectedText();
		String actualInsuranceCompany=	healthIns.getInsuranceCompanySelectedText();
		String actualPolicyName=	healthIns.getPolicyNameInputText();
		String actualPolicyNum=	healthIns.getPolicyNumberInputText();
		String actualGroupNum=	healthIns.getGroupNumberInputText();
		String actualPremiumFrequency=	healthIns.getPremiumFrequnecySelectedText();
		String actualPremiumAmount=	healthIns.getPremiumAmountInputText();
		String actualDedcuctableAmount=	healthIns.getDeductableAmountInputText();
		String actualCoPayment=	healthIns.getCoPaymentInputText();
		String actualOutOfPayment=	healthIns.getOutOfPaymentInputText();
		String actualCoverateStart=	healthIns.getCoverageStartInputText();
		String actualCoverageEndDate=healthIns.getCoverageEndInputText();
		String actualBankNameText=	healthIns.getInputBankNameText();
		String acutalBankAccountNumberText=	healthIns.getInputBankAccountText();
		util.verifyActualExpectedText(actualHealthInsuranceType,"Private Plan" ,"Insurance type" );
		util.verifyActualExpectedText(actualInsuranceCompany,"Other" ,"Insurance company");
		util.verifyActualExpectedText(actualInsuranceCompanyOtherDescriptionText,expectedOtherTextBoxValue , "Insurance company Other Text Box");
		util.verifyActualExpectedText(actualPolicyName,expectedPolicyName ,"Policy Name");
		util.verifyActualExpectedText(actualPolicyNum,expectedPolicyNumber ,"Policy number");
		util.verifyActualExpectedText(actualGroupNum,expecteGroupNumber ,"Group number");
		util.verifyActualExpectedText(actualPremiumFrequency,"Single" ,"Premium Frequency");
		util.verifyActualExpectedText(actualPremiumAmount,expectedPremiumAmount ,"Premium amount");
		util.verifyActualExpectedText(actualDedcuctableAmount,actualDeductibleAmount ,"Deductable amount");
		util.verifyActualExpectedText(actualCoPayment,expectedCoPayment ,"Co Payment");
		util.verifyActualExpectedText(actualOutOfPayment, expectedOutOfPocketAmount,"Out of pocket amount");
		util.verifyActualExpectedText(actualCoverateStart, expectedInsuranceStartDate,"Insurance Start Date");
		util.verifyActualExpectedText(actualCoverageEndDate, expectedInsuranceEndDate,"Coverage end date");
		util.verifyActualExpectedText(actualBankNameText, expectedBankName, "Bank Name");
		util.verifyActualExpectedText(acutalBankAccountNumberText, expectedAccountNumber, "Enter the Account Number");


	}

	@Test(priority=3)
	public void TC_029PrimaryMemberAddHealthInsuranceSaveAndProceedToSpouseButton() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		util.refreshPage();
		lpoLanding.clickHealthModule();

		HealthInsurance healthIns=	new HealthInsurance(util);
		util.holdOn(Duration.ofSeconds(3));
		healthIns.clickHealthInsuranceSideBarLink();
		healthIns.clickAddHealthInsuranceButton();
		CommonCode common=	new CommonCode(util);
		healthIns.selectOtherFromHealthInsuranceType();
		String expectedInsuranceTypeOtherText="Nk Health Insurance";
		healthIns.inputInsuranceTypeOtherDescription(expectedInsuranceTypeOtherText);
		healthIns.selectAllStateInsGroupFromInsuranceCompanyDD();
		String expectedPolicyName="Nk Hospital Health policy";
		healthIns.inputPolicyName(expectedPolicyName);
		String expectedPolicyNumber="PLC98394";
		healthIns.inputPolicyNumber(expectedPolicyNumber);
		String expecteGroupNumber="KJSD28349238";
		healthIns.inputGroupNumber(expecteGroupNumber);
		healthIns.selectQuaterlyPremiumFrequency();
		String expectedPremiumAmount="34334";
		healthIns.inputPremiumAmount(expectedPremiumAmount);
		String actualDeductibleAmount="67454";
		healthIns.inputDeductibleAmount(actualDeductibleAmount);
		String expectedCoPayment="98678";
		healthIns.inputCoPayment(expectedCoPayment);
		String expectedOutOfPocketAmount="2345";
		healthIns.inputOutOfPocketMaximum(expectedOutOfPocketAmount);
		String expectedInsuranceStartDate="10-15-2006";
		healthIns.inputInsuranceStartDate(expectedInsuranceStartDate);
		String expectedInsuranceEndDate="10-17-2029";
		healthIns.inputInsuranceEndDate(expectedInsuranceEndDate);
		healthIns.uploadFile();
		common.clickSaveAndProceedToSpouseBT();
		new Specialists(util).waitUntilToasterMessageisHide();;
		util.holdOn(Duration.ofSeconds(5));
		healthIns.clickHealthInsuranceSideBarLink();
		util.holdOn(Duration.ofSeconds(3));
		healthIns.waitUntilHealthInsuranceTableIsPresent();
		common.clickPrimaryMemberToggleButton();
		healthIns.clickQuaterlyEditIcon();
		util.holdOn(Duration.ofSeconds(2));
		String actualHealthInsuranceType=		healthIns.getHealthInsuranceTypeSelectedText();
		String exectedTypeOtherText=	healthIns.getTypePlanOtherTextBoxInputText();
		String actualPolicyName=	healthIns.getPolicyNameInputText();
		String actualPolicyNum=	healthIns.getPolicyNumberInputText();
		String actualGroupNum=	healthIns.getGroupNumberInputText();
		String actualPremiumFrequency=	healthIns.getPremiumFrequnecySelectedText();
		String actualPremiumAmount=	healthIns.getPremiumAmountInputText();
		String actualDedcuctableAmount=	healthIns.getDeductableAmountInputText();
		String actualCoPayment=	healthIns.getCoPaymentInputText();
		String actualOutOfPayment=	healthIns.getOutOfPaymentInputText();
		String actualCoverateStart=	healthIns.getCoverageStartInputText();
		String actualCoverageEndDate=healthIns.getCoverageEndInputText();
		util.verifyActualExpectedText(actualHealthInsuranceType,"Other" ,"Insurance type" );
		util.verifyActualExpectedText(exectedTypeOtherText,expectedInsuranceTypeOtherText ,"Insurance type" );
		util.verifyActualExpectedText(actualPolicyName,expectedPolicyName ,"Policy Name");
		util.verifyActualExpectedText(actualPolicyNum,expectedPolicyNumber ,"Policy number");
		util.verifyActualExpectedText(actualGroupNum,expecteGroupNumber ,"Group number");
		util.verifyActualExpectedText(actualPremiumFrequency,"Quaterly" ,"Premium Frequency");
		util.verifyActualExpectedText(actualPremiumAmount,expectedPremiumAmount ,"Premium amount");
		util.verifyActualExpectedText(actualDedcuctableAmount,actualDeductibleAmount ,"Deductable amount");
		util.verifyActualExpectedText(actualCoPayment,expectedCoPayment ,"Co Payment");
		util.verifyActualExpectedText(actualOutOfPayment, expectedOutOfPocketAmount,"Out of pocket amount");
		util.verifyActualExpectedText(actualCoverateStart, expectedInsuranceStartDate,"Insurance Start Date");
		util.verifyActualExpectedText(actualCoverageEndDate, expectedInsuranceEndDate,"Coverage end date");
		common.clickPreviousButton();

	}

	@Test(priority=4)
	public void TC_030SpouseAddHealthInsuranceSaveAndContinueLaterButton() {

		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		lpoLanding.clickHealthModule();
		util.refreshPage();
		HealthInsurance healthIns=	new HealthInsurance(util);
		util.holdOn(Duration.ofSeconds(5));
		healthIns.clickHealthInsuranceSideBarLink();
		CommonCode common=	new CommonCode(util);
		common.clickSpouseToggleButton();
		healthIns.clickAddHealthInsuranceButton();
		healthIns.selectMedigapTypeFromInsuranceTypeDropDown();
		healthIns.selectMedigapPlanAOptionsFromSupplementInsurance();
		healthIns.selectAllStateInsGroupFromInsuranceCompanyDD();
		String expectedPolicyName="American Health policy";
		healthIns.inputPolicyName(expectedPolicyName);
		String expectedPolicyNumber="PLC938493849";
		healthIns.inputPolicyNumber(expectedPolicyNumber);
		String expecteGroupNumber="GRPNUM989";
		healthIns.inputGroupNumber(expecteGroupNumber);
		healthIns.selectQuaterlyPremiumFrequency();
		String expectedPremiumAmount="23423";
		healthIns.inputPremiumAmount(expectedPremiumAmount);
		String actualDeductibleAmount="57567";
		healthIns.inputDeductibleAmount(actualDeductibleAmount);
		String expectedCoPayment="276567";
		healthIns.inputCoPayment(expectedCoPayment);
		String expectedOutOfPocketAmount="78566";
		healthIns.inputOutOfPocketMaximum(expectedOutOfPocketAmount);
		String expectedInsuranceStartDate="11-19-2004";
		healthIns.inputInsuranceStartDate(expectedInsuranceStartDate);
		String expectedInsuranceEndDate="10-17-2029";
		healthIns.inputInsuranceEndDate(expectedInsuranceEndDate);
		healthIns.clickHowAreTheExpensePaidManuallyRadioBT();
		healthIns.clickInPersonRadioButton();
		healthIns.uploadFile();
		common.clickSaveContinueLaterButton();
		util.holdOn(Duration.ofSeconds(3));
		healthIns.waitUntilHealthInsuranceTableIsPresent();
		common.clickSpouseToggleButton();
		healthIns.clickQuaterlyEditIcon();
		String actualHealthInsuranceType=		healthIns.getHealthInsuranceTypeSelectedText();
		String 	actualHealthSupplementInsurance=	healthIns.getSupplementInsuranceTypeSelectedText();
		String actualInsuranceCompany=	healthIns.getInsuranceCompanySelectedText();
		String actualPolicyName=	healthIns.getPolicyNameInputText();
		String actualPolicyNum=	healthIns.getPolicyNumberInputText();
		String actualGroupNum=	healthIns.getGroupNumberInputText();
		String actualPremiumFrequency=	healthIns.getPremiumFrequnecySelectedText();
		String actualPremiumAmount=	healthIns.getPremiumAmountInputText();
		String actualDedcuctableAmount=	healthIns.getDeductableAmountInputText();
		String actualCoPayment=	healthIns.getCoPaymentInputText();
		String actualOutOfPayment=	healthIns.getOutOfPaymentInputText();
		String actualCoverateStart=	healthIns.getCoverageStartInputText();
		String actualCoverageEndDate=healthIns.getCoverageEndInputText();
		util.verifyActualExpectedText(actualHealthInsuranceType,"Medigap" ,"Insurance type" );
		util.verifyActualExpectedText(actualHealthSupplementInsurance,"Medigap Plan A" ,"Supplement insurance");
		util.verifyActualExpectedText(actualInsuranceCompany,"Allstate Ins Group" ,"Insurance company");
		util.verifyActualExpectedText(actualPolicyName,expectedPolicyName ,"Policy Name");
		util.verifyActualExpectedText(actualPolicyNum,expectedPolicyNumber ,"Policy number");
		util.verifyActualExpectedText(actualGroupNum,expecteGroupNumber ,"Group number");
		util.verifyActualExpectedText(actualPremiumFrequency,"Quaterly" ,"Premium Frequency");
		util.verifyActualExpectedText(actualPremiumAmount,expectedPremiumAmount ,"Premium amount");
		util.verifyActualExpectedText(actualDedcuctableAmount,actualDeductibleAmount ,"Deductable amount");
		util.verifyActualExpectedText(actualCoPayment,expectedCoPayment ,"Co Payment");
		util.verifyActualExpectedText(actualOutOfPayment, expectedOutOfPocketAmount,"Out of pocket amount");
		util.verifyActualExpectedText(actualCoverateStart, expectedInsuranceStartDate,"Insurance Start Date");
		util.verifyActualExpectedText(actualCoverageEndDate, expectedInsuranceEndDate,"Coverage end date");
		common.clickPreviousButton();

	}

	@Test(priority=5)
	public void TC_031SpouseAddHealthInsuranceSaveAndAddAnotherButton() {

		util.refreshPage();
		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		lpoLanding.clickHealthModule();
		HealthInsurance healthIns=	new HealthInsurance(util);
		util.holdOn(Duration.ofSeconds(5));
		CommonCode common=	new CommonCode(util);
		healthIns.clickHealthInsuranceSideBarLink();
		common.clickSpouseToggleButton();
		healthIns.clickAddHealthInsuranceButton();
		healthIns.selectPrivateTypeInsurance();
		String expectedPolicyName="Rk Hospital Health policy";
		healthIns.inputPolicyName(expectedPolicyName);
		String expectedPolicyNumber="PLC398493";
		healthIns.inputPolicyNumber(expectedPolicyNumber);
		String expecteGroupNumber="GRPN34839";
		healthIns.inputGroupNumber(expecteGroupNumber);
		healthIns.selectSinglePremiumFrequency();
		String expectedPremiumAmount="49837";
		healthIns.inputPremiumAmount(expectedPremiumAmount);
		String actualDeductibleAmount="8376";
		healthIns.inputDeductibleAmount(actualDeductibleAmount);
		String expectedCoPayment="9834";
		healthIns.inputCoPayment(expectedCoPayment);
		String expectedOutOfPocketAmount="938";
		healthIns.inputOutOfPocketMaximum(expectedOutOfPocketAmount);
		String expectedInsuranceStartDate="10-15-2009";
		healthIns.inputInsuranceStartDate(expectedInsuranceStartDate);
		String expectedInsuranceEndDate="10-17-2030";
		healthIns.inputInsuranceEndDate(expectedInsuranceEndDate);
		healthIns.clickHowAreTheExpensePaidAutoPayRadioButton();
		String expectedBankName="Indian Overseas Bank";
		healthIns.inputBankName(expectedBankName);
		String expectedAccountNumber="9834587348578";
		healthIns.inputAccountNumber(expectedAccountNumber);
		common.clickSaveAddAnotherButton();
		new Specialists(util).waitUntilToasterMessageisHide();;
		util.holdOn(Duration.ofSeconds(5));
		common.clickPreviousButton();
		util.holdOn(Duration.ofSeconds(3));
		healthIns.waitUntilHealthInsuranceTableIsPresent();
		common.clickSpouseToggleButton();
		healthIns.clickPrivateHealthInsurancePlanEditIcon();
		String actualHealthInsuranceType=		healthIns.getHealthInsuranceTypeSelectedText();
		String actualPolicyName=	healthIns.getPolicyNameInputText();
		String actualPolicyNum=	healthIns.getPolicyNumberInputText();
		String actualGroupNum=	healthIns.getGroupNumberInputText();
		String actualPremiumFrequency=	healthIns.getPremiumFrequnecySelectedText();
		String actualPremiumAmount=	healthIns.getPremiumAmountInputText();
		String actualDedcuctableAmount=	healthIns.getDeductableAmountInputText();
		String actualCoPayment=	healthIns.getCoPaymentInputText();
		String actualOutOfPayment=	healthIns.getOutOfPaymentInputText();
		String actualCoverateStart=	healthIns.getCoverageStartInputText();
		String actualCoverageEndDate=healthIns.getCoverageEndInputText();
		String actualBankNameText=	healthIns.getInputBankNameText();
		String acutalBankAccountNumberText=	healthIns.getInputBankAccountText();
		util.verifyActualExpectedText(actualHealthInsuranceType,"Private Plan" ,"Insurance type" );
		util.verifyActualExpectedText(actualPolicyName,expectedPolicyName ,"Policy Name");
		util.verifyActualExpectedText(actualPolicyNum,expectedPolicyNumber ,"Policy number");
		util.verifyActualExpectedText(actualGroupNum,expecteGroupNumber ,"Group number");
		util.verifyActualExpectedText(actualPremiumFrequency,"Single" ,"Premium Frequency");
		util.verifyActualExpectedText(actualPremiumAmount,expectedPremiumAmount ,"Premium amount");
		util.verifyActualExpectedText(actualDedcuctableAmount,actualDeductibleAmount ,"Deductable amount");
		util.verifyActualExpectedText(actualCoPayment,expectedCoPayment ,"Co Payment");
		util.verifyActualExpectedText(actualOutOfPayment, expectedOutOfPocketAmount,"Out of pocket amount");
		util.verifyActualExpectedText(actualCoverateStart, expectedInsuranceStartDate,"Insurance Start Date");
		util.verifyActualExpectedText(actualCoverageEndDate, expectedInsuranceEndDate,"Coverage end date");
		util.verifyActualExpectedText(actualBankNameText, expectedBankName, "Bank Name");
		util.verifyActualExpectedText(acutalBankAccountNumberText, expectedAccountNumber, "Enter the Account Number");
		common.clickPreviousButton();
	}
	
	@Test(priority=6)
	public void TC_032SpouseAddHealthInsuranceSaveAndProccedToMedicationButton() {

		util.refreshPage();
		LpoLandingPage lpoLanding=	new LpoLandingPage(util);
		lpoLanding.clickHealthModule();
		HealthInsurance healthIns=	new HealthInsurance(util);
		util.holdOn(Duration.ofSeconds(5));
		CommonCode common=	new CommonCode(util);
		healthIns.clickHealthInsuranceSideBarLink();
		common.clickSpouseToggleButton();
		healthIns.clickAddHealthInsuranceButton();
		healthIns.selectDentalHealthInsuranceTypeDropDown();
		String expectedPolicyName="Sanjay Health policy";
		healthIns.inputPolicyName(expectedPolicyName);
		String expectedPolicyNumber="POLICYNUM9384398";
		healthIns.inputPolicyNumber(expectedPolicyNumber);
		String expecteGroupNumber="GROUPN23423";
		healthIns.inputGroupNumber(expecteGroupNumber);
		healthIns.selectSinglePremiumFrequency();
		String expectedPremiumAmount="8876";
		healthIns.inputPremiumAmount(expectedPremiumAmount);
		String actualDeductibleAmount="9999";
		healthIns.inputDeductibleAmount(actualDeductibleAmount);
		String expectedCoPayment="4567";
		healthIns.inputCoPayment(expectedCoPayment);
		String expectedOutOfPocketAmount="2345";
		healthIns.inputOutOfPocketMaximum(expectedOutOfPocketAmount);
		String expectedInsuranceStartDate="10-15-2012";
		healthIns.inputInsuranceStartDate(expectedInsuranceStartDate);
		String expectedInsuranceEndDate="10-17-2034";
		healthIns.inputInsuranceEndDate(expectedInsuranceEndDate);
		healthIns.clickHowAreTheExpensePaidAutoPayRadioButton();
		String expectedBankName="HDFC Bank";
		healthIns.inputBankName(expectedBankName);
		String expectedAccountNumber="39438493849389";
		healthIns.inputAccountNumber(expectedAccountNumber);
		healthIns.clickSaveProceedToMedicationSupplementBT();
		new Specialists(util).waitUntilToasterMessageisHide();
		util.holdOn(Duration.ofSeconds(5));
		healthIns.clickHealthInsuranceSideBarLink();
		util.holdOn(Duration.ofSeconds(3));
		common.clickSpouseToggleButton();
		healthIns.waitUntilHealthInsuranceTableIsPresent();
		common.clickSpouseToggleButton();
		healthIns.clickDentalTypeEditIconInTable();
		String actualHealthInsuranceType=		healthIns.getHealthInsuranceTypeSelectedText();
		String actualPolicyName=	healthIns.getPolicyNameInputText();
		String actualPolicyNum=	healthIns.getPolicyNumberInputText();
		String actualGroupNum=	healthIns.getGroupNumberInputText();
		String actualPremiumFrequency=	healthIns.getPremiumFrequnecySelectedText();
		String actualPremiumAmount=	healthIns.getPremiumAmountInputText();
		String actualDedcuctableAmount=	healthIns.getDeductableAmountInputText();
		String actualCoPayment=	healthIns.getCoPaymentInputText();
		String actualOutOfPayment=	healthIns.getOutOfPaymentInputText();
		String actualCoverateStart=	healthIns.getCoverageStartInputText();
		String actualCoverageEndDate=healthIns.getCoverageEndInputText();
		String actualBankNameText=	healthIns.getInputBankNameText();
		String acutalBankAccountNumberText=	healthIns.getInputBankAccountText();
		util.verifyActualExpectedText(actualHealthInsuranceType,"Dental" ,"Insurance type" );
		util.verifyActualExpectedText(actualPolicyName,expectedPolicyName ,"Policy Name");
		util.verifyActualExpectedText(actualPolicyNum,expectedPolicyNumber ,"Policy number");
		util.verifyActualExpectedText(actualGroupNum,expecteGroupNumber ,"Group number");
		util.verifyActualExpectedText(actualPremiumFrequency,"Single" ,"Premium Frequency");
		util.verifyActualExpectedText(actualPremiumAmount,expectedPremiumAmount ,"Premium amount");
		util.verifyActualExpectedText(actualDedcuctableAmount,actualDeductibleAmount ,"Deductable amount");
		util.verifyActualExpectedText(actualCoPayment,expectedCoPayment ,"Co Payment");
		util.verifyActualExpectedText(actualOutOfPayment, expectedOutOfPocketAmount,"Out of pocket amount");
		util.verifyActualExpectedText(actualCoverateStart, expectedInsuranceStartDate,"Insurance Start Date");
		util.verifyActualExpectedText(actualCoverageEndDate, expectedInsuranceEndDate,"Coverage end date");
		util.verifyActualExpectedText(actualBankNameText, expectedBankName, "Bank Name");
		util.verifyActualExpectedText(acutalBankAccountNumberText, expectedAccountNumber, "Enter the Account Number");
		common.clickPreviousButton();
	}
	
	


}
