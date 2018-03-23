package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MyGridTable {
	
	@Test
	public void test() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/mutual-funds/liquid");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		TableUtil obj = new TableUtil();
		String actualValue = obj.getCellValue(driver, "Plan", "Company", "HDFC Asset Management Company Ltd.");
		Assert.assertTrue(actualValue.equals("8.84"),"value wrong");
		
//		int columnIndex = 0;
//		//find number of columns
//		List<WebElement> eleList = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th"));
//		int totalCol = eleList.size();
//		
//		for(int i=1;i<=totalCol;i++){
//			String columnValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+i+"]")).getText();
//			if(columnValue.equals("Returns(%)")){
//				columnIndex=i;
//				break;
//			}
//		}
//		
//		//get company column index at runtime
//		int columnIndex1 = 0;
//		for(int i=1;i<=totalCol;i++){
//			String columnValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+i+"]")).getText();
//			if(columnValue.equals("Company")){
//				columnIndex1=i;
//				break;
//			}
//		}
//		
//		int rowIndex = 0;
//		//find row number
//		List<WebElement> rowEle = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td"));
//		int totalRows = rowEle.size();
//		for(int j=1;j<=totalRows;j++){
//			String rowValue = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+j+"]/td["+columnIndex1+"]")).getText();
//			if(rowValue.equals("Principal Pnb Asset Management Co. Pvt. Ltd.")){
//				rowIndex=j;
//				break;
//			}
//		}
//		
//		
//		String cellValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+columnIndex+"]/../../following-sibling::tbody/tr[7]/td["+columnIndex+"]")).getText();
//		System.out.println("Value = "+cellValue);
	}

}
