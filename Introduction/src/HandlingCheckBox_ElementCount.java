import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox_ElementCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_friendsandfamily']")).click();
		Thread.sleep(1000);

	    System.out.println(driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	    
	    //finding the number of checkboxes on the page
	    
	    System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
	        
	}
	
}
