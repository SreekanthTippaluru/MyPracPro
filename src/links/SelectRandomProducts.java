package links;

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

public class SelectRandomProducts {

	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void selectRandomProducts(){
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("showes for men");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement boxArea = driver.findElement(By.xpath("//div[@id='atfResults']"));
		
		List<WebElement> list = boxArea.findElements(By.tagName("a"));
		int totalList = list.size();
		
		System.out.println("Total displayed List: "+totalList);
		
		for (int i = 0; i < totalList; i++) {
		
			Random rd = new Random();
			
			list.get(rd.nextInt(10)).click();
			String title = driver.getTitle();
			System.out.println("the title of the link: "+title);
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("showes for men");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			WebElement boxArea1 = driver.findElement(By.xpath("//div[@id='atfResults']"));
			list = boxArea1.findElements(By.tagName("a"));
			
		}
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
