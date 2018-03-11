package com.BrowserInvocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver (); 
		driver.get("http://spicejet.com"); 
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		//returns whether checkbox is checked or not
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		//select checkbox by xpath
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
	}

}
