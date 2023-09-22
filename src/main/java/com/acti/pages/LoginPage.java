package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.driver.DriverScript;

/*
 * Class : LoginPage
 * Description: Manages all the login page elements and actions 
 * Created date: 9/20/23
 * Developed by: Sowmya@gmail.com
 * Approved by: Sammy@gmail.com
 */


public class LoginPage extends DriverScript {
	
//******************************Page Elements *******************************************//	

	@FindBy(id ="username")WebElement usernameTb;
	@FindBy(name ="pwd")WebElement passwordTB;
	@FindBy(xpath ="//div[text()='Login ']")WebElement Loginbtn;
	@FindBy(className ="atLogoImg")WebElement actiImg;
	@FindBy(linkText ="Forgot your password?")WebElement forgotPasswordLink;
	
//******************************Page Elements Initialization******************************//
	
	// PageFactory is a class in Selenium which is used to initialize the page elements. 
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
//******************************Page Actions *********************************************//
	
	public void enterUserName(String username)
	{
		usernameTb.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordTB.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		Loginbtn.click();
	}
	
	public boolean isActiImgDisplayed()
	{
		return actiImg.isDisplayed();
	}
	
	public boolean isForgotPasswordLinkDisplayed()
	{
		return forgotPasswordLink.isDisplayed();
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
}
