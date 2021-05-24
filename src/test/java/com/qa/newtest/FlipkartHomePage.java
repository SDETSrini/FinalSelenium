package com.qa.newtest;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.core.Base;

public class FlipkartHomePage extends Base {
	
	@Test(groups= {"Regression"})
	public void FlipKart_HomePage_TestCase001()
	{
//		System.out.println(" FlipKart_HomePage First Test Case is Executed ");
		
		Assert.assertEquals(12, 14);
	}
	
	
	
	

}
