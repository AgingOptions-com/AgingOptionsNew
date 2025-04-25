package com.agingoptions.LegalInfoPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		wt.click(ClientIsBurialCremationPrepaid, "Is burial Or cremation prepaid yes radio button");
		wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse- Is burial cremation prepaid Yes radio button");
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
		wt.click(ClientIsBurialCremationPrepaid, "Is burial Or cremation prepaid yes radio button");
		wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse- Is burial cremation prepaid Yes radio button");
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
		wt.click(ClientIsBurialCremationPrepaid, "Is burial Or cremation prepaid yes radio button");
		wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse- Is burial cremation prepaid Yes radio button");
		wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse- Is burial cremation prepaid Yes radio button");
		wt.click(ClientOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT, "Client-Often the organization you prepaid your burial or cremation No radio button");
		wt.click(SposueOftenYouOrganizationYouPrepaidYourBurial_NoRadioBT, "Spouse-Often the organization you prepaid your burial or cremation No radio button");
		wt.click(ClientDidTheCompanyGiveYouContract_NoRadioBT, "Client-Did the company the give you contract No Radio button");
		wt.click(SpouseDidTheCompanyGiveYouContract_NoRadioBT, "Spouse-Did the company the give you contract No Radio button");
		wt.verifyInnerText(ClientDidTheCompanyGiveYouContact_NoRadioBTVerificationMessage, "You may want to ask them to give you a copy of the trust or fund in which the purchase price has been placed. Federal Law requires them to provide", "You may want to ask them to give you a copy of the trust or fund in which the purchase price has been placed....warning message");
		wt.verifyInnerText(SpouseDidTheCompanyGiveYouContact_NoRadioBTVerificationMessage, "You may want to ask them to give you a copy of the trust or fund in which the purchase price has been placed. Federal Law requires them to provide", "You may want to ask them to give you a copy of the trust or fund in which the purchase price has been placed.--message");
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
		wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(ClientWouldYouLikeToMakeArrangementYesRadioBt, "Client- Would you like to make arrangement-Yes radio button");
		wt.click(SpouseWouldYouLikeToMakeArrangementYesRadioBt, "Spouse- Would you like to make arrangement -No radio button");
		wt.verifyInnerText(ClientWouldYouLikeMakeArragement_YesRadioBTVerificationMessage, "Would you like to have someone contact you with information about funeral arrangements ?", "Would you like to have someone contact you with information... questions");
		wt.verifyInnerText(SpouseWouldYouLikeMakeArragement_YesRadioBTVerificationMessage, "Would you like to have someone contact you with information about funeral arrangements ?", "Would you like to have someone contact you with information ..Questions");
	}
	public void verifyWouldYouLikeMakeArrangementNoChecked() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation drawer");
		wt.openAccordion(CemetryArrangementAccordian, "cemetry arrangement accordian");
		wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangements for handling of remains with any funeral....No radio button");
	   wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
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
		wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(ClientWouldYouLikeToMakeArrangementYesRadioBt, "Client- Would you like to make arrangement-Yes radio button");
		wt.click(SpouseWouldYouLikeToMakeArrangementYesRadioBt, "Spouse- Would you like to make arrangement -No radio button");
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
		wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangements for handling of remains with any funeral....No radio button");
		wt.click(ClientWouldYouLikeToMakeArrangementYesRadioBt, "Client- Would you like to make arrangement-Yes radio button");
		wt.click(SpouseWouldYouLikeToMakeArrangementYesRadioBt, "Spouse- Would you like to make arrangement -No radio button");
		wt.click(ClientWouldYouLikeToMakeArrangementYesRadioBt, "Client- Would you like to make arrangement-Yes radio button");
		wt.click(SpouseWouldYouLikeToMakeArrangementYesRadioBt, "Spouse- Would you like to make arrangement -No radio button");
		wt.click(ClientWouldYouLikeToHaveContactSomeone_NoRadioBT, "Client-Would you like to have someone contact you... No radio button");
		wt.click(SpouseWouldYouLikeToHaveContactSomeone_NoRadioBT, "Spouse-Would you like to have someone contact you....No radio button");
		wt.verifyInnerText(ClientWouldYouLikeToHaveSomeoneNoRadioBT_VerificationMessage, "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.", "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.-Message");
		wt.verifyInnerText(SpouseWouldYouLikeToHaveSomeoneNoRadioBT_VerificationMessage, "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.", "We strongly suggest you take the initiative and get this detail addressed.  It will go a long way to ensure that your needs are less of a burden to loved ones, and you will likely also save your estate assets in the meanwhile.-Message");

	}

	public void AddLifeInsuranceDetails() {
		wt.click(FinanceButtonUnderSetup, "Finance button Under setup");
		wt.holdOn(Duration.ofSeconds(4));
		wt.click(LifeInsuranceDrawer, "LifeInsurance drawer");
		wt.holdOn(Duration.ofSeconds(7));
		wt.click(AddButton, "Add policy button");
		wt.holdOn(Duration.ofSeconds(8));
		wt.click(SameAsSpouseCheckBox, "Same as spouse check box");
		wt.driver.findElement(By.xpath("(//img[@alt='Dropdown icon'])[1]")).click();
		wt.driver.findElement(By.xpath("//ul[@id='dropDownDivId']//li[text()='Chubb INA Group']")).click();
		wt.driver.findElement(By.xpath("(//img[@alt='Dropdown icon'])[2]")).click();
		wt.driver.findElement(By.xpath("//ul[@id='dropDownDivId']//li[text()='Variable Life']")).click();
		wt.driver.findElement(By.xpath("//input[@placeholder='Enter number ']")).sendKeys("67859383778");
		wt.driver.findElement(By.xpath("(//img[@alt='Calendar Icon'])[1]")).click();
		WebElement we= wt.driver.findElement(By.xpath("(//select[@class='tabFocus'])[2]"));
		Select sel= new Select(we);
		sel.selectByVisibleText("2016");
		wt.driver.findElement(By.xpath("(//div[text()='2'])[1]")).click();
		wt.driver.findElement(By.xpath("(//img[@alt='Calendar Icon'])[2]")).click();
		WebElement we2=  wt.driver.findElement(By.xpath("(//select[@class='tabFocus'])[4]"));
		Select sel1= new Select(we2);
		sel1.selectByVisibleText("2018");
		wt.driver.findElement(By.xpath("(//div[text()='11'])[2]")).click();
		wt.driver.findElement(By.xpath("//button[text()='Save and Continue later']")).click();
		wt.holdOn(Duration.ofSeconds(8));
		wt.driver.findElement(By.xpath("(//span[text()='Legal'])[1]")).click();
		wt.holdOn(Duration.ofSeconds(6));
		wt.click(BurialCremationPlanDrawer, "burial cremation plan drawer");
		wt.holdOn(Duration.ofSeconds(2));
		wt.click(BurialCremationAccordian, "burial cremation accordian");

	}
	public void IsThereAnyPlanAssociatedWithLifeInsuranceYes() {
		AddLifeInsuranceDetails();
        wt.click(ClientIsBurialCremationPrepaid, "Client is burial cremation prepaid Yes radio button");
        wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse Is burial cremation prepaid -Yes radio button");
        wt.click(ClientOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt, "Client-Often the organization you prepaid your burial or cremation -Yes radio button");
        wt.click(SposueOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt, "Spouse-Often the organization you prepaid your burial or cremation-Yes radio button");
        wt.click(ClientIsThereAnyPlanAssosited_YesRadioBT, "Client-Is there any plan associated With life insurance policy-Yes radio button");
        wt.click(SpouseIsThereAnyPlanAssosited_YesRadioBT, "Spouse -Is there any plan associated with life insurance policy-Yes radio button");
	/////incomplete
	}
	public void saveAndContinueBurialCremationPlanDetails() {
		wt.click(BurialCremationPlanDrawer, "Burial cremation plan drawer");
		wt.openAccordion(HandlingOfRemains, "Handling of remains accordian");
		wt.click(ClientBurialRadioBT, "Client burial  radio button");
		wt.click(SpouseBurialRadioBT, "Spouse radio button");
		wt.click(ClientDoYouWishToHaveFuneralService_YesradioBt, "Client-Do you wish to have a funeral/memorial service?-Yes radio button");
		wt.click(SpouseDoYouWishToHaveFuneralService_YesradioBt, "Spouse-Do you wish to have a funeral/memorial service?- yes radio button");
		wt.openAccordion(BurialCremationAccordian, "Burial cremation plan accordian");
		wt.click(ClientDoYouHaveBurialPlotOrNiche_YesRadioBT, "Client do you have burial plot niche-Yes radio button");
		wt.click(SposueDoYouHaveBurialPlotOrNiche_YesRadioBT, "Spouse Do you have burial plot or niche-Yes radio button");
		wt.sendValue(ClientNameOfContactTB, "Ravish","Name of contact");
		wt.sendValue(SposueNameOfContactTB, "mahavish", "Spouse-Name of contact");
		wt.sendValue(ClientNameOfCemetryHome, "Dasaswmegh", "Client-Name of cemetry");
		wt.sendValue(SpouseNameOFCemetryHome, "Harishchandra ", "Spouse-Name of cemetry");
		wt.sendValue(ClientContactNumber, "9856786756", "Client-contact number");
		wt.sendValue(SposueContactNumber, "9845678756", "Spouse-Contact number");
		wt.sendValue(ClientPhoneNumber, "9845092341", "Client-Phone number");
		wt.sendValue(SposuePhoneNumber, "8745623457", "Spouse-Phone number");
		wt.sendValue(ClientAddress, "34 St - Herald Sq, New York, NY, USA, 10001", "Client-Address");
		wt.sendValue(SposueAddress, "34 St - Herald Sq, New York, NY, USA, 10001", "Spouse-Address");
		wt.sendValue(ClientWebSite, "ac.com", "Client- Website text box");
		wt.sendValue(SposueWebSite, "ab.com", "Spouse -Website text box");
		wt.sendValue(ClientFaxNumber, "8767737378", "Client- fax number");
		wt.sendValue(SposueFaxNumber, "8993939398", "Spouse-Fax number");
	    wt.sendValue(ClientDescription, "Nothing to say ", "Client- description");
	    wt.sendValue(SposueDescription, "Nothing to say", "Spouse Description");
	    wt.click(ClientIsBurialCremationPrepaid, "Client-Is burial cremation prepaid : yes radio button");
	    wt.click(SposueIsBurialCremationPrepaid_YesRadioBT, "Spouse-Is burial cremation prepaid");
	    wt.click(ClientOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt, "Client-Often the organization you prepaid your burial or cremation -Yes radio button");
	    wt.click(SposueOftenYouOrganizationYouPrepaidYourBurial_YesRadioBt, "Spouse-Often the organization you prepaid your burial or cremation -Yes radio button");
	    wt.click(ClientIsThereAnyPlanAssosited_YesRadioBT, "Client-Is there any plan associated with a life insurance policy?-Yes radio button");
	    wt.click(SpouseIsThereAnyPlanAssosited_YesRadioBT, "Spouse-Is there any plan associated with a life insurance policy?-Yes radio button");
	    wt.sendValue(ClientIsThereAnyPlanAssociated_InsuranceCompanyName, "Sahara", "Client-Insurance name field");
	    wt.sendValue(SpouseIsThereAnyPlanAssociated_InsuranceCompanyName, "flores", "Spouse-Insurance name field");
	    wt.sendValue(ClientIsThereAnyPlanAssociated_ContractNumber, "8949993939", "Contract number");
	    wt.sendValue(SpouseIsThereAnyPlanAssociated_ContractNumber, "8949993989", "Contract number");
	    wt.click(ClientIsThereAnyPlanAssociatedCalenderdicon, "calender icon");
	    wt.click(ClientIsthereAnyPlanAssociated_date, "date select");
	    wt.click(SpouseIsThereAnyPlanAssociatedCalenderdicon, "calender icon");
	    wt.holdOn(Duration.ofSeconds(2));
	    wt.click(SpouseIsthereAnyPlanAssociated_date, "date select");
	    wt.sendValue(ClientIsthereAnyPlanAssociated_ContactNumber, "8976546745", "Contact number");
	    wt.sendValue(SpouseIsthereAnyPlanAssociated_ContactNumber, "9976546745", "Contact number");
	    wt.sendValue(ClientIsthereAnyPlanAssociated_Address, "34 St - Herald Sq, New York, NY, USA, 10001", "Address field");
	    wt.sendValue(SpouseIsthereAnyPlanAssociated_Address, "34 St - Herald Sq, New York, NY, USA, 10001", "Address field");
	    wt.sendValue(ClientIsthereAnyPlanAssociated_Website, "ab.com", "Website textbox");
	    wt.sendValue(SpouseIsthereAnyPlanAssociated_Website, "ab.com", "Website textbox");
	    wt.openAccordion(CemetryArrangementAccordian, "cemetry Arrangement accordian");
	    wt.click(ClientHaveYouMadeArrangement_NoRadioBT, "Client-Have you made arrangement -No radio button");
	    wt.click(SpouseHaveYouMadeArrangement_NoRadioBT, "Spouse-Have you made arrangement -No radio button");
	    wt.click(ClientWouldYouLikeToMakeArrangementYesRadioBt, "Client- would you like to make arrangement");
	    wt.click(SpouseWouldYouLikeToMakeArrangementYesRadioBt, "Spouse- would you like to make arrangement");
	    wt.click(ClientWouldYouLikeToHaveSomeOneToContact_YesRadioBT, "Client-Would you like to have someone contact you with information about funeral arrangements ?-Yes radio button");
	    wt.click(SpouseWouldYouLikeToHaveSomeOneToContact_YesRadioBT, "Spouse-Would you like to have someone contact you with information about funeral arrangements ?-Yes radio button");
	    wt.click(SaveAndContinueBT, "Save and continue button");
	    
	}
	
}
