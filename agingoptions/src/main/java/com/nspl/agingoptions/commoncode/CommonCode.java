package com.nspl.agingoptions.commoncode;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.nspl.agingoptions.webUtil.WebUtil;

public class CommonCode extends CommonCodeOR{

	private By shadowHost = By.cssSelector("div#mail-body"); // Shadow Root
	private By shadowElement = By.cssSelector("div#shadow-mail-body"); // OTP Container

	
	public WebUtil wt;
	 public CommonCode(WebUtil util) {
		 super(util);
			this.wt=util;
	}

	public String getTutaMailOtp() {

		wt.openNewTab();
		wt.hitUrl(wt.getProperty("tutaMailUrl"));
		wt.click(tutaMailEmailTB, "tuta mail text box");
		wt.sendValue(tutaMailEmailTB, wt.getProperty("tutaMailEmail"), "Attorney Email");  
		wt.click(tutaMailPasswordTB, "tuta mail text box");
		wt.sendValue(tutaMailPasswordTB, wt.getProperty("password"), "Attorney Password");
		wt.click(tutaEmailLoginBT, "Login Button");
		wt.click(otpMessage, "otp message");
		wt.holdOn(Duration.ofSeconds(1));
		return getTutaOtpAlreadyOpenUrl();

	}
	public String getTutaOtpAlreadyOpenUrl() {
		WebElement element = wt.getShadowElement(shadowHost, shadowElement);
		String otp=	   wt.extractOTP(element);
		wt.click(selectAllCheckBox, "select All checkbox");
		wt.click(deleteIcon, "Delete all email");
		return otp;
	}
	public void loginAttorneyEmailPassword() {

		wt.sendValue(loginEmailTB, wt.getProperty("attorneyEmail"), "Login Page Email");
		wt.sendValue(loginPasswordTB, wt.getProperty("attorneyPassword"), "Login Page Password");
		wt.click(universalLoginBT, "Universal Login Button");
		String otp=	getTutaMailOtp();
		wt.switchToWindowByUrlContains(wt.getProperty("url")+"/Account/verifyOtp", "Otp Verify Page");
		wt.sendValue(otpTB, otp, "OTP");
		wt.click(clickVerifyOtpBT,"Verify Otp button");
		wt.click(paralegalOption, "Paralegal Drop Down");

	}
	public void searchUserParaGotoLPO(String userEmail) {
		wt.sendValueWithEnter(paralegalSearchTB, userEmail,"Paralegal Search");
		wt.click(paralegalSearchedUser, "Paralegal screen searched user");
	}
	public void clickFamilySideIcon() {
		wt.click(familySideIcon, "Family Side Icon");
	}
	public void gotoFamilyIcon(String userEmail) {
		loginAttorneyEmailPassword();
		searchUserParaGotoLPO(userEmail);
		clickFamilySideIcon();

	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	
	
	 public void hiturlOfYopmail() {
		 wt.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 wt.nevigetUrl("https://yopmail.com/en/", "yopmail");
		 wt.verifyUrl("https://yopmail.com/en/","Yopmail" );
		 
	 }
	public void Gotosearchemail(String email) {
		
		 wt.clearTextBox(yopmailSearchBox);
		wt.sendValue(yopmailSearchBox, email, "Email");
	
		wt.click(YopmailSearchIcon, "Search icon");
		try {
			Thread.sleep(Duration.ofSeconds(4));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public String GoTofindtextOfOTP() {
		 wt.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 wt.switchToFrameByWebElement(iFrame);
		String text= wt.getInnerText(otpText);
		wt.nevigateAction("Otp Page").back();
		wt.nevigateAction("").back();
		return text;
	 }
	 public void returntoframe() {
		 wt.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		wt.nevigateAction("Otp Page").back();
		wt.nevigateAction("").back();
		
	 }
	 
	 public void gotoinputotp(String otp) {
		 wt.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 wt.sendValue(otpInputBox, otp, "OTP box");
	 }
	 public void GoToClickVerifyButton() {
		 
		 wt.click(verifybutton, "OTP Verify button");
		
		
		// wt.verifyUrl("https://aologinuat.agingoptions.com/Account/SelectRoles", "Select role page");
		
	 }
 
	 public void GoToClickSignUpLinkAndVerifySignUpPage() {
	    	wt.click(SignUpLink, "SignUp Link");
	    	try {
				Thread.sleep(Duration.ofSeconds(4));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	wt.verifyInnerText(SignUpText, "Sign up","Sign Up");
	    	//wt.verifyUrl("https://aologinuat.agingoptions.com/Account/Signup", "SignUp");
	    }
	 public void gotoClickParalegalOptions() {
	    
		 wt.click(paralegalrole, "Paralegal Role options");
		 try {
			Thread.sleep(Duration.ofSeconds(7));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 wt.verifyTitle("Paralegal ", "Aging Options");
		 wt.verifyInnerText(ParalegalInnertext,"Intake / LPO Member List","Paralegal screen" );
		// wt.verifyUrl("https://aointakeformuat.agingoptions.com/paralegal", "Paralegal page");
	 }
	 public void GotoclickAdminRoleoptions() {
		
		 wt.click(AdminRole, "Admin Role");
		 wt.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		 wt.verifyTitle("Admin", "AO Admin");
	 }
	 public void GoTOClickEventCoordinatorRole() {
		
		 wt.click(EventCoordinatiorRole, "Event Coordinator");
		 wt.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		 wt.verifyTitle("Counter Coordinator", "Counter-Coordinator");
		 
	 }
	 public void GoToClickSignOnRole() {
		
		 wt.click(SignOnRole, "Sign On");
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 wt.verifyInnerText(welcomemessagetextofSignOn, "View portal users here." ,"Sign on");
	 }
	 public void gotoClickVerifyButtonLoginAfterSignUp() {
		 
		 wt.click(verifybutton, "OTP Verify button");
		 try {
			Thread.sleep(Duration.ofSeconds(8));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void gotoclickOtpButton() {
		 wt.click(verifybutton, "OTP Verify button"); 
		 
	 }
	 public void verifyToasterMessage(String Message) {
		 wt.toasterverification(toasterMessage, Message);
	 }
	 public void VerifyBackToLogin() {
		 wt.click(BackTologinLink, "Back To Login Link");
		 try {
			Thread.sleep(Duration.ofSeconds(4));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 wt.verifyInnerText(LoginText, "Login", "Login Page");
	 }
	 public void ToasterMessage(String WarningMessage) {
		 wt.toasterverification(toasterMessage, WarningMessage);
	 }
	 
	 public void goToClickHousingButtonUnderSetUp() {
		 wt.click(HousingButtonUnderSetUp, "Housing Button under SetUp Page");
	 }
    public void verifyPersonalInfoPage()  {
    	
    	wt.verifyInnerText(PersonalInformationIcon, "Personal Information", "Personal Information text");
    }
}
