package tables;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tableSainiTravels {

	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		
		driver = new FirefoxDriver();
		driver.get("https://sainitravels.com/index.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	}
	
	
	@Test
	public void mySainiTable() throws Exception{
		
		driver.findElement(By.xpath(".//*[@id='txtFromCity']")).sendKeys("Pune");
		driver.findElement(By.xpath("//a[text()='Pune']")).click();
		
		driver.findElement(By.xpath(".//*[@id='txtToCity']")).sendKeys("Ahmednagar");
		
		//driver.findElement(By.xpath("//div[@class='selectwrap fieldwrap_select selectwrap02']//input[@type='text']")).sendKeys("Ahmednagar");
		driver.findElement(By.xpath("//a[text()='Ahmednagar']")).click();
		
		driver.findElement(By.xpath(".//*[@id='txtfDate']")).sendKeys("05-03-2018");
		
		
		//driver.findElement(By.xpath(".//*[@class='ui-menu-item' and //a[contains(text(),'Pune')]]")).click();
		//driver.findElement(By.xpath(".//*[@id='ui-id-67' and //*[contains(text(),'Ahmednagar')]]")).click();
		
		
		
		
		/*driver.findElement(By.xpath("//input[@id='txtToCity']")).sendKeys("Ahmednagar");;
		driver.findElement(By.xpath("//input[@id='txtfDate']")).sendKeys("03-03-2018");
		driver.findElement(By.xpath("//button[@id='btnBusSchedule']")).click();
		
		
		//List<WebElement> result=driver.findElements(By.xpath("//span[contains(@id,'_btnSelect')]"));
		
		List<WebElement> rowList = driver.findElements(By.xpath("//span[contains(@id,'_btnSelect')]"));
		
		int rowCount = rowList.size();
		System.out.println("Row Count"+rowCount);*/
				
		
		
	}
	
	
	/*public void tearDown(){
		
		driver.quit();
		
	}*/
}
