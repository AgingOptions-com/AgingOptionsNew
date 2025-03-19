package com.nspl.agingoptions.login_registrationpage.testcases;


import java.util.Map;

import org.testng.annotations.Test;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;
import com.nspl.agingoptions.webUtil.DataUtil;


public class MarriedUserFamilyInfoTestCases extends BaseTest {



	@Test(priority =1)
	public void TC002_ValidLogin() {

		util.printDataInReport("TC002_ValidLogin :-Verify user is able to signin in the application and navigate to Activation form - Test Case is Started");

		DataUtil data=	new DataUtil();
		Map<String,String> mapData=	data.getTestCaseData("TC-002");
		CommonCode common=	new CommonCode(util);
		common.loginAttorneyEmailPassword();
		util.printDataInReport("TC002_ValidLogin :-Verify user is able to signin in the application and navigate to Activation form - Test Case is Completed");

	}






}
