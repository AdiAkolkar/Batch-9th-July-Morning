package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("H:\\SOFTWARE TESTING\\AUTOMATION TESTING\\SELENIUM\\Upstox Login Credentials.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		int lastRowNum = mySheet.getLastRowNum();
		
		System.out.println("Last row num is "+lastRowNum);
		
		int totalRow = lastRowNum+1;
		System.out.println("Total number of rows are "+totalRow);
	}

}
