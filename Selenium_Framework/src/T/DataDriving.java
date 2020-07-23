package T;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DataDriving {
	
	public WebDriver driver = null;   //Decalaring Webdriver Object publicly so that when we use it inside any block like if or for its scope is not confined to
                                      // that block only
@Test
public void LogIn () throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Mpandey9\\eclipse-workspace\\Selenium_Framework\\src\\T\\Data.properties");
	prop.load(fis);
	if (prop.getProperty("BROWSER").equals("chrome"))
	{
		driver = new ChromeDriver();  //if we decalre webdriver here then it can not be used outside this if block so declaring it publicly
	}
	else if(prop.getProperty("BROWSER").equals("mozilla")) {
		driver = new FirefoxDriver();  //if we decalre webdriver here then it can not be used outside this if block so declaring it publicly
	}
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://fb.com");
	driver.manage().window().maximize();
	//driver.findElement(By.cssSelector("input[type = 'email']")).sendKeys(prop.getProperty("USERNAME"));
	//driver.findElement(By.xpath("//span[text() = 'Next']")).click();
	//driver.findElement(By.name("password")).sendKeys(prop.getProperty("PASSWORD"));
	//Thread.sleep(2000);
	//driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	//driver.findElement(By.xpath("//span[text() = 'Next']")).click();
}

@Test
public void launchGoogle()
{
	
	driver.get("https://google.com");
}

}
