package com.BrowserInvocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInvocation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver (); 
		driver.get("http://facebook.com"); 
		driver.findElement(By.id("email")).sendKeys("4692791237");
		driver.findElement(By.name("pass")).sendKeys("Duco1989!"); 
		driver.findElement(By.id("loginbutton")).click(); 
		driver.findElement(By.id("id='userNavigationLabel")).click();
		
	}

}

/*
System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver (); 
driver.get("http://facebook.com"); 
driver.findElement(By.linkText("Forgot account?")).click();

*/




/*public class chromebrowser  *{
 
	public static void main(String[] args) 
	{ 
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
		System.out.println("Google search text box Is enabled.");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("WebDriver Test successful.");
		driver.findElement(By.xpath("//button[@name='btnG']")).click();
		System.out.println("Google search completed.");
			} 
			else 
				{
				System.out.println("Google search test box Is Not enabled.");
					} 
				driver.close();
				
				
 						}
			}
*/