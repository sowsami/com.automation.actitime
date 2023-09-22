package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.driver.DriverScript;

/*
 * Class : EnterPage - HomePage
 * Description: Manages all the HomePage elements
 * Developed by: Sowmya@gmail.com
 * Approved by: Sammy@gmail.com
 */

public class EnterPage extends DriverScript {

	// ******************************Page Elements
	// *******************************************//

	@FindBy(id = "logoutLink")WebElement Logoutlink;
	@FindBy(xpath = "//a[@class='userProfileLink username ']")WebElement userLoggedInText;

	// ******************************Page Elements
	// Initialization******************************//

	// PageFactory is a class in Selenium which is used to initialize the page
	// elements.

	public EnterPage() {
		PageFactory.initElements(driver, this);
	}
	// ******************************Page Actions
	// *********************************************//

	public void clickLogout() {
		Logoutlink.click();
	}

	public String getUserLoggedInText()
	{
		return userLoggedInText.getText();
	}

}
