package com.agingoptions.LegalInfoPage;

import com.nspl.agingoptions.webUtil.WebUtil;

public class BurrialCreamtionPlanPage extends BurialCremationPlanPageOr {
   public WebUtil wt;
	public BurrialCreamtionPlanPage(WebUtil util) {
		super(util);
		this.wt=util;
		
	}
	
	public void verifyBurialCremationPage() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation plan drawer");
		wt.verifyInnerText(HandlingOfRemains, "Handling of remains", "Handling of remains text");
	}

	public void verifyWhenWeCheckedCremationRadioButton() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.click(ClientHowWillYouRemainsDisposed_CremationRadioBT, "Client cremation radio button");
		wt.click(SpouseHowWillYouRemainsDisposed_CremationRadioBT, "Spouse cremation radio button");
	    wt.verifyInnerText(ClientWhatDoYouWantDoWithAshesText, "What do you want to do with the ashes ?", "Client-What do you want to do with the ashes question");
	    wt.verifyInnerText(SposueWhatDoYouWantDoWithAshesText, "What do you want to do with the ashes ?", "Spouse-What do you want to do with the ashes question");
	
	}
	public void VerifyDoYouHaveBurialPlotCheckYesRadio() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(BurialCremationAccordian, "Burial cremation accordian");
		wt.click(ClientDoYouHaveBurialPlotOrNiche_YesRadioBT, "Client-Do you have a burial plot or niche?");
		wt.click(SposueDoYouHaveBurialPlotOrNiche_YesRadioBT, "Spouse-Do you have a burial plot or niche?");
		wt.verifyInnerText(clientNameOfContactText, "Name of contact", "Name of Contact text");
	}
	
	public void VerifyDoYouHaveBurialPlotCheckNoRadioButton() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(BurialCremationAccordian, "Burial cremation accordian");
		wt.click(ClientDoYouHaveBurialPlotOrNiche_NoRadioBT, "Client-Do You Have Burial Plot or niche No radio button");
	    wt.click(SposueDoYouHaveBurialPlotOrNiche_NoRadioBT, "Spouse-Do You Have Burial Plot or niche No radio button");
	    wt.verifyInnerText(ClientDoYouHaveBurialPlotNo_Message, "We strongly suggest you take the initiative and get this detail addressed. It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.", "");
	    
	}
	
	public void VerifyIsYourBurialCremationPrepaid_YesChecked() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(BurialCremationAccordian, "Burial cremation accordian");
		wt.click(ClientIsBurialCremationPrepaid, "Is burial Or cremation prepaid yes radio button");
	    wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse- Is burial cremation prepaid Yes radio button");
	    wt.verifyInnerText(IsBurialCremationPrepaid_YesVerificationMessage, "Often the organization you prepaid your burial or cremation thorough will place the funds in a life insurance policy or in a trust. Did the company put the money in a life insurance policy ?", "Often the organization you prepaid your burial or cremation thorough .....Questions");
	    
	}
	public void verifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_YesRadioBT() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(BurialCremationAccordian, "Burial cremation accordian");
		wt.click(ClientIsBurialCremationPrepaid, "Is burial Or cremation prepaid yes radio button");
	    wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse- Is burial cremation prepaid Yes radio button");
	    wt.click(ClientOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt, "Client-Often the organization you prepaid your burial or cremation... questions");
	    wt.click(SposueOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt, "Spouse-Often the organization you prepaid your burial or cremation... questions");
	    wt.verifyInnerText(ClientIsThereAnyPlanAssositedText, "Is there any plan associated with a life insurance policy?", "Is there any plan associated with a life insurance policy? questions");
	    wt.verifyInnerText(SposueIsThereAnyPlanAssositedText, "Is there any plan associated with a life insurance policy?", "Is there any plan associated with a life insurance policy? questions");
	}
	public void verifyOftenTheOrganizationYouPrepaidYourBurialAndCremation_NoRadioChecked() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(BurialCremationAccordian, "Burial cremation accordian");
		wt.click(ClientIsBurialCremationPrepaid, "Is burial Or cremation prepaid yes radio button");
	    wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse- Is burial cremation prepaid Yes radio button");
	    wt.click(ClientOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT, "Client-Often the organization you prepaid your burial or cremation No radio button");
	    wt.click(SposueOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT, "Spouse-Often the organization you prepaid your burial or cremation No radio button");
	    wt.verifyInnerText(ClientOftenYouOrganizationYouPrepaidYourBurial_NoRadioBTVerificationText, "Did the company give you a contract?", "Did the company give you a contract? Questions");
	    wt.verifyInnerText(SposueOftenYouOrganizationYouPrepaidYourBurial_NoRadioBTVerificationText, "Did the company give you a contract?", "Did the company give you a contract? Questions");
	    
	}
	public void VerifyDidTheCompanyGiveYouAContractNoRadioChecked() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(BurialCremationAccordian, "Burial cremation accordian");
		wt.click(ClientIsBurialCremationPrepaid, "Is burial Or cremation prepaid yes radio button");
	    wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse- Is burial cremation prepaid Yes radio button");
	    wt.click(ClientOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT, "Client-Often the organization you prepaid your burial or cremation No radio button");
	    wt.click(SposueOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT, "Spouse-Often the organization you prepaid your burial or cremation No radio button");
	    wt.verifyInnerText(ClientDidTheCompanyGiveYouContact_NoRadioBTVerificationMessage, "You may want to ask them to give you a copy of the trust or fund in which the purchase price has been placed. Federal Law requires them to provide you this information.", "You may want to ask them to give you a copy of the trust or fund in which the purchase price has been placed....warning message");
		wt.verifyInnerText(SpouseDidTheCompanyGiveYouContact_NoRadioBTVerificationMessage, "You may want to ask them to give you a copy of the trust or fund in which the purchase price has been placed. Federal Law requires them to provide you this information.", "You may want to ask them to give you a copy of the trust or fund in which the purchase price has been placed.--message");
	}
	
	public void VerifyHaveYouMadeArrangementsForHandlingYesChecked() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(CemetryArrangementAccordian, "cemetry arrangement accordian");
		wt.click(ClientHaveYouMadeArrangement_YesRadioBT, "Client-Have you made arrangements for handling of remains with any funeral establishment or cemetery?...yes radio button");
		wt.click(SpouseHaveYouMadeArrangement_YesRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral establishment or cemetery?...yes radio button");
		wt.verifyInnerText(clientNameOfContactText, "Name of Contact", "Client-Name of contact questions");
		wt.verifyInnerText(SposueNameOfContactText, "Name of Contact", "Spouse-Name of contact question");
		
		
	}
	
	public void VerifyHaveYouMadeArrangementsForHandlingNoChecked() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(CemetryArrangementAccordian, "cemetry arrangement accordian");
		wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
	    wt.verifyInnerText(ClientHaveYouMadeArrangementHandlingOfRemains_NoRadioBtVerificationMsg, "Would you like to make arrangements ?", "Would you like to make arrangements ? Questions");
	    wt.verifyInnerText(SpouseHaveYouMadeArrangementHandlingOfRemains_NoRadioBtVerificationMsg, "Would you like to make arrangements ?", "Would you like to make arrangements ? Questions");
	}
	
	public void VerifyWouldYouLikeToMakeArrangementYes() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(CemetryArrangementAccordian, "cemetry arrangement accordian");
		wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
	   wt.click(ClientWouldYouLikeMakeArragement_YesRadioBT, "Client- Would you like to make arrangement-Yes radio button");
	   wt.click(SpouseWouldYouLikeToMakeArrangement_YesRadioBt, "Spouse- Would you like to make arrangement -No radio button");
	   wt.verifyInnerText(ClientWouldYouLikeMakeArragement_YesRadioBTVerificationMessage, "Would you like to have someone contact you with information about funeral arrangements ?", "Would you like to have someone contact you with information... questions");
	   wt.verifyInnerText(SpouseWouldYouLikeMakeArragement_YesRadioBTVerificationMessage, "Would you like to have someone contact you with information about funeral arrangements ?", "Would you like to have someone contact you with information ..Questions");
	}
	public void verifyWouldYouLikeMakeArrangementNoChecked() {
	wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
	wt.openAccordion(CemetryArrangementAccordian, "cemetry arrangement accordian");
	wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangements for handling of remains with any funeral....No radio button");
	wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
	wt.click(CLientWouldYouLikeToMakeArrangementNoRadioBT, "Client- Would you like to make arrangement No radio button");
	wt.click(SpouseWouldYouLikeToMakeArrangementNoRadioBT, "Spouse-Would you like to make arrangement Noradio button ");
	wt.verifyInnerText(ClientWouldYouLikeToMakeArrangment_NoRadioBTMessage, "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.", "We strongly suggest you take the initiative and get this detail addressed....warning message");
    wt.verifyInnerText(SpouseWouldYouLikeToMakeArrangment_NoRadioBTMessage, "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.", "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to....Warning message");
	}
	
	public void WouldYouLikeTohaveSomeoneContactYouYes() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(CemetryArrangementAccordian, "cemetry arrangement accordian");
		wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
		 wt.click(ClientWouldYouLikeMakeArragement_YesRadioBT, "Client- Would you like to make arrangement-Yes radio button");
		 wt.click(SpouseWouldYouLikeToMakeArrangement_YesRadioBt, "Spouse- Would you like to make arrangement -No radio button");
		 wt.click(ClientWouldYouLikeToHaveSomeOneToContact_YesRadioBT, "Client-Would you like to have someone contact you- yes radio button");
	     wt.click(SpouseWouldYouLikeToHaveSomeOneToContact_YesRadioBT, "Spouse- Would you like to have someone contact you- Yes radio button");
	     wt.verifyInnerText(ClientWouldYouLikeToHaveSomoneToContact_YesVerificationMessage, "We will get someone to call you", "We will get someone to call you -Message");
	     wt.verifyInnerText(SpouseWouldYouLikeMakeArragement_YesRadioBTVerificationMessage, "We will get someone to call you", "We will get someone to call you-Message");
	     
	
	}
	
	public void WouldYouLikeToHaveSomeOneContactYouNoChecked() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.click(Accordian, "Accordian");
		wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(ClientWouldYouLikeMakeArragement_YesRadioBT, "Client- Would you like to make arrangement-Yes radio button");
		wt.click(SpouseWouldYouLikeToMakeArrangement_YesRadioBt, "Spouse- Would you like to make arrangement -Yesradio button");
		wt.click(ClientWouldYouLikeToHaveContactSomeone_NoRadioBT, "Client-Would you like to have someone contact you... No radio button");
		wt.click(SpouseWouldYouLikeToHaveContactSomeone_NoRadioBT, "Spouse-Would you like to have someone contact you....No radio button");
		wt.verifyInnerText(ClientWouldYouLikeToHaveSomeoneNoRadioBT_VerificationMessage, "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.", "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.-Message");
	    wt.verifyInnerText(SpouseWouldYouLikeToHaveSomeoneNoRadioBT_VerificationMessage, "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.", "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.-Message");
	
	}
}
