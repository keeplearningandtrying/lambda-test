package com.java2s.example.lambda;

public class Main3 {

	public static void main(String[] argv) {
		Processor3 stringProcessor = (str) -> str.length();
		String name = "Java Lambda";
		int length = stringProcessor.getStringLength(name);
		System.out.println(length);// from ww w.ja v a 2 s . c om

	}
}

@FunctionalInterface
interface Processor3 {
	int getStringLength(String str);
}
