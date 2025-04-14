package com.agingoptions.LegalInfoPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nspl.agingoptions.webUtil.WebUtil;

public class FiduciaryBeneficiaryPage  extends FiducuaryBeneficiaryPageOr{
   
	public WebUtil wt;
	public FiduciaryBeneficiaryPage(WebUtil util) {
		super(util);
		this.wt=util;
		
	}

	public void verifyFiduciaryBeneficiaryPage() {
		wt.click(FiduciaryBeneficiaryDrawer, "Fiduciary Beneficiary Drawer");
		wt.verifyInnerText(FiduciaryBeneficiaryText, "Fiduciary/Beneficiary", "Fiducoiary beneficiary text");
		
	}
	public void verifyPrimaryMemberAndSposueFidbenList() {
		wt.click(FiduciaryBeneficiaryDrawer, "Fiduciary Beneficiary Drawer");
	String primarymembertext=	wt.getInnerText(Primarymembertogglebuttontext);
	 wt.printDataInReport("Primary member-: " + primarymembertext + "fiduciary beneficiary page member list");
		List<WebElement> ListObj =wt.driver.findElements(By.xpath("//tbody[@class='table-body-tr']//tr//td[@class='fidBenName']"));
	   wt.printDataInReport("Primary Member fiduciary beneficiary");
		for(int i=0; i<ListObj.size(); i++) {
	    	String fiduciaryBeneficirypageMember=ListObj.get(i).getText();
	    	wt.print(i+"."+fiduciaryBeneficirypageMember);
	    	
	    }
	    wt.click(spousetogglebuttontext, "Spouse toggle button");
	    String Spousetext=	wt.getInnerText(spousetogglebuttontext);
	    wt.printDataInReport("Spouse-: " + Spousetext + "fiduciary beneficiary page member list");
	    for(int j=0; j<ListObj.size(); j++) {
	    	String fiduciaryBeneficirypageMember=ListObj.get(j).getText();
	    	wt.print(j+"."+fiduciaryBeneficirypageMember);
	    	
	    }
	}
   public void verifyTableFidBenCheckBox() {
	   wt.click(FiduciaryBeneficiaryDrawer, "Fiduciary Beneficiary Drawer");	
	   wt.click(SpouseTablebenCheckbox, "Spouse Table Beneficiary check box");
	   wt.click(SpouseTablefidCheckBox, "Spouse fiduciary check box");
	   wt.click(ClientSpouseEditIcon, "Edit icon");
	   wt.holdOn(Duration.ofSeconds(5));
	   wt.isSelected(FiduciaryCheckBoxInDetails, "Fiduciary CheckBox in details Page");
	   wt.isSelected(BeneficiaryCheckBoxInDetails, "Beneficiary Checkbox in details Page");
	   
	}
   
}
