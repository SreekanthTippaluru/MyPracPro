package dataDrivenTest;

import java.util.ArrayList;

public class DataProviderUtill {
	
	static Xls_Reader1 reader;
	
	public static ArrayList<Object[]> getDatafromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			
			reader = new Xls_Reader1("C:/Users/Sreekanth/workspace/TestRepo/testdata/eBay test data.xlsx");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			
			String firstname = reader.getCellData("Sheet1", "firstname", rowNum);
			String lastname = reader.getCellData("Sheet1", "lastname", rowNum);
			String email = reader.getCellData("Sheet1", "email", rowNum);
			String password = reader.getCellData("Sheet1", "password", rowNum);
			
			Object[] obj = {firstname, lastname, email, password};
			myData.add(obj);
			
		}
		
		return myData;
		
	}

}
