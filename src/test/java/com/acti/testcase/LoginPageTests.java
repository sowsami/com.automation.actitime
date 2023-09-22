package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.driver.DriverScript;
import com.acti.pages.EnterPage;
import com.acti.pages.LoginPage;


/*
 * Class : LoginPageTests
 * Description: Contains all the test cases related to actiTime login page
 * Created date: 9/20/23
 * Developed by: Sowmya@gmail.com
 * Approved by: Sammy@gmail.com
 */

public class LoginPageTests extends DriverScript
{
	
	LoginPage loginpage;
	EnterPage enterpage;
	
	@BeforeMethod
	public void setUP()
	{
		DriverScript.initApplication();
		loginpage = new LoginPage();
		enterpage = new EnterPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		DriverScript.quitDriver();
	}
	
	
	@Test
	public void testLoginFunction()
	{		
		loginpage.enterUserName("admin");
		loginpage.enterPassword("manager");
		loginpage.clickLoginButton();	
		String actual = enterpage.getUserLoggedInText();
		Assert.assertTrue(actual.contains("John"));
		System.out.println(actual);
		enterpage.clickLogout();
		
	}
	
	
	
	
	
	
	
	
	
}