import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		int frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The total no. of frames in the browser is" + " " + frames);
		
		//switching to frame using webElemnet and then dragging and dropping
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		 Actions a = new Actions(driver);
		 WebElement Source = driver.findElement(By.id("draggable"));
		 WebElement Target = driver.findElement(By.id("droppable"));
		 
		 a.dragAndDrop(Source, Target).build().perform();
		 
		// driver.switchTo().defaultContent();
		 
		 //driver.findElement(By.linkText("Selectable")).click();
	}

}
