import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		
		if (driver.findElement(By.id("checkBoxOption1")).isSelected()) {
			
			System.out.println("The checkbox has been selected");
		}
		
		//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		int totalCheckBoxes = driver.findElements(By.cssSelector("input[type = 'checkbox']")).size();
		System.out.println(totalCheckBoxes);

	}

}
