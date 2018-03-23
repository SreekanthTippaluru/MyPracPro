package Droupdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetAllOptions {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		//System.setProperty("webdriver.chrome.driver", "/Radical Softwares/64/chromedriver1.exe");
		//System.out.println(System.getProperty("os.name"));
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	
	}
	
	@Test
	public void getOptions(){
		
		 List<WebElement> alloptions= new Select(driver.findElement(By.xpath("//Select[@id='month']"))).getOptions();
		
		for (int i = 1; i < alloptions.size(); i++) {
			
			System.out.println(alloptions.get(i).getText());
		}
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
	}

}
