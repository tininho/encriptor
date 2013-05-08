package com.iexpertos.encriptor.util;

import static org.junit.Assert.assertEquals;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;


public class PrinterTest {
	
	Checker checker;
	Printer printer;
	
	@Before
	public void initialization(){
		checker = new Checker();
		System.setOut(new PrintStream(checker));
		printer = new Printer();
	}
	
	@Test
	public void shouldPrintWordsBetweenLowerThanAndGreaterThanSymbols(){
		printer.printWordsBetweenLowerThanAndGreaterThanSymbols("a b");
		assertEquals(3439837024L, checker.getChecksumValue());
	}
	
	@Test
	public void shouldPrintSentence(){
		printer.printSentence("a b");
		assertEquals(3697970883L, checker.getChecksumValue());
	}
	
}
