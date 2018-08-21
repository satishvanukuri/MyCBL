package CBLwebAutomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Comgeneric.CBLWEb.*;

public class CBLTest {

	
	WebDriver driver ;
    Login Loginpage;
	 WaitStatement ws;
    Logout LogouttoTPL;
		
		
		
		@BeforeClass
		
		
		public void configBeforeclass(){
			
			
			driver = Browser.getBrowser();

			ws = PageFactory.initElements(driver,WaitStatement.class);
           Loginpage = PageFactory.initElements(driver,Login.class);
           LogouttoTPL = PageFactory.initElements(driver,Logout.class);
		}
		
		@BeforeMethod
		
		public void LoginCBL() throws InterruptedException 		{
			
	Loginpage.loginToCBL();
		}
		
@Test(priority=1)
 

public void BuisnessSearch(){
	
	driver.findElement(By.id("Business")).click();
	ws.waitForPageToLoad();
	driver.findElement(By.id("Search")).sendKeys("d");

}
     @Test(priority=2)


public void AddnewBusiness() throws InterruptedException{
	
	driver.findElement(By.id("Business")).click();
	ws.waitForPageToLoad();
    driver.findElement(By.id("btnNewBusiness")).click();
    
    Thread.sleep(3000);
    
    WebDriverWait wb = new WebDriverWait(driver,20);
    wb.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Name"))));
    
	driver.findElement(By.id("Name")).sendKeys("Jane");
	Thread.sleep(3000);
	driver.findElement(By.id("Church")).sendKeys("C");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='Church_listbox']/li[1]")).click();
	
	driver.findElement(By.id("Phone")).sendKeys("8054143933");
	driver.findElement(By.id("MobilePhone")).sendKeys("8054143933");
	driver.findElement(By.id("AltPhone")).sendKeys("8054143933");
	driver.findElement(By.id("Fax")).sendKeys("805414");
	driver.findElement(By.id("Email")).sendKeys("erjane@gmail.com");
	driver.findElement(By.id("Website")).sendKeys("www.jane.com");
	driver.findElement(By.id("Facebook")).sendKeys("facebbok.com");
	driver.findElement(By.id("Twitter")).sendKeys("twitter.com");
	driver.findElement(By.id("Langspoken")).sendKeys("all");
	driver.findElement(By.id("Yearsinbusiness")).sendKeys("3");
	driver.findElement(By.linkText("Services")).click();
	WebDriverWait wait5 = new WebDriverWait(Browser.driver, 20);
	   wait5.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.id("Services")))).click();
	
	driver.findElement(By.id("Services")).sendKeys("Services");
	

	WebDriverWait wait6 = new WebDriverWait(Browser.driver, 20);
	   wait6.until(ExpectedConditions.visibilityOf(
    driver.findElement(By.linkText("Business Categories & Serving Areas")))).click();
	
    
	driver.findElement(By.xpath("//*[@id='ServiceDetails']/div/div[1]/div/div/div/div/input")).sendKeys("a",Keys.ARROW_DOWN,Keys.ENTER);
	
	driver.findElement(By.xpath("//*[@id='ServiceDetails']/div/div[2]/div/div/div/div/input")).sendKeys("T",Keys.ARROW_DOWN,Keys.ENTER);
	
	
	driver.findElement(By.linkText("Slogan")).click();
	WebDriverWait wait4 = new WebDriverWait(Browser.driver, 20);
	   wait4.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.id("Slogan")))).click();
	
	driver.findElement(By.id("Slogan")).sendKeys("Slogan");
	
	
    
	driver.findElement(By.linkText("Payment Methods & Promos")).click();
	WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
	   wait.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("//*[@id='PromosInfo']/div/div[1]/div/div/div/div")))).click();
	
	driver.findElement(By.xpath("//*[@id='PromosInfo']/div/div[1]/div/div/div/div/input")).sendKeys("Master Card",Keys.ARROW_DOWN,Keys.ENTER);
	driver.findElement(By.id("Promos")).sendKeys("Promos");
	driver.findElement(By.linkText("Address")).click();

	WebDriverWait wait2 = new WebDriverWait(Browser.driver, 20);
	   wait2.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.id("CompleteAddress")))).sendKeys("Complete Address");
	
	
	
	
	
	driver.findElement(By.linkText("More Information")).click();

	driver.findElement(By.id("MoreInfo")).sendKeys("More Info");

	driver.findElement(By.id("btnaddBusiness")).click();
	Thread.sleep(3000);
	
	
}
     
     
     
     
@Test(priority=3)


    public void BusinessEdit() throws InterruptedException{
     	
     	driver.findElement(By.id("Business")).click();
     	Thread.sleep(5000);
     	WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
 	    wait.until(ExpectedConditions.visibilityOf(
     	driver.findElement(By.xpath("//*[@id='grdBusiness']/div[2]/table/tbody/tr[1]/td[1]")))).click();
     	
           Thread.sleep(3000);
 	    
 	    driver.findElement(By.linkText("Edit")).click();
 	   Thread.sleep(3000);
     	driver.findElement(By.id("Phone")).clear();
     	driver.findElement(By.id("Phone")).sendKeys("8094977827");
     	
     	driver.findElement(By.id("Save")).click();
     	driver.navigate().refresh();
     	Thread.sleep(3000);
     }
    
