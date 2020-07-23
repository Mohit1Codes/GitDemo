import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscellaneousPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder = 'Search for Products..']")).sendKeys("Dry Fruits");
		driver.findElement(By.cssSelector("input[placeholder = 'Search for Products..']")).sendKeys(Keys.ENTER);

	}

}
