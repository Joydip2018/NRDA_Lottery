package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserClass 
{
		/*****************************************************************/
		/*
		* This bellow function helps to open the Browser.
		* It's taking the url from configreaderclass.java and return the driver.
		* @author Joydip.Bhattacharjee
		*/
		/*****************************************************************/
		public static WebDriver BrowserDetails(String browser,WebDriver Driver) throws Exception
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				//create chrome instance
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				Driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				//create firefox instance
				System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
				Driver = new FirefoxDriver();
			}
			Configuration BC=new Configuration();
			String[] str=BC.Config_read();
			Driver.get(str[1]);
			Driver.manage().window().maximize();
			return Driver;
		}
		/*****************************************************************/
		/*
		* End
		*/
		/*****************************************************************/
}
