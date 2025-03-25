package com.agingoptions.lpolandingpage;

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
	
	@FindBy(xpath="(//span[text()='Health'])[1]")
	private WebElement healthModule;
	
	public void clickHealhtModule() {
	util.clickJavaScript(healthModule, "Health Module");
	}
	
}
