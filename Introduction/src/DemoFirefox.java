
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// selenium code 
		
	// Create driver object for chrome driver
	// we will strictly implement methods of webdriver (webdriver is a interface)
	// invoke .exe file first (browser driver property), geckodriver, provided by firefox guys
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpandey9\\Downloads\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com");
      System.out.println(driver.getTitle());
      //driver.navigate().back();
	  driver.close();
	}

}
