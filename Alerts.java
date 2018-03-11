package com.BrowserInvocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
			//driver.findElement(By.xpath(""));
		
			driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		//Accept method is used to click on the Ok button on the pop-up
		
			System.out.println(driver.switchTo().alert().getText());
			
			driver.switchTo().alert().accept();
		
		//Dismiss method is used click on cancel button on the pop-up 
		
			//driver.switchTo().alert().dismiss();
	}

}
