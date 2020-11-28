package com.cg.service;

import java.time.LocalTime;

public class Timer implements Runnable
{

	@Override
	public void run() 
	{
		while(true)
		{
			System.out.println(LocalTime.now());
			try
			{
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}
