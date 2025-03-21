package com.agingoptions.activationpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class ActivationPage {

	private	WebUtil util;

	public ActivationPage(WebUtil ut) {
		PageFactory.initElements(ut.getDriver(), this);
		this.util=ut;
	}

	@FindBy(xpath="//div[@class='custom-select-field  full-width']/div/div[@class='dropdown-icon ']")
	protected WebElement RelationshipDropDown;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Married']")
	protected WebElement MarriedDDOptions;

	@FindBy(xpath="(//p[text()='Gender']/parent::div[@class='custom-select-field  ']//div[@class='dropdown-icon '])[1]")
	protected WebElement primaryMemberGenderDropDownIcon;

	@FindBy(xpath="(//p[text()='Gender']/parent::div[@class='custom-select-field  ']//div[@class='dropdown-icon '])[2]")
	protected WebElement spouseGenderDropDownIcon;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Male']")
	protected WebElement maleDropDownOptions;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[text()='Female']")
	protected WebElement femaleDropDownOptions;

	@FindBy(xpath="(//input[@id='dob'])[1]")
	protected WebElement primaryMemberDobTB;

	@FindBy(xpath="(//input[@id='dob'])[2]")
	protected WebElement spouseDobTB;

	@FindBy(xpath="//input[@placeholder='Enter no of children']")
	protected WebElement noOfChildTB;

	@FindBy(xpath="(//input[@id='fName'])[2]")
	protected WebElement spouseFirstNameTB;

	@FindBy(xpath="//p[text()='Search address']//following-sibling::input[@id='addressLine1']")
	protected WebElement searchAddressTB;

	@FindBy(xpath="//button[contains(text(),'Submit & Proceed')]")
	protected WebElement submitProceedBT;

	public void selectMarriedRelationshipOptions() {
		util.click(RelationshipDropDown, "Relation ship drop down");
		util.click(MarriedDDOptions, "Married Options");
	}
	public void selectMaleAsPrimaryMember() {
		util.clickJavaScript(primaryMemberGenderDropDownIcon, "Primary member Gender Drop Down Icon");
		util.clickJavaScript(maleDropDownOptions, "Male Drop Down Option");
	}
	public void inputPrimaryMemberDob(String primaryMemberDob) {
		util.click(primaryMemberDobTB, "Primary Member Date Of Birth");
		util.sendValueJs(primaryMemberDobTB, primaryMemberDob, "Primary member Date Of Birth");
	}
	public void inputNoOfChildren(String noOfChild) {
		util.sendValueJs(noOfChildTB, noOfChild, "Number of child ");
	}
	public void inputSpouseFirstName(String spouseFirstName) {
		util.sendValue(spouseFirstNameTB, spouseFirstName, "Spouse First Name");
	}
	public void selectSpouseFemaleAsSpouse() {
		util.clickJavaScript(spouseGenderDropDownIcon, "Spouse Gender Drop Down Icon");
		util.clickJavaScript(femaleDropDownOptions, "Spouse Female Drop Down");
	}
	public void inputAddress(String address) {
		util.sendValueJs(searchAddressTB, address, "Address");
		util.click(searchAddressTB, "Address Text Box");
		util.pressSpaceButton();
		util.pressBackSpaceButton();
		util.DownKey();
		util.pressEnter();
		
	}
	public void inputSpouseDob(String primaryMemberDob) {
		util.click(spouseDobTB, "Spouse Date Of Birth");
		util.sendValueJs(spouseDobTB, primaryMemberDob, "Primary member Date Of Birth");
	}
	public void clickProceedSubmitButton() {
		util.clickJavaScript(submitProceedBT, "Submit & Proceed Button");
	}



}
