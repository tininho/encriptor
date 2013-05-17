package com.iexpertos.encriptor.util;

import java.security.InvalidParameterException;

import org.junit.Test;

public class SentenceValidatorTest {
	
	class SentenceValidator{
		
		private static final String BLANK_SPACE = "";
		
		public void checkingIfWordContainsSingleBlankSpace(String string) throws InvalidParameterException {
			
			if(BLANK_SPACE.equals(string)){
				throw new InvalidParameterException();
			}
		}
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void shouldThrowInvalidParameterExceptionWhenEmptySentence() throws InvalidParameterException {
		SentenceValidator sentenceValidator = new SentenceValidator();
		sentenceValidator.checkingIfWordContainsSingleBlankSpace("");
	}

}
