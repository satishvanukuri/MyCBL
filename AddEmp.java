package com.hrm.pageObjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmp {

	@FindBy(id="firstName")
	private WebElement firstNAmeEdt;
	
	@FindBy(id="lastName")
	private WebElement lastNAmeEdt;
	
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	
	public void createEmp(String firstNAme, String lastNAMe){
		firstNAmeEdt.sendKeys(firstNAme);
		lastNAmeEdt.sendKeys(lastNAMe);
		saveBtn.click();
	}
	
}




