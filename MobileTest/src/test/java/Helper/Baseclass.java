package Helper;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Baseclass {
	
	public AndroidDriver<AndroidElement> driver;
	
	
	public void Enterbyid(String idvalue,String data)
	{
		driver.findElement(By.id(idvalue)).clear();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idvalue)));
		driver.findElement(By.id(idvalue)).sendKeys(data);
	}
	
	public void Enterbyclassname(String idvalue,String data)
	{
		driver.findElement(By.className(idvalue)).clear();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(idvalue)));
		driver.findElement(By.className(idvalue)).sendKeys(data);
	}
	
	public void Enterbyname(String idvalue,String data)
	{
		driver.findElement(By.name(idvalue)).clear();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(idvalue)));
		driver.findElement(By.name(idvalue)).sendKeys(data);
	}
	
	public void Enterbyxpath(String idvalue,String data)
	{
		driver.findElement(By.xpath(idvalue)).clear();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(idvalue)));
		driver.findElement(By.xpath(idvalue)).sendKeys(data);
	}
	
	
	public void Clickbyid(String idvalue)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idvalue)));
		driver.findElement(By.id(idvalue)).click();
	}
	
	public void Clickbyname(String idvalue)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idvalue)));
		driver.findElement(By.name(idvalue)).click();
	}
	
	public void Clickbyxpath(String xpathvalue)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathvalue)));
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	
	public void Clicklink(String name)
	{
		driver.findElement(By.linkText(name)).click();
	}
	
	public void Pagescroll(String xpathvalue,String expectedoutput)
	{
		String element = driver.findElement(By.xpath(xpathvalue)).getText();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Assert.assertEquals(element, expectedoutput);
	}
	
	
	

}
