package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("H:\\SOFTWARE TESTING\\AUTOMATION TESTING\\SELENIUM\\Upstox Login Credentials.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String value = mySheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);
		System.out.println("==================================================");
		//Reading whole row
		for(int i=0;i<=3;i++)
		{
			String value1=mySheet.getRow(1).getCell(i).getStringCellValue();
			System.out.print(value1+" ");
		}
		System.out.println();
		System.out.println("==================================================");
		//Reading whole cell/column
		for(int i=0;i<=1;i++)
		{
			String value2=mySheet.getRow(i).getCell(3).getStringCellValue();
			System.out.println(value2);
		}
		System.out.println("==================================================");
		//Reading whole excel sheet
		//outer for loop--> for reading rows-->varying 0--1
		for(int i=0;i<=1;i++)
		{
			//inner for loop --> for reading cells/columns---> varying 0---3
			for(int j=0;j<=3;j++) 
			{
			String value3=mySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value3+" ");
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
	}

}
