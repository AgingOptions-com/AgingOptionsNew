package com.Ao.HousingPage;

import java.time.Duration;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingProfessionalHandyManPage extends HousingProfessionalHandymanpageOr {
 
	public WebUtil wt;
	public HousingProfessionalHandyManPage( WebUtil util) {
	 super(util);
	 this.wt=util;
	}	
	
    public void IdoNotHavehandymanFunctionality() {
    	
    	wt.click(HousingProfessionalButton, "Housing Professional button");
    	wt.holdOn(Duration.ofSeconds(4));
    	wt.click(HandyManSection, "HandyMan Secton");
    	wt.holdOn(Duration.ofSeconds(5));
		String text=wt.getInnerText(ProfessionalCount);
       if(text.equalsIgnoreCase("0 Added")) {
    	   wt.print(text + " is matching expected text- 0 Added " );
    	   wt.holdOn(Duration.ofSeconds(4));
    	   wt.verifyInnerText(IdoNotHaveOneInnerText, "I don’t have a Handyman Services", "I don't have handyman inner text");
       }else {
    	   wt.print("I don’t have handyMan check box not found");
       }
	}	
    public void ClickIdoNotHaveHandyman() {
    	wt.click(HousingProfessionalButton, "Housing Professional button");
    	wt.holdOn(Duration.ofSeconds(4));
    	wt.click(HandyManSection, "Mortgage Broker Secton");
    	wt.holdOn(Duration.ofSeconds(5));
		String text=wt.getInnerText(ProfessionalCount);
       if(text.equalsIgnoreCase("0 Added")) {
    	   wt.print(text + " is matching expected text- 0 Added " );
    	   wt.holdOn(Duration.ofSeconds(4));
    	  wt.click(IDonothaveCheckBox, "I don't have checkbox");
    		CommonCode cmc=new CommonCode(wt);
    		cmc.verifyToasterMessage("Your data have been saved successfully.");
    	  
       }else {
    	   wt.print("I don’t have HandyMan check box not found");
       }
	}		
	public void verifytoggleButton() {
		wt.click(HousingProfessionalButton, "Housing Professional button");
    	wt.holdOn(Duration.ofSeconds(8));
    	wt.click(HandyManSection, "Handyman Secton");
    	wt.holdOn(Duration.ofSeconds(6));
    	wt.waitUntilPresentInUI(highlightedtoggleButton, "Highlighted toggle button");
		wt.click(highlightedtoggleButton, "Highlighted toggle button");
		wt.click(NonHighlighted, "uncolored toggle button");
		
}
	 public void GoToHandymanPageOnHousingInfo() {
		 wt.click(HousingProfessionalButton, "Housing professional Button");
		 wt.holdOn(Duration.ofSeconds(8));
	    	wt.click(HandyManSection, "HandyMan Secton");
	    	
		 
}
	 }
