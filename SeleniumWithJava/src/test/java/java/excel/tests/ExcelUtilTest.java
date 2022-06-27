package java.excel.tests;

import com.excel.lib.util.Xls_Reader;

public class ExcelUtilTest {
	
	public static void main(String[] args) {
		String SheetName="login";
		Xls_Reader reader=new Xls_Reader ("./src/main/java/com/excel/lib/util/SampleExcelData.xlsx");
		
		int columnCount=reader.getColumnCount(SheetName);
		System.out.println("columnCount--"+columnCount);
		
		String CellData12=reader.getCellData(SheetName, 1, 2);
		System.out.println("Cell data 12--"+CellData12);
		
		String CellData01=reader.getCellData(SheetName, 0, 1);
		System.out.println("Cell data 01--"+CellData01);
		
		int rowCount=reader.getRowCount(SheetName);
		System.out.println("rowCount--"+rowCount);
		
		reader.addColumn(SheetName, "status");
		reader.addSheet("New Login");
	}
}
