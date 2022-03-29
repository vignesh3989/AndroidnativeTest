package Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Helper.Hooks;
import Pages.DepositLimit;
import Pages.Homepage;
import Pages.Loginpage;

public class Setdepositlimit extends Hooks {
	
	
	@BeforeClass
	public void setValues()
	{
		dataSheetName = "Test_data";
		sheetname="Depositlimit";
	}
	
	@Test (dataProvider="getSheet")
	public void setdepositlimit(String username,String password,String money) throws InterruptedException 
	{
		new Homepage(driver)
		.login_click();
		new Loginpage(driver)
		.Clicklogin()
		.enterusername(username)
		.enterpassword(password)
		.Loginbutton();
	    String element = driver.findElement(By.xpath("//div[@data-dn='Heading']")).getText();
	    Assert.assertEquals(element,"Verification needed");
	    new Loginpage(driver)
	    .Clickmenu();
	    new DepositLimit(driver)
	    .Chooseoptions()
	    .Clickdepositmoney()
	    .Setupdepositlimit()
	    .Enteramount(money)
	    .Setlimit(30)
	    .Clicksetlimit();
		
		
	}

}
