import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().window().maximize();
		WebElement ChckBox = driver.findElement(By.xpath("//*[@type = 'checkbox']"));
        ChckBox.click();
        if (ChckBox.isEnabled())
        {
        	System.out.println("CheckBox is enabled after clicking");
        }
		driver.findElement(By.xpath("//button[text() = 'Remove']")).click();
		
		if (ChckBox.isDisplayed())
		{
			System.out.println("CheckBox is still displaying after clicking on Remove button");
		}
		
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@type = 'checkbox']")));
		
		if (ChckBox.isDisplayed())
		{
			System.out.println("CheckBox is still displaying after clicking on Remove button");
		}
		else
		{
			System.out.println("The checkBox has finally disappeared");
		}
		
		driver.findElement(By.xpath("//button[text() = 'Add']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type = 'checkbox']")));
		
		if (ChckBox.isDisplayed())
		{
			System.out.println("CheckBox is still displaying after clicking on Remove button");
		}

	}

}
