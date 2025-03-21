package com.nspl.agingoptions.commoncode;

import com.nspl.agingoptions.webUtil.WebUtil;

public class HousingInfo extends HousingInfoOr{

	public WebUtil wt;
	
	public HousingInfo(WebUtil util) {
		super(util);
		this.wt=util;
		
	}
	
	
}
