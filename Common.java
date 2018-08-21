package com.hrm.pageObjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {

	@FindBy(id="welcome")
	private WebElement welcomeLnk;
	
	@FindBy(linkText="Logout")
	private WebElement logoutLnk;
	
	public void logout(){
		welcomeLnk.click();
		logoutLnk.click();
	}
}
