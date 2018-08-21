package Comgeneric.CBLWEb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Logout  {

	public static WebDriver driver;
	@Test
	public void logout()
	
	{
			WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
			   wait.until(ExpectedConditions.visibilityOf(
			driver.findElement(By.xpath("html/body/header/nav/div/ul/li/div/a/img")))).click();
			  
			   driver.findElement(By.linkText("Sign Out")).click();
	}
	
	

}
