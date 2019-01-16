package LotteryManagement.NRDA;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Config.BaseClass;
import Screen.SE_Dashboard;

public class SE_DashboardPage extends BaseClass
{
	/*****************************************************************/
	/*
	* All functions call the from Screen/SE_Dashboard.class.
	* Call "NRDA_ProjectManagement_SC001_TC003" functions from SE_LoginPage class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@Test
    public void NRDA_ProjectManagement_SC001_TC004() throws Exception
    {
		SE_LoginPage SL=new SE_LoginPage();
		SL.NRDA_ProjectManagement_SC001_TC003();
		SE_Dashboard SD=PageFactory.initElements(Driver, SE_Dashboard.class);
		SD.e_Governance();
		boolean value=SD.ApplicationForm.isDisplayed();
		Assert.assertEquals(value, true);
    }
	@Test
    public void NRDA_ProjectManagement_SC001_TC005() throws Exception
    {
		SE_LoginPage SL=new SE_LoginPage();
		SL.NRDA_ProjectManagement_SC001_TC003();
		SE_Dashboard SD=PageFactory.initElements(Driver, SE_Dashboard.class);
		SD.e_Governance();
		SD.Application_Form();
    }
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
}
