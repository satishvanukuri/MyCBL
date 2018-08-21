package Comgeneric.CBLWEb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class Login extends WaitStatement{

	@FindBy(xpath="//*[@id='loginForm']/form/div/div[1]//input[@id='Email']")

	private WebElement usreNAmEdt;

		
		@FindBy(xpath="//*[@id='loginForm']/form/div/div[2]//input[@id='Password']")
		private WebElement pswEdt;
		
		@FindBy(xpath="//*[@id='loginForm']/form/div/div[4]/div/div//button[@class='k-button']")
		private WebElement loginBtn;
		
		@Test
		public void loginToCBL() throws InterruptedException{
			Thread.sleep(3000);
			
			Browser.driver.manage().window().maximize();
			Browser.driver.get(Constant.url);
			usreNAmEdt.sendKeys(Constant.userNAme);
			pswEdt.sendKeys(Constant.password);
			loginBtn.click();		
		}
		@Test
		public void loginToChurch() throws InterruptedException{
			Thread.sleep(3000);
			
			Browser.driver.manage().window().maximize();
			Browser.driver.get(Constant.url);
			usreNAmEdt.sendKeys(Constant.loginChurch);
			pswEdt.sendKeys(Constant.password);
			loginBtn.click();	
		}
		
		@Test
		public void loginToBuisness() throws InterruptedException{
			Thread.sleep(3000);
			
			Browser.driver.manage().window().maximize();
			Browser.driver.get(Constant.url);
			usreNAmEdt.sendKeys(Constant.loginBuisness);
			pswEdt.sendKeys(Constant.password);
			loginBtn.click();	
		}
		

}
