package LotteryManagement.NRDA;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Config.BaseClass;
import Screen.Logout;
import Screen.SE_lmtDraw;
import Utility.FileUploader;

public class SE_LmtDrawPage extends BaseClass
{
	/*****************************************************************/
	/*
	* All functions call the from Screen/SE_lmtDraw.class.
	* Call "NRDA_LotteryManagement_SC002_TC002" functions from SE_DeptServicesPage class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC003_TC001() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.Draw_Date();		
    }
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC003_TC002() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.Draw_Time();		
    }
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC003_TC003() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.put_Attendence("75");	
    }
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC003_TC004() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.click_Audience();	
    }
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC003_TC005() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		
		SL.click_Allottee();	
    }
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC003_TC006() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		
		SL.project_type();	
    }
	@Test(enabled=false)
    public void NRDA_LotteryManagement_SC003_TC007() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);	
		SL.Search_project();	
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC003_TC008() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Select_projecttype();	
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC003_TC009() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.Add_projecttype();	
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC001() throws Exception
    {
		SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.click_AddInternalmembers();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC002() throws Exception
    {
		NRDA_LotteryManagement_SC004_TC001();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Select_Section();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC003() throws Exception
    {
    	NRDA_LotteryManagement_SC004_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Select_InName();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC004() throws Exception
    {
    	NRDA_LotteryManagement_SC004_TC001();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);	
		SL.In_Designation("GM");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC005() throws Exception
    {
    	NRDA_LotteryManagement_SC004_TC001();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.In_MobileNo("8800801294");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC006() throws Exception
    {
    	NRDA_LotteryManagement_SC004_TC001();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.In_Email("np@ex.in");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC007() throws Exception
    {
    	SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
    	SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.click_AddExternalmembers();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC008() throws Exception
    {
    	NRDA_LotteryManagement_SC004_TC007();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Ex_Organisation("Keshav Residency");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC009() throws Exception
    {
    	NRDA_LotteryManagement_SC004_TC007();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);;
		SL.Ex_Name("Naresh Kumar");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC010() throws Exception
    {
    	NRDA_LotteryManagement_SC004_TC007();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Ex_Designation("CEO");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC011() throws Exception
    {
    	NRDA_LotteryManagement_SC004_TC007();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Ex_MobileNo("8800801294");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC004_TC012() throws Exception
    {
    	NRDA_LotteryManagement_SC004_TC007();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.Ex_Email("naresh.kumar@ex.in");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC001() throws Exception
    {
    	SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);	
		SL.Select_Action();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC002() throws Exception
    {
    	NRDA_LotteryManagement_SC005_TC001();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);	
		SL.Select_User();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC003() throws Exception
    {
    	NRDA_LotteryManagement_SC005_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		String str=SL.Read_Subject();
		Assert.assertEquals("true", str);
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC004() throws Exception
    {
    	NRDA_LotteryManagement_SC005_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		String str=SL.Read_Filenumber();
		Assert.assertEquals("true", str);
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC005() throws Exception
    {
    	NRDA_LotteryManagement_SC005_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.click_SFile();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC006() throws Exception
    {
    	NRDA_LotteryManagement_SC005_TC005();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Enter_Subject("Lottery");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC007() throws Exception
    {
    	NRDA_LotteryManagement_SC005_TC006();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		SL.Click_SSubject();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC008() throws Exception
    {
    	NRDA_LotteryManagement_SC005_TC007();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		boolean bl=SL.CheckRedio();
		Assert.assertEquals(true, bl);		
		SL.Click_Selectfile();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC009() throws Exception
    {
    	NRDA_LotteryManagement_SC005_TC007();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Click_Selectfile();
		SL.Click_Fillinform();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC010() throws Exception
    {
    	SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		String str=SL.Comment_value();
		Assert.assertEquals("", str);
		SL.Submit_btn();
		String str1="Comment is required !";
		Assert.assertEquals(SL.validation_msg(), str1);
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC011() throws Exception
    {
    	SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Click_Comments("Lottery request forward to ceo for approval.");
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC012() throws Exception
    {
    	SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Uploadfile.click();
    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC013() throws Exception
    {
    	SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);
		waitForPageLoad(Driver, SL.Uploadfile);
		FileUploader FU=new FileUploader();
		FU.Fileupload("C:\\Users\\joydip.bhattacharjee\\Desktop\\Fileupload.jpg", SL.Uploadfile);
		
    }
    @Test//(enabled=false)
    public void NRDA_LotteryManagement_SC005_TC014() throws Exception
    {	
    	SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		SE_lmtDraw SL=PageFactory.initElements(Driver, SE_lmtDraw.class);		
		SL.Draw_Date();
		SL.Draw_Time();
		SL.put_Attendence("75");
		SL.click_Audience();
		SL.click_Allottee();		
		SL.Add_projecttype();
		//******************1************************//	
		SL.click_AddInternalmembers();
		SL.Select_Section();		
		SL.Select_InName();		
		SL.In_Designation("GM");		
		SL.In_MobileNo("8800801294");		
		SL.In_Email("Test@test.com");
		//*******************************************//
		//******************2************************//			
		waitForPageLoad(Driver, SL.AddInternalmembers1);
		SL.AddInternalmembers1.click();
		new WebDriverWait(Driver, 60).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(SL.AddInternalmembers1));
		waitForPageLoad(Driver, SL.AddInternalmembers1);
		SL.AddInternalmembers1.click();
		SL.Select_Section1();		
		SL.Select_InName1();
		SL.In_Designation1("GM");
		SL.In_MobileNo1("8800801294");
		SL.In_Email1("Test@test.com");
		//******************************************//
		SL.click_AddExternalmembers();
		new WebDriverWait(Driver, 20).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(SL.AddExternalmembers));		
		SL.click_AddExternalmembers();		
		SL.Ex_Organisation("Keshav Residency");		
		SL.Ex_Name("Naresh Kumar");
		SL.Ex_Designation("CEO");
		SL.Ex_MobileNo("8800801294");
		SL.Ex_Email("naresh.kumar@ex.in");
		SL.Select_Action();
		new WebDriverWait(Driver, 20).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(SL.Action));
		SL.Select_Action();		
		SL.Select_User();
		SL.click_SFile();
		SL.Enter_Subject("Lottery");
		SL.Click_SSubject();
		SL.Click_Selectfile();
		SL.Click_Fillinform();
		SL.Click_Comments("Lottery request forward to ceo for approval.");
		waitForPageLoad(Driver, SL.Uploadfile);
		SL.Uploadfile.click();
		FileUploader FU=new FileUploader();
		waitForPageLoad(Driver, SL.Uploadfile);
		FU.Fileupload("C:\\Users\\joydip.bhattacharjee\\Desktop\\Fileupload.jpg", SL.Uploadfile);

    }
    @Test(enabled=false)
    public void NRDA_LotteryManagement_SC006_TC001() throws Exception
    {
    	SE_DeptServicesPage DSP=new SE_DeptServicesPage();
		DSP.NRDA_LotteryManagement_SC002_TC002();
		Logout Sout=PageFactory.initElements(Driver, Logout.class);
		Sout.logout();		
    }
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
    
}
