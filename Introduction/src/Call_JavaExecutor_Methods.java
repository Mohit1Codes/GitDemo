import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Call_JavaExecutor_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver Cdriver = new ChromeDriver();
		
		String url = "https://fb.com";
		
		Without_SendKeys_EnterText.textInFb(Cdriver, url);
		

	}
	

}
