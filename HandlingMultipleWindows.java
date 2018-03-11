package com.BrowserInvocation;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com/");
					driver.findElement(By.xpath("//*[@id='gb_70']")).click();
						driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
						
		Set<String>ids=driver.getWindowHandles(); 
			Iterator<String>it =ids.iterator(); 
				String parentid=it.next();
					String child=it.next();
						driver.switchTo().window(child);
							System.out.println(driver.getTitle()); //print out child window
	}

}
