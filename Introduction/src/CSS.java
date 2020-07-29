import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mycss");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("mycsspassword");
		driver.findElement(By.cssSelector("#loginbutton")).click();
		driver.close();
		
		
		System.out.println();
		
		System.out.println();
		

	}

}
