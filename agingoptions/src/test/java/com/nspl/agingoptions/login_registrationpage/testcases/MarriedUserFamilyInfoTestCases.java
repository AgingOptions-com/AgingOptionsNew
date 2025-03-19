package com.nspl.agingoptions.login_registrationpage.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;
import com.nspl.agingoptions.webUtil.DataUtil;

public class MarriedUserFamilyInfoTestCases extends BaseTest {

	@Test(priority = 1)
	public void Family_TC001_ElementPresenceFamilyInfo() {

		util.printDataInReport(
				"Family_TC001_ElementPresenceFamilyInfo :-Verify In the Family Info add child page all element is displayed - Test Case is Started");

		DataUtil data = new DataUtil();
		Map<String, String> mapData = data.getTestCaseData("Family_TC002");
		CommonCode common = new CommonCode(util);
		common.gotoFamilyIcon(util.getProperty("paralegalSearchUser"));
		util.printDataInReport(
				"Family_TC001_ElementPresenceFamilyInfo :-Verify In the Family Info add child page all element is displayed - Test Case is completed");
	}

}
