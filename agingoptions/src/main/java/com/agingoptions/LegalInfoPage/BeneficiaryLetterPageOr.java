package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class BeneficiaryLetterPageOr {

	public BeneficiaryLetterPageOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
		}
	
	@FindBy(xpath="//span[text()='Beneficiary Letter']")
	protected WebElement beneficiaryLetterDrawer; 
	
	@FindBy(xpath="//p[text()='Assets:']")
	protected WebElement AssetsTextbeneficiaryLetterPage;
	
	@FindBy(xpath="//button[@class=' filePrieviewClosebuttonStyle closeButt2']//img")
	protected WebElement CloseIcon;
	
	@FindBy(xpath="//button[text()='Close']")
	protected WebElement CloseButton;
	
	@FindBy(xpath="//button[text()='Generate']")
	protected WebElement GenerateButton;
	
	@FindBy(xpath="(//tr[@class='firstRowTable table1 w-100 p-3'])[1]/following-sibling::tr//input")
	protected WebElement NonRetirementFirstAssetDetailsCheckbox;
	
	@FindBy(xpath="(//tr[@class='firstRowTable table1 w-100 p-3'])[2]/following-sibling::tr//input")
	protected WebElement RetirementFirstAssetDetailsCheckBox;
	
	@FindBy(xpath="(//tr[@class='firstRowTable table1 w-100 p-3'])[1]/following-sibling::tr//input")
	protected WebElement LifeInsuranceFirstAssetDetailsCheckbox;
	
	@FindBy(xpath="(//img[@alt='Edit Icon'])[1]")
	protected WebElement ViewPdfIconNonRetirement;
	
	@FindBy(xpath="(//img[@alt='Edit Icon'])[2]")
	protected WebElement EditIconNonRetirement;
	
	@FindBy(xpath="(//span[text()='Finance'])[1]")
	protected WebElement FinanceSectonUnderSetUpPage;
	
}
