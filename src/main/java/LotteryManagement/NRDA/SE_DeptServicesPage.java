package LotteryManagement.NRDA;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Config.BaseClass;
import Screen.SE_deptServices;

public class SE_DeptServicesPage extends BaseClass
{
	/*****************************************************************/
	/*
	* All functions call the from Screen/SE_deptServices.class.
	* Call "NRDA_ProjectManagement_SC001_TC005" functions from SE_DashboardPage class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@Test(enabled=false)
    public void NRDA_ProjectManagement_SC002_TC001() throws Exception
    {
		SE_deptServices SD=PageFactory.initElements(Driver, SE_deptServices.class);
		SE_DashboardPage DP=new SE_DashboardPage();
		DP.NRDA_ProjectManagement_SC001_TC005();
		boolean value=SD.EstateSection.isDisplayed();
		Assert.assertEquals(value, true);
    }
	@Test
    public void NRDA_LotteryManagement_SC002_TC002() throws Exception
    {
		SE_deptServices SD=PageFactory.initElements(Driver, SE_deptServices.class);
		SE_DashboardPage DP=new SE_DashboardPage();
		DP.NRDA_ProjectManagement_SC001_TC005();
		SD.Estate_Section();
		SD.Lottery_Management();
    }
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
	
	
}
