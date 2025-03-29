package com.agingoptions.lpolandingpage;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class LpoLandingPage {

	private WebUtil util;

	public LpoLandingPage(WebUtil ut) {
		PageFactory.initElements(ut.getDriver(), this);
		this.util=ut;
	}

	@FindBy(xpath="(//span[text()='Health'])[1]/parent::div")
	private WebElement healthModule;

	public void clickHealthModule() {
		util.holdOn(Duration.ofSeconds(3));
		util.waitUntilPresentInUI(healthModule, "Health Module");
		util.waitUntilElementToBeClickable(healthModule);
		util.click(healthModule, "Health Module");
	}
	
	@FindBy(xpath="(//span[text()='Housing'])[1]")
	private WebElement housingModule;
	
	public void clickHousingModule() {
		util.holdOn(Duration.ofSeconds(3));
		util.waitUntilPresentInUI(housingModule, "Housing Module");
		util.waitUntilElementToBeClickable(housingModule);
		util.click(housingModule, "Housing Module");
	}

}
