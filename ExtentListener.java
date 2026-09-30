package testcase;



	import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import automation.pages.utils.ExtentManager;

// create the test case and test report 
	public class ExtentListener implements ITestListener {

	    ExtentReports extent = ExtentManager.getReport();

	    ExtentTest test;

	    // method is used for automating the report 
	    @Override
	    public void onTestStart(ITestResult result) {

	        test = extent.createTest(result.getMethod().getMethodName());

	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {

	        test.pass("Test Passed");

	    }

	    @Override
	    public void onTestFailure(ITestResult result) {

	        test.fail(result.getThrowable());

	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {

	        test.skip("Test Skipped");

	    }

	    @Override
	    public void onFinish(ITestContext context) {

	        extent.flush();

	    }

		}

	

