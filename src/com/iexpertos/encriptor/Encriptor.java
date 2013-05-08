package com.iexpertos.encriptor;

import java.security.InvalidParameterException;

public class Encriptor {
	
	public String cryptWord(String word)
	{
		checkingIfWordContainsSingleBlankSpace(word);
		
		char[] wordArray = word.toCharArray();
		String newWord = "";
		for (int i = 0; i < word.length(); i++)
		{
			int charValue = wordArray[i];
			newWord += String.valueOf((char)( charValue + 2));
		}
		
		return newWord;
	}

	private void checkingIfWordContainsSingleBlankSpace(String word) {
		if (word.contains(" "))
			throw new InvalidParameterException();
	}
	
	public String cryptWordToNumbers(String word)
	{
		checkingIfWordContainsSingleBlankSpace(word);
		
		char[] wordArray = word.toCharArray();
		String newWord = "";
		for (int i = 0; i < word.length(); i++)
		{
			int charValue = wordArray[i];
			newWord += String.valueOf(charValue + 2);
		}
		
		return newWord;
	}

	public String cryptWord(String word, String charsToReplace)
	{
		checkingIfWordContainsSingleBlankSpace(word);
		
		char[] wordArray = word.toCharArray();
		char[] replacement = charsToReplace.toCharArray();
		char[] result = wordArray.clone();
		for (int i = 0; i < wordArray.length; i++)
		{
			for (int j = 0; j < replacement.length; j++)
			{
				if (replacement[j] == wordArray[i])
				{
					int charValue = wordArray[i];
					result[i] = (char)( charValue + 2);		
				}
			}
		}
		return String.valueOf(result);
	}
	
	public String cryptSentence(String sentence)
	{
		char[] sentenceArray = sentence.toCharArray();
		String newWord = "";
		for (int i = 0; i < sentence.length(); i++)
		{
			int charValue = sentenceArray[i];
			newWord += String.valueOf((char)( charValue + 2));
		}
		
		return newWord;
	}
	
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
