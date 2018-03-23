package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gmailRegistration {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void registrationGmail(){
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("suree");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("vardhan");
		driver.findElement(By.xpath("//input[@id='GmailAddress']")).sendKeys("suri.2563@gmail.com");
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("suri12345");
		driver.findElement(By.xpath("//input[@id='PasswdAgain']")).sendKeys("suri12345");
		
		List<WebElement> ddMonth = driver.findElements(By.xpath("//span[@id='BirthMonth']"));
		int totalDD = ddMonth.size();
		
		
		/*List<WebElement> ddList = ddMonth.findElements(By.xpath("//span[@id='BirthMonth']"));
		int totalList = ddList.size();*/
		
		System.out.println("total List" +totalDD);
		
		for (int i = 0; i <=totalDD; i++) {
			
			//WebElement ddMonth = driver.findElement(By.xpath("//div[@role='listbox']"));
			if (ddMonth.equals("January")) {
				
				//ddMonth.click();
				
				
			}else {
				driver.close();
			}
			
		}
		
		
		
	}

}
