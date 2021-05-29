package com.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testNGExample {
	
	@Test
	public void Search_ResultPage_TestCase001()
	{
		System.out.println("First Test Case is Executed in Second file" +Thread.currentThread().getId());
	}
	
	
	@Test
	public void Search_ResultPage_TestCase002()
	{
		System.out.println("Second Test Case is Executed in Second file" +Thread.currentThread().getId());
	}

}
