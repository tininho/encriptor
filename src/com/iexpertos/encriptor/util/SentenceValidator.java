package com.iexpertos.encriptor.util;

import java.security.InvalidParameterException;

public class SentenceValidator{
	
	private static final String BLANK_SPACE = "";
	
	public void checkingIfWordContainsSingleBlankSpace(String sentence) throws InvalidParameterException {
		
		if(BLANK_SPACE.equals(sentence)){
			throw new InvalidParameterException();
		}
	}
	
}
