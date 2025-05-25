package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.FutureExpectation;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class FutureExpectationTestCases extends BaseTest {

	@Test(priority = 1)
	public void  FTC_028_FutureExpectation() {
		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickAssetsSideBarLink();
		assets.clickFutureExpecationSideBarLink();
		FutureExpectation future=	new FutureExpectation(util);
		util.holdOn(Duration.ofSeconds(4));
		future.checkPrimaryMemberDoYouExpectAnInheritanceCheckBox();
		String expectedPrimaryMemberInharitanceValue="934734";
		future.inputPrimaryMemberValueOfInharitanceAmountValue(expectedPrimaryMemberInharitanceValue);
		future.checkSpouseDoYouExpectAnInheritanceCheckBox();
		String expectedSpouseInharitanceValue="934734";
		future.inputSpouseValueOfInharitanceAmountValue(expectedSpouseInharitanceValue);
		future.clickNextLiabilitiesButton();
		common.waitUntilToasterMessageisSeen();
		util.holdOn(Duration.ofSeconds(4));
		assets.clickAssetsSideBarLink();
		assets.clickFutureExpecationSideBarLink();
		String actualPrimaryMemberValueOfInharitanceAmount=	future.getPrimaryMemberValueOfInharitanceInputAmount();
		String actualSpouseValueOfInharitanceAmount=	future.getSpouseValueOfInharitanceInputAmount();
		util.verifyActualExpectedText(expectedPrimaryMemberInharitanceValue,actualPrimaryMemberValueOfInharitanceAmount ,"Primary Member Value of inheritance amount" );
		util.verifyActualExpectedText(expectedSpouseInharitanceValue,actualSpouseValueOfInharitanceAmount ,"Spouse Value of inheritance amount" );


	}

}

