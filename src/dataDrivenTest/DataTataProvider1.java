package dataDrivenTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTataProvider1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData(){
		
		ArrayList<Object[]> testData = DataProviderUtill.getDatafromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void eBayRegdPage(String firstname, String lastname, String email, String password){
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
	}
	

}
