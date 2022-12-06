package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg7 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("H:\\SOFTWARE TESTING\\AUTOMATION TESTING\\SELENIUM\\Upstox Login Credentials.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=3;j++)
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType myCellType = myCell.getCellType();
				
				if(myCellType==CellType.STRING)
				{
					System.out.print(myCell.getStringCellValue()+" ");
				}
				
				else if (myCellType==CellType.NUMERIC)
				{
					System.out.print(myCell.getNumericCellValue()+" ");
				}
				
				else if (myCellType==CellType.BOOLEAN) 
				{
					System.out.print(myCell.getBooleanCellValue()+" ");
				}
				
			}
			
			System.out.println();
		
		}
	

	}

}
