package com.BrowserInvocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvocation {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Java project\\SeleniumDrivers\\geckodriver.exe");	
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.facebook.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getPageSource());
			System.out.println(driver.getCurrentUrl());
			driver.quit();
		}
	}

}
