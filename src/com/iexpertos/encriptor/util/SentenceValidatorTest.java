package com.iexpertos.encriptor.util;

import java.security.InvalidParameterException;

import org.junit.Test;

public class SentenceValidatorTest {
	
	class SentenceValidator{

		public void checkingIfWordContainsSingleBlankSpace(String string) throws InvalidParameterException {
			if("".equals(string)){
				throw new InvalidParameterException();
			}
		}
		
	}
	
	@Test(expected=Exception.class)
	public void shouldThrowExceptionWhenEmptySentence() throws Exception {
		SentenceValidator sentenceValidator = new SentenceValidator();
		sentenceValidator.checkingIfWordContainsSingleBlankSpace("");
	}
	
	@Test(expected=InvalidParameterException.class)
	public void shouldThrowInvalidParameterExceptionWhenEmptySentence() throws InvalidParameterException {
		SentenceValidator sentenceValidator = new SentenceValidator();
		sentenceValidator.checkingIfWordContainsSingleBlankSpace("");
	}

}
