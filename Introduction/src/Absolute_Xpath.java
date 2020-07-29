import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void automateYoutube() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ytd-searchbox[@id='search']/form/div/div/input")).sendKeys("Selenium Tutorials");
		driver.findElement(By.xpath("//ytd-searchbox[@id='search']/form/button")).click();
		//driver.close();

	}
	
	public static void automateGoogle() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[contains(@id,'g']/div/div/div[2]/a")).click(); //Relative Xpath for image link
		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Indian Memes 2019"); //css for searc box
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.quit();
		
		
		
	}

}
