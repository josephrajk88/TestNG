package com.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetrySetup implements IRetryAnalyzer {

	private int retryCount = 0;

	private static int maxRetryCount = 3;

	public boolean retry (ITestResult result) {
		
		if (retryCount < maxRetryCount) {
			retryCount++;
			System.out.println("Retry--"+result.getName()+ "for " + retryCount + "times."); 
			return true;
			}
		return false;
	}
}
