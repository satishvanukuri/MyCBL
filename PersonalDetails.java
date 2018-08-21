package com.hrm.pageObjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetails {
	
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstNAmeDetails;
	
	@FindBy(id="personal_txtEmpLastName")
	private WebElement lastNAmeDetails;

	public WebElement getFirstNAmeDetails() {
		return firstNAmeDetails;
	}

	public WebElement getLastNAmeDetails() {
		return lastNAmeDetails;
	}
	
	
	

}
