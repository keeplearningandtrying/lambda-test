package com.java2s.example.lambda;

public class Main4 {

	public static void main(String[] argv) {
		Processor4 stringProcessor = str -> str.length();
		String name = "Java Lambda";
		int length = stringProcessor.getStringLength(name);
		System.out.println(length);/* w w w. jav a2s .c o m */

	}
}

@FunctionalInterface
interface Processor4 {
	int getStringLength(String str);
}
