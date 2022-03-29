package Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Helper.Hooks;
import Pages.Homepage;
import Pages.Loginpage;

public class Loginlogut extends Hooks {
	
	@BeforeClass
	public void setValues()
	{
		dataSheetName = "Test_data";
		sheetname="Login";
	}
	
	@Test (dataProvider="getSheet")
	public void login(String username,String password) throws InterruptedException 
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
	    .Clickmenu()
	    .Clicklogout();
	    
	}

}
