package InterfaceDemo;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Constructor extends Demostrate {
	
	

public void show()
{
	String filepath=".//Testdata//DataSheet.xlsx";
	FileInputStream inputstream=new FileInputStream(filepath);
	XSSFWorkbook xsf=new XSSFWorkbook(inputstream);
	XSSFSheet sheet=xsf.getSheet("Sheet1");

	int rows=sheet.getLastRowNum();
	int cols=sheet.getRow(1).getLastCellNum();

	for(int r=0;r<=rows;r++)
	{
	XSSFRow row=sheet.getRow(r);
	for(int c=0;c<=cols;c++)
	{
	XSSFCell cell=row.getCell(c);
	switch(cell.getCellType())
	{
	case STRING: System.out.print(cell.getStringCellValue());break;
	case NUMERIC: System.out.print(cell.getNumericCellValue());break;
	case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
	}
	System.out.println(" | ");
	}
	System.out.println();

	
	
	
	public Constructor(int a,int b)
	{
		//a=10;
		this("Tina");
		System.out.println("This is a constructor:"+(a+b));
	}
	public Constructor(String s)
	{
		super();
		System.out.println("This is String:"+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c=new Constructor(20,10);
		//Constructor c1=new Constructor("Mina");
	}

}
