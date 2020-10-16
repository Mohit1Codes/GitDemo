package resources;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	
	//defining properties object as public so that when Base class is extended by any other class properties object has scope
	//outside the initialiseDriver method also and we can fetch URL wherever necessary in any test case from same 
	//properties file.
	
	public Properties prop;
	
public WebDriver initialiseDriver() throws IOException {
	
	
	prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Data.Properties");
	prop.load(fis);
	
	if (prop.getProperty("browser").equals("chrome"))
{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Desktop\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); //Don't write Webdriver driver cause it will create a local driver which won't be defined outside this if block.

}
	
	if (prop.getProperty("browser").equals("firefox"))
{
	//launch firefox driver
}
	
	
	if (prop.getProperty("browser").equals("ie"))
{
	//launch internet explorer
}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	
}

public String getScreenShotPath(String testMethod, WebDriver driver) {
	
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testMethod+".png";
	 try {
		FileUtils.copyFile(source,new File(destinationFile));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return destinationFile;
	
}

/*static ExtentReports reports;

public static ExtentReports getReportObject () {      //return type changed to ExtentReports   //Declaring the method as static so that we can directly call the method wothout creating the object for its class.
	
	
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation");
	reporter.config().setDocumentTitle("Test Results");
	reports = new ExtentReports();
	reports.attachReporter(reporter);
	reports.setSystemInfo("Tester", "Mohit Pandey");
	
	return reports;
	
}
*/


}
