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

public class tableRadiff<L> {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//launch the site
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa"); 
		
		
	}
	
	@Test
	public void myTable(){
		
		//get column count
		List<WebElement> columCount = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		int totalColums = columCount.size();
		System.out.println("Total Columns : "+totalColums);
		
		//get row count
		List<WebElement> rowsCount = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
		int totalRows = rowsCount.size();
		System.out.println("Total Columns : "+totalRows);
		
		int columIndex = 0;
		for (int i = 0; i < totalColums; i++) {
			String ColumValue = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th["+i+"]")).getText();
			if (ColumValue.equals("Company")) {
				
				columIndex = i;
				break;
				
			}
		}
		
		int ColumIndex1 = 0;
		for (int i = 0; i < totalColums; i++) {
			
			String ColumValue = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th["+i+"]")).getText();
			if (ColumValue.equals("% Change")) {
				
				ColumIndex1 = i;
				break;
				}
			}
		
		
		int rowIndex = 0;
		for (int j = 0; j < totalRows; j++) {
			String rowValue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+j+"]/td["+columIndex+"]")).getText();
			if (rowValue.equals("City Union Bank")) {
				
				rowIndex = j;
				break;
				}
			}
		
		String CellValue = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/td["+columIndex+"]../../following-sibling::tbody/tr["+columIndex+"]")).getText();
		System.out.println("Cell Value :"+CellValue);
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
		
	}

}
