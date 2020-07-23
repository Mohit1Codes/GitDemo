package WebSites;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {
	
	
	
	//public WebDriver driver = null;
	
	public static WebDriver driver; 
	
	@Test
	public void Google_Login()
	{
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		driver.get("https://google.com");	
		driver.manage().window().maximize();

	}
	
	@Test(dependsOnMethods= {"Google_Login"})
	public void Google_EnterString()	
	{
		//WebDriver driver = new ChromeDriver();
		WebElement SearchBox = driver.findElement(By.xpath("//input[@name = 'q']"));
		SearchBox.sendKeys("Justin");
		SearchBox.sendKeys(Keys.ARROW_DOWN);
		SearchBox.sendKeys(Keys.ENTER);
	}
	
	@Test
	public void Google_PageTitle()
	{
		
		System.out.println(driver.getTitle());
	}
	
	@Test(dependsOnMethods= {"Google_EnterString"})
	public void Google_GetLinks()
	{
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < Links.size(); i++)
		{
			
			System.out.println(Links.get(i).getText());
			
		}
		System.out.println(Links.size());
		
		driver.close();
	}

}
