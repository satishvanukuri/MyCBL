package com.hrm.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonlib {

	public void waitForPageToLoad(){
		Browser.driver.manage().timeouts().
		               implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void waitforElementPresent(WebElement wb){
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
	   wait.until(ExpectedConditions.visibilityOf(wb));
		
	}
	
	
	
	
	
	
	
	
	
}
