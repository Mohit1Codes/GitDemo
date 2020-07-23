package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class navBarCheck extends Base{
	
	
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void hitURL() throws IOException {
		// TODO Auto-generated method stub
        driver = initialiseDriver(); //we will have to store the driver object returned bt initialise driver class somewhere
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
	}	
	
	@Test
	public void navigationBarCheck() throws IOException
	{
		
		log.info("Navigation Bar Validation is started");		
		LandingPage lP = new LandingPage(driver);
		System.out.println(lP.getNavBar().isDisplayed());
		Assert.assertFalse(lP.getNavBar().isDisplayed());
		
		
	}
	
	@AfterTest
	public void browserTearDown()
	{
		
		driver.close();
		
	}

}
