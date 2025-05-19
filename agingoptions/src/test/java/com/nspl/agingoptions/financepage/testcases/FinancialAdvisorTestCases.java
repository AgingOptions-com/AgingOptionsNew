package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.FinancialProfessional;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class FinancialAdvisorTestCases extends BaseTest {

	@Test(priority=1)
	public void FTC_040_PrimaryIDontHaveFinancialAdvisor() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickFinancialProfessionalSideBarLink();
		assets.checkIDontHaveCheckBox();
		FinancialProfessional financial=   new FinancialProfessional(util);
		financial.clickWhoMakesTheFinancialPlanningDesicionRadioBT();
		financial.clickDoYouUnderstandYourInvestementCostsYesRadioBT();
		financial.clickAreYouLookingToFindNewPlannerYesRadioBT();
		financial.clickAreYouComfortableWithYourCurrentYesRadioBT();
		financial.clickDoYouWorryAboutTheAdequacyOfYourAssetsRadioBT();
		financial.clickdoYouUnderstandYourInvestmentCostsYesRadioBT();
		financial.clickSaveBT();
		util.holdOn(Duration.ofSeconds(3));
		assets.iDontHaveCheckboxStatus();
	}

	@Test(priority=2)
	public void FTC_041_SpouseIDontHaveFinancialAdvisor() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickFinancialProfessionalSideBarLink();
		util.holdOn(Duration.ofSeconds(5));
		common.clickSpouseToggleButton();
		assets.checkIDontHaveCheckBox();
		FinancialProfessional financial=   new FinancialProfessional(util);
		financial.clickWhoMakesTheFinancialPlanningDesicionRadioBT();
		financial.clickDoYouUnderstandYourInvestementCostsYesRadioBT();
		financial.clickAreYouLookingToFindNewPlannerYesRadioBT();
		financial.clickAreYouComfortableWithYourCurrentYesRadioBT();
		financial.clickDoYouWorryAboutTheAdequacyOfYourAssetsRadioBT();
		financial.clickdoYouUnderstandYourInvestmentCostsYesRadioBT();
		financial.clickSaveBT();
		assets.iDontHaveCheckboxStatus();
	}



}
