package com.qa.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.core.Base;

public class HomePage extends Base {

	// OR
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

	public void verifyHomePageMenu() throws InterruptedException {

		browserSetup();
		driver.get("https://www.timberland.co.uk");

		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("geo_popup_close")).click();

		// Handle Menu
		Actions action = new Actions(driver);	
		
		action.moveToElement(driver.findElement(By.xpath("//*[@data-navigation = 'men']"))).build().perform();

		Thread.sleep(3000);

		// Click on Menu - Men- Shirts
		driver.findElement(By.linkText("Shirts")).click();

		Thread.sleep(3000);
		
		browserClose();
	}

	
	public void verifyHomePageFindElements() throws InterruptedException {

		browserSetup();
		passSiteURL();

		System.out.println("Test Execution Started!!!");

		Thread.sleep(3000);

		List<WebElement> li = driver.findElements(By.tagName("a"));

		Thread.sleep(3000);

		int count = li.size();

		System.out.println("Count of values on the page is " + count);

		for (int i = 0; i < count; i++) {
			System.out.println(li.get(i).getText());

		}
		
		browserClose();

	}

	
	public void verifyHomePageWindow() throws InterruptedException {
		
		browserSetup();
		passSiteURL();

		System.out.println("Test Execution Started!!!");
				
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is " + parent);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");

		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.xpath("//*[@class = 'a-size-medium a-color-base a-text-normal']")).click();

		Thread.sleep(3000);

		Set<String> totalwindow = driver.getWindowHandles();

		int size = totalwindow.size();

		for (String child : totalwindow) {

			if (!parent.equalsIgnoreCase(child)) {

				String secondwindow = child;

				driver.switchTo().window(secondwindow);

				driver.findElement(By.id("add-to-cart-button")).click();

				driver.close();
			}
		}

		Thread.sleep(3000);
		
		browserClose();

	}
	
	

}
