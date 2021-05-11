package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.core.Base;

public class Search  extends Base{
	
	
	
	
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
		//Write code to check whether the SearchResult Page contains the keyword	
		System.out.println("Search Result page is :" + SearchResultPageTitle);
		
		browserClose();
	}
	


}
