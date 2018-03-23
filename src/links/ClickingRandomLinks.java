package links;

import java.sql.Driver;
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

public class ClickingRandomLinks {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void init(){
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.bbc.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void getRandomLink(){
		
		WebElement boxArea = driver.findElement(By.xpath("//div[@id='page']/section[6]/div/div/div[2]"));
		
		List<WebElement> list = boxArea.findElements(By.tagName("a"));
		int totalLinks = list.size();
		System.out.println("the total links in boxarea "+totalLinks);
		
		for (int i = 0; i < totalLinks; i++) {
			
			Random rd = new Random();
			//rd.nextInt(bound)
			list.get(rd.nextInt(totalLinks)).click();
			String title = driver.getTitle();
			System.out.println("Print all Titles: "+title);
			driver.get("http://www.bbc.com/");
			WebElement boxArea1 = driver.findElement(By.xpath("//div[@id='page']/section[6]/div/div/div[2]"));
			list = boxArea1.findElements(By.tagName("a"));
			
		}
		
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}
