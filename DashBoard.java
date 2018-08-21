package com.hrm.pageObjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {

	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimlnk;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminlnk;
	
	public void navigateToPIMPage(){
		pimlnk.click();
	}
	public void navigateToAdminPage(){
		adminlnk.click();
	}
}
