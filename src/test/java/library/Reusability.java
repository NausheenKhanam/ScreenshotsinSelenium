package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusability {

	public  static void capturedScreenShot(WebDriver driver, String screenShotName)
	{
		//Can't create instance for interface.We can Typecost
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		 //Where you want to take screenshot
		FileUtils.copyFile(source, new File ("./Screenshots/" + screenShotName + ".png"));
	    System.out.println("Captured Screenshot by selenium webdriver");
		}
		catch (Exception e)
		{
			System.out.println("Exception while taking screen shot"+ e.getMessage());
		}
	    
	
	
	}
	
	
}
	
