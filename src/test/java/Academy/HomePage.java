package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
//import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LogInPage;
import resources.Base;

public class HomePage extends Base {
	
	
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(Base.class.getName());	
	
	@BeforeTest
	public void hitURL() throws IOException {
		// TODO Auto-generated method stub
        driver = initialiseDriver(); //we will have to store the driver object returned bt initialise driver class somewhere        
        log.info("Driver is initialised");       
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();       
        log.info("Reached the URL");
	}
	
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String UserName, String Password) throws IOException {
		
          
          LandingPage l = new LandingPage(driver); //passing driver object in argument to give life to the driver object present in PageObject class
          l.getNoThanks().click();
          l.getLogIn().click();
          
          LogInPage lP = new LogInPage(driver);
          lP.getEmail().sendKeys(UserName);
          lP.getPassword().sendKeys(Password);
          lP.getLogIn().click();
		
	}
	
	@AfterTest
	public void browserTearDown()
	{
		
		driver.close();
		
	}
	
	
	@DataProvider
	
	public Object[][] getData()
	{
		
		Object[][] data = new Object[1][2];
		
		//Row contains the no. of data set for which the test has to be run 
		//Column contains no. of parameters in each data set
		
		data[0][0] = "Restricted@User.com";
	    data[0][1] = "Restricted";
	    
	    //The test in which we are going to use this data should be declared wit varaibles that can catch the data from getDataMethod
		
		return data;
	}
	
	

}
