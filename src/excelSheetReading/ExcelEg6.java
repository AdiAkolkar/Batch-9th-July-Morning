package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("H:\\SOFTWARE TESTING\\AUTOMATION TESTING\\SELENIUM\\Upstox Login Credentials.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		Cell myCell = mySheet.getRow(1).getCell(1);
		CellType dataType = myCell.getCellType();
		
		if(dataType==CellType.STRING)
		{
			System.out.println(myCell.getStringCellValue());
		}
		
		else if(dataType==CellType.NUMERIC)
		{
			System.out.println(myCell.getNumericCellValue());
		}
		
		else if(dataType==CellType.BOOLEAN)
		{
			System.out.println(myCell.getBooleanCellValue());
		}
	}

}
