package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoraOR {
	
	
	WebDriver driver;
	
    public QuoraOR (WebDriver driver) {
    	
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    
      
    @FindBy(linkText = "Answer")
    WebElement Answers;
    
    public WebElement Answer() {
    	
    	return Answers;
    }
    
    
    @FindBy(linkText = "Spaces")
    WebElement Space;
    
    public WebElement Space() {
    	
    	return Space;
    }  
    
    
    @FindBy(linkText = "Notifications")
    WebElement Notification;
    
    public WebElement Notification() {
    	
    	return Notification;
    }    
    
    
    @FindBy(linkText = "Continue with Google")
    WebElement ContinueBtn;
    
    public WebElement ContinueBtn() {
    	
    	return ContinueBtn;
    }   
    
}
