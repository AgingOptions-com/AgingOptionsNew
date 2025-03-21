package com.nspl.agingoptions.login_registrationpage.testcases;


import java.util.Map;

import org.testng.annotations.Test;
import com.nspl.agingoptions.commoncode.CommonCode;
import com.nspl.agingoptions.webUtil.BaseTest;
import com.nspl.agingoptions.webUtil.DataUtil;

public class MarriedUserFamilyInfoTestCases extends BaseTest {

	@Test(priority = 1)
	public void Health_001_Personal_MedicalHistory_ElementPresence() {
		DataUtil data=	new DataUtil();
		Map<String,String>	mapData=data.getTestCaseData("Health_001");
		String firstName=	mapData.get("firstName");
		String lastName=	mapData.get("lastName");
		CommonCode common = new CommonCode(util);
		String email=	common.createLifePlanningUser();
		common.searchUserParaGotoLPO(email);
		common.inputMarriedUserAcitvationPageDetails("1", "1999-12-28", "565", "Neelam", "1999-09-27");
	}

}
