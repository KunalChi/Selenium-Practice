package com.BrowserInvocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actionsDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com//");
		Actions a = new Actions(driver);
		WebElement move=(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]")));
		
				a.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("BOOKS").doubleClick().build().perform(); 
				//composite action to mouse to an element
					a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"))).build().perform(); 
		
						a.moveToElement(move).contextClick().build().perform(); 
		
	}

}
