import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select s = new Select(driver.findElement(By.xpath("//select[contains(@id,'Adult')]")));
		
		s.selectByValue("2");
		//Thread.sleep(2000);
		s.selectByIndex(5);
		//driver.findElement(By.xpath("//select[contains(@id,'Adult')]")).click();
		//s.deselectByVisibleText("8"); visible tet not working.
		

	}

}
