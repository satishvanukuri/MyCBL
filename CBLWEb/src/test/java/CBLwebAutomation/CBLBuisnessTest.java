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

public class CBLBuisnessTest {

	
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
			
	Loginpage.loginToBuisness();
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


            public void phonevalidation(){
	
	        driver.findElement(By.id("Business")).click();
	

}
@Test(priority=6)


public void DuplicateEmailid(){
	
	driver.findElement(By.id("Business")).click();
	ws.waitForPageToLoad();
	
	String a ="w";
	String b ="q";
	assertEquals(a, b);
}
@Test(priority=7)


public void Altphonenumbervalidation(){
	
	driver.findElement(By.id("Business")).click();
	ws.waitForPageToLoad();
	
	String a ="w";
	String b ="q";
	assertEquals(a, b);
}

//********************************************************************Event***************************************************************************




@Test(priority=8)


public void CreateEvennt() throws InterruptedException{
	ws.waitForPageToLoad();
	driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
	
	 WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
	    wait1.until(ExpectedConditions.visibilityOf(
	driver.findElement(By.id("btnNewEvent")))).click();
 
	    driver.findElement(By.id("Title")).sendKeys("Buisness",Keys.TAB,Keys.TAB,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN);
	    
	 
		

		
			driver.findElement(By.id("StartTime")).sendKeys("6/12/2017 12:00 AM");
			driver.findElement(By.id("EndTime")).sendKeys("7/5/2017 12:00 AM");
			
			
			
			WebDriverWait wait4 = new WebDriverWait(Browser.driver, 20);
			wait4.until(ExpectedConditions.visibilityOf(
			
			driver.findElement(By.id("Location")))).sendKeys("C");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='Location_listbox']/li[1]")).click();


			driver.findElement(By.id("Description")).sendKeys("Description");
			driver.findElement(By.id("btnaddEvent")).click();
			
			
			

			Thread.sleep(3000);
			
			
			
			
			
			
			
			
}

	@Test(priority=9)


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
			
@Test(priority=10)


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



@Test(priority=11)


public void enddateshouldbegreater() throws InterruptedException{
	ws.waitForPageToLoad();
	
	driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
	String a ="w";
	String b ="q";
	assertEquals(a, b);
	
}
//***********************************************job*********************************************************************************************			
			
@Test(priority=12)


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
	   Thread.sleep(2000);
	   
	   
	  }
			
@Test(priority=13)


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



@Test(priority=14)


          public void DelJob() throws InterruptedException{
	      ws.waitForPageToLoad();
	
	     driver.findElement(By.xpath("//*[@id='job']/a/span")).click();
		 driver.findElement(By.xpath("html/body/div[2]/div/div//*[@id='grdJob']/div[2]/table/tbody/tr[1]/td[2]")).click();	
		 WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
		 waiq.until(ExpectedConditions.visibilityOf(
		 driver.findElement(By.xpath("//*[@id='btnDeleteJob']")))).click();
		
		
		   Thread.sleep(3000);




}

@Test(priority=15)


    public void QualificationEditor() throws InterruptedException{
	
	ws.waitForPageToLoad();
	String a ="w";
	String b ="q";
	assertEquals(a, b);
	
	
	
}

@Test(priority=16)


    public void updatesalaryvalidation() throws InterruptedException{
	ws.waitForPageToLoad();
	
	String a ="w";
	String b ="q";
	assertEquals(a, b);
	
	
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
