import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practise_Methods {
	
	
	public void AbsoluteXPaths(WebDriver driver,String Artist,String Song)
	{
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://youtube.com");
		driver.findElement(By.xpath("//ytd-searchbox[@id = 'search']/form/div/div/input")).sendKeys(Artist);
		driver.findElement(By.xpath("//ytd-searchbox[@id = 'search']/form/button")).click();
		List<WebElement> songs = driver.findElements(By.tagName("a"));
		int TotalSongs = songs.size();
		
		for (int i = 0;i < (TotalSongs - 1);i++)
		{
			String SongName = songs.get(i).getText();
			
			System.out.println(SongName);
			
			if (SongName.contains(Song))
			{
				songs.get(i).click();
				break;
			}
			
			
		}
		
	}
	
	public void CheckBox (WebDriver driver)
	{
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> CheckBox = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		int Count = CheckBox.size();
		for (int i = 0 ; i < Count ; i++ )
		{
			String Name = CheckBox.get(i).getText();
			System.out.println(Name);
			CheckBox.get(i).click();
		}
		
		
		
	}
	
	public void MultipleWindows (WebDriver driver)
	{
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();
		
		Set <String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String Pid = it.next();
		String Cid = it.next();
		
		driver.switchTo().window(Cid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(Pid);
		System.out.println(driver.getTitle());
				
		
	}
	
	public void MultipleWindows_Screenshot (WebDriver driver) throws IOException
	{
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> Wids = driver.getWindowHandles();
	    Iterator<String> it = Wids.iterator();
		String Pid = it.next();
		System.out.println(Pid);
		String Cid = it.next();
		System.out.println(Cid);
		driver.switchTo().window(Cid);
		System.out.println(driver.getTitle());
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C://Users//Mpandey9//Desktop//SeleniumScreenshots//screenshotCid.png"));
		driver.switchTo().window(Pid);
		System.out.println(driver.getTitle());
		File Prc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Prc, new File ("C://Users//Mpandey9//Desktop//SeleniumScreenshots//screenshotPid.png"));
	}
	
	
	public void Covid19_Update_Everyday(WebDriver driver)
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		WebElement CaseTable = driver.findElement(By.id("main_table_countries_today"));
		List<WebElement> CountryNames = CaseTable.findElements(By.cssSelector("a[class = 'mt_a']"));
		
		List<WebElement> CountryCaseCount = CaseTable.findElements(By.cssSelector("td[class = 'sorting_1']"));
		
		for (int i = 0 ; i < CountryNames.size(); i++)
		{
			String Country = CountryNames.get(i).getText();
			
			String Cases   = CountryCaseCount.get(i+3).getText();
			System.out.println("In " + Country + " no. of cases is " + Cases);
		}
		
		
		
	}

}
 