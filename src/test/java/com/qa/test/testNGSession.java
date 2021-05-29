package com.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGSession {
	
//	@BeforeTest
//	public void BeforeTestCode()
//	{
//		System.out.println("Before Test Case is Executed - One time");
//	}
//	
//	@AfterTest
//	public void AfterTestCode()
//	{
//		System.out.println("After Test Case is Executed - One time");
//	}
//	
//	
//	@BeforeMethod
//	public void BeforeMethodCode()
//	{
//		System.out.println("Before Method is Executed - One time before Every testcase");
//	}
//	
//	@AfterMethod
//	public void AfterClassCode()
//	{
//		System.out.println("After Method is Executed - one time after every testcase");
//	}
	
	
	@Test(groups= {"Regression"})
	public void HomePage_Header_TestCase001()
	{
		System.out.println("First Test Case is Executed" +Thread.currentThread().getId());
	}
	
	
	@Test
	public void HomePage_Header_TestCase002()
	{
		System.out.println("Second Test Case is Executed"  +Thread.currentThread().getId());
	}
	
	
	@Test
	public void HomePage_Carousel_TestCase003()
	{
		System.out.println("Third Test Case is Executed" +Thread.currentThread().getId());
	}
	
	
	@Test
	public void HomePage_Search_TestCase004()
	{
		System.out.println("Fourth Test Case is Executed" +Thread.currentThread().getId());
	}

}
