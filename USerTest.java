package com.hrm.admintest;

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

public class USerTest {
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
	public void createUSerTest() throws Throwable{
	   System.out.println("execute createUSerTest");
	}
	
	@Test
	public void modifyuserTest()throws Throwable{
		  System.out.println("execute modifyuserTest");
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







