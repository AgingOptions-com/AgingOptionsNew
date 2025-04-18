package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class LivingWillPageOr {

	public LivingWillPageOr(WebUtil wt) {
	PageFactory.initElements(wt.getDriver(), this);
	}
	
	@FindBy(xpath="//span[text()='Living Will Details']")
	protected WebElement LivingWillDrawer;
	@FindBy(xpath="(//span[@class='selectedUserName'])[1]//img")
	protected WebElement PrimaryMemberToggleButton;
	@FindBy(xpath="(//span[@class='selectedUserName'])[2]//img")
	protected WebElement spouseToggleButton;
	@FindBy(xpath="(//p[text()='Please identify your choices for your living will.'])[1]")
	protected WebElement LivingWillHeaderMessage;
	@FindBy(xpath="(//p[text()='Yes'])[1]")
	protected WebElement ClientIWantmaximumTreatmentYes;
	@FindBy(xpath="(//p[text()='Yes'])[3]")
	protected WebElement SpouseIWantmaximumTreatmentYes;
	@FindBy(xpath="(//p[text()='Yes'])[2]")
	protected WebElement ClientIWantLifeSupportYes;
	@FindBy(xpath="(//p[text()='Yes'])[4]")
	protected WebElement SpouseIWantLifeSupportYes;
	@FindBy(xpath="(//p[text()='No'])[1]")
	protected WebElement ClientIWantmaximumTreatmentNo;
	@FindBy(xpath="(//p[text()='No'])[3]")
	protected WebElement SpouseIWantmaximumTreatmentNo;
	@FindBy(xpath="(//p[text()='No'])[2]")
	protected WebElement ClientIWantLifeSupportNo;
	@FindBy(xpath="(//p[text()='No'])[4]")
	protected WebElement SpouseIWantLifeSupportNo;
	@FindBy(xpath="(//input[@type='checkbox' and @value='true'])[3]")
	protected WebElement ClientCPRDoWantRadioButton;
	@FindBy(xpath="(//input[@type='checkbox' and @value='true'])[4]")
	protected WebElement ClientProvidedHydrationDoWant;
	@FindBy(xpath="(//input[@type='checkbox' and @value='true'])[5]")
	protected WebElement ClientprovidedNutritionDoWant;
	@FindBy(xpath="(//input[@type='checkbox' and @value='true'])[6]")
	protected WebElement ClientAntibolocTreatmentDoWant;
	@FindBy(xpath="(//input[@type='checkbox' and @value='true'])[7]")
	protected WebElement ClientHeroicsMessareDoWant;
	@FindBy(xpath="//button[text()='Save & Continue later']")
	protected WebElement SaveAndContinueButton;
	@FindBy(xpath="(//p[text()='Please identify your choices for organ donation.'])[1]")
	protected WebElement organDonationDetailsPageMessage;
	@FindBy(xpath="//button[text()='Next: Organ donation details']")
	protected WebElement nextorganDonationDetailsButton;
	
	
	
	
	
}
