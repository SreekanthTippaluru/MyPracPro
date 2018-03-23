package Iframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframes {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		//driver.manage().window().maximize();
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		
	}
	
	@Test
	public void frame(){
		
		
		
		//driver.findElement(By.xpath(""));
		
	}

}
