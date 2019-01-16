package LotteryManagement.NRDA;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Config.BaseClass;
import Screen.CEO_Dashboard;

public class CEO_DashboardPage extends BaseClass
{
	/*****************************************************************/
	/*
	* All functions call the from Screen/CEO_Dashboard.class.
	* Call "NRDA_LotteryManagement_SC007_TC003" functions from CEO_LoginPage class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@Test
    public void NRDA_LotteryManagement_SC008_TC001() throws Exception
    {
		CEO_LoginPage CL=new CEO_LoginPage();
		CL.NRDA_LotteryManagement_SC007_TC003();
		CEO_Dashboard CD=PageFactory.initElements(Driver, CEO_Dashboard.class);
		CD.CEO_Administration();
    }
	@Test
    public void NRDA_LotteryManagement_SC008_TC002() throws Exception
    {
		NRDA_LotteryManagement_SC008_TC001();
		CEO_Dashboard CD=PageFactory.initElements(Driver, CEO_Dashboard.class);
		boolean value=CD.ConductDraw.isDisplayed();
		Assert.assertEquals(value, true);
		CD.Conduct_Draw();
    }
	@Test
    public void NRDA_LotteryManagement_SC008_TC003() throws Exception
    {
		NRDA_LotteryManagement_SC008_TC002();
		CEO_Dashboard CD=PageFactory.initElements(Driver, CEO_Dashboard.class);
		CD.Click_Action();
    }
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
}
