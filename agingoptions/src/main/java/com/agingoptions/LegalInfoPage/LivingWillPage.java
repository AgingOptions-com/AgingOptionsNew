package com.agingoptions.LegalInfoPage;

import java.time.Duration;

import com.nspl.agingoptions.webUtil.WebUtil;

public class LivingWillPage extends LivingWillPageOr {
    public WebUtil wt;
	public LivingWillPage(WebUtil util) {
		super(util);
		this.wt=util;
	
	}

	public void VerifyLivingWillDetailsPage() {
		wt.click(LivingWillDrawer, "Living will drawer");
		wt.holdOn(Duration.ofSeconds(5));
		wt.verifyInnerText(LivingWillHeaderMessage, "Please identify your choices for your living will.", "Living will Page");
	}
	public void verifyIWantMaximumTreatmentNo() {
		wt.click(LivingWillDrawer, "Living will drawer");
		wt.waitUntilTextPresentInUI(LivingWillHeaderMessage, "Please identify your choices for your living will.");
		wt.click(ClientIWantmaximumTreatmentNo, "I want maximum treatment Yes radio button");
		wt.verifyEnabled(ClientIWantLifeSupportYes);
		wt.verifyElementRadioButtonSelected(ClientCPRDoWantRadioButton, "CPR Don't want radio button");
		wt.verifyElementRadioButtonSelected(ClientProvidedHydrationDoWant, "Artificially provided hydration? Don't Want");
		wt.verifyElementRadioButtonSelected(ClientprovidedNutritionDoWant, "Artificially provided nutrition? Don't want");
		wt.verifyElementRadioButtonSelected(ClientAntibolocTreatmentDoWant, "Antibiotic treatment for side conditions? Don't Want");
		wt.verifyElementRadioButtonSelected(ClientHeroicsMessareDoWant, "Other heroic measures? Don't Want");
		
	}
	public void verifyIWantMaximumTreatmentYes() {
		wt.click(LivingWillDrawer, "Living will drawer");
		wt.waitUntilTextPresentInUI(LivingWillHeaderMessage, "Please identify your choices for your living will.");
		wt.click(ClientIWantmaximumTreatmentYes, "I want maximum treatment Yes radio button");
		wt.verifyEnabled(ClientIWantLifeSupportYes);
		wt.verifyElementRadioButtonSelected(ClientCPRDoWantRadioButton, "CPR Yes radio button");
		wt.verifyElementRadioButtonSelected(ClientProvidedHydrationDoWant, "Artificially provided hydration? Do want");
		wt.verifyElementRadioButtonSelected(ClientprovidedNutritionDoWant, "Artificially provided nutrition? Do want");
		wt.verifyElementRadioButtonSelected(ClientAntibolocTreatmentDoWant, "Antibiotic treatment for side conditions? Do Want");
		wt.verifyElementRadioButtonSelected(ClientHeroicsMessareDoWant, "Other heroic measures? Do Want");
	}
	public void saveAndContinueIWantMaximumTreatMentYes() {
		wt.click(LivingWillDrawer, "Living will drawer");
		wt.waitUntilTextPresentInUI(LivingWillHeaderMessage, "Please identify your choices for your living will.");
		wt.click(ClientIWantmaximumTreatmentYes, "I want maximum treatment Yes radio button");
		wt.click(SpouseIWantmaximumTreatmentYes, "I want maximum treatment Yes Radio button");
		wt.click(SaveAndContinueButton, "Save and Continue");
	}
	public void SaveAndContinueIWantMaximumTreatMentNo() {
		wt.click(LivingWillDrawer, "Living will drawer");
		wt.waitUntilTextPresentInUI(LivingWillHeaderMessage, "Please identify your choices for your living will.");
		wt.click(ClientIWantmaximumTreatmentNo, "I want maximum treatment No Radio Button");
		wt.click(SpouseIWantmaximumTreatmentNo, "I want maximum treatment No Radio Button ");
		wt.click(SaveAndContinueButton, "Save and Continue button");
		
	}
	/////
	public void SaveAndProceedOrganDonationDetails() {
		wt.click(LivingWillDrawer, "Living will drawer");
		wt.waitUntilTextPresentInUI(LivingWillHeaderMessage, "Please identify your choices for your living will.");
		wt.click(ClientIWantmaximumTreatmentYes, "I want maximum treatment Yes radio button");
		wt.click(SpouseIWantmaximumTreatmentYes, "I want maximum treatment Yes Radio button");
		wt.click(nextorganDonationDetailsButton, "Next: Organ donation details button");
		wt.holdOn(Duration.ofSeconds(5));
		wt.verifyInnerText(organDonationDetailsPageMessage, "Please identify your choices for organ donation.", "Organ donantion page message");
	}
	
	
}
