package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepository.QuoraOR;

public class QuoraHomePage {
	
	
	@Test
	public void QuoraHome() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://quora.com");
		
		QuoraOR qor = new QuoraOR(driver);
		qor.ContinueBtn().click();
		
		
		
		
	}

}
