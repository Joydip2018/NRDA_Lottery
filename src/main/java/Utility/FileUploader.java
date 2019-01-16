package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;

public class FileUploader 
{
	public void Fileupload(String path, WebElement WE) throws AWTException, InterruptedException{
	 	        
	 // Specify the file location with extension
	 StringSelection sel = new StringSelection(path);
	 
	 // Copy to clipboard
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	 
	 // This will click on Browse button 
	 WE.click();
	 
	 System.out.println("Browse button clicked");
	 
	 // Create object of Robot class
	 Robot robot = new Robot();
	 Thread.sleep(1000);
	      
	 // Press Enter
	 robot.keyPress(KeyEvent.VK_ENTER);
	 
	 // Release Enter
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	  // Press CTRL+V
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 
	// Release CTRL+V
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_V);
	 Thread.sleep(1000);
	        
	 // Press Enter 
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	}
	 
}
