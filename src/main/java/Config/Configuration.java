package Config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;

public class Configuration
{
	@Test
	public String[] Config_read() throws Exception
	{
		File src =new File(".//Config_File//config.property");
		FileInputStream Cr=new FileInputStream(src);
		Properties Pro=new Properties();
		Pro.load(Cr);
		String url=Pro.getProperty("URL");
		String Browser=Pro.getProperty("Browser");
		return new String[] {Browser,url};
		
	
	}
}
