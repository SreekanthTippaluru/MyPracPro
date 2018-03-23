package Droupdowns;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class DD {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		
				//set chrome property
				/*System.setProperty("webdriver.chrome.driver", "E:\\Radical Softwares\\64\\chromedriver.exe");
				WebDriver driver = new FirefoxDriver();*/
				
				driver = new FirefoxDriver();
				
				//launch the url
				driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-updated#");
				
				//maximize window
				driver.manage().window().maximize();
				
				//provide implicitywait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
	}
	
	
	public void myDD(){
		
		driver.findElement(By.xpath("//a[@class='fbbtnl']")).click();
		
		//it will return the parent window name as string
		String par_Wind = driver.getWindowHandle();
				
		//a[@class='fbbtnl']
		
		//it will return the number of window opened by webdriver and it returns the set of string
		Set<String> chld_Wind = driver.getWindowHandles();
		
		//now we will iterate using iterator
		Iterator<String> itr = chld_Wind.iterator();
		
		
		while (itr.hasNext()) {
			
			String cw = itr.next();
			
			if (!par_Wind.equals(cw))
				
				driver.switchTo().window(cw);
				driver.manage().window().maximize();
				System.out.println(driver.switchTo().window(cw).getTitle());
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sreelly@gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sowmya");
				
				driver.close();
			
		}
		
		driver.switchTo().window(par_Wind);
		System.out.println(driver.switchTo().window(par_Wind).getTitle());
		WebElement element = driver.findElement(By.xpath("//div[@class='reg-user-desc top3']"));
		
		System.out.println(element.getText());
		

	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}

}
