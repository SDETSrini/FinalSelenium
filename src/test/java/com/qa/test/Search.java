package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.core.Base;

public class Search  extends Base{
	
	String ActualSearchResultPage = "Amazon.in : Java";
	String Username = "Srinivas.Naika@gmail.com";

	
	
	public void verifySearchResult()
	{
		browserSetup();
		passSiteURL();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String SearchResultPageTitle  = driver.getTitle();
		//Write code to check whether the SearchResult Page contains the keyword	 
		browserClose();
	}
	
	@Test
	public void verifySearchResultusingDropdown()
	{
		
		browserSetup();
		passSiteURL();
		
		//Code to Select the Value from the dropdown as Books
//		Select value = new Select(driver.findElement(By.id("searchDropdownBox")));
//		value.selectByValue("Books");
////		value.selectByIndex(11);
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String SearchResultPageTitle  = driver.getTitle();
		
		
		System.out.println("Search Result page is :" + SearchResultPageTitle);

		//Write code to check whether the SearchResult Page contains the keyword
		Assert.assertEquals(SearchResultPageTitle, ActualSearchResultPage);

		browserClose();
	}
	
	
	public void verifySearchResultwithAuth()
	{
		
		browserSetup();
		passSiteURL();
		
		
		
		//Click on Sign In Button using xpath and ID
		//span[@id='nav-link-accountList-nav-line-1']
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		
		//Another method to find the Same Sign In button
		
		//Click  - Find Anywhere Concept
		//*[@id='nav-link-accountList-nav-line-1']
		
        //Find Sign using text() method
		//*[text()='Hello, Sign in']
		
		
		
		
		//Enter username 
		//input[@id='ap_email']
		//*[@name='email']
		//*[@type='email']
		//*[@type='email' and @id='ap_email']
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(Username);
		
		
//		Clcik Continue Button
		//input[@id='continue']
		//input[@class='a-button-input']
		//*[@type='submit']
		//*[@aria-labelledby='continue-announce']
		
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		
//		Enter password:
			//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']
		
		
		
		
//		After User logins  - 
		
		String UsernameLoggedIn  = driver.findElement(By.xpath("//span[@id ='nav-link-accountList-nav-line-1']")).getText();
		
		//Code to verify that UsernameLoggedIn contains Username : Hello, Srinivas
//		Step 1 : remove Hello,
//		Step 2: Remove the space 
//		Step 3: Verify whether UsernameLoggedIn contains : step2 
		
//		if(step3)
//		
//			{
//				Assert.assertEquals(true);
//			}
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String SearchResultPageTitle  = driver.getTitle();
		
		
		System.out.println("Search Result page is :" + SearchResultPageTitle);

		//Write code to check whether the SearchResult Page contains the keyword
		Assert.assertEquals(SearchResultPageTitle, ActualSearchResultPage);

		browserClose();
		
	
	}


}
