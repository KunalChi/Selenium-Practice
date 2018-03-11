package com.BrowserInvocation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathelement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Java project\\SeleniumDrivers\\geckodriver.exe");
		/*
		driver.get("https://login.salesforce.com"); 
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("12345");
		compound classes cannot be used as element that can be acted upon 
		driver.findElement(By.className("button r4 wide primary")).click();
		*/
		
		WebDriver driver=new FirefoxDriver ();
		driver.get("https://login.salesforce.com/"); 
		
		/*ImplicitlyWait - tell web driver to wait for some time before throwing an exception
		 *  that it cannot fine the element on the page 
		 *  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 */
		
		//driver.findElement(By.className("inputtext")).sendKeys("helloworld");
		
		driver.findElement(By.id("username")).sendKeys("Test1234");
		
		/*FluentWait instance defines the maximum amount of time to wait for a condition, 
		 * as well as the frequency with which to check the condition
		 */
		
		driver.findElement(By.name("pw")).sendKeys("Pass1234");
		
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password123");
		
		driver.findElement(By.xpath(".//*[@id='Login']")).click();
		
		//driver.findElement(By.xpath("//*[@id='login_link']/div[2]/a[1]")).click();
		//driver.findElement(By.linkText("Didn't get a code?"));
        
		// Close the main window
        driver.close();
		
	}

}
