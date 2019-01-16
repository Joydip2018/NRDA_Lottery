package Screen;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Config.BaseClass;

public class SE_A_Dashboard extends BaseClass
{
	WebDriver Driver;
	/*****************************************************************/
	/*
	* This bellow constructor helps to call the Driver from Base Class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	public SE_A_Dashboard(WebDriver driver)
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
	
	
	By Actiontable =By.xpath("//table//tbody[@id='inboxForm:j_"
			+ "id1787737155_72d11f05_data']//tr/td");

	@FindBy(xpath="//img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	@CacheLookup
	public WebElement Action;
	
	/*@FindBy(xpath="//span[contains(text(),'Conduct Draw')]")
	@CacheLookup
	public WebElement ConductDraw;*/
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
	
	public void Administration()
	{
		waitForPageLoad(Driver, Administration);
		Administration.click();
	}
	public void Conduct_Draw()
	{
		waitForPageLoad(Driver, ConductDraw);
		ConductDraw.click();
	}
	public void Click_Action() throws Exception
	{
		Thread.sleep(2000);
		List<WebElement> TDlist= Driver.findElements(Actiontable);
		int Count= TDlist.size();
		for (int j=0; j<Count; j++)
		{
			String TD= TDlist.get(j).getText();
			if(TD.equalsIgnoreCase("NRDA/2018/11/00008"))
			{
				j=j+4;
				TDlist.get(j).click();
				break;				
			}
		}
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/
}
