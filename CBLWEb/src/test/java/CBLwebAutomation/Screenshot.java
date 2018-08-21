package CBLwebAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Comgeneric.CBLWEb.Browser;



public class Screenshot implements ITestListener{

	public void onFinish(ITestContext arg0) {
	
		
	}

	public void onStart(ITestContext arg0) {
	
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	
		
	}

	public void onTestFailure(ITestResult Result) {
	System.out.println("Test cases failed and details are"+Result.getTestName());
		
		
		System.out.println("***** Error "+Result.getName()+" test has failed *****"); 
    	String methodName=Result.getName().toString().trim();
    	try {
			takeScreenShot(methodName);
		} catch (IOException e) {

			e.printStackTrace();
		}
    }
	
    public void takeScreenShot(String methodName) throws IOException {
    	String filepath ="D:\\Sahil_workspace\\sahil\\Screentshot\\ScrrenBug";
    	EventFiringWebDriver driver =new EventFiringWebDriver(Browser.driver);
    	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
            try {
				FileUtils.copyFile(scrFile, new File(filepath+methodName+".png"));
				System.out.println("***Placed screen shot in "+filepath+"");
			} catch (IOException e) {
				e.printStackTrace();
			}
            
WebDriver driver1 = new Augmenter().augment(driver);
File file  = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File(methodName+".jpg"));


		
	}

	public void onTestSkipped(ITestResult arg0) {
	
		
	}

	public void onTestStart(ITestResult arg0) {
	
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
	}
	
}

	