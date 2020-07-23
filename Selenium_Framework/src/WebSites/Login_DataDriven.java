package WebSites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_DataDriven {
	
	
	public WebDriver driver = null;
	
	@Test
	public void LogIn() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Mpandey9\\eclipse-workspace\\Selenium_Framework\\src\\WebSites\\Website.properties");
		prop.load(fis);
		
		if (prop.getProperty("BROWSER").equals("chrome"))
		{
			
			driver = new ChromeDriver();
			
		}
		else if(prop.getProperty("BROWSER").equals("mozilla")) 
		{
			driver = new FirefoxDriver();  //if we decalre webdriver here then it can not be used outside this if block so declaring it publicly
		}
		
		
		if (prop.getProperty("Application").equals("Gmail"))
		{
			
			driver.get("https://gmail.com");
			
		}
		else if(prop.getProperty("Application").equals("swiggy")) 
		{
			driver.get("https://swiggy.com");  
		}
		
		
		
	}

}
