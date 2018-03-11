package com.BrowserInvocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEinvocation {

	public static void main(String[] args) {
		 // Set path of IEDriverServer.exe.
			System.setProperty("webdriver.ie.driver", "C:\\Java project\\SeleniumDrivers\\IEDriverServer.exe");	
	      // Initialize InternetExplorerDriver Instance.
			WebDriver driver=new InternetExplorerDriver(); 
			driver.get("http://www.facebook.com"); 
	}

}
