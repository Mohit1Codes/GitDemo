package T;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChildWindow_WindowHandler {
	
	
@Test
public void HandleChildWindows() {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://gmail.com");
	driver.findElement(By.xpath("//a[text()='Help']")).click();
	Set<String> Ids = driver.getWindowHandles();
	Iterator<String> it = Ids.iterator();
	String ParentId = it.next();
	System.out.println(ParentId);
	System.out.println(driver.getTitle());
	String ChildId  = it.next();
	driver.switchTo().window(ChildId);
	System.out.println(driver.getTitle());
	driver.switchTo().window(ParentId);
	System.out.println(driver.getTitle());
	
}

}
