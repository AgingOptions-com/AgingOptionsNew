package com.aginoptions.legalpage;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FiduciaryBeneficiaryPage {

	private WebUtil util;

	public FiduciaryBeneficiaryPage(WebUtil ut) {
		PageFactory.initElements(ut.getDriver(), this);
		this.util = ut;
	}

	@FindBy(xpath = "//span[contains(text(),'Fiduciary/Beneficiary')]")
	private WebElement fiduciaryBeneficiarySideBarLink;

	public void clickFiduciaryOrBeneficiaryLink() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(fiduciaryBeneficiarySideBarLink, "Fiduciary/Beneficiary");
	}

	@FindBy(xpath = "(//div[contains(text(),'Beneficiary')]/parent::td/div//input)[1]")
	private WebElement beneficiaryCheckBox;

	public void checkFiduciaryBeneficiaryCheckBox() {
		util.checkCheckBox(beneficiaryCheckBox, "Beneficiary Checkbox");
	}

	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	private WebElement proceedToSpouseBT;

	public void clickProceedToSpouseButton() {
		util.click(proceedToSpouseBT, "Proceed To Spouse Button");
	}

	@FindBy(xpath = "//button[contains(text(),'Proceed to Living Will Details')]")
	private WebElement proceedToLivingWillDetailsBT;

	public void clickProceedToLivingWillDetailsButton() {
		util.click(proceedToLivingWillDetailsBT, "Proceed To Living Will Details");
	}

	
	
}