@Test(priority=4)


     public void BusinessDel() throws InterruptedException{
     	
	 driver.findElement(By.id("Business")).click();
  	Thread.sleep(5000);
  	WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(
  	driver.findElement(By.xpath("//*[@id='grdBusiness']/div[2]/table/tbody/tr[1]/td[1]")))).click();
  	Thread.sleep(3000);
     	driver.findElement(By.id("btnDeleteBusiness")).click();
     	Thread.sleep(3000);
     }

 @Test(priority=5)


 public void CreateBusinessADDButton() throws InterruptedException{
 	
 driver.findElement(By.id("Business")).click();
 
	System.out.println("Afer giving invalid inputs press Add Button and fields disappears");
	String a ="w";
	String b ="q";
	assertEquals(a, b);
 }
   
 @Test(priority=6)


 public void PhoneNoBoundaryValues() throws InterruptedException{
 	
 driver.findElement(By.id("Business")).click();
 
	System.out.println("Afer giving invalid inputs press Add Button and fields disappears");
	String a ="w";
	String b ="q";
	assertEquals(a, b);
	
 }
   
@Test(priority=7)


 public void AcceptingDuplicateEmailid() throws InterruptedException{
 	
 driver.findElement(By.id("Business")).click();
 String a ="w";
	String b ="q";
	assertEquals(a, b);
	
	
 }
@Test(priority=8)


 public void Faxvalidation() throws InterruptedException{
 	
 driver.findElement(By.id("Business")).click();
 
 String a ="w";
	String b ="q";
	assertEquals(a, b);
	
 }
@Test(priority=9)


 public void BuisnameValidation() throws InterruptedException{
 	
 driver.findElement(By.id("Business")).click();
 
 String a ="w";
	String b ="q";
	assertEquals(a, b);
	
 }
@Test(priority=10)


 public void ShowingDoublePromos() throws InterruptedException{
 	
 driver.findElement(By.id("Business")).click();
 
    String a ="w";
	String b ="q";
	assertEquals(a, b);
	
 }
////////************************************CHURCH********************************************************************************************************
@Test(priority=11)


public void AddnewChurch() throws InterruptedException{
	
	driver.findElement(By.id("church")).click();
	ws.waitForPageToLoad();
	driver.findElement(By.id("btnNewChurch")).click();
	driver.findElement(By.id("Name")).sendKeys("Cathilic");
	driver.findElement(By.id("SeniorPastorName")).sendKeys("Jones");
	driver.findElement(By.id("AddressLine1")).sendKeys("Address1");
	driver.findElement(By.id("AddressLine2")).sendKeys("Address2",Keys.TAB,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	        
	driver.findElement(By.id("Cityname")).sendKeys("Acmar",Keys.ENTER,Keys.TAB);
	                
	
	driver.findElement(By.id("ContactTitle")).sendKeys("Amber");
	driver.findElement(By.id("ZipCode")).sendKeys("12345");
	driver.findElement(By.id("ContactName")).sendKeys("Jones");
	driver.findElement(By.id("ContactPhone")).sendKeys("8054143933");
	driver.findElement(By.id("ContactEmail")).sendKeys("so@gmail.com");
	driver.findElement(By.id("Fax")).sendKeys("1234");
	driver.findElement(By.id("Facebook")).sendKeys("Jones");
	driver.findElement(By.id("Twitter")).sendKeys("Tweets");
	driver.findElement(By.id("WebSiteUrl")).sendKeys("www.jane.com");
	driver.findElement(By.xpath("//*[@id='btnaddChurch']/i")).click();
	
	
	Thread.sleep(3000);	
	
	
	
}

@Test(priority=12)


public void EditChurch() throws InterruptedException{
	
	driver.findElement(By.id("church")).click();
	ws.waitForPageToLoad();
	Thread.sleep(3000);
	WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
    wait.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]//*[@id='grdChurch']/div[2]/table/tbody/tr[1]/td[1]")))).click();
  
    WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
    wait1.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.id("Name")))).clear();
    driver.findElement(By.id("Name")).sendKeys("Cathilic");
    driver.findElement(By.linkText("Save")).click();
    
    Thread.sleep(3000);
}

