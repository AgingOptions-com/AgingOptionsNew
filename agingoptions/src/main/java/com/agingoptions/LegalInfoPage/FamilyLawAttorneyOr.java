package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FamilyLawAttorneyOr {
	public FamilyLawAttorneyOr(WebUtil wt){
		PageFactory.initElements(wt.getDriver(), this);	
	}
 
	@FindBy(xpath="(//p[text()='Family Law Attorney'])[2]")
	protected WebElement familyLawAttorneyText;
	@FindBy(xpath="//span[text()='Legal Professionals']")
	protected WebElement LegalProfessionalDrawer;
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
	@FindBy(xpath="//span[text()='Family Law Attorney']")
	protected WebElement familyLawAttorneyDrawer;
}
