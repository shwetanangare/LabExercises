package com.cg.client;

import java.util.concurrent.Executor;

import java.util.concurrent.Executors;

import com.cg.service.Timer;

public class TimerExecutor implements Executor
{
	public static void main(String[] args)
	{
		Executor service=Executors.newSingleThreadExecutor();
				
		service.execute(new Timer());

	}

	@Override
	public void execute(Runnable run) 
	{
		 new Thread(run).start(); 	
	}

}
