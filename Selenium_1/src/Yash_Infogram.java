import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yash_Infogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://"+"Mohit.Pandey@yash.com"+":"+"yash@123"+"@"+"you.yash.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(@title,'Infogram')]")).click();
		

		
		
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String pId = it.next();
		String cId = it.next();
		driver.switchTo().window(cId);
		
		driver.findElement(By.cssSelector("input[type = 'text']")).sendKeys("Mohit.Pandey@yash.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("yash@123");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[value = 'Sign In']")).click();		

	}

}
