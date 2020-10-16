package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By newsLetterDecline =  By.xpath("//button[text()= 'NO THANKS']");
	
	By signIn = By.linkText("Login");
	
	By featuredText =    By.xpath("//div[contains(@class,'video-banner')]/h3");
	
	By navBar = By.cssSelector("nav[class *= navbar]");
	
	
	public WebElement getLogIn() {
		
		return driver.findElement(signIn);
	}
	
	public WebElement getNoThanks() {
		
		return driver.findElement(newsLetterDecline);
	}
	
	public WebElement getFeaturedText() {
		
		return driver.findElement(featuredText);
	}
	
	public WebElement getNavBar()
	{
		return driver.findElement(navBar);
		
	}

}
