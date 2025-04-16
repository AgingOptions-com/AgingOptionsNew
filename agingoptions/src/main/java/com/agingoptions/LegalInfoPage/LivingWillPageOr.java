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
	
	
}
