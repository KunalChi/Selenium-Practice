package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EconLoginpage {

	WebDriver driver;
	
	//create a constructor class with a driver argument declared in the test case method
	public EconLoginpage (WebDriver driver)
	{
		//driver argument will be assigned to a local driver using this. keyword
		this.driver=driver;
	}
	//create objects for the Econ Login Page 
	By username=By.xpath("//*[@id='ctl00_widgetContent_validateUserControl_ctl00_txtUserid']");
	By Password=By.xpath("//*[@id='ctl00_widgetContent_validateUserControl_ctl00_txtPassword']");
	By Remeberme=By.xpath("//*[@id='ctl00_widgetContent_validateUserControl_ctl00_chkRememberMe']");
	By Continue=By.xpath("//*[@id='ctl00_widgetContent_validateUserControl_ctl00_btnValidate']"); 
		
		public WebElement UserIDtextbox()
			{
			return driver.findElement(username);
			}
		public WebElement Passwordtestbox()
			{
			return driver.findElement(Password);
			}
		public WebElement Continuebutton()
			{
				return driver.findElement(Continue);
			}
		public WebElement Remebermebutton()
		{
			return driver.findElement(Remeberme);
		}
}
	

	
	
	
