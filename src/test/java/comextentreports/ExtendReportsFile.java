package comextentreports;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportsFile {
	@Test
	public void extentTest() 
	{
		ExtentReports extent = new ExtentReports();  // object of the class
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");  //html file will be generated
	    spark.config().setTheme(Theme.DARK);
	    spark.config().setDocumentTitle("AutomationReport");
	    spark.config().setReportName("Automation Extent Report");
		extent.attachReporter(spark);
		
		//Test Case 1
		 ExtentTest test = extent.createTest("Login Test"); // Create test node created in report
		 test.pass("Login Test started successfully"); // Create test Step node created in report
	     test.info("Url loaded");
	     test.info("Value Ented");
	     test.pass("login Test Completed successfully");
	     
	     
	     //Test Case 2
	     ExtentTest test1 = extent.createTest("HomePage Test"); // Create test node created in report
	     test.pass("HomePage Test started successfully");      // Create test Step node created in report
	     test.info("Url loaded");
	     test.info("Value Ented");
	     test.fail("HomePage Test Failed miserably");
	     
	     
	     extent.flush();  // unless we call this method ,Report will not be written  with logs
	
	
	}
   
}