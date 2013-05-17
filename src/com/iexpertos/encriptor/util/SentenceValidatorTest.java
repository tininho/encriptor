package com.iexpertos.encriptor.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class SentenceValidatorTest {

	@Test
	public void shouldThrowExceptionWhenEmptySentence() {
		SentenceValidator sentenceValidator = new SentenceValidator();
		sentenceValidator.checkingIfWordContainsSingleBlankSpace("");
	}

}
