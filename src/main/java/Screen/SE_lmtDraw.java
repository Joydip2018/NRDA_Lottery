package Screen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Config.SuperBaseClass;

public class SE_lmtDraw extends SuperBaseClass 
{
	WebDriver Driver;
	/*****************************************************************/
	/*
	* This bellow constructor helps to call the Driver from Base Class.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	public SE_lmtDraw(WebDriver driver)
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
	* These are the list of the WebElement for Application Form Screen.
	* @author Joydip.Bhattacharjee
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//input[@id='inboxForm:j_id434063699_42dd684_input']")
	@CacheLookup
	WebElement DrawDate;
	
	By Calendar_date=By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td");
	
	@FindBy(xpath="//input[@id='inboxForm:j_id434063699_42dd747_input']")
	@CacheLookup
	WebElement DrawTime;

	By Time=By.xpath("//td[@class='ui-timepicker-hours']//tbody//tr//td");
	
	@FindBy(xpath="//div[@class='ui-timepicker-buttonpane ui-widget-content']"
			+ "//button[@type='button'][contains(text(),'Done')]")
	@CacheLookup
	WebElement Done;
	
	@FindBy(xpath="//label[contains(text(),'Attendence')]//following-sibling::input")
	@CacheLookup
	WebElement Attendence;
	
	@FindBy(xpath="//table[@id='inboxForm:j_id434063699_42dd7f9']"
			+ "//div[@class='ui-radiobutton-box ui-widget "
			+ "ui-corner-all ui-state-default']")
	@CacheLookup
	WebElement Audience;
	
	@FindBy(xpath="//tr//td//span[@id='inboxForm:j_id434063699_42dd78d']"
			+ "//table[@id='inboxForm:j_id434063699_42dd7a2']//tr//td[1]")
	@CacheLookup
	WebElement Allottee;
		
	@FindBy(xpath="//Label[contains(text(),'Select')]"
			+ "[@class='ui-selectcheckboxmenu-label ui-corner-all']")
	@CacheLookup
	WebElement projecttype;
	
	@FindBy(xpath="//div[@class='ui-selectcheckboxmenu-filter-container']"
			+ "//input[@type='text']")
	@CacheLookup
	WebElement Secach;
	
	By projecttypeList=By.xpath("//ul[@class='ui-selectcheckboxmenu-items "
			+ "ui-selectcheckboxmenu-list ui-widget-content ui-widget "
			+ "ui-corner-all ui-helper-reset']//li");
	
	@FindBy(xpath="//span[contains(text(),'Add')]")
	@CacheLookup
	WebElement Add;
	
	/*********************************1*************************************/
	@FindBy(xpath="//button[@id='inboxForm:memdataTableId:j_id1479199496_7ae56df5']")
	@CacheLookup
	public WebElement AddInternalmembers;

	@FindBy(xpath="//tr[@class='ui-widget-content ui-datatable-even']"
			+ "//td[1]//div[3]")
	@CacheLookup
	WebElement Section;
	
	By Sectionlist=By.xpath("//div[@id='inboxForm:memdataTableId:0:j_id1479199496_"
			+ "7ae56fe4_panel']//ul[@class='ui-selectonemenu-items "
			+ "ui-selectonemenu-list ui-widget-content ui-widget "
			+ "ui-corner-all ui-helper-reset']//li");
	
	@FindBy(xpath="//tr[@class='ui-widget-content ui-datatable-even']"
			+ "//td[2]//div[3]")
	@CacheLookup
	WebElement InName;
	
	By InNameList=By.xpath("//div[@id='inboxForm:memdataTableId:0:j_"
			+ "id1479199496_7ae56e5c_panel']//div[@class='ui-"
			+ "selectonemenu-items-wrapper']//li");
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableId:0:j_id1479199496_7ae56ecd']")
	@CacheLookup
	WebElement InDesignation;
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableId:0:j_id1479199496_7ae56eac']")
	@CacheLookup
	WebElement InMobileNo;
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableId:0:j_id1479199496_7ae56d77']")
	@CacheLookup
	WebElement InEmail;
	/**********************************************************************/
	/*********************************2*************************************/	
	@FindBy(xpath="//button[@id='inboxForm:memdataTableId:j_id1479199496_7ae56df5']")
	@CacheLookup
	public WebElement AddInternalmembers1;
	
	@FindBy(xpath="//tr[@class='ui-widget-content ui-datatable-odd']"
			+ "//td[1]//div[3]")
	@CacheLookup
	WebElement Section1;
	
