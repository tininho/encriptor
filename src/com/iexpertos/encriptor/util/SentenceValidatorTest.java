package com.iexpertos.encriptor.util;

import java.security.InvalidParameterException;

import org.junit.Test;

public class SentenceValidatorTest {
	
	@Test(expected=InvalidParameterException.class)
	public void shouldThrowInvalidParameterExceptionWhenEmptySentence() throws InvalidParameterException {
		SentenceValidator sentenceValidator = new SentenceValidator();
		sentenceValidator.checkingIfWordContainsSingleBlankSpace("");
	}

}
