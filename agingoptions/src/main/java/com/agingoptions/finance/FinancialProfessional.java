package com.agingoptions.finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FinancialProfessional {

	private WebUtil util;

	public FinancialProfessional(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util = util;
	}

	@FindBy(xpath = "(//p[contains(text(),'Who makes the financial planning decision in the house?')]/parent::div//div/label)[1]")
	private WebElement primaryWhoMakesTheFinancialPlanningDesicionRadioBT;

	public void clickWhoMakesTheFinancialPlanningDesicionRadioBT() {
		util.click(primaryWhoMakesTheFinancialPlanningDesicionRadioBT,"Who makes the financial planning decision in the house?");
	}

	@FindBy(xpath = "//p[contains(text(),'Are you looking to find a new planner?')]/following-sibling::div/label/p[contains(text(),'Yes')]")
	private WebElement areYouLookingToFindNewPlannerYesRadioBT;

	public void clickAreYouLookingToFindNewPlannerYesRadioBT() {
		util.click(areYouLookingToFindNewPlannerYesRadioBT, "Are you looking to find a new planner?");
	}

	@FindBy(xpath = "//p[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'are you comfortable with your current financial advisor?')]/following-sibling::div/label/p[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'yes')]")
	private WebElement areYouComfortableWithYourCurrentYesRadioBT;

	public void clickAreYouComfortableWithYourCurrentYesRadioBT() {
		util.click(areYouComfortableWithYourCurrentYesRadioBT, "Are you comfortable with your current financial plan?");
	}

	@FindBy(xpath = "//p[contains(text(),'Do you worry about the adequacy of your assets?')]/following-sibling::div/label/p[contains(text(),'Yes')]")
	private WebElement doYouWorryAboutTheAdequacyYesRadioBT;

	public void clickDoYouWorryAboutTheAdequacyOfYourAssetsRadioBT() {
		util.click(doYouWorryAboutTheAdequacyYesRadioBT, "Do you worry about the adequacy of your assets?");
	}

	@FindBy(xpath = "//p[contains(text(),'Do you understand your investment costs?')]/following-sibling::div/label/p[contains(text(),'Yes')]")
	private WebElement doYouUnderstandYourInvestmentCostsYesRadioBT;

	public void clickdoYouUnderstandYourInvestmentCostsYesRadioBT() {
		util.click(doYouUnderstandYourInvestmentCostsYesRadioBT, "Do you understand your investment costs?");
	}

	@FindBy(xpath="//p[contains(text(),'comfortable making these decisions without help?')]/parent::div//p[contains(text(),'Yes')]")
	private WebElement isSpouseComfortableMakingTheseDecisionYesRadioBT;

	public void clickDoYouUnderstandYourInvestementCostsYesRadioBT() {
		util.click(isSpouseComfortableMakingTheseDecisionYesRadioBT, "Is Richa Nigam comfortable making these decisions without help?");
	}

	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement saveBT;

	public void clickSaveBT() {
		util.click(saveBT, "Save");
	}

	@FindBy(xpath="//input[@id='fName']")
	private WebElement firstNameTB;

	@FindBy(xpath="//input[@id='lName']")
	private WebElement lastNameTB;

	@FindBy(xpath="//input[@id='business']")
	private WebElement businessNameTB;

	@FindBy(xpath="//input[@id='websiteLink']")
	private WebElement websiteLinkTB;

	@FindBy(xpath="//input[@id='used']")
	private WebElement howLongHaveYouUseAdvisorTB; 

	@FindBy(xpath="//textarea[@id='instructionsToAgent']")
	private WebElement notesForAgentTB;

	@FindBy(xpath="//p[contains(text(),'Do you worry about the adequacy of your assets?')]/following-sibling::div/label/p[contains(text(),'No')]")
	private WebElement areYouComfortableWithYourCurrentFinancialAdvisorYesRadioBT;

	@FindBy(xpath="//p[contains(text(),'Do you worry about the adequacy of your assets?')]/following-sibling::div/label/p[contains(text(),'No')]")
	private WebElement doYouWorryAboutTheAdequacyOfYourAssetsNoRadioBT;

	@FindBy(xpath="//p[contains(text(),'Do you consider your Financial Advisor to be anything more than an investment advisor?')]/following-sibling::div/label/p[contains(text(),'Unsure')]")
	private WebElement doYouConsiderYourFinancialAdvisorToBeAnythingUnsureRadioBT;

	@FindBy(xpath="//p[contains(text(),'Will there be a continuity of services if this advisor retires, becomes disabled, or dies?')]/following-sibling::div/label/p[contains(text(),'Yes')]")
	private WebElement willThereBeAContinuityOfServicesYesRadioBT;

	@FindBy(xpath="//p[contains(text(),'Are you open to as second opinion?')]/following-sibling::div/label/p[contains(text(),'No')]")
	private WebElement AreYouOpenToAsSecondOpinionNoRadioBT;

	@FindBy(xpath="//p[contains(text(),'Do you understand your investment costs?')]/following-sibling::div/label/p[contains(text(),'Unsure')]")
	private WebElement doYouUnderstandYourInvestmentCostsUnsureRadioBT;

	public void inputFirstName(String value) {
		util.sendValue(firstNameTB, value, "First Name");
	}

	public void inputNotesForAgents(String value) {
		util.sendValue(notesForAgentTB, value, "Notes For Agents");
	}

	public void inputLastName(String value) {
		util.sendValue(lastNameTB, value, "Last Name");
	}

	public void inputBusinessName(String value) {
		util.sendValue(businessNameTB, value, "Business Name");
	}

	public void inputWebSiteName(String value) {
		util.sendValue(websiteLinkTB, value, "Website Link");
	}

	public void inputHowLongHaveYouUsedThisAdvisorTB(String value) {
		util.sendValue(howLongHaveYouUseAdvisorTB, value, "How long have you used this advisor?");
	}

	public void clickAreYouComortableWithYourCurrentFinancialAdvisorYesRadioBT() {
		util.click(areYouComfortableWithYourCurrentFinancialAdvisorYesRadioBT,"Are you comfortable with your current Financial Advisor?");	
	}

	public void clickDoYouWorryAboutTheAdequecyNoRadioBT() {
		util.click(doYouWorryAboutTheAdequacyOfYourAssetsNoRadioBT, "Do you worry about the adequacy of your assets?");	
	}

	public void clickDoYouConsiderYourFinacialAdvisorUnsureRadioBT() {
		util.click(doYouConsiderYourFinancialAdvisorToBeAnythingUnsureRadioBT, "Do you consider your Financial Advisor to be anything more than an investment advisor?");	
	}

	public void clickWillThereBeAContinuityOfServicesIfThisYesRadioBT() {
		util.click(willThereBeAContinuityOfServicesYesRadioBT, "Do you consider your Financial Advisor to be anything more than an investment advisor?");	
	}

	public void clickAreYouOpenToSecondOpinionNoRadioBT() {
		util.click(AreYouOpenToAsSecondOpinionNoRadioBT, "Are you open to as second opinion?");	
	}

	public void clickDoYouUnderstandYourInvestmentCostsUnsureRadioBT() {
		util.click(doYouUnderstandYourInvestmentCostsUnsureRadioBT, "");	
	}

	@FindBy(xpath="//button[contains(text(),'Add Financial Advisor')]")
	private WebElement addFinancialAdvisorBT;

	public void clickAddFinancialAdvisorBT() {
		util.click(addFinancialAdvisorBT, "Add Financial Advisor");
	}

	@FindBy(xpath="//td[contains(text(),'Anshu Finance Advisor')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement anshuFinanceEditIcon;

	public void clickAnshuFinanceEditIcon() {
		util.click(anshuFinanceEditIcon, "Edit Icon");
	}

	public String getProfessionalFirstName() {
		String firstName=	util.GetAttributevalue(firstNameTB, "value");
		return firstName;
	}

	public String getProfessionalLastName() {
		String lastName=	util.GetAttributevalue(lastNameTB, "value");
		return lastName;
	}

	public String getProfessionalBusinessName() {
		String firstName=	util.GetAttributevalue(businessNameTB, "value");
		return firstName;
	}

	public String getProfessionalWebsiteLink() {
		String lastName=	util.GetAttributevalue(websiteLinkTB, "value");
		return lastName;
	}

	public String getProfessionalHowLongHaveYouUsedThisAdvisor() {
		String lastName=	util.GetAttributevalue(howLongHaveYouUseAdvisorTB, "value");
		return lastName;
	}

	public String getProfessionalNotesForAgents() {
		String lastName=	util.GetAttributevalue(notesForAgentTB, "value");
		return lastName;
	}

	@FindBy(xpath="//td[contains(text(),'Aman Roy Advisor')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement amanFinanceEditIcon;

	public void clickAmanFinanceEditIcon() {
		util.click(amanFinanceEditIcon, "Edit Icon");
	}

	@FindBy(xpath="//button[contains(text(),'Save & Proceed to Accountant')]")
	private WebElement saveProceedToAccountantBT;

	public void clickSaveProceedToAccountant() {
		util.click(saveProceedToAccountantBT, "Save & Proceed to Accountant");
	}

	@FindBy(xpath="//span[contains(text(),'Financial Advisor')]")
	private WebElement financialAdvisorLink;

	public void clickFinancialAdvisorSideBarLink() {
		util.click(financialAdvisorLink, "Financial Advisor");
	}

	@FindBy(xpath="//td[contains(text(),'Rohan Yadav Advisor')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement rohanFinanceEditIcon;

	public void clickRohanFinanceEditIcon() {
		util.click(rohanFinanceEditIcon, "Edit Icon");
	}

	@FindBy(xpath="//p[contains(text(),'Are you looking for a new Accountant?')]/parent::div//p[contains(text(),'Yes')]")
	private WebElement areYouLookingNewAccountantYesRadioBT;

	public void clickAreYouLookingNewAccountantYesRadioButton() {
		util.click(areYouLookingNewAccountantYesRadioBT, "Are you looking for a new Accountant?");
	}

	@FindBy(xpath="(//p[contains(text(),'Who files the taxes?')]/parent::div//label/p)[1]")
	private WebElement whoFilesTheTaxesPrimaryMemberRadioBT;

	public void clickWhoFilesTheTaxesPrimaryMemberRadioButton() {
		util.click(whoFilesTheTaxesPrimaryMemberRadioBT, "Who files the taxes?");
	}

	@FindBy(xpath="(//p[contains(text(),'Who pays the bills in the house?')]/parent::div//label/p)[1]")
	private WebElement WhoPayTheBillsInTheHousePrimaryMemberRadioBT;

	public void clickWhoPayTheBillsInTheHousePrimaryMemberRadioButton() {
		util.click(whoFilesTheTaxesPrimaryMemberRadioBT, "Who files the taxes?");
	}

	@FindBy(xpath="//button[contains(text(),'Add Accountant')]")
	private WebElement addAccountantBT;

	public void clickAddAccountantBT() {
		util.click(addAccountantBT, "Add Accountant Button");
	}

	@FindBy(xpath="//p[contains(text(),'Are you happy with this Accountant?')]/parent::div//p[contains(text(),'Yes')]")
	private WebElement areYouHappyWithThisAccountantYesRadioBT;

	public void clickAreYouHappyWithThisAccountantYesRadioButton() {
		util.click(areYouHappyWithThisAccountantYesRadioBT, "Are you happy with this Accountant?");
	}

	@FindBy(xpath="//p[contains(text(),'Will there be a continuity of services if this Accountant retires, becomes disabled, or dies?')]/parent::div//p[contains(text(),'Yes')]")
	private WebElement willThereBeContinuityServiceAccountantYesRadioButton;

	public void clickWillThereBeContinuityServiceYesRadioButton() {
		util.click(willThereBeContinuityServiceAccountantYesRadioButton, "Will there be a continuity of services if this Accountant retires, becomes disabled, or dies?");
	}

	@FindBy(xpath="//td[contains(text(),'Edward Jones')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement edwardJonesAccountantEditIcon;

	public void clickEdwardJonesEditIcon() {
		util.click(edwardJonesAccountantEditIcon, "Edit Icon");
	}

	@FindBy(xpath="//td[contains(text(),'Fisher Investments Accountant')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement fisherInvestmentAccountantEditIcon;

	public void clickfisherInvestmentEditIcon() {
		util.click(fisherInvestmentAccountantEditIcon, "Edit Icon");
	}

	@FindBy(xpath="//button[contains(text(),'Save & Proceed to Bookkeeper')]")
	private WebElement saveProceedToBookKeeperBT;

	public void clickSaveProceedToBookKeeperButton() {
		util.click(saveProceedToBookKeeperBT, "Save Proceed To Bookkeeper Button");
	}

	@FindBy(xpath="//td[contains(text(),'Betterment Premium Accountant')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement bettermentPremiumAccountantEditIcon;

	public void clickBettermentPremiumEditIcon() {
		util.click(bettermentPremiumAccountantEditIcon, "Edit Icon");
	}

	@FindBy(xpath="//span[contains(text(),'Bookeeper')]")
	private WebElement bookkeeprSideBarLink;

	public void clickBookKeeparSideBarLink() {
		util.click(bookkeeprSideBarLink, "Bookeeper");
	}

	@FindBy(xpath="//button[contains(text(),'Add Bookkeeper')]")
	private WebElement addBookkeeperBT;

	public void clickAddBookeeparBT() {
		util.click(addBookkeeperBT, "Add Bookkeeper Button");
	}

	@FindBy(xpath="//p[contains(text(),'Are you happy with this Bookkeeper?')]/parent::div//p[contains(text(),'Yes')]")
	private WebElement areYouHappyWithThisBookeeperYesRadioBT;

	public void clickAreYouHappyWithThisBookkeeperYesRadioButton() {
		util.click(areYouHappyWithThisBookeeperYesRadioBT, "Are you happy with this Bookkeeper?");
	}

	@FindBy(xpath="//p[contains(text(),'Will there be a continuity of services if this Bookkeeper retires, becomes disabled, or dies?')]/parent::div//p[contains(text(),'Yes')]")
	private WebElement willThereBeContinuityServiceBookkeeperYesRadioButton;

	public void clickWillThereBeContinuityServiceBookkeeperYesRadioButton() {
		util.click(willThereBeContinuityServiceBookkeeperYesRadioButton, "Will there be a continuity of services if this Bookkeeper retires, becomes disabled, or dies?");
	}

	@FindBy(xpath="//td[contains(text(),'Bench Accounting')]/following-sibling::td//img[@alt='Edit Icon']")
	private WebElement BenchAccountingBookkeeperEditIcon;

	public void clickBenchAccountingEditIcon() {
		util.click(BenchAccountingBookkeeperEditIcon, "Edit Icon");
	}

	@FindBy(xpath="//button[contains(text(),'Save & Proceed to Legal')]")
	private WebElement saveProceedToLegalBT;

	public void clickSaveProceedToLegalButton() {
		util.click(saveProceedToLegalBT, "Save & Proceed to Legal");
	}
	
	

}
