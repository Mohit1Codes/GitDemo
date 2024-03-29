package gmail;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.GmailLandPage;
import resources.Base;

public class LandPageModule extends Base {
	
	
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(LandPageModule.class.getName());
	
	@BeforeTest	
	public void urlLaunch() throws IOException {
		
		driver = initialiseDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		if (driver.getTitle().equalsIgnoreCase("Gmail")) {
			log.info(prop.getProperty("URL")+" "+"has been launched");
		}
						
	}
	
	@Test
	public void countLink() {
		
		GmailLandPage gl = new GmailLandPage(driver);
		WebElement presentationDriver = gl.getpresentationBar();
		int links = presentationDriver.findElements(By.tagName("a")).size();
		System.out.println(links);
		log.info("The number of links present in presentaion bar is"+" "+links);	
		//Assert.assertFalse(2>1);

	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
	}
	

}
