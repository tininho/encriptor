package com.iexpertos.encriptor;

import com.iexpertos.encriptor.util.Printer;

public class EncriptorRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Encriptor encriptor = new Encriptor();
		Printer printer = new Printer();
		printer.printSentence("1:" + encriptor.cryptWord("hola"));
		printer.printSentence("2:" + encriptor.cryptWordToNumbers("hola"));
		printer.printSentence("3:" + encriptor.cryptWordReplacingChars("hola", "o"));
		printer.printSentence("4:" + encriptor.cryptSentence("hola, que tal estas?"));
		printer.printWordsBetweenLowerThanAndGreaterThanSymbols("hola, que tal estas?");

	}

}
