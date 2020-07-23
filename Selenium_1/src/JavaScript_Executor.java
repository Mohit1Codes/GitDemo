import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class JavaScript_Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in");
		
		driver.manage().window().maximize();
		
		//Actions a = new Actions(driver);
		
		WebElement Source = driver.findElement(By.id("fromPlaceName"));
		
		Source.sendKeys("BEN");		
		//a.moveToElement(Source).click().sendKeys("Ben").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		//a.contextClick(driver.findElement(By.id("fromPlaceName"))).build().perform();
		
		Source.sendKeys(Keys.ARROW_DOWN);
		
		System.out.println(Source.getText());  //.getText is not able to fetch the text inside the webedit cum auto suggestive dropdown
		                                       // so we will use JAVAScript Executor for that purpose
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";  //forward slash to negate the effect of double slash inside doube slash that JAVA does not accept
		
		String text = (String) js.executeScript(script);
		
		System.out.println(text);
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			Source.sendKeys(Keys.ARROW_DOWN);
			
			script = "return document.getElementById(\"fromPlaceName\").value;";
			
			text = (String) js.executeScript(script);
			
			System.out.println(text);
			
			if (text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
			{
				Source.sendKeys(Keys.ENTER);
			}
			
		}
		
		
		
		

	}

}
