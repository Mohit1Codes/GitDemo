package SeleniumSessions.ExtentReportsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportPractise {
	
	ExtentReports report;
	
	@BeforeTest
	public void config()
	{
		
		String Path =  System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setReportName("New Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		report = new ExtentReports();
		
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Mohit Pandey");
		
	}
	

	@Test
	public void Demo()
	{
		
		ExtentTest test = report.createTest("Demo");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		System.out.println(driver.getTitle());
		
		
		test.info("I am the test Object used for logging the actual test case");
		
		test.fail("Test failed explicitly");
		
		
		
		report.flush();
		
	}

}
