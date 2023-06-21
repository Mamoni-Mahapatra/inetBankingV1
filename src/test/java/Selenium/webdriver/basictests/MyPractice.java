package Selenium.webdriver.basictests;

public class MyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome To Java";
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

	

