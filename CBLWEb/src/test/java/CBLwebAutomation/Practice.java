package CBLwebAutomation;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	

class Practice {	

	
	
	  public static void main(String []args) throws InterruptedException{
	    	
		  
		  
		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
			
			WebDriver driver= new FirefoxDriver();
				
		
			 
	 driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		 
	 //driver.findElement(By.xpath("//*[@id='menu1']")).sendKeys(Keys.chord(Keys.CONTROL,"t"));	
		       
		 driver.findElement(By.xpath("//*[@id='menu1']")).click();
		 
		 Thread.sleep(3000);
		 
		 
		 List<WebElement>list  = driver.findElements(By.xpath("//*[@class='dropdown-menu']/li/a"));
		 
		 for(WebElement ele : list)
		 {
			 System.out.println("present dropdown elements are:-"+ele.getAttribute("innerHTML"));
			 
			 if(ele.getAttribute("innerHTML").contains("JavaScript"))
			 {
			 ele.click();
			 break;
			 }
			 
	  }
		 
		 }}

// Copy Paste


//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//
//WebDriver driver= new FirefoxDriver();
//	
//driver.get("http://www.facebook.com");
//
//Thread.sleep(3000);
//
//driver.findElement(By.id("email")).sendKeys("ddddd");
//   
//
//
//driver.findElement(By.id("email")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
//driver.findElement(By.id("email")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
//		   
//driver.findElement(By.id("u_0_f")).sendKeys(Keys.chord(Keys.CONTROL,"v"));










		  
		  
// Action		Context Click  
		  
//driver.findElement(By.id("email")).sendKeys("ddddd");
//
//WebElement wd =    driver.findElement(By.id("email"));
//
//
//Actions ax = new Actions (driver);
//
//ax.contextClick(wd).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//	  
		  
		  
		  
		  
		  
  		
		  
		  // Action Move to Element
		  
//			System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//			
//			WebDriver driver= new FirefoxDriver();
//				
//		    driver.get("http://www.irctc.co.in/eticketing/loginHome.jsf");
//		    
//		    Thread.sleep(3000);
//		   
//		    WebElement wb = driver.findElement(By.id("irctc_tourism"));
//		    
//		    Actions act = new Actions (driver);
//		    
//		    act.moveToElement(wb).build().perform();
//		    
//		    
//		    Thread.sleep(3000);
//		    
//		    driver.close();
//		    
//  		}
//	  
//}




//''''''''''''''''''''''''''''''''''''MArque''''''''''''''''''''''''''''''''''''''''
//
//driver.findElement(By.xpath("//a[@href='https://www.bhimupi.org.in/what-we-do']")).click();
//
//
//'''''''''''''''''''''''''''''''''''''''compare''''''''''''''''''''''''''''''''''''''''
//	String d =driver.getTitle();
//	
//	System.out.println(d);
//	
//	String actualResult = "Yahoo";
//	
//	if(d.contains(actualResult))
//	{
//		System.out.println("Web Page Title is right with contains method");
//	}
//		    
//	else
//	{
//		System.out.println("Web Page Title is not right");
//	}	    
//		    
//		
//	
//    String actuaResult = "Yahoo";
//	
//	if(d.equals(actuaResult))
//	{
//		System.out.println("Web Page Title  is right with equals operator");
//	}
//		    
//	else
//	{
//		System.out.println("Web Page Title is not right");
//	}	    
//	
//		driver.close();    
//	 }}	    
//		    
//	
//
//
//
//
//
//

// Alert pop up 
//
//
//driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
//
//Thread.sleep(3000);
//
//driver.findElement(By.id("loginbutton")).click();
//
//
//
//  Alert alert=driver.switchTo().alert();		
//
//   
//  String alertMessage=driver.switchTo().alert().getText();		
//
//
//  System.out.println(alertMessage);			
//
//  Thread.sleep(3000);
//
//   alert.accept();	
//
//}
//}




//''''''''''''''''''''''''''''''''''''''''Wait statements'''''''''''''''''''''''''''''		




//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
//WebDriverWait wait = new WebDriverWait(driver,20);
//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("d"))));


















































//---------------------Page Source--------------------------
		    
		    
//String PageSource = driver.getPageSource();
//		    
//System.out.println(PageSource);	    
		    
	//get text	    
		    
