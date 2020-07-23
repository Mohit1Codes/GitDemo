package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeLoginPage {
	
	
	WebDriver driver;
	
	public YoutubeLoginPage (WebDriver driver) { //defining a constructor for the class that accepts a single argument of webdriver type
		
		this.driver = driver;
	}
	
	By SearchBox = By.xpath("//input[@id = 'search']");
	By SearchButton = By.xpath("//button[contains(@id,'search')]");
	
	public WebElement Searchbox() {
		
		return driver.findElement(SearchBox);
	}
	
	public WebElement Searchbtn() {
		
		return driver.findElement(SearchButton);
	}
	

}
