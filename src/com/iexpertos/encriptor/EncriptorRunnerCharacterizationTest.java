package com.iexpertos.encriptor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.iexpertos.encriptor.util.Checker;

public class EncriptorRunnerCharacterizationTest {
	
	Checker checker;
	
	@Before
	public void initialization(){
		checker = new Checker();
		System.setOut(new PrintStream(checker));
	}
	
	@Test
	public void checkingEncriptorRunnerOutput(){
		EncriptorRunner.main(null);
		assertEquals(1806523983L, checker.getChecksumValue());
	}

}
