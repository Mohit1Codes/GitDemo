package T;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class CheckBox_Practise {

public boolean status ;

@Test
public void CheckBoxPractise() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.get("https://fb.com");
	driver.manage().window().maximize();
	
	List<WebElement> ChckBoxes = driver.findElements(By.xpath("//input[@type = 'radio']"));
	int Count = ChckBoxes.size();
	
	for (int i = 0 ; i < Count; i++) {
		
		ChckBoxes.get(i).click();
		status = ChckBoxes.get(i).isSelected();
		System.out.println(status);
	}
	
	
	//return status;
	
	
	
}

}
