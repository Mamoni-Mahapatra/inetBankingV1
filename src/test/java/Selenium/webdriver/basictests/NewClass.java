package Selenium.webdriver.basictests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewClass {
	
	WebDriver driver;
	
	@Test
	public void show() {
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		String act=driver.getTitle();
        String exp="fddgffg";
        
        Assert.assertEquals(act, exp);
        
        
}
   @AfterMethod
	public void AfterMethod(ITestResult result)
	{
	   if(ITestResult.FAILURE==result.getStatus())
	   {
		   File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file,new File(".//user.png"));
		   
	   }
		
	}

	/*public static void main(String[] args) throws Exception {
		String s="SeleinuHKKghh";
		int upper=0;
		int lower=0;


		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(ch>=65 && ch<=90)
		{
		upper++;
		}
		else
		{
		lower++;
		}
		}
		System.out.println(upper);
		System.out.println(lower);
		/*String excelpathfile=".\\testdata\\datasheet.xlsx";
		FileInputStream inputstream=new FileInputStream(excelpathfile);
		XSSFWorkbook xsf=new XSSFWorkbook(inputstream);
		XSSFSheet sheet=xsf.getSheet("sheet1");

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
		case STRING: System.out.print(cell.getStringCellValue());
		case NUMERIC: System.out.print(cell.getNumericCellValue());
		case BOOLEAN: System.out.print(cell.getBooleanCellValue());
		}
		System.out.print(" | ");
		}
		System.out.println();
		}
		
		/*WebDriver driver=new ChromeDriver();
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(",\\.png"));
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int a=sc.nextInt();
		int num=a;

		int rev=0;

		while(num!=0)
		{
		rev=rev*10+num%10;
		num=num/10;
		}
		if(a==rev)
		{
		System.out.println("Number is Palindrome");
		}
		else
		{
		System.out.println("Number is not Plaindrome");
		}

		
	/*	int a=12345;
		//int rev=0;

		StringBuilder sr=new StringBuilder(a);
		sr.append(a);
		StringBuilder s=sr.reverse();

		System.out.println(s);
		
	/*	int a=12345;
		int rev=0;

		while(a!=0)
		{
		rev=rev*10+a%10;
		a=a/10;
		}
		System.out.println(rev);

		/*int a=1234545;
		int count=0;

		while(a!=0)
		{
		 a=a/10;
		count++;
		}
		System.out.println(count);

		
		/*String s="My name is Mamoni hh";
		int count=1;
		for(int i=0;i<s.length();i++)
		{
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
		{
		count++;
		}
		}
		System.out.println(count);
		/*String s="SeleniumGhhjFaa";
		int a=s.length()-s.replaceAll("l","").length();
		System.out.println(a);
		
	/*	String s1="stops";
		String s2="tops";

		char[] arr1=s1.toLowerCase().toCharArray();
		char[] arr2=s2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(Arrays.equals(arr1,arr2))
		{
		System.out.println("String is Anagram");
		}
		else
		{
		System.out.println("String is not Anagram");
		}
		
	/*	String s="My Name is Mamoni";
		String[] src=s.split("\\s");
		String rev="";

		for(String w:src)
		{
		StringBuilder wd=new StringBuilder(w);
		wd.reverse();
		rev=rev+wd.toString()+" ";
		}
		System.out.println(rev);
		
		/*&String s="Selenium";
		String rev="";

		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
		     rev=rev+ch;
		}
		System.out.println(rev);*/
	}
		/*Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(10,"Java");
		hm.put(12,"Selenium");
		hm.put(13,"MyClass");
		System.out.println(hm);

		hm.remove(10);
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());*/
		
	/*	ArrayList list=new ArrayList();
		list.add(10);
		list.add("Selenium");
		list.add('A');
		list.add(34.345);

		System.out.println(list);
		System.out.println(list.size());
		list.remove(2);
		list.add(2,"java");
		System.out.println(list.get(3));
		System.out.println(list);
		for(Object i:list)
		{
		System.out.println(i);
		}
		*/
		/*String s=" Selenium"; String s1="Java"; String s2="Programme";
		System.out.println(s.length());
		System.out.println(s.contains("len"));
		System.out.println(s.concat(s1).concat(s2));
		System.out.println(s.equals("Selenium"));
		System.out.println(s.equalsIgnoreCase("seleniuM"));
		System.out.println(s1.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s.replace("Selenium","My"));
		System.out.println(s.length());
		System.out.println(s.charAt(3));*/
		
		/*int[] a={10,-20,30,-40,50,-55};
		
		for(int i:a)
		{
			if(i<0)
			{
				System.out.println(i);
			}
		}
		for(int i:a)
		{
			if(i>0)
			{
				System.out.println(i);
		}
		}*/
		
	/*	String[] s={"Java","Selenium","Name","GHHJJ"};
		String s1="Java";
		boolean flag=false;

		for(String s2:s)
		{
		if(s2==s1)
		{
		System.out.println("String Found");flag=true;break;
		}
		}
		if(flag==false)
		{
		System.out.println("String Not Found");
		}*/
		
		/*int[] a={10,20,30,40,50,55};
		int a1=30;
		boolean flag=false;

		for(int i:a)
		{
		if(i==a1)
		{
		System.out.println("Number Found");flag=true;break;
		}
		}
		if(flag==false)
		{
		System.out.println("Number Not Found");
		}*/
		
		/*String[] s={"Java","Selenium","Name","GHHJJ"};
		String s1="Java";

		for(String s2:s)
		{
		if(s2.equals(s1))
		{
		System.out.println("String Found");break;
		}
		else
		{
		System.out.println("String Not Found");break;
		}
		}*/
		/*String s="Welcome To Java";
		String upper="";
		String lower="";

		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		{
		upper=upper+ch;
		}
		else
		{
		lower=lower+ch;
		}
		}
		System.out.println(upper);
		System.out.println(lower);*/
		
	/*	String s="Welcome To Java";
		
		int upper=0;
		int lower=0;

		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(ch>=65 && ch<=90)
		{
		upper++;
		}
		else
		{
		lower++;
		}
		}
		System.out.println(upper);
		System.out.println(lower);*/
		
		/*int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;		
		a[2][1]=600;
		
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.print(i);
			}
			System.out.print("|");
		}
		System.out.println();*/
		/*int a[]=new int[2];//declare
		a[0]=10;//insert values in array
		a[1]=20;
		a[2]=30;*/
		
		/*int a[][]= {{101,102},{103,104},{106,105}};
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print(" | ");
		}
		System.out.println();*/

		/*for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println(a.length);
		System.out.println(a[2]);*/


		
	/*	for(int i=10;i>0;i--)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}*/
	/*	int a=34;
	 * 
	 * 

		if(a%2==0)
		{
		System.out.println("Even Number");
		}
		else
		{
		System.out.println("Odd Number");
		}*/
		
		/*int[] a={10,11,12,13,14,15,16,17};

		System.out.println("Numbers are==");
		for(int i:a)
		{
		if(i%2==0)
		{
		System.out.println(i);
		}
		}*/
		
	/*	System.out.println("Odd Numbers are==");
		for(int i:a)
		{
		if(i%2!=0)
		{
		System.out.println(i);
		}
		}*/

