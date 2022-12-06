package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("H:\\SOFTWARE TESTING\\AUTOMATION TESTING\\SELENIUM\\Upstox Login Credentials.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet1");
		
		Row myRow = mySheet.getRow(1);
		
		Cell myCell = myRow.getCell(3);
		
		CellType myCellType = myCell.getCellType();
		
		System.out.println(myCellType);
		
		String value = myCell.getStringCellValue();
		
		System.out.println(value);
	}

}
