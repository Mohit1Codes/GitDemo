package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLandPage {
	
	
	public WebDriver driver;
	
	public GmailLandPage (WebDriver driver) {
		
		this.driver = driver;
	}
	
	private By presentationBar = By.xpath("//div[@role = 'presentation']");
	
	public WebElement getpresentationBar() {
		
		 return driver.findElement(presentationBar);
		
	}
	

}
