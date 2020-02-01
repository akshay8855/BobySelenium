package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataprovider {
	public static XSSFWorkbook workbook;
	public exceldataprovider() {
		try {
			FileInputStream fins=new FileInputStream(new File(".//TestData//testdata.xlsx"));
			workbook=new XSSFWorkbook(fins);
		}
		catch (Exception e) {
		}
		}
		
	
	
	
	public static String getStringCellData(int sheetindex,int row,int column) {
	return workbook.getSheetAt(sheetindex).getRow(row).getCell(column)
			.getStringCellValue();
	}
	
	
public String getStringCellData(String sheetname,int row,int column) {
	return workbook.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
}

public int getNumericCellData(String sheetname, int row,int column) {
	return (int)workbook.getSheet(sheetname).getRow(row).getCell(column)
			.getNumericCellValue();
}
public int getNumericCellData(int sheetIndex,int row,int column) {
	return (int)workbook.getSheetAt(sheetIndex).getRow(row)

 .getCell(column).getNumericCellValue();
		
		
	}



}
	

