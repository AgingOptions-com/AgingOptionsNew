package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.agingoptions.finance.CurrentExpenses;
import com.agingoptions.finance.Income;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class CurrentExpenseTestCases extends BaseTest {

	@Test(priority=1)
	public void  FTC_033_InputIncomeDetails() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickCurrentExpenseSideBarLink();
		CurrentExpenses expenses=   new CurrentExpenses(util);
		String expectedHousingAmt="39483";
		String expectedUtilitiesAmt="43567";	
		String expectedInsuranceAmt="98754";	
		String expectedMedicationsAmt="92848";	
		String expectedFoodAmt="8347";	
		String expectedAutoAmt="8737";
		String expectedTaxesAmt="8737";
		String expectedClothesAmt="8237";	
		String expectedTravelAmt="8237";	
		String expectedGymAmt="3847";	
		String expectedCharityAmt="2387";	
		String expectedEntertainmentAmt="2983";	
		String expectedSavingsAmt="8273";	
		String expectedRetirementSavingsAmt="9388";	
		String expectedMiscellaneousAmt="2347";	
		String expectedOtherAmt="7348";	
		List expenseAmt=	new ArrayList();
		expenseAmt.add(expectedHousingAmt);
		expenses.selectCashHousingDropDown();
		expenseAmt.add(expectedUtilitiesAmt);
		expenses.selectOtherUtilitiesDropDown();
		expenseAmt.add(expectedInsuranceAmt);
		expenses.selectCreditAndDebitCardInsuranceDropDown();
		expenseAmt.add(expectedMedicationsAmt);
		expenses.selectBankTransferMedicationDropDown();
		expenseAmt.add(expectedFoodAmt);
		expenses.selectOnlinePaymentGatewayFoodDropDown();	
		expenseAmt.add(expectedAutoAmt);
		expenses.selectMobilePaymentAutoDropDown();	
		expenseAmt.add(expectedTaxesAmt);
		expenses.selectCheckTaxesDropDown();
		expenseAmt.add(expectedClothesAmt);
		expenses.selectCashClothesDropDown();
		expenseAmt.add(expectedTravelAmt);
		expenses.selectBankTransferTravelDropDown();
		expenseAmt.add(expectedGymAmt);
		expenses.selectCashGymDropDown();
		expenseAmt.add(expectedCharityAmt);
		expenses.selectOtherCharityDropDown();
		expenseAmt.add(expectedEntertainmentAmt);
		expenses.selectCashEntertainmentDropDown();
		expenseAmt.add(expectedSavingsAmt);
		expenses.selectBankTransferSavingDropDown();
		expenseAmt.add(expectedRetirementSavingsAmt);
		expenses.selectCashRetirementSavingDropDown();
		expenseAmt.add(expectedMiscellaneousAmt);
		expenses.selectOtherMiscellaneousDropDown();
		expenseAmt.add(expectedOtherAmt);
		expenses.selectCashOtherDropDown();

		util.holdOn(Duration.ofSeconds(5));
		expenses.inputAllExpenses(expenseAmt);
		expenses.clickAddNewExpensesButton();
		String expectedNewExpense="Internet and Cable";
		expenses.inputNewExpenseDescription(expectedNewExpense);
		String expectedNewExpenseTypeAmt="93584";
		expenses.inputNewExpensesAmount(expectedNewExpenseTypeAmt);
		expenses.selectCashNewExpenseDropDown();
		expenses.openNonMonthlyExpenseAccordian();
		util.holdOn(Duration.ofSeconds(2));
		String expectedNonMonthlyDescription="Lawn equipment or landscaping";
		expenses.inputNonMonthlyExpenseDescription(expectedNonMonthlyDescription);
		String nonMonthlyExpensesAmtTB="9843";
		util.holdOn(Duration.ofSeconds(2));
		expenses.inputNonMonthlyExpensesAmt(nonMonthlyExpensesAmtTB);
		expenses.selectCashNonMonthlyExpenseDropDown();
		expenses.clickSaveProceedToTaxInfoButton();
		util.holdOn(Duration.ofSeconds(2));
		common.waitUntilToasterMessageisSeen();
		assets.clickCurrentExpenseSideBarLink();
		Integer expectedTotalValue=	Integer.parseInt(expectedHousingAmt)+Integer.parseInt(expectedUtilitiesAmt)+Integer.parseInt(expectedInsuranceAmt)+Integer.parseInt(expectedMedicationsAmt)+Integer.parseInt(expectedFoodAmt)+Integer.parseInt(expectedAutoAmt)+Integer.parseInt(expectedTaxesAmt)+Integer.parseInt(expectedClothesAmt)
		+Integer.parseInt(expectedTravelAmt)+Integer.parseInt(expectedGymAmt)+Integer.parseInt(expectedCharityAmt)+Integer.parseInt(expectedEntertainmentAmt)+Integer.parseInt(expectedSavingsAmt)+Integer.parseInt(expectedRetirementSavingsAmt)+Integer.parseInt(expectedMiscellaneousAmt)+
		Integer.parseInt(expectedOtherAmt)+Integer.parseInt(expectedNewExpenseTypeAmt);

		String actualTotalAmt=	expenses.getTotalAmtInputValue();
		String housingActualText=	expenses.getHousingPaymentSelectedDropDownText();
		String actualUtilitiesText=	expenses.getUtilitiesPaymentSelectedDropDownText();
		String actualInsuranceText=		expenses.getInsurancePaymentSelectedDropDownText();
		String actualMedicationText=		expenses.getMedicationPaymentSelectedDropDownText();
		String actualFoodText=		expenses.getFoodPaymentSelectedDropDownText();
		String actualAutoText=		expenses.getAutoPaymentSelectedDropDownText();
		String actualTaxesText=	expenses.getTaxesPaymentSelectedDropDownText();
		String actualClothesText=	expenses.getClothesPaymentSelectedDropDownText();
		String actualTravelText=	expenses.getTravelPaymentSelectedDropDownText();
		String actualGymText=	expenses.getGymPaymentSelectedDropDownText();
		String actualCharityText=	expenses.getCharityPaymentSelectedDropDownText();
		String actualEntertainmentText=	expenses.getEntertainmentPaymentSelectedDropDownText();
		String actualSavingsText=	expenses.getSavingsPaymentSelectedDropDownText();
		String actualRetirementSavingText=		expenses.getRetirementSavingsPaymentSelectedDropDownText();
		String actualMiscellaneousText=		expenses.getMiscellaneousPaymentSelectedDropDownText();
		String actualOtherText=	expenses.getOtherPaymentSelectedDropDownText();



		expenses.openNonMonthlyExpenseAccordian();
		util.holdOn(Duration.ofSeconds(3));
		//String acutalNonMonthlyDescription=	expenses.getNonMonthlyInputDescription();
		String acutalNonMonthlyAmt=	expenses.getNonMonthlyInputAmt();	
		String acutalNonMonthlyPayMethodDropDownText=	expenses.getNonMonthlyPaymethoSelectedText();	


		util.verifyActualExpectedText(Integer.toString(expectedTotalValue),actualTotalAmt ,"Total Amt" );
		util.verifyActualExpectedText(housingActualText,"Cash" ,"Cash" );
		util.verifyActualExpectedText(actualUtilitiesText, "Other","Other" );
		util.verifyActualExpectedText(actualInsuranceText, "Credit and Debit Cards","Credit and Debit Cards" );
		util.verifyActualExpectedText(actualMedicationText,"Bank Transfers" ,"Bank Transfers" );
		util.verifyActualExpectedText(actualFoodText,"Online Payment Gateways(e.g., PayPal,Stripe)" ,"Online Payment Gateways(e.g., PayPal,Stripe)" );
		util.verifyActualExpectedText(actualAutoText,"Mobile Payments(e.g., ApplePay,Google Wallet)" ,"Mobile Payments(e.g., ApplePay,Google Wallet)" );
		util.verifyActualExpectedText(actualTaxesText,"Mobile Payments(e.g., ApplePay,Google Wallet)" ,"Mobile Payments(e.g., ApplePay,Google Wallet)" );
		util.verifyActualExpectedText(actualClothesText,"Cash" ,"Cash" );
		util.verifyActualExpectedText(actualTravelText,"Bank Transfers" ,"Bank Transfers" );
		util.verifyActualExpectedText(actualGymText,"Cash" ,"Cash" );
		util.verifyActualExpectedText(actualCharityText,"Other" ,"Other" );
		util.verifyActualExpectedText(actualEntertainmentText,"Cash" ,"Cash" );
		util.verifyActualExpectedText(actualSavingsText, "Bank Transfers","Bank Transfers" );
		util.verifyActualExpectedText(actualRetirementSavingText,"Cash" ,"Cash" );
		util.verifyActualExpectedText(actualMiscellaneousText,"Other" ,"Other" );
		util.verifyActualExpectedText(actualOtherText,"Cash" ,"Cash" );
		util.verifyActualExpectedText(acutalNonMonthlyAmt,nonMonthlyExpensesAmtTB ,"Non-Monthly Amount" );
		util.verifyActualExpectedText(acutalNonMonthlyPayMethodDropDownText,"Cash" ,"Non-Monthly Payment Method" );

	}
}
