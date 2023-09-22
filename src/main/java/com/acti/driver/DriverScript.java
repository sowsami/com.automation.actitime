package com.acti.driver;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Class : DriverScript
 * Description: Manages all the driver instance.
 * Developed by: Sowmya@gmail.com
 * Approved by: Sammy@gmail.com
 */

public class DriverScript {

	static Properties prop;
	public static WebDriver driver;

	/*
	 * Constructor which loads the properties file 
	 */
	public DriverScript() {
		try {
			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Unable to load the Properties file. Please check" + e.getMessage());
			e.printStackTrace();
		}
	}

	/*
	 * This method loads the browser from properties file and also call the getURL method. 
	 */
	public static void initApplication() {
		String browser = prop.getProperty("browser");

		if (browser.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.trim().equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.trim().equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else {
			System.err.println(browser + " :The browser value is not supported. Please check the config file");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getURL();
	}

	/*
	 * This method loads the URL data from config.properties file 
	 */
	public static void getURL() 
	{
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	/*
	 * This method is to close or quit the driver. 
	 */
	public static void quitDriver()
	{
		driver.close();
	}

}
