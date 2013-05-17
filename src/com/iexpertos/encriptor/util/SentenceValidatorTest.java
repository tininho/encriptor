package com.iexpertos.encriptor.util;

import org.junit.Test;

public class SentenceValidatorTest {
	
	class SentenceValidator{

		public void checkingIfWordContainsSingleBlankSpace(String string) throws Exception {
			if("".equals(string)){
				throw new Exception();
			}
		}
		
	}
	
	@Test(expected=Exception.class)
	public void shouldThrowExceptionWhenEmptySentence() throws Exception {
		SentenceValidator sentenceValidator = new SentenceValidator();
		sentenceValidator.checkingIfWordContainsSingleBlankSpace("");
	}

}
