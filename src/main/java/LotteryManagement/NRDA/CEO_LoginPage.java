package LotteryManagement.NRDA;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Config.BaseClass;
import Screen.Login;

public class CEO_LoginPage extends BaseClass
{
	/*****************************************************************/
	/*
	* All functions call the from Screen/Login.class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@Test
    public void NRDA_LotteryManagement_SC007_TC002()
    {
		Login SL=PageFactory.initElements(Driver, Login.class);
		SL.Login_ID("ceo-project");
		SL.User_Password("Vijay@123909");
		SL.User_Type("Officer Login");
		SL.Submit_btn();
		String str=SL.validation_msg();
		Assert.assertEquals(str, "Invalid Login Details");
    }
	@Test
    public void NRDA_LotteryManagement_SC007_TC003()
    {
		Login SL=PageFactory.initElements(Driver, Login.class);
		SL.Login_ID("ceo");
		SL.User_Password("NRDA@181");
		SL.User_Type("Officer Login");
		SL.Submit_btn();
    }
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
}
