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

	@FindBy(xpath = "//p[contains(text(),'Are you comfortable with your current financial plan?')]/following-sibling::div/label/p[contains(text(),'Yes')]")
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
   
   


}
