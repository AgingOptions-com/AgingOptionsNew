package com.nspl.HousingInfoPageTestcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Ao.HousingPage.ProfessionalDetailsPage;
import com.Ao.HousingPage.HousingProfessional_realtor;
import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class HousingProfessional_RealtorTestscript extends BaseTest {
	/*[TC037]-: Test steps and Expected result.
	 * When we click realtor drawer in housing professional 
	 * Then it should be navigated to realtor table page
	*/
	
	@Test(priority =1, enabled = false)
public void verifyRealtorPageOnHousingProfessional() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.verifyrelatorPageOnhousingprofessionalPage();
					
}
	/*[TC038]-:TestSteps and Expected result.
	 * When we Click realtor drawer in Housing professional
	 * And there is not any Realtor details In realtor table and professional count is '0 added' 
	 * Then the 'I don’t have Realtor' check box should be visible
	*/
	@Test(priority =2, enabled = false)
	public void VerifyIdONotHaveRealtorCheckBoxFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.IdoNotHaveRealtorFunctionality();
	}
	/*[TC039]-:TestSteps and Expected result
	 *  When we Check 'I don’t have Realtor' check box
	 * Then the toaster message 'Your data have been Saved successfully' should be displayed
	 *  */
	@Test(priority =3, enabled = false)
	public void VerifyClickIDoNotHaveRealtorCheckBox() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.ClickIdoNotHaveRealtor();
	}
	/*[TC040]-:TestSteps and Expected result.
	 * When the toggle button is highlighted 
	 * Then it should not be clickable 
	 * When the toggle button is unHighlighted 
	 * Then it should be clickable
	*/
	@Test(priority =4, enabled = false)
	public void verifyToggleButton() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		HousingProfessional_realtor  realtorObj=new  HousingProfessional_realtor(util) ;
		realtorObj.verifytoggleButton();
	}
	/*[TC041]-:TestSteps and Expected result
	 * When we select toggle button for primary member
	 * Then the primary member should be verified
	 * When we click add Realtor button 
	 * Then Realtor details page should be opened 
	 * When we input all the related field and click on save and continue button
	 * Then it should navigated to  Realtor table page and added member should be verified 
	*/
	@Test(priority = 5)
	public void verifyaddRealtorForPraimaryMember() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
    	util.holdOn(Duration.ofSeconds(3));
	ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
	housingProfessionalObj.addProfessionalForPrimaryMember();
	
	}
	/*[TC042]-:TestSteps and Expected result
	 * When we select toggle button for primary member
	 * Then the primary member should be verified
	 * When we click add Realtor button 
	 * Then Realtor details page should be opened 
	 * When we input all the related field and click on save and add another button
	 * Then it should navigated to  Realtor details page and added member should be verified 
	*/
	@Test(priority = 6)
	public void VerifySaveAndAddAnotherPrimaryMemberRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
    	util.holdOn(Duration.ofSeconds(3));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherprimaryMemberProfessionalDetails();
	}
	/*[TC043]-:TestSteps and Expected result
	 * When we select toggle button for primary member
	 * Then the primary member should be verified
	 * When we click add Realtor button 
	 * Then Realtor details page should be opened 
	 * When we input all the related field and click on save and add proceed spouse button
	 * Then it should navigated to  spouse Realtor table page and added member should be verified 
	*/
	
	@Test(priority = 7)
	 public void VerifySaveAndproceedPrimaryMemberRealtorDetails() {
			LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
	    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util); 
			housingProfessionalObj.saveAndProceedPrimaryMemberProfessionalDetail();
			housingProfessionalObj.verifyMortgageBroker();
	 
	 }
	
	/*[TC044]-:TestSteps and Expected result/
	 * When we select toggle button for Spouse member
	 * Then the Spouse member should be verified
	 * When we click add Realtor button 
	 * Then Realtor details page should be opened 
	 * When we input all the related field and click on save and continue button
	 * Then it should navigated to  Realtor details page and added member should be verified
	*/
	@Test(priority = 8)
	public void VerifySaveAndContinueSpouseRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
    	util.holdOn(Duration.ofSeconds(3));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.saveAndContinueProfessionalDetailsForSpouse();
	}
	/*[TC045]-:TestSteps and Expected result
	 * When we select toggle button for Spouse member
	 * Then the Spouse member should be verified
	 * When we click add Realtor button 
	 * Then Realtor details page should be opened 
	 * When we input all the related field and click on save and add another button
	 * Then it should navigated to  Realtor details same page and added member should be verified
	*/
	@Test(priority = 9)
	public void VerifySaveAndAddAnotherSpouseRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
    	util.holdOn(Duration.ofSeconds(3));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndAddAnotherSpouseProfessionalDetails();
	}
	/*[TC046]-:TestSteps and Expected result
	 * When we select toggle button for Spouse member
	 * Then the Spouse member should be verified
	 * When we click add Realtor button 
	 * Then Realtor details page should be opened 
	 * When we input all the related field and click on save and next: Mortgage broker
	 * Then it should navigated to mortgage broker page and added member should be verified
	*/
	@Test(priority = 10)
	public void VerifySaveAndProceedSpouseRealtorDetails() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
    	util.holdOn(Duration.ofSeconds(3));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.SaveAndProceedSpouseProfessionalDetails();
	}
	
	/*[TC047]-:TestSteps and Expected result
	 * When we select toggle button for primary member
	 * Then the primary member should be verified
	 * When we click add Realtor button 
	 * Then Realtor details page should be opened 
	 * When we check same as spouse check box
	 * And we input all the related field and click on save and next: Continue button
	 * Then the details should  be added for primary member as well as spouse too
	*/
	
	@Test(priority = 11, enabled = false)
	public void VerifyCopySameDataFunctionality() {
		LpoLandingPage lpoLadning=new LpoLandingPage(util);
		lpoLadning.clickHousingModule();	
		util.holdOn(Duration.ofSeconds(4));	
		HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
    	util.holdOn(Duration.ofSeconds(3));
		ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
		housingProfessionalObj.copysamedataToSpouseProfessionalDetails();
	}
	 /*[TC048]-:TestSteps and Expected result.
		 * When we select toggle button for primary member
		 * Then the primary member should be verified
		 * When we click add Realtor button 
		 * Then Realtor details page should be opened 
		 * And we input all the related field and click on save and Continue button
		 * Then the details should  be added for primary member 
		 * When we click on edit button 
		 * Then the details page should be opened
		 * When we update first name  and click on update button
		 * The first name should be updated
		*/
	 
	 @Test(priority = 12)
	public void VerifyUpdateRealtorDetails() {
		 LpoLandingPage lpoLadning=new LpoLandingPage(util);
			lpoLadning.clickHousingModule();	
			util.holdOn(Duration.ofSeconds(4));	
			HousingProfessional_realtor realtorObj=new HousingProfessional_realtor(util);
	    	realtorObj.verifyrelatorPageOnhousingprofessionalPage();
	    	util.holdOn(Duration.ofSeconds(3));
			ProfessionalDetailsPage housingProfessionalObj=	new ProfessionalDetailsPage(util);
			housingProfessionalObj.UpdateProfessionalDetails();
	}

}
