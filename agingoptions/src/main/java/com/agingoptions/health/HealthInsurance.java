package com.agingoptions.health;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HealthInsurance {

	private WebUtil util;

	public HealthInsurance(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="(//span[text()='Health Insurance'])[1]/parent::div")
	private WebElement healthInsuranceSideBarLink;
	
	public void clickHealthInsuranceSideBarLink() {
		util.clickButtonAfterCheckingEnable(healthInsuranceSideBarLink);
		util.click(healthInsuranceSideBarLink, "Health Insurance");
	}
	
	@FindBy(xpath="//button[text()='Add Health Insurance']")
	private WebElement addHealthInsuranceBT;
	
	public void clickAddHealthInsuranceButton() {
		util.click(addHealthInsuranceBT, "Health Insurance");
	}
	
	
	

}
