package com.iexpertos.encriptor;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.PrintStream;

import org.junit.Test;

import com.iexpertos.encriptor.util.Checker;

public class EncriptorRunnerCharacterizationTest {
	
	@Test
	public void shouldExecuteMainEncriptor() {
		Checker checker = new Checker();
		System.setOut(new PrintStream(checker));
		Main.main(null);
		assertNotNull(checker.getChecksumValue());
	}
	
	@Test
	public void checkingMainOutput(){
		fail("not yet implemented");
	}

}
