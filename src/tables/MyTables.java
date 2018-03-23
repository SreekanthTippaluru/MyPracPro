package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class MyTables {
	
	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		
		driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/mutual-funds/liquid");
		
	}
	
	
	public void mytable(){
		
		int columnIndex = 0;
		//find number of columns
		List<WebElement> eleList = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th"));
		int totalCol = eleList.size();
		
		
		for(int i=1;i<=totalCol;i++){
			String columnValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+i+"]")).getText();
			if(columnValue.equals("Returns(%)")){
				columnIndex=i;
				break;
			}
		}
		
		//get company column index at runtime
		int columnIndex1 = 0;
		for(int i=1;i<=totalCol;i++){
			String columnValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+i+"]")).getText();
			if(columnValue.equals("Company")){
				columnIndex1=i;
				break;
			}
		}
		
		int rowIndex = 0;
		//find row number
		List<WebElement> rowEle = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td"));
		int totalRows = rowEle.size();
		for(int j=1;j<=totalRows;j++){
			String rowValue = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+j+"]/td["+columnIndex1+"]")).getText();
			if(rowValue.equals("Principal Pnb Asset Management Co. Pvt. Ltd.")){
				rowIndex=j;
				break;
			}
		}
		
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator);*/
		
		String cellValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+columnIndex+"]/../../following-sibling::tbody/tr[7]/td["+columnIndex+"]")).getText();
		System.out.println("Value = "+cellValue);
		
	}

}
