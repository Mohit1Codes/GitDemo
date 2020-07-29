package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentReporterNG;

public class Listeners extends Base implements ITestListener {

	ExtentReports report = ExtentReporterNG.getReportObject();   
	
	ExtentTest test;
	
	ThreadLocal <ExtentTest> extentTest = new ThreadLocal <ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		test = report.createTest(result.getMethod().getMethodName());
		
		extentTest.set(test);  //send all test object to thread safe pool
				
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		// test.log(Status.PASS, "Test Passed");  ------> not thread safe , not suitable for parallel execution
		
		extentTest.get().log(Status.PASS, "Test Passed");  // ----> suitable for parallel execution
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		
	//	  test.fail(result.getThrowable());   ----->not thread safe , not suitable for parallel execution
		
		
		extentTest.get().fail(result.getThrowable());   // -----> thread safe
		
		
		WebDriver driver = null;
		String testMethodName = result.getMethod().getMethodName();		
	
			try {
				try {
					driver =  (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
					
					extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver), result.getMethod().getMethodName());
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	
		
		
		
		
		

		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		report.flush();
	}

}
