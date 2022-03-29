package Pages;

import Helper.Baseclass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DepositLimit extends Baseclass {
	
	public DepositLimit(AndroidDriver<AndroidElement> driver)
	{
		this.driver = driver;
	}
	
	public DepositLimit Chooseoptions()
	{
		Clickbyxpath("//span[contains(text(),'Bank')]");
		return this;
	}
	
	
	public DepositLimit Clickdepositmoney()
	{
		Clickbyxpath("(//ul[@class='accordion-details']/li[1]/a/span)[1]");
		return this;
	}
	
	public DepositLimit Setupdepositlimit() throws InterruptedException
	{
		Clickbyxpath("//a[contains(text(),'Set a deposit limit')]");
		Thread.sleep(3000);
		Pagescroll("//*[@data-test-name='heading-add-new-limit']","Please set your deposit limit(s)");
		return this;
	}
	
	public DepositLimit Enteramount(String money)
	{
		Enterbyxpath("//input[@data-dn='CurrencyInput']",money);
		return this;
	}
	
	public DepositLimit Setlimit(int number)
	{
		Clickbyxpath("//button[contains(text(),"+number+")]");
		return this;
	}
	
	public DepositLimit Clicksetlimit()
	{
		Clickbyxpath("//button[@data-test-name='add-limit-button']");
		return this;
	}
	

}
