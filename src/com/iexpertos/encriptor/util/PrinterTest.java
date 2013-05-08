package com.iexpertos.encriptor.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.PrintStream;

import org.junit.Test;


public class PrinterTest {
	
	@Test
	public void shouldPrintWordsBetweenLowerThanAndGreaterThanSymbols(){
		Checker checker = new Checker();
		System.setOut(new PrintStream(checker));
		Printer printer = new Printer();
		printer.printWordsBetweenLowerThanAndGreaterThanSymbols("a b");
		assertEquals(3439837024L, checker.getChecksumValue());
	}
	
	@Test
	public void shouldPrintSentence(){
		fail("test not yet implemented");
	}
	
}
