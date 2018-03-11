package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Existing_Text_on_Webpage {

	public static void main(String[] args) {
		//Define the Webdriver 
		System.setProperty("webdriver.chrome.driver", "C:\\Java project\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.econtribs.ml.com/login/login");
		 List<WebElement> allLinkElements = driver.findElements(By.xpath("//a"));
	      // Count the total Link list on Web Page 
	       int linkListCount = allLinkElements.size();
	       //Identify all the elements on web page
	       List<WebElement> allElements = driver.findElements(By.xpath("//*"));
	       //Print the total count of all element on webpage
	       System.out.println("Total Number of All Element on webpage = "  + linkListCount);   
	      //Print all the Tag Name and Text Name on webpage
	       int i = 0;
	        for (WebElement Element : allElements) {
	            i = i +1;
	            System.out.println(Element.getTagName());
	            System.out.println(Element.getText());
	            //Close the Broswer
	            driver.close();
	           
	            // Quit the selenium
	            driver.quit();
	            
	        }
	          
	     }
	}

