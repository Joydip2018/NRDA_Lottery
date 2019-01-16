package LotteryManagement.NRDA;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Config.BaseClass;
import Screen.SE_A_Dashboard;

public class SE_A_DashboardPage extends BaseClass
{
	/*****************************************************************/
	/*
	* All functions call the from Screen/SE_A_Dashboard.class.
	* Call "NRDA_LotteryManagement_SC012_TC003" functions from SE_A_LoginPage class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC012_TC004() throws Exception
    {
		SE_A_LoginPage SL=new SE_A_LoginPage();
		SL.NRDA_LotteryManagement_SC012_TC003();
		SE_A_Dashboard SD=PageFactory.initElements(Driver, SE_A_Dashboard.class);
		SD.Administration();
		boolean value=SD.ConductDraw.isDisplayed();
		Assert.assertEquals(value, true);
		SD.Conduct_Draw();
    }
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC012_TC005() throws Exception
    {
		NRDA_LotteryManagement_SC012_TC004();
		SE_A_Dashboard SD=PageFactory.initElements(Driver, SE_A_Dashboard.class);
		SD.Click_Action();
    }
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC014_TC011() throws Exception
    {
		NRDA_LotteryManagement_SC012_TC004();
		SE_A_Dashboard SD=PageFactory.initElements(Driver, SE_A_Dashboard.class);
		SD.Click_Action();
    }
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
}
