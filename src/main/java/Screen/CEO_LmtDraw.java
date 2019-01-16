package Screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Config.SuperBaseClass;

public class CEO_LmtDraw extends SuperBaseClass
{
	WebDriver Driver;
	/*****************************************************************/
	/*
	* This bellow constructor helps to call the Driver from Base Class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	public CEO_LmtDraw(WebDriver driver)
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
	* These are the list of the WebElement for CEO Draw Screen.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//tr[@class='ui-widget-content']"
			+ "//td[1]//div[3]")
	@CacheLookup
	WebElement Action;
	
	By Actionlist=By.xpath("//div[@id='inboxForm:j_id434063699_42dd4ab_panel']"
			+ "//ul[@class='ui-selectonemenu-items ui-selectonemenu-list "
			+ "ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li");

	
	@FindBy(xpath="//input[@id='inboxForm:j_id434063699_42dd59b']")
	@CacheLookup
	WebElement RSubject;
	
	@FindBy(xpath="//input[@id='inboxForm:j_id434063699_42dd249']")
	@CacheLookup
	WebElement RFilenumber;
	
	@FindBy(xpath="//textarea[@id='inboxForm:todolist']")
	@CacheLookup
	public WebElement Comments;
	
	@FindBy(xpath="//div[@id='inboxForm:msg_container']")
	@CacheLookup
	WebElement Msg;

	@FindBy(xpath="//label[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left fileinput-button']")
	@CacheLookup
	public WebElement Uploadfile;
	
	@FindBy(xpath="//button[@id='inboxForm:j_id434063699_42dd325']")
	@CacheLookup
	public WebElement Close;
	
	@FindBy(xpath="//button[@id='inboxForm:submitDraw']")
	@CacheLookup
	WebElement Submit;
	
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
	public void Select_Action(String act)
	{
		waitForPageLoad(Driver, Action);
		Action.click();
		List<WebElement> Alist= Driver.findElements(Actionlist);
		int Count= Alist.size();
		for(int i=0; i<Count; i++)
		{
			String getlist=Alist.get(i).getText();
			if(getlist.equalsIgnoreCase(act))
			{
				Alist.get(i).click();
				break;
			}
		}
	}
	public String Read_Subject()
	{
		return RSubject.getAttribute("aria-readonly");
	}
	public String Read_Filenumber()
	{
		return RFilenumber.getAttribute("aria-readonly");
	}
	public void put_Comments(String comm)
	{
		waitForPageLoad(Driver, Comments);
		Comments.sendKeys(comm);
	}
	public String validation_msg()
	{
		return Msg.getText();
	}
	public void Submit_btn()
	{
		waitForPageLoad(Driver, Submit);
		Submit.click();
	}
	public void close_btn()
	{
		waitForPageLoad(Driver, Close);
		Close.click();
	}
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/

}
