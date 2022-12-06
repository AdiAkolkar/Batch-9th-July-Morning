package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("H:\\SOFTWARE TESTING\\AUTOMATION TESTING\\SELENIUM\\Upstox Login Credentials.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//Reading excel sheet in dynamic way
		int lastRow = mySheet.getLastRowNum();
		int lastCell = mySheet.getRow(lastRow).getLastCellNum()-1;
		
		//read complete excel using nested for loop
		//Outer for loop is for rows --> vary from 0 - lastRow
		
		for(int i=0;i<=lastRow;i++)
		{
			//Inner for loop is for cell --> vary form 0 - lastCell
			for(int j=0;j<=lastCell;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
		}

	}

}
