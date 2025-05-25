package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.finance.FinancialProfessional;
import com.agingoptions.health.PrimaryCarePhysician;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class AccountantTestCases extends BaseTest {

	@Test(priority = 1)
	public void FTC_047_PrimaryMemberIDontHaveCheckBox() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickFinancialProfessionalSideBarLink();
		assets.clickAccountantSideBarLink();
		util.holdOn(Duration.ofSeconds(5));
		assets.checkIDontHaveCheckBox();
		FinancialProfessional financial = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(3));
		financial.clickAreYouLookingNewAccountantYesRadioButton();
		financial.clickWhoFilesTheTaxesPrimaryMemberRadioButton();
		financial.clickWhoPayTheBillsInTheHousePrimaryMemberRadioButton();
		financial.clickSaveBT();
		util.holdOn(Duration.ofSeconds(3));
		assets.iDontHaveCheckboxStatus();
	}

	@Test(priority = 2)
	public void FTC_048_SpouseIDontHaveCheckBox() {
		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickFinancialProfessionalSideBarLink();
		assets.clickAccountantSideBarLink();
		util.holdOn(Duration.ofSeconds(5));
		common.clickSpouseToggleButton();
		util.holdOn(Duration.ofSeconds(2));
		assets.checkIDontHaveCheckBox();
		FinancialProfessional financial = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(3));
		financial.clickAreYouLookingNewAccountantYesRadioButton();
		financial.clickWhoFilesTheTaxesPrimaryMemberRadioButton();
		financial.clickWhoPayTheBillsInTheHousePrimaryMemberRadioButton();
		financial.clickSaveBT();
		util.holdOn(Duration.ofSeconds(3));
		assets.iDontHaveCheckboxStatus();
	}

	@Test(priority = 3)
	public void FTC_049_PrimaryMemberSaveContinueLaterButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		assets.clickAccountantSideBarLink();
		financePro.clickAddAccountantBT();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Edward";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Jones";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Edward Jones Accountant";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://anshuverma.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "5";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisAccountantYesRadioButton();
		financePro.clickWillThereBeContinuityServiceYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues, or preferences";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("8674958499", "anshuverma@maildrop.cc");
		common.clickSaveContinueLaterButton();
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

	@Test(priority = 4)
	public void FTC_050_PrimaryMemberSaveAddAnotherButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		assets.clickAccountantSideBarLink();
		financePro.clickAddAccountantBT();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Fisher";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Investments";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Fisher Investments Accountant";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://fisherinvestments.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "6";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisAccountantYesRadioButton();
		financePro.clickWillThereBeContinuityServiceYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("8756948455", "fisherinvestment@maildrop.cc");
		util.holdOn(Duration.ofSeconds(2));
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		common.clickPreviousButton();
		financePro.clickfisherInvestmentEditIcon();
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
	
	@Test(priority=5)
	public void FTC_051_PrimaryMemberSaveAndProceedToSpouseButton() {
		
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		assets.clickAccountantSideBarLink();
		financePro.clickAddAccountantBT();
		CommonCode common = new CommonCode(util);
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
		String expectedHowLongUsedAdvisor = "6";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisAccountantYesRadioButton();
		financePro.clickWillThereBeContinuityServiceYesRadioButton();
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
		util.verifyActualExpectedText(expectedHowLongUsedAdvisor, actualHowLongHaveUsedThisAdvisor,"How long have you used this advisor?");
		util.verifyActualExpectedText(expectedNotesForAgents, actualNotesForAgents, "Notes for Agents");
		util.verifyActualExpectedText(actualContactText, "Primary contact", "Primary contact");
		common.clickPreviousButton();

	}
	
	@Test(priority=6)
	public void FTC_052_SpouseSaveContinueLaterButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		assets.clickAccountantSideBarLink();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.clickSpouseToggleButton();
		financePro.clickAddAccountantBT();
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Edward";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Jones";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Edward Jones Accountant";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://anshuverma.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "5";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisAccountantYesRadioButton();
		financePro.clickWillThereBeContinuityServiceYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues, or preferences";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("8674958499", "anshuverma@maildrop.cc");
		common.clickSaveContinueLaterButton();
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

	@Test(priority=7)
	public void FTC_053_SpouseSaveAddAnotherButton() {
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		assets.clickAccountantSideBarLink();
		CommonCode common = new CommonCode(util);
		util.holdOn(Duration.ofSeconds(2));
		common.clickSpouseToggleButton();
		financePro.clickAddAccountantBT();
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Fisher";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Investments";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Fisher Investments Accountant";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://fisherinvestments.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "6";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisAccountantYesRadioButton();
		financePro.clickWillThereBeContinuityServiceYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("8756948455", "fisherinvestment@maildrop.cc");
		util.holdOn(Duration.ofSeconds(2));
		common.clickSaveAddAnotherButton();
		common.waitUntilToasterMessageisSeen();
		common.clickPreviousButton();
		financePro.clickfisherInvestmentEditIcon();
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
	
	@Test(priority=8)
	public void FTC_054_SpouseSaveAndProceedToBookkeeperButton() {
		
		LpoLandingPage lpoLanding = new LpoLandingPage(util);
		util.refreshPage();
		util.holdOn(Duration.ofSeconds(5));
		lpoLanding.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		FinancialProfessional financePro = new FinancialProfessional(util);
		util.holdOn(Duration.ofSeconds(5));
		assets.clickFinancialProfessionalSideBarLink();
		assets.clickAccountantSideBarLink();
		util.holdOn(Duration.ofSeconds(2));
		CommonCode common = new CommonCode(util);
		common.clickSpouseToggleButton();
		financePro.clickAddAccountantBT();
		util.holdOn(Duration.ofSeconds(2));
		common.unCheckCopySameDataToSpouseCheckBox();
		String expectedFirstName = "Betterment";
		financePro.inputFirstName(expectedFirstName);
		String expectedLastName = "Premium";
		financePro.inputLastName(expectedLastName);
		String expectedBusinessName = "Betterment Premium Accountant";
		financePro.inputBusinessName(expectedBusinessName);
		String expectedWebsiteName = "https://fisherinvestments.com";
		financePro.inputWebSiteName(expectedWebsiteName);
		String expectedHowLongUsedAdvisor = "6";
		financePro.inputHowLongHaveYouUsedThisAdvisorTB(expectedHowLongUsedAdvisor);
		financePro.clickAreYouHappyWithThisAccountantYesRadioButton();
		financePro.clickWillThereBeContinuityServiceYesRadioButton();
		String expectedNotesForAgents = "Record previous interactions, issues";
		financePro.inputNotesForAgents(expectedNotesForAgents);
		PrimaryCarePhysician physician = new PrimaryCarePhysician(util);
		physician.openContactAndAddressInfoAccordian();
		physician.inputPrimaryContactEmailMobileNo("8756948455", "betterment@maildrop.cc");
		util.holdOn(Duration.ofSeconds(2));
		financePro.clickSaveProceedToBookKeeperButton();
		common.waitUntilToasterMessageisSeen();
		assets.clickAccountantSideBarLink();
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
