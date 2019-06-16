package com.java2s.example.lambda;

public class Main6 {

	public static void main(String[] argv) {
		Processor6 stringProcessor = (final String str) -> str.length();
		String name = "Java Lambda";
		int length = stringProcessor.getStringLength(name);
		System.out.println(length);

	}
}

@FunctionalInterface
interface Processor6 {
	int getStringLength(String str);
}
