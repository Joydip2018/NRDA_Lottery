package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Config.SuperBaseClass;

public class Logout extends SuperBaseClass
{
	WebDriver Driver;
	/*****************************************************************/
	/*
	* This bellow constructor helps to call the Driver from Base Class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	public Logout(WebDriver driver)
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
	* These are the list of the WebElement for Logout Screen.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@FindBy(xpath="//a[@class='dropdown-toggle link-outline']")
	@CacheLookup
	WebElement Settings;
	
	@FindBy(xpath="//li//a[contains(text(), 'Logout')]")
	@CacheLookup
	WebElement Logout;
	
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
	public void logout()
	{
		Actions AC=new Actions(Driver);
		waitForPageLoad(Driver, Settings);
		AC.moveToElement(Settings).build().perform();
		waitForPageLoad(Driver, Logout);
		AC.moveToElement(Logout).click().build().perform();				
	}
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
	
}