@Test(priority=13)


public void DelChurch() throws InterruptedException{
	
	driver.findElement(By.id("church")).click();
	ws.waitForPageToLoad();
	Thread.sleep(3000);
	WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
    wait.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]//*[@id='grdChurch']/div[2]/table/tbody/tr[1]/td[1]")))).click();
  
    WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
    wait1.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.id("btnDeleteChurch")))).click();


    Thread.sleep(3000);

}

////********************************************************************Event***************************************************************************
@Test(priority=14)


  public void CreateEvennt() throws InterruptedException{
	ws.waitForPageToLoad();
	driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
	
	 WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
	    wait1.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.id("btnNewEvent")))).click();
 
	    
	    WebDriverWait start = new WebDriverWait(Browser.driver, 20);
	    start.until(ExpectedConditions.visibilityOf(
	    driver.findElement(By.id("Title")))).sendKeys("Buisness");
	    
	    
	    WebDriverWait start1 = new WebDriverWait(Browser.driver, 20);
	    start1.until(ExpectedConditions.visibilityOf(
	    driver.findElement(By.id("Businessname")))).sendKeys("Buisnessname");
	    
	    WebDriverWait wait9 = new WebDriverWait(Browser.driver, 20);
		wait9.until(ExpectedConditions.visibilityOf(
	     driver.findElement(By.id("Church")))).sendKeys("C");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id='Church_listbox']/li[1]")).click();
		
         
         
		 WebDriverWait waitp = new WebDriverWait(Browser.driver, 20);
		    waitp.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='ValidateMyContents']/span/span[1]/span[2]/span")))).click();
		 WebDriverWait wait2 = new WebDriverWait(Browser.driver, 20);
			wait2.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.xpath("//*[@id='EventTypeId_listbox']/li[3]")))).click();
			
			driver.findElement(By.id("StartTime")).sendKeys("6/12/2017 12:00 AM");
			driver.findElement(By.id("EndTime")).sendKeys("7/5/2017 12:00 AM");
			
			
			
			WebDriverWait wait4 = new WebDriverWait(Browser.driver, 20);
			wait4.until(ExpectedConditions.visibilityOf(
			
			driver.findElement(By.id("Location")))).sendKeys("C");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='Location_listbox']/li[1]")).click();

			WebDriverWait wait5 = new WebDriverWait(Browser.driver, 20);
			wait5.until(ExpectedConditions.visibilityOf(
			
			driver.findElement(By.xpath("//*[@id='Timedrop']/span/span[1]")))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='StartTimeZone_listbox']/li[3]")).click();
			driver.findElement(By.id("Description")).sendKeys("Description");
			driver.findElement(By.id("btnaddEvent")).click();
			Thread.sleep(3000);			
}
	
		
	

@Test(priority=15)


public void EditEvennt() throws InterruptedException{
	ws.waitForPageToLoad();
	driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
	
	 WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
	    wait1.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]//*[@id='grdEvent']/div[2]/table/tbody/tr/td[2]")))).click();
	    driver.findElement(By.id("Title")).clear();
	    driver.findElement(By.id("Title")).sendKeys("Buisnes");
	    Thread.sleep(3000);
	    WebDriverWait wait2 = new WebDriverWait(Browser.driver, 20);
	    wait2.until(ExpectedConditions.visibilityOf(
	    driver.findElement(By.id("btnUpdateEvent")))).click();
	    Thread.sleep(3000);
}
			
@Test(priority=16)


