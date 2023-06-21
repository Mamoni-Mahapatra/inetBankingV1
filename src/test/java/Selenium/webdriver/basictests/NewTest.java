package Selenium.webdriver.basictests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	public static void main(String[] args) {
ArrayList list=new ArrayList();
list.add(10); list.add("mina"); list.add('A'); list.add(23.244);
System.out.println(list);

System.out.println(list.get(2));
 list.remove(2);
 System.out.println(list);
 list.add(2,"Tina");
 System.out.println(list);
 
 for(Object i:list)
 {
	 System.out.println(i);
 }


	}
}
		
	/*	Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(102, "Sona"); hm.put(103,"Mina");
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
	}
	
	/*	int a=20; int b=30;
		int c=b; b=a; a=c;
		
		System.out.println(a);
		System.out.println(b);
	}
	}
		
	/*	String s="MyNameIsSelenium hkADSF AFsfgh";
		String upperCase="";
		String lowerCase="";

		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(ch>=65 && ch<=90)
		{
		upperCase=upperCase+ch;
		}
		else
		{
		lowerCase=lowerCase+ch;
		}
		}
		System.out.println(lowerCase);
		System.out.println(upperCase);
		
	}
}
		
	/*	String s="My NAME IS mhahomnoMhG hjj";
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
					{
				count++;
					}
		}
System.out.println(count);
		
	}
	}
		
	/*	String s="My NAME IS mhahomnoMhG";
		String [] s1=s.split("\\s");
		
		String revword="";
		for(String w:s1)
		{
			StringBuilder sr=new StringBuilder(w);
			sr.reverse();
		    revword=revword+sr.toString()+" ";
		}
		System.out.println(revword);
	}
}
		
	
		
		/*String s="nitinh";
		String rev="";

		boolean flag=false;

		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		if(s.equals(rev))
		{
		System.out.println("String is Palindrome");flag=true;break;
		}
		}
		if(flag==false)
		{
		System.out.println("String is not Palindrome");

		}
		}
	}


		
		
	/*	String s1="stop";
		String s2="tosps";

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
		
		/*String s="My name is Mamoni Mahapatraa aaa";
		int result=s.length()-s.replaceAll("a","").length();
		System.out.println(result);
		
	/*	String s="HKKhhgHHJHkkk GHHqqqaaa dgqaasda";
		int result=s.length()-s.replaceAll("a","").length();
		System.out.println(result);
		
		
		
	
		/*String s1="stop";
		String s2="tops";
		
		char[] arr1=s1.toLowerCase().toCharArray();
		char[] arr2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is not Anagram");
		}
		
		
		
		
		
		
		/*String s="MHYUUIAhhgfsfjaj   HKKJKHGhhggg  hjjHJJ hhhhHH";
		
		int uppercount=0;
		int lowercount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uppercount++;
			}
			else
			{
				lowercount++;
			}
		
		}
		
		
		System.out.println(uppercount);
		System.out.println(lowercount);
		
		
	}
}
		
	/*	String[] str=s.split("\\s");
		String upperCase="";
		String lowerCase="";
for(String w:str)
{
		for(int i=0;i<s.length();i++)
		{
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
		{
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		{
		upperCase=upperCase+ch;
		}
		else
		{
		lowerCase=lowerCase+ch;
		}
		}
}
}
		System.out.println(upperCase);
		System.out.println(lowerCase);
	}
	}

	/*	WebDriver driver=new ChromeDriver();
		
		String excelfilepath=".\\Testdata\\datasheet.xlsx";
		FileInputStream inputstream=new FileInputStream(excelfilepath);
		XSSFWorkbook xsf=new XSSFWorkbook(inputstream);

		XSSFSheet sheet=xsf.getSheet("sheet1");
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
		System.out.print(" | ");
		}
		System.out.println();
		}
	}
		
		/*File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(".\\Screenshot\\HomePAGE.png"));
		
	/*	String s="Nitin";
		String rev="";
		boolean flag=false;
		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		}
		/*if(s.equals(rev))
		{
		System.out.println("String is Palindrome");flag=true;break;
		}
		}
		if(flag==false)
		{*/
	//	System.out.println("String is reversed=="+rev);
		



		
		/*String s="My Name is Mamoni";
		String[] str=s.split("\\s");
		String revword="";

		for(String w:str)
		{
		StringBuilder src=new StringBuilder(w);
		src.reverse();

		revword=revword+src.toString()+" ";
		}r
		System.out.println(revword);*/
		
		
		/*String s="I am a software test Engineer am Engineer";
		
		char[] arr=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], count);
			}
			else
			{
				map.put(arr[i],map.get(arr[i]+1));
					
				
			}
		}
		for(Character key:map.keySet())
		{
			if(map.get(key)>1)
			{
				System.out.println(key+":"+map.get(key));
			}
		}
		/*int result=s.length()-s.replaceAll("f","").length();
		
		System.out.println(result);
				
		
		/*int count=1;
		for(int i=0;i<s.length();i++)
		{
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
		{
		count++;
		}
		}
		System.out.println(count);*/
	


	

	
