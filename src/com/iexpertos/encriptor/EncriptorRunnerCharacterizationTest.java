package com.iexpertos.encriptor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.PrintStream;

import org.junit.Test;

import com.iexpertos.encriptor.util.Checker;

public class EncriptorRunnerCharacterizationTest {
	
	@Test
	public void shouldExecuteEncriptorRunnerAndOutputNotNull() {
		Checker checker = new Checker();
		System.setOut(new PrintStream(checker));
		EncriptorRunner.main(null);
		assertNotNull(checker.getChecksumValue());
	}
	
	@Test
	public void checkingEncriptorRunnerOutput(){
		Checker checker = new Checker();
		System.setOut(new PrintStream(checker));
		EncriptorRunner.main(null);
		assertEquals(1806523983L, checker.getChecksumValue());
	}

}