public void DelEvennt() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
	
	 WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
	    wait1.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]//*[@id='grdEvent']/div[2]/table/tbody/tr/td[2]")))).click();
	    driver.findElement(By.id("Title")).clear();
	    driver.findElement(By.id("Title")).sendKeys("Buisnes");
	    Thread.sleep(3000);
	    WebDriverWait wait2 = new WebDriverWait(Browser.driver, 20);
	    wait2.until(ExpectedConditions.visibilityOf(
	    driver.findElement(By.id("btnDeleteEvent")))).click();
	    Thread.sleep(3000);
	
}


@Test(priority=17)


public void Enddateshouldbegreaterthanstartdate() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
	 String a ="w";
		String b ="q";
		assertEquals(a, b);
	
	
}

@Test(priority=20)


public void Endtimeshouldbegreaterthanstarttimeonsameday() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
	 String a ="w";
		String b ="q";
		assertEquals(a, b);
	
	
}

	
	

////////***********************************************job*********************************************************************************************			
			
@Test(priority=21)


public void CreateJob() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='job']/a/span")).click();
   driver.findElement(By.xpath("//*[@id='btnNewJob']")).click();
   
   
   WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
   wait1.until(ExpectedConditions.visibilityOf(
   driver.findElement(By.id("Title")))).sendKeys("Networking Job",Keys.TAB,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
   
   WebDriverWait wait2 = new WebDriverWait(Browser.driver, 20);
   wait2.until(ExpectedConditions.visibilityOf(
    driver.findElement(By.id("ExperianceLevel")))).sendKeys("Fresher");
   driver.findElement(By.id("SalaryInfo")).sendKeys("5000$",Keys.TAB,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
   driver.findElement(By.id("Location")).sendKeys("A");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='Location_listbox']/li[4]")).click();
	
  
	WebDriverWait wait5 = new WebDriverWait(Browser.driver, 20);
	   wait5.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("//*[@id='accordion']/div[2]/div[1]/a")))).click();
	   Thread.sleep(2000);

	   WebDriverWait wait8 = new WebDriverWait(Browser.driver, 20);
	   wait8.until(ExpectedConditions.visibilityOf(
	
	   driver.findElement(By.xpath("//*[@id='Description']/div//*[@id='Description']")))).sendKeys("Description");
	
	   
	   
	   WebDriverWait wait9 = new WebDriverWait(Browser.driver, 20);
	   wait9.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("//*[@id='accordion']/div[3]/div[1]/a")))).click();
	   
	   WebDriverWait waita = new WebDriverWait(Browser.driver, 20);
	   waita.until(ExpectedConditions.visibilityOf(
	
	   driver.findElement(By.xpath("//*[@id='SkillsNeeded']")))).sendKeys("Description");
	   
	   
	   
	   WebDriverWait waitw = new WebDriverWait(Browser.driver, 20);
	   waitw.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("//*[@id='accordion']/div[4]/div[1]/a")))).click();
	   Thread.sleep(2000);
	   WebDriverWait obj = new WebDriverWait(Browser.driver, 20);
	   obj.until(ExpectedConditions.visibilityOf(
	
	   driver.findElement(By.xpath("//*[@id='Responsibilities']/div//*[@id='Responsibilities']")))).sendKeys("Description");
	 
	   
	   
	   WebDriverWait waitr = new WebDriverWait(Browser.driver, 20);
	   waitr.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("//*[@id='accordion']/div[5]/div[1]/a")))).click();
	   
	   WebDriverWait waitt = new WebDriverWait(Browser.driver, 20);
	   waitt.until(ExpectedConditions.visibilityOf(
	
	   driver.findElement(By.xpath("//*[@id='Qualifications']")))).sendKeys("Description");
	   driver.findElement(By.xpath("//*[@id='Certification']")).sendKeys("Description");
	   
	   
	   
	   
	   
	   WebDriverWait wai = new WebDriverWait(Browser.driver, 20);
	   wai.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("//*[@id='accordion']/div[6]/div[1]/a")))).click();
	   driver.findElement(By.xpath("//*[@id='PaymentOption']")).sendKeys("Description");
	   
	  
	   driver.findElement(By.id("btnaddJob")).click();
	   Thread.sleep(3000);
	   
	   
	  }
			
@Test(priority=22)


