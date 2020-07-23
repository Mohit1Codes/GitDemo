package WebSites;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Fb {
	
	//public WebDriver driver = null;
	
	public static WebDriver driver; 
	
	@Parameters({"FbURL"})
	@BeforeClass
	public void Fb_Login(String urlSite)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(urlSite);
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "getData")
	public void Fb_Credentials(String uName , String Pword) throws InterruptedException
	{
		String Title = driver.getTitle();
		if (Title.contains("Facebook"))
		{
			System.out.println("Navigation to facebook was successful");
			driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys(uName);
			driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(Pword);
			Thread.sleep(3000);
			//driver.close();
		}
		
		//driver.close();
				
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//No. of rows will be how many time we have to run the test or the no. of total data sets
		//No. of columns will be no. of data in one dataset
		
		//Defining a new MultiDimensional Object Array
		
		Object[][] data = new Object[3][2];
		
		//Data will be initialised from Zeroeth Row
		
		//First Data Set
		data[0][0] = "a";
		data[0][1] = "b";
		
		//Second Data Set
		data[1][0] = "c";
		data[1][1] = "d";
		
		//Third Data Set
		data[2][0] = "e";
		data[2][1] = "f";
		
		//returning data
		return data;
		
		
	}

}
