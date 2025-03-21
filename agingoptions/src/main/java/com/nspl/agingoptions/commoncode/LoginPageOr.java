package com.nspl.agingoptions.commoncode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nspl.agingoptions.webUtil.WebUtil;

import lombok.Getter;

@Getter
public class LoginPageOr {
	
	public LoginPageOr(WebUtil wt) {
	
		PageFactory.initElements(wt.getDriver(),this);
		
	}
	// Locators for Login Page
    @FindBy(xpath="//div[@class='input-container']//input[@type='email']")
	protected WebElement emailField;
    
    @FindBy(xpath="//input[@type='password']")
    protected WebElement passwordField;
   
    @FindBy(xpath="//div//button[text()='Login']")
    protected WebElement loginButton;
    
    @FindBy(xpath="//p[contains(text(),'The username or password you')]")
    protected WebElement Errormessage;
    
    @FindBy(xpath="//a[text()='Forgot Password?']")
    protected WebElement forgotPasswordLink;
    
    @FindBy(xpath="//input[@id='login']")
	protected WebElement yopmailSearchBox; 
    
    @FindBy (xpath="//i[@class='material-icons-outlined f36']")
	protected WebElement YopmailSearchIcon;
    
    @FindBy (xpath="//input[@id='first']")
	protected WebElement otpInputBox;
		
    @FindBy(xpath="//button[@type='submit']")
    protected WebElement verifybutton;
     
   @FindBy(xpath="//button[text()='Click to resend']")
   protected WebElement clicltoresendInnertext;
  
   @FindBy(xpath="//button[text()='Click to resend']")
   protected WebElement ClickToResendbutton;
}
