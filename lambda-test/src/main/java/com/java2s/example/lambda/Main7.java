package com.java2s.example.lambda;

public class Main7 {

	public static void main(String[] argv) {
		Processor7 stringProcessor = (String str) -> str.length();
		String name = "Java Lambda";
		int length = stringProcessor.getStringLength(name);
		System.out.println(length);

	}
}

@FunctionalInterface
interface Processor7 {
	int getStringLength(String str);
}
