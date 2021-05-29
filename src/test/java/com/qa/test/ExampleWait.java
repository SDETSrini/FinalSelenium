package com.qa.test;

import org.apache.tools.ant.launch.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.core.Base;

public class ExampleWait extends Base {

	@Test
	public void ExplicitWaitExample() throws InterruptedException {
		
		browserSetup();
		
		driver.get("https://www.facebook.com");
		WebElement fname  = driver.findElement(By.name("email")) ;
		
		enterValue(driver, fname, 30, "snaika");
		
	}

	public static void enterValue(WebDriver driver, WebElement element, int timeout, String Value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Value);
			
	}
	
	
//	elementToBeClickable(locator)); - this is used for ElementNot Clickable Exception
	
}
