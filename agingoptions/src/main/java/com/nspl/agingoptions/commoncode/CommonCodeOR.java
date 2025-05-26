package com.nspl.agingoptions.commoncode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.nspl.agingoptions.webUtil.WebUtil;

public class CommonCodeOR   {

	public CommonCodeOR(WebUtil we) {
		PageFactory.initElements(we.getDriver(), this);
	}

	@FindBy(xpath = "//input[@type='email']")
	protected WebElement tutaMailEmailTB;

	@FindBy(xpath = "//input[@type='password']")
	protected WebElement tutaMailPasswordTB;

	@FindBy(xpath = "//input[@class='icon checkbox-override click']")
	protected WebElement storePasswordCheckBox;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	protected WebElement tutaEmailLoginBT;

	@FindBy(xpath="//div[@class='flex mb-xs border-radius pt-m pb-m pl pr ml-s']")
	protected WebElement otpMessage;

	@FindBy(xpath="//input[@name='emailId']")
	protected WebElement loginEmailTB;

	@FindBy(xpath="//input[@name='password']")
	protected WebElement loginPasswordTB;

	@FindBy(xpath="//button[text()='Login']")
	protected WebElement universalLoginBT;

	@FindBy(xpath="//div[@id='first-box']/input")
	protected WebElement otpTB;

	@FindBy(xpath="//button[text()='Verify OTP']")
	protected WebElement clickVerifyOtpBT;

	@FindBy(xpath="//input[@title='Select all loaded items']")
	protected WebElement selectAllCheckBox;

	@FindBy(xpath="//button[@title='Trash']//div")
	protected WebElement deleteIcon;

	@FindBy(xpath="//div[@class='roleOptions']//span[text()='Paralegal']")
	protected WebElement paralegalOption;

	@FindBy(xpath="//p[text()='Select account']")
	protected WebElement selectAccountText;

	@FindBy(xpath = "//div[@class='d-flex align-items-center col-9']//input[@class='header-search p-1']")
	protected WebElement paralegalSearchTB;

	@FindBy(xpath="//span[@class='paraData']")
	protected WebElement paralegalSearchedUser;

	@FindBy(xpath="(//span[text()='Family'])[1]")
	protected WebElement familySideIcon;

	@FindBy(xpath="//div[@class='NewRegImg mt-lg-0']/img[@alt='NewReg']")
	protected WebElement newRegistrationBT;

	@FindBy(xpath="//input[@id='firstName']")
	protected WebElement firstNameTB;

	@FindBy(xpath="//input[@id='lastName']")
	protected WebElement lastNameTB;

	@FindBy(xpath="//input[@id='email']")
	protected WebElement emailNameTB;

	@FindBy(xpath="//select[@id='plans']")
	protected WebElement planDropDown;

	@FindBy(xpath="//input[@id='phoneNumber']")
	protected WebElement phoneNumberTB;

	@FindBy(xpath="//button[text()='Register']")
	protected WebElement registerBT;

	@FindBy(xpath="//button[@class='btn-close bt']")
	protected WebElement registrationCloseIcon;

	@FindBy(xpath="//img[@class='cursor-pointer mt-0 p-2 mx-2']")
	protected WebElement searchIcon;

	@FindBy(xpath="//strong[contains(text(),'Intake Form Registration')]")
	protected WebElement intakeFormRegistration;

	@FindBy(xpath="//div[text()='Send intake form link']/preceding-sibling::div/input[@type='checkbox']")
	protected WebElement sendIntakeLinkCheckBox;

	@FindBy(xpath="//input[@id='login']")
	protected WebElement yopmailSearchBox; 

	@FindBy (xpath="//i[@class='material-icons-outlined f36']")
	protected WebElement YopmailSearchIcon;

	@FindBy(xpath="//p//strong")
	protected WebElement otpText; 

	@FindBy(xpath="//iframe[@id='ifmail']")
	protected WebElement iFrame; 

	@FindBy (xpath="//input[@id='first']")
	protected WebElement otpInputBox;

	@FindBy(xpath="//button[@type='submit']")
	protected WebElement verifybutton;

	@FindBy(xpath="//a[text()='Sign Up']")
	protected  WebElement SignUpLink;

	@FindBy(xpath="(//div[@id='mainBody']//div[@class='roleOptions'])[1]")
	protected WebElement paralegalrole;

	@FindBy(xpath="//div[@class='roleOptions']//span[text()='Firm Administrator']")
	protected WebElement AdminRole;

	@FindBy(xpath="//div[@class='roleOptions']//span[text()='Event Coordinator']")
	protected WebElement EventCoordinatiorRole;

	@FindBy(xpath="//div[@class='roleOptions']//span[text()='Sign-In On App']")
	protected WebElement SignOnRole;

	@FindBy(xpath="//p[text()='View portal users here.']")
	protected WebElement welcomemessagetextofSignOn;

	@FindBy(xpath="//p[text()='Accounts switcher']")
	protected WebElement SelecteRolesText;

	@FindBy(xpath="//h2[text()='Intake / LPO Member List']")
	protected WebElement ParalegalInnertext;

	@FindBy(xpath="//p[text()='Sign up']")
	protected WebElement SignUpText;

	@FindBy(xpath="//div[@class='toaster_T']/following-sibling::h6")
	protected WebElement toasterMessage;

	@FindBy(xpath="//p[text()='Back to log in']")
	protected WebElement BackTologinLink;

	@FindBy(xpath="//p[text()='Login']")
	protected WebElement LoginText;

	@FindBy(xpath="(//span[text()='Housing'])[2]")
	protected WebElement HousingButtonUnderSetUp; 

	@FindBy(xpath="//h1[text()='Personal Information']")
	protected WebElement PersonalInformationIcon;

	@FindBy(xpath="//button[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'save and continue later')        or contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'save & continue later')]")
	protected WebElement saveContinueLaterBT;

	@FindBy(xpath="//button[contains(text(),'Save & Add Another')]")
	protected WebElement saveAddAnotherBT;

	@FindBy(xpath="//span[contains(text(),'Previous')]")
	protected WebElement previousButton;

	@FindBy(xpath="//button[text()='Click to resend']")
	protected WebElement clickToResendInnertext;

	@FindBy(xpath="//button[@id='refresh']")
	protected WebElement yopEmailRefreshIcon;

	@FindBy(xpath="(//label[contains(text(),'Cell  Number')]/parent::div//input)[1]")
	protected WebElement countryCodeTB;

	@FindBy(xpath="//div[@class='css-1dimb5e-singleValue']")
	protected WebElement countryCodeDropDown;

	@FindBy(xpath="//li[contains(text(),'(+91) IN')]")
	protected WebElement countryCode91;

	@FindBy(xpath="//p[contains(text(),'Address Type')]/parent::div//span")
	protected WebElement addressTypeDropDown;

	@FindBy(xpath="//li[contains(text(),'Physical')]")
	protected WebElement physicalAddressDropDownOption;

	@FindBy(xpath="//button[contains(text(),'Activate Client')]/following-sibling::div//span[@class='slider']")
	protected WebElement activateClientLPOToggleButton;
	

	
}


