package com.hrm.emptest;

import java.awt.PageAttributes;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.genericlib.Browser;
import com.hrm.genericlib.Constants;
import com.hrm.genericlib.ExcelLib;
import com.hrm.genericlib.WebDriverCommonlib;
import com.hrm.pageObjectrepolib.AddEmp;
import com.hrm.pageObjectrepolib.Common;
import com.hrm.pageObjectrepolib.DashBoard;
import com.hrm.pageObjectrepolib.EmpInfo;
import com.hrm.pageObjectrepolib.Login;
import com.hrm.pageObjectrepolib.PersonalDetails;

public class EmpTest {
	//object decalration
	ExcelLib eLib;
	WebDriver driver;
	Login loginPage;
	Common comPAge;
	DashBoard dashboard;
	EmpInfo  empinfoPage;
	AddEmp addEmp;
	PersonalDetails personalDPage;
	
	@BeforeClass
	public void configBeforeclass(){
		//object intrailiaztion
		eLib = new ExcelLib();
		driver = Browser.getBrowser();
		loginPage = PageFactory.initElements(driver, Login.class);
		comPAge= PageFactory.initElements(driver, Common.class);
		dashboard = PageFactory.initElements(driver, DashBoard.class);
		empinfoPage=PageFactory.initElements(driver, EmpInfo.class);
		addEmp = PageFactory.initElements(driver, AddEmp.class);
		personalDPage = PageFactory.initElements(driver, PersonalDetails.class);
	}
	
	@BeforeMethod
	public void configBeforeMtd(){
		//step 1 : login to hrm
		loginPage.loginToHRM();
	}
	
	@Test
	public void createEmpTest() throws Throwable{
	String firstNAme = eLib.getExcelData("Sheet1", 1, 2);
	String lastNAme = eLib.getExcelData("Sheet1", 1, 3);
	//step2 : navigate to EMP PAge
	dashboard.navigateToPIMPage();
	//step 3 : navigate to Add Emp PAge
	empinfoPage.navigateAddEmpPage();
	//step  4: create Emp
	addEmp.createEmp(firstNAme, lastNAme);
	//step 5 : verify emp details
	String actfirstNAme = personalDPage.getFirstNAmeDetails().getAttribute("value");
	String actLastNAme = personalDPage.getLastNAmeDetails().getAttribute("value");
	Assert.assertEquals(firstNAme, actfirstNAme);
	Assert.assertEquals(lastNAme, actLastNAme);
	}
	
	@Test
	public void modifyEmpTest()throws Throwable{
		String firstNAme = eLib.getExcelData("Sheet1", 2, 2);
		String lastNAme = eLib.getExcelData("Sheet1", 2, 3);
		//step2 : navigate to EMP PAge
		dashboard.navigateToPIMPage();
		//step 3 : navigate to Add Emp PAge
		empinfoPage.navigateAddEmpPage();
		//step  4: create Emp
		addEmp.createEmp(firstNAme, lastNAme);
		//step 5 : modify Emp
		
		//step 6 : verify emp details
		String actfirstNAme = personalDPage.getFirstNAmeDetails().getAttribute("value");
		String actLastNAme = personalDPage.getLastNAmeDetails().getAttribute("value");
		Assert.assertEquals(firstNAme, actfirstNAme);
		Assert.assertEquals(lastNAme, actLastNAme);
	}
	
	
	
	@AfterMethod
	public void configAfterMtd(){
		comPAge.logout();
	}
	
	@AfterClass
	public void configAfterclass(){
		driver.close();
	}
	
}







