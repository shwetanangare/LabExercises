package com.cg.client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

	public static void main(String[] args) {

		try 
		{
			FileInputStream fin=new FileInputStream("E:\\Capgemini\\eclipse-workspace\\Lab10\\src\\com\\cg\\service\\source.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fin));
			
			String line = "";
			int lineNo=1;
			while ((line = br.readLine()) != null) 
			{
					System.out.println(lineNo+". "+line);
					lineNo++;
			}
			br.close();
			
		}
		catch (IOException e)
		{

			e.printStackTrace();
		}

	}

}