package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.YoutubeLoginPage;

public class SearchYoutube {
	
	
	@Test
	public void YoutubeSearch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		
		YoutubeLoginPage yt = new YoutubeLoginPage(driver);
		
		yt.Searchbox().sendKeys("yay");
		yt.Searchbtn().click();
		
		
		
		
	}

}
