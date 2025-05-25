package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.TaxInformation;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class TaxInfoTestCases extends BaseTest {

	@Test(priority = 1)
	public void FTC_034_PrimaryMemberInputTax2025DetailsSaveContinueLaterButton() {
		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickTaxInfoSidebarLink();
		TaxInformation taxInfo = new TaxInformation(util);
		taxInfo.clickDoesYourSpouseFileSeperateTaxYesRadioBT();
		util.holdOn(Duration.ofSeconds(5));
		taxInfo.clickAddTaxButton();
		taxInfo.select2025();
		String expectedAdjustedGrossIncome = "98574";
		taxInfo.inputAdjustedGrossIncome(expectedAdjustedGrossIncome);
		String expectedTaxableIncome = "76543";
		taxInfo.inputTaxableIncomeTB(expectedTaxableIncome);
		String expectedTotalTaxesIncome = "76543";
		taxInfo.inputTotalTaxes(expectedTotalTaxesIncome);
		assets.uploadFile();
		common.clickSaveContinueLaterButton();
		taxInfo.click2025YrsEditIcon();
		String actualAdjustedIncome = taxInfo.getAdjustedGrossIncomeText();
		String actualTaxableIncome = taxInfo.getTaxableIncomeText();
		String actualTotalTaxes = taxInfo.getTotalTaxesText();
		util.verifyActualExpectedText(expectedAdjustedGrossIncome, actualAdjustedIncome, "Adjustable Gross Income*");
		util.verifyActualExpectedText(actualTaxableIncome, expectedTaxableIncome, "Taxable Income*");
		util.verifyActualExpectedText(expectedTotalTaxesIncome, actualTotalTaxes, "Total Taxes*");
		common.clickPreviousButton();

	}

	@Test(priority = 2)
	public void FTC_035_PrimaryMemberInputTax2024SaveAddAnotherBT() {
		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickTaxInfoSidebarLink();
		TaxInformation taxInfo = new TaxInformation(util);
		taxInfo.clickDoesYourSpouseFileSeperateTaxYesRadioBT();
		util.holdOn(Duration.ofSeconds(5));
		taxInfo.clickAddTaxButton();
		taxInfo.select2024();
		String expectedAdjustedGrossIncome = "9384";
		taxInfo.inputAdjustedGrossIncome(expectedAdjustedGrossIncome);
		String expectedTaxableIncome = "9348";
		taxInfo.inputTaxableIncomeTB(expectedTaxableIncome);
		String expectedTotalTaxesIncome = "9843";
		taxInfo.inputTotalTaxes(expectedTotalTaxesIncome);
		assets.uploadFile();
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		common.clickPreviousButton();
		taxInfo.click2024YrsEditIcon();
		String actualAdjustedIncome = taxInfo.getAdjustedGrossIncomeText();
		String actualTaxableIncome = taxInfo.getTaxableIncomeText();
		String actualTotalTaxes = taxInfo.getTotalTaxesText();
		util.verifyActualExpectedText(expectedAdjustedGrossIncome, actualAdjustedIncome, "Adjustable Gross Income*");
		util.verifyActualExpectedText(actualTaxableIncome, expectedTaxableIncome, "Taxable Income*");
		util.verifyActualExpectedText(expectedTotalTaxesIncome, actualTotalTaxes, "Total Taxes*");
		common.clickPreviousButton();
	}

	@Test(priority = 3)
	public void FTC_036_PrimaryMemberInputTax2023SaveAndProceedToSpouseBT() {
		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickTaxInfoSidebarLink();
		TaxInformation taxInfo = new TaxInformation(util);
		taxInfo.clickDoesYourSpouseFileSeperateTaxYesRadioBT();
		util.holdOn(Duration.ofSeconds(5));
		taxInfo.clickAddTaxButton();
		taxInfo.select2023();
		String expectedAdjustedGrossIncome = "23457654";
		taxInfo.inputAdjustedGrossIncome(expectedAdjustedGrossIncome);
		String expectedTaxableIncome = "9876333";
		taxInfo.inputTaxableIncomeTB(expectedTaxableIncome);
		String expectedTotalTaxesIncome = "765433";
		taxInfo.inputTotalTaxes(expectedTotalTaxesIncome);
		assets.uploadFile();
		common.clickSaveAndProceedToSpouseBT();
		common.waitUntilToasterMessageisSeen();
		common.clickSpouseToggleButton();
		taxInfo.click2023YrsEditIcon();
		String actualAdjustedIncome = taxInfo.getAdjustedGrossIncomeText();
		String actualTaxableIncome = taxInfo.getTaxableIncomeText();
		String actualTotalTaxes = taxInfo.getTotalTaxesText();
		util.verifyActualExpectedText(expectedAdjustedGrossIncome, actualAdjustedIncome, "Adjustable Gross Income*");
		util.verifyActualExpectedText(actualTaxableIncome, expectedTaxableIncome, "Taxable Income*");
		util.verifyActualExpectedText(expectedTotalTaxesIncome, actualTotalTaxes, "Total Taxes*");
		common.clickPreviousButton();
		
	}

	@Test(priority = 4)
	public void FTC_037_SpouseInputTax2022DetailsSaveContinueLaterButton() {
		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickTaxInfoSidebarLink();
		TaxInformation taxInfo = new TaxInformation(util);
		taxInfo.clickDoesYourSpouseFileSeperateTaxYesRadioBT();
		util.holdOn(Duration.ofSeconds(5));
		common.clickSpouseToggleButton();
		taxInfo.clickAddTaxButton();
		taxInfo.select2022();
		String expectedAdjustedGrossIncome = "98574";
		taxInfo.inputAdjustedGrossIncome(expectedAdjustedGrossIncome);
		String expectedTaxableIncome = "76543";
		taxInfo.inputTaxableIncomeTB(expectedTaxableIncome);
		String expectedTotalTaxesIncome = "76543";
		taxInfo.inputTotalTaxes(expectedTotalTaxesIncome);
		assets.uploadFile();
		common.clickSaveContinueLaterButton();
		taxInfo.click2022YrsEditIcon();
		String actualAdjustedIncome = taxInfo.getAdjustedGrossIncomeText();
		String actualTaxableIncome = taxInfo.getTaxableIncomeText();
		String actualTotalTaxes = taxInfo.getTotalTaxesText();
		util.verifyActualExpectedText(expectedAdjustedGrossIncome, actualAdjustedIncome, "Adjustable Gross Income*");
		util.verifyActualExpectedText(actualTaxableIncome, expectedTaxableIncome, "Taxable Income*");
		util.verifyActualExpectedText(expectedTotalTaxesIncome, actualTotalTaxes, "Total Taxes*");
		common.clickPreviousButton();

	}

	@Test(priority = 5)
	public void FTC_038_SpouseInputTax2021SaveAddAnotherBT() {
		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickTaxInfoSidebarLink();
		TaxInformation taxInfo = new TaxInformation(util);
		taxInfo.clickDoesYourSpouseFileSeperateTaxYesRadioBT();
		util.holdOn(Duration.ofSeconds(5));
		common.clickSpouseToggleButton();
		taxInfo.clickAddTaxButton();
		taxInfo.select2021();
		String expectedAdjustedGrossIncome = "9384";
		taxInfo.inputAdjustedGrossIncome(expectedAdjustedGrossIncome);
		String expectedTaxableIncome = "9348";
		taxInfo.inputTaxableIncomeTB(expectedTaxableIncome);
		String expectedTotalTaxesIncome = "9843";
		taxInfo.inputTotalTaxes(expectedTotalTaxesIncome);
		assets.uploadFile();
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		common.clickPreviousButton();
		taxInfo.click2021YrsEditIcon();
		String actualAdjustedIncome = taxInfo.getAdjustedGrossIncomeText();
		String actualTaxableIncome = taxInfo.getTaxableIncomeText();
		String actualTotalTaxes = taxInfo.getTotalTaxesText();
		util.verifyActualExpectedText(expectedAdjustedGrossIncome, actualAdjustedIncome, "Adjustable Gross Income*");
		util.verifyActualExpectedText(actualTaxableIncome, expectedTaxableIncome, "Taxable Income*");
		util.verifyActualExpectedText(expectedTotalTaxesIncome, actualTotalTaxes, "Total Taxes*");
		common.clickPreviousButton();
	}

	@Test(priority = 6)
	public void FTC_039_SpouseInputTax2020SaveProceedToFinancialProfessional() {
		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickTaxInfoSidebarLink();
		TaxInformation taxInfo = new TaxInformation(util);
		taxInfo.clickDoesYourSpouseFileSeperateTaxYesRadioBT();
		util.holdOn(Duration.ofSeconds(5));
		common.clickSpouseToggleButton();
		taxInfo.clickAddTaxButton();
		taxInfo.select2020();
		String expectedAdjustedGrossIncome = "23457654";
		taxInfo.inputAdjustedGrossIncome(expectedAdjustedGrossIncome);
		String expectedTaxableIncome = "9876333";
		taxInfo.inputTaxableIncomeTB(expectedTaxableIncome);
		String expectedTotalTaxesIncome = "765433";
		taxInfo.inputTotalTaxes(expectedTotalTaxesIncome);
		assets.uploadFile();
		common.clickSaveAndProceedToSpouseBT();
		common.waitUntilToasterMessageisSeen();
		assets.clickTaxInfoSidebarLink();
		common.clickSpouseToggleButton();
		taxInfo.click2020YrsEditIcon();
		String actualAdjustedIncome = taxInfo.getAdjustedGrossIncomeText();
		String actualTaxableIncome = taxInfo.getTaxableIncomeText();
		String actualTotalTaxes = taxInfo.getTotalTaxesText();
		util.verifyActualExpectedText(expectedAdjustedGrossIncome, actualAdjustedIncome, "Adjustable Gross Income*");
		util.verifyActualExpectedText(actualTaxableIncome, expectedTaxableIncome, "Taxable Income*");
		util.verifyActualExpectedText(expectedTotalTaxesIncome, actualTotalTaxes, "Total Taxes*");
		common.clickPreviousButton();
		
	}

	
	
	
}
