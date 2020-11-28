package com.cg.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.cg.service.Timer;

public class TimerExecutorService 
{

	public static void main(String[] args)
	{
		ExecutorService service=Executors.newSingleThreadExecutor();
				
		service.execute(new Timer());

	}

}