/*for(int i=1;i<=10;i=i+2)
{
System.out.println(i);
}
*/



		/*int i=0;
		do
		{
		System.out.println(i);
		i=i+2;
		}
		while(i<=10);*/





		
		/*int i=0;
		while(i<=10)
		{
		System.out.println(i);
		i=i+2;
		}


		/*for(int i=10;i>=0;i--)
		{
		System.out.println(i);
		}*/

		/*int a=10;

		while(a>0)
		{
		System.out.println(a);
		a--;
		}	
		/*int a=0;

		while(a<=10)
		{
		System.out.println(a);
		a++;
		}*/
		
	/*	int day=4;

		switch(day)
		{
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		default: System.out.println("Not Valid");break;
		}*/
	/*	int a=231; int b=56;

		if(a>b)
		{
		System.out.println("a is greater than b");
		}
		else
		{
		System.out.println("b is greater than a");
		}*/
		
		
	/*	int day=8;
		if(day==1)
				{
				System.out.println("Monday");	
				}
		else if(day==2)
		{
		System.out.println("Tuesday");
		}	
		else if(day==3)
		{
		System.out.println("Wednesday");
		}
		else if(day==4)
		{
		System.out.println("Thursday");
		}
		else if(day==5)
		{
		System.out.println("Friday");
		}
		else if(day==6)
		{
		System.out.println("Saturday");
		}
		else if(day==7)
		{
		System.out.println("Sunday");
		}
		else 
		{
		System.out.println("Invalid Day");
		}*/
			
		
		/*int a=21;
		if(a%2==0)
		{
		System.out.println("Number is Even");
		}
		else
		{
		System.out.println("Number is Odd");
		}*/




		
		



