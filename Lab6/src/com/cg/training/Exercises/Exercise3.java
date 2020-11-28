package com.cg.training.Exercises;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

	public static void main(String[] args)
	{
		int array[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		Map<Integer,Integer> map= getSquares(array);
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println("Number : "+entry.getKey()+" Square : "+entry.getValue());
		}
	}
	static Map<Integer,Integer> getSquares(int array[])
	{
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int length= array.length;
		for(int i=0;i<length;i++)
		{
			int square=array[i]*array[i];
			map.put(array[i], square);
		}
		return map;
		
	}
}
