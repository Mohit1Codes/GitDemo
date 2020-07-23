import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/div[1]/div[2]/span[1]")).getText());
		driver.findElement(By.name("email")).sendKeys("username");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click(); //using xpath for login button
		//driver.findElement(By.linkText("Forgot account?")).click();
	}
}
