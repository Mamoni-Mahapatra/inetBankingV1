package Selenium.webdriver.basictests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MyPractice {  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="stops";
		String s2="tops";

		char[] arr1=s1.toLowerCase().toCharArray();
		char[] arr2=s2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(Arrays.equals(arr1,arr2))
		{
		System.out.println("Strings are Anagram");
		}
		else
		{
		System.out.println("Strings are not Anagram");
		}
		
	/*	String s="Selenium";
		
		int i=Integer.parseInt(s);
		System.out.println(i);
		/*Random ran=new Random();
		int i=ran.nextInt(999);
		System.out.println(i);
		double d=ran.nextDouble();
		System.out.println(d);
		
		/*Integer[] s= {10,12,34,21,23};

		Arrays.sort(s,Collections.reverseOrder());
		System.out.println(Arrays.toString(s));
		
		/*String s="Seleniumis@#$%a1123Tool";
		s=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
		/*String s="Selenium is a Tool";
		s=s.replaceAll("\\s","");
		System.out.println(s);
		/*
		String s="Selenium";
		int count=s.length()-s.replaceAll("e","").length();
		System.out.println(count);
		/*int i=12312;
		int evenc=0;
		int oddc=0;

		while(i>0)
		{
		int s=i%10;
		if(i%2==0)
		{
		evenc++;
		}
		else
		{
		oddc++;
		}
		i=i/10;
		}
		System.out.println("Evene numbers are:"+evenc);
		System.out.println("odd numbers:"+oddc);
		
		/*Scanner sr=new Scanner(System.in);
		System.out.println("Enter Number");
		int i=sr.nextInt();
		int num=i;

		int rev=0;

		while(num>0)
		{
		rev=rev*10+num%10;
		num=num/10;
		}
		if(i==rev)
		{
		System.out.println("Number is Palindrome");
		}
		else
		{
		System.out.println("Number is not palindrome");
		}
		/*int i=1134;
		int rev=0;

		while(i>0)
		{
		rev=rev*10+i%10;
		i=i/10;
		}System.out.println(rev);
		/*int i=11345;
		int count=0;


		while(i>0)
		{
		i=i/10;
		count++;
		
		}
		System.out.println(count);
		/*String s="Selenium";
		String rev="";

		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		/*String s="Selenium is a Tool a";
		int count=1;
		for(int i=0;i<=s.length()-1;i++)
		{
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
		{
		count++;
		}
		}
		System.out.println(count);
	/*	String s="Seklenium is a Tool";
		String[] s1=s.split("\\s");

		String rev="";

		for(String i:s1)
		{
		StringBuilder sr=new StringBuilder(i);
		sr.reverse();
		rev=rev+sr.toString()+" ";
		}
		System.out.println(rev);
		
		/*int n1=0,n2=1;
		int sum=0;

		System.out.println(n1+" "+n2);
		for(int i=2;i<=10;i++)
		{
		sum=n1+n2;
		System.out.println(" "+sum);
		n1=n2;
		n2=sum;
		}	

/*HashMap<String,Integer>hm=new HashMap<String,Integer>();
hm.put("gghgh",10);
hm.put("agg",20);

System.out.println(hm);

for(Map.Entry m:hm.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}

		/*ArrayList list=new ArrayList();
		list.add(10);
		list.add("Stgfhg");
		list.add('D');
		list.add(3.12);

		System.out.println(list);

		System.out.println(list.size());
		list.remove(1);
		list.add(1,"fhfhg");
		
		for(Object i:list)
		{
		System.out.println(i);
		}
		/*String[] s={"Selenium","me","java","mes"};
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


		/*String s="Selenium is a Tool";
		StringBuilder sr=new StringBuilder();

		Set<Character>hm=new LinkedHashSet();

		for(int i=0;i<s.length();i++)
		{
		hm.add(s.charAt(i));
		}
		for(Character c:hm)
		{
		sr.append(c);
		}
		System.out.println(sr);

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

		/*System.out.println("Even Numbers are:");
		for(int i=10;i>=0;i--)
		{


		System.out.println(i);
		}
		/*int[] a={10,12,13,14,15,16};

		System.out.println("Even Numbers are:");
		for(int i:a)
		{
		if(i%2==0)
		{
		System.out.println(i);
		}
		}
	/*	Integer i[]={10,24,27,12};

		Arrays.sort(i,Collections.reverseOrder());
		System.out.println(Arrays.toString(i));
	/*	String s1="stop";
		String s2="topss";

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
		System.out.println("String is Not");
		}
		/*String s="Seelinum";
		String lower="";
		String upper="";

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
	/*	String s="Seelinum is a Tool";
		int lower=0;
		int upper=0;

		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(ch>=65&& ch<=90)
		{
		upper++;
		}
		else
		{
		lower++;		}
		}
		System.out.println(upper);
		System.out.println(lower);
	/*	String s="Seelinum";
		String rev="";

		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		/*String s="Selenium is a Tool jhkj";
		int count=1;

		for(int i=0;i<s.length()-1;i++)
		{
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
		{
		count++;
		}
		}
		System.out.println(count);
		/*String s="Selenium is a Tool";
        String[] src=s.split("\\s");
		String rev="";

		for(String w:src)
		{
		StringBuilder sr=new StringBuilder(w);
		sr.reverse();
		rev=rev+sr.toString()+" ";

		}
		System.out.println(rev);
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int i=sc.nextInt();
		int num=i;

		int rev=0;

		while(num>0)
		{
		rev=rev*10+num%10;
		num=num/10;
		}
		if(i==rev)
		{
		System.out.println("String is Plaindrome");
		}
		else
		{
		System.out.println("String is not Plaindrome");
		}

	/*	int i=23443;
		int even=0;
		int odd=0;

		while(i>0)
		{
		int num=i%10;
		if(i%2==0)
		{
		even++;
		}
		else
		{
		odd++;
		}
		i=i/10;
		}
		System.out.println(even);
		System.out.println(odd);

		/*int i=234435;
		int count=0;

		while(i>0)
		{
		i=i/10;
		count++;
		}
		System.out.println(count);


	/*	int i=23443;
		int rev=0;

		while(i>0)
		{
		rev=rev*10+i%10;
		i=i/10;
		}
		System.out.println(rev);

	

/*int n1=0; int n2=1;
int sum=0;
System.out.println(n1+" "+n2);

for(int i=2;i<=10;i++)
{
sum=n1+n2;
System.out.println(" "+sum);
n1=n2;
n2=sum;
}

		/*Integer a[]={10,30,23,20,40};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
		
		/*Random ran=new Random();

		int rand=ran.nextInt(999);
		System.out.println(rand);
		double dou=ran.nextDouble();
		System.out.println(dou);
		/*String s="Selenium is aTool";
		s=s.replaceAll("\\s","");

		System.out.println(s);
		/*String s="Selenium1@##$%68768";

		s=s.replaceAll("[^a-zA-Z0-9]","");

		System.out.println(s);
		/*String s="Selenium";
		int result=s.length()-s.replaceAll("e","").length();

		System.out.println(result);*/
	}
}
		/*String[] s={"Java","selenium","me","Javas"};

		HashSet<String> hs=new HashSet();
		boolean flag=false;

		for(String ls:s)
		{
		if(hs.add(ls)==false)
		{
		System.out.println("String found:"+ls);flag=true;
		}
		}
		if(flag==false)
		{
		System.out.println("String not found");
		}
	}
}
	/*	String s="Selenium is a Tool";
		
		StringBuilder sr=new StringBuilder();

		Set<Character> set=new LinkedHashSet();

		for(int i=0;i<s.length();i++)
		{
		set.add(s.charAt(i));		}
		for(Character c:set)
		{
		sr.append(c);
		}
		System.out.println(sr);

	}
}
		/*HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

		int count=0;

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


		

		
		
		/*String s="Welcome To Java";
		String s1="java";
		
		System.out.println(s.toUpperCase());
	

	
		
		String src="";
		
		for(int i=s.length()-1;i>=0;i--)//6 5 4 3 2 1 0
		{
			src=src+s.charAt(i);
			
		}
		System.out.println(src);
	}
	}
		/*String s[]= {"Selenium","Java","Myclass"};
		
		String s1="Java";
		boolean flg=false;
		
		for(String i:s)
		{
		   if(i==s1)
		   {
			   System.out.println("Element found"); flg=true;break;
		   }
		}
		   if(flg==false)
		   {
			   System.out.println("Element Not Found");
		   }
	}
}
		
	
		
			
/*	int a[]= {-10,20,-34,45,-56,67,-69};
	
	System.out.println("Positive numbers are==");
	for(int i:a)
	{
		if(i>0)
		{
			System.out.println(i);
		}
	}
	System.out.println("Negative numbers are==");
	{
		for(int i:a)
		{
			if(i<0)
			{
				System.out.println(i);
			}
		}
	}
	}
}
	
	/*int sum=20;
	System.out.println("Even Numbers are==");
	for(int i:a)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
		
    }
}
	
}
	
	/*int s=23;
	
	boolean fls=false;
    for(int i:a)
    {
    	if(i==s)
    	{
    		System.out.println("Element found");
    		 fls=true;break;
        }
    }
    
    	if(fls==false)
    	{
    		System.out.println("Element not found");
    	}
	
	}
}

	
    

		/*String s="WeLCOMe To Java";
		
		String upperCase="";
		//String lowerCase="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upperCase=upperCase+ch;
			}
			
		}
		System.out.println("Uppercase =="+upperCase);
		//System.out.println("Uppercase =="+lowerCase);
				
		/*int upperCaseCount=0;
		int lowerCaseCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upperCaseCount++;
			}
			else
			{
				lowerCaseCount++;
			}
		}
		
	System.out.println("Lower CaseCount is=="+lowerCaseCount);
	System.out.println("Upper CaseCount is=="+upperCaseCount);

		
		
		//int a[][]=new int[2][1];
		/*int a[][]= {{100,200},{300,400}};
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		/*int a[][]=new int[3][2];
		
		a[0][0]=200;
		a[0][1]=300;
		a[1][0]=400;
		a[1][1]=500;
		a[2][0]=600;
		a[2][1]=700;
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
		
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		
		/*int a[]=new int[5];
		a[0]=121;
		a[1]=234;
		a[2]=345;
		a[3]=456;
		a[4]=567;
		
		System.out.println(a.length);
		System.out.println(a[3]);
		
		for(int i:a)
		
		
		{
			System.out.println(i);
		}
		
		
		/*for(int i=10;i>=0;i--)
		{
			
			if(i==5)
			{
		continue;
		}
			System.out.println(i);
		}
	/*	int i=10;
		
		do
		{
			System.out.println(i);
			i--;
		}
		while(i>=0);
			
			
			
		/*int day=4;
		switch(day)
		{
			case 1: System.out.println("day is Monday"); break;
			case 2: System.out.println("day is Tuesday");break;
			case 3: System.out.println("day is Wednesday");break;
			default: System.out.println("day is not valid");break;
			
		}
	/*int	day=2;
		
		if(day==1)
		{
			System.out.println("day is Monday");
			
		}
		else if(day==2)
		{
			System.out.println("day is Tuesday");
		}
		else if(day==3)
		{
			System.out.println("day is Wednesday");
			
		}
		//int a= 30; int b=18; int c=56;
		
	/*	if(a>b && a>c)
		{
			System.out.println("a is greater than b & c");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater than a & c");
		}
		else
		{
			System.out.println("c is greater than a & b");
		}
		
		/*if(a%2!=0)
		{
			System.out.println("Number is odd");
		}
		else
		{
			System.out.println("Number is even");
		}*/

	

