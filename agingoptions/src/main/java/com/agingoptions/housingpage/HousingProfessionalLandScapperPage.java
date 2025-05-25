package com.agingoptions.housingpage;

import java.time.Duration;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingProfessionalLandScapperPage  extends HousingProfessionalLandscapperPageOr{
    
	public WebUtil wt;
	public HousingProfessionalLandScapperPage (WebUtil util) {
		super(util);
	   this.wt=util;
		
	}
	 public void IdoNotHaveLandScapperFunctionality() {
	    	wt.click(HousingProfessionalButton, "Housing Professional button");
	    	wt.holdOn(Duration.ofSeconds(4));
	    	wt.click(LandscapperDrawer, "LandScapper drawer");
	    	wt.holdOn(Duration.ofSeconds(5));
			String text=wt.getInnerText(ProfessionalCount);
	       if(text.equalsIgnoreCase("0 Added")) {
	    	   wt.print(text + " is matching expected text- 0 Added " );
	    	   wt.holdOn(Duration.ofSeconds(4));
	    	   wt.verifyInnerText(IdoNotHaveOneInnerText, "I don’t have a Mortgage Brokers", "I don't have mortgae broker text");
	       }else {
	    	   wt.print("I don’t have a mortgage Broker check box not found");
	       }
		}	
	    public void ClickIdoNotHaveLandscapper() {
	    	wt.click(HousingProfessionalButton, "Housing Professional button");
	    	wt.holdOn(Duration.ofSeconds(4));
	    	wt.click(LandscapperDrawer, "Land scapper Drawer");
	    	wt.holdOn(Duration.ofSeconds(5));
			String text=wt.getInnerText(ProfessionalCount);
	       if(text.equalsIgnoreCase("0 Added")) {
	    	   wt.print(text + " is matching expected text- 0 Added " );
	    	   wt.holdOn(Duration.ofSeconds(4));
	    	  wt.click(IDonothaveCheckBox, "I don't have checkbox");
	    		CommonCode cmc=new CommonCode(wt);
	    		cmc.verifyToasterMessage("Your data have been saved successfully.");
	    	  
	       }else {
	    	   wt.print("I don’t have Mortgage Broker check box not found");
	       }
		}		

		public void verifytoggleButton() {
			wt.click(HousingProfessionalButton, "Housing Professional button");
	    	wt.holdOn(Duration.ofSeconds(4));
	    	wt.click(LandscapperDrawer, "Land scapper Drawer");
	    	wt.holdOn(Duration.ofSeconds(5));
			wt.click(highlightedtoggleButton, "Highlighted toggle button");
			wt.click(NonHighlighted, "uncolored toggle button");
			
	}
		 public void GoToLandScapperPageOnHousingInfo() {
			 wt.click(HousingProfessionalButton, "Housing professional Button");
			 wt.holdOn(Duration.ofSeconds(7));
			 wt.click(LandscapperDrawer, "Land scapper Drawer");
		    	
			 
		 }
}
