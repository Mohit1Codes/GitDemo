import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns_AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class = 'fsw_inputBox searchCity inactiveWidget ']")).click();
		Thread.sleep(1000);
		WebElement Source = driver.findElement(By.xpath("//input[@placeholder = 'From']"));
		Source.sendKeys("Del");
	    Thread.sleep(2000);
		Source.sendKeys(Keys.ARROW_DOWN);
		Source.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//div[@class = 'fsw_inputBox searchToCity inactiveWidget ']")).click();
		Thread.sleep(2000);
		WebElement Destination = driver.findElement(By.xpath("//input[@placeholder = 'To']"));
		Destination.sendKeys("Mum");
		Thread.sleep(2000);
		Destination.sendKeys(Keys.ARROW_DOWN);
		Destination.sendKeys(Keys.ENTER);
		

	}

}
