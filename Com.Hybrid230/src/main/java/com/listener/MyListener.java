package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utilities.DriverUtils;

public class MyListener implements ITestListener {

	public void onTestStart(ITestResult result) {// beforeMethod
		
		
	}
	public void onTestSuccess(ITestResult result) {
		
		
	}
	public void onTestFailure(ITestResult result) {
		String path = DriverUtils.captureScreenshot(result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {// beforeSuite
		
		
	}

	public void onFinish(ITestContext context) {
		
		
	}

	
}
