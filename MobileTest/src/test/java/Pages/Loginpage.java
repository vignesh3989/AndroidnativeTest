package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Baseclass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


	

public class Loginpage extends Baseclass  {
	
	public Loginpage(AndroidDriver<AndroidElement> driver)
	{
		this.driver = driver;
	}
	
	public Loginpage Clicklogin()
	{
		Clickbyxpath("//button[@data-test-name='header-login-button']");
		return this;
	}
	
	
	public Loginpage enterusername(String username) throws InterruptedException
	{
		
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Allow all cookies')]"));
		if(ele.isDisplayed())
		{
			ele.click();
			Thread.sleep(2000);	
		    Enterbyxpath("//div[@id='kafLoginModal']/div/div/form/div/div/input[1]",username);
		}
		
		else if (!ele.isDisplayed())
		{	
			Thread.sleep(2000);	
		    Enterbyxpath("//div[@id='kafLoginModal']/div/div/form/div/div/input[1]",username);
		
		}
		return this;
	}
	
	public Loginpage enterpassword(String password)
	{
		Enterbyxpath("(//div[@id='kafLoginModal']/div/div/form/div/div/input[1])[2]",password);
		return this;
	}
	
	public Loginpage Loginbutton()
	{
		Clickbyxpath("(//div[@id='kafLoginModal']/div/div/form/div/div)[3]/button");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-dn='Heading']")));
		return this;
	}
	
	public Loginpage Clickmenu()
	{
		Clickbyxpath("//i[@class='icon-wrapper icon-suffix account-menu right-opener']");
		return this;
	}
	
	public Loginpage Clicklogout()
	{
		
		Pagescroll("(//span[contains(text(),'Log Out')])[1]","Log Out");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Log Out')])[1]")));
		Clickbyxpath("(//span[contains(text(),'Log Out')])[1]");
		return this;
	}
	
	
	
}
