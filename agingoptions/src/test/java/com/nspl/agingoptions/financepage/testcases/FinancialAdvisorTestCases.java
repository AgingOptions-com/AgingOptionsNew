package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.FinancialProfessional;
import com.agingoptions.health.PrimaryCarePhysician;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class FinancialAdvisorTestCases extends BaseTest {

	@Test(priority = 1,enabled = false)
	public void FTC_040_PrimaryIDontHaveFinancialAdvisor() {
		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickFinancialProfessionalSideBarLink();
		assets.checkIDontHaveCheckBox();
		FinancialProfessional financial = new FinancialProfessional(util);
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

	@Test(priority = 2,enabled = false)
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
		FinancialProfessional financial = new FinancialProfessional(util);
		financial.clickWhoMakesTheFinancialPlanningDesicionRadioBT();
		financial.clickDoYouUnderstandYourInvestementCostsYesRadioBT();
		financial.clickAreYouLookingToFindNewPlannerYesRadioBT();
		financial.clickAreYouComfortableWithYourCurrentYesRadioBT();
		financial.clickDoYouWorryAboutTheAdequacyOfYourAssetsRadioBT();
		financial.clickdoYouUnderstandYourInvestmentCostsYesRadioBT();
		financial.clickSaveBT();
		assets.iDontHaveCheckboxStatus();
	}

	@Test(priority = 3)
	public void FTC_042_PrimaryMemberSaveContinueLaterButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickAddFinancialAdvisorBT();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Anshu";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Verma";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Anshu Finance Advisor";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://anshuverma.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "5";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouComfortableWithYourCurrentYesRadioBT();
		financePro.clickDoYouWorryAboutTheAdequecyNoRadioBT();
		financePro.clickDoYouConsiderYourFinacialAdvisorUnsureRadioBT();
		financePro.clickWillThereBeAContinuityOfServicesIfThisYesRadioBT();
		financePro.clickAreYouOpenToSecondOpinionNoRadioBT();
		financePro.clickDoYouUnderstandYourInvestmentCostsUnsureRadioBT();
		String expectedNotesForAgents = "Maintain professionalism and empathy during all customer interactions.";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician prim = new PrimaryCarePhysician(util);
		prim.openContactAndAddressInfoAccordian();
		prim.inputAddress("122002");
		prim.inputPrimaryContactEmailMobileNo("823742834323", "anshukuamr@maildrop.cc");
		common.clickSaveContinueLaterButton();
		financePro.clickAnshuFinanceEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		prim.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualPhysicalText=		prim.getPhysicalAddressText();
		String actualContactText=		prim.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName,"First Name" );
		util.verifyActualExpectedText(actualLastName, expectedLastName,"Last Name" );
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName,"Business Name" );
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName,"WebSite Name" );
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor,actualHowLongHaveUsedThisAdvisor ,"How long have you used this advisor?" );
		util.verifyActualExpectedText(expectedNotesForAgents,actualNotesForAgents ,"Notes for Agents" );
		util.verifyActualExpectedText(actualPhysicalText, "Physical Address","Physical Address" );
		util.verifyActualExpectedText(actualContactText, "Primary contact","Primary contact" );
		common.clickPreviousButton();

	}

	@Test(priority=4)
	public void FTC_043_PrimaryMemberSaveAddAnotherButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickAddFinancialAdvisorBT();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Aman";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Roy";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Aman Roy Advisor";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://amanroy.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "5";
		util.holdOn(Duration.ofSeconds(2));
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouComfortableWithYourCurrentYesRadioBT();
		financePro.clickDoYouWorryAboutTheAdequecyNoRadioBT();
		financePro.clickDoYouConsiderYourFinacialAdvisorUnsureRadioBT();
		financePro.clickWillThereBeAContinuityOfServicesIfThisYesRadioBT();
		financePro.clickAreYouOpenToSecondOpinionNoRadioBT();
		financePro.clickDoYouUnderstandYourInvestmentCostsUnsureRadioBT();
		String expectedNotesForAgents = "Maintain professionalism.";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician prim = new PrimaryCarePhysician(util);
		prim.openContactAndAddressInfoAccordian();
		prim.inputPrimaryContactEmailMobileNo("9876543456", "anishakumari3948@maildrop.cc");
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		common.clickPreviousButton();
		financePro.clickAmanFinanceEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		prim.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(3));
		String actualContactText=		prim.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName,"First Name" );
		util.verifyActualExpectedText(actualLastName, expectedLastName,"Last Name" );
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName,"Business Name" );
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName,"WebSite Name" );
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor,actualHowLongHaveUsedThisAdvisor ,"How long have you used this advisor?" );
		util.verifyActualExpectedText(expectedNotesForAgents,actualNotesForAgents ,"Notes for Agents" );
		util.verifyActualExpectedText(actualContactText, "Primary contact","Primary contact" );
		common.clickPreviousButton();

	}

	@Test(priority=5)
	public void FTC_044_PrimaryMemberSaveAndProceedToSpouseButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickAddFinancialAdvisorBT();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Rohan";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Yadav";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Rohan Yadav Advisor";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://rohanyadav.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		util.holdOn(Duration.ofSeconds(1));
		String expectedHowLongUsedAdvisor = "3";
		util.holdOn(Duration.ofSeconds(2));
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouComfortableWithYourCurrentYesRadioBT();
		financePro.clickDoYouWorryAboutTheAdequecyNoRadioBT();
		financePro.clickDoYouConsiderYourFinacialAdvisorUnsureRadioBT();
		financePro.clickWillThereBeAContinuityOfServicesIfThisYesRadioBT();
		financePro.clickAreYouOpenToSecondOpinionNoRadioBT();
		financePro.clickDoYouUnderstandYourInvestmentCostsUnsureRadioBT();
		String expectedNotesForAgents = "Maintain professionalism.";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician prim = new PrimaryCarePhysician(util);
		prim.openContactAndAddressInfoAccordian();
		prim.inputPrimaryContactEmailMobileNo("9293849339", "rohanyadav3948@maildrop.cc");
		common.clickSaveAndProceedToSpouseBT();
		common.waitUntilToasterMessageisSeen();
		common.clickPrimaryMemberToggleButton();
		financePro.clickRohanFinanceEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		prim.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(3));
		String actualContactText=		prim.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName,"First Name" );
		util.verifyActualExpectedText(actualLastName, expectedLastName,"Last Name" );
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName,"Business Name" );
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName,"WebSite Name" );
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor,actualHowLongHaveUsedThisAdvisor ,"How long have you used this advisor?" );
		util.verifyActualExpectedText(expectedNotesForAgents,actualNotesForAgents ,"Notes for Agents" );
		util.verifyActualExpectedText(actualContactText, "Primary contact","Primary contact" );
		common.clickPreviousButton();
	}
	
	
	@Test(priority=6)
	public void FTC_045_SpouseSaveContinueLaterButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		CommonCode common = new CommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		common.clickSpouseToggleButton();
		financePro.clickAddFinancialAdvisorBT();
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Anshu";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Verma";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Anshu Finance Advisor";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://anshuverma.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "5";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouComfortableWithYourCurrentYesRadioBT();
		financePro.clickDoYouWorryAboutTheAdequecyNoRadioBT();
		financePro.clickDoYouConsiderYourFinacialAdvisorUnsureRadioBT();
		financePro.clickWillThereBeAContinuityOfServicesIfThisYesRadioBT();
		financePro.clickAreYouOpenToSecondOpinionNoRadioBT();
		financePro.clickDoYouUnderstandYourInvestmentCostsUnsureRadioBT();
		String expectedNotesForAgents = "Maintain professionalism and empathy during all customer interactions.";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician prim = new PrimaryCarePhysician(util);
		prim.openContactAndAddressInfoAccordian();
		prim.inputAddress("122002");
		prim.inputPrimaryContactEmailMobileNo("823742834323", "anshukuamr@maildrop.cc");
		common.clickSaveContinueLaterButton();
		financePro.clickAnshuFinanceEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		prim.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualPhysicalText=		prim.getPhysicalAddressText();
		String actualContactText=		prim.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName,"First Name" );
		util.verifyActualExpectedText(actualLastName, expectedLastName,"Last Name" );
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName,"Business Name" );
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName,"WebSite Name" );
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor,actualHowLongHaveUsedThisAdvisor ,"How long have you used this advisor?" );
		util.verifyActualExpectedText(expectedNotesForAgents,actualNotesForAgents ,"Notes for Agents" );
		util.verifyActualExpectedText(actualPhysicalText, "Physical Address","Physical Address" );
		util.verifyActualExpectedText(actualContactText, "Primary contact","Primary contact" );
		common.clickPreviousButton();

	}
	
	@Test(priority=7)
	public void FTC_046_SpouseSaveAndAddAnotherButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		CommonCode common = new CommonCode(util);
		assets.clickFinancialProfessionalSideBarLink();
		util.holdOn(Duration.ofSeconds(5));
		common.clickSpouseToggleButton();
		financePro.clickAddFinancialAdvisorBT();
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Aman";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Kumar";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Rohan Yadav Advisor";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://amankumar.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		util.holdOn(Duration.ofSeconds(1));
		String expectedHowLongUsedAdvisor = "3";
		util.holdOn(Duration.ofSeconds(2));
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouComfortableWithYourCurrentYesRadioBT();
		financePro.clickDoYouWorryAboutTheAdequecyNoRadioBT();
		financePro.clickDoYouConsiderYourFinacialAdvisorUnsureRadioBT();
		financePro.clickWillThereBeAContinuityOfServicesIfThisYesRadioBT();
		financePro.clickAreYouOpenToSecondOpinionNoRadioBT();
		financePro.clickDoYouUnderstandYourInvestmentCostsUnsureRadioBT();
		String expectedNotesForAgents = "Maintain professionalism.";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician prim = new PrimaryCarePhysician(util);
		prim.openContactAndAddressInfoAccordian();
		prim.inputPrimaryContactEmailMobileNo("7458734454", "amankumar3948@maildrop.cc");
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		common.clickPreviousButton();
		financePro.clickRohanFinanceEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		prim.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(3));
		String actualContactText=		prim.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName,"First Name" );
		util.verifyActualExpectedText(actualLastName, expectedLastName,"Last Name" );
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName,"Business Name" );
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName,"WebSite Name" );
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor,actualHowLongHaveUsedThisAdvisor ,"How long have you used this advisor?" );
		util.verifyActualExpectedText(expectedNotesForAgents,actualNotesForAgents ,"Notes for Agents" );
		util.verifyActualExpectedText(actualContactText, "Primary contact","Primary contact" );
		common.clickPreviousButton();
	}
	
	
}
