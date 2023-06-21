package Selenium.webdriver.basictests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelSheet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//WebDriver driver=new ChromeDriver();
	   
		//1st way to read data
		String excelFilePath=".\\datafiles\\TestData.xlsx";//to get the file path
		FileInputStream inputstream=new FileInputStream(excelFilePath);//open the file in stream mode
		
		XSSFWorkbook xsf=new XSSFWorkbook(inputstream);//inputstream---constructor//to get the woorkbook of file
		
		XSSFSheet sheet=xsf.getSheet("Sheet1");//XSSFSheet sheet=workbook.getSheetAt(0);//to get the sheet
		
		///using for loop
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.getCell(c);
			switch(cell.getCellType())
			{
			case STRING: System.out.print(cell.getStringCellValue());break;
			case NUMERIC: System.out.print(cell.getNumericCellValue());break;
			case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
			}
			System.out.print(" | ");
			}
			
			System.out.println();
		}
		
		
		
		
		

	}

}
