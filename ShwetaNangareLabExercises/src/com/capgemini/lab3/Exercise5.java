package com.capgemini.lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
	
	public static void main(String[] args) {
		
		
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
         
        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\Capgemini\\JAVA\\test.txt"));)
        {
         
     
            String nextLine = reader.readLine();
            while (nextLine != null)
            {
                lineCount++;
                String[] words = nextLine.split(" ");
                wordCount = wordCount + words.length;
                 
                for (String word : words)
                {
                    charCount = charCount + word.length();
                }
                nextLine = reader.readLine();
            }
             System.out.println("Number of characters: "+charCount);
             System.out.println("Number of words: "+wordCount);
             System.out.println("Number of lines: "+lineCount);
 		
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
	}

}
