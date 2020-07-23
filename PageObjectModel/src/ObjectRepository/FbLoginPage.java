package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {

		
		WebDriver driver;   //Just declaring a local driver object
		
		public FbLoginPage (WebDriver driver) {
			
			this.driver = driver;  //this statement assigns the driver in this class to the chrome driver in the test case.
		    PageFactory.initElements(driver, this);
		
		}  //creating a constructor inside the class that accepts driver as single argument
		
		
		
		
		
		//"By" keyword can be used seperately too to create webelements based on their locators
		By username =  By.xpath("//input[@type = 'email']"); //in this way we can define particular objects
		By password =  By.id("pass");
		By LoginButton = By.cssSelector("input[type = 'submit']");
		
		//creating method to return web objects from this class
		
		public WebElement Email() {   
			
			return driver.findElement(username);  //return type should match the object returned so WebElement is used
		}

		
		public WebElement Password() {   
			
			return driver.findElement(password);  //return type should match the object returned so WebElement is used
		}
		
		public WebElement LoginBtn() {
			
			return driver.findElement(LoginButton);
		}
	}


