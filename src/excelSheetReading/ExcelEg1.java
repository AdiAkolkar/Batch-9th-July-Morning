package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws IOException 
	{
		File myFile=new File("H:\\SOFTWARE TESTING\\AUTOMATION TESTING\\SELENIUM\\Test Cases For mail sending and irctc ticket booking.xlsx");
		
		//FileInputStream myExcel=new FileInputStream(myFile);
		
		String scenario = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(scenario);
		System.out.println("===========================================================");
		
		double srNo = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(srNo);
		System.out.println("===========================================================");
		
		String testCaseID = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(testCaseID);
		System.out.println("===========================================================");
		
		boolean value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
		System.out.println(value);
		System.out.println("===========================================================");

	}

}
