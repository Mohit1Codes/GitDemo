import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class e_Finance {
	
	WebDriver driver = null;
	
	@Parameters ({"URL","UserName","Password"})
	@Test
	public void Login(String urlsite,String u, String p) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.get(urlsite);
		driver.manage().window().maximize();
		//WebDriverWait w = new WebDriverWait(driver,20);
		driver.findElement(By.id("txtUserName")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnOK"));
		
		
	}

}
