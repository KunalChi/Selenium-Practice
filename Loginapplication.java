package Testcases;

import java.util.concurrent.TimeUnit;

import objectrepository.EconLoginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
		//driver method will be passed into constructor as the argument driver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.econtribs.ml.com/login/login");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='3C58D6D47CF447BDBFF6AE7E6C1218B2']")));
		//to access any method in the object class we write obj.objclassname = new objclassname(args); 
		EconLoginpage rd=new EconLoginpage(driver);
		rd.UserIDtextbox().sendKeys("0990000030");
		
		
		rd.Passwordtestbox().sendKeys("Password1");
		
		rd.Continuebutton().click();
	
		driver.close();
	    driver.quit();
	}
}
	
