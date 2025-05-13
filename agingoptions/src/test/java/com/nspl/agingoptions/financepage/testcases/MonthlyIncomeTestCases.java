package com.nspl.agingoptions.financepage.testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.agingoptions.finance.Income;
import com.agingoptions.finance.Liabilities;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.commoncode.AssetsCommonCode;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;

public class MonthlyIncomeTestCases extends BaseTest {

	@Test(priority=1)
	public void  FTC_032_InputIncomeDetails() {

		LpoLandingPage lpo = new LpoLandingPage(util);
		CommonCode common = new CommonCode(util);
		util.refreshPage();
		lpo.clickFinanceSideBarLink();
		AssetsCommonCode assets = new AssetsCommonCode(util);
		assets.clickIncomeSideBarLink();
		Income income=   new Income(util);

		String primaryExpectedSocialSecurityCurrentAmt="98445";
		String primaryExpectedSocialSecurityProjectedRetirementAmt="23982";
		String SpouseExpectedSocialSecurityCurrentAmt="67856";
		String SpouseExpectedSocialSecurityProjectedRetirementAmt="23982";
		List socialSecurityAmts=	new ArrayList();
		socialSecurityAmts.add(primaryExpectedSocialSecurityCurrentAmt);
		util.holdOn(Duration.ofMillis(500));
		socialSecurityAmts.add(primaryExpectedSocialSecurityProjectedRetirementAmt);
		util.holdOn(Duration.ofMillis(500));
		socialSecurityAmts.add(SpouseExpectedSocialSecurityCurrentAmt);
		util.holdOn(Duration.ofMillis(500));
		socialSecurityAmts.add(SpouseExpectedSocialSecurityProjectedRetirementAmt);
		util.holdOn(Duration.ofMillis(500));
		income.inputSocialSecurityGrossValues(socialSecurityAmts);
		util.holdOn(Duration.ofSeconds(1));
		String primaryExpectedEmploymentGrossCurrentAmt="64578";
		String primaryExpectedEmploymentGrossProjectedRetirementAmt="3876";
		String SpouseExpectedEmploymentGrossCurrentAmt="94584";
		String SpouseExpectedEmploymentGrossProjectedRetirementAmt="39487";
		List employmentGrossAmts=	new ArrayList();
		employmentGrossAmts.add(primaryExpectedEmploymentGrossCurrentAmt);
		employmentGrossAmts.add(primaryExpectedEmploymentGrossProjectedRetirementAmt);
		employmentGrossAmts.add(SpouseExpectedEmploymentGrossCurrentAmt);
		employmentGrossAmts.add(SpouseExpectedEmploymentGrossProjectedRetirementAmt);
		income.inputEmploymentGrossValues(employmentGrossAmts);
		util.holdOn(Duration.ofSeconds(1));
		String primaryExpectedPensionGrossCurrentAmt="94844";
		String primaryExpectedPensionGrossProjectedRetirementAmt="93837";
		String SpouseExpectedPensionGrossCurrentAmt="93849";
		String SpouseExpectedPensionGrossProjectedRetirementAmt="94859";
		List pensionGrossAmts=	new ArrayList();
		pensionGrossAmts.add(primaryExpectedPensionGrossCurrentAmt);
		pensionGrossAmts.add(primaryExpectedPensionGrossProjectedRetirementAmt);
		pensionGrossAmts.add(SpouseExpectedPensionGrossCurrentAmt);
		pensionGrossAmts.add(SpouseExpectedPensionGrossProjectedRetirementAmt);
		income.inputPensionGrossValues(pensionGrossAmts);

		String primaryExpectedIraCurrentAmt="94844";
		String primaryExpectedIraProjectedRetirementAmt="93837";
		String SpouseExpectedIraCurrentAmt="93849";
		String SpouseExpectedIraProjectedRetirementAmt="94859";
		List IraAmts=	new ArrayList();
		IraAmts.add(primaryExpectedIraCurrentAmt);
		IraAmts.add(primaryExpectedIraProjectedRetirementAmt);
		IraAmts.add(SpouseExpectedIraCurrentAmt);
		IraAmts.add(SpouseExpectedIraProjectedRetirementAmt);
		income.inputIrasValues(IraAmts);

		String primaryExpectedAnnutiesCurrentAmt="94844";
		String primaryExpectedAnnutiesProjectedRetirementAmt="93837";
		String SpouseExpectedAnnutiesCurrentAmt="93849";
		String SpouseExpectedAnnutiesProjectedRetirementAmt="94859";
		List annuitiesAmts=	new ArrayList();
		annuitiesAmts.add(primaryExpectedAnnutiesCurrentAmt);
		annuitiesAmts.add(primaryExpectedAnnutiesProjectedRetirementAmt);
		annuitiesAmts.add(SpouseExpectedAnnutiesCurrentAmt);
		annuitiesAmts.add(SpouseExpectedAnnutiesProjectedRetirementAmt);
		income.inputAnnutiesValues(annuitiesAmts);

		String primaryExpectedIncomeFromInvestmentCurrentAmt="94844";
		String primaryExpectedIncomeFromInvestmentProjectedRetirementAmt="93837";
		String SpouseExpectedIncomeFromInvestmentCurrentAmt="93849";
		String SpouseExpectedIncomeFromInvestmentProjectedRetirementAmt="94859";
		List incomeFromInvestmentAmts=	new ArrayList();
		incomeFromInvestmentAmts.add(primaryExpectedIncomeFromInvestmentCurrentAmt);
		incomeFromInvestmentAmts.add(primaryExpectedIncomeFromInvestmentProjectedRetirementAmt);
		incomeFromInvestmentAmts.add(SpouseExpectedIncomeFromInvestmentCurrentAmt);
		incomeFromInvestmentAmts.add(SpouseExpectedIncomeFromInvestmentProjectedRetirementAmt);
		income.inputIncomeFromInvestmentValues(incomeFromInvestmentAmts);
		util.holdOn(Duration.ofSeconds(1));
		String primaryExpectedrentalIncomeCurrentAmt="45453";
		String primaryExpectedrentalIncomeProjectedRetirementAmt="67544";
		String SpouseExpectedrentalIncomeCurrentAmt="6745";
		String SpouseExpectedrentalIncomeProjectedRetirementAmt="78545";
		List rentalIncomeAmts=	new ArrayList();
		rentalIncomeAmts.add(primaryExpectedrentalIncomeCurrentAmt);
		rentalIncomeAmts.add(primaryExpectedrentalIncomeProjectedRetirementAmt);
		rentalIncomeAmts.add(SpouseExpectedrentalIncomeCurrentAmt);
		rentalIncomeAmts.add(SpouseExpectedrentalIncomeProjectedRetirementAmt);
		income.inputRentalIncomeValues(rentalIncomeAmts);
		util.holdOn(Duration.ofSeconds(1));
		String primaryExpectedBusinessInterestsCurrentAmt="5675";
		String primaryExpectedBusinessInterestsProjectedRetirementAmt="4565";
		String SpouseExpectedBusinessInterestsCurrentAmt="86554";
		String SpouseExpectedBusinessInterestsProjectedRetirementAmt="6756";
		List businessInterestsIncomeAmts=	new ArrayList();
		businessInterestsIncomeAmts.add(primaryExpectedBusinessInterestsCurrentAmt);
		businessInterestsIncomeAmts.add(primaryExpectedBusinessInterestsProjectedRetirementAmt);
		businessInterestsIncomeAmts.add(SpouseExpectedBusinessInterestsCurrentAmt);
		businessInterestsIncomeAmts.add(SpouseExpectedBusinessInterestsProjectedRetirementAmt);
		income.inputBusinessInterestValues(businessInterestsIncomeAmts);
		util.holdOn(Duration.ofSeconds(1));
		String primaryExpectedSalaryCurrentAmt="5433";
		String primaryExpectedSalaryProjectedRetirementAmt="8764";
		String SpouseExpectedSalaryCurrentAmt="9876";
		String SpouseExpectedSalaryProjectedRetirementAmt="98765";
		List SalaryAmts=	new ArrayList();
		SalaryAmts.add(primaryExpectedSalaryCurrentAmt);
		SalaryAmts.add(primaryExpectedSalaryProjectedRetirementAmt);
		SalaryAmts.add(SpouseExpectedSalaryCurrentAmt);
		SalaryAmts.add(SpouseExpectedSalaryProjectedRetirementAmt);
		income.inputSalaryValues(SalaryAmts);
		util.holdOn(Duration.ofSeconds(1));
		String primaryExpectedOtherCurrentAmt="6745";
		String primaryExpectedOtherProjectedRetirementAmt="2345";
		String SpouseExpectedOtherCurrentAmt="8765";
		String SpouseExpectedOtherProjectedRetirementAmt="8764";
		List otherAmts=	new ArrayList();
		otherAmts.add(primaryExpectedOtherCurrentAmt);
		otherAmts.add(primaryExpectedOtherProjectedRetirementAmt);
		otherAmts.add(SpouseExpectedOtherCurrentAmt);
		otherAmts.add(SpouseExpectedOtherProjectedRetirementAmt);
		income.inputOtherValues(otherAmts);
		util.holdOn(Duration.ofSeconds(1));
		income.clickAddNewIncomeTypeButton();
		String expectedIncomeTypeValue="Commissions";
		income.inputIncomeTypeValue(expectedIncomeTypeValue);
		util.holdOn(Duration.ofSeconds(1));
		String primaryExpectedOtherInputTypeCurrentAmt="4567";
		String primaryExpectedOtherInputTypeProjectedRetirementAmt="3456";
		String SpouseExpectedOtherInputTypeCurrentAmt="2345";
		String SpouseExpectedOtherInputTypeProjectedRetirementAmt="9876";
		List OtherInputTypeAmts=	new ArrayList();
		OtherInputTypeAmts.add(primaryExpectedOtherInputTypeCurrentAmt);
		OtherInputTypeAmts.add(primaryExpectedOtherInputTypeProjectedRetirementAmt);
		OtherInputTypeAmts.add(SpouseExpectedOtherInputTypeCurrentAmt);
		OtherInputTypeAmts.add(SpouseExpectedOtherInputTypeProjectedRetirementAmt);
		income.inputOtherIncomeTypeInputValues(OtherInputTypeAmts);
		
		util.holdOn(Duration.ofSeconds(1));
		String expectedPrimaryMemberWhatIsYourCurrentNextIncomeValue="98434";
		income.inputPrimaryMemberWhatIsYourCurrentNetIncome(expectedPrimaryMemberWhatIsYourCurrentNextIncomeValue);
		String expectedSpouseWhatIsYourCurrentNextIncomeValue="84754";
		income.inputSpouseMemberWhatIsYourCurrentNetIncome(expectedSpouseWhatIsYourCurrentNextIncomeValue);
		String expectedFromYourNetIncomeValue="93485";
		income.inputFromYourNetIncomeValue(expectedFromYourNetIncomeValue);
		income.checkDoYouHavePensionYesRadioButton();
		String expectedHowMuchValue="9867";
		income.inputHowMuchValue(expectedHowMuchValue);
		income.checkWillTheClientContinueYesRadioButton();
		String expectedPensionPercentage="18";
		income.inputPensionPercentage(expectedPensionPercentage);
		income.checkDoYouHaveAnyAnticipatedChangesYesRadioButton();
		String expectedAnticipatedIncome="9438";
		income.inputAnticipatedAmountValue(expectedAnticipatedIncome);
		String expectedComment="this is my income";
		income.inputCommentValue(expectedComment);

		income.clickSaveProceedToCurrentExpensesButton();
		common.waitUntilToasterMessageisSeen();
		util.holdOn(Duration.ofSeconds(5));
		assets.clickIncomeSideBarLink();

		Integer expectedPrimaryCurrentAmt=Integer.parseInt(primaryExpectedSocialSecurityCurrentAmt)+Integer.parseInt(primaryExpectedEmploymentGrossCurrentAmt)+Integer.parseInt(primaryExpectedPensionGrossCurrentAmt)+Integer.parseInt(primaryExpectedIraCurrentAmt)+Integer.parseInt(primaryExpectedAnnutiesCurrentAmt)+Integer.parseInt(primaryExpectedIncomeFromInvestmentCurrentAmt)+Integer.parseInt(primaryExpectedrentalIncomeCurrentAmt)+Integer.parseInt(primaryExpectedBusinessInterestsCurrentAmt)+Integer.parseInt(primaryExpectedSalaryCurrentAmt)+Integer.parseInt(primaryExpectedOtherCurrentAmt)+Integer.parseInt(primaryExpectedOtherInputTypeCurrentAmt);
		Integer expectedPrimaryProjectedRetirementAmt=Integer.parseInt(primaryExpectedSocialSecurityProjectedRetirementAmt)+Integer.parseInt(primaryExpectedEmploymentGrossProjectedRetirementAmt)+Integer.parseInt(primaryExpectedPensionGrossProjectedRetirementAmt)+Integer.parseInt(primaryExpectedIraProjectedRetirementAmt)+Integer.parseInt(primaryExpectedAnnutiesProjectedRetirementAmt)+Integer.parseInt(primaryExpectedIncomeFromInvestmentProjectedRetirementAmt)+Integer.parseInt(primaryExpectedrentalIncomeProjectedRetirementAmt)+Integer.parseInt(primaryExpectedBusinessInterestsProjectedRetirementAmt)+Integer.parseInt(primaryExpectedSalaryProjectedRetirementAmt)+Integer.parseInt(primaryExpectedOtherProjectedRetirementAmt)+Integer.parseInt(primaryExpectedOtherInputTypeProjectedRetirementAmt);
		Integer expectedSpouseCurrentAmt=Integer.parseInt(SpouseExpectedSocialSecurityCurrentAmt)+Integer.parseInt(SpouseExpectedEmploymentGrossCurrentAmt)+Integer.parseInt(SpouseExpectedPensionGrossCurrentAmt)+Integer.parseInt(SpouseExpectedIraCurrentAmt)+Integer.parseInt(SpouseExpectedAnnutiesCurrentAmt)+Integer.parseInt(SpouseExpectedIncomeFromInvestmentCurrentAmt)+Integer.parseInt(SpouseExpectedrentalIncomeCurrentAmt)+Integer.parseInt(SpouseExpectedBusinessInterestsCurrentAmt)+Integer.parseInt(SpouseExpectedSalaryCurrentAmt)+Integer.parseInt(SpouseExpectedOtherCurrentAmt)+Integer.parseInt(SpouseExpectedOtherInputTypeCurrentAmt);
		Integer expectedSpouseProjectedRetirementAmt=Integer.parseInt(SpouseExpectedSocialSecurityProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedEmploymentGrossProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedPensionGrossProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedIraProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedAnnutiesProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedIncomeFromInvestmentProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedrentalIncomeProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedBusinessInterestsProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedSalaryProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedOtherProjectedRetirementAmt)+Integer.parseInt(SpouseExpectedOtherInputTypeProjectedRetirementAmt);
		util.holdOn(Duration.ofSeconds(5));
		String actualPrimaryCurrentTotalAmt=     income.getPrimaryCurrentTotalAmountValue();
		String actualPrimaryProjectedRetirementTotalAmt=income.getPrimaryProjectedRetirementTotalAmountValue();
		String actualSpouseCurrentTotalAmt=     income.getSpouseCurrentTotalAmountValue();
		String actualSpouseProjectedRetirementTotalAmt=income.getSpouseProjectedRetirementTotalAmountValue();

		String actualPrimaryMemberWhatIsYourCurrentNetIncome=		income.getPrimaryMemberWhatIsYourCurrentNetIncome();
		String actualSpouseWhatIsYourCurrentNetIncome=		income.getSpouseWhatIsYourCurrentNetIncome();
		String actualFromYourNetIncomeHowMuchValue=		income.getFromYourNetIncomeHowMuchDoYou();
		String actualHowMuchValue=income.getHowMuchInputValue();
		String actualPensionValue=	income.getPensionInputValue();
		String actualAnticipatedIncomeValue=	income.getAnticipatedIncomeInputValue();
		String actualCommentText=	income.getCommentInputText();
		util.holdOn(Duration.ofSeconds(5));
		util.verifyActualExpectedText(expectedPrimaryCurrentAmt.toString(),actualPrimaryCurrentTotalAmt ,"Primary Current Income" );
		util.verifyActualExpectedText(expectedPrimaryProjectedRetirementAmt.toString(),actualPrimaryProjectedRetirementTotalAmt ,"Projected Retirement" );
		util.verifyActualExpectedText(expectedSpouseCurrentAmt.toString(),actualSpouseCurrentTotalAmt ,"Spouse Current Income" );
		util.verifyActualExpectedText(expectedSpouseProjectedRetirementAmt.toString(),actualSpouseProjectedRetirementTotalAmt ,"Spouse Current Income" );
		util.verifyActualExpectedText(actualPrimaryMemberWhatIsYourCurrentNetIncome,expectedPrimaryMemberWhatIsYourCurrentNextIncomeValue ,"What is your current net income? (Primary Member)" );
		util.verifyActualExpectedText(actualSpouseWhatIsYourCurrentNetIncome,expectedSpouseWhatIsYourCurrentNextIncomeValue ,"What is your current net income? (Spouse)" );
		util.verifyActualExpectedText(actualFromYourNetIncomeHowMuchValue,expectedFromYourNetIncomeValue ,"From your net income, how much do you contribute towards savings or retirement each month?" );
		util.verifyActualExpectedText(actualHowMuchValue,expectedHowMuchValue ,"How much ?" );
		util.verifyActualExpectedText(actualPensionValue, expectedPensionPercentage,"Pension percentage" );
		util.verifyActualExpectedText(actualAnticipatedIncomeValue, expectedAnticipatedIncome,"Anticipated Amount" );
		util.verifyActualExpectedText(actualCommentText, expectedComment,"Comment" );

	}


}
