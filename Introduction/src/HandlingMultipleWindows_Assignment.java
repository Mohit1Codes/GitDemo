import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> Ids = driver.getWindowHandles();
		Iterator<String> it = Ids.iterator();
		
		String ParentId = it.next();
		String ChildId  = it.next();
		
		driver.switchTo().window(ChildId);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(ParentId);
		
		System.out.println(driver.findElement(By.xpath("//div[@class = 'example']/h3")).getText());

	}
}
