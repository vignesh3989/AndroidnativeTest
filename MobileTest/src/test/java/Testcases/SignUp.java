package Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Helper.Hooks;
import Pages.Homepage;
import Pages.Registration;

public class SignUp extends Hooks {
	
	@BeforeClass
	public void setValues(){
		dataSheetName = "Test_data";
		sheetname ="Register";
	}
	
	@Test (dataProvider="getSheet")
	public void Register(String fname,String lname,String emailaddress,
			String day,String month,String year,String gender,String postalcode,String phonenumber,String password) throws Exception 
	{
		new Homepage(driver)
		.Clickregisterbutton();
		new Registration(driver)
		.Enterfirstname(fname)
		.Enterlastname(lname)
		.Enteremail(emailaddress)
		.Selectday(day)
		.Selectmonth(month)
		.Selectyear(year)
		.Gender(gender)
		.Clickcontinue(1)
		.Enterpostalcode(postalcode)
		.Enterphonenumber(phonenumber)
		.Clickcontinue(2)
		.Enterpassword(password)
		.Clickcontinue(3)
		.Accepttermsandconditions()
		.Confirm();
		String element = driver.findElement(By.xpath("//div[@data-dn='Heading']")).getText();
		Assert.assertEquals(element,"Verification needed");
		
		
		
		
	}


}