	By Sectionlist1=By.xpath("//div[@id='inboxForm:memdataTableId:1:j_id1479199496_"
			+ "7ae56fe4_panel']//ul[@class='ui-selectonemenu-items "
			+ "ui-selectonemenu-list ui-widget-content ui-widget "
			+ "ui-corner-all ui-helper-reset']//li");
	
	@FindBy(xpath="//tr[@class='ui-widget-content ui-datatable-odd']"
			+ "//td[2]//div[3]")
	@CacheLookup
	WebElement InName1;
	
	By InNameList1=By.xpath("//div[@id='inboxForm:memdataTableId:1:j_"
			+ "id1479199496_7ae56e5c_panel']//div[@class='ui-"
			+ "selectonemenu-items-wrapper']//li");
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableId:1:j_id1479199496_7ae56ecd']")
	@CacheLookup
	WebElement InDesignation1;
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableId:1:j_id1479199496_7ae56eac']")
	@CacheLookup
	WebElement InMobileNo1;
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableId:1:j_id1479199496_7ae56d77']")
	@CacheLookup
	WebElement InEmail1;
	/**********************************************************************/
	@FindBy(xpath="//button[@id='inboxForm:memdataTableIdex:j_id1479199496_7ae56bd0']")
	@CacheLookup
	public WebElement AddExternalmembers;
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableIdex:0:j_id1479199496_7ae56c54']")
	@CacheLookup
	WebElement ExOrganisation;
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableIdex:0:j_id1479199496_7ae56c11']")
	@CacheLookup
	WebElement ExName;
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableIdex:0:j_id1479199496_7ae56cd2']")
	@CacheLookup
	WebElement ExDesignation;
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableIdex:0:j_id1479199496_7ae56c97']")
	@CacheLookup
	WebElement ExMobileNo;
	
	@FindBy(xpath="//input[@id='inboxForm:memdataTableIdex:0:j_id1479199496_7ae56b58']")
	@CacheLookup
	WebElement ExEmail;
	
	@FindBy(xpath="//tr[@class='ui-widget-content']"
			+ "//td[1]//div[3]")
	@CacheLookup
	public WebElement Action;
	
	By Actionlist=By.xpath("//div[@id='inboxForm:j_id434063699_42dd4ab_panel']"
			+ "//ul[@class='ui-selectonemenu-items ui-selectonemenu-list "
			+ "ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li");

	@FindBy(xpath="//tr[@class='ui-widget-content']"
			+ "//td[3]//div[3]")
	@CacheLookup
	WebElement User;
	
	By Userlist=By.xpath("//div[@id='inboxForm:j_id434063699_42dd52d_panel']"
			+ "//ul[@class='ui-selectonemenu-items ui-selectonemenu-list "
			+ "ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li");
	
	@FindBy(xpath="//input[@id='inboxForm:j_id434063699_42dd59b']")
	@CacheLookup
	WebElement RSubject;
	
	@FindBy(xpath="//input[@id='inboxForm:j_id434063699_42dd249']")
	@CacheLookup
	WebElement RFilenumber;
	
	@FindBy(xpath="//button[@id='inboxForm:j_id434063699_42dd26e']")
	@CacheLookup
	WebElement SFile;
	
	@FindBy(xpath="//table[@id='inboxForm:j_id458341637_5b0ef621']"
			+ "//tr//td[3]//input")
	@CacheLookup
	WebElement Subject;
	
