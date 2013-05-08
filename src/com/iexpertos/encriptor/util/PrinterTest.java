package com.iexpertos.encriptor.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterTest {
	
	@Test
	public void shouldGetArrayOfTwoWords() {
		Printer printer = new Printer();
		assertTrue(printer.getWords("a b").length==2);
	}

}
