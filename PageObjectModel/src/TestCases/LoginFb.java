package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.FbLoginPage;

public class LoginFb {
	
	
	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		
		//We have to create Object of the Class in object repository package from which we need to call the web objects.
		
		FbLoginPage fb = new FbLoginPage(driver); //we are passing the driver in this class to the FbLoginPage class as single argument
		                                          //for this to work we need to create a constructor of that class inside it that 
		                                          //accepts a single argument of type driver.
		
		fb.Email().sendKeys("hello");   //taking object from object repository and using here code comes clean and reusable
		                                //if email id object changes then we will have to change it in only one place.
		fb.Password().sendKeys("yayy");
		fb.LoginBtn().click();
		
		
	}

}
