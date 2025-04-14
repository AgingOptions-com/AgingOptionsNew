package com.agingoptions.LegalInfoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FiducuaryBeneficiaryPageOr {
	
	public FiducuaryBeneficiaryPageOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
		
		
	}
  @FindBy(xpath="(//span[text()='Fiduciary/Beneficiary'])[1]")
  protected WebElement FiduciaryBeneficiaryDrawer; 
  @FindBy(xpath="(//span[text()='Fiduciary/Beneficiary'])[2]")
  protected WebElement FiduciaryBeneficiaryText;
  @FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[1]")
  protected WebElement Primarymembertogglebuttontext;
  @FindBy(xpath="(//div[@class='btn-div addBorderToToggleButton ms-auto']//button)[2]")
  protected WebElement spousetogglebuttontext;
  @FindBy(xpath="(//input[@class='form-check-input'])[1]")
  protected WebElement SpouseTablebenCheckbox;
  @FindBy(xpath="(//input[@class='form-check-input'])[2]")
  protected WebElement SpouseTablefidCheckBox;
  @FindBy(xpath="(//img[@alt='Edit Icon'])[1]")
  protected WebElement ClientSpouseEditIcon;
  @FindBy(xpath="(//input[@id='custom-checkbox-setup '])[1]")
  protected WebElement FiduciaryCheckBoxInDetails;
  @FindBy(xpath="(//input[@id='custom-checkbox-setup '])[2]")
  protected WebElement BeneficiaryCheckBoxInDetails;
  
   
  
  
}
