package com.iexpertos.encriptor.util;

public class Printer {

	private String[] getWords(String sentence)
	{
		return sentence.split(" ");
	}
	
	public void printWordsBetweenLowerThanAndGreaterThanSymbols(String sentence)
	{
		String[] words = getWords(sentence);
		for (String word : words)
		{
			System.out.print("<" + word + ">");
		}
	}

	public void printSentence(String sentence) {
		System.out.println(sentence);
	}
	
}
