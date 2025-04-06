package com.Ao.HousingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingProfessional_RealtorOr {

	
	public HousingProfessional_RealtorOr(WebUtil wt) {
	 PageFactory.initElements(wt.getDriver(), this);
	}
	
	
	@FindBy(xpath="//span[text()='Housing Professionals']")
	protected WebElement HousingProfessionalButton;
	
	@FindBy(xpath="//p[text()='Realtors']")
	protected WebElement RealtorsTextUnderTable;
	
	@FindBy(xpath="//input[@name='iDontHaveOne']")
	protected WebElement IDonothaveCheckBox;
	
	@FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[1]")
	protected WebElement primaryMemberToggleButton;
	
	@FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[2]")
	protected WebElement SpousetoggleButton;
	
	@FindBy(xpath="//div[text()='No Data Found']")
	protected WebElement NoDatafoundText;
	
	@FindBy(xpath="//div[@class='prof-count']")
	protected WebElement ProfessionalCount;
	
	@FindBy(xpath="//button[text()='Add Realtor']")
	protected WebElement AddRealtorButton;
	
	@FindBy(xpath="//div[@class='d-flex justify-content-end mt-3']/button")
	protected WebElement proceedtoButton;
	@FindBy(xpath="//div[@class='i-dont-have-one']//p")
	protected WebElement IdoNotHaveOneInnerText;
	
	@FindBy(xpath="//div[@class='btn-div addBorderToToggleButton ms-auto']//button[@class='view-btn active selectedToglleBorder']")
	protected WebElement highlightedtoggleButton;
	
	@FindBy(xpath="//div[@class='btn-div addBorderToToggleButton ms-auto']//button[@class='view-btn ']")
	protected WebElement NonHighlighted;
	
	
}
