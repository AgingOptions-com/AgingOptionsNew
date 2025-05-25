package com.agingoptions.finance;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FutureExpectation {

	private WebUtil util;

	public FutureExpectation(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//span[contains(text(),'Do you expect an inheritance?')]/parent::div//input[@id='165']")
	private WebElement primaryMemberDoYouExpectAnInheritanceCheckBox;

	public void checkPrimaryMemberDoYouExpectAnInheritanceCheckBox() {
		util.holdOn(Duration.ofSeconds(1));
		util.checkCheckBox(primaryMemberDoYouExpectAnInheritanceCheckBox, "Primary Member Do you expect an inheritance?");
	}

	@FindBy(xpath="//span[contains(text(),'Do you expect an inheritance?')]/parent::div//input[@id='165']/parent::div/parent::div/following-sibling::div//input")
	private WebElement primaryMemberValueOfInharitanceAmountTB;

	public void inputPrimaryMemberValueOfInharitanceAmountValue(String value) {
		util.sendValue(primaryMemberValueOfInharitanceAmountTB, value, "Primary Member Value of inheritance amount");
	}

	@FindBy(xpath="//span[contains(text(),'Do you expect an inheritance?')]/parent::div//input[@id='255']")
	private WebElement spouseDoYouExpectAnInheritanceCheckBox;

	public void checkSpouseDoYouExpectAnInheritanceCheckBox() {
		util.holdOn(Duration.ofSeconds(1));
		util.checkCheckBox(spouseDoYouExpectAnInheritanceCheckBox, "Spouse Do you expect an inheritance?");
	}

	@FindBy(xpath="//span[contains(text(),'Do you expect an inheritance?')]/parent::div//input[@id='255']/parent::div/parent::div/following-sibling::div//input")
	private WebElement spouseValueOfInharitanceAmountTB;

	public void inputSpouseValueOfInharitanceAmountValue(String value) {
		util.sendValue(spouseValueOfInharitanceAmountTB, value, "Spouse Value of inheritance amount");
	}

	@FindBy(xpath="//button[contains(text(),'Next: Liabilities')]")
	private WebElement nextLiabilitiesBT;

	public void clickNextLiabilitiesButton() {
		util.click(nextLiabilitiesBT, "Next: Liabilities");
	}

	public String getPrimaryMemberValueOfInharitanceInputAmount() {
		String value=	util.GetAttributevalue(primaryMemberValueOfInharitanceAmountTB, "value");
		String amount=util.convertAmountActualValue(value);
		return amount;
	}
	
	public String getSpouseValueOfInharitanceInputAmount() {
		String value=	util.GetAttributevalue(spouseValueOfInharitanceAmountTB, "value");
		String amount=util.convertAmountActualValue(value);
		return amount;
	}




}
