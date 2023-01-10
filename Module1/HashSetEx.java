package com101;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		
		HashSet set =new HashSet<>();
		
		set.add("Android");
		set.add("Java");
		set.add("Android");
		
		Iterator i = set.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}