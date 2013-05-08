package com.iexpertos.encriptor.util;

public class Printer {

	public String[] getWords(String sentence)
	{
		return sentence.split(" ");
	}
	
	public void printWords(String sentence)
	{
		String[] words = getWords(sentence);
		for (String word : words)
		{
			System.out.print("<" + word + ">");
		}
	}
	
}
