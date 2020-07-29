package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	
	
	static ExtentReports reports;

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
	

}