public void EditJob() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='job']/a/span")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div//*[@id='grdJob']/div[2]/table/tbody/tr[1]/td[2]")).click();	
		 WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
		   waiq.until(ExpectedConditions.visibilityOf(
			driver.findElement(By.linkText("Edit")))).click();
			
		   WebDriverWait obj = new WebDriverWait(Browser.driver, 20);
		   obj.until(ExpectedConditions.visibilityOf(
			driver.findElement(By.id("Qualifications")))).clear();
		   driver.findElement(By.id("Qualifications")).sendKeys("Graduation");
		   WebDriverWait wa = new WebDriverWait(Browser.driver, 20);
		   wa.until(ExpectedConditions.visibilityOf(
        driver.findElement(By.id("btnSaveQualification")))).click();
		   driver.navigate().refresh();
		   ws.waitForPageToLoad();
		   Thread.sleep(3000);
}



 @Test(priority=23)


    public void DelJob() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='job']/a/span")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div//*[@id='grdJob']/div[2]/table/tbody/tr[1]/td[2]")).click();	
		 WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
		   waiq.until(ExpectedConditions.visibilityOf(
			driver.findElement(By.xpath("//*[@id='btnDeleteJob']")))).click();
		
		

		   Thread.sleep(3000);



}
  @Test(priority=24)


    public void Salaryvalidation() throws InterruptedException{
    	ws.waitForPageToLoad();
    	
    	driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
    	 String a ="w";
    		String b ="q";
    		assertEquals(a, b);
    	
    	
    }
    @Test(priority=25)


    public void QualificationEditorCancelbutton() throws InterruptedException{
    	ws.waitForPageToLoad();
    	
    	driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
    	 String a ="w";
    		String b ="q";
    		assertEquals(a, b);
    	
    	
    }
//////////**********************************************************USER**************************************************************************************
 @Test(priority=26)


 public void SearchUser() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='User']/a/span")).click();

	ws.waitForPageToLoad();
	
	driver.findElement(By.id("SearchUser")).sendKeys("Am");

Thread.sleep(4000);
 }


 
 @Test(priority=27)


public void ActivateUser() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='User']/a/span")).click();
Thread.sleep(3000);
	WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
	   waiq.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]//*[@id='grdUsers']/div[2]/table/tbody/tr[1]/td[5]")))).click();
	Alert alt = driver.switchTo().alert();
	alt.accept();
	
	
	
	Thread.sleep(3000);
	
	
}
@Test(priority=28)


public void DeActivateUser() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='User']/a/span")).click();
Thread.sleep(3000);
	WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
	   waiq.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]//*[@id='grdUsers']/div[2]/table/tbody/tr[1]/td[5]")))).click();
	Alert alt = driver.switchTo().alert();
	alt.accept();
	
	
	
	Thread.sleep(3000);
	
	
}
//////////*****************************************************************************Buisness Category******************************************************

@Test(priority=29)


public void BuisnessaddCategory() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='category']/a/span")).click();
	driver.findElement(By.xpath("//*[@id='btnNewCategory']")).click();
 Thread.sleep(2000);
	WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
	   waiq.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.id("Name")))).sendKeys("Automation Engineer");
	   driver.findElement(By.id("btnaddCategory")).click();
	   Thread.sleep(3000);
}


@Test(priority=30)


public void BuisnessupdateCategory() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='category']/a/span")).click();
	
	WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
	   waiq.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.linkText("Update")))).click();
	   
	   
	   WebDriverWait obj = new WebDriverWait(Browser.driver, 20);
	   obj.until(ExpectedConditions.visibilityOf(
		driver.findElement(By.id("Name")))).clear();
	   driver.findElement(By.id("Name")).sendKeys("Accountants");
	   
	   driver.findElement(By.id("btnUpdateCategory")).click();
	   
	   

	   Thread.sleep(3000);
}
@Test(priority=31)


public void BuisnessDelCategory() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='category']/a/span")).click();
	
	WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
	   waiq.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.linkText("Delete")))).click();
	   
	   Alert alt = driver.switchTo().alert();
		alt.accept();
	  
	   
	   
		Thread.sleep(3000);

}

////////********************************************************Working hours**********************************************************************



@Test(priority=32)


