package com.cg.client;

import com.cg.service.CopyDataThread;

public class FileProgram 
{
	public static void main(String[] args) 
	{
		Runnable runnable=new CopyDataThread();
		Thread t1=new Thread(runnable);
		t1.start();

	}

}