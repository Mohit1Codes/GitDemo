package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	
	
	public WebDriver driver;
	
	public LogInPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Email = By.cssSelector("[id = 'user_email']");
	
	By Password = By.cssSelector("[id = 'user_password']");
	
	By LogIn = By.cssSelector("[value = 'Log In']");
	
	public WebElement getEmail()
	{
		
		return driver.findElement(Email);
	}
	
	public WebElement getPassword()
	{
		
		return driver.findElement(Password);
	}
	
	public WebElement getLogIn()
	{
		
		return driver.findElement(LogIn);
	}

}
