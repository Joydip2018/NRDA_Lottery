package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Config.BaseClass;

public class SE_Dashboard extends BaseClass
{
	WebDriver Driver;
	/*****************************************************************/
	/*
	* This bellow constructor helps to call the Driver from Base Class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	public SE_Dashboard(WebDriver driver)
	{
		this.Driver=driver;
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/
	/*****************************************************************/
	/*
	* These are the list of the WebElement for Login Screen.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@FindBy(xpath="//a[contains(text(),'eGovernance')]")
	@CacheLookup
	WebElement eGovernance;
	
	@FindBy(xpath="//span[contains(text(),'Application Form')]")
	@CacheLookup
	public WebElement ApplicationForm;
	
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
	
	/*****************************************************************/
	/*
	* These bellow functions take the reference of above WebElements.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	
	public void e_Governance()
	{
		waitForPageLoad(Driver, eGovernance);
		eGovernance.click();
	}
	public void Application_Form()
	{
		waitForPageLoad(Driver, ApplicationForm);
		ApplicationForm.click();
	}
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
}
