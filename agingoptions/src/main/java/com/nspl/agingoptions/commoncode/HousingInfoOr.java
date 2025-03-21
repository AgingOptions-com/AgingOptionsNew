package com.nspl.agingoptions.commoncode;

import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingInfoOr {

	
public HousingInfoOr (WebUtil wt) {
	PageFactory.initElements(wt.getDriver(),this);
	
}
}
