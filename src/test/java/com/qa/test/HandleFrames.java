package com.qa.test;

import org.openqa.selenium.By;

import com.qa.core.Base;

import org.testng.annotations.Test;

public class HandleFrames extends Base {

	@Test
	public void frames() {

		browserSetup();
		driver.get("http://demo.guru99.com/test/guru99home/");
		// navigates to the page consisting an iframe

		driver.manage().window().maximize();

//		driver.findElement(By.id("a077aa5e")).click();

		driver.switchTo().frame("a077aa5e"); // switching the frame by ID

		System.out.println("********We are switch to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();

		// Clicks the iframe
		System.out.println("*********We are done***************");

		driver.switchTo().frame("helpframe"); // Switching to frame

		// Perform operations

		driver.switchTo().defaultContent(); // Back to page
	}

}
