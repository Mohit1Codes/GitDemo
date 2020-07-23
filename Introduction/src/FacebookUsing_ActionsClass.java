import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookUsing_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		//Mouseovering on Email edit edit box then clicking and then entering phone no. in it
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id = 'email']"))).click().sendKeys("8766511338").build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id = 'pass']"))).click().sendKeys("mohit786@").build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("input[value = 'Log In']"))).click().build().perform();
		Thread.sleep(3000);
		
		if (driver.findElement(By.linkText("Home")).isDisplayed())
		{
			System.out.println("Facebook Login Successful");
		}

	}

}
