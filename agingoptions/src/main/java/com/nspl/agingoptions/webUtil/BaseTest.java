package com.nspl.agingoptions.webUtil;

import java.io.File;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.nspl.agingoptions.commoncode.CommonCode;

public class BaseTest {

	public static ExtentReports extReports;
	protected WebUtil util = new WebUtil();;
	static	ExtentTest extTest;

	@BeforeSuite
	public void beforeSuite() {
		extReports = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+ "\\test-output\\extentReport\\" + util.GetDateAndTime() + "_extentReport.html");
		extReports.attachReporter(spark);
		spark.config().setDocumentTitle("AgingOptions Report");
		spark.config().setReportName("AgingOptions Automation Report");
		spark.config().setTheme(Theme.DARK);
		util.loadProperty();
		extReports.setSystemInfo("OS", System.getProperty("os.name"));
		extReports.setSystemInfo("User Name", System.getProperty("user.name"));
		extReports.setSystemInfo("Browser", "ChromeBrowser");
		extReports.setSystemInfo("Java-Verison", System.getProperty("java.version"));
	}

	@BeforeTest
	public void beforeTest() {
		extTest = extReports.createTest("Dummy");
		util.setExtent(extTest);
		util.launchBrowser(util.getProperty("browserName"));
		util.hitUrl(util.getProperty("url"));
		CommonCode common=	new CommonCode(util);
		common.loginAttorneyEmailPassword();
		common.LoginWithNewMarriedUser();
		extReports.removeTest(extTest);
		extTest = null;
	}

	@BeforeClass
	public void beforeClass() {

		

	}

	@BeforeMethod
	public void beforeMethod(Method mt) {
		extTest = extReports.createTest(mt.getName());
		util.setExtent(extTest);
	}

	@AfterMethod
	public void afterMethod(ITestResult result, Method mt) {
		if (result.getStatus() == result.FAILURE) {
			String path = util.takeSchreenshot(mt.getName());
			util.getExtentTestObj().addScreenCaptureFromPath(path);
		}
		extReports.flush();
	}

	@AfterClass
	public void afterClass() {
		// util.quitBrowser();
		extReports.flush();
	}

	@AfterTest
	public void afterTest() {

	}

	@AfterSuite
	public void afterSuite() {
		extReports.flush();
	}

}
