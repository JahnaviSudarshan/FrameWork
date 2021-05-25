package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements FrameWorkConstants {

	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	/*@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE == res.getStatus())
		{
			Generic_ScreenShot.getPhoto(driver);
		}
		driver.quit();
	}*/
}
