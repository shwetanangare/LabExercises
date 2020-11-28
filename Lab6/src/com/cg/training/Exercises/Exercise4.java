package com.cg.training.Exercises;

import java.util.HashMap;

public class Exercise4 {

	public static void main(String[] args)
	{
		HashMap<Integer,Integer> InputMap=new HashMap<Integer,Integer>();
		InputMap.put(1, 50);	
		InputMap.put(2, 60);	
		InputMap.put(3, 65);	
		InputMap.put(4, 70);	
		InputMap.put(5, 80);	
		InputMap.put(6, 90);	
		InputMap.put(7, 95);
		
		HashMap<Integer,String> OutputMap=getStudents(InputMap);
		for(HashMap.Entry<Integer,String> entry:OutputMap.entrySet())
		{
			System.out.println("Student Registration Number : "+entry.getKey()+" Medal : "+entry.getValue());
		}
		

	}
	static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> InputMap)
	{
		HashMap<Integer,String> OutputMap=new HashMap<Integer,String>();
		for(HashMap.Entry<Integer,Integer> entry:InputMap.entrySet())
		{
			int marks=entry.getValue();
			if(marks>=70 && marks<80)
			{
				OutputMap.put(entry.getKey(), "Bronze");
			}
			else if(marks>=80 && marks<90)
			{
				OutputMap.put(entry.getKey(), "Silver");
			}
			else if(marks>=90)
			{
				OutputMap.put(entry.getKey(),"Gold");
			}
		}
		return OutputMap;
		
	}
}
