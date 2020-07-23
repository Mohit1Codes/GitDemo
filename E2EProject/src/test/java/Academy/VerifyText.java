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

public class VerifyText extends Base {
	
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
	public void verifyText() throws IOException
	{
  		log.info("Title Page Text check has started");
        LandingPage lP = new LandingPage(driver);
        System.out.println(lP.getFeaturedText().getText());
        Assert.assertEquals(lP.getFeaturedText().getText(),"AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");       

}
	
	@AfterTest
	public void browserTearDown()
	{
		
		driver.close();
		
	}
	
	
	
}
