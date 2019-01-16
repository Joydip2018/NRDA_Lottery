package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Config.BaseClass;

public class SE_deptServices extends BaseClass
{
	WebDriver Driver;
	/*****************************************************************/
	/*
	* This bellow constructor helps to call the Driver from Base Class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	public SE_deptServices(WebDriver driver)
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
	* These are the list of the WebElement for Dept Service Screen.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-corner-all']"
			+ "//a[@href='#'][contains(text(),'Estate Section')]")
	
	@CacheLookup
	public WebElement EstateSection;
	
	@FindBy(xpath="//img[@src='/NRDAuthority/javax.faces.resource/applyNow.png.xhtml?ln=img']")
	@CacheLookup
	WebElement Lottery;
	
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
	
	public void Estate_Section()
	{
		waitForPageLoad(Driver, EstateSection);
		EstateSection.click();
	}
	public void Lottery_Management()
	{
		waitForPageLoad(Driver, Lottery);
		Lottery.click();
	}
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
	
}
