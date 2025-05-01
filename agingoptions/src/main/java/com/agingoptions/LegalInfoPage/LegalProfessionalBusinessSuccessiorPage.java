package com.agingoptions.LegalInfoPage;

import java.time.Duration;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class LegalProfessionalBusinessSuccessiorPage extends LegalProfessionalBusinessSuccessiorpageOr {
    public  WebUtil wt;
	public LegalProfessionalBusinessSuccessiorPage(WebUtil util) {
		super(util);
		this.wt=util;	
	}

	 public void IdoNotHaveBusinessSuccessiorFunctionality() {
	    	wt.click(LegalProfessionalDrawer, "Legal Professional Drawer");
	    	wt.holdOn(Duration.ofSeconds(4));
	    	wt.click(TaxAndBusinessSuccessionDrawer, "Business successior");
			String text=wt.getInnerText(ProfessionalCount);
	       if(text.equalsIgnoreCase("0 Added")) {
	    	   wt.print(text + " is matching expected text- 0 Added " );
	    	   wt.holdOn(Duration.ofSeconds(4));
	    	   wt.verifyInnerText(IdoNotHaveOneInnerText, "I don’t have a Tax", "I don't have Business successior text");
	       }else {
	    	   wt.print("I don’t have a Business successior check box not found");
	       }
		}	
	    public void ClickIdoNotHaveBusinessSuccessior() {
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
	    	   wt.print("I don’t have Business successior check box not found");
	       }
		}		

		public void verifytoggleButton() {
			wt.click(LegalProfessionalDrawer, "Legal Professional Drawer");
	    	wt.holdOn(Duration.ofSeconds(4));
			wt.click(highlightedtoggleButton, "Highlighted toggle button");
			wt.click(NonHighlighted, "uncolored toggle button");
			
	}
		 public void GoToBusinessSuccessiorPageOnLegalProfessional() {
				wt.click(LegalProfessionalDrawer, "Legal Professional Drawer");
			 wt.holdOn(Duration.ofSeconds(7));
			 wt.click(TaxAndBusinessSuccessionDrawer, "Business successsior drawer");
		
		    	
			 
		 }
}

