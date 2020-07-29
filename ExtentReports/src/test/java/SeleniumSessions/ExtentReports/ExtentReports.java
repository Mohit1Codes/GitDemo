package SeleniumSessions.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReports {
	
	
	
	@BeforeTest
	public void Config()
	{
		
		
		//ExtentSparkReporter , // ExtentReports
		
		String path = System.getProperty("user.dir"+"\\reports\\index.html");
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		
		
	}
	
	
	
	@Test
	public void DemoExtentReport()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
	}

}
