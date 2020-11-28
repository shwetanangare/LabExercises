package com.cg.training.Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {

	public static void main(String[] args)
	{
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1, 15);
		map.put(2, 25);
		map.put(3, 53);
		map.put(4, 12);
		map.put(5, 43);
		System.out.println("ID and Age of peoples");
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			System.out.println("ID : "+entry.getKey()+" Age : "+entry.getValue());
		}
		System.out.println("\n");
		System.out.println("ID's of People eligible for voting are:");
		List<Integer> list= votersList(map);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}
	static List<Integer> votersList(Map<Integer,Integer> map)
	{
		List<Integer> list=new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>=18)
			{
				list.add(entry.getKey());
				
			}
		}
		return list;
	}
}
