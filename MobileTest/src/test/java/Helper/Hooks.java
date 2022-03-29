package Helper;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hooks extends Baseclass {	
	public String dataSheetName;
	public String sheetname;

	@BeforeTest
	public AndroidDriver<AndroidElement> Setup() throws Exception  	
	{
		DesiredCapabilities capability = new DesiredCapabilities();	
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		capability.setCapability("chromedriverExecutable","C:\\Users\\vigne\\Downloads\\chromedriver_win32\\chromedriver.exe");
		capability.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.unibet.co.uk/blog");
		return driver;	
	}
		
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	

	@DataProvider(name="getSheet")
	public Object[][] getData()
	{	
		return DataInputprovider.getSheet(dataSheetName,sheetname);		
	}	

	
	
	


}
