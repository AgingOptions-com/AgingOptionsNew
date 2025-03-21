package com.agingoptions.health;

import org.openqa.selenium.support.PageFactory;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HealthInfoPageOR {

	public HealthInfoPageOR(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}
	
}
