package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class LegalProfessionalElderLawAttorneyPageOr {

	public LegalProfessionalElderLawAttorneyPageOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
	}
	
	@FindBy(xpath="//span[text()='Legal Professionals']")
	protected WebElement LegalProfessionalDrawer;
	
	@FindBy(xpath="//span[text()='Elder Law Attorney']")
	protected WebElement ElderLawAttorneyDrawer;
	
	@FindBy(xpath="//p[text()='Elder Attorneys ']")
	protected WebElement ElderatorneyText;
	
	@FindBy(xpath="//div[@class='prof-count']")
	protected WebElement ProfessionalCount;
	@FindBy(xpath="//div[@class='i-dont-have-one']//p")
	protected WebElement IdoNotHaveOneInnerText;
	
	
	@FindBy(xpath="//input[@name='iDontHaveOne']")
	protected WebElement IDonothaveCheckBox;
	@FindBy(xpath="//div[@class='btn-div addBorderToToggleButton ms-auto']//button[@class='view-btn active selectedToglleBorder']")
	protected WebElement highlightedtoggleButton;
	@FindBy(xpath="//div[@class='btn-div addBorderToToggleButton ms-auto']//button[@class='view-btn ']")
	protected WebElement NonHighlighted;
}
