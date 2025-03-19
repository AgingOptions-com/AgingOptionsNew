package com.agingoptions.family;

import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class AddFamilyOR {

	public AddFamilyOR(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}
	
}