	@FindBy(xpath="//button[@id='inboxForm:j_id458341637_5b0ef6af']")
	@CacheLookup
	WebElement SSubject;
	
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']//table[@role='grid']//tr[1]//td[1]//input")
	@CacheLookup
	WebElement CheckRedio;	
	
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']//table[@role='grid']"
			+ "//tr[1]//td[1]//div[1]//div[2]")
	@CacheLookup
	WebElement Selectfile;	
	
	@FindBy(xpath="//button[@id='inboxForm:j_id434063699_42dd3bd']")
	@CacheLookup
	WebElement Fillinform;
	
	@FindBy(xpath="//textarea[@id='inboxForm:todolist']")
	@CacheLookup
	WebElement Commentvalue;
	
	@FindBy(xpath="//textarea[@id='inboxForm:todolist']")
	@CacheLookup
	WebElement Comments;
	
	@FindBy(xpath="//div[@id='inboxForm:msg_container']")
	@CacheLookup
	WebElement Msg;
	
	@FindBy(xpath="//label[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left fileinput-button']")
	@CacheLookup
	public WebElement Uploadfile;
	
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
	
	public void Draw_Date() throws Exception
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd");
		String a=dateOnly.format(cal.getTime());
		a=a.replaceFirst("0","");
		
		waitForPageLoad(Driver,DrawDate);
		DrawDate.click();
		Thread.sleep(2000);
		List<WebElement> Daylist= Driver.findElements(Calendar_date);
		int Count= Daylist.size();
		for (int j=0; j<Count; j++)
		{
			String Date= Daylist.get(j).getText();
			if(Date.equalsIgnoreCase(a))
			{
				Daylist.get(j).click();
				break;				
			}
		}
		
	}
	public void Draw_Time() throws Exception
	{
		waitForPageLoad(Driver,DrawTime);
		DrawTime.click();
		Thread.sleep(2000);
		List<WebElement> Timelist= Driver.findElements(Time);
		int Count= Timelist.size();
		for (int j=0; j<Count; j++)
		{
			String time= Timelist.get(j).getText();
			if(time.equalsIgnoreCase("11"))
			{
				Timelist.get(j).click();
				break;				
			}
		}
		Done.click();	
	}
	public void put_Attendence(String Att)
	{
		waitForPageLoad(Driver,Attendence);
		Attendence.sendKeys(Att);
	}
	public void click_Audience()
	{
		waitForPageLoad(Driver,Audience);
		Audience.click();
	}
	public void click_Allottee() throws Exception
	{
		waitForPageLoad(Driver,Allottee);
		Allottee.click();
	}
	public void project_type() throws Exception
	{
		waitForPageLoad(Driver,projecttype);
		projecttype.click();
	}
	public void Search_project() throws Exception
	{
		waitForPageLoad(Driver,projecttype);
		projecttype.click();
		waitForPageLoad(Driver,Secach);
		Secach.sendKeys("Residential plot");
	}
	public void Select_projecttype() throws Exception
	{
		waitForPageLoad(Driver,projecttype);
		projecttype.click();
		waitForPageLoad(Driver,Secach);
		Secach.sendKeys("Residential plot");
		Thread.sleep(2000);
		List<WebElement> Plist= Driver.findElements(projecttypeList);
		int Count= Plist.size();
		for(int i=0; i<Count; i++)
		{
			String getlist=Plist.get(i).getText();
			if(getlist.equalsIgnoreCase("Residential plot"))
			{
				Plist.get(i).click();
				break;
			}
		}		
	}
	public void Add_projecttype() throws Exception
	{
		waitForPageLoad(Driver,projecttype);
		projecttype.click();
		waitForPageLoad(Driver,Secach);
		Secach.sendKeys("Residential plot");
		Thread.sleep(2000);
		List<WebElement> Plist= Driver.findElements(projecttypeList);
		int Count= Plist.size();
		for(int i=0; i<Count; i++)
		{
			String getlist=Plist.get(i).getText();
			if(getlist.equalsIgnoreCase("Residential plot"))
			{
				Plist.get(i).click();
				break;
			}
		}
		Add.click();		
	}
	public void click_AddInternalmembers()
	{
		waitForPageLoad(Driver, AddInternalmembers);
		AddInternalmembers.click();
	}
	/****************************1
	 * @throws Exception ***********************************/
	public void Select_Section() throws Exception
	{
		waitForPageLoad(Driver, Section);
		Section.click();
		Thread.sleep(2000);
		List<WebElement> Slist= Driver.findElements(Sectionlist);
		int Count= Slist.size();
		for(int i=0; i<Count; i++)
		{
			String getlist=Slist.get(i).getText();
			if(getlist.equalsIgnoreCase("Administrative Section"))
			{
				Slist.get(i).click();
				break;
			}
		}
	}
	public void Select_InName() throws Exception
	{
		waitForPageLoad(Driver, InName);
		InName.click();
		Thread.sleep(2000);
		List<WebElement> Nlist= Driver.findElements(InNameList);
		int Count= Nlist.size();
		for(int i=0; i<Count; i++)
		{
			String getlist=Nlist.get(i).getText();
			if(getlist.equalsIgnoreCase("V.R. Meshram"))
			{
				Nlist.get(i).click();
				break;
			}
		}	
	}
	public void In_Designation(String InDesig)
	{
		waitForPageLoad(Driver, InDesignation);
		InDesignation.sendKeys(InDesig);
		InMobileNo.click();
	}
	public void In_MobileNo(String InMNo)
	{
		waitForPageLoad(Driver, InMobileNo);
		InMobileNo.clear();
		InMobileNo.sendKeys(InMNo);
		InEmail.click();
	}
	public void In_Email(String Inmail)
	{
		waitForPageLoad(Driver, InEmail);
		InEmail.clear();
		InEmail.sendKeys(Inmail);
	}
	/***************************************************************/
	/****************************2***********************************/
	public void Select_Section1() throws Exception
	{
		waitForPageLoad(Driver, Section1);
		Section1.click();
		Thread.sleep(2000);
		List<WebElement> Slist= Driver.findElements(Sectionlist1);
		int Count= Slist.size();
		for(int i=0; i<Count; i++)
		{
			String getlist=Slist.get(i).getText();
			if(getlist.equalsIgnoreCase("Administrative Section"))
			{
				Slist.get(i).click();
				break;
			}
		}
	}
	public void Select_InName1() throws InterruptedException
	{
		waitForPageLoad(Driver, InName1);
		InName1.click();
		Thread.sleep(2000);
		List<WebElement> Nlist= Driver.findElements(InNameList1);
		int Count= Nlist.size();
		for(int i=0; i<Count; i++)
		{
			String getlist=Nlist.get(i).getText();
			if(getlist.equalsIgnoreCase("Rajat Kumar"))
			{
				Nlist.get(i).click();
				break;
			}
		}	
	}
	public void In_Designation1(String InDesig)
	{
		waitForPageLoad(Driver, InDesignation1);
		InDesignation1.sendKeys(InDesig);
		InMobileNo1.click();
	}
	public void In_MobileNo1(String InMNo)
	{
		waitForPageLoad(Driver, InMobileNo1);
		InMobileNo1.clear();
		InMobileNo1.sendKeys(InMNo);
		InEmail1.click();
	}
	public void In_Email1(String Inmail)
	{
		waitForPageLoad(Driver, InEmail1);
		InEmail1.clear();
		InEmail1.sendKeys(Inmail);
	}
	/***************************************************************/
	public void click_AddExternalmembers()
	{
		waitForPageLoad(Driver, AddExternalmembers);
		AddExternalmembers.click();
	}
	public void Ex_Organisation(String ExOrg)
	{
		waitForPageLoad(Driver, ExOrganisation);
		ExOrganisation.sendKeys(ExOrg);
		ExName.click();
	}
	public void Ex_Name(String EName)
	{
		waitForPageLoad(Driver, ExName);
		ExName.sendKeys(EName);
		ExDesignation.click();
	}
	public void Ex_Designation(String ExDesig)
	{
		waitForPageLoad(Driver, ExDesignation);
		ExDesignation.sendKeys(ExDesig);
		ExMobileNo.click();
	}
	public void Ex_MobileNo(String ExMNo)
	{
		waitForPageLoad(Driver, ExMobileNo);
		ExMobileNo.sendKeys(ExMNo);
		ExEmail.click();
	}
	public void Ex_Email(String Exmail)
	{
		waitForPageLoad(Driver, ExEmail);
		ExEmail.sendKeys(Exmail);
	}
	public void Select_Action() throws Exception
	{
		waitForPageLoad(Driver, Action);
		Action.click();
		Thread.sleep(2000);
		List<WebElement> Alist= Driver.findElements(Actionlist);
		int Count= Alist.size();
		for(int i=0; i<Count; i++)
		{
			String getlist=Alist.get(i).getText();
			if(getlist.equalsIgnoreCase("FORWARD"))
			{
				Alist.get(i).click();
				break;
			}
		}
	}
	public void Select_User() throws Exception
	{
		waitForPageLoad(Driver, User);
		User.click();
		Thread.sleep(2000);
		List<WebElement> Alist= Driver.findElements(Userlist);
		int Count= Alist.size();
		for(int i=0; i<Count; i++)
		{
			String getlist=Alist.get(i).getText();
			if(getlist.equalsIgnoreCase("Rajat Kumar"))
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
	public void click_SFile()
	{
		waitForPageLoad(Driver, SFile);
		SFile.click();
	}
	public void Enter_Subject(String Sub)
	{
		waitForPageLoad(Driver, Subject);
		Subject.sendKeys(Sub);
	}
	public void Click_SSubject()
	{
		waitForPageLoad(Driver, SSubject);
		SSubject.click();
	}
	public boolean CheckRedio()
	{
		return CheckRedio.isEnabled();
	}
	public void Click_Selectfile()
	{
		waitForPageLoad(Driver, Selectfile);
		Selectfile.click();
	}
	public void Click_Fillinform()
	{
		waitForPageLoad(Driver, Fillinform);
		Fillinform.click();
	}	
	public String Comment_value()
	{
		return Commentvalue.getText();
	}
	public void Click_Comments(String comm)
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
	/*************************************************************/
	/*
	*  End
	*/
	/*************************************************************/
}
