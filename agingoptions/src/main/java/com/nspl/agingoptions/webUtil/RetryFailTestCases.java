package com.nspl.agingoptions.webUtil;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailTestCases implements IRetryAnalyzer{

	private static final int maxTry=3;
	private int count=0;
	
	public boolean retry(ITestResult result) {
          if(result.isSuccess()==false) {
        	  if(this.count<maxTry) {
        		  this.count++;
        		  return true;
        	  }
          }
		return false;
	}

	
}
