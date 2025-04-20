package com.agingoptions.LegalInfoPage;

import com.nspl.agingoptions.webUtil.WebUtil;

public class OrganDonationDetails extends OrganDonationPageOr{
    public WebUtil wt;
	public OrganDonationDetails(WebUtil util) {
		super(util);
		this.wt=util;
	}
    
	public void verifyOrganDonationDetailsPage() {
		wt.click(organDonationDetailDrawer, "Organ Donation Details Drawer");
		wt.verifyInnerText(organDonationDetailsPageVerificationMessage, "Please identify your choices for organ donation.", "Organ details page message");
	}
	public void VerifyDoYouWishToBeAnOrganDonnerYes() {
		wt.click(organDonationDetailDrawer, "Organ Donation Details Drawer");
		wt.click(ClientDoYouWishToBeAnOrganDonnerYesRadioButton, "Do you wish to be an organ donor? Yes Radio Button");
		wt.click(SpouseDoYouWishToBeAnOrganDonnerYesRadioButton, "Do you wish to be an organ donor? Yes Radio Button");
		wt.verifyElementRadioButtonSelected(ClientDoYouWishToBeAnOrganDonnerNoRadioButton, "Do you wish to donate your body for scientific research?-No Radio button");
		
	}
	public void VerifySaveAndContinueDoYouWishToBeAnOrganDonnerYes() {
		wt.click(organDonationDetailDrawer, "Organ Donation Details Drawer");
		wt.click(ClientDoYouWishToBeAnOrganDonnerYesRadioButton, "Do you wish to be an organ donor? Yes Radio Button");
		wt.click(SpouseDoYouWishToBeAnOrganDonnerYesRadioButton, "Do you wish to be an organ donor? Yes Radio Button");
		wt.click(SaveAndContinueButton, "Save and continue button");
	}
	public void VerifySaveAndProceedDoYouWishToBeAnOrganDonnerNo() {
		wt.click(organDonationDetailDrawer, "Organ Donation Details Drawer");
		wt.click(ClientDoYouWishToBeAnOrganDonnerNoRadioButton, "Do you wish to be an organ donor? No Radio Button");
		wt.click(SpouseDoYouWishToBeAnOrganDonnerNoRadioButton, "Do you wish to be an organ donor? No Radio Button");
		wt.click(NextBurrialCremationPlan, "Next Burrial cremation button");
		
	}
	public void VerifySaveAndContinueWishToDonateYourBodyForScientificResearch_Yes() {
		wt.click(organDonationDetailDrawer, "Organ Donation Details Drawer");
		wt.click(ClientDonateYourBodyScientificResarchYes, "Do you wish to donate your body for scientific research? Yes Radio button");
		wt.click(SpouseDonateYourBodyScientificResarchYes, "Do you wish to donate your body for scientific research? Yes Radio Button");
		wt.click(NextBurrialCremationPlan, "Next Burrial cremation button");
	}
}
