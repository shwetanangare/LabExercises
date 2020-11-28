package com.cg.client;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Exercise2
	{
		private static Scanner scanner=new Scanner(System.in);
		
	    public static void main(String rr[])throws IOException
	    {
	        System.out.println("Enter the file name :");
	        String fileName=scanner.nextLine();
	        analyze(fileName);
	    }
	    
	    
        public static void analyze(String fileName)
        {
             File file=new File(fileName);
             if(file.exists())
             {
            	 System.out.println((file.getName()+" file exists."));
            	 System.out.println((file.canRead()?"This file is readable.":"This file is not readable."));
            	 System.out.println((file.canWrite()?"This file is writable.":"This file is not writable."));
            	 System.out.println(("Filesize : "+file.length()+" bytes"));
            	 try {
					System.out.println("File Type : "+Files.probeContentType(file.toPath()));
				} catch (IOException e) {
					e.printStackTrace();
				}
             }
             else
             {
            	 System.out.println("File does not exist.");
             }
        }
	}