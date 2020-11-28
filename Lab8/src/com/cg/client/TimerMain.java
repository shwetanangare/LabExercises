package com.cg.client;

import com.cg.service.Timer;

public class TimerMain 
{
	public static void main(String[] args) 
	{
		Runnable run=new Timer();
		Thread t1=new Thread(run);
		t1.start();
	}
}
