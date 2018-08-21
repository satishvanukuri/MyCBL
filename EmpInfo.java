package com.hrm.pageObjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmpInfo {

	@FindBy(id="btnAdd")
	private WebElement addBtn;
	
	public void navigateAddEmpPage(){
		addBtn.click();
	}
}
