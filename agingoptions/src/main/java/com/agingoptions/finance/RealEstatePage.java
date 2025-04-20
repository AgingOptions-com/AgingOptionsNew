package com.agingoptions.finance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class RealEstatePage {
	private WebUtil util;

	public RealEstatePage(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindBy(xpath="//button[contains(text(),'Add Real Estate')]")
	private WebElement addRealEstateBT;

	public void clickAddRealEstateButton() {
		util.click(addRealEstateBT, "Add Real Estate");
	}

	@FindBy(xpath="//div[@id='agingAssetType']/preceding-sibling::div/span")
	private WebElement descriptionOfPropertyDropDown;

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Primary Home')]")
	private WebElement primaryHomeDropDownOptions;

	public void selectPrimaryHomeFromDescriptionOfPropertyDropDown() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(descriptionOfPropertyDropDown, "Description of Property ");
		util.click(primaryHomeDropDownOptions, "Primary Home");
	}

	@FindBy(xpath="//button[contains(text(),'Financial and ownership Information')]")
	private WebElement finanialAndOwnershipInfoAccordian;

	public void openFinanialAndOwnershipInfoAccordian() {
		util.openAccordion(finanialAndOwnershipInfoAccordian, "Financial and ownership Information");
	}

	@FindBy(xpath="//p[contains(text(),'Purchase date')]/parent::div/div/input")
	private WebElement purchaseDateTB;

	public void inputPurchaseDate(String value) {
		util.sendValue(purchaseDateTB, value, "Purchage Date");
	}

	@FindBy(xpath="//label[contains(text(),'Purchase price')]/parent::div/div/input")
	private WebElement purchasePriceTB;

	public void inputPurchasePrice(String value) {
		util.sendValue(purchasePriceTB, value, "Purchage Price");
	}

	@FindBy(xpath="//label[contains(text(),'Current value')]/parent::div/div/input")
	private WebElement currentValueTB;

	public void inputCurrentValue(String value) {
		util.sendValue(currentValueTB, value, "Current Value");
	}

	@FindBy(xpath="(//div[@class='d-flex flex-column']/label)[1]/input")
	private WebElement mortgageCheckbox;

	public void checkMortgageCheckBox() {
		util.checkCheckBox(mortgageCheckbox, "Mortgage");
	}

	@FindBy(xpath="//p[contains(text(),'Name of Lender*')]/following-sibling::input")
	private WebElement nameOfLenderTB;

	public void inputNameOfLender(String value) {
		util.waitUntilPresentInUI(nameOfLenderTB, 30);
		util.sendValue(nameOfLenderTB, value, "Name Of Lender");
	}

	@FindBy(xpath="//p[contains(text(),'Mortgage end date')]/parent::div/div/input")
	private WebElement mortgageEndDate;

	public void inputMortgageEndDate(String value) {
		util.sendValue(mortgageEndDate, value, "Mortgage End Date");
	}

	@FindBy(xpath="//p[contains(text(),'Loan Number')]/following-sibling::input")
	private WebElement loanNumberTB;

	public void inputLoanNumber(String value) {
		util.sendValue(loanNumberTB, value, "Loan Number");
	}

	@FindBy(xpath="//label[contains(text(),'Monthly Amount')]/parent::div/div/input")
	private WebElement monthlyAmountTB;

	public void inputMonthlyAmount(String value) {
		util.sendValue(monthlyAmountTB, value, "Monthly Amount");
	}

	@FindBy(xpath="//label[contains(text(),'Interest Rate')]/parent::div/div/input")
	private WebElement interestRateTB;

	public void inputInterestRate(String value) {
		util.sendValue(interestRateTB, value, "Interest Rate");
	}

	@FindBy(xpath="//label[contains(text(),'Outstanding Balance')]/parent::div/div/input")
	private WebElement outstandingBalanceTB;

	public void inputOutstandingBalance(String value) {
		util.sendValue(outstandingBalanceTB, value, "OutStanding Balance");
	}

	@FindBy(xpath="//h5[contains(text(),'Lender’s information')]/ancestor::div[@class='costumModal-content']//input[@id='phoneNumber']")
	private WebElement lendersPhoneNumber;

	public void inputLendersPhoneNumber(String value) {
		try {
			util.sendValue(lendersPhoneNumber, value, "Lender's Phone Number");
			util.waitUntilValueIsSend(lendersPhoneNumber, 5, value);
		}catch(Exception e) {
			util.sendValue(lendersPhoneNumber, value, "Lender's Phone Number");
		}
	}

	@FindBy(xpath="//h5[contains(text(),'Lender’s information')]/ancestor::div[@class='costumModal-content']//input[@id='email']")
	private WebElement lendersEmail;

	public void inputLendersEmail(String value) {
		try {
			util.sendValue(lendersEmail, value, "Lenders Email");
			util.waitUntilValueIsSend(lendersEmail, 10, value);
		}catch(Exception e) {
			util.sendValue(lendersEmail, value, "Lenders Email");
		}	}

	@FindBy(xpath="//h5[contains(text(),'Lender’s information')]/ancestor::div[@class='costumModal-content']//button[contains(text(),'Save')]")
	private WebElement lenderInfoSaveButton;

	public void clickLenderInfoSaveButton() {
		util.click(lenderInfoSaveButton, "Charity Save Button");
	}

	@FindBy(xpath="//button[contains(text(),'Update & Continue later')]")
	private WebElement updateContinuLaterBT;

	public void clickUpdateContinueLaterButton() {
		util.click(updateContinuLaterBT, "Update Continue Later Button");
	}

	@FindBy(xpath="//td[contains(text(),'Primary Home')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement primaryHomeEditIconTable;

	public void clickPrimaryHomeEditIconTable() {
		util.click(primaryHomeEditIconTable, "Primary Home");
	}

	public String getDesriptionOfPropertySelectText() {
		String value=	util.getInnerText(descriptionOfPropertyDropDown);
		return value;
	}

	public String getPurchageDateInputText() {
		String value=	util.GetAttributevalue(purchaseDateTB, "value");
		String text=	util.convertDateFormatMMDDYYYY(value);
		return text;
	}

	public String getPurchagePriceText() {
		String value=	util.GetAttributevalue(purchasePriceTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getCurrentValueText() {
		String value=	util.GetAttributevalue(currentValueTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	@FindBy(xpath="//button[contains(text(),'Lender Information')]")
	private WebElement lenderInfoAccordian;

	public void openLenderInfoAccordian() {
		util.openAccordion(lenderInfoAccordian, "Ledner Info Accordian");
	}

	@FindBy(xpath="//td[contains(text(),'Mortgage')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement lenderInfoMortgageEditIcon;

	public void lenderInfoMortgageEditIcon() {
		util.click(lenderInfoMortgageEditIcon,"Lender Info Mortgage Edit Icon" );
	}

	public String getNameOfLenderInputText() {
		String value=	util.GetAttributevalue(nameOfLenderTB, "value");
		return value;
	}

	public String getMortgageEndDateInputText() {
		String value=	util.GetAttributevalue(mortgageEndDate, "value");
		String text=	util.convertDateFormatMMDDYYYY(value);
		return text;
	}

	public String getLoanNumberInputText() {
		String value=	util.GetAttributevalue(loanNumberTB, "value");
		return value;
	}

	public String getMonthlyAmountInputText() {
		String value=	util.GetAttributevalue(monthlyAmountTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	public String getInterestRateInputText() {
		String value=	util.GetAttributevalue(interestRateTB, "value");
		return value;
	}

	public String getOutStandingBalanceInputText() {
		String value=	util.GetAttributevalue(outstandingBalanceTB, "value");
		String text=	util.convertAmountActualValue(value);
		return text;
	}

	@FindBy(xpath="//div[@class='costumModal-content']//img[@class='icon cursor-pointer']")
	private WebElement lenderInfoMobileEditIcon;

	public void clickLenderInfoMobileEditIcon() {
		util.click(lenderInfoMobileEditIcon, "Lender Info Mobile Edit Icon");
	}

	@FindBy(xpath="//h5[contains(text(),'Add contact information')]/following-sibling::img")
	private WebElement addContactModalCloseIcon;

	public void clickAddContactCloseIcon() {
		util.click(addContactModalCloseIcon, "Contact Close Icon");
	}

	@FindBy(xpath="//div[@class='costumModal-content']//button[contains(text(),'Update')]")
	private WebElement lendersInfoUpdateButton;

	public void clickLenderInfoUpdateButton() {
		util.click(lendersInfoUpdateButton, "Lender Info Update Button");
	}

	public void checkMortgageCheckboxIsCheck() {
		util.isSelected(mortgageCheckbox, "Mortgage Checkbox");
	}

	@FindBy(xpath="//h5[contains(text(),'Add contact information')]/parent::div/parent::div//input[@id='phoneNumber']")
	private WebElement lenderPhoneNumber;

	public String getLenderPhoneNumber() {
		String value=		util.GetAttributevalue(lenderPhoneNumber,"value" );
		String text=	util.unformatPhoneNumber(value);
		return text;
	}

	@FindBy(xpath="//h5[contains(text(),'Add contact information')]/parent::div/parent::div//input[@id='email']")
	private WebElement lenderEmail;

	public String getLenderEmail() {
		String value=		util.GetAttributevalue(lenderEmail,"value" );
		return value;
	}

	//	public void inputLenderMobileNumber() {
	//		util.sendValue(lendersPhoneNumber, getCurrentValueText(), getCurrentValueText());
	//	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Vacation or Secondary Home')]")
	private WebElement vacationOrSecandaryHomeDropDownOption;


	public void selectVacationOrSecondaryHomeFromDescriptionOfPropertyDropDown() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(descriptionOfPropertyDropDown, "Description of Property ");
		util.click(vacationOrSecandaryHomeDropDownOption, "Vacation Or Secondary Home");
	}

	@FindBy(xpath="//td[contains(text(),'Vacation or Secondary Home')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement vacationOrSecondaryHomeEditIconTable;

	public void clickVacationOrSecondaryHomeEditIconTable() {
		util.click(vacationOrSecondaryHomeEditIconTable, "Vacation Or Secondary Home");
	}

	@FindBy(xpath="//ul[@id='dropDownDivId']/li[contains(text(),'Other')]")
	private WebElement otherDropDownOption;


	public void selectOtherFromDescriptionOfPropertyDropDown() {
		util.holdOn(Duration.ofSeconds(1));
		util.click(descriptionOfPropertyDropDown, "Description of Property ");
		util.click(otherDropDownOption, "Other");
	}

	@FindBy(xpath="//input[@id='other']")
	private WebElement otherDescriptionOfPropertyTB;

	public void inputOtherDescriptionOfProperty(String value) {
		util.sendValue(otherDescriptionOfPropertyTB, value, "Descroption Of Property");
	}

	@FindBy(xpath="//td[contains(text(),'Rk Property')]/following-sibling::td/div/img[@alt='Edit Icon']")
	private WebElement rkPropertyEditIcon;

	public void clickRkPropertyEditIcon() {
		util.click(rkPropertyEditIcon, "Rk Property Edit Icon");
	}

	public String getOtherDescriptionOfPropertyInputText() {
		String text=	util.GetAttributevalue(otherDescriptionOfPropertyTB, "value");
		return text;
	}

	@FindBy(xpath="(//div[@class='d-flex flex-column']/label)[2]/input")
	private WebElement secondMortgageBT;

	public void check2ndMortgageButton() {
		util.checkCheckBox(secondMortgageBT, "2nd Mortgage Button");
	}

	@FindBy(xpath="(//div[@class='d-flex flex-column']/label)[3]/input")
	private WebElement lineOfMortgageCheckBox;

	public void checkLineOfMortgageButton() {
		util.waitUntilPresentInUI(lineOfMortgageCheckBox, 10);
		util.click(lineOfMortgageCheckBox,"Line Of Mortgage Check Box" );
		util.checkCheckBox(lineOfMortgageCheckBox, "Line of credit Mortgage Button");

	}

	@FindBy(xpath="(//div[@class='d-flex flex-column']/label)[4]/input")
	private WebElement otherMortgageCheckBox;

	public void checkOtherMortgageButton() {
		util.waitUntilPresentInUI(otherMortgageCheckBox, 10);
		util.click(otherMortgageCheckBox,"Line Of Mortgage Check Box" );
		util.checkCheckBox(otherMortgageCheckBox, "Other Mortgage Button");
	}

	@FindBy(xpath="//h5[@class='py-4 modal-title']/following-sibling::div[@id='contactDetails']//p[text()='Address']/following-sibling::input")
	private WebElement lenderAddressTB;

	public void inputLenderAddress(String value) {
		util.sendValue(lenderAddressTB, value, "Address");
		util.holdOn(Duration.ofSeconds(5));
		util.pressSpaceButton();
		util.pressBackSpaceButton();
		util.DownKey();
		util.DownKey();
		util.pressEnter();
		util.DownKey();
		util.DownKey();
		util.pressEnter();
	}

	@FindBy(xpath="//input[@id='insStartDate']")
	private WebElement payOffDate;

	public void inputPayOffDate(String value) {
		util.sendValue(payOffDate, value, "PayOff Date");
	}

	@FindAll(@FindBy(xpath="//div[@id='information-table']//table//tbody/tr"))
	private List<WebElement> addedLenderSize;

	public String getLendersSize() {
		util.holdOn(Duration.ofSeconds(1));
		int LenderSize=	addedLenderSize.size();
		String size=Integer.toString(LenderSize);
		return size;
	}





}
