package com.qa.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	 public void onTestStart(ITestResult result) {
		    
		  }

	 public void onTestSuccess(ITestResult result) {
//		 System.out.println("Test Case Passed!!!"+result.getName() +result.getTestClass() );
		   
		  }
	 
	  public void onTestFailure(ITestResult result) {
		  
		  System.out.println("Code to Capture the Screenshot"+result.getThrowable());

		  }
}
