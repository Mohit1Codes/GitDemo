//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[id = 'start'] button")).click();
		
		WebDriverWait w = new WebDriverWait(driver,1);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id = 'finish']/h4")));
		
		if (driver.findElement(By.xpath("//div[@id = 'finish']/h4")).isDisplayed())
		{
			System.out.println("Text is displayed correctly explicit wait");
		}

	}

}
