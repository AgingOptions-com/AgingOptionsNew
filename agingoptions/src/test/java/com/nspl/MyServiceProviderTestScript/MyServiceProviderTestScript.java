package com.nspl.MyServiceProviderTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.agingoptions.lpolandingpage.LpoLandingPage;
import com.agingoptions.myServiceProviderPage.MyServiceProviderPage;
import com.nspl.agingoptions.webUtil.BaseTest;

public class MyServiceProviderTestScript extends BaseTest {
    @Test(priority = 1, enabled = false)
	public void verifyMyServiceProvider() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickMyServiceProvider();;
	     util.holdOn(Duration.ofSeconds(10));
	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
	    msp.verifyMyServiceproviderPage();
	}
    @Test(priority = 2, enabled = false)
	public void VerifyAddHealthProfessionalPhysican() {
		LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
		lpoLadning.ClickMyServiceProvider();;
	     util.holdOn(Duration.ofSeconds(10));
	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
	    msp.AddPhysician();
	}
    @Test(priority = 3, enabled = false)
     public void VerifyAddHousingProfessional() {
    	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
 		lpoLadning.ClickMyServiceProvider();;
 	     util.holdOn(Duration.ofSeconds(10));
 	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
 	    msp.verifyAddHousingProfessional();
     }
    @Test(priority = 4, enabled = false)
     public void VerifyAddFinanceProfessional() {
    	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
  		lpoLadning.ClickMyServiceProvider();;
  	     util.holdOn(Duration.ofSeconds(10));
  	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
  	    msp.verifyAddFinanceProfessional(); 
     }
    @Test(priority =5, enabled = false)
    public void VerifyAddLegalProfessional() {
    	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
   		lpoLadning.ClickMyServiceProvider();;
   	     util.holdOn(Duration.ofSeconds(10));
   	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
   	    msp.AddLegalProfessional();
   	    
    }
    @Test(priority = 1 ,enabled = false)
    public void VerifyAddSpecialist() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
   		lpoLadning.ClickMyServiceProvider();;
   	     util.holdOn(Duration.ofSeconds(10));
   	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
   	    msp.addSpecialist();
    }
    @Test(priority = 2,enabled = false)
    public void VerifyAddRealtor() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
   		lpoLadning.ClickMyServiceProvider();;
   	     util.holdOn(Duration.ofSeconds(10));
   	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
   	    msp.addRealtor();	
    	
    }
    @Test(priority = 3,enabled = false)
    public void VerifyAddFinancialAdvisor() {
    	LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
   		lpoLadning.ClickMyServiceProvider();;
   	     util.holdOn(Duration.ofSeconds(10));
   	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
   	    msp.AddFinancialAdvisor();
    }
    @Test(priority = 4,enabled = false)
     public void VerifyAddELA() {
    	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
    		lpoLadning.ClickMyServiceProvider();;
    	     util.holdOn(Duration.ofSeconds(10));
    	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
    	    msp.AddELA(); 
     }
    @Test(priority = 1)
    public void VerifyAddOtherTypeProfessional() {
    	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
 		lpoLadning.ClickMyServiceProvider();;
 	     util.holdOn(Duration.ofSeconds(10));
 	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
 	    msp.AddOtherTypeProfessional();
    }
    @Test(priority = 2)
    public void VerifySaveAndproceedToProfessionalDetails() {
    	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
  		lpoLadning.ClickMyServiceProvider();;
  	     util.holdOn(Duration.ofSeconds(10));
  	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
  	    msp.saveAndProceedtoHomeProfessional();
    }
    @Test(priority = 3)
    public void VerifySaveAndAddAnotherProfessional() {
    	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
   		lpoLadning.ClickMyServiceProvider();;
   	     util.holdOn(Duration.ofSeconds(10));
   	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
   	    msp.VerifySaveAndAddAnotherProfessional();
    }
    @Test(priority = 4)
    public void VerifySaveProfessionalDetailsWithCopySameDataToSpouseUnchecked() {
    	 LpoLandingPage lpoLadning=	    new LpoLandingPage(util);
    		lpoLadning.ClickMyServiceProvider();;
    	     util.holdOn(Duration.ofSeconds(10));
    	    MyServiceProviderPage msp= new MyServiceProviderPage(util);
    	    msp.SaveProfessionalDetailsWithCopySameDataToSpouseUnchecked();
    }
}
