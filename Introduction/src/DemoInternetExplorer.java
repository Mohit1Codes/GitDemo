import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoInternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// selenium code 
		
	// Create driver object for chrome driver
	// we will strictly implement methods of webdriver (webdriver is a interface)
	// invoke .exe file first (browser driver property)
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
      WebDriver driver = new InternetExplorerDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com");
      System.out.println(driver.getTitle());
      //driver.navigate().back();
	  driver.close();
	}

}