package Selenium.webdriver.basictests;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class AllQuestions {
	
	/*String s="Selenium is java";
	int res=s.length()-s.replaceAll("e","").length();
	System.out.println(res);


	
	/*public void afterMethod(ITestResult result) throws Exception
	 {
		WebDriver driver=new ChromeDriver();
		if(ITestResult.FAILURE==result.getStatus())
		{
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File(".//screenshot//hp.png"));
		}
		
	 }*/
 public static void main(String args[]) throws Exception {
	 String []s={"Selenium","java","me","me"};

	 HashSet<String> hs=new HashSet();
	 boolean fl=false;
	 for(String i:s)
	 {
	 if(hs.add(i)==false)
	 {
	 System.out.println("String Found:"+i);fl=true;
	 }
	 }
	 if(fl==false)
	 {
	 System.out.println("String not found");
	 }


 }
	 /*String s="Selenium";
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
	/* String s="Selenium";
	 int count=0;

	 HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
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
	/* String s="Jav is programming language";
	 int count=0;

	/* HashMap<Character,Integer>hs=new HashMap<Character,Integer>();

	 for(int i=0;i<s.length();i++)
	 {

	 char ch=s.charAt(i);
	 if(hs.containsKey(ch))
	 {
	 count=hs.get(ch);
	 count++;
	 hs.replace(ch,count);
	 }
	 else
	 {
	 hs.put(ch,1);
	 }
	 }
	 for(Character key:hs.keySet())
	 {
	 System.out.println(key+" = "+hs.get(key));
	 }
 }
	 /*String[] s={"Java","Seleium","Git","Java"};

	 HashSet<String> hs=new HashSet();
	 boolean fl=false;
	 for(String i:s)
	 {
	 if(hs.add(i)==false)
	 {
	 System.out.println("String Found:"+i);fl=true;
	 }
	 }
	 if(fl==false)
	 {
	 System.out.println("String Not Found");
	 
	 }
 }
	/* String s="Selenium";
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
	 /*String s="Selenium is java";
	 int count=0;

	 HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

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

	/* String[] s={"Java","Selenium","Code","Javas"};
	 HashSet<String> hs=new HashSet();
	 boolean fl=false;
	 for(String i:s)
	 {
	 if(hs.add(i)==false)
	 {
	 System.out.println("Found:"+i);fl=true;
	 }
	 }
	if(fl==false)
	 {
	 System.out.println("Not found");
	 }
	 
	/* String s="Selenium";
	 String rev="";

	 for(int i=s.length()-1;i>=0;i--)
	 {
	 char ch=s.charAt(i);
	 rev=rev+ch;
	 }
	 System.out.println(rev);
	/*int i=0;
	 
	 while(i>10)
	 {
		 System.out.println(i);
		 i++;
	 }
		 
		 
		 /* int i=3;
	 
	 if(i%2==0)
	 {
		 System.out.println("even number");
	 }
	 else
	 {
		 System.out.println("odd number");
	 }
	 /*for(int i=0;i<=10;i=i+2)
	 {
	 System.out.println(i);
	 }
	/* String s="Selenium java mjghsh hhjjh";
	 int count=1;

	 for(int i=0;i<s.length()-1;i++)
	 {

	 if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
	 {
	 count++;
	 }
	 }
	 System.out.println(count);
	 /*String s="Selenium Java Mhhjhj";
	 String [] st=s.split("\\s");
	 String rev="";
	 for(String i:st)
	 {
	 StringBuilder src=new StringBuilder(i);
	 src.reverse();
	 rev=rev+src.toString()+" ";
	 }
	 System.out.println(rev);
	/* String s1="stops";
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

	/* String excelfilepath=".\\TestData\\DataFile.xlsx";
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
	 case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
	 }
	 System.out.println(" | ");
	 }
	 System.out.println();
	 }
	 
	/* String s="WelcomeToJava";
	 int upper=0;
	 int lower=0;

	 for(int i=0;i<s.length();i++)
	 {
	 char ch=s.charAt(i);
	 if(ch>=65&& ch<=90)
	 {
	 upper++;
	 }
	 else
	 {
	 lower++;
	 }
	 }
	 System.out.println(lower);
	 System.out.println(upper);

	 /*String s="WelcomeToJava";
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
	 System.out.println(lower);
	 System.out.println(upper);

	 /*int a=20; int b=30;
	 int c=a; a=b; b=c;
	 System.out.println(a);
	 System.out.println(b);
	 /*int a=1254523;
	 int even=0;
	 int odd=0;

	 while(a>0)
	 {
	 int num=a%10;
	 if(num%2==0)
	 {
	 even++;
	 }
	 else
	 {
	 odd++;
	 }
	 a=a/10;
	 }
	 System.out.println("even numbers"+even);
	 System.out.println(odd);
	 
	 /*int a=1254523;
	 int sum=0;

	 while(a!=0)
	 {
	 sum=sum+a%10;
	 a=a/10;
	 }
	 System.out.println(sum);
	/* int a=1254523;
	 int rev=0;
	 while(a>0)
	 {
	 rev=rev*10+a%10;
	 a=a/10;
	 }
	 System.out.println(rev);
	 //int a=34513566;
	 /*Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number");
	 int a=sc.nextInt();
	 int num=a;

	 int rev=0;

	 while(num>0)
	 {
	 rev=rev*10+num%10;
	 num=num/10;
	 }
	 if(a==rev)
	 {
	 System.out.println("Number is Palindrome:"+rev);
	 }
	 else
	 {
	 System.out.println("Number is not Palindrome");
	 }
	/* int rev=0;

	 while(a>0)
	 {
	 rev=rev*10+a%10;
	 a=a/10;
	 }
	 System.out.println(rev);
	 /*int count=0;

	 while(a>0)
	 {
	 a=a/10;
	 count++;
	 }
	 System.out.println(count);

	 /*HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
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
	 hm.replace(ch,1);
	 }
	 }
	 for(Character key:hm.keySet())
	 {
	 System.out.println(key+" = "+hm.get(key));
	 }

	 
	/* String s="Java";
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
	/* String[] s={"Java","selenioum","me","Javas"};
	 HashSet<String> hs=new LinkedHashSet();
	 
	 boolean fl=false;
	 for(String i:s)
	 {
		 if(hs.add(i)==false)
		 {
			 System.out.println("Found:"+i);fl=true;
		 }
	 }
	 if(fl==false)
	 {
		 System.out.println("Not Found");
	 }
	/* String a="sefhajdhjawaa";
	 
	 StringBuilder sr=new StringBuilder();
	 Set<Character> set=new LinkedHashSet();
	 
	 for(int i=0;i<a.length();i++)
	 {
		 set.add(a.charAt(i));
		 
	 }
	 for(Character c:set)
	 {
		 sr.append(c);
	 }
	 System.out.println(sr);
	 
	 
	 /*Integer [] a= {10,20,30,987,445};
	 
	 Arrays.sort(a);
	 System.out.println(Arrays.toString(a));
	 
	 Arrays.sort(a,Collections.reverseOrder());
	 System.out.println(Arrays.toString(a));
	 
	/*String s="Jav is a programming  language1456790";
	s=s.replaceAll("\\s", "");
	System.out.println(s);
	
	/*s=s.replaceAll("[^a-zA-Z]","");
	System.out.println(s);
	 
	/*int result=s.length()-s.replaceAll("g", "").length();
	 
	 System.out.println(result);
	/* int a1=0, a2=1, sum=0;
	 
	 System.out.println(a1+" "+a2);
	 
	 for(int i=2;i<10;i++)
	 {
		 sum=a1+a2;
		 System.out.println(" "+sum);
		 a1=a2;
		 a2=sum;
		 
	 }
	/*int [] a= {10,20,30,987};
	
	System.out.println("Even Numbers are:");
	for(int i:a)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	System.out.println("Odd Numbers are:");
	for(int i:a)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
	/* int sum=0;
	 
	 for(int i:a)
	 {
		 sum=sum+i;
	 }
	 System.out.println(sum);
	 
	/* String []a= {"Java","Selenium","Me","Javas"};
	 HashSet<String>hs=new HashSet();
	 boolean fl=false;
	 for(String i:a)
	 {
		 if(hs.add(i)==false)
		 {
			 System.out.println(i);fl=true;
		 }
	 }
	 if(fl==false)
	 {
		 System.out.println("not found");
	 }
	 
	 
	 /*Random rm=new Random();
	 int ram1=rm.nextInt(200);
	 System.out.println(ram1);

	 double ram2=rm.nextDouble();
	 System.out.println(ram2);
	 
	/* String s="Java";
	 
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
	 /*int count=0;
	 	 
	 HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
	 
	/* for(int i=0;i<s.length();i++)
	 {
		 char ch=s.charAt(i);
		 if(hm.containsKey(ch))
		 {
			 count=hm.get(ch);
			 count++;
			 hm.replace(ch, count);
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
	 /*4 String s="programming";
	 
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
	/* Integer [] a= {10,56,345,89,9};
	 
	  Arrays.sort(a);
	  System.out.println("sorted:"+Arrays.toString(a));
	  
	  Arrays.sort(a,Collections.reverseOrder());
	  System.out.println(Arrays.toString(a));
	  
	  
	  
	 /*String s="sgghb hbjjhj hhjjkm";
	 
	 String s1=s.replaceAll("\\s","");
	 System.out.println(s1);
	 
	/* String s="/*2@#!$%*(&selenium ghesdff23545";
	 String s1=s.replaceAll("[^a-zA-Z0-9]","");
	 System.out.println(s1);
	 
	 int result=s.length()-s.replaceAll("f","").length();
	 System.out.println(result);
	/* int a1=0, a2=1,sum=0;
	 System.out.println(a1+" "+a2);
	 for(int i=2;i<10;i++)
	 {
		 sum=a1+a2;
		 System.out.println(" "+sum);
		 a1=a2;
		 a2=sum;
	 }
	 /*int[] a= {10,44,34,99,71};
	System.out.println("even:");	
	
	 for(int i:a)
	 {
		 if(i%2==0)
		 {
			 System.out.println(i);
		 }
	 	 
	 }
	 
	 	 System.out.println("odd:");
	 	 for(int i:a)
	 	 {
	 		 if(i%2!=0)
	 		 {
	 			 System.out.println(i);
	 		 }
	 	 }
	 
	/* String[] a={"Java","selenium","me","Java"};
	 
	/* boolean flag=false;
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]==a[j])
			 {
				 System.out.println("found:"+a[i]);flag=true;
			 }
		 }
	 }
	 
	 if(flag=false)
	 {
		 System.out.println("not found");
	 }
	/* HashSet<String>hs=new HashSet();
	 boolean flag=false;
	 for(String l:a)
	 {
		 if(hs.add(l)==false)
		 {
			 System.out.println("Found:"+l);flag=true;
		 }
	 }
	 if(flag==false)
	 {
		 System.out.println("not found");
	 }
			 
	 /*Random rm=new Random();
	 int a=rm.nextInt(23);
	 System.out.println(a);
	 double b=rm.nextDouble();
	 System.out.println(b);
	 
	 
	/* int[] a= {10,20,30,20,40,30};
	 boolean flag=false;
	 HashSet<Integer>in=new HashSet();
	 
	 
	  
	 for(int i:a)
	 {
		 if(in.add(i)==false)
		 {
			 System.out.println("Found:"+i);flag=true;
		 }
	 }
	 if(flag==false)
	 {
		 System.out.println("Not Found");
	 }
     /* Random ran=new Random();
	 int rand=ran.nextInt(10);
	 System.out.println(rand);
	 
	 double src=ran.nextDouble();
	 System.out.println(src);
/*	 String[] s= {"Java","Selenium","Lang","Javas"};
	 boolean flag=false;
	 HashSet<String>langs=new HashSet();
	 
	 for(String lang:s)
	 {
		 if(langs.add(lang)==false)
		 {
			 System.out.println("Found:"+lang);flag=true;
		 }
	 }
	 if(flag==false)
	 {
		 System.out.println("Not Found");
	 }
	 
	 
	 /*int[] a= {10,20,30,56,71,77};
	 int even=0;
	 int odd=0;
	 boolean flag=false;
	 System.out.println("even numbers");
	 for(int i:a)
	 {
		 if(i%2==0)
		 {
			 System.out.println(i);
		 }
	 }
	 System.out.println("odd numbers");
	 for(int i:a)
	 {
		 if(i%2!=0)
		 {
		 System.out.println(i);
	 }
	 
	 }
	 
	// String s="Seeliunmjkk";
	 
	/* int count=0;
	 for(int i=0;i<s.length();i++)
	 {
		 char ch=s.charAt(i);
		 count++;
	 }
	 System.out.println(count);
 /*String s=null;
 System.out.println(s.length());
 
/* try
 {
	 
	 System.out.println(s.length());
	 /*Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Value");
	 int a=sc.nextInt();
	 System.out.println(a);*/
	//FileInputStream input=new FileInputStream(".//datafiles//TestData");
	//System.out.println(input);
 /*}
 catch(NullPointerException e)
 {
 System.out.println("exception handled");
 }
finally
{
	System.out.println("this is finally bloc");
}*/

	/* int day=8;
	 
	* switch(day)
	 {
	 case 1:System.out.println("Monday");break;
	 case 2:System.out.println("Tuesday");break;
	 case 3:System.out.println("Wednesday");break;
	 case 4:System.out.println("Thursday");break;
	 case 5:System.out.println("Friday");break;
	 case 6:System.out.println("Saturday");break;
	 case 7:System.out.println("Sunday");break;
	 default: System.out.println("Invalid day");break;
	 }
	 
	 
	/* int a=10, b=20, c=60;
	 if(a>b & a>c)
	 {
		 System.out.println("a is greater");
	 }
	 else if(b>a & b>c)
	 {
		 System.out.println("b is greater ");
		 
	 }
	 else 
	 {
		 System.out.println("c is greater");
	 }
	 /*for(int i=0;i<=10;i++)
	 {
		 System.out.println(i);
	 }
	/*String s="Selenium";
	 
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
	/* String upper="";
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
	 System.out.println(lower);
	 
	/* String a="Selenium is a tool java aghh";
	 String[] s=a.split("\\s");
	 String rev="";
	 
	 for(String w:s)
	 {
		 StringBuilder src=new StringBuilder(w);
		 src.reverse();
		 rev=rev+src.toString()+" ";
	 }
	 System.out.println(rev);
	 /*System.out.println(rev);
	 String s="Selenium is tool";
	 String rev="";
	 
	 for(int i=s.length()-1;i>=0;i--)
	 {
		 char ch=s.charAt(i);
		 rev=rev+ch;
		 
	 }
	 System.out.println(rev);
	 
	 
	/* int count=1;
	 
	 for(int i=0;i<a.length();i++)
	 {
		 if((a.charAt(i)==' ')&&(a.charAt(i+1)!=' '))
		 {
			 count++;
		 }
	 }
	 System.out.println(count);
	 
	 /*String s="stop";
	 String s1="tops";
	 
	 char[] arr1=s.toLowerCase().toCharArray();
	 char[] arr2=s1.toLowerCase().toCharArray();
	 
	 Arrays.sort(arr1);
	 Arrays.sort(arr2);
	 
	 if(Arrays.equals(arr1,arr2))
	 {
		 System.out.println("String is Anagram");
	 }
	 else
	 {
		 System.out.println("String is not an Anagram");
	 }
	/* String a="Seleniou is my name";
	 int result=a.length()-a.replaceAll("m","").length();
	  System.out.println(result);
	 
	/*String excelfilepath=".//datafiles//TestData.xlsx";
	 FileInputStream inputstream=new FileInputStream(excelfilepath);
	 XSSFWorkbook sxf=new XSSFWorkbook(inputstream);
	 XSSFSheet sheet=sxf.getSheet("Sheet1");
	 
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
	 
	 
	/* WebDriver driver=new ChromeDriver();
	 
	 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(file,new File(".//Screenshots//login.png"));
	 
	/* int a=80, b=90;
	 int c=a; a=b; b=c;
	 
	 System.out.println(a);
	 System.out.println(b);
	 
	 
	/* int a=14252;
	 int sum=0;
	 
	 while(a>0)
	 {
		 sum=sum+a%10;
		 a=a/10;
	 }
	 System.out.println("Sum is=="+sum);
	 /*int a=11355265;
	 int evencount=0;
	 int oddcount=0;
	 
	 while(a>0)
	 {
		 int rem=a%10;
		 if(rem%2==0)
		 {
			 evencount++;
		 }
		 else
		 {
			 oddcount++;
		 }
		 a=a/10;
	 }
	 System.out.println(evencount);
	 System.out.println(oddcount);
	 /*Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number");
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
		 System.out.println("Number is not Palindrome");
	 }
	 
	/* int a=126213566;
	 int count=0;
	 
	 while(a>0)
	 {
		 a=a/10;
		 count++;
	 }
	 System.out.println(count);
	 
	 /*int rev=0;
	 
	 while(a>0)
	 {
		 rev=rev*10+a%10;
		 a=a/10;
		 
	 }
	 System.out.println(rev);
	 /*int a=1567773556;
	 int sum=0;
	 while(a>0)
	 {
	 sum=sum+a%10;
	 a=a/10;
	 }
	 System.out.println(sum);
	/* int a=1245634143;
	 int even=0;
	 int odd=0;

	 while(a>0)
	 {
	int num=a%10; // 6 5 4 2 1
	 
	 if(num%2==0)
	 {
	 even++;
	 }
	 else
	 {
	 odd++;
	 }
	 a=a/10;
	 }
	 System.out.println(even);
	 System.out.println(odd);

	 
	
	/* System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");*/
	// WebDriver driver=new ChromeDriver();
	 
	/* int a=123545;
	 int count=0;

	 while(a>0)
	 {
	 a=a/10;
	 count++;
	 }
	 System.out.println(count);*/
	/* int a=12354;
	 int rev=0;
	 while(a!=0)
	 {
	 rev=rev*10+a%10;
	 a=a/10;
	 }
	 System.out.println(rev);
*/
	/* Scanner scr=new Scanner(System.in);
	 System.out.println("Enter Number");
	 int a=scr.nextInt();
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
	 System.out.println("Number is Not Palindrome");
	 }
*/
	/* File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(file,new File(".\\screenshot\\scr.png"));*/
	 
	/* String excelfilepath=".\\testdata\\datasheet.xlxs";
	 FileInputStream inputStream=new FileInputStream(excelfilepath);
	 XSSFWorkbook xsf=new XSSFWorkbook(inputStream);
	 XSSFSheet sheet=xsf.getSheet("Sheet1");

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

	 }*/
	/* int a=35417782;
	 int even=0;
	 int odd=0;
	 while(a>0)
	 {
	 int rem=a%10;
	 if(rem%2==0)
	 {
	 even++;
	 }
	 else
	 {
	 odd++;
	 }
	 a=a/10;
	 }
	 System.out.println(even);
	 System.out.println(odd);
*/
	/* int a=1256;

	 int sum=0;
	 while(a>0)
	 {
	 sum=sum+a%10;
	 a=a/10;
	 }
	 System.out.println(sum);*/



	 
	 
	 
	 
}

