package com.qa.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.core.Base;

public class HomePage extends Base {
	
	//OR
	String ExpectedHomePageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	String newURL = "https://www.facebook.com";

//	Verify that when user lands on HomePage , Page Title is displayed and it should be 
//	"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"

	public void verifyHomePageTitle() {
		browserSetup();
		passSiteURL();
		String ActualHomePageTitle = driver.getTitle();
		AssertJUnit.assertEquals(ActualHomePageTitle, ExpectedHomePageTitle);
		browserClose();

	}

	public void verifyHomePageBrowseElement() throws InterruptedException {
		browserSetup();
		passSiteURL();

		driver.navigate().to(newURL);
		driver.navigate().back();
		Thread.sleep(5000);
//		driver.navigate().forward();
//		driver.navigate().refresh();

		browserClose();
	}

	public void verifyHomePageHandleWindowPopUP() throws InterruptedException {
		browserSetup();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@name='fileupload']"))
				.sendKeys("C:\\Users\\srini\\OneDrive\\Desktop\\HomeLoan\\Pictures");
		Thread.sleep(8000);
		browserClose();

	}

	
	public void verifyHomePageAlert() throws InterruptedException {
		browserSetup();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//*[@class= 'signinbtn']")).click();

		Alert alert = driver.switchTo().alert();

		// get the Text on Alert
		System.out.println(alert.getText());

		Thread.sleep(5000);

		alert.accept(); // Click on OK

		Thread.sleep(5000);

		System.out.println("Clicked on OK button");

//		alert.dismiss(); //Click on Cancel
//		alert.sendKeys("Java"); //method is used to send Value

		browserClose();
	}

	// Handle Menu
	@Test
	public void verifyHomePageMenu() throws InterruptedException {
		

		browserSetup();
		driver.get("https://www.timberland.co.uk");

//Close Cookie consent
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

//		driver.switchTo().defaultContent();

//Close Welcome to Timberland PopuP
//		driver.findElement(By.xpath("//a[@id = 'geo_popup_close']")).click();
		
		driver.findElement(By.xpath("//*[@class='icon-close']")).click();


		driver.switchTo().defaultContent();

		WebElement men = driver.findElement(By.xpath("//a[@data-navigation = 'men']"));

		Actions action = new Actions((WebDriver) men);

		action.moveToElement(driver.findElement(By.linkText("Shirts"))).build().perform();
	}
}