public void CreateworkingHours() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='workingHours']/a/span")).click();
	driver.findElement(By.id("btnCreateWorkingHours")).click();
	
	Select sel =new Select(driver.findElement(By.name("[0].WeekDay")));
           sel.selectByIndex(1);
           
           driver.findElement(By.name("[0].StartTime")).sendKeys("8:40 Am");
           
           driver.findElement(By.name("[0].EndTime")).sendKeys("9:30 Pm");
           
           
           Select sel1 =new Select(driver.findElement(By.name("[1].WeekDay")));
           sel1.selectByIndex(2);
           
            driver.findElement(By.name("[1].StartTime")).sendKeys("8:40 Am");
           
           driver.findElement(By.name("[1].EndTime")).sendKeys("9:30 Pm");
           

           Select sel2 =new Select(driver.findElement(By.name("[2].WeekDay")));
           sel2.selectByIndex(3);
           
            driver.findElement(By.name("[2].StartTime")).sendKeys("8:40 Am");
           
           driver.findElement(By.name("[2].EndTime")).sendKeys("9:30 Pm");
           
           Select sel3 =new Select(driver.findElement(By.name("[3].WeekDay")));
           sel3.selectByIndex(4);
           
            driver.findElement(By.name("[3].StartTime")).sendKeys("8:40 Am");
           
           driver.findElement(By.name("[3].EndTime")).sendKeys("9:30 Pm");
           
           Select sel4 =new Select(driver.findElement(By.name("[4].WeekDay")));
           sel4.selectByIndex(5);
           
           driver.findElement(By.name("[4].StartTime")).sendKeys("8:40 Am");
           
           driver.findElement(By.name("[4].EndTime")).sendKeys("9:30 Pm");
           
           Select sel5 =new Select(driver.findElement(By.name("[5].WeekDay")));
           sel5.selectByIndex(6);
           
           driver.findElement(By.name("[5].StartTime")).sendKeys("8:40 Am");
           
           driver.findElement(By.name("[5].EndTime")).sendKeys("9:30 Pm");
           


           driver.findElement(By.id("btnaddworkinghour")).click();
           
           
           
           Thread.sleep(3000);
}


@Test(priority=33)


public void UpdateworkingHours() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='workingHours']/a/span")).click();

 driver.findElement(By.linkText("Update")).click();
 WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
 waiq.until(ExpectedConditions.visibilityOf(

 driver.findElement(By.name("StartTime")))).clear();
 driver.findElement(By.name("StartTime")).sendKeys("8:40 AM");
 
 driver.findElement(By.id("btnUpdateworkinghour")).click();

 Thread.sleep(2000);
 

}


@Test(priority=34)


public void DeleteworkingHours() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='workingHours']/a/span")).click();

 driver.findElement(By.linkText("Delete")).click();

 Alert alt = driver.switchTo().alert();
	alt.accept();
	Thread.sleep(3000);
}

////**********************************************************PM****************************************************************************************

@Test(priority=35)


public void PaymentMethod() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='paymentMethods']/a/span")).click();
	
    driver.findElement(By.id("btnCreatePaymentOptions")).click();
    WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
    waiq.until(ExpectedConditions.visibilityOf(
    driver.findElement(By.id("Name")))).sendKeys("Master Card");
    driver.findElement(By.xpath("//*[@id='btnaddpayment']/i")).click();
    Thread.sleep(3000);

}

@Test(priority=36)


public void PaymentMethodUpdate() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='paymentMethods']/a/span")).click();
	
  

    driver.findElement(By.linkText("Update")).click();

    WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
    waiq.until(ExpectedConditions.visibilityOf(
    driver.findElement(By.id("Name")))).clear();
    driver.findElement(By.id("Name")).sendKeys("Master Card");
    
    driver.findElement(By.id("btnUpdatePaymentOption")).click();
    Thread.sleep(3000);
}



@Test(priority=37)


public void PaymentMethodDelete() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='paymentMethods']/a/span")).click();
	
  

    driver.findElement(By.linkText("Delete")).click();

    Alert alt = driver.switchTo().alert();
	alt.accept();
	Thread.sleep(3000);
}










@AfterMethod

    public void Logout() {
	WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
	   wait.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.xpath("html/body/div[2]/header/nav/div/ul/li/div/a/img")))).click();
	  
	   driver.findElement(By.linkText("Sign Out")).click();
	
}




@AfterClass 



public void close(){



	driver.quit();


}
}