//		    
//		    WebElement element = driver.findElement(By.xpath(".//*[@class='LineClamp(4,5.3em) LineClamp(3,4em)--md1100 M(0) Lh(1.35) Mb(5px)']"));
//		    String linkText = element.getText();
//		    System.out.println(linkText);	
//	  }
//		    
//		    
//		    
//		    
//	  }		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
//		    List<WebElement>lst =driver.findElements(By.xpath("//a"));
//
//
//		    for(int i=1;i<=lst.size()-1;i++)
//		{
//		    	
//		    
////		    if(i==63)
////			{
//		    	System.out.println(i+" "+lst.get(i).getText());
//		    	
//		    	
////		   	break;
////		   		
////			}
//
//		}
//		    Thread.sleep(9000);
//		  
//		    
//		    
//		    }}
//
//
//
//
//
//





























//	 private static WebDriver driver = null;
//
//	    public static void main(String[] args) {
//	     
//	        
//	        String homePage = "https://www.yahoo.com";
//	        String url = "";
//	        HttpURLConnection huc = null;
//	        int respCode = 200;
//	        
//	        driver = new FirefoxDriver();
//	        
//	        driver.manage().window().maximize();
//	        
//	        driver.get(homePage);
//	        
//	        List<WebElement> links = driver.findElements(By.tagName("a"));
//	        
//	        Iterator<WebElement> it = links.iterator();
//	        
//	        while(it.hasNext()){
//	            
//	            url = it.next().getAttribute("href");
//	            
//	            System.out.println(url);
//	        
//	            if(url == null || url.isEmpty()){
//	            	
//	                   System.out.println("URL is either not configured for anchor tag or it is empty");
//	              
//	                   continue;
//	            }
//	            
//	            if(!url.startsWith(homePage)){
//	                System.out.println("URL belongs to another domain, skipping it.");
//	                continue;
//	            }
//	            
//	            try {
//	                huc = (HttpURLConnection)(new URL(url).openConnection());
//	                
//	                huc.setRequestMethod("HEAD");
//	                
//	                huc.connect();
//	                
//	                respCode = huc.getResponseCode();
//	                
//	                if(respCode >= 400){
//	                    System.out.println(url+" is a broken link");
//	                }
//	                else{
//	                    System.out.println(url+" is a valid link");
//	                }
//                                                                                                                                                                     	                    
//	            } catch (MalformedURLException e) {
//	                
//	                e.printStackTrace();
//	            } catch (IOException e) {
//	                
//	                e.printStackTrace();
//	            }
//	        }
//	        
//	        driver.quit();
//
//	    }
//	
//               
 // Download         
//          For the saving download
//    	  
//    	  WebDriver driver = new FirefoxDriver();	
//           driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
//           Thread.sleep(4000);
//           driver.findElement(By.linkText("animatedcolors.xlsm")).click();	
//          
//           Robot robot = new Robot();  // Robot class throws AWT Exception	
//           Thread.sleep(2000); // Thread.sleep throws InterruptedException	
//           robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
//           
//           Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
//           robot.keyPress(KeyEvent.VK_TAB);	
//           Thread.sleep(2000);	
//           robot.keyPress(KeyEvent.VK_TAB);	
//           Thread.sleep(2000);	
//           robot.keyPress(KeyEvent.VK_TAB);	
//           Thread.sleep(2000);	
//           robot.keyPress(KeyEvent.VK_ENTER);	
//           press enter key of keyboard to perform above selected action	
//        }	 
 

/////////////////////upload 

//@Test//(priority =1)
//
//
//public void Assistory() throws InterruptedException, AWTException 
//{
//	   WebDriver driver = new FirefoxDriver();	
//
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElement(By.linkText("Assets")).click();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElement(By.id("AssetSearchString")).sendKeys("Pump",Keys.ENTER);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//*[@id='divAssets']/table/tbody/tr[1]/td[1]/a")).click();
//driver.findElement(By.id("tab_5")).click();
//Thread.sleep(3000);
//driver.findElement(By.linkText("Upload")).click();
//driver.findElement(By.id("file")).click();
//
//
//
//
//
//StringSelection ss = new StringSelection("‪4d85808d-7c3c-4f7c-bcd8-b0a29797d1a3-original.jpeg");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
////imitate mouse events like ENTER, CTRL+C, CTRL+V
//
//
//Robot robot = new Robot();
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
//robot.keyPress(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_V);
//robot.keyRelease(KeyEvent.VK_V);
//robot.keyRelease(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
//
//
////robot.keyPress(KeyEvent.VK_TAB);	
////Thread.sleep(2000);	
////robot.keyPress(KeyEvent.VK_TAB);	
//
//Thread.sleep(2000);	
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
//
//
//
//
//}}	








  

