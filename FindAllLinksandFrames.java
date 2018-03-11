package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindAllLinksandFrames {

	@Test
	public void LinksonPage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.econtribs.ml.com/login/login");
		driver.findElement(By.xpath("//a[@class='footer']")).click();
		
		//By finding all the web elements using iframe tag
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
				
		//Identify the number of Link on webpage and assign into Webelement List 
        List<WebElement> allLinkElements = driver.findElements(By.xpath("//a"));
                        
        // Count the total Link list on Web Page 
        int linkListCount = allLinkElements.size();
               
        //Print the total count of links on webpage
        System.out.println("Total Number of link count on webpage = "  + linkListCount);    
             
       //Identify all the elements on web page
       List<WebElement> allElements=driver.findElements(By.xpath("//*[@href or @src]"));
       
       driver.getCurrentUrl();
       //Count the total all element on web page
       linkListCount = allElements.size();
    
       //Print the total count of all element on webpage and link URLs from elements href, src, or div 
       System.out.println("Total Number of All Element on webpage = "  + linkListCount);   
       {
    	   try {
    	     List<WebElement> num = driver.findElements(By.tagName("a"));
    	     int numoflinks = num.size(); 
    	     System.out.println(numoflinks);
    	     for (WebElement pagelink : num)
    	          {
    	           String linktext = pagelink.getText();
    	           String link = pagelink.getAttribute("href");
    	           System.out.println(linktext+" ->");
    	           System.out.println(link);
    	         }
    	    	}
    	   		catch (Exception e){
    	              System.out.println("error "+e);
    	          }
    	   
    	           //Close the Broswer
       driver.close();
      
       // Quit the selenium
       driver.quit();
       
       }
	}
}
/*Anchor tags are often abused with the onclick event to create pseudo-buttons by setting href to "#" or "javascript:void(0)" to prevent the page from refreshing. 
 * These values cause unexpected behavior when copying/dragging links, opening links in a new tabs/windows, bookmarking, and when JavaScript is still downloading, 
 * errors out, or is disabled. This also conveys incorrect semantics to assistive technologies (e.g., screen readers). In these cases, it is recommended to use 
 * a <button> instead. In general you should only use an anchor for navigation using a proper URL.
 */

	