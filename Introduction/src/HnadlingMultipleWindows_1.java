import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadlingMultipleWindows_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Help")).click();  //Clicking on the link to open ChildWindow
		
		Set<String> ids = driver.getWindowHandles(); //Obtaining Ids of parent and child window as a set of strings
		
		Iterator<String> it = ids.iterator();  //Using to get the ids in the set seperately
		
		System.out.println(ids.size());
		
		String ParentId = it.next();
		
		String ChildId = it.next();
		
		driver.switchTo().window(ChildId);  //Switching to child window
		
		System.out.println(driver.getTitle());  //Getting child Windows title
		
		driver.switchTo().window(ParentId);  //Switching back to parent window
		
		System.out.println(driver.getTitle());	//getting parent windows title
		
		driver.switchTo().window(ChildId);

	}

}
