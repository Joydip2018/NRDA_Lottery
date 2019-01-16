package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Config.BaseClass;

public class CEO_Dashboard extends BaseClass
{
	WebDriver Driver;
	/*****************************************************************/
	/*
	* This bellow constructor helps to call the Driver from Base Class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	public CEO_Dashboard(WebDriver driver)
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
	* These are the list of the WebElement for Dashboard Screen.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	@CacheLookup
	WebElement Administration;
	
	@FindBy(xpath="//span[contains(text(),'Conduct Draw')]")
	@CacheLookup
	public WebElement ConductDraw;
	
	@FindBy(xpath="//img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	@CacheLookup
	public WebElement Action;
	
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
	
	public void CEO_Administration()
	{
		waitForPageLoad(Driver, Administration);
		Administration.click();
	}
	public void Conduct_Draw()
	{
		waitForPageLoad(Driver, ConductDraw);
		ConductDraw.click();
	}
	public void Click_Action()
	{
		waitForPageLoad(Driver, Action);
		Action.click();
	}
	
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
}
