package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class OrganDonationPageOr {
  
	public OrganDonationPageOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
	}
	@FindBy(xpath="//span[text()='Organ Donation Details']")
	protected WebElement organDonationDetailDrawer; 
	
	@FindBy(xpath="(//p[text()='Please identify your choices for organ donation.'])[1]")
	protected WebElement organDonationDetailsPageVerificationMessage;
	
	@FindBy(xpath="(//input[@id='104'])[1]")
	protected WebElement ClientDoYouWishToBeAnOrganDonnerYesRadioButton;
	
	@FindBy(xpath="(//input[@id='104'])[2]")
	protected WebElement SpouseDoYouWishToBeAnOrganDonnerYesRadioButton;
	
	@FindBy(xpath="(//input[@id='105'])[1]")
	protected WebElement ClientDoYouWishToBeAnOrganDonnerNoRadioButton;
	
	@FindBy(xpath="(//input[@id='105'])[2]")
	protected WebElement SpouseDoYouWishToBeAnOrganDonnerNoRadioButton;
	
	@FindBy(xpath="(//input[@id='106'])[1]")
	protected WebElement ClientDonateYourBodyScientificResarchYes;
	
	@FindBy(xpath="(//input[@id='106'])[2]")
	protected WebElement SpouseDonateYourBodyScientificResarchYes;
	
	@FindBy(xpath="(//input[@id='107'])[1]")
	protected WebElement ClientDonateYourBodyScientificResarchNo;
	
	@FindBy(xpath="(//input[@id='107'])[2]")
	protected WebElement SpouseDonateYourBodyScientificResarchNo;
	
	@FindBy(xpath="//button[text()='Save & Continue later']")
	protected WebElement SaveAndContinueButton;
	
	@FindBy(xpath="//button[text()='Next: Burial cremation plan']")
	protected WebElement NextBurrialCremationPlan;
	
	@FindBy(xpath="//button[text()='Handling of remains']")
	protected WebElement HandlingOfRemainsBt;
}
