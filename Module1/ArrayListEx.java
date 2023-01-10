package com101;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		
		ArrayList arrayList =new ArrayList<>();
		
		arrayList.add("Android");
		arrayList.add("Java");
		arrayList.add("Android");
		arrayList.add("Java");
		arrayList.add("Android");
		arrayList.add("Java");
		
		
		ArrayList arrayList2 =new ArrayList<>();
		
		arrayList2.add("Php");
		arrayList2.add("Ios");
		arrayList2.add("Java");
		
		arrayList.addAll(arrayList2);
		
		arrayList.remove(3);
		
		//arrayList.retainAll(arrayList2);
		
		Iterator i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
			
		}
		
	}
}
