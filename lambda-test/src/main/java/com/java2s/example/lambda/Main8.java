package com.java2s.example.lambda;

public class Main8 {

	public static void main(String[] argv) {
		Processor8 stringProcessor = (String str) -> str.length();
		SecondProcessor8 secondProcessor = (String str) -> str.length();
		// stringProcessor = secondProcessor; //compile error
		String name = "Java Lambda";
		int length = stringProcessor.getStringLength(name);
		System.out.println(length);

	}
}

@FunctionalInterface
interface Processor8 {
	int getStringLength(String str);
}

@FunctionalInterface
interface SecondProcessor8 {
	int noName(String str);
}
