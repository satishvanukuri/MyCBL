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

	public class CBLChurchTest {

		
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
				
		Loginpage.loginToChurch();
			}
//********************************************************Event**************************************************************************************			
			
			@Test(priority=1)


			public void CreateEvennt() throws InterruptedException{
				ws.waitForPageToLoad();
				driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
				
				 WebDriverWait wait1 = new WebDriverWait(Browser.driver, 20);
				    wait1.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.id("btnNewEvent")))).click();
			 
				    driver.findElement(By.id("Title")).sendKeys("Buisness",Keys.TAB,Keys.TAB,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN);
				    
				 
					
					driver.findElement(By.xpath("//*[@id='ValidateMyContents']/span/span/span[1]")).click();
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


		@Test(priority=2)


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

					Thread.sleep(3000);}
						
			@Test(priority=3)


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
				
			@Test(priority=4)


			public void Enddateshouldbegreater() throws InterruptedException{
				ws.waitForPageToLoad();
				driver.findElement(By.xpath("//*[@id='events']/a/span")).click();
				 String a ="w";
					String b ="q";
					assertEquals(a, b);
				
			}
			
////***********************************************My Joobs********************************************************************************************8			
			
			
			@Test(priority=5)


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
				   
				  
				   driver.findElement(By.xpath("//*[@id='btnaddJob']/i")).click();
				   Thread.sleep(2000);
				   
				   
				  }
						
			@Test(priority=6)


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



			 @Test(priority=7)


			    public void DelJob() throws InterruptedException{
				ws.waitForPageToLoad();
				
				driver.findElement(By.xpath("//*[@id='job']/a/span")).click();
					driver.findElement(By.xpath("html/body/div[2]/div/div//*[@id='grdJob']/div[2]/table/tbody/tr[1]/td[2]")).click();	
					 WebDriverWait waiq = new WebDriverWait(Browser.driver, 20);
					   waiq.until(ExpectedConditions.visibilityOf(
						driver.findElement(By.xpath("//*[@id='btnDeleteJob']")))).click();
					

						Thread.sleep(3000);





			}
			    
			    @Test(priority=8)


			    public void Qualificationeditorcancel() throws InterruptedException{
				ws.waitForPageToLoad();
				
				driver.findElement(By.xpath("//*[@id='job']/a/span")).click();
				String a ="w";
				String b ="q";
				assertEquals(a, b);
			    }
			    
			    @Test(priority=5)


			    public void Salaryvalidation() throws InterruptedException{
				ws.waitForPageToLoad();
				
				driver.findElement(By.xpath("//*[@id='job']/a/span")).click();
				String a ="w";
				String b ="q";
				assertEquals(a, b);
			    }
//***********************************************************************MY Working Hours*************************************************************
			  
			    
			    
			    @Test(priority=9)


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
			               
			               
//			               Select sel6 =new Select(driver.findElement(By.name("[6].WeekDay")));
//			               sel6.selectByIndex(7);
//			               
//			               driver.findElement(By.name("[6].StartTime")).sendKeys("8:40 Am");
//			               
//			               driver.findElement(By.name("[6].EndTime")).sendKeys("9:30 Pm");

			               driver.findElement(By.id("btnaddworkinghour")).click();
			               
			               

							Thread.sleep(3000);
			               
			    }


@Test(priority=10)


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

@Test(priority=11)


			    public void DeleteworkingHours() throws InterruptedException{
			    	ws.waitForPageToLoad();
			    	
			    	driver.findElement(By.xpath("//*[@id='workingHours']/a/span")).click();

			     driver.findElement(By.linkText("Delete")).click();

			     Alert alt = driver.switchTo().alert();
			    	alt.accept();

					Thread.sleep(3000);
			    }
	
			
@Test(priority=12)


public void novalidation () throws InterruptedException{
	driver.findElement(By.xpath("//*[@id='workingHours']/a/span")).click();
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
			
	

