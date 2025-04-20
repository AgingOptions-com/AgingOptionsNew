package com.nspl.agingoptions.commoncode;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.nspl.agingoptions.webUtil.WebUtil;

import lombok.Getter;
@Getter
public class LoginPage extends LoginPageOr {

	public WebUtil wt;

	public LoginPage(WebUtil util ) {
		super(util);
		this.wt=util;
		
	}
	

	    
	   public void verifyLoginPage() {
	    wt.verifyTitle("Login Page","Universal Login");
	   }
	  public void verifyOtpPage() {
		  wt.holdOn(Duration.ofSeconds(4));
		 wt.verifyInnerText( clicltoresendInnertext, "Click to resend" ,"Otp");
		 // wt.verifyUrl("https://aologinuat.agingoptions.com/Account/verifyOtp","OTP page");
	  }
	  public void verifyErrorMessage() {
		  wt.verifyInnerText(Errormessage, "The username or password you entered is incorrect. Please try again.","Login");
	  }

    public void GoToClickForgotPassword() {
     wt.click(forgotPasswordLink, "Forgot Password Link");
     wt.holdOn(Duration.ofSeconds(4));
	}
    public void verifyvalidLogin(String email,String password) {
    
    	wt.sendValue(emailField, email,"Email field");
		//wt.mouseClick(passwordField);
		//wt.clear(passwordField);
		wt.sendValue(passwordField, password,"Passsword Field");
	
		wt.click(loginButton,"Login button");
		wt.holdOn(Duration.ofSeconds(10));
		
    }
  
}

