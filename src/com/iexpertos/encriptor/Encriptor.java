package com.iexpertos.encriptor;

import com.iexpertos.encriptor.util.SentenceValidator;

public class Encriptor {
	
	private static final String EMPTY_SPACE = "";
	
	private SentenceValidator sentenceValidator;
	
	public Encriptor(){
		sentenceValidator = new SentenceValidator();
	}

	public String cryptWord(String word)
	{
		sentenceValidator.checkingIfWordContainsSingleBlankSpace(word);
		return this.cryptSentence(word);
	}
	
	public String cryptWordToNumbers(String word)
	{
		sentenceValidator.checkingIfWordContainsSingleBlankSpace(word);
		
		char[] wordArray = word.toCharArray();
		String encryptedWord = EMPTY_SPACE;
		for (int i = 0; i < word.length(); i++)
		{
			int charValue = wordArray[i];
			encryptedWord += String.valueOf(charValue + 2);
		}
		
		return encryptedWord;
	}

	public String cryptWordReplacingChars(String word, String charsToReplace)
	{
		sentenceValidator.checkingIfWordContainsSingleBlankSpace(word);
		
		char[] wordArray = word.toCharArray();
		char[] charsToReplaceArray = charsToReplace.toCharArray();
		char[] encryptedWordArray = wordArray.clone();
		for (int i = 0; i < wordArray.length; i++)
		{
			replacingWordCharacters(wordArray, charsToReplaceArray,
					encryptedWordArray, i);
		}
		return String.valueOf(encryptedWordArray);
	}

	private void replacingWordCharacters(char[] wordArray,
			char[] charsToReplaceArray, char[] encryptedWord, int i) {
		for (int j = 0; j < charsToReplaceArray.length; j++)
		{
			if (charsToReplaceArray[j] == wordArray[i])
			{
				int charValue = wordArray[i];
				encryptedWord[i] = (char)( charValue + 2);		
			}
		}
	}
	
	public String cryptSentence(String sentence)
	{
		char[] sentenceArray = sentence.toCharArray();
		String encryptedSentence = EMPTY_SPACE;
		for (int i = 0; i < sentence.length(); i++)
		{
			int charValue = sentenceArray[i];
			encryptedSentence += String.valueOf((char)( charValue + 2));
		}
		
		return encryptedSentence;
	}
	
}
