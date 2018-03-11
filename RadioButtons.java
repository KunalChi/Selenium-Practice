package com.BrowserInvocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver (); 
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		//when you use size method Elements is plural
		//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		
		//use for loop to select all the options
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
		{		
		//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		
		//print out all the options by attribute name 
		//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value")); 
		
		String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"); 
		if(text=="Cheese")
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		}

	}

}
