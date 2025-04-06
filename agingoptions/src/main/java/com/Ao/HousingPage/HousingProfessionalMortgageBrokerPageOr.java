package com.Ao.HousingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingProfessionalMortgageBrokerPageOr {

	public HousingProfessionalMortgageBrokerPageOr( WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
		
	}
	@FindBy(xpath="//div[@class='prof-count']")
	protected WebElement ProfessionalCount;
	@FindBy(xpath="//div[@class='i-dont-have-one']//p")
	protected WebElement IdoNotHaveOneInnerText;
	@FindBy(xpath="//span[text()='Housing Professionals']")
	protected WebElement HousingProfessionalButton;
	@FindBy(xpath="//span[text()='Mortgage Broker']")
	protected WebElement MortgageBrokerSection;
	@FindBy(xpath="//input[@name='iDontHaveOne']")
	protected WebElement IDonothaveCheckBox;
	@FindBy(xpath="//div[@class='btn-div addBorderToToggleButton ms-auto']//button[@class='view-btn active selectedToglleBorder']")
	protected WebElement highlightedtoggleButton;
	@FindBy(xpath="//div[@class='btn-div addBorderToToggleButton ms-auto']//button[@class='view-btn ']")
	protected WebElement NonHighlighted;
	
}
