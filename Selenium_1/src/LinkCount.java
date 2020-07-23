import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkCount {

	public static void linksMain(WebDriver driver,String URL) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		int LinkCount = driver.findElements(By.tagName("a")).size();
		
		System.out.println("No. Of links in facebook page is" + " " + LinkCount);
		
		//Thread.sleep(2000);
		
		driver.close();
		
		}
				
	}


