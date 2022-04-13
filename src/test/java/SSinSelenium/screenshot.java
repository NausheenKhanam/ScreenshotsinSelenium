package SSinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshot {
	
	WebDriver driver;
	
	@Test
	public void ScreenshotsDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\ScreenshotsinSelenium\\BrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easycalculation.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword123")).sendKeys("admin123");

}
	
	
}
