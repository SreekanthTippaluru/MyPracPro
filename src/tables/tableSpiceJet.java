package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tableSpiceJet {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void init(){
		driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void gettabledata() throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']/div/table//div/div/ul[2]/li[6]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table//tbody/tr[2]/td[6]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
		
		
		int columnIndex = 0;
		
		//find number of columns
		List<WebElement> columnList = driver.findElements(By.xpath("//table[@id='availabilityTable0']//tbody/tr[2]/th"));
		int totalColumns = columnList.size();
		System.out.println("Total Column Count : "+totalColumns);
		
		for (int i = 0; i < totalColumns; i++) {
			
			//get spice max column 
			String ColumnValue = driver.findElement(By.xpath("//table[@id='availabilityTable0']//tbody/tr[2]/th["+i+"]")).getText();
			System.out.println("Column Value :"+ColumnValue);
			if (ColumnValue.equals("SPICEMAX")) {
				columnIndex = i;
				break;
			}
		}
		
		int columnIndex1 = 0;
		
		//find DEPART column index
		for (int i = 0; i < totalColumns; i++) {
			String ColumnValue = driver.findElement(By.xpath("//table[@id='availabilityTable0']//tbody/tr[2]/th["+i+"]")).getText();
			System.out.println("Column Value :"+ColumnValue);
			if (ColumnValue.equals("DEPART")) {
				columnIndex1 = i;
				break;
			}
		}
		
		int rowIndex = 0;
		
		//find number of rows
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='availabilityTable0']//tbody/tr"));
		int totalRows = rowList.size();
		System.out.println("Total Rows Count :"+totalRows);
		
		for (int j = 0; j < totalRows; j++) {
			String rowValue = driver.findElement(By.xpath("//table[@id='availabilityTable0']//tbody/tr["+j+"]/th["+columnIndex1+"]")).getText();
			System.out.println("Row Value :"+rowValue);
			if (rowValue.equals("SG 1216")) {
				rowIndex = j;
				break;
				
			}
		}
		
		/*String cellValue = driver.findElement(By.xpath("//table[@id='availabilityTable0']//tbody/tr[2]/th["+columnIndex+"] and tbody/tr[5]/th["+columnIndex+"]")).getText();
		System.out.println("Cell Value: "+cellValue);*/
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
	}

}
