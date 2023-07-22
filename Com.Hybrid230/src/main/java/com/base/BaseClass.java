package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.PropertyUtils;

public class BaseClass {

	public static WebDriver driver =null;
	
	public static void initialization() throws Exception {
		
		String browserName= PropertyUtils.readProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver= new ChromeDriver();
		}
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Downloads/Offline%20Website/index.html");
	}
	
}
