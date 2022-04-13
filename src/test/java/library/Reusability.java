package library;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusability {

	public  static void capturedScreenShot(WebDriver driver, String screenShotName)
	{
		//Can't create instance for interface.We can Typecost
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
	}
}
	
