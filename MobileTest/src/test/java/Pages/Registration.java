package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Baseclass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Registration extends Baseclass {
	
	public Registration(AndroidDriver<AndroidElement> driver)
	{
		this.driver =driver;
	}
	

	public Registration Enterfirstname(String name)
	{
		Enterbyid("firstName",name);
		return this;
		
	}

	public Registration Enterlastname(String name)
	{
		Enterbyid("lastName",name);
		return this;
	}
	
	public Registration Enteremail(String emailaddress)
	{
		Enterbyid("email",emailaddress);
		return this;
	}
	
	
	public Registration Selectday(String day)
	{
		Clickbyxpath("//select[@name='day']");
		Select value = new Select(driver.findElementByName("day"));
		value.selectByValue(day);
		return this;
	}
	
	public Registration Selectmonth(String month)
	{
		
		Clickbyxpath("//select[@name='month']");
		Select value = new Select(driver.findElementByName("month"));
		value.selectByVisibleText(month);
		return this;
	}
	
	public Registration Selectyear(String year) 
	{
		Clickbyxpath("//select[@name='year']");
		Select value = new Select(driver.findElementByName("year"));
		value.selectByVisibleText(year);
		return this;
	}
		
	public Registration Gender(String gender)
	{
		Clickbyxpath("//span[contains(text(),'"+gender+"')]");
		return this;
	}
	
	public Registration Clickcontinue(int index)
	{
		Clickbyxpath("(//button[@name='continue-registration'])["+index+"]");
		return this;
	}
	
	public Registration Enterpostalcode(String postalcode)
	{
		Enterbyid("address-lookup",postalcode);
		Clickbyxpath("//ul[@class='typeahenu']/li[1]");
		return this;
	}
	
	public Registration Enterphonenumber(String number) throws InterruptedException
	{
		Thread.sleep(3000);
		Pagescroll("(//label[@data-test-name='country'])[2]","Country");
		Enterbyxpath("//input[@name='phoneNumber']",number);	
		return this;
	}
	
	public Registration Enterpassword(String Password) throws InterruptedException
	{
		Thread.sleep(3000);		
		Pagescroll("//label[@data-test-name='password']","Password *");
		Enterbyxpath("(//div[@class='validation-container'])[2]/div/input",Password);
		return this;
	}
	
	public Registration Accepttermsandconditions() throws InterruptedException
	{
		Thread.sleep(1000);
		Clickbyxpath("//label[@for='ufe_unique_id_1']");
		Thread.sleep(1000);
		Clickbyxpath("//span[contains(text(),'Accept')]");
		Thread.sleep(1000);
		Clickbyxpath("//span[@class='custom-checkbox']");
		return this;
	}
	
	public Registration Confirm()
	{
		Clickbyxpath("//button[@name='submit-registration']");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-dn='Heading']")));
		return this;
	}
	
	
}

		

