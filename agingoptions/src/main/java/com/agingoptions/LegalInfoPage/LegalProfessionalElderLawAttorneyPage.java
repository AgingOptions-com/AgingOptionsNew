package com.agingoptions.LegalInfoPage;

import java.time.Duration;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class LegalProfessionalElderLawAttorneyPage extends LegalProfessionalElderLawAttorneyPageOr {
	public WebUtil wt;
	public LegalProfessionalElderLawAttorneyPage (WebUtil util) {
		super(util);
	   this.wt=util;
		
	}
	 public void IdoNotHaveELAFunctionality() {
	    	wt.click(LegalProfessionalDrawer, "Legal Professional Drawer");
	    	wt.holdOn(Duration.ofSeconds(4));
	    	wt.click(ElderLawAttorneyDrawer, "ELA drawer");
			String text=wt.getInnerText(ProfessionalCount);
	       if(text.equalsIgnoreCase("0 Added")) {
	    	   wt.print(text + " is matching expected text- 0 Added " );
	    	   wt.holdOn(Duration.ofSeconds(4));
	    	   wt.verifyInnerText(IdoNotHaveOneInnerText, "I don’t have an Elder Law Attorney", "I don't have ELA text");
	       }else {
	    	   wt.print("I don’t have a ELA check box not found");
	       }
		}	
	    public void ClickIdoNotHaveELA() {
	    	wt.click(LegalProfessionalDrawer, "Legal Professional Drawer");
	    	wt.holdOn(Duration.ofSeconds(4));
			String text=wt.getInnerText(ProfessionalCount);
	       if(text.equalsIgnoreCase("0 Added")) {
	    	   wt.print(text + " is matching expected text- 0 Added " );
	    	   wt.holdOn(Duration.ofSeconds(4));
	    	  wt.click(IDonothaveCheckBox, "I don't have checkbox");
	    		CommonCode cmc=new CommonCode(wt);
	    		cmc.verifyToasterMessage("Your data have been saved successfully.");
	    	  
	       }else {
	    	   wt.print("I don’t have ELA check box not found");
	       }
		}		

		public void verifytoggleButton() {
			wt.click(LegalProfessionalDrawer, "Legal Professional Drawer");
	    	wt.holdOn(Duration.ofSeconds(4));
			wt.click(highlightedtoggleButton, "Highlighted toggle button");
			wt.click(NonHighlighted, "uncolored toggle button");
			
	}
		 public void GoToELAPageOnLegalProfessional() {
				wt.click(LegalProfessionalDrawer, "Legal Professional Drawer");
			 wt.holdOn(Duration.ofSeconds(7));
			 wt.click(ElderLawAttorneyDrawer, "Elder law attorney drawer");
		
		    	
			 
		 }
}

