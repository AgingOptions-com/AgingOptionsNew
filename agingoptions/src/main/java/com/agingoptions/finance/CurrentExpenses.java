package com.agingoptions.finance;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class CurrentExpenses {

	private WebUtil util;

	public CurrentExpenses(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
		this.util=util;
	}

	@FindAll(@FindBy(xpath = "//div[@id='expenseAmt']/input"))
	private List<WebElement> amountTB;

	public void inputAllExpenses(List<String> amounts) {
		int expSize=amountTB.size()-1;
		for(int i=0; i<=expSize-1; i++) {
			WebElement expTb=		amountTB.get(i);
			util.sendValue(expTb, amounts.get(i), "");
		}
	}

	@FindBy(xpath="//div[contains(text(),'Add New Expenses')]")
	private WebElement addNewExpensesBT;

	public void clickAddNewExpensesButton() {
		util.click(addNewExpensesBT, "Add New Expenses");
	}

	@FindBy(xpath="//input[@id='16other']")
	private WebElement newExpenseTB;

	public void inputNewExpenseDescription(String value) {
		util.sendValue(newExpenseTB, value, "Enter Expense Type");
	}

	@FindBy(xpath="//input[@id='16other']/parent::div/parent::td/following-sibling::td//div[@id='expenseAmt']/input")
	private WebElement newExpensesAmountTB;

	public void inputNewExpensesAmount(String value) {
		util.sendValue(newExpensesAmountTB, value, "New Expense Type Amount Text box");
	}

	@FindBy(xpath="//button[contains(text(),'Non Monthly Expenses')]")
	private WebElement nonMonthlyExpenseAccordian;

	public void openNonMonthlyExpenseAccordian() {
		util.openAccordion(nonMonthlyExpenseAccordian, "Non Monthly Expenses");
	}

	@FindBy(xpath="//input[@id='expenseLast']")
	private WebElement nonMonthlyExpensesDescriptionTB;

	public void inputNonMonthlyExpenseDescription(String value) {
		util.sendValue(nonMonthlyExpensesDescriptionTB, value, "Non Monthly Expense");
	}

	@FindBy(xpath="//input[@value='Lawn equipment or landscaping']/parent::div/parent::td/following-sibling::td//div[contains(@id,'expenseAmt')]/input")
	private WebElement nonMonthlyExpenseAmtTB;

	public void inputNonMonthlyExpensesAmt(String value) {
		util.sendValue(nonMonthlyExpenseAmtTB, value, "Non Monthly Expenses Amount Text Box");
	}

	@FindBy(xpath="//p[contains(text(),'Housing')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement housingDropDownIcon;

	@FindBy(xpath="//li[contains(text(),'Cash')]")
	private WebElement cashDropDownIcon;

	@FindBy(xpath="//li[contains(text(),'Credit and Debit Cards')]")
	private WebElement creditAndDebitCardDropDown;

	@FindBy(xpath="//li[contains(text(),'Automatic Deduction(Auto-Deduct)')]")
	private WebElement automaticDeductionDropDown;

	@FindBy(xpath="//li[contains(text(),'Bank Transfers')]")
	private WebElement bankTransferDropDown;

	@FindBy(xpath="//li[contains(text(),'Online Payment Gateways(e.g., PayPal,Stripe)')]")
	private WebElement onlinePaymentGatewayDropDown;

	@FindBy(xpath="//li[contains(text(),'Mobile Payments(e.g., ApplePay,Google Wallet)')]")
	private WebElement mobilePaymentDropDown;

	@FindBy(xpath="//li[contains(text(),'Checks')]")
	private WebElement checksDropDown;

	@FindBy(xpath="//li[contains(text(),'Other')]")
	private WebElement otherTypeDropDown;


	public void selectCashHousingDropDown() {
		util.click(housingDropDownIcon, "Housing Drop Down");
		util.click(cashDropDownIcon, "Cash");
	}

	@FindBy(xpath="//p[contains(text(),'Utilities')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement utilitiesDropDownIcon;

	public void selectOtherUtilitiesDropDown() {
		util.click(utilitiesDropDownIcon, "Utilities Drop Down");
		util.click(otherTypeDropDown, "Other");
	}

	@FindBy(xpath="//p[contains(text(),'Insurance')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement insuranceDropDownIcon;

	public void selectCreditAndDebitCardInsuranceDropDown() {
		util.click(insuranceDropDownIcon, "Insurance Drop Down");
		util.click(creditAndDebitCardDropDown, "Credit Card and Debit Card");
	}

	@FindBy(xpath="//p[contains(text(),'Medications')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement medicationDropDownIcon;

	public void selectBankTransferMedicationDropDown() {
		util.click(medicationDropDownIcon, "Medication Drop Down");
		util.click(bankTransferDropDown, "Bank Transfer");
	}

	@FindBy(xpath="//p[contains(text(),'Food')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement foodDropDownIcon;

	public void selectOnlinePaymentGatewayFoodDropDown() {
		util.click(foodDropDownIcon, "Medication Drop Down");
		util.click(onlinePaymentGatewayDropDown, "Online Payment Gateway");
	}

	@FindBy(xpath="//p[contains(text(),'Auto')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement autoDropDownIcon;

	public void selectMobilePaymentAutoDropDown() {
		util.click(autoDropDownIcon, "Auto Drop Down");
		util.click(mobilePaymentDropDown, "Mobile Payment");
	}

	@FindBy(xpath="//p[contains(text(),'Taxes')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement taxesDropDownIcon;

	public void selectCheckTaxesDropDown() {
		util.click(taxesDropDownIcon, "Taxes Drop Down");
		util.click(mobilePaymentDropDown, "Mobile Payment ");
	}

	@FindBy(xpath="//p[contains(text(),'Clothes')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement clothDropDownIcon;

	public void selectCashClothesDropDown() {
		util.click(clothDropDownIcon, "Clothes Drop Down");
		util.click(cashDropDownIcon, "Cash");
	}

	@FindBy(xpath="//p[contains(text(),'Travel')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement travelDropDownIcon;

	public void selectBankTransferTravelDropDown() {
		util.click(travelDropDownIcon, "Travel Drop Down");
		util.click(bankTransferDropDown, "Cash");
	}

	@FindBy(xpath="//p[contains(text(),'Gym')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement gymDropDownIcon;

	public void selectCashGymDropDown() {
		util.click(gymDropDownIcon, "Gym Drop Down");
		util.click(cashDropDownIcon, "Cash");
	}

	@FindBy(xpath="//p[contains(text(),'Charity')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement charityDropDownIcon;

	public void selectOtherCharityDropDown() {
		util.click(charityDropDownIcon, "Charity Drop Down");
		util.click(otherTypeDropDown, "Other");
	}

	@FindBy(xpath="//p[contains(text(),'Entertainment')]/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement entertainmentDropDownIcon;

	public void selectCashEntertainmentDropDown() {
		util.click(entertainmentDropDownIcon, "Entertainment Drop Down");
		util.click(cashDropDownIcon, "Cash");
	}

	@FindBy(xpath="//p[text()='Savings']/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement savingDropDownIcon;

	public void selectBankTransferSavingDropDown() {
		util.click(savingDropDownIcon, "Saving Drop Down");
		util.click(bankTransferDropDown, "Bank Transfer");
	}

	@FindBy(xpath="//p[text()='Retirement Savings']/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement retirementSavingDropDownIcon;

	public void selectCashRetirementSavingDropDown() {
		util.click(retirementSavingDropDownIcon, "Retirement Saving Drop Down");
		util.click(cashDropDownIcon, "Bank Transfer");
	}

	@FindBy(xpath="//p[text()='Miscellaneous']/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement miscellaneousDropDownIcon;

	public void selectOtherMiscellaneousDropDown() {
		util.click(miscellaneousDropDownIcon, "Miscellaneous Drop Down");
		util.click(otherTypeDropDown, "Other");
	}

	@FindBy(xpath="//p[text()='Other']/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]")
	private WebElement otherDropDownIcon;

	public void selectCashOtherDropDown() {
		util.click(otherDropDownIcon, "Other Drop Down");
		util.click(cashDropDownIcon, "Cash");
	}

	@FindBy(xpath="//img[@title='Delete']/preceding-sibling::div//div/span")
	private WebElement newExpensesDropDownIcon;

	public void selectCashNewExpenseDropDown() {
		util.click(newExpensesDropDownIcon, "New Expenses Drop Down");
		util.click(cashDropDownIcon, "Cash");
	}

	@FindBy(xpath="//input[@value='Lawn equipment or landscaping']/parent::div/parent::td/following-sibling::td//div[contains(@class,'dropdown-selected')]/span")
	private WebElement nonMonthlyExpensesPaymentMethodDropDown;

	public void selectCashNonMonthlyExpenseDropDown() {
		util.click(nonMonthlyExpensesPaymentMethodDropDown, "Non Monthly Expenses Drop Down");
		util.click(cashDropDownIcon, "Cash");
	}

	@FindBy(xpath="//button[contains(text(),'Save & Proceed to Tax Information')]")
	private WebElement saveProceedToTaxInfoBT;

	public void clickSaveProceedToTaxInfoButton() {
		util.click(saveProceedToTaxInfoBT, "Save & Proceed to Tax Information");
	}

	@FindBy(xpath="//div[@id='totalExpenseAmt']/input")
	private WebElement totalAmtTB;

	public String getTotalAmtInputValue() {
		String totalAmt=	util.GetAttributevalue(totalAmtTB, "value");
		String amt=	util.convertAmountActualValue(totalAmt);
		return amt;
	}

	public String getNonMonthlyInputDescription() {
		String text=	util.GetAttributevalue(nonMonthlyExpensesDescriptionTB, "value");
		return text;
	}

	public String getNonMonthlyInputAmt() {
		String text=	util.GetAttributevalue(nonMonthlyExpenseAmtTB, "value");
	String value=	util.convertAmountActualValue(text);
		return value;
	}

	public String getNonMonthlyPaymethoSelectedText() {
		String text=	util.getInnerText(nonMonthlyExpensesPaymentMethodDropDown);
		return text;
	}

	public String getHousingPaymentSelectedDropDownText() {
		String text=	util.getInnerText(housingDropDownIcon);
		return text;
	}

	public String getUtilitiesPaymentSelectedDropDownText() {
		String text=	util.getInnerText(utilitiesDropDownIcon);
		return text;
	}

	public String getInsurancePaymentSelectedDropDownText() {
		String text=	util.getInnerText(insuranceDropDownIcon);
		return text;
	}

	public String getMedicationPaymentSelectedDropDownText() {
		String text=	util.getInnerText(medicationDropDownIcon);
		return text;
	}

	public String getFoodPaymentSelectedDropDownText() {
		String text=	util.getInnerText(foodDropDownIcon);
		return text;
	}

	public String getAutoPaymentSelectedDropDownText() {
		String text=	util.getInnerText(autoDropDownIcon);
		return text;
	}
	
	public String getTaxesPaymentSelectedDropDownText() {
		String text=	util.getInnerText(taxesDropDownIcon);
		return text;
	}
	
	public String getClothesPaymentSelectedDropDownText() {
		String text=	util.getInnerText(clothDropDownIcon);
		return text;
	}
	public String getTravelPaymentSelectedDropDownText() {
		String text=	util.getInnerText(travelDropDownIcon);
		return text;
	}
	
	public String getGymPaymentSelectedDropDownText() {
		String text=	util.getInnerText(gymDropDownIcon);
		return text;
	}
	
	public String getCharityPaymentSelectedDropDownText() {
		String text=	util.getInnerText(charityDropDownIcon);
		return text;
	}
	
	public String getEntertainmentPaymentSelectedDropDownText() {
		String text=	util.getInnerText(entertainmentDropDownIcon);
		return text;
	}
	
	public String getSavingsPaymentSelectedDropDownText() {
		String text=	util.getInnerText(savingDropDownIcon);
		return text;
	}
	
	public String getRetirementSavingsPaymentSelectedDropDownText() {
		String text=	util.getInnerText(retirementSavingDropDownIcon);
		return text;
	}
	
	public String getMiscellaneousPaymentSelectedDropDownText() {
		String text=	util.getInnerText(miscellaneousDropDownIcon);
		return text;
	}
	public String getOtherPaymentSelectedDropDownText() {
		String text=	util.getInnerText(otherDropDownIcon);
		return text;
	}
	
	
	
}
