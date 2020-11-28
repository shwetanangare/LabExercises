package com.cg.training.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Exercise1
{
	  public static void main(String[] args) 
	  {
		 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		 map.put(3, 15);
		 map.put(5, 67);
		 map.put(7, 77);
		 map.put(2, 32);
		 map.put(1, 54);
		 map.put(4, 11);
		 List<Integer> list=getValues(map);
		 int size= list.size();
		 System.out.println("HashMap values in sorted order");
		 for(int i=0;i<size;i++)
		 {
			 System.out.println(list.get(i));
		 }
		 
	  }
	 static List<Integer> getValues(HashMap<Integer,Integer> map)
	  {
		  List<Integer> list=new ArrayList<Integer>();
		  System.out.println("Given HashMap");
		  for (HashMap.Entry<Integer,Integer> entry : map.entrySet()) 
		  { 
			  System.out.println("Key = "+ entry.getKey() +",Value = "+ entry.getValue());
			  list.add(entry.getValue());
		  }
		  Collections.sort(list);
		  return list;
	  }
}
