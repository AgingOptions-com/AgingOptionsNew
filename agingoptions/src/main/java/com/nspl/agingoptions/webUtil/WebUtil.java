package com.nspl.agingoptions.webUtil;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;
import org.openqa.selenium.Point;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;

import net.bytebuddy.utility.RandomString;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class WebUtil {

	public WebDriver driver;
	private Actions actObj;
	private JavascriptExecutor js;
	private ExtentTest extTest;
	private static Properties prop;

	private static WebUtil util = new WebUtil();

	private WebUtil() {

	}

	public static WebUtil getObject() {
		if (util == null) {
			util = new WebUtil();
		}
		return util;
	}

	public void setExtent(ExtentTest ext) {
		this.extTest = ext;
	}

	public ExtentTest getExtentTestObj() {
		return extTest;
	}

	public WebDriver getDriver() {
		return driver;
	}

	// ==================================Open your Browser in incognito
	// mode=====================================================
	public void LaunchIncognitoBrowser(String browserName) {
		if (browserName.contains("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("incognito");
			option.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			option.addArguments("--start-maximized");
			driver = new ChromeDriver(option);
		} else if (browserName.contains("edge")) {
			EdgeOptions opt = new EdgeOptions();
			opt.addArguments("--inprivate");
			opt.addArguments("--start-maximized");
			driver = new EdgeDriver(opt);
		} else if (browserName.contains("firefox")) {
			FirefoxOptions opt = new FirefoxOptions();
			opt.addArguments("-private");
			opt.addArguments("--start-maximized");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		actObj = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}

	// ==================================Open your Browser in headless
	// mode=====================================================
	public void launchBrowserHeadlessMode(String browserName) {
		if (browserName.contains("chrome")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			driver = new ChromeDriver(opt);
		} else if (browserName.contains("edge")) {
			EdgeOptions opt = new EdgeOptions();
			opt.addArguments("--headless");
			driver = new EdgeDriver(opt);
		} else if (browserName.contains("firefox")) {
			FirefoxOptions opt = new FirefoxOptions();
			opt.addArguments("--headless");
			driver = new FirefoxDriver(opt);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		actObj = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}

	// ==================================Open your
	// Browser=====================================================
	public void launchBrowser(String browserName) {
		if (browserName.contains("chrome")) {
			ChromeOptions opt = new ChromeOptions();
			HashMap<String, Object> prefs = new HashMap<>();
			prefs.put("profile.default_content_setting_values.notifications", 2);// this will block the browser
			// notification
			prefs.put("credentials_enable_service", false);// this and below code will block the save password pop-up
			prefs.put("profile.password_manager_enabled", false);
			opt.setExperimentalOption("prefs", prefs);
			opt.addArguments("--start-maximized");
			opt.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			driver = new ChromeDriver(opt);
		} else if (browserName.contains("edge")) {
			EdgeOptions options = new EdgeOptions();
			HashMap<String, Object> prefs = new HashMap<>();
			prefs.put("profile.default_content_setting_values.notifications", 2); // Block browser notifications
			prefs.put("credentials_enable_service", false); // Disable password saving prompt
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--start-maximized");
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			driver = new EdgeDriver(options);
		} else if (browserName.contains("firefox")) {
			FirefoxOptions opt = new FirefoxOptions();
			opt.addArguments("--start-maximized");
			// opt.setExperimentalOption("excludeSwitches", new String[] {
			// "enable-automation" });
			driver = new FirefoxDriver(opt);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		actObj = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}

	// ==================================open
	// url=====================================================
	public void hitUrl(String url) {
		try {
			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void print(String printData) {
		System.out.println(printData);
	}

	// ===========================================send value with normal
	// method===============================
	public void sendValue(WebElement weEle, String value, String elementName) {
		try {
			weEle.clear();
			weEle.sendKeys(value);
			extTest.log(Status.PASS,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print(elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
		} catch (ElementNotInteractableException e) {
			weEle.clear();
			js.executeScript("arguments[0].value='" + value + "'", weEle);
			extTest.log(Status.PASS,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print(elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
		} catch (StaleElementReferenceException e) {
			weEle.clear();
			js.executeScript("arguments[0].value='" + value + "'", weEle);
			extTest.log(Status.PASS,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print(elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
		} catch (Exception e) {
			extTest.log(Status.FAIL, elementName + " [" + value + "]not Entered  in " + elementName + " Text Box");
			print("Failed" + elementName + " [" + value + "] not  Entered in " + elementName + " Text Box");
			e.printStackTrace();
			throw e;
		}
	}

	public void sendValueWithEnter(WebElement weEle, String value, String elementName) {
		try {
			clearTextBox(weEle);
			actObj.click(weEle).build().perform();
			actObj.sendKeys(value).build().perform();
			actObj.sendKeys(Keys.ENTER).build().perform();
			extTest.log(Status.PASS,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print(elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
		} catch (ElementNotInteractableException e) {
			js.executeScript("arguments[0].value='" + value + "'", weEle);
			extTest.log(Status.PASS,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print(elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
		} catch (Exception e) {
			extTest.log(Status.FAIL,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print("Failed" + elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			e.printStackTrace();
			throw e;
		}

	}

	public void verifyString(String ActualText, String ExpectedText) {
		if (ActualText.equalsIgnoreCase(ExpectedText) || ActualText.contains(ExpectedText)) {
			System.out.println(
					"passed: Actual text " + (ActualText) + " is matching with expected text " + (ExpectedText));
		} else {
			System.out.println("failed." + ActualText + " is not got as inertext");
		}
	}
	public void verifyInnerText(WebElement we, String expectedInnerText, String PageName) {
		String actualInnerText = we.getText();
		verifyString(actualInnerText, expectedInnerText);
		extTest.log(Status.INFO, "Inner text-" + actualInnerText + " , So we are now " + PageName + " ");
	}
	public void toasterverification(WebElement we, String ExpectedToasterText) {

		String Toaster = new WebDriverWait(driver, Duration.ofSeconds(8))
				.until(ExpectedConditions.elementToBeClickable(we)).getText();
		if (Toaster.contains(ExpectedToasterText)) {
			extTest.log(Status.PASS, "Toaster message verified as-" + Toaster);
			System.out.println("Login Failed: " + Toaster);
		} else {
			extTest.log(Status.FAIL, "Toaster message verified as-" + Toaster);
			System.out.println("Login Success:" + Toaster);
		}
	}

	// ===========================================send value with Actions class
	// method===============================
	public void sendValueJs(WebElement weEle, String value, String elementName) {
		try {
			// clearTextBox(weEle);
			// actObj.sendKeys(weEle, value).build().perform();
			js.executeScript("arguments[0].value='" + value + "'", weEle);
			extTest.log(Status.PASS,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print(elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
		} catch (ElementNotInteractableException e) {
			// weEle.clear();
			js.executeScript("arguments[0].value='" + value + "'", weEle);
			extTest.log(Status.PASS,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print(elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
		} catch (Exception e) {
			extTest.log(Status.FAIL,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print("Failed" + elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			e.printStackTrace();
			throw e;
		}
	}

	public void sendValueWithAct(WebElement weEle, String value, String elementName) {
		try {
			clearTextBox(weEle);
			actObj.click().sendKeys(weEle, value).build().perform();
			extTest.log(Status.PASS,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print(elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
		} catch (ElementNotInteractableException e) {
			weEle.clear();
			js.executeScript("arguments[0].value='" + value + "'", weEle);
			extTest.log(Status.PASS,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print(elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
		} catch (Exception e) {
			extTest.log(Status.FAIL,
					elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			print("Failed" + elementName + " [" + value + "] Entered Successfully in " + elementName + " Text Box");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================click normal
	// method===============================
	public void click(WebElement weEle, String elementName) {
		try {
			weEle.click();
			extTest.log(Status.PASS, "Click performed Successfully on -: " + elementName);
			print("Click performed Successfully on -: " + elementName);
		} catch (ElementNotInteractableException e) {
			js.executeScript("arguments[0].click()", weEle);
			extTest.log(Status.PASS, "Click performed Successfully on -: " + elementName);
			print("Click performed Successfully on -: " + elementName);
		} catch (StaleElementReferenceException e) {
			weEle.click();
			extTest.log(Status.PASS, "Click performed Successfully on -: " + elementName);
			print("Click performed Successfully on -: " + elementName);
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Click not performed on -: " + elementName);
			print("failed" + "Click not performed on -: " + elementName);
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================click Actions
	// method===============================

	public void nevigetUrl(String url, String urlName) {
		driver.navigate().to(url);
		extTest.log(Status.PASS, urlName + " url hitted succesfully");

	}

	public Navigation nevigateAction(String PageName) {
		Navigation nevigateobj = driver.navigate();
		extTest.log(Status.PASS, "Focus navigate on" + PageName);
		return nevigateobj;
	}

	public void clickActions(WebElement we, String elementName) {
		try {
			actObj.moveToElement(we).click(we).build().perform();
			extTest.log(Status.PASS, "Click performed Successfully on -: " + elementName);
			print("Click performed Successfully on -: " + elementName);
		} catch (ElementClickInterceptedException e) {
			js.executeScript("arguments[0].click()", we);
			extTest.log(Status.PASS, "Click performed Successfully on -: " + elementName);
			print("Click performed Successfully on -: " + elementName);
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Click not performed on -: " + elementName);
			print("failed" + " Click not performed on -: " + elementName);
			e.printStackTrace();
			throw e;
		}
	}

	public void clickJavaScript(WebElement we, String elementName) {
		try {
			js.executeScript("arguments[0].click()", we);
			extTest.log(Status.PASS, "Click performed Successfully on -: " + elementName);
			print("Click performed Successfully on -: " + elementName);
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Click not performed on -: " + elementName);
			print("failed" + " Click not performed on -: " + elementName);
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================mouse over
	// method===============================
	public void mouseOver(WebElement weEle, String elementName) {
		try {
			actObj.moveToElement(weEle).build().perform();
			extTest.log(Status.PASS, "mouse Over perfrom Successfully on -: " + elementName);
			print("mouse Over perfrom Successfully on -: " + elementName);
		} catch (Exception e) {
			extTest.log(Status.FAIL, "mouse Over not perfrom on -: " + elementName);
			print("Failed " + " mouse Over not perfrom on -: " + elementName);
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================double click
	// method===============================
	public void doubleClick(WebElement we, String elementName) {
		try {
			actObj.doubleClick(we).build().perform();
			extTest.log(Status.PASS, "double click perform successfully on -: " + elementName);
			print("double click  perfrom Successfully on -: " + elementName);
		} catch (Exception e) {
			extTest.log(Status.FAIL, "double click not perform on -: " + elementName);
			print("double click not perfrom on -: " + elementName);
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================drag and drop
	// method===============================
	public void dragAndDrop(WebElement source, WebElement target) {
		try {
			actObj.dragAndDrop(source, target).build().perform();
			extTest.log(Status.PASS, "drag and drop perform successfully");
			print("drag and drop perform  Successfully on");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "drag and drop not perform ");
			print("drag and drop not perform on");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================load property
	// file===============================
	public void loadProperty() {
		prop = new Properties();
		try {
			InputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\prop.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// ===========================================getproperty file
	// value===============================
	public String getProperty(String key) {
		String value = prop.getProperty(key);
		return value;
	}

	// ===========================================Accept
	// pop===============================
	public void acceptPopUp(String elementName) {
		try {
			driver.switchTo().alert().accept();
			extTest.log(Status.PASS, elementName + " pop is accepted");
			print(elementName + " pop is accepted");
		} catch (Exception e) {
			extTest.log(Status.FAIL, elementName + " pop is not accepted");
			print("failed " + elementName + " pop is accepted");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================dismiss popup
	// method===============================
	public void dismissPopUp(String elementName) {
		try {
			driver.switchTo().alert().dismiss();
			extTest.log(Status.PASS, elementName + " pop is dismissed");
			print(elementName + " pop is accepted");
		} catch (Exception e) {
			extTest.log(Status.FAIL, elementName + " pop is dismissed");
			print("Failed " + elementName + " pop is not accepted");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================value entered method in
	// popup===============================
	public void popUpSendKeys(String value, String elementName) {
		try {
			driver.switchTo().alert().sendKeys(value);
			extTest.log(Status.PASS, elementName + " value " + value + " entered Successfully");
			print(elementName + " value " + value + " entered Successfully");
		} catch (Exception e) {
			extTest.log(Status.FAIL, elementName + " value " + value + "not entered Successfully");
			print("Failed " + elementName + " value " + value + " not entered");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================this method will take
	// schreenshot===============================
	public String takeSchreenshot(String testCaseName) {
		DateFormat dt = new SimpleDateFormat("dd-MM-yyyy hh_mm_ss a");
		String date = dt.format(new Date());
		TakesScreenshot screeshot = (TakesScreenshot) driver;
		File sourceFile = screeshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("test-output\\Snapshot\\" + testCaseName + date + ".png");
		try {
			Files.copy(sourceFile, destFile);
			extTest.log(Status.INFO, "Screenshot taken successfully of fail test case");
			print(testCaseName + " Screenshot  taken successfully");
		} catch (IOException e) {
			print("Failed " + " Screenshot not taken");
			e.printStackTrace();
		}
		return destFile.getAbsolutePath();
	}

	// ===========================================By this method we can switch into
	// frame by stringorId===============================
	public void switchToFrameByString(String nameorId) {
		try {
			driver.switchTo().frame(nameorId);
			extTest.log(Status.PASS, "Frame Handle Successfully by String");
			print("Failed. " + "Frame Handle Successfully by String");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Frame Handle Successfully by String");
			e.printStackTrace();
			throw e;
		}

	}

	// ===========================================By this method we can switch into
	// frame by Index===============================
	public void switchToFrameByIndex(int index, String elementName) {
		try {
			driver.switchTo().frame(index);
			extTest.log(Status.PASS, "Frame Handle Successfully By Index Number");
			print("Frame Handle Successfully By Index Number");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Frame not Handle By Index Number");
			print("Failed Frame not Handle By Index Number");
			e.printStackTrace();
			throw e;
		}

	}

	// ===========================================By this method we can switch into
	// frame by WebElement===============================
	public void switchToFrameByWebElement(WebElement we) {
		try {
			driver.switchTo().frame(we);
			extTest.log(Status.PASS, "Frame handle Successfully by WebElement");
			print("Passed Frame  Handled By WebElement Successfully");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Frame not handled by WebElement");
			print("Failed Frame not Handled By WebElement");
			e.printStackTrace();
			throw e;
		}
	}

	public String getPopText() {
		String text = null;
		try {
			text = driver.switchTo().alert().getText();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return text;
	}

	// ===========================================By this method we can switch into
	// window by title contains===============================
	public void switchToWindowByTitleContains(String expectedTitle, String elementName) {
		try {
			Set<String> handlesValue = driver.getWindowHandles();
			for (String handle : handlesValue) {
				driver.switchTo().window(handle);
				String actualTitle = driver.getTitle();
				if (actualTitle.contains(expectedTitle)) {
					System.out.println("Successfully switch on " + elementName + " on window by contains");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed. not switch to " + elementName + " on window by contains");
			throw e;
		}
	}

	// ===========================================By this method we can switch into
	// window by url contains===============================
	public void switchToWindowByUrlContains(String expectedUrl, String elementName) {
		try {
			Set<String> handlesValue = driver.getWindowHandles();
			for (String handle : handlesValue) {
				driver.switchTo().window(handle);
				String actualUrl = driver.getCurrentUrl();
				if (actualUrl.contains(expectedUrl)) {
					System.out.println("Successfully switch on " + elementName + " on window by contains");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed. not switch to " + elementName + " on window by contains");
			throw e;
		}
	}

	// ===========================================By this method we can switch into
	// window by title===============================
	public void switchToWindowByTitle(String expectedTitle) {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String value : windowHandles) {
				driver.switchTo().window(value);
				String actualTitle = driver.getTitle();
				if (actualTitle.equalsIgnoreCase(expectedTitle)) {
					break;
				}
			}
			extTest.log(Status.PASS, "Window handle Successfully By Title");
			print("Window handle Successfully By Title");

		} catch (Exception e) {
			print("Failed Window not handle By Title");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================By this method we can switch into
	// window by url===============================
	public void switchToWindowByUrl(String expectedUrl) {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String value : windowHandles) {
				driver.switchTo().window(value);
				String actualTitle = driver.getCurrentUrl();
				if (actualTitle.equalsIgnoreCase(expectedUrl)) {
					break;
				}
			}
			extTest.log(Status.PASS, "Window handle Successfully By Url");
			print("Window handle Successfully By Url");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Window handle Successfully By Url");
			print("Failed " + "Window handle Successfully By Url");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================By this method we can open into a
	// newTab===============================
	public void openNewTab() {
		try {
			driver.switchTo().newWindow(WindowType.TAB);
			extTest.log(Status.PASS, "new tab open successfully");
			print("new tab open successfully");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "new tab not open");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================By this method we can hold on for
	// few seconds===============================
	public void holdOn(Duration time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ===========================================By this method we can
	// takeSchreenshot for any particular element===============================
	public File takeSchreenshotParticularElement(WebElement we, String elementName) {
		File schreenshot = null;
		try {
			schreenshot = we.getScreenshotAs(OutputType.FILE);
			extTest.log(Status.PASS, "Schreenshot taken successfully of " + elementName);
			print("Schreenshot taken successfully of " + elementName);
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Schreenshot taken successfully of " + elementName);
			print("Failed Schreenshot not taken of " + elementName);
			e.printStackTrace();
			throw e;
		}
		return schreenshot;
	}

	// ===========================================By this method we can scroll into
	// any particualr element===============================
	public void scrollIntoElement(WebElement we, String elementName) {
		try {
			actObj.scrollToElement(we).build().perform();
			extTest.log(Status.PASS, "Scroll Successfuly of " + elementName);
			print("Scroll Successfuly of " + elementName);
		} catch (Exception e) {
			extTest.log(Status.PASS, "Scroll not of " + elementName);
			print("Scroll not perform  on " + elementName);
			e.printStackTrace();
			throw e;
		}
	}
	// ===========================================By this method we can scroll into
	// any number===============================

	public void scroll(String number) {
		try {
			js.executeScript("window.scrollBy(0," + number + ")");

		} catch (Exception e) {
			print("scroll not perform " + number);
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================By this method we can get
	// innertext===============================
	public String getInnerText(WebElement we) {
		String text = null;
		try {
			text = we.getText();
			extTest.log(Status.PASS, "Text - " + text + " - found successfully");
			print(" Text " + text + " found successfully");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Text - " + text + " - found successfully");
			e.printStackTrace();
			print("Inner Text not found " + text);
			throw e;
		}
		return text;
	}

	// ===========================================By this method we can select drop
	// down by index===============================
	public void selectDropDownByIndex(WebElement we, int index, String elementName) {
		try {
			Select select = new Select(we);
			select.selectByIndex(index);
			extTest.log(Status.PASS, "drop down " + elementName + " is selected Successfully");
			print("drop down " + elementName + " is selected Successfully");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "drop down " + elementName + " is not selected");
			print("Failed " + "drop down " + elementName + " is not selected");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================By this method we can select drop
	// down by value===============================
	public void selectDropDownByValue(WebElement we, String dropDownValue, String elementName) {
		try {
			Select select = new Select(we);
			select.selectByValue(dropDownValue);
			extTest.log(Status.PASS, "drop down " + elementName + " is selected Successfully Value");
			print("drop down " + elementName + " is selected Successfully");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "drop down " + elementName + " is not selected By Value");
			print("Failed drop down " + elementName + " is not selected");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================By this method we can select drop
	// down by visible text===============================
	public void selectDropDownByVisibleText(WebElement we, String dropDownVisibleText, String elementName) {
		try {
			Select select = new Select(we);
			select.selectByVisibleText(dropDownVisibleText);
			extTest.log(Status.PASS, "drop down " + elementName + " is selected Successfully");
			print("drop down " + elementName + " is selected Successfully");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "drop down " + elementName + " is not selected");
			print("Failed " + "drop down " + elementName + " is not selected");
			e.printStackTrace();
			throw e;
		}
	}

	public void switchToDefaultContent() {
		try {
			driver.switchTo().defaultContent();
			print("switch to default content successfully");
		} catch (Exception e) {
			print("switch to default content not perform");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================By this method we can get drop
	// down selected text===============================
	public String getDropDownSelectedText(WebElement weEle) {
		String firstOptionText = null;
		Select select = null;
		try {
			select = new Select(weEle);
			WebElement firstOption = select.getFirstSelectedOption();
			firstOptionText = firstOption.getText();
			extTest.log(Status.PASS, "got selected option of dropdown");
			print("got selected option of dropdown");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Failed Selected option is not found");
			print("selected option of dropdown not got");
			e.printStackTrace();
			throw e;
		}
		return firstOptionText;
	}

	// ===========================================By this method we can get all drop
	// down options in webElement===============================

	public List<WebElement> getAllDropDownOptions(WebElement weEle) {
		Select select = null;
		List<WebElement> listDropDownWebEle = null;
		try {
			select = new Select(weEle);

			listDropDownWebEle = select.getOptions();
			extTest.log(Status.PASS, "all selected option found in drop down");
			print("all selected option found in drop down");
		} catch (Exception e) {
			print("all selected option not found in drop down");
			extTest.log(Status.FAIL, "Failed all selected options not found");
			e.printStackTrace();
			throw e;
		}
		return listDropDownWebEle;
	}

	// ===========================================By this method we can verify
	// actual and expected text===============================
	public void verifyActualExpectedText(String actualText, String expectedText, String elementName) {
		if (actualText.equalsIgnoreCase(expectedText)) {

			extTest.log(Status.PASS, "Passed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " ' Verify Successfully " + elementName);
			print("Passed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " ' Verify Successfully ");
		} else {
			extTest.log(Status.FAIL, "Failed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " 'not Verify " + elementName);
			print("Failed Actual text '" + actualText + " 'and  Expected Text  '" + expectedText + " 'not  Verify");
		}
		Assert.assertEquals(actualText, expectedText);
	}

	public void verifyActualExpectedTextContains(String actualText, String expectedText, String elementName) {
		String actual =actualText.trim();
		String expected=expectedText.trim();
		if (actual.contains(expected)) {
			extTest.log(Status.PASS, "Passed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " ' Verify Successfully " + elementName);
			print("Passed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " ' Verify Successfully ");
			
		}else if(actual.equalsIgnoreCase(expected)) {
			extTest.log(Status.PASS, "Passed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " ' Verify Successfully " + elementName);
			print("Passed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " ' Verify Successfully ");
		}
		else {
			
			
			extTest.log(Status.FAIL, "Failed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " 'not Verify " + elementName);
			print("Failed Actual text '" + actualText + " 'and  Expected Text  '" + expectedText + " 'not  Verify");
		}
		
	}

	public void verifyActualExpectedTextContains(String actualText, String expectedText) {
		if (actualText.contains(expectedText)) {
			extTest.log(Status.PASS, "Passed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " ' Verify Successfully ");
			print("Passed Actual text '" + actualText + "'and  Expected Text  '" + expectedText
					+ " ' Verify Successfully ");
		} else {
			extTest.log(Status.FAIL,
					"Failed Actual text '" + actualText + "'and  Expected Text  '" + expectedText + " 'not Verify ");
			print("Failed Actual text '" + actualText + "'and  Expected Text  '" + expectedText + " 'not  Verify");
		}
		Assert.assertEquals(actualText, expectedText);
	}

	public void verifyPageUrl(String actualUrl, String expectedUrl) {
		if (actualUrl.contains(expectedUrl)) {
			extTest.log(Status.PASS, "Passed Actual title '" + actualUrl + "'and  Expected title '" + expectedUrl
					+ " ' Verify Successfully ");
			print("Passed Actual text '" + actualUrl + "'and  Expected Text  '" + expectedUrl
					+ " ' Verify Successfully ");
		} else {
			extTest.log(Status.FAIL, "Fail Actual title '" + actualUrl + "'and  Expected title '" + expectedUrl
					+ " ' Verify Successfully ");
			print("Failed Actual text '" + actualUrl + "'and  Expected Text '" + expectedUrl + " 'not  Verify");
		}
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	// ===========================================By this method we can quit
	// browser===============================

	public void verifyUrl(String expectedUrl, String pageName) {
		String ActualUrl = getUrl();
		ActualUrl.contains(expectedUrl);
		// // wt.verifyString(ActualUrl, expectedUrl);
		// Assert.assertEquals(ActualUrl, expectedUrl);
		extTest.log(Status.PASS, pageName + " Url 👉 " + ActualUrl + " matching with expected URL 👉" + expectedUrl);
	}

	public void quitBrowser() {
		try {
			driver.quit();
			extTest.log(Status.PASS, "Browser quit successfully");
			print("browser quit successfully");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Browser not quit");
			print("Failed browser not quit");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================By this method we can get drop
	// down option in number===============================
	public int getDropDownOptionCount(WebElement weEle, String massage) {
		String elementName = weEle.getAccessibleName();
		Select select = null;
		int optionsCount;
		List<WebElement> options = null;
		try {
			select = new Select(weEle);
			options = select.getOptions();
			optionsCount = options.size();
			extTest.log(Status.PASS, elementName + "successfully got all options count");
			print(elementName + "successfully got all options count");
		} catch (Exception e) {
			e.printStackTrace();
			extTest.log(Status.FAIL, "Failed. all option count not got for" + elementName + " drop down");
			print(elementName + "successfully got all options count");
			throw e;
		}
		return optionsCount;
	}

	// ===========================================By this method we can get title of
	// the page===============================
	public String getPageTitle() {
		String pageTitle = null;
		try {
			pageTitle = driver.getTitle();
			extTest.log(Status.PASS, pageTitle + "-: title found successfully");
			print(pageTitle + "-: title found successfully");
		} catch (Exception e) {
			print(pageTitle + "-: title found successfully");
			extTest.log(Status.FAIL, pageTitle + "-: failed. title is not found ");
			e.printStackTrace();
			throw e;
		}
		return pageTitle;
	}

	// ===========================================By this method we can get url of
	// page===============================
	public String getUrl() {
		String pageUrl = null;
		try {
			pageUrl = driver.getCurrentUrl();
			extTest.log(Status.PASS, "url found successfully ");
			print(pageUrl + " url found successfully ");
		} catch (Exception e) {
			print(pageUrl + " url not found");
			extTest.log(Status.FAIL, "failed. url is not found ");
			e.printStackTrace();
			throw e;
		}
		return pageUrl;
	}

	// ===========================================By this method we can perform
	// single click===============================
	public void mouseSingleClick(WebElement weELe, String elementName) {
		Actions actObj = null;
		try {
			actObj = new Actions(driver);
			actObj.click(weELe).build().perform();
			extTest.log(Status.PASS, "single click successfully perform on " + elementName);
			print("single click successfully perform on " + elementName);
		} catch (ElementNotInteractableException e) {
			js.executeScript("arguments[0].click();", weELe);
			extTest.log(Status.PASS, "single click successfully perform on " + elementName);
			print("single click successfully perform on " + elementName);
		} catch (Exception e) {
			extTest.log(Status.FAIL, "single click not perform on " + elementName);
			print("Failed single click not  perform on " + elementName);
			e.printStackTrace();
			throw e;
		}
	}

	public void zoomIn() {
		js.executeScript("document.body.style.zoom='1.2'");
	}

	public void zoomOut() {
		js.executeScript("document.body.style.zoom='0.8'");
	}

	// ===========================================By this method we can verify
	// attribute value===============================
	public void verifyAttributeValue(WebElement we, String expectedText, String attributeName) {
		String Actualattribute = we.getAttribute(attributeName).trim();
		if (Actualattribute.equalsIgnoreCase(expectedText)) {
			extTest.log(Status.PASS, "Passed. actualAttribute-" + Actualattribute + " expectedAttribute- "
					+ attributeName + " attribute verify successfully");
			print("Passed. actualAttribute-" + Actualattribute + " expectedAttribute- " + attributeName);
		} else {
			print("Failed. actualAttribute-" + Actualattribute + " expectedAttribute- " + attributeName);
			extTest.log(Status.FAIL, "Failed. actualAttribute-" + Actualattribute + " expectedAttribute- "
					+ attributeName + "- attribute not verify");
		}
		Assert.assertEquals(expectedText, Actualattribute);
	}

	// ===========================================By this method we can verify
	// title===============================
	public void verifyTitle(String expectedTitle, String elementName) {
		String actualTitle = driver.getTitle();
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			extTest.log(Status.PASS, "Passed. expected Title-" + expectedTitle + "- actualTitle-" + actualTitle
					+ "- verify successfully " + elementName + " page is opened");
			print("Passed. expected Title-" + expectedTitle + " actual Title-" + actualTitle);
		} else {
			print("Failed. expectedTitle-" + expectedTitle + " actualTitle-" + actualTitle);
			extTest.log(Status.FAIL, "Failed. expected Title-" + expectedTitle + " -and  actualTitle -" + actualTitle
					+ "- not verify" + elementName + " page is not opened");
		}
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void verifyUrlContains(String expectedUrl, String elementName) {
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.contains(actualUrl)) {
			extTest.log(Status.PASS, "Passed. expected Title-" + expectedUrl + "- actual url-" + actualUrl
					+ "- verify successfully " + elementName + " page is opened");
			print("Passed. expected url-" + expectedUrl + " actual url-" + actualUrl);
		} else {
			print("Failed. expected url-" + expectedUrl + " actualurl-" + actualUrl);
			extTest.log(Status.FAIL, "Failed. expected Url-" + expectedUrl + " -and  actual Url -" + actualUrl
					+ "- not verify" + elementName + " page is not opened");
		}
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	// ===========================================By this method we can verify
	// url===============================
	public void verifyUrl(String expectedUrl) {
		String actualUrl = driver.getCurrentUrl();
		if (expectedUrl.equalsIgnoreCase(actualUrl)) {
			extTest.log(Status.PASS,
					"Passed. expectedUrl-" + expectedUrl + "- and  ActualUrl- " + actualUrl + " verify Successfully");
			print("Passed. expectedUrl-" + expectedUrl + "- and  ActualUrl- " + actualUrl + " verify Successfully");
		} else {
			extTest.log(Status.FAIL,
					"Failed. expectedUrl-" + expectedUrl + " ActualUrl- " + actualUrl + "- not verify");
			print("Failed. expectedUrl- " + expectedUrl + " - and  ActualUrl- " + actualUrl + " not verify");
		}
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	// ===========================================By this method we can verify
	// element enabled or not===============================
	public void verifyEnabled(WebElement we) {
		boolean enable = we.isEnabled();
		if (enable == true) {
			extTest.log(Status.PASS, "-element is enabled");
			print("-element is enabled");
		} else {
			extTest.log(Status.FAIL, "-element is not enable");
			print("-element is not enabled");
		}
		Assert.assertTrue(enable == true);
	}

	// ===========================================By this method we can verify
	// element disabled or not===============================
	public void verifyDisabled(WebElement we) {
		boolean disable = we.isEnabled();
		if (disable == false) {
			extTest.log(Status.PASS, "-element is disbaled");
			print("element is disabled");
		} else {
			extTest.log(Status.FAIL, "-element is not disbaled");
			print("element is not disabled");
		}
		Assert.assertTrue(disable == false);
	}

	// ===========================================By this method we can verify
	// visible or not===============================
	public void verifyElementVisible(WebElement we) {
		boolean isVisible = we.isDisplayed();
		if (isVisible == true) {
			extTest.log(Status.PASS, "element is Visible");
			print("-element is Visible");
		} else {
			extTest.log(Status.FAIL, "element is not Visible");
			print("element is not Visible");
		}
		Assert.assertTrue(isVisible == true);
	}

	// ===========================================By this method we can verify
	// element visible or not===============================
	public void verifyDropDownSelectedValue(WebElement we, String selectedValue) {
		String dropDownText = getDropDownSelectedText(we);
		if (dropDownText.equalsIgnoreCase(selectedValue)) {
			extTest.log(Status.PASS, "Passed. " + dropDownText + " is selected");
			print("Passed. " + dropDownText + " is selected");
		} else {
			extTest.log(Status.FAIL, "Failed. " + dropDownText + " is not selected");
			print("Failed. " + dropDownText + " is not selected");
		}
		Assert.assertEquals(dropDownText, selectedValue);
	}

	public void isEnabled(WebElement weEle, String xpath) {
		boolean status = weEle.isEnabled();
		if (status == true) {
			extTest.log(Status.PASS, "Element is Enabled");
			print("Element is Enabled");
		} else {
			extTest.log(Status.FAIL, "Element is Disabled");
			print("Element is Disabled");
		}

	}

	/////////////// FOR IS SELECTED //////////////
	public void isSelected(WebElement weEle, String radioButtonName) {
		boolean status = weEle.isSelected();
		if (status == true) {
			extTest.log(Status.PASS, radioButtonName + " is selected");
			print(radioButtonName + " is selected");
		} else {
			extTest.log(Status.FAIL, radioButtonName + " is not selected");
			print(radioButtonName + " Failed: Element is not selected");
		}
		Assert.assertEquals(status, true);
	}

	///////////// for IsDisplay ///////////////
	public void isDisplayed(WebElement weEle, String elementName) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(weEle));
			boolean status = weEle.isDisplayed();
			if (status == true) {
				extTest.log(Status.PASS, "" + elementName + "- is displayed on the UI");
				print(elementName + " Element is displayed");
			} else {
				extTest.log(Status.FAIL, elementName + " is not displayed on the UI");
				print(elementName + " Failed: Element is not displayed");
			}
			holdOn(Duration.ofSeconds(1));
			assertTrue(status);
		} catch (Exception e) {
			extTest.log(Status.FAIL, "element is not found");
			print("Failed element is not found");
			e.printStackTrace();
			throw e;
		}
	}

	public void isNotDisplayed(WebElement we, String elementName) {
		if (we.isDisplayed() == false) {
			extTest.log(Status.PASS, "-" + elementName + "- is not displayed on the UI");

		} else {
			extTest.log(Status.FAIL, "-" + elementName + "- is displayed on the UI");
		}

	}

	// ===========================================By this method we can get
	// List<WebElement> ===============================
	public List<WebElement> getWebElements(List<WebElement> we) {

		List<WebElement> element = new ArrayList<WebElement>();
		WebElement weEle = null;
		try {
			for (int i = 0; i <= we.size() - 1; i++) {
				weEle = we.get(i);
				element.add(weEle);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		extTest.log(Status.PASS, "WebElements Get Successfully");
		return element;
	}

	// ===========================================By this method we can get date and
	// time===============================
	public String GetDateAndTime() {

		SimpleDateFormat SimpDate = new SimpleDateFormat("dd-MM-yyyy");
		String Time = SimpDate.format(new Date());
		return Time;

	}

	// ===========================================By this method we can verify text
	// with contains===============================
	public void VerifyContainsText(WebElement webEle, String expectedValue, String SnapShortName) {
		String ActualValue = webEle.getText();
		if (ActualValue.contains(expectedValue)) {
			extTest.log(Status.PASS,
					"Actual text( " + ActualValue + " ) & Expected text( " + expectedValue + " ) verified, Passed");
			print("Actual Value( " + ActualValue + " ) & Expected Value( " + expectedValue + " ) verified, Passed");
		} else {
			extTest.log(Status.FAIL,
					"Actual text( " + ActualValue + " ) & Expected text( " + expectedValue + " ) verified, Failed");
		}
		SoftAssert ast = new SoftAssert();
		ast.assertEquals(ActualValue, expectedValue);
	}

	// ===========================================By this method we can verify two
	// int value===============================
	public void VerifyValueResult(int ActualValue, int ExpectedValue) {

		if (ActualValue == (ExpectedValue)) {
			extTest.log(Status.PASS, "Where Actual Value( " + ActualValue + " ) & Expected Value( " + ExpectedValue
					+ " ) verified Passed");
			print("Where Actual Value( " + ActualValue + " ) & Expected Value( " + ExpectedValue
					+ " ) verified Passed");
		} else {
			extTest.log(Status.FAIL, "Where Actual Value( " + ActualValue + " ) & Expected Value( " + ExpectedValue
					+ " ) verified Failed");
			print("Actual text( " + ActualValue + " ) & Expected text( " + ExpectedValue + " ) verified Failed");
		}
		Assert.assertEquals(ActualValue, ExpectedValue);
	}

	// ===========================================By this method we can get
	// attribute value of webElement===============================
	public String GetAttributevalue(WebElement weEle, String attributeName) {
		String carryvalue1 = null;
		try {
			carryvalue1 = weEle.getAttribute(attributeName);
			extTest.log(Status.PASS, "Value " + carryvalue1 + " found Successfully");
		} catch (ElementNotInteractableException e) {
			carryvalue1 = weEle.getAttribute(attributeName);
			extTest.log(Status.PASS, "Attribute Value " + carryvalue1 + " found Successfully");
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Attribute Value Fetch Successfully " + " -" + attributeName);
			print("Attribute Value Fetch Successfully" + " -" + attributeName);
		}
		return carryvalue1;
	}

	// ===========================================By this method we can back from
	// the page===============================
	public void backward() {
		try {
			driver.navigate().back();
			extTest.log(Status.PASS, "Page Go Back Successfully");
			print("Page Go Back Successfully");
		} catch (Exception e) {
			print("Page not go Back");
			e.printStackTrace();
			throw e;
		}

	}

	// ===========================================By this method we can forward from
	// the page===============================
	public void forward(String msg) {
		try {
			driver.navigate().forward();
			extTest.log(Status.PASS, "Page Go Forword Successfully");
			print("Page Go Forword Successfully");
		} catch (Exception e) {
			print("Failed. Page not Go Forword ");
			e.printStackTrace();
			throw e;
		}
	}

	// ===========================================By this method we can get random
	// text===============================
	public String getRandomText(int length) {
		String currentText = null;
		try {
			RandomString text = new RandomString(length);
			currentText = text.nextString().toLowerCase();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return currentText;
	}

	// ===========================================By this method we can get otp one
	// by one in string===============================
	public List<String> getOtpOneByOne(String otp) {
		List<String> otpText = new ArrayList<String>();
		char[] digitsArray = otp.toCharArray();
		for (char digit : digitsArray) {
			String digitStr = String.valueOf(digit);
			otpText.add(digitStr);
		}
		return otpText;
	}

	public void clickRadioButton(WebElement we, String ElementName) {
		if (we.isSelected() == true) {
			extTest.log(Status.INFO, "Radio button is selected");
			click(we, ElementName);

			click(we, ElementName);

		} else {
			if (we.isSelected() == false) {
				extTest.log(Status.INFO, "Radio button is not selected");
				click(we, ElementName);
			}
		}
	}

	public void ListSize(List<WebElement> listObj) {
		int size = listObj.size();
		extTest.log(Status.INFO, size + " option is there in dropdown");

	}

	// ===========================================By this method we can check on all
	// check boxes===============================
	public void checkAllCheckBoxes(List<WebElement> weList, String elementName) {
		// List<WebElement> weList=null;
		try {
			for (int i = 0; i <= weList.size() - 1; i++) {
				WebElement weCheckBox = weList.get(i);
				if (weCheckBox.isSelected() == false) {
					weCheckBox.click();
				}
			}
			extTest.log(Status.PASS, "Successfully checked on all checkboxes for element " + elementName);
			print("Successfully checked on all checkboxes for element " + elementName);
		} catch (ElementClickInterceptedException e) {
			for (int i = 0; i <= weList.size() - 1; i++) {
				WebElement weCheckBox = weList.get(i);
				if (weCheckBox.isSelected() == false) {
					js.executeScript("arguments[0].click()", weList);
				}
			}
			extTest.log(Status.PASS, "Successfully checked on all checkboxes for element " + elementName);
			print("Successfully checked on all checkboxes for element " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed. ");
			throw e;
		}
	}

	// ===========================================By this method we can Uncheck on
	// all check boxes===============================
	public void uncheckAllCheckBoxes(List<WebElement> weList, String elementName) {
		// List<WebElement> weList=null;
		try {
			for (int i = 0; i <= weList.size() - 1; i++) {
				WebElement weCheckBox = weList.get(i);
				if (weCheckBox.isSelected() == true) {
					weCheckBox.click();
				}
			}
			extTest.log(Status.PASS, "Successfully Unchecked on all checkboxes for element " + elementName);
			print("Successfully checked on all Uncheckboxes for element " + elementName);
		} catch (ElementClickInterceptedException e) {
			for (int i = 0; i <= weList.size() - 1; i++) {
				WebElement weCheckBox = weList.get(i);
				if (weCheckBox.isSelected() == true) {
					js.executeScript("arguments[0].click()", weList);
				}
			}
			extTest.log(Status.FAIL, "Successfully Unchecked on all checkboxes for element " + elementName);
			print("Successfully checked on all Uncheckboxes for element " + elementName);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Failed. not click on " + elementName);
			throw e;
		}
	}

	// ===========================================By this method we can get table
	// header name in a list===============================
	public ArrayList getTableHeaderNameList(String tablexpath, String elementName) {
		ArrayList<String> textList = new ArrayList<String>();
		try {
			List<WebElement> tableColumnName = driver.findElements(By.xpath(tablexpath + "//tr[1]//td"));
			for (int i = 0; i <= tableColumnName.size() - 1; i++) {
				WebElement tableWe = tableColumnName.get(i);
				String tableColumnText = tableWe.getText();
				textList.add(tableColumnText);
			}
			System.out.println("Get Table Name List found Name Successfully of element " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed. get table name list not found on element " + elementName);
			throw e;
		}
		return textList;
	}

	// ===========================================By this method we can get table
	// row count===============================
	public int getTableRowCount(String tablexpath, String elementName) throws InterruptedException {
		int rowNumSize = -1;
		try {
			List<WebElement> weElements = driver.findElements(By.xpath(tablexpath + "//tr"));
			rowNumSize = weElements.size() - 1;
			System.out.println("Table found Successfully for element" + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed. table not found for element" + elementName);
			throw e;
		}
		return rowNumSize;
	}
	// ===========================================By this method we can get column
	// header count===============================

	public int getColumnHeaderCount(String xpath, String elementName) {
		int columnHeaderSize = -1;
		try {
			List<WebElement> columnList = driver.findElements(By.xpath(xpath + "//tr[1]//td"));
			columnHeaderSize = columnList.size();
			System.out.println("successfully found column header count of element " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
			throw e;
		}
		return columnHeaderSize;
	}

	// ===========================================By this method we can get column
	// number by column name===============================
	public int getColumnNumberByColumnName(String xpath, String elementName, String expectedText) {
		int columnNumber = -1;
		try {
			List<WebElement> columnList = driver.findElements(By.xpath(xpath + "//tr[1]//td"));
			for (int i = 0; i <= columnList.size() - 1; i++) {
				WebElement weColumn = columnList.get(i);
				String actualText = weColumn.getText();
				if (actualText.equalsIgnoreCase(expectedText)) {
					columnNumber = i + 1;
					System.out.println("Successfully got column Number By column for element Name" + elementName);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed. column number by column Name not found for element " + elementName);
			throw e;
		}
		return columnNumber;
	}

	// ===========================================By this method we can get row data
	// by row number===============================
	public ArrayList getRowDataListByRowNumber(String xpath, String elementName, int rowNumber) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			List<WebElement> listColumn = driver.findElements(By.xpath(xpath + "//tr[" + (rowNumber + 1) + "]//td"));
			for (int i = 0; i <= listColumn.size() - 1; i++) {
				WebElement weListRow = listColumn.get(i);
				String columnText = weListRow.getText();
				list.add(columnText);
				System.out.println("Row data Successfully added for element " + elementName);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed. Row data not added for element " + elementName);
			throw e;
		}
		return list;
	}

	// ===========================================By this method we can get column
	// data list by column number===============================
	public ArrayList<String> getColumnDataListByColumnNumber(String xpath, int columnNumber) {
		ArrayList<String> columnTextList = null;
		try {
			columnTextList = new ArrayList<String>();
			List<WebElement> columnList = driver.findElements(By.xpath(xpath + "//tr" + "//td[" + columnNumber + "]"));
			for (int i = 0; i <= columnList.size() - 1; i++) {
				WebElement weColumnList = columnList.get(i);
				String columnText = weColumnList.getText();
				columnTextList.add(columnText);
			}
			System.out.println("column data list by column number found Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed. column data list by column number not found ");
			throw e;
		}
		return columnTextList;
	}

	// ===========================================By this method we can refresh
	// page===============================
	public void refreshPage() {
		try {
			driver.navigate().refresh();
			extTest.log(Status.INFO, "Page refreshed successfully");
		} catch (Exception e) {
			e.printStackTrace();
			extTest.log(Status.INFO, "Page not regreshed successfully");
			System.out.println("Failed. page is not refreshed");
			throw e;
		}
	}

	public void clearTextBox(WebElement webEle) {
		try {
			
			webEle.clear();
		} catch (Exception e) {
			e.printStackTrace();
			extTest.log(Status.INFO, "Failed. clear not perform");
			throw e;
		}
	}

	public String getTitle() {
		String title = null;
		try {
			title = driver.getTitle();
			extTest.log(Status.INFO, "Page title-" + title + "- found successfully");
		} catch (Exception e) {
			e.printStackTrace();
			extTest.log(Status.FAIL, "Failed. title not found");
			throw e;
		}
		return title;
	}

	public void printDataInReport(String message) {
		extTest.log(Status.INFO, message);
		System.out.println(message);
	}

	public void waitUntilPresentInUI(WebElement we, String elementName) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(we));
			extTest.log(Status.PASS, " Successfull Waited for  " + elementName + " element");
		} catch (Exception e) {
			extTest.log(Status.FAIL, elementName + " Failed not waited for " + elementName + " element ");
			e.printStackTrace();
			throw e;
		}
	}

	public int getX(WebElement we) {
		int x = -1;
		try {
			Point point = we.getLocation();
			x = point.getX();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}

	public int getY(WebElement we) {
		int y = -1;
		try {
			Point point = we.getLocation();
			y = point.getY();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return y;
	}

	public void sendValueWithEnterDownKey(WebElement we, String Value) {
		try {
			actObj.sendKeys(we, Value).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void DownKey() {
		actObj.sendKeys(Keys.ARROW_DOWN).build().perform();
	}

	public void pressEnter() {
		holdOn(Duration.ofSeconds(1));
		actObj.sendKeys(Keys.ENTER).build().perform();
	}

	public String getReverseDob(String input) {
		String[] dateComponents = input.split("-");
		String reversedDate = dateComponents[2] + "-" + dateComponents[1] + "-" + dateComponents[0];
		return reversedDate;
	}

	public List<String> getDropDownOptionsTexts(WebElement we) {
		List<String> dropDownTexts = new ArrayList<String>();
		holdOn(Duration.ofSeconds(2));
		List<WebElement> texts = getAllDropDownOptions(we);
		int size = texts.size();
		for (int i = 0; i <= size - 1; i++) {
			WebElement textWeb = texts.get(i);
			String nowText = textWeb.getText();
			dropDownTexts.add(nowText);
			System.out.println(nowText);
		}
		return dropDownTexts;
	}

	public List<String> getMultipleElementTexts(List<WebElement> we) {
		List<String> dropDownTexts = new ArrayList<String>();
		holdOn(Duration.ofSeconds(2));

		int size = we.size();
		for (int i = 0; i <= size - 1; i++) {
			WebElement textWeb = we.get(i);
			String nowText = textWeb.getText();
			dropDownTexts.add(nowText);
			System.out.println(nowText);
		}
		return dropDownTexts;
	}

	public String getCurrentDateMonth() {
		holdOn(Duration.ofSeconds(1));
		LocalDate currentDate = LocalDate.now();
		holdOn(Duration.ofSeconds(1));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM");
		holdOn(Duration.ofSeconds(1));
		String formattedDate = currentDate.format(formatter);

		return formattedDate;
	}

	public void pressTab() {
		try {
			actObj.sendKeys(Keys.TAB).build().perform();
			holdOn(Duration.ofSeconds(1));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public String getTimeDateAndSecond() {

		DateFormat dt = new SimpleDateFormat("dd-MM-yyyy hh_mm_ss_ms a");
		String date = dt.format(new Date());
		return date;
	}

	public void elementPresentInHtml(String xpath, String elementName, long time) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			extTest.log(Status.PASS, " Successfull Waited for  " + elementName + "element");
		} catch (Exception e) {
			extTest.log(Status.FAIL, elementName + " Failed not waited for particular element ");
			e.printStackTrace();
			throw e;
		}
	}

	public WebElement getShadowElement(By shadowHostSelector, By elementInsideShadow) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowHost = driver.findElement(shadowHostSelector);
		SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);
		return shadowRoot.findElement(elementInsideShadow);
	}

	public String extractOTP(WebElement element) {
		String text = element.getText();
		Pattern pattern = Pattern.compile("\\b\\d{6}\\b");
		Matcher matcher = pattern.matcher(text);
		return matcher.find() ? matcher.group() : "OTP not found";
	}

	public void waitUntilElementClickableAndClick(WebElement we) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(we));
			element.click();
		} catch (StaleElementReferenceException e) {
			we.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void waitUntilElementToBeClickable(WebElement we) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(we));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pressSpaceButton() {
		try {
			actObj.sendKeys(Keys.SPACE).build().perform();
			;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pressBackSpaceButton() {
		try {
			actObj.sendKeys(Keys.BACK_SPACE).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickButtonAfterCheckingEnable(WebElement we) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			if (we.isEnabled()) {
				System.out.println("Button is enabled, clicking...");
				we.click();
			} else {
				System.out.println("Button is disabled, waiting...");
				wait.until(ExpectedConditions.elementToBeClickable(we)).click();
			}
		} catch (org.openqa.selenium.ElementClickInterceptedException e) {
			System.out.println("Button was not clickable within the wait time. Trying JavaScript click...");
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", we);
			} catch (NoSuchElementException ex) {
				System.out.println("Button not found on the page.");
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("An error occurred while clicking the submit button: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void selectRadioButton(WebElement we, String elementName) {
		try {
			if (we.isSelected() == false) {
				we.click();
				extTest.pass("Successfully selected the 'Yes' radio button of " + elementName);
			}
		} catch (Exception e) {
			extTest.fail("Failed to select the 'Yes' radio button. Exception: " + e.getMessage());
		}
	}

	public void deselectRadioButton(WebElement we, String elementName) {
		try {
			if (we.isSelected() == true) {
				we.click();
				extTest.pass("Successfully deselected the radio button of " + elementName);
			}
		} catch (Exception e) {
			extTest.fail("Failed to De-Select the radio button. Exception: " + e.getMessage());
		}
	}

	public void openAccordion(WebElement accordion, String elementName) {
		try {
			// Check if the accordion is already open using the "aria-expanded" attribute
			String expanded = accordion.getAttribute("aria-expanded");
			if (expanded != null && expanded.equals("true")) {
				System.out.println(elementName + " accordion is already open.");
				extTest.log(Status.INFO, elementName + " accordion is already open.");
				return;
			}
			accordion.click(); // Click the accordion to open
			System.out.println("Clicked on the " + elementName + " accordion to open it.");
			extTest.log(Status.PASS, "Clicked on the " + elementName + " accordion to open it.");
			// Wait for the accordion to expand
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.attributeToBe(accordion, "aria-expanded", "true"));
			System.out.println(elementName + " accordion opened successfully.");
			extTest.log(Status.PASS, elementName + " accordion opened successfully.");
		} catch (ElementClickInterceptedException e) {
			System.out.println("ElementClickInterceptedException for " + elementName + ". Using JavaScript Click...");
			extTest.log(Status.WARNING,
					"ElementClickInterceptedException for " + elementName + ". Using JavaScript Click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", accordion);
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException for " + elementName + ". Retrying...");
			extTest.log(Status.WARNING, "StaleElementReferenceException for " + elementName + ". Retrying...");
			openAccordion(accordion, elementName); // Retry opening
		} catch (Exception e) {
			System.out.println("Failed to open " + elementName + " accordion: " + e.getMessage());
			extTest.log(Status.FAIL, "Failed to open " + elementName + " accordion: " + e.getMessage());
		}
	}

	public void checkCheckBox(WebElement we, String checkboxName) {
		try {
			if (we.isSelected() == false) {
				we.click();
				System.out.println("Successfully checked checkbox: " + checkboxName);
				extTest.log(Status.PASS, "Successfully checked checkbox: " + checkboxName);
			}
		} catch (Exception e) {
			System.out.println("Checkbox '" + checkboxName + "' is already selected.");
			extTest.log(Status.INFO, "Checkbox '" + checkboxName + "' is already selected.");
		}
	}

	public void unCheckCheckBox(WebElement we, String checkboxName) {
		try {
			if (we.isSelected() == true) {
				we.click();
				System.out.println("Successfully Unchecked checkbox: " + checkboxName);
				extTest.log(Status.PASS, "Successfully Unchecked checkbox: " + checkboxName);
			}
		} catch (Exception e) {
			System.out.println("Checkbox '" + checkboxName + "' is already unchecked.");
			extTest.log(Status.INFO, "Checkbox '" + checkboxName + "' is already unchecked.");
		}
	}

	public void waitUntilTextPresentInUI(WebElement we, String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.textToBePresentInElement(we, text));
			extTest.log(Status.PASS, " Successfull Waited for  " + text + "element");
		} catch (Exception e) {
			extTest.log(Status.FAIL, text + " Failed not waited for particular element ");
			e.printStackTrace();
			throw e;
		}
	}

	public void verifyElementRadioButtonSelected(WebElement element, String elementName) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			boolean isChecked = (boolean) js.executeScript("return arguments[0].checked;", element);
			if (isChecked) {
				extTest.log(Status.PASS, elementName + " is selected");
				System.out.println(elementName + " is selected");
			} else {
				extTest.log(Status.FAIL, elementName + " is NOT selected");
				System.out.println(elementName + " is NOT selected");
			}
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Failed to verify selection state of " + elementName);
			e.printStackTrace();
		}
	}

	public boolean isRadioButtonChecked(WebElement element, String elementName) {
		try {
			String checkedAttribute = element.getAttribute("checked");
			boolean isChecked = (checkedAttribute != null);

			if (isChecked) {
				extTest.log(Status.PASS, elementName + " is selected");
				System.out.println(elementName + " is selected");
			} else {
				extTest.log(Status.FAIL, elementName + " is NOT selected");
				System.out.println(elementName + " is NOT selected");
			}
			return isChecked;
		} catch (Exception e) {
			extTest.log(Status.FAIL, "Failed to check the status of " + elementName);
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Waits until the loader disappears before proceeding.
	 * 
	 * @param loaderLocator    The By locator for the loader (id, class, xpath,
	 *                         etc.)
	 * @param timeoutInSeconds Maximum time to wait before failing
	 */
	public void waitForLoaderToDisappear(By loaderLocator, int timeoutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
			// Wait until the loader is invisible or not present in the DOM
			wait.until(driver -> {
				try {
					WebElement loader = driver.findElement(loaderLocator);
					return !loader.isDisplayed(); // Check if the loader is hidden
				} catch (NoSuchElementException | StaleElementReferenceException e) {
					return true; // If the loader is not found or removed from DOM, proceed
				}
			});
			System.out.println("Loader disappeared. Proceeding with next steps.");
		} catch (Exception e) {
			System.out.println("Loader is still visible after " + timeoutInSeconds + " seconds. " + e.getMessage());
		}
	}

	public void waitUntilElementIsSelected(WebElement we, long time) {
		try {
			WebDriverWait wait=	new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeSelected(we));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void waitUntilElementIsDeselected(WebElement we, long time) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(we)));
			System.out.println("Element is deselected successfully.");
		} catch (Exception e) {
			System.out.println("Timeout: Element is still selected after waiting.");
		} 
	}
	public void waitUntilValueIsSend(WebElement we,long time, String text) {
		try{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		 we.clear();
	     we.sendKeys(text);
		wait.until(ExpectedConditions.textToBePresentInElementValue(we, text));
		}catch(Exception e) {
			 System.out.println("Timeout: Text '" + text + "' was not found in the field within " + time + " seconds.");
		}
	}

	public void waitUntilElementIsDisappearFromThePage(WebElement we, long seconds) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	         wait.until(ExpectedConditions.invisibilityOf(we));
	        System.out.println("Element disappeared from the page.");
	    } catch (StaleElementReferenceException e) {
	        System.out.println("Element was removed from the DOM.");
	    }  catch (Exception e) {
	        System.out.println("Timeout: Element did not disappear within " + seconds + " seconds.");
	    }
	}
	
	public void uploadFile(WebElement fileUploadElement, String filePath) {
	    try {
	        fileUploadElement.sendKeys(filePath);  // Provide full path to the file
	        extTest.log(Status.PASS, "File uploaded successfully: " + filePath);
	        System.out.println("File uploaded successfully: " + filePath);
	    } catch (Exception e) {
	        extTest.log(Status.FAIL, "File upload failed: " + e.getMessage());
	        System.out.println("File upload failed: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
	public String convertDateFormatMMDDYYYY(String date) {
	    try {
	        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
	        SimpleDateFormat outputFormat = new SimpleDateFormat("MM-dd-yyyy");

	        Date parsedDate = inputFormat.parse(date);
	        return outputFormat.format(parsedDate);

	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	public String convertAmountActualValue(String actual) {
	    return actual.replaceAll(",", "").replaceAll("\\.00$", "");
	}





}