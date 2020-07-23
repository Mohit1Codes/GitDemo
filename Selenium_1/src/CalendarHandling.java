import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[@for = 'departure']")).click();
		
		Thread.sleep(2000);
		
		String MonthFind = driver.findElement(By.cssSelector("div.DayPicker-wrapper")).getText(); //getting the wrapper text that conyains the months' name
			
		
		System.out.println(MonthFind);
		
		while (!MonthFind.contains("October"))
		{
		   driver.findElement(By.xpath("//span[@aria-label = 'Next Month']")).click(); //clicking on next month arrow
		   Thread.sleep(1000);
		   String MonthFindV = driver.findElement(By.cssSelector("div.DayPicker-wrapper")).getText();
		   //getting the wrapper text again because everytime the arrow is pressed the wrapper text changes
		   MonthFind = MonthFindV ; //reassigning because while loop is checking for "MonthFind" variable only.
		   
		}
		
        List <WebElement> dates = driver.findElements(By.className("DayPicker-Day"));
        
        int lk = dates.size();
        System.out.println("size is" + lk);
        
        for (int i = 0; i< lk ; i++)
        {
		   String Fullday = dates.get(i).getAttribute("aria-label");
		   
		   System.out.println(Fullday);
		   
		 if (Fullday != null)
		 {
		   
		  if (Fullday.contains("Oct") && Fullday.contains("21"))
		  {
			  System.out.println(Fullday);
			  dates.get(i).click();
			  driver.findElement(By.xpath("//a[contains(@class,'primaryBtn')]")).click();
			  break;
		  }
		 }
		}

	}
}
