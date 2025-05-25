package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.FinancialProfessional;
import com.agingoptions.health.PrimaryCarePhysician;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class BookKeeperTestCases extends BaseTest {

	@Test(priority = 1)
	public void FTC_055_PrimaryMemberSaveContinueLaterButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickBookKeeparSideBarLink();
		financePro.clickAddBookeeparBT();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Bench";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Accounting";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Bench Accounting Accountant";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://benchaccounting.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "3";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisBookkeeperYesRadioButton();
		financePro.clickWillThereBeContinuityServiceBookkeeperYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues, or preferences";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("9829348734", "benchaccounting@maildrop.cc");
		common.clickSaveContinueLaterButton();
		common.waitUntilToasterMessageisSeen();
		financePro.clickBenchAccountingEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		physician.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualContactText = physician.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName, expectedLastName, "Last Name");
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName, "Business Name");
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName, "WebSite Name");
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor, actualHowLongHaveUsedThisAdvisor,
				"How long have you used this advisor?");
		util.verifyActualExpectedText(expectedNotesForAgents, actualNotesForAgents, "Notes for Agents");
		util.verifyActualExpectedText(actualContactText, "Primary contact", "Primary contact");
		common.clickPreviousButton();
	}

	@Test(priority = 2)
	public void FTC_056_PrimarySaveAddAnotherButton() {

		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickBookKeeparSideBarLink();
		financePro.clickAddBookeeparBT();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Edward";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Jones";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Edward Jones Bookkeeper";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://edwarjones.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "6";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisBookkeeperYesRadioButton();
		financePro.clickWillThereBeContinuityServiceBookkeeperYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues, or preferences";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("8948293483", "edwardJones@maildrop.cc");
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		common.clickPreviousButton();
		financePro.clickEdwardJonesEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		physician.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualContactText = physician.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName, expectedLastName, "Last Name");
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName, "Business Name");
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName, "WebSite Name");
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor, actualHowLongHaveUsedThisAdvisor,
				"How long have you used this advisor?");
		util.verifyActualExpectedText(expectedNotesForAgents, actualNotesForAgents, "Notes for Agents");
		util.verifyActualExpectedText(actualContactText, "Primary contact", "Primary contact");
		common.clickPreviousButton();
	}

	@Test(priority = 3)
	public void FTC_057_PrimaryMemberSaveAndProceedToSpouseButton() {

		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickBookKeeparSideBarLink();
		CommonCode common = new CommonCode(util);

		financePro.clickAddBookeeparBT();
		util.holdOn(Duration.ofSeconds(4));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Betterment";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Premium";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Betterment Premium Accountant";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://bettermentpremiumaccountant.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "3";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisBookkeeperYesRadioButton();
		financePro.clickWillThereBeContinuityServiceBookkeeperYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("8756948455", "beeternemtn@maildrop.cc");
		util.holdOn(Duration.ofSeconds(2));
		common.clickSaveAndProceedToSpouseBT();
		common.waitUntilToasterMessageisSeen();
		common.clickPrimaryMemberToggleButton();
		financePro.clickBettermentPremiumEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		physician.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualContactText = physician.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName, expectedLastName, "Last Name");
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName, "Business Name");
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName, "WebSite Name");
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor, actualHowLongHaveUsedThisAdvisor,
				"How long have you used this advisor?");
		util.verifyActualExpectedText(expectedNotesForAgents, actualNotesForAgents, "Notes for Agents");
		util.verifyActualExpectedText(actualContactText, "Primary contact", "Primary contact");
		common.clickPreviousButton();

	}

	@Test(priority=4)
	public void FTC_058_SpouseSaveContinueLaterButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickBookKeeparSideBarLink();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.clickSpouseToggleButton();
		financePro.clickAddBookeeparBT();
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Bench";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Accounting";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Bench Accounting Accountant";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://benchaccounting.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "3";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisBookkeeperYesRadioButton();
		financePro.clickWillThereBeContinuityServiceBookkeeperYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues, or preferences";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("9829348734", "benchaccounting@maildrop.cc");
		common.clickSaveContinueLaterButton();
		common.waitUntilToasterMessageisSeen();
		financePro.clickBenchAccountingEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		physician.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualContactText = physician.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName, expectedLastName, "Last Name");
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName, "Business Name");
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName, "WebSite Name");
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor, actualHowLongHaveUsedThisAdvisor,
				"How long have you used this advisor?");
		util.verifyActualExpectedText(expectedNotesForAgents, actualNotesForAgents, "Notes for Agents");
		util.verifyActualExpectedText(actualContactText, "Primary contact", "Primary contact");
		common.clickPreviousButton();
	}

	@Test(priority = 5)
	public void FTC_059_SpouseSaveAddAnotherButton() {

		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickBookKeeparSideBarLink();
		util.holdOn(Duration.ofSeconds(2));
		CommonCode common = new CommonCode(util);
		common.clickSpouseToggleButton();
		financePro.clickAddBookeeparBT();
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Edward";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Jones";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Edward Jones Bookkeeper";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://edwarjones.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "6";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisBookkeeperYesRadioButton();
		financePro.clickWillThereBeContinuityServiceBookkeeperYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues, or preferences";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("8948293483", "edwardJones@maildrop.cc");
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		common.clickPreviousButton();
		financePro.clickEdwardJonesEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		physician.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualContactText = physician.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName, expectedLastName, "Last Name");
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName, "Business Name");
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName, "WebSite Name");
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor, actualHowLongHaveUsedThisAdvisor,
				"How long have you used this advisor?");
		util.verifyActualExpectedText(expectedNotesForAgents, actualNotesForAgents, "Notes for Agents");
		util.verifyActualExpectedText(actualContactText, "Primary contact", "Primary contact");
		common.clickPreviousButton();
	}

	@Test(priority = 6)
	public void FTC_060_SpouseSaveAndProceedToLegalButton() {

		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickBookKeeparSideBarLink();
		CommonCode common = new CommonCode(util);
		common.clickSpouseToggleButton();
		financePro.clickAddBookeeparBT();
		util.holdOn(Duration.ofSeconds(4));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Betterment";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Premium";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Betterment Premium Accountant";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://bettermentpremiumaccountant.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "3";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisBookkeeperYesRadioButton();
		financePro.clickWillThereBeContinuityServiceBookkeeperYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("8756948455", "beeternemtn@maildrop.cc");
		util.holdOn(Duration.ofSeconds(2));
		financePro.clickSaveProceedToLegalButton();
		common.waitUntilToasterMessageisSeen();
		lpoLanding.clickFinanceSideBarLink();
		assets.clickFinancialProfessionalSideBarLink();
		financePro.clickBookKeeparSideBarLink();
		common.clickSpouseToggleButton();
		financePro.clickBettermentPremiumEditIcon();
		String actualFirstName = financePro.getProfessionalFirstName();
		String actualLastName = financePro.getProfessionalLastName();
		String actualBusinessName = financePro.getProfessionalBusinessName();
		String actualWebSiteLinkName = financePro.getProfessionalWebsiteLink();
		util.holdOn(Duration.ofSeconds(5));
		String actualHowLongHaveUsedThisAdvisor = financePro.getProfessionalHowLongHaveYouUsedThisAdvisor();
		String actualNotesForAgents = financePro.getProfessionalNotesForAgents();
		physician.openContactAndAddressInfoAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String actualContactText = physician.getPrimaryContactText();
		util.verifyActualExpectedText(actualFirstName, expectedFirstName, "First Name");
		util.verifyActualExpectedText(actualLastName, expectedLastName, "Last Name");
		util.verifyActualExpectedText(actualBusinessName, expectedBusinessName, "Business Name");
		util.verifyActualExpectedText(actualWebSiteLinkName, expectedWebsiteName, "WebSite Name");
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor, actualHowLongHaveUsedThisAdvisor,"How long have you used this advisor?");
		util.verifyActualExpectedText(expectedNotesForAgents, actualNotesForAgents, "Notes for Agents");
		util.verifyActualExpectedText(actualContactText, "Primary contact", "Primary contact");
		common.clickPreviousButton();

	}

}
