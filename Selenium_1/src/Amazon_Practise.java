import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class = 'nav-search-field ']/input")).sendKeys("MOTOROLA");
		driver.findElement(By.xpath("//div[contains(@class,'nav-sprite')]/input")).click();
		System.out.println(driver.findElement(By.xpath("//a[@id = 'nav-cart'] //span[@id = 'nav-cart-count']")).getText());

	}

}
