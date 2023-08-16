package Selenium.webdriver.basictests;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountCharactersUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Jav is a Programming Language";
		s=s.replace(" ","");
		int count=0;
		char[] arry=s.toCharArray();
		Map<Character,Integer>map=new TreeMap<>();
		for(int i=0;i<arry.length;i++)
		{
			count=0;
			for(int j=0;j<arry.length;j++)
			{
				if(arry[i]==arry[j])
				{
					count++;
				}
			}
		
		map.put(arry[i],count);
	}
		System.out.println("hello"+count);
}
		/*int count;
		Map<Character,Integer>hm=new HashMap<Character,Integer>();
		
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
		for(Character Key:hm.keySet())
		{
			System.out.println(Key+" = "+hm.get(Key));
		}*/
	}


