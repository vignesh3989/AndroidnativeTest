package Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Helper.Hooks;
import Pages.Homepage;

public class Search extends Hooks {
	
	@BeforeClass
	public void setValues()
	{
		dataSheetName = "Test_data";
		sheetname="Search";
	}
	
	@Test (dataProvider="getSheet")
	public void Searchfeature(String searchkeyword) throws InterruptedException
	{
		new Homepage(driver)
		.Search(searchkeyword)
		.Clicksearchresults("Olympic men");
		String element = driver.findElement(By.xpath("//span[contains(text(),\""+searchkeyword+"\")]")).getText();
		Assert.assertEquals(element,"\""+searchkeyword+"\"");
	}
	

}
