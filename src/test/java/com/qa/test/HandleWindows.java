package com.qa.test;

import com.qa.core.Base;

import java.util.Set;

import org.testng.annotations.Test;

public class HandleWindows extends Base {

	@Test
	public void verifyHomePageTitle() throws InterruptedException {
		
		
		browserSetup();
		driver.manage().deleteAllCookies(); // Delete all the cookies
		driver.manage().window().maximize(); // Maximize the window
	
	System.out.println("Test Execution Started!!!");
	
	driver.get("https://www.naukri.com");
	
	String parent  = driver.getWindowHandle();
	System.out.println("Parent window id is "+parent);
	
Set<String> totalwindow = driver.getWindowHandles();
	
	int size =totalwindow.size();
	
	for(String child:totalwindow) {
		
		System.out.println("window id is "+child);
		
		if(!parent.equalsIgnoreCase(child)) {
			
		String secondwindow = child;
					
		driver.switchTo().window(secondwindow);
						
			driver.close();
		}

		Thread.sleep(3000);
	}}}
