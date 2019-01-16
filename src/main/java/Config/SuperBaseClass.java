package Config;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SuperBaseClass 
{
	public static WebDriver Driver;
	public static ExtentReports extent;
	
	public static WebDriver getdriver()
	{
		return Driver;	
	}
	public static ExtentReports getextent()
	{
	 	return extent;	
	}
	@BeforeSuite(alwaysRun=true)
	@Parameters({"Reportname"})
	public void setup(@Optional String Reportname)
	{
		String xmlname=Reportname;
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Screenshot/"+xmlname+".html");		
	    extent = new ExtentReports();	    
	    extent.attachReporter(reporter);
	    
	}
	/*****************************************************************/
	/*
	* This bellow function helps to Wait driver.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	public void waitForPageLoad(WebDriver wdriver, WebElement WES) 
	{
	ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() 
	{
	       public Boolean apply(WebDriver driver) 
	       {
	           return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
	       }
	       };
	       try {
	           WebDriverWait wait = new WebDriverWait(wdriver, 120);
	           wait.until(expectation);
	           wait.until(ExpectedConditions.visibilityOfAllElements(WES));
	       } catch (Throwable error) {
	           Assert.fail("Timeout waiting for Page Load Request to complete.");
	       }
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/

	
}
