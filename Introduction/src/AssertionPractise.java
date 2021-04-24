import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssertionPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[value = 'AMD']")).click();
		Thread.sleep(2000);
		
		//div[contains(@id,'destinationStation1_CTNR')]  //a[@value = 'RDP']
		
		//driver.findElement(By.xpath("//div[contains(@id,'destinationStation1_CTNR')]  //a[@value = 'RDP']")).click();
		driver.findElement(By.xpath("(//a[@value = 'RDP'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("td.ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();
		
		boolean i = driver.findElement(By.id("Div1")).getAttribute("style").contains("1");
		
        if (i) {
        	
        	System.out.println("Return Date is active");
        	Assert.assertTrue(i);
        }
        else 
        	{
        	System.out.println("Return Date is inactive");
        	Assert.assertFalse(i);
        	}
        
        WebElement source = driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']"));
        
        source.click();
        boolean j = source.isSelected();
        
        if (j)
        {
        	System.out.println("The checkbox is selected succesfully");
        	Assert.assertTrue(j);
        }
        else
        {
        	
        	System.out.println("The checkbox cannot be selected");
        	Assert.assertFalse(j);		
		}
        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("6");
        Thread.sleep(1000);
        
        String passengers = driver.findElement(By.id("divpaxinfo")).getText();
        
        Assert.assertEquals(passengers, "6 Adult");
        
        
 
        Select t = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        
        t.selectByValue("AED");
        
        Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText(), "AED");
        
        
		
		//NewClass.NewMethod();
		

	}

}


//class NewClass {
	
	//public static void NewMethod() {
		
		//System.out.println("I am a new class");	
	//}
//}