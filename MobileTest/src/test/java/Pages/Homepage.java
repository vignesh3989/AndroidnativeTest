package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;

import Helper.Baseclass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class Homepage extends Baseclass  {
	
	public Homepage(AndroidDriver<AndroidElement> driver)
	{
		this.driver = driver;
	}
	
	public Registration Clickregisterbutton() throws Exception
	{
		Clickbyxpath("//span[contains(text(),'Register')]");
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowhandles);
		driver.switchTo().window(list.get(1));
		Pagescroll("(//label[contains(text(),'Gender')])[2]","Gender *");
		return new Registration(driver);
	}
	


	public Homepage Search(String search)
	{	
		driver.findElementByXPath("(//input[@name='s'])[1]").sendKeys(search,Keys.ENTER);	
		return this;
	}
	
	public Homepage Clicksearchresults(String expectedtext) throws InterruptedException
	{
	   Thread.sleep(3000);
		Pagescroll("(//span[contains(text(),'Blog Post')])[5]","Blog Post");
		Thread.sleep(3000);
		Clickbyxpath("(//span[contains(text(),'Blog Post')])[5]");
		return this;
	}
	
	public Loginpage login_click()
	{
		Clickbyxpath("//span[contains(text(),'Log in')]");
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowhandles);
		driver.switchTo().window(list.get(1));
		return new Loginpage(driver);
	}
	
	

}
