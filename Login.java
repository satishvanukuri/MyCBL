package com.hrm.pageObjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.genericlib.Browser;
import com.hrm.genericlib.Constants;
import com.hrm.genericlib.WebDriverCommonlib;

public class Login extends WebDriverCommonlib{

	@FindBy(id="txtUsername")
	private WebElement usreNAmEdt;
	
	@FindBy(id="txtPassword")
	private WebElement pswEdt;
	
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	
	public void loginToHRM(){
		waitForPageToLoad();
		Browser.driver.get(Constants.url);
		Browser.driver.manage().window().maximize();
		usreNAmEdt.sendKeys(Constants.userNAme);
		pswEdt.sendKeys(Constants.password);
		loginBtn.click();		
	}
	public void loginToHRM(String userNAme, String password){
		waitForPageToLoad();
		Browser.driver.get(Constants.url);
		Browser.driver.manage().window().maximize();
		usreNAmEdt.sendKeys(userNAme);
		pswEdt.sendKeys(password);
		loginBtn.click();		
	}
	
}
