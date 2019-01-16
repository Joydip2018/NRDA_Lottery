package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Config.SuperBaseClass;

public class Login extends SuperBaseClass
{
	WebDriver Driver;
	/*****************************************************************/
	/*
	* This bellow constructor helps to call the Driver from Base Class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	public Login(WebDriver driver)
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
	@FindBy(xpath="//input[@id='loginForm:user']")
	@CacheLookup
	WebElement LoginID;
	
	@FindBy(xpath="//input[@id='loginForm:password']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="//select[@title='User Type']")
	@CacheLookup
	WebElement UserType;
	
	@FindBy(xpath="//button[@id='loginForm:submitButton']")
	@CacheLookup
	WebElement Submit;
	
	@FindBy(xpath="//div[@id='loginForm:msg_container']")
	@CacheLookup
	WebElement Msg;
	
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
	
	public void Login_ID(String username)
	{
		waitForPageLoad(Driver, LoginID);
		LoginID.clear();
		LoginID.sendKeys(username);
	}
	public void User_Password(String Pass)
	{
		waitForPageLoad(Driver, Password);
		Password.clear();
		Password.sendKeys(Pass);
	}
	public void User_Type(String Type)
	{
		waitForPageLoad(Driver, UserType);
		Select Dropdown=new Select(UserType);
		Dropdown.selectByVisibleText(Type);
	}
	public void Submit_btn()
	{
		waitForPageLoad(Driver, Submit);
		Submit.click();
	}
	public String validation_msg()
	{
		waitForPageLoad(Driver, Msg);
		return Msg.getText();
	}
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
}
