package com.iexpertos.encriptor;

import com.iexpertos.encriptor.util.Printer;

public class EncriptorRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Encriptor encriptor = new Encriptor();
		Printer printer = new Printer();
		System.out.println("1:" + encriptor.cryptWord("hola"));
		System.out.println("2:" + encriptor.cryptWordToNumbers("hola"));
		System.out.println("3:" + encriptor.cryptWordReplacingChars("hola", "o"));
		System.out.println("4:" + encriptor.cryptSentence("hola, que tal estas?"));
		printer.printWordsBetweenLowerThanAndGreaterThanSymbols("hola, que tal estas?");

	}

}
