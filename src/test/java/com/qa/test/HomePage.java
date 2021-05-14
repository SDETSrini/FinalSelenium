package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.core.Base;

public class HomePage extends Base {
	
	
	String ExpectedHomePageTitle= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	
	
//	Verify that when user lands on HomePage , Page Title is displayed and it should be 
//	"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	@Test
	public void verifyHomePageTitle()
	{
		 browserSetup();
		 passSiteURL();
		 String ActualHomePageTitle  =driver.getTitle();
		 Assert.assertEquals(ActualHomePageTitle, ExpectedHomePageTitle);
		 browserClose();
		 
	}
	
	@Test
	public void verifyHomePageLogo()
	{
		
		
	}
	
	

}
