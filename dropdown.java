package com.BrowserInvocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver (); 
		driver.get("http://spicejet.com"); 
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']"))); 
		s.selectByValue("2");
		//s.selectByIndex(6);
		//s.selectByVisibleText("5 Adults");
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		//dynamic dropdown need to be written with custom xpath
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		
	}

}


