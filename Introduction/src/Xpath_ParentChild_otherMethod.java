import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ParentChild_otherMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,'originStation1_CTNR')] //a[@value = 'BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,'destinationStation1_CTNR')] //a[@value = 'MAA']")).click();
		Thread.sleep(1000);
		////div[contains(@id,'originStation1_CTNR')] //a[@value = 'BLR']
		
		////div[contains(@id,'destinationStation1_CTNR')] //a[@value = 'MAA']
		
		driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
		
			System.out.println("Required object is enabled");
			
		}
		
		else
			
		{
			System.out.println("Required object is disabled");
			
		}
	}

}
