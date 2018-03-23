package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		
		driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		
	}
	
	@Test
	public void test1(){
		
		System.out.println(driver.getTitle());
		
		WebElement element = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		
		String toolTip = element.getAttribute("title");
		
		System.out.println("Tool tip is :" +toolTip);
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
		
	}
	
	
}
