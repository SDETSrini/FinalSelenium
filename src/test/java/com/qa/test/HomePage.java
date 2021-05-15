package com.qa.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.core.Base;

public class HomePage extends Base {
	
	
	String ExpectedHomePageTitle= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	String newURL  = "https://www.facebook.com";
	
//	Verify that when user lands on HomePage , Page Title is displayed and it should be 
//	"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
	
	public void verifyHomePageTitle()
	{
		 browserSetup();
		 passSiteURL();
		 String ActualHomePageTitle  =driver.getTitle();
		 Assert.assertEquals(ActualHomePageTitle, ExpectedHomePageTitle);
		 browserClose();
		 
	}
	
		public void verifyHomePageBrowseElement() throws InterruptedException
	{
		browserSetup();
		passSiteURL();
		
		driver.navigate().to(newURL);
		driver.navigate().back();
		Thread.sleep(5000);
//		driver.navigate().forward();
//		driver.navigate().refresh();
		 
		browserClose();
	}
	
	@Test
	public void verifyHomePageHandleWindowPopUP() throws InterruptedException
	{
		 browserSetup();
		 driver.get("https://html.com/input-type-file/");
		 driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\srini\\OneDrive\\Desktop\\HomeLoan\\Pictures");
		 Thread.sleep(8000);
		 browserClose();
		 
	}
	
	

	public void verifyHomePageAlert()
	{
		browserSetup();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//*[@class= 'signinbtn']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		//get the Text on Alert
		System.out.println(alert.getText());
		alert.accept(); //Click on OK
			
//		alert.dismiss(); //Click on Cancel
//		alert.sendKeys("Java"); //method is used to send Value

		browserClose();
	}
	

}
