package WebSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Youtube {
	
	
	//public WebDriver driver = null;
	
	public static WebDriver driver;
	
	@Parameters({"URL"})
	@BeforeMethod
	public void Youtube_URLLaunch(String urlsite)
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(urlsite);
		driver.manage().window().maximize();
		
		
	}
	
	@Parameters({"Search"})
	@Test
	public void Youtube_SearchOperation(String SearchText)
	{
		
		String PageTitle = driver.getTitle();
		if (PageTitle.contains("Tube"))
		{
			System.out.println("Successfully navigated to youtube home page");			
			driver.findElement(By.xpath("//ytd-searchbox[@id = 'search']/form/div/div/input")).sendKeys(SearchText);
            driver.findElement(By.xpath("//button[contains(@id,'legacy')]")).click();
		}
		
		driver.close();
		
		
	}

}
