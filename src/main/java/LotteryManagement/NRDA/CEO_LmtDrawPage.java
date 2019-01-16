package LotteryManagement.NRDA;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Config.BaseClass;
import Screen.CEO_LmtDraw;
import Screen.Logout;
import Utility.FileUploader;

public class CEO_LmtDrawPage extends BaseClass
{
	/*****************************************************************/
	/*
	* All functions call the from Screen/CEO_LmtDraw.class.
	* Call "NRDA_LotteryManagement_SC008_TC003" functions from CEO_DashboardPage class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC009_TC001() throws Exception
    {
		CEO_DashboardPage CD=new CEO_DashboardPage();
		CD.NRDA_LotteryManagement_SC008_TC003();
		CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		CL.Select_Action("APPROVE");
    }
	@Test(enabled=false)
	public void NRDA_LotteryManagement_SC009_TC002() throws Exception
	{
	 	NRDA_LotteryManagement_SC009_TC001();
	 	CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		String str=CL.Read_Subject();
		Assert.assertEquals("true", str);
	}
	@Test(enabled=false)
	public void NRDA_LotteryManagement_SC009_TC003() throws Exception
	{
	 	NRDA_LotteryManagement_SC009_TC001();
	 	CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		String str=CL.Read_Filenumber();
		Assert.assertEquals("true", str);
	}
	@Test(enabled=false)
	public void NRDA_LotteryManagement_SC009_TC004() throws Exception
	{
		NRDA_LotteryManagement_SC009_TC001();
	 	CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		String str=CL.Comments.getText();
		Assert.assertEquals("", str);
		CL.Submit_btn();
		String str1="Comment is required !";
		Assert.assertEquals(CL.validation_msg(), str1);
	}
	@Test(enabled=false)
	public void NRDA_LotteryManagement_SC009_TC005() throws Exception
	{
		NRDA_LotteryManagement_SC009_TC001();
	 	CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		CL.put_Comments("Lottery application approved.");
	}
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC009_TC006() throws Exception
    {
    	CEO_DashboardPage CD=new CEO_DashboardPage();
		CD.NRDA_LotteryManagement_SC008_TC003();
		CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		waitForPageLoad(Driver, CL.Uploadfile);
		FileUploader FU=new FileUploader();
		FU.Fileupload("C:\\Users\\joydip.bhattacharjee\\Desktop\\New Text Document.txt", CL.Uploadfile);
		Assert.assertEquals(CL.validation_msg(), "Upload only jpg, png or pdf file");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC009_TC007() throws Exception
    {
    	CEO_DashboardPage CD=new CEO_DashboardPage();
		CD.NRDA_LotteryManagement_SC008_TC003();
		CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		waitForPageLoad(Driver, CL.Uploadfile);
		FileUploader FU=new FileUploader();
		FU.Fileupload("C:\\Users\\joydip.bhattacharjee\\Desktop\\Fileupload.jpg", CL.Uploadfile);
		
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC009_TC008() throws Exception
    {
    	CEO_DashboardPage CD=new CEO_DashboardPage();
		CD.NRDA_LotteryManagement_SC008_TC003();
		CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		waitForPageLoad(Driver, CL.Close);
		CL.Close.click();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC009_TC009() throws Exception
    {
    	NRDA_LotteryManagement_SC009_TC001();
		CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		CL.put_Comments("Lottery application approved.");
		waitForPageLoad(Driver, CL.Uploadfile);
		CL.Uploadfile.click();
		FileUploader FU=new FileUploader();
		FU.Fileupload("C:\\Users\\joydip.bhattacharjee\\Desktop\\Fileupload.jpg", CL.Uploadfile);
		CL.Submit_btn();
		
    }
    @Test//(enabled=false)
    public void NRDA_LotteryManagement_SC010_TC001() throws Exception
    {
    	CEO_DashboardPage CD=new CEO_DashboardPage();
		CD.NRDA_LotteryManagement_SC008_TC003();
		CEO_LmtDraw CL=PageFactory.initElements(Driver, CEO_LmtDraw.class);
		CL.Select_Action("REJECT");
		CL.put_Comments("Lottery application approved.");
		waitForPageLoad(Driver, CL.Uploadfile);
		CL.Uploadfile.click();
		FileUploader FU=new FileUploader();
		FU.Fileupload("C:\\Users\\joydip.bhattacharjee\\Desktop\\Fileupload.jpg", CL.Uploadfile);
		CL.Submit_btn();		
    }
    @Test(enabled=false)
    public void NRDA_LandManagement_SC011_TC001() throws Exception
    {
    	CEO_DashboardPage CD=new CEO_DashboardPage();
		CD.NRDA_LotteryManagement_SC008_TC003();
		Logout Sout=PageFactory.initElements(Driver, Logout.class);
		Sout.logout();		
    }
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
}