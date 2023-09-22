package com.acti.pages;

public class LoginPage {

	package com.acti.testcase;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.acti.driver.DriverScript;
	import com.acti.pages.LoginPage;

	public class LoginPageTest extends DriverScript
	{
		@FindBy(id="username") WebElement usernameTextbox;
		@FindBy(name="pwd") WebElement passwordTB;
		@FindBy(xpath = "//div[text()='Login ']") WebElement Loginbtn;
		@FindBy(className = "atLogoImg") WebElement actiImg;
		@FindBy(linkText = "Forgot your password?") WebElement forgotPasswordLink;
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
	}

}
