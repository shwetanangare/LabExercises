package com.cg.client;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.cg.service.CopyDataThread;

public class CopyDataExecutor implements Executor
{

	public static void main(String[] args)
	{
		Executor service=Executors.newSingleThreadExecutor();
				
		service.execute(new CopyDataThread());

	}

	@Override
	public void execute(Runnable run)
	{
		new Thread(run).start(); 
		
	}

}