package com.Ao.HousingPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingProfessional_realtor extends HousingProfessional_RealtorOr {

	public WebUtil wt;

	public  HousingProfessional_realtor(WebUtil util) {
		super(util);
		this.wt=util;
		
	
	}
	
  public void GotoClickHousingProfeesionalSection() {
	  wt.click(HousingProfessionalButton, "Housing professional section");
  }
	
  public void verifyRealtorPage() {
	  wt.verifyInnerText(RealtorsTextUnderTable, "Realtors", "Realtors text");
	  
  }
	public void verifyrelatorPageOnhousingprofessionalPage() {
		GotoClickHousingProfeesionalSection();
        verifyRealtorPage();
	}
	public void IdoNotHaveRealtorFunctionality() {
		verifyrelatorPageOnhousingprofessionalPage();
		String text=wt.getInnerText(ProfessionalCount);
       if(text.equalsIgnoreCase("0 Added")) {
    	   wt.print(text + " is matching expected text- 0 Added " );
    	   wt.holdOn(Duration.ofSeconds(4));
    	   wt.verifyInnerText(IdoNotHaveOneInnerText, "I don’t have a Realtor", "I don't have realtor text");
       }else {
    	   wt.print("I don’t have a Realtor check box not found");
       }
	}	
    
	public void ClickIdoNotHaveRealtor() {
		verifyrelatorPageOnhousingprofessionalPage();
		String text=wt.getInnerText(ProfessionalCount);
       if(text.equalsIgnoreCase("0 Added")) {
    	   wt.print(text + " is matching expected text- 0 Added " );
    	   wt.holdOn(Duration.ofSeconds(4));
    	  wt.click(IDonothaveCheckBox, "I don't have checkbox");
    		CommonCode cmc=new CommonCode(wt);
    		cmc.verifyToasterMessage("Your data have been saved successfully.");
    	  
       }else {
    	   wt.print("I don’t have a Realtor check box not found");
       }
	}		
	
	
	public void verifytoggleButton() {
		verifyrelatorPageOnhousingprofessionalPage();
		wt.click(highlightedtoggleButton, "Highlighted toggle button");
		wt.click(NonHighlighted, "uncolored toggle button");
	
}
}
