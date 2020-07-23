import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://google.com");
		//WebElement s = driver.findElement(By.xpath("//input[contains(@name,'q')]"));
		//s.sendKeys("yo");
		//s.sendKeys(Keys.ARROW_DOWN);
		//s.sendKeys(Keys.ENTER);
		//driver.findElement(By.cssSelector("input[value*='Google']"));
		
		Practise_Methods pm = new Practise_Methods();
		//pm.AbsoluteXPaths(driver,"Alan Walker","Faded");
		//pm.CheckBox(driver);
		pm.Covid19_Update_Everyday(driver);

	}

}
