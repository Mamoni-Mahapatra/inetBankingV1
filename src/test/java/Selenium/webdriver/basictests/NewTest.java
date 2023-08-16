package Selenium.webdriver.basictests;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest {

	public static void main(String[] args) throws Exception {
		
		String s1="stops";
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
		/*int n1=0, n2=1,sum=0;
		System.out.println(n1+" "+n2);

		for(int i=2;i<=10;i++)
		{
		sum=n1+n2;
		System.out.println(" "+sum);
		n1=n2;
		n2=sum;
		}
/*WebDriver driver=new ChromeDriver();
WebElement el=driver.findElement(By.xpath("ghgj"));
Select sr=new Select(el);

 List<WebElement> option=sr.getOptions();
 System.out.println(option);
 
 el.isDisplayed();
 el.isSelected();
 el.isEnabled();
 
 sr.selectByVisibleText("");
 sr.selectByValue("");
 sr.selectByIndex(0);
 driver.get("url");
 driver.getTitle();
 String src=el.getText();
 
 driver.navigate().to("");
 driver.navigate().back();
 driver.navigate().forward();
 driver.navigate().refresh();
 
 
 
 
 
 
 
 

		/*Map<String,Integer> hm=new HashMap<String,Integer>();

		hm.put("Me",10);
		hm.put("Java",20);
		hm.put("Meto",30);
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		/*ArrayList list=new ArrayList();
		list.add(10);
		list.add("Me");
		list.add('D');

		System.out.println(list);
		
		System.out.println(list.size());
		list.add(1,30);
		System.out.println(list);

		for(Object o:list)
		{
		System.out.println(o);*/
		}
	}

	/*	String s="Selenium is Tool";
		String [] s1=s.split("\\s");

		String rev="";

		for(String i:s1)
		{
		StringBuilder sr=new StringBuilder(i);
		sr.reverse();
		rev=rev+sr.toString()+" ";
		}
		System.out.println(rev);
	}

	}
		
	/*	String[] s={"Selenium","Java","me","Javas"};

		HashSet<String> hs=new HashSet();

		boolean flag=false;

		for(String i:s)
		{
		if(hs.add(i)==false)
		{
		System.out.println("String found:"+i);flag=true;
		}
		}
		if(flag==false)
		{
		System.out.println("String not found");
		}		
	}
}
		/*String s="Selenium is a Tool";
		StringBuilder sr=new StringBuilder();

		Set<Character> set=new LinkedHashSet();

		for(int i=0;i<s.length();i++)
		{
		set.add(s.charAt(i));
		}
		for(Character c:set)
		{
		sr.append(c);
		}
		System.out.println(sr);



	}
}
		/*String s="Selenium is a Tool";
		int count=0;

		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();

		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(hm.containsKey(ch))
		{
		count=hm.get(ch);
		count++;
		hm.replace(ch,count);
		}
		else
		{
		hm.put(ch,1);
		}
		}
		for(Character key:hm.keySet())
		{
		System.out.println(key+" = "+hm.get(key));
		}		
	}
}
		/*String s="SelenioGHhhhum";
		int upperCase=0;
		int lowerCase=0;

		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(ch>=65 && ch<=90)
		{
		upperCase++;
		}
		else
		{
		lowerCase++;
		}
		}
		System.out.println(upperCase);
		System.out.println(lowerCase);
	}


	}
		
		/*String s="SelenioGHhhhum";
		String upperCase="";
		String lowerCase="";

		for(int i=0;i<s.length();i++)
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
		System.out.println(upperCase);
		System.out.println(lowerCase);

	}

	}
		
		
	/*	String s="Selenium";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}

		
	
		/*String s="My name is Mamoni hhj jj";
		int count=1;
		for(int i=0;i<s.length();i++)
		{
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
		{
		count++;
		}
		}
		System.out.println(count);
	}
	
	}

		/*String s="My name is Mamoni Mahapatra";
		String[] sr=s.split("\\s");
		String rev="";

		for(String w:sr)
		{
		StringBuilder src=new StringBuilder(w);
		src.reverse();

		rev=rev+src.toString()+" ";
		}
		System.out.println(rev);
	}
}
		/*String s="nitins";
		String rev="";
		boolean flag=false;

		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		if(rev.equals(s))
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
		/*String s1="stop";
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
	}
}
		
		/*String s="My name is mamoni Mahapatra hhjiif";
		int result=s.length()-s.replaceAll("i","").length();
		System.out.println(result);
	}
}
		/*String excelfilepath=".\\testdata\\datasheet.xlsx";
		FileInputStream inputstream=new FileInputStream(excelfilepath);
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
		case STRING: System.out.print(cell.getStringCellValue());break;
		case NUMERIC: System.out.print(cell.getNumericCellValue());break;
		case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;

		}
		System.out.print(" | ");
		}
		System.out.println();*/



	
