package Droupdowns;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class selectrandomlist {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void getRandomlist(){
		
		List<WebElement> droupDown = driver.findElements(By.xpath("//Select[@id='month']"));
		Random rd = new Random();
		
		/*int list = rd.nextInt(droupDown.size());
		System.out.println("total options in droupdown "+list);
		droupDown.get(list).click();*/
		
		for (WebElement select : droupDown) {
			
			
			
		}
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
		
	}

}
