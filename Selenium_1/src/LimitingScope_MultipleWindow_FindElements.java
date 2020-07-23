import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;	

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;

public class LimitingScope_MultipleWindow_FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		int TotalLinks = driver.findElements(By.tagName("a")).size();
		
		System.out.println(TotalLinks);
		
		WebElement footer = driver.findElement(By.xpath("//div[@id = 'globalContainer']/div[2]"));
		
		int Footerlink = footer.findElements(By.tagName("a")).size();
		
		System.out.println(Footerlink);
		
		for (int i = 1 ; i < 5 ; i++)  
		{
			//footer.findElements(By.tagName("a")).get(i).click(); //only one link will get opened if we use this code
			                                                     //because when we click on first link the parent page is no
			                                                     //longer present
			//So need to use keyboard shortcut and click on links so that they open in
			//seperate windows
			
			//Mouseover on the link and then press Ctrl + Enter on the link to open in new tab
			
			//String OpenInNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			Actions a = new Actions (driver);
			a.moveToElement(footer.findElements(By.tagName("a")).get(i)).contextClick().sendKeys(Keys.ARROW_DOWN).click().build().perform();
			
		}
		
		//Set<String> Ids = driver.getWindowHandles();
		
		//Iterator<String> it = Ids.iterator();
		
		//it.next();
		
		//while (it.hasNext())
		//{
			
			//String ChildId = it.next();
			
			//driver.switchTo().window(ChildId);
			
			//System.out.println(driver.getTitle());
		//}
		
		
		
		
		
		
		
		

	}

}
